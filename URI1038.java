import java.util.Scanner;
public class URI1038{
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);

        double valor;
        int cod, qtde;
        

        cod = entrada.nextInt();
        qtde = entrada.nextInt();
        
        if (cod == 1){
            valor = qtde * 4.00;
            System.out.printf ("Total: R$ %.2f\n", valor);
        }
        else if (cod == 2){
            valor = qtde * 4.50;
            System.out.printf ("Total: R$ %.2f\n", valor);
        }
        else if (cod == 3){
            valor = qtde * 5.00;
            System.out.printf ("Total: R$ %.2f\n", valor);
        }
        else if (cod == 4){
            valor = qtde * 2.00;
            System.out.printf ("Total: R$ %.2f\n", valor);
        }
        else{
            valor = qtde * 1.50;
            System.out.printf ("Total: R$ %.2f\n", valor);
        }

    }
}

