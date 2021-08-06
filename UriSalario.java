import java.util.Scanner;

public class UriSalario{
    public static void main (String args[]){
        Scanner entrada = new Scanner (System.in);
        
        int number, hora;
        double valor, salary;

        number = entrada.nextInt();
        hora = entrada.nextInt();
        valor = entrada.nextDouble();
        salary = valor * hora;

        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f\n", salary);

    }

}