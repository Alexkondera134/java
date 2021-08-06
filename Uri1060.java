import java.util.Scanner;
public class Uri1060{
    public static void main(String args[]){
        Scanner entrada = new Scanner (System.in);

        double numero;
        int qtde = 0;

        for (int cont=1; cont <= 6 ; cont++){
            numero = entrada.nextDouble();
            if (numero > 0){
                qtde = qtde + 1;
                
            }
            
        }
        System.out.println(qtde + " valores positivos");
    }
}