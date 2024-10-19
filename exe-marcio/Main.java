import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] vetor = new int[1000];
        int num = ler.nextInt();

        System.out.println(vetor + " - " +num);
        ler.close();
    }
}