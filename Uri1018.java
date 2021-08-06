import java.util.Scanner;
public class Uri1018{
    public static void main (String args[]){
        Scanner entrada = new Scanner (System.in);
        int valor;
        int nota1, decomposicao, nota2, nota3, nota4, nota5,nota6,nota7;
        
        valor = entrada.nextInt();
        nota1 = valor/100;
        decomposicao = valor%100;
        nota2 = decomposicao/50;
        decomposicao = decomposicao%50;
        nota3 = decomposicao/20;
        decomposicao = decomposicao%20;
        nota4 = decomposicao/10;
        decomposicao = decomposicao%10;
        nota5 = decomposicao/5;
        decomposicao = decomposicao%5;
        nota6 = decomposicao/2;
        decomposicao = decomposicao%2;
        nota7 = decomposicao;

        System.out.println(valor);
        System.out.println(nota1 + " nota(s) de R$ 100,00");
        System.out.println(nota2 + " nota(s) de R$ 50,00");
        System.out.println(nota3 + " nota(s) de R$ 20,00");
        System.out.println(nota4 + " nota(s) de R$ 10,00");
        System.out.println(nota5 + " nota(s) de R$ 5,00");
        System.out.println(nota6 + " nota(s) de R$ 2,00");
        System.out.println(nota7 + " nota(s) de R$ 1,00");

    }
}