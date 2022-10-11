public class Main {

    public static void main(String[] args) {

        int numeroIf = -2;
        int numeroWhile = 0;
        int numeroFor;
        var estacion = "Primavera";


        Suma suma = new Suma();
        System.out.println(suma.numeroActual);
        suma.setNuMas();
        System.out.println(suma.numeroActual);
        suma.setResta();
        System.out.println(suma.numeroActual);

        //If
        System.out.println("-Evaluacion de los Numeros Negativos y Positivos: =>");
        if (numeroIf == 0) {
            System.out.println("El número es neutro.");
        } else if (numeroIf < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es positivo.");
        }

        //While
        System.out.println("-Resultado de While =>");
        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        //DoWhile
        System.out.println("-Resultado de DoWhile =>");
        do {
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        while (numeroWhile < 3);

        //For
        System.out.println("-Resultado de For =>");
        for (numeroFor = 0; numeroFor < 3; numeroFor = numeroFor + 1) ;
        System.out.println(numeroFor);

        //Switch
        System.out.println("-Resultado de Switch =>");
        switch (estacion) {
            case "Primavera":
                System.out.println("Estamos en Primavera.");
                break;
            case "Verano":
                System.out.println("Estamos en Verano.");
                break;
            case "Otoño":
                System.out.println("Estamos en Otoño.");
                break;
            case "Invierno":
                System.out.println("Estamos en Invierno.");
                break;

            default:
                System.out.println("Tu variable esta mal.");
        }

        //TEMA 8
        Persona persona = new Persona();
        persona.setEdad(24);
        persona.setNombre("Vicente Boyer");
        persona.setTelefono("809-440-3839");

        System.out.println("Mi edad es: " + persona.getEdad());
        System.out.println("Mi nombre es: " + persona.getNombre());
        System.out.println("Mi numero de telefono es: " + persona.getTelefono());
        System.out.println("Mi edad es: " + persona.getEdad());

    }

}
