public class CalcularMatrizes {
    public static void main(String[] args) {
        // ============================ Soma ============================================

        System.out.println("\nQuestão 1\n");
        int[][] matrizS11 = {{3,5,7},{1,4,6},{9,2,8}};
        int[][] matrizS12 = {{6,3,1},{7,2,0},{5,8,4}};
        somarMatrizes(matrizS11, matrizS12);
        
        System.out.println("\nQuestão 2\n");
        int[][] matrizS21 = {{2,3,4},{5,6,7}};
        int[][] matrizS22 = {{8,7,6},{5,4,3}};
        somarMatrizes(matrizS21, matrizS22);
        
        System.out.println("\nQuestão 3\n");
        int[][] matrizS31 = {{4,9},{3,2}};
        int[][] matrizS32 = {{1,5},{6,8}};
        somarMatrizes(matrizS31, matrizS32);

        // ============================ Subtração =======================================
        
        System.out.println("\nQuestão 4\n");
        int[][] matrizSu11 = {{9,4,5},{3,8,2},{6,1,7}};
        int[][] matrizSu12 = {{3,1,2},{6,5,4},{8,2,9}};
        subtrairMatrizes(matrizSu11, matrizSu12);

        System.out.println("\nQuestão 5\n");
        int[][] matrizSu21 = {{7,9,2},{4,5,6}};
        int[][] matrizSu22 = {{2,3,5},{8,7,1}};
        subtrairMatrizes(matrizSu21, matrizSu22);
        
        System.out.println("\nQuestão 6\n");
        int[][] matrizSu31 = {{6,8},{4,7}};
        int[][] matrizSu32 = {{3,2},{5,1}};
        subtrairMatrizes(matrizSu31, matrizSu32);
        
        // ============================ Multiplicação ===================================
        
        System.out.println("\nQuestão 7\n");
        int[][] matrizM11 = {{1,2},{3,4}};
        int[][] matrizM12 = {{2,0},{1,3}};
        multiplicarMatrizes(matrizM11, matrizM12);

        // ============================ Escalar =========================================

        System.out.println("Questão 10\n");
        int[][] matriz = {{2,1},{0,3}};
        escalarMatrizes(matriz,matriz.length,4);
    }

    public static int[][] somarMatrizes(int[][] matriz1, int[][] matriz2){
        int[][] matrizResult = new int[matriz1.length][matriz1[0].length];
        
        for (int i = 0; i < matriz1.length; i++){
            
            for(int j = 0; j < matriz1[0].length; j++){
                matrizResult[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        imprimirValores(matrizResult);
        return matrizResult;
    }
    
    public static int[][] subtrairMatrizes(int[][] matriz1, int[][] matriz2){
        
        int[][] matrizResult = new int [matriz1.length][matriz1[0].length];
        
        for (int i = 0; i < matriz1.length; i++){
            
            for(int j = 0; j < matriz1[i].length; j++){
                matrizResult[i][j] = matriz1[i][j] - matriz2[i][j];
            }
        }
        
        imprimirValores(matrizResult);
        return matrizResult;
    }

    public static int[][] multiplicarMatrizes(int[][] matriz1, int[][] matriz2){
        
        int[][] matrizResult = new int [matriz1.length][matriz2[0].length];
        for (int i = 0; i < matrizResult.length; i++){
            int soma = 0;
            for(int j = 0; j < matrizResult[i].length; j++){
                for (int x = 0; x < matriz1[0].length; x++){
                    
                }
                matrizResult[i][j] = soma;
            }
        }
        
        imprimirValores(matrizResult);
        return matrizResult;
    }
    
    public static int[][] escalarMatrizes(int[][] matriz1, int TamanhoMatriz,int escalar){
        
        int[][] matrizResult = new int [TamanhoMatriz][TamanhoMatriz];
        
        for (int i = 0; i < matriz1.length; i++){
            
            for(int j = 0; j < matriz1[i].length; j++){
                matrizResult[i][j] = matriz1[i][j] * escalar;
            }
        }
        
        imprimirValores(matrizResult);
        return matrizResult;
    }

    public static void imprimirValores(int[][] matriz){
        for(int i = 0; i < matriz.length; i++){
            String texto = "";

            for (int j = 0; j < matriz[0].length; j++){
                texto = texto + matriz[i][j] + "  ";
            }
            System.out.println(texto);
        }
    }
}
