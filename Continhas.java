public class Continhas{
    public static void main(String args[]){
        int a, b, c;

        a = 23;
        b = 4;
        c = a + b;

        System.out.println("Valor da soma = " + c);

        c = a - b;
        System.out.println("Valor da subtração é " + c);

        c = a * b;
        System.out.println ("Valor da multiplicação = " + c);

        c = a / b;
        System.out.println ("Valor da Divisão = " + c);

        c = a % b;
        System.out.println ("Valor do resto é: " + c);

        float x, y, z;

        x = a;
        y = b;
        z = x / y;

        System.out.println ("Valor da divisão é : " + z);
        System.out.printf("Valor com 2 casa decimais %.2f\n", z);
        System.out.printf("Valor com 3 casa decimais %.3f\n", z);


    }
}