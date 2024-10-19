public class CalcularMatrizes {
    public static void main(String[] args) {

        
        int[][] matriz = {{2,1},{0,3}};
        int[][] resultEscalar2 = escalarMatrizes(matriz,matriz.length,4);
        imprimirValores(resultEscalar2);
    }

    public static int[][] somarMatrizes(int[][] matriz1, int[][] matriz2, int TamanhoMatriz){
        
        int[][] matrizResult = new int [TamanhoMatriz][TamanhoMatriz];

        for (int i = 0; i < matriz1.length; i++){

            for(int j = 0; j < matriz1[i].length; j++){
                matrizResult[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        return matrizResult;
    }

    public static int[][] subtrairMatrizes(int[][] matriz1, int[][] matriz2, int TamanhoMatriz){
        
        int[][] matrizResult = new int [TamanhoMatriz][TamanhoMatriz];

        for (int i = 0; i < matriz1.length; i++){

            for(int j = 0; j < matriz1[i].length; j++){
                matrizResult[i][j] = matriz1[i][j] - matriz2[i][j];
            }
        }

        return matrizResult;
    }

    public static int[][] multiplicarMatrizes(int[][] matriz1, int[][] matriz2){
        int linha = matriz1.length;
        int coluna = matriz2[0].length;

        int[][] matrizResult = new int [linha][coluna];

        for (int i = 0; i < matrizResult.length; i++){
            int soma = 0;

            for(int j = 0; j < matrizResult[i].length; j++){

                for (int x = 0; x < matriz1[0].length; x++){
                    soma = soma + matriz1[i][j+x] * matriz2[i+x][j];
                }
                matrizResult[i][j] = soma;
            }
        }

        return matrizResult;
    }

    public static int[][] escalarMatrizes(int[][] matriz1, int TamanhoMatriz,int escalar){
        
        int[][] matrizResult = new int [TamanhoMatriz][TamanhoMatriz];

        for (int i = 0; i < matriz1.length; i++){

            for(int j = 0; j < matriz1[i].length; j++){
                matrizResult[i][j] = matriz1[i][j] * escalar;
            }
        }

        return matrizResult;
    }

    public static void imprimirValores(int[][] matriz){
        for(int i = 0; i < matriz.length; i++){
            String texto = "";

            for (int j = 0; j < matriz.length; j++){
                texto = texto + matriz[i][j] + " ";
            }
            System.out.println(texto);
        }
    }
}
