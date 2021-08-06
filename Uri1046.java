import java.util.Scanner;
public class Uri1046{
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);

        int inicio, fim, tempo;

        inicio = entrada.nextInt();
        fim = entrada.nextInt();
        
        tempo = fim - inicio;

        if (tempo > 0 ){
            System.out.println("O JOGO DUROU "+ tempo + " HORA(S)");
        }
        if (tempo <= 0){
            tempo = tempo + 24;
            System.out.println("O JOGO DUROU "+ tempo + " HORA(S)");
        }
        
    }
}