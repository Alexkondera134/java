import java.util.Scanner;
public class TesteSwicth{
    public static void main(String args[]){

    Scanner entrada = new Scanner(System.in);

    int numero;

    numero = entrada.nextInt();

    switch (numero){
        case 1:
            System.out.println("Digitou o valor " + numero);
            break;
        case 2:
            System.out.println("Digitou o valor " + numero);
            break;
        case 3:
            System.out.println("Digitou o valor " + numero);
            break;
        default:
            System.out.println("Digite outro valor ");
    }

    }
}