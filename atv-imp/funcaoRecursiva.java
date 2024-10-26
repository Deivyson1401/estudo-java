import java.util.Scanner;

public class funcaoRecursiva {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe um número: ");

        int numero = ler.nextInt();
        System.out.println("A soma é: " + somaRecursiva(numero));;
        ler.close();
    }

    public static int somaRecursiva(int numero){
        if(numero==1){
            return numero;
        }
        return numero + somaRecursiva(numero - 1);
    }
}