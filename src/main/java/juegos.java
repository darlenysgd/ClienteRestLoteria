/**
 * Created by darle on 7/24/2017.
 */
public class juegos {

    private String fecha;
    private boolean pale;
    private Boolean ganador;
    private Long montoGanado;
    private Long montoApostado;

    public juegos(String fecha, boolean pale, Boolean ganador, Long montoGanado, Long montoApostado) {
        this.fecha = fecha;
        this.pale = pale;
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

    public boolean isPale() {
        return pale;
    }

    public void setPale(boolean pale) {
        this.pale = pale;
    }

    public Boolean getGanador() {
        return ganador;
    }

    public void setGanador(Boolean ganador) {
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
