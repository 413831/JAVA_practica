package work.basico;

import work.basico.clases.Persona;

public class PasoPorReferencia
{
    public static void main(String[] args)
    {
        Persona persona1 = new Persona();
        persona1.nombre = "Juan";
        System.out.println("persona1 = " + persona1.nombre);

        persona1 = cambiarValor(persona1);

        System.out.println("persona1 cambio nombre = " + persona1.nombre);
    }

    public static Persona cambiarValor(Persona persona)
    {
        persona.nombre = "Carla";
        return persona;
    }
}
