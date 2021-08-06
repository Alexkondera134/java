import java.util.Scanner;
public class Uri1066{
    public static void main(String args[]){
        Scanner entrada = new Scanner (System.in);

        int numero;
        int qtdepar = 0;
        int qtdeimpar = 0;
        int qtdepos = 0;
        int qtdeneg = 0;


        for (int cont=1; cont < 5 ; cont++){
            numero = entrada.nextInt(); 
            for (int cont=1; cont<=5; cont++){
                if (numero%2==0){
                qtdepar = qtdepar + 1;
                }
                else if (numero%2!=0){
                qtdeimpar = qtdeimpar + 1;            
                }
            }

            }                       
            
            if ( numero > 0){
                qtdepos = qtdepos + 1;
            }       
            
            else if (numero < 0){
            qtdeneg = qtdeneg + 1;                
            }
            
        }
        System.out.println(qtdepar + " valor(es) par(es)");
        System.out.println(qtdeimpar + " valor(es) impar(es)");
        System.out.println(qtdepos + " valor(es) positivo(s)");
        System.out.println(qtdeneg + " valor(es) negativo(s)");
        
    }


}