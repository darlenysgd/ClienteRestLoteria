/**
 * Created by darle on 7/24/2017.
 */
public class juegos {

    private String fecha;
    private String jugada;
    private String ganador;
    private Long montoGanado;
    private Long montoApostado;

    public juegos(String fecha, String jugada, String ganador, Long montoGanado, Long montoApostado) {
        this.fecha = fecha;
        this.jugada = jugada;
        this.ganador = ganador;
        this.montoGanado = montoGanado;
        this.montoApostado = montoApostado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getJugada() {
        return jugada;
    }

    public void setJugada(String jugada) {
        this.jugada = jugada;
    }

    public String getGanador() {
        return ganador;
    }

    public void setGanador(String ganador) {
        this.ganador = ganador;
    }

    public Long getMontoGanado() {
        return montoGanado;
    }

    public void setMontoGanado(Long montoGanado) {
        this.montoGanado = montoGanado;
    }

    public Long getMontoApostado() {
        return montoApostado;
    }

    public void setMontoApostado(Long montoApostado) {
        this.montoApostado = montoApostado;
    }
}
