package Modelos;

public class Empleado extends Persona
{
    private Double remuneracion;
    private int empleadoId;

    public Empleado()
    {

    }

    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, Double remuneracion, int empleadoId)
    {
        super(nombre, apellido, numeroFiscal, direccion);
        this.remuneracion = remuneracion;
        this.empleadoId = empleadoId;
    }

    public Double getRemuneracion() {
        return remuneracion;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public void setRemuneracion(Double remuneracion) {
        this.remuneracion = remuneracion;
    }

    public void setEmpleadoId(int empleadoId) {
        this.empleadoId = empleadoId;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "remuneracion=" + remuneracion +
                ", empleadoId=" + empleadoId +
                '}';
    }


/*
    public static void aumentarRemuneracion()
    {
        int porcentaje = 0;

        Double nuevaRemuneracion = remuneracion * (1+porcentaje);
        System.out.println("nuevaRemuneracion = " + nuevaRemuneracion);
    }
*/

}
