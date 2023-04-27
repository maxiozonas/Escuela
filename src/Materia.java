public class Materia {
    private String nombre;
    private String cuatrimestre;
    private String profesor;
    private Estado estado;
    private int notaFinal;

    // Constructores
    public Materia(String nombre, String cuatrimestre, String profesor, Estado estado, int notaFinal) {
        this.nombre = nombre;
        this.cuatrimestre = cuatrimestre;
        this.profesor = profesor;
        this.estado = estado;
        this.notaFinal = notaFinal;
    }

    public Materia(String nombre, String cuatrimestre, String profesor) {
        this.nombre = nombre;
        this.cuatrimestre = cuatrimestre;
        this.profesor = profesor;
    }

    // Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuatrimestre() {
        return cuatrimestre;
    }

    public void setCuatrimestre(String cuatrimestre) {
        this.cuatrimestre = cuatrimestre;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public int getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(int notaFinal) {
        this.notaFinal = notaFinal;
    }
}




