import java.util.Scanner;

public class Testandoif{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double n1, n2, me;

        System.out.println("Digite a nota da Prova 1");
        n1 = teclado.nextDouble();
        System.out.println("Digite a nota da Prova 2");
        n2 = teclado.nextDouble();

        me = (n1 + n2) / 2;

        System.out.println("A sua média vale "+me);

        if(me >= 6){
            System.out.println("Parabéns você foi aprovado(a)");

        }
        else{
            System.out.println("Reprovado!!!!");
        }
    }
}