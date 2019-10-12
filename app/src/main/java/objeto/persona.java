package objeto;

public class persona {

    private String nombre;
    private String conversacion;

    public persona() {

    }

    public persona(String nombre, String conversacion) {
        this.nombre = nombre;
        this.conversacion = conversacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getConversacion() {
        return conversacion;
    }

    public void setConversacion(String conversacion) {
        this.conversacion = conversacion;
    }
}
