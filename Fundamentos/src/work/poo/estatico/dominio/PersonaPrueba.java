package work.poo.estatico.dominio;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan");
        Persona persona2 = new Persona("Karla");

        PersonaPrueba.imprimir(persona1);
    }

    public static void imprimir(Persona persona)
    {
        System.out.println("persona = " + persona);
    }
}
