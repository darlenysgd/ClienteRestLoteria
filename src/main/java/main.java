/**
 * Created by darle on 7/24/2017.
 */
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import freemarker.template.Configuration;
import org.json.JSONArray;
import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.staticFiles;

public class main {

    List<juegos> lista = new ArrayList<>();

    public static void main(String[] args) {

        port(1234);
        staticFiles.location("/");
      //  staticFiles.externalLocation(System.getProperty("java.io.tmpdir"));
        Configuration configuration = new Configuration(Configuration.VERSION_2_3_23);
        configuration.setClassForTemplateLoading(main.class, "/");
        FreeMarkerEngine freeMarkerEngine = new FreeMarkerEngine(configuration);

        ArrayList<juegos> games = consultar("monti");

        get("/ClienteRest", (request, response) -> {

            Map<String, Object> attributes = new HashMap<>();
            attributes.put("juegos", games);
            return new ModelAndView(attributes, "Home.ftl");

        }, freeMarkerEngine);
    }



    public static ArrayList<juegos> consultar(String usuario){
        Client client = Client.create();
        WebResource webResource = client.resource("http://localhost:4567/"+usuario);
        webResource.queryParam("usuario", usuario);
        String response = webResource.get(String.class);
        System.out.println(response);
        JSONArray arreglo = new JSONArray(response);
        ArrayList<juegos> juegos = new ArrayList<>();

        for (int i= 0; i< arreglo.length(); i++) {

            String fecha = arreglo.getJSONObject(i).getString("fecha");
            String jugada = new String();
            String Ganador = new String();
            long montoApostado;
            boolean pale = arreglo.getJSONObject(i).getBoolean("pale");
            if(pale){
                jugada = "Pale";
            } else {
                jugada = "Loto";
            }
            boolean ganador = arreglo.getJSONObject(i).getBoolean("ganador");
            long montoGanado = arreglo.getJSONObject(i).getLong("montoGanado");
            if(jugada != "Loto") {
                montoApostado = arreglo.getJSONObject(i).getLong("montoApostado");
            } else {
                montoApostado = 50;
            }
            juegos.add(new juegos(fecha, jugada, Ganador, montoGanado, montoApostado));

        }

        return juegos;


    }



}
