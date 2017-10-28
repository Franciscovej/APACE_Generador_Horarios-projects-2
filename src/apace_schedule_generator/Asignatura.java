package apace_schedule_generator;


public class Asignatura {
    //Nombre Asignatura
    String nombre;
    //Cantidad de horas de la  Asignatura
    int hora;
    //Nivel Académico
    boolean nivel1;
    boolean nivel2;
    boolean nivel3;
    boolean nivel4;

    
    public Asignatura(String nombre, int hora, boolean nivel1, boolean nivel2, boolean nivel3, boolean nivel4) {
        this.nombre = nombre;
        this.hora = hora;
        this.nivel1 = nivel1;
        this.nivel2 = nivel2;
        this.nivel3 = nivel3;
        this.nivel4 = nivel4;
    }

    public boolean isNivel1() {
        return nivel1;
    }

    public void setNivel1(boolean nivel1) {
        this.nivel1 = nivel1;
    }

    public boolean isNivel2() {
        return nivel2;
    }

    public void setNivel2(boolean nivel2) {
        this.nivel2 = nivel2;
    }

    public boolean isNivel3() {
        return nivel3;
    }

    public void setNivel3(boolean nivel3) {
        this.nivel3 = nivel3;
    }

    public boolean isNivel4() {
        return nivel4;
    }

    public void setNivel4(boolean nivel4) {
        this.nivel4 = nivel4;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
    
    
}
