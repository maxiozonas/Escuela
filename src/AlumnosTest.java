import java.util.*;
import java.util.stream.Collectors;


public class AlumnosTest {
    public static void main(String[] args) {
        // Creamos una lista de alumnos y materias
        List<Alumno> alumnos = new ArrayList<>();
        List<Materia> materias = new ArrayList<>();

        Alumno alumno1 = new Alumno("Maximo", "Ozonas", 1234,new ArrayList<>()); alumnos.add(alumno1);
        Alumno alumno2 = new Alumno("Mauro", "Sagasti", 2134,new ArrayList<>()); alumnos.add(alumno2);
        Alumno alumno3 = new Alumno("Stefano", "Danunzzio", 678,new ArrayList<>()); alumnos.add(alumno3);
        Alumno alumno4 = new Alumno("Lucas", "Garcia", 8231, new ArrayList<>()); alumnos.add(alumno4);
        Alumno alumno5 = new Alumno("Ana", "Sanchez", 1654, new ArrayList<>()); alumnos.add(alumno5);
        Alumno alumno6 = new Alumno("Juan", "Perez", 7392, new ArrayList<>()); alumnos.add(alumno6);
        Alumno alumno7 = new Alumno("Cristian", "Perez", 8956, new ArrayList<>()); alumnos.add(alumno7);
        Alumno alumno8 = new Alumno("Cristian", "Perez", 4566, new ArrayList<>()); alumnos.add(alumno8);

        Materia materia1 = new Materia("Laboratorio de progamacion", "Primer cuatrimestre", "Luciano Salotto"); materias.add(materia1);
        Materia materia2 = new Materia("Progamacion", "Primer Cuatrimestre", "Marco Ustarroz"); materias.add(materia2);
        Materia materia3 = new Materia("Elementos de investigacion operativa", "Primer Cuatrimestre", "Roque Sanches"); materias.add(materia3);
        Materia materia4 = new Materia("Base de datos", "Segundo Cuatrimestre", "Mauro Torre"); materias.add(materia4);
        Materia materia5 = new Materia("Organizacion Empresaial", "Segundo Cuatrimestre", "Danilo Aristimuño"); materias.add(materia5);
        Materia materia6 = new Materia("Ingles", "Segundo Cuatrimestre", "Carla Sanchez"); materias.add(materia6);

        for (Alumno alumno : alumnos) {
            alumno.asignarMaterias(alumno,  materias, alumnos);
        }



        /*Alumno alumno1 = new Alumno("Maximo", "Ozonas", 1234,new ArrayList<>());
        alumno1.getMateriaCursadas().add(new Materia("Laboratorio de progamacion III", "Primer cuatrimestre", "Luciano Salotto", Estado.CURSADA, -1));
        alumno1.getMateriaCursadas().add(new Materia("Progamacion III", "Primer cuatrimestre", "Marco Ustarroz", Estado.APROBADA, 9));
        alumno1.getMateriaCursadas().add(new Materia("Organizacion contable de la empresa", "Segundo cuatrimestre", "Danilo Aristimuno", Estado.APROBADA, 7));
        alumno1.getMateriaCursadas().add(new Materia("Organizacion empresarial", "Segundo cuatrimestre", "Lionel Scaloni", Estado.CURSADA, -1));
        alumnos.add(alumno1);

        Alumno alumno2 = new Alumno("Mauro", "Sagasti", 2134,new ArrayList<>());
        alumno2.getMateriaCursadas().add(new Materia("Laboratorio de progamacion III", "Primer cuatrimestre", "Luciano Salotto", Estado.APROBADA, 8));
        alumno2.getMateriaCursadas().add(new Materia("Progamacion III", "Primer cuatrimestre", "Marco Ustarroz", Estado.APROBADA, 7));
        alumno2.getMateriaCursadas().add(new Materia("Organizacion contable de la empresa", "Segundo cuatrimestre", "Danilo Aristimuno", Estado.CURSADA, -1));
        alumno2.getMateriaCursadas().add(new Materia("Organizacion empresarial", "Segundo cuatrimestre", "Lionel Scaloni", Estado.CURSADA, -1));
        alumnos.add(alumno2);

        Alumno alumno3 = new Alumno("Stefano", "Danunzzio", 678,new ArrayList<>());
        alumno3.getMateriaCursadas().add(new Materia("Laboratorio de progamacion III", "Primer cuatrimestre", "Luciano Salotto", Estado.CURSADA, -1));
        alumno3.getMateriaCursadas().add(new Materia("Progamacion III", "Primer cuatrimestre", "Marco Ustarroz", Estado.APROBADA, 9));
        alumno3.getMateriaCursadas().add(new Materia("Organizacion contable de la empresa", "Segundo cuatrimestre", "Danilo Aristimuno", Estado.APROBADA, 7));
        alumno3.getMateriaCursadas().add(new Materia("Organizacion empresarial", "Segundo cuatrimestre", "Lionel Scaloni", Estado.CURSADA, -1));
        alumnos.add(alumno3);

        Alumno alumno4 = new Alumno("Lucas", "Garcia", 8231, new ArrayList<>());
        alumno4.getMateriaCursadas().add(new Materia("Laboratorio de progamacion III", "Primer cuatrimestre", "Luciano Salotto", Estado.APROBADA, 8));
        alumno4.getMateriaCursadas().add(new Materia("Progamacion III", "Primer cuatrimestre", "Marco Ustarroz", Estado.APROBADA, 7));
        alumno4.getMateriaCursadas().add(new Materia("Organizacion contable de la empresa", "Segundo cuatrimestre", "Danilo Aristimuno", Estado.APROBADA, 9));
        alumno4.getMateriaCursadas().add(new Materia("Organizacion empresarial", "Segundo cuatrimestre", "Lionel Scaloni", Estado.APROBADA, 8));
        alumnos.add(alumno4);

        Alumno alumno5 = new Alumno("Ana", "Sanchez", 1654, new ArrayList<>());
        alumno5.getMateriaCursadas().add(new Materia("Laboratorio de progamacion III", "Primer cuatrimestre", "Luciano Salotto", Estado.APROBADA, 9));
        alumno5.getMateriaCursadas().add(new Materia("Progamacion III", "Primer cuatrimestre", "Marco Ustarroz", Estado.APROBADA, 8));
        alumno5.getMateriaCursadas().add(new Materia("Organizacion contable de la empresa", "Segundo cuatrimestre", "Danilo Aristimuno", Estado.CURSADA, -1));
        alumno5.getMateriaCursadas().add(new Materia("Organizacion empresarial", "Segundo cuatrimestre", "Lionel Scaloni", Estado.CURSADA, -1));
        alumnos.add(alumno5);

        Alumno alumno6 = new Alumno("Juan", "Perez", 7392, new ArrayList<>());
        alumno6.getMateriaCursadas().add(new Materia("Laboratorio de progamacion III", "Primer cuatrimestre", "Luciano Salotto", Estado.APROBADA, 7));
        alumno6.getMateriaCursadas().add(new Materia("Progamacion III", "Primer cuatrimestre", "Marco Ustarroz", Estado.APROBADA, 6));
        alumno6.getMateriaCursadas().add(new Materia("Organizacion contable de la empresa", "Segundo cuatrimestre", "Danilo Aristimuno", Estado.APROBADA, 8));
        alumno6.getMateriaCursadas().add(new Materia("Organizacion empresarial", "Segundo cuatrimestre", "Lionel Scaloni", Estado.APROBADA, 7));
        alumnos.add(alumno6);

        Alumno alumno7 = new Alumno("Cristian", "Perez", 8956, new ArrayList<>());
        alumno7.getMateriaCursadas().add(new Materia("Laboratorio de progamacion III", "Primer cuatrimestre", "Luciano Salotto", Estado.APROBADA, 7));
        alumno7.getMateriaCursadas().add(new Materia("Progamacion III", "Primer cuatrimestre", "Marco Ustarroz", Estado.CURSADA, -1));
        alumno7.getMateriaCursadas().add(new Materia("Organizacion contable de la empresa", "Segundo cuatrimestre", "Danilo Aristimuno", Estado.CURSADA, -1));
        alumno7.getMateriaCursadas().add(new Materia("Organizacion empresarial", "Segundo cuatrimestre", "Lionel Scaloni", Estado.CURSADA, -1));
        alumnos.add(alumno7);

        Alumno alumno8 = new Alumno("Cristian", "Perez", 4566, new ArrayList<>());
        alumno8.getMateriaCursadas().add(new Materia("Laboratorio de progamacion III", "Primer cuatrimestre", "Luciano Salotto", Estado.CURSADA, 7));
        alumno8.getMateriaCursadas().add(new Materia("Progamacion III", "Primer cuatrimestre", "Marco Ustarroz", Estado.CURSADA, -1));
        alumno8.getMateriaCursadas().add(new Materia("Organizacion contable de la empresa", "Segundo cuatrimestre", "Danilo Aristimuno", Estado.CURSADA, -1));
        alumno8.getMateriaCursadas().add(new Materia("Organizacion empresarial", "Segundo cuatrimestre", "Lionel Scaloni", Estado.APROBADA, -1));
        alumnos.add(alumno8); */



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