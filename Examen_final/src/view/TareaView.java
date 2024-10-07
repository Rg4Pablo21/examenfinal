package view;

public class TareaView {
    private String Titulo;
    private String Decripción;
    private String FechaLimite;
    private String Unestado;

    public TareaView(String titulo, String Descripción, String FechaLimite, String Unestado ){
        this.Titulo=titulo;
        this.Decripción=Descripción;
        this.FechaLimite=FechaLimite;
        this.Unestado=Unestado;
    }
    public String getTitulo(){
        return Titulo;
    }

    public String getDecripción(){
        return Decripción;
    }

    public void setDecripción(String decripción) {
        Decripción = decripción;
    }

    public String getFechaLimite() {
        return FechaLimite;
    }

    public void setFechaLimite(String fechaLimite) {
        FechaLimite = fechaLimite;
    }

    public String getUnestado() {
        return Unestado;
    }

    public void setUnestado(String unestado) {
        Unestado = unestado;
    }

}
