import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Punto12 {

    // Método para ordenar los alumnos por apellido, nombre y legajo
    public static List<Alumno> ordenarAlumnosApellidoNombreLegajo(List<Alumno> alumnos) {
        return alumnos.stream()
                .sorted(Comparator.comparing(Alumno::getApellido)
                        .thenComparing(Alumno::getNombre)
                        .thenComparing(Alumno::getLegajo))
                .collect(Collectors.toList());
    }

    // Método para ordenar los alumnos por cantidad de materias cursadas y aprobadas, en orden descendente
    public static List<Alumno> ordenarAlumnosPorCantidadMaterias(List<Alumno> alumnos) {
        return alumnos.stream()
                .sorted(Comparator.comparing((Alumno alumno) -> alumno.getMateriaCursadas().stream()
                                .filter(m -> m.getEstado() == Estado.APROBADA)
                                .count())
                        .reversed())
                .collect(Collectors.toList());
    }
}

