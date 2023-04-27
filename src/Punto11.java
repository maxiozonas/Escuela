import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Punto11 {
    public static void mostrarMateriasAprobadas(List<Alumno> alumnos) {
        // Filtramos por materias aprobadas y luego imprimimos
        List<Materia> materiasAprobadas = alumnos.stream()
                // Usamos flatMap para acceder a la lista MateriaCursadas de Alumno
                .flatMap(alumno -> alumno.getMateriaCursadas().stream())
                .filter(materia -> materia.getEstado() == Estado.APROBADA)
                .collect(Collectors.toList());

        // Ahora usamos un set, para evitar que se impriman materias duplicadas
        Set<String> nombresMateriasAprobadas = materiasAprobadas.stream()
                .map(materia -> materia.getNombre())
                .collect(Collectors.toSet());

        System.out.println("Materias aprobadas por los alumnos:");
        for (String nombreMateria : nombresMateriasAprobadas) {
            System.out.println("- " + nombreMateria);
        }
    }
}
