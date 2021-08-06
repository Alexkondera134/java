import java.util.Scanner;
public class Uri1065{
    public static void main(String args[]){
        Scanner entrada = new Scanner (System.in);

        int numero;
        int qtde = 0;

        for (int cont=1; cont <= 5 ; cont++){
            numero = entrada.nextInt();
            if (numero%2==0){
            qtde = qtde + 1;
                
            }
            
        }
        System.out.println(qtde + " valores pares");
    }
}