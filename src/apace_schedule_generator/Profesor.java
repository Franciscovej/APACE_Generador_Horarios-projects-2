package apace_schedule_generator;

public class Profesor {
    //Nombre.  /Asignatura que ejerce. 
    // puede ejercer varias asignaturas, aqui iria mejor una agregacion
    String nombre,asignatura;
    //id profesor
    int id;
    int[][] horario;

    public Profesor(String nombre, String asignatura, int[][] horario) {
        this.nombre = nombre;
        this.asignatura = asignatura;
        this.horario = horario;
    }

    public int[][] getHorario() {
        return horario;
    }

    public void setHorario(int[][] horario) {
        this.horario = horario;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    

}