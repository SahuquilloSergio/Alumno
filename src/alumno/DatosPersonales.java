package alumno;

public class DatosPersonales {
    String direccion;
    String telefono;
    
    //Constructor por defecto
    public DatosPersonales(){
        
    }
    //Constructor por parámetros
    public DatosPersonales(String dir, String tlf){
        dir=direccion;
        tlf=telefono;
    }
    //Metodos de acceso
    public void setDireccion(String direccion){
        
    }
    public void setTelefono(String telefono){
        
    }
    public String getDireccion(){
        return direccion;
    }
    public String getTelefono(){
        return telefono;
    }
    @Override
    public String toString(){
        return ("Direccion: "+direccion+"Telefono"+telefono);
    }
}
