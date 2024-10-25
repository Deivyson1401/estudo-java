import java.util.Scanner;

public class NumeroMatrizes {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe um número posiivo");
        int numero = ler.nextInt();
        if (numero<0){
            System.out.println("Número inválido, informe um número positivo.");
            System.exit(0);
        }

        pegarValor(numero);

        ler.close();
    }

    private static String linha = "021602";
    private static String colunaE = "021206";
    private static String colunaD = "061202";
    private static String colunaED = "0212021202";
    
    private static String[][] numeros = {
        {"1",colunaD,colunaD,colunaD,colunaD,colunaD,colunaD,colunaD,colunaD,colunaD,colunaD},
        {"2",linha,linha, colunaD,colunaD,linha,linha, colunaE,colunaE,linha, linha},
        {"3",linha,linha,colunaD,colunaD, linha, linha, colunaD, colunaD, linha, linha},
        {"4",colunaED, colunaED, colunaED, colunaED, linha, linha, colunaD, colunaD, colunaD, colunaD},
        {"5",linha, linha, colunaE, colunaE, linha, linha, colunaD, colunaD, linha, linha},
        {"6",colunaE, colunaE, colunaE, colunaE, linha, linha, colunaED, colunaED, linha, linha},
        {"7",linha, linha, colunaD, colunaD, colunaD, colunaD, colunaD, colunaD, colunaD, colunaD},
        {"8",linha, linha, colunaED, colunaED, linha, linha, colunaED, colunaED, linha, linha},
        {"9",linha, linha, colunaED, colunaED, linha, linha, colunaD, colunaD, colunaD, colunaD},
        {"0",linha, linha, colunaED, colunaED, colunaED, colunaED, colunaED, colunaED, linha, linha},
    };

    public static void pegarValor(int numero){
        String textNum = Integer.toString(numero);

        for(int i=0;i<textNum.length();i++){
            int num = Character.getNumericValue(textNum.charAt(i));
            imprimirNumero(gerarMatriz(num));
            System.out.println("\n");
        }
    }

    public static void imprimirNumero(boolean[][] matriz){

        for (int i=0;i<matriz.length;i++){
            String textLinha = "";
            for(int j=0;j<matriz[0].length;j++){
                if (matriz[i][j]){
                    textLinha = textLinha + "O  ";
                    continue;
                }
                textLinha = textLinha + "   ";
            }
            System.out.println(textLinha);
        }
    }

    public static boolean[][] gerarMatriz(int numero){

        String textNum = Integer.toString(numero);
        boolean[][] matriz = new boolean[10][10];
        String[] vetorNum = new String[11];

        for (int i=0;i<numeros.length;i++){
            if(textNum.equals(numeros[i][0])){
                vetorNum = numeros[i];
                break;
            }
        }

        for (int i = 0; i<matriz.length;i++){

            int indexMatrizLinha = 0;
            for(int x = 0; x<vetorNum[i+1].length();x+=2){
                int repeat = vetorNum[i+1].charAt(x+1) - '0';
                String indexBin = String.valueOf(vetorNum[i+1].charAt(x));
                if(indexBin.equals("0")){

                    for(int y =0;y<repeat; y++){
                        matriz[i][indexMatrizLinha] = false;
                        indexMatrizLinha++;
                    }
                    continue;
                }

                for(int z =0;z<repeat; z++){
                    matriz[i][indexMatrizLinha] = true;
                    indexMatrizLinha++;
                }
            }
        }
        return matriz;
    }
}
