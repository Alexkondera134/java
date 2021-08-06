import java.util.Scanner;

public class UriConsumo{
    public static void main (String args[]){
        Scanner entrada = new Scanner (System.in);
        int distanciaKm;
        double combustivel, consumo;

        distanciaKm=entrada.nextInt();
        combustivel=entrada.nextDouble();

        consumo = distanciaKm / combustivel;

        System.out.printf("%.3f Km/l",consumo);

    }
}