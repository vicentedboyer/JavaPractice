import java.awt.*;

public class Main {

    public static void main(String[] args) {

        int numeroIf = -2;
        int numeroWhile = 0;
        int numeroFor;
        var estacion = "Primavera";

        System.out.println("-Evaluacion de los Numeros Negativos y Positivos: =>");
        if (numeroIf == 0) {
            System.out.println("El número es neutro.");
        } else if (numeroIf < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es positivo.");
        }

        System.out.println("-Resultado de While =>");
        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        System.out.println("-Resultado de DoWhile =>");
        do {
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        while (numeroWhile < 3);

        System.out.println("-Resultado de For =>");
        for (numeroFor = 0; numeroFor < 3; numeroFor = numeroFor + 1) ;
        System.out.println(numeroFor);

        System.out.println("-Resultado de Swtch =>");

        switch (estacion){
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





    }
}
