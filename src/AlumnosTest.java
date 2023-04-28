import java.util.*;
import java.util.stream.Collectors;


public class AlumnosTest {
    public static void main(String[] args) {
        // Creamos una lista de alumnos y materias
        List<Alumno> alumnos = new ArrayList<>();
        List<Materia> materias = new ArrayList<>();

        Alumno alumno1 = new Alumno("Maximo", "Ozonas", 1234,new ArrayList<>()); alumnos.add(alumno1);
        Alumno alumno2 = new Alumno("Mauro", "Sagasti", 2134,new ArrayList<>()); alumnos.add(alumno2);
        Alumno alumno3 = new Alumno("Stefano", "Danunzzio", 6778,new ArrayList<>()); alumnos.add(alumno3);
        Alumno alumno4 = new Alumno("Lucas", "Garcia", 8231, new ArrayList<>()); alumnos.add(alumno4);
        Alumno alumno5 = new Alumno("Ana", "Sanchez", 1654, new ArrayList<>()); alumnos.add(alumno5);
        Alumno alumno6 = new Alumno("Juan", "Perez", 7392, new ArrayList<>()); alumnos.add(alumno6);
        Alumno alumno7 = new Alumno("Cristian", "Perez", 8956, new ArrayList<>()); alumnos.add(alumno7);
        Alumno alumno8 = new Alumno("Cristian", "Perez", 4566, new ArrayList<>()); alumnos.add(alumno8);
        Alumno alumno9 = new Alumno("Albano", "Ozonas", 5456,new ArrayList<>()); alumnos.add(alumno9);
        Alumno alumno10 = new Alumno("Simon", "Iturmendi", 3789,new ArrayList<>()); alumnos.add(alumno10);


        Materia materia1 = new Materia("Laboratorio de progamacion", "Primer cuatrimestre", "Luciano Salotto"); materias.add(materia1);
        Materia materia2 = new Materia("Progamacion", "Primer Cuatrimestre", "Marco Ustarroz"); materias.add(materia2);
        Materia materia3 = new Materia("Elementos de investigacion operativa", "Primer Cuatrimestre", "Roque Sanches"); materias.add(materia3);
        Materia materia4 = new Materia("Base de datos", "Segundo Cuatrimestre", "Mauro Torre"); materias.add(materia4);
        Materia materia5 = new Materia("Organizacion Empresaial", "Segundo Cuatrimestre", "Danilo Aristimuño"); materias.add(materia5);
        Materia materia6 = new Materia("Ingles", "Segundo Cuatrimestre", "Carla Sanchez"); materias.add(materia6);

        alumno1.asignarMaterias(materias);
        alumno2.asignarMaterias(materias);
        alumno3.asignarMaterias(materias);
        alumno4.asignarMaterias(materias);
        alumno5.asignarMaterias(materias);
        alumno6.asignarMaterias(materias);
        alumno7.asignarMaterias(materias);
        alumno8.asignarMaterias(materias);
        alumno9.asignarMaterias(materias);
        alumno10.asignarMaterias(materias);


        /* Punto 10 */
        Punto10 mostrarAlumnos = new Punto10();
        mostrarAlumnos.mostrarAlumnos(alumnos);

        System.out.println("---------------------------");

        /*PUNTO 11*/
        Punto11 mostrarMateriasAprobadas = new Punto11();
        mostrarMateriasAprobadas.mostrarMateriasAprobadas(alumnos);

        System.out.println("---------------------------");


        /*PUNTO 12*/
        Punto12 ordenarAlumnos = new Punto12();

        // Por apellido, nombre y legajo
        List<Alumno> alumnosOrdenadosAPL = ordenarAlumnos.ordenarAlumnosApellidoNombreLegajo(alumnos);
        System.out.println("Por apellido, nombre y legajo");
        for (Alumno alumno : alumnosOrdenadosAPL) {
            System.out.println(alumno.getApellido() + ", " + alumno.getNombre() + ", Legajo: " + alumno.getLegajo());
        }

        // Por cantidad de materias aprobadas
        List<Alumno> alumnosOrdenadosMCA = ordenarAlumnos.ordenarAlumnosPorCantidadMaterias(alumnos);
        System.out.println("Por materias cursadas y aprobadas: ");
        for (Alumno alumno : alumnosOrdenadosMCA) {
            System.out.println(alumno.getApellido() + ", " + alumno.getNombre() + ", Legajo: " + alumno.getLegajo());
        }
    }
}