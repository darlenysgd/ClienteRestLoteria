/**
 * Created by darle on 7/24/2017.
 */
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.internal.bind.JsonTreeReader;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import jdk.nashorn.internal.parser.JSONParser;

import java.util.ArrayList;
import java.util.List;

public class main {

    List<juegos> lista = new ArrayList<>();

    public static void main(String[] args) {

        consultar("darle");
    }

    public static void consultar(String usuario){
        Client client = Client.create();
        WebResource webResource = client.resource("http://localhost:4568/"+usuario);
        webResource.queryParam("usuario", usuario);
        String response = webResource.get(String.class);



    }

}
