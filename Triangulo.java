import java.util.Scanner;
    public class Triangulo{
        public static void main (String args[]){
            Scanner valor;
            valor = new Scanner(System.in);

            double base, altura, area;

            System.out.println ("Digite o valor da base do triangulo");
            base = valor.nextDouble();

            System.out.println ("Digite a altura do triângulo");
            altura = valor.nextDouble();

            area = (base * altura)/2;

            System.out.printf ("O valor da área do triângulo é: %.2f", area );



        }
    }