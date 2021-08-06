import java.util.Scanner;

public class Quadrado{
    public static void main (String args[]){
        Scanner valor;
        valor = new Scanner(System.in);
        double lado, area;

        System.out.println("Digite o valor do lado do Quadrado ");
        lado = valor.nextDouble();

        area = lado * lado;

        System.out.println ("O valor da área é: " + area);


    }
}