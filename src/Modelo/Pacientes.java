
package Modelo;

public class Pacientes implements Comparable<Pacientes>{
    String Apellidos;
    String Nombre;
    String Telefono;
    int Gravedad;

    public Pacientes(String Apellidos, String Nombre, String Telefono, int Gravedad) {
        
        this.Apellidos = Apellidos;
        this.Nombre = Nombre;
        this.Telefono = Telefono;
        this.Gravedad = Gravedad;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public int getGravedad() {
        return Gravedad;
    }

    public void setGravedad(int Gravedad) {
        this.Gravedad = Gravedad;
    }
    
    @Override
    public int compareTo(Pacientes o) {
        
        return o.Gravedad <this.Gravedad ? 1: -1;
    }
    
    
    
}
