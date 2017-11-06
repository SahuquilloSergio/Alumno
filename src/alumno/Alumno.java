package alumno;
import java.util.Scanner;
public class Alumno {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        DatosAcademicos DA1 = new DatosAcademicos();
        DatosPersonales DP1 = new DatosPersonales();
        DatosAlumnos DAL1 = new DatosAlumnos();
        System.out.println("Introduzca a Referencia do Alumno");
        String RefAl = ler.next();
        DAL1.setRefAlumno(DA1);
        System.out.println("Introduzca la nota del alumno");
        int nota = ler.nextInt();
        DAL1.setNota(DA1);
        System.out.println("Introduzca la direccion del alumno");
        String dir = ler.next();
        DP1.setDireccion(dir);
        System.out.println("Introduza el telefono del alumno");
        String tlf = ler.next();
        DP1.setTelefono(tlf);
        System.out.println("A continuacion se mostraran los datos del alumno"+DAL1.toString());
        System.out.println("A continuacion se mostrara la nota del alumno deseado"+DA1.getNota());
           
    
    }
   
}
