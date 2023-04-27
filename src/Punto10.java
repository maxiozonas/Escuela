import java.util.List;
import java.util.stream.Collectors;

public class Punto10 {
    public static void mostrarAlumnos(List<Alumno> alumnos) {
        // Mostramos alumnos y sus materias por pantalla
        for (Alumno alumno : alumnos) {
            System.out.println("Alumno: " + alumno.getApellido() + " " + alumno.getNombre() + " - Legajo: " + alumno.getLegajo());

            // Verificamos si el alumno tiene materias aprobadas
            List<Materia> materiasAprobadas = alumno.getMateriaCursadas().stream()
                    .filter(m -> m.getEstado() == Estado.APROBADA)
                    .collect(Collectors.toList());
            if (materiasAprobadas.isEmpty()) {
                System.out.println("El alumno no tiene materias aprobadas");
            } else {
                System.out.println("Materias aprobadas: ");
                for (Materia materia : materiasAprobadas) {
                    System.out.println("--> " + materia.getNombre() + " - " + materia.getProfesor() + " - Nota: " + materia.getNotaFinal());
                }
            }

            // Verificamos si el alumno tiene materias cursadas
            List<Materia> materiasCursadas = alumno.getMateriaCursadas().stream()
                    .filter(m -> m.getEstado() == Estado.CURSADA)
                    .collect(Collectors.toList());
            if (materiasCursadas.isEmpty()) {
                System.out.println("El alumno no tiene materias cursadas.");
            } else {
                System.out.println("Materias Cursadas:");
                for (Materia materia : materiasCursadas) {
                    System.out.println("--> " + materia.getNombre() + " - " + materia.getProfesor());
                }
            }
        }
    }
}
