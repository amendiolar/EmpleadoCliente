package Modelos;

public class MainGerenteTest
{
    public static void main(String[] args)
    {
        Gerente gerente = new Gerente();
        gerente.setNombre("David");
        gerente.setApellido("Segura");
        gerente.setNumeroFiscal("SEDA020528");
        gerente.setDireccion("Parque de la 96");
        gerente.setEmpleadoId(14200);
        gerente.setRemuneracion(2500.0);

        System.out.println("Nombre: " + gerente.getNombre()
                + ", Apellido:  " + gerente.getApellido()
                + ", Numero de identidad fiscal:  " + gerente.getNumeroFiscal()
                + ", Direccion:  " + gerente.getDireccion()
                + ", Numero de empleado: " + gerente.getEmpleadoId()
                + ", Remuneracion en USD:  " + gerente.getRemuneracion());
        
    }
}
