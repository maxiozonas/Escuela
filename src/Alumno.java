import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Alumno {
    private String nombre;
    private String apellido;
    private int legajo;
    private List<Materia> materiaCursadas;

    // Constructores
    public Alumno(String nombre, String apellido, int legajo, List<Materia> materiaCursadas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.materiaCursadas = materiaCursadas;
    }

    // Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public List<Materia> getMateriaCursadas() {
        return materiaCursadas;
    }

    public void setMateriaCursadas(List<Materia> materiaCursadas) {
        this.materiaCursadas = materiaCursadas;
    }

    // Metodos
    public void asignarMaterias(Alumno alumno, List<Materia> materias, List<Alumno> alumnos) {

        Random random = new Random();

        for (Alumno alumnoo : alumnos) {
            for (Materia materia : materias) {
                materia.setNotaFinal(random.nextInt(10) + 1);
                if (materia.getNotaFinal() >= 7) {
                    materia.setEstado(Estado.APROBADA);
                } else {
                    materia.setEstado(Estado.CURSADA);
                }
                alumnoo.getMateriaCursadas().add(materia);
            }
        }
    }
}

