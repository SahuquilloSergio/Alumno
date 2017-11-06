package alumno;

public class DatosAlumnos {
    
private DatosAcademicos  DatosAcademicos1 = new DatosAcademicos();
private DatosPersonales DatosPersonales1 = new DatosPersonales();

//Constructor por defecto
public DatosAlumnos(){
    
}
//Constructor por parámetros
public DatosAlumnos(DatosAcademicos DA1, DatosPersonales DP1){
    DA1=DatosAcademicos1;
    DP1=DatosPersonales1;
}
public DatosAlumnos(String RefAlumno, int nota, String direccion, String telefono){
    DatosAcademicos1 = new DatosAcademicos();   
    DatosAcademicos1.setRefAlumno(RefAlumno);
    DatosAcademicos1.setNota(nota);
    DatosPersonales1 = new DatosPersonales();
    DatosPersonales1.setDireccion(direccion);
    DatosPersonales1.setTelefono(telefono);
}
//Metodos de Acceso
public void setRefAlumno(DatosAcademicos RefAlumno){
    this.DatosAcademicos1=RefAlumno;
}
public void setNota(DatosAcademicos nota){
    this.DatosAcademicos1=nota;
}
public void setDireccion(DatosPersonales direccion){
    this.DatosPersonales1=direccion;
}
public void setTelefono(DatosPersonales telefono){
    this.DatosPersonales1=telefono;
}
@Override
public String toString(){
    return("Datos Academicos: /n"
            + "Referencia Alumno: "+DatosAcademicos1.RefAlumno+"/n"
            + "Nota: "+DatosAcademicos1.nota+"/n"
            + "Datos Personales; /n"
            + "Direccion: "+DatosPersonales1.direccion+"/n"
            + "Telefono: "+DatosPersonales1.telefono);
}
}

