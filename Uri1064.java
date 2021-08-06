import java.util.Scanner;
public class Uri1064{
    public static void main(String args[]){
        Scanner entrada = new Scanner (System.in);

        double numero, soma = 0.0;
        int qtde = 0;

        for (int cont=1; cont <= 6 ; cont++){
            numero = entrada.nextDouble();
            if (numero > 0){
                qtde = qtde + 1;
                soma = soma + numero;
                
            }
            
        }
        System.out.println(qtde + " valores positivos");
        System.out.printf("%.1f\n", (soma / qtde));
    }
}