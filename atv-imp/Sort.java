public class Sort {

    public static void main(String[] args) {
        
        // Questão 1
        System.out.println("\nQuestão 1:");
        int[] vetor1 = {34, 8, 64, 51, 32, 21, 4, 12, 67, 19, 78, 45, 34, 88, 29, 57, 83, 92, 6, 11};
        System.out.println("\nAntes do ordenamento");
        imprimirVetor(vetor1);
        
        selectionSort(vetor1);
        System.out.println("Depois do ordenamento");
        imprimirVetor(vetor1);
        
        System.out.println("\nQuestão 2");
        System.out.println("Antes do ordenamento");
        int[] vetor2 = {34, 8, 64, 51, 32, 21, 4, 12, 67, 19, 78, 45, 34, 88, 29, 57, 83, 92, 6, 11};
        imprimirVetor(vetor2);

        insertionSort(vetor2);
        System.out.println("Depois do ordenamento");
        imprimirVetor(vetor2);


    }

    public static void imprimirVetor(int[] v){
        String vetor = "\n";
        for(int i=0;i<v.length;i++){
            vetor = vetor + v[i] + " ";
        }
        System.out.println(vetor);
    }

    public static void selectionSort(int[] vetor){
        
        for(int i=0;i<vetor.length;i++){
            int min = i;

            for(int j=i;j<vetor.length;j++){
                if(vetor[j]<vetor[min]){
                    min = j;
                }
            }

            int aux = vetor[i];
            vetor[i] = vetor[min];
            vetor[min] = aux;
        }
    }

    public static void insertionSort(int[] vetor){

        for(int i=0;i<vetor.length;i++){
            

            for(int j=0;j<vetor.length;j++){
                
            }
        }
    }
}