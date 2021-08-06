import java.util.Scanner;

public class Uri1070{
    public static void main(String args[]){
        Scanner entrada = new Scanner (System.in);

        int x;
        x = entrada.nextInt();

        if(x % 2 == 0){
            x++;
        }
        
        for (int cont = 1; cont <=6; cont++){
            System.out.println(x);
            x+=2; // X= X + 2
        }
        
    }

}