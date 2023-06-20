package Pojo;

public class Datos {
    private String nombre;
    private String edad;
    private String celcius;
    private String farenheit;

    public Datos(String nombre, String edad, String celcius, String farenheit) {
        this.nombre = nombre;
        this.edad = edad;
        this.celcius = celcius;
        this.farenheit = farenheit;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEdad() {
        return edad;
    }

    public String getCelcius() {
        return celcius;
    }

    public String getFarenheit() {
        return farenheit;
    }
}
