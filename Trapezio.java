import java.util.Scanner;
    public class Trapezio{
        public static void main (String args[]){

            Scanner valor;
        valor = new Scanner(System.in);

        double base1, base2, altura, area;

        System.out.println("Digite o valor da primeira base");
        base1 = valor.nextDouble();

        System.out.println("Digite o valor da segunda base");
        base2 = valor.nextDouble();

        System.out.println("Digite o valor da altura");
        altura = valor.nextDouble();

        area = (base1 + base2)*altura /2;


        System.out.printf ("O valor da área do Trapézio é %.2f", area);

        }        
}