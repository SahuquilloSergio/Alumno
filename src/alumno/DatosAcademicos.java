package alumno;

public class DatosAcademicos {
    String RefAlumno;
    int nota;
    
    //Constructor por defecto
    public DatosAcademicos(){
        
    }
    //Constructor por parámetros
    public DatosAcademicos(String RA, int n){
        RA=RefAlumno;
        n=nota;
    }
    //Metodos de Acceso
    public void setRefAlumno(String RefAlumno){
        
    }
    public void setNota(int Nota){
        
    }
    public String getRefAlumno(){
        return RefAlumno;
    }
    public int getNota(){
        return nota;
    }
    @Override
    public String toString(){
        return ("Referencia do Alumno: "+RefAlumno+"    Nota: "+nota);
    }
}
