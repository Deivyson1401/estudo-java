import java.util.Random;

public class Sort {

    public static void main(String[] args) {
        int[] vetor = {34, 8, 64, 51, 32, 21, 4, 12, 67, 19, 78, 45, 34, 88, 29, 57, 83, 92, 6, 11};
        
        // Questão 1
        System.out.println("\nQuestão 1: selection sort");
        System.out.println("\nAntes do ordenamento");
        imprimirVetor(vetor);
        
        int[] vetorSelection = selectionSort(vetor, false);
        System.out.println("\nDepois do ordenamento");
        imprimirVetor(vetorSelection);
        
        System.out.println("\n\nQuestão 2: insertion sort");
        System.out.println("\nAntes do ordenamento");
        imprimirVetor(vetor);
        
        int[] vetorInsertion = insertionSort(vetor, false);
        System.out.println("\nDepois do ordenamento");
        imprimirVetor(vetorInsertion);
        
        System.out.println("\n\nQuestão 3: selection sort decrescente");
        // Para reaproveitar a mesma função, apenas inseri um novo parametro
        // booleano que irá indicar se o vetor será decrescente ou não.
        // na função passei uma condição invertendo a lógoca de verificação de '<' para '>'
        
        System.out.println("\nAntes do ordenamento");
        imprimirVetor(vetor);
        System.out.println("\nDepois do ordenamento");
        int[] vetorSelectionDec = selectionSort(vetor, true);
        imprimirVetor(vetorSelectionDec);
        
        System.out.println("\n\nQuestão 4: insertion sort decrescente");
        
        // Para reaproveitar a mesma função, apenas inseri um novo parametro
        // booleano que irá indicar se o vetor será decrescente ou não.
        // na função passei um condição invertendo a condição do while de '>' para '<'
        
        System.out.println("\nAntes do ordenamento");
        imprimirVetor(vetor);
        
        int[] vetorInsertionDec = insertionSort(vetor, true);
        System.out.println("\nDepois do ordenamento");
        imprimirVetor(vetorInsertionDec);

        System.out.println("\n\nQuestão 5");

        // Complexidade de Tempo:
        // Ambos são de complexidade O(n²)
        // Situações de Vantagem:

        // O Insertion Sort é mais eficiente em listas pequenas ou quase ordenadas.
        // O Selection Sort tem desempenho consistente, independentemente da ordenação inicial.
        int[] tamanhos = {100,500,1000};

        for(int tamanho: tamanhos){
            int[] vetorRandom = gerarVetor(tamanho);

            System.out.println("\nSelection sort:");
            long inicioSelection = System.nanoTime();
            selectionSort(vetorRandom, false);
            long fimSelection = System.nanoTime();
            long tempoTotalSelection = fimSelection - inicioSelection;
            System.out.println("Vetor de " + tamanho + " elementos\nTempo de execução: " + tempoTotalSelection + " nanossegundos");
            
            System.out.println("\nInsertion sort:");
            long inicioInsertion = System.nanoTime();
            insertionSort(vetorRandom, false);
            long fimInsertion = System.nanoTime();
            long tempoTotalInsertion = fimInsertion - inicioInsertion;
            System.out.println("Vetor de " + tamanho + " elementos\nTempo de execução: " + tempoTotalInsertion + " nanossegundos");
        
            if(tempoTotalInsertion>tempoTotalSelection){
                System.out.println("\nMais rápido: Insertion sort\n-------------------------------------");
                continue;
            }
            System.out.println("\nMais rápido: Selection sort\n-------------------------------------");
        }
    }

    public static void imprimirVetor(int[] v){
        String vetor = "\n";
        for(int i=0;i<v.length;i++){
            vetor = vetor + v[i] + " ";
        }
        System.out.println(vetor);
    }

    public static int[] substituirVetor(int[] vetor){
        int[] novoVetor = new int[vetor.length];

        for(int i=0;i<vetor.length;i++){
            novoVetor[i] = vetor[i];
        }
        return novoVetor;
    }

    public static int[] selectionSort(int[] vetor, boolean dec){

        int[] nVetor = substituirVetor(vetor);
        
        for(int i=0;i<nVetor.length;i++){
            int min = i;

            for(int j=i;j<nVetor.length;j++){
                if(dec){
                    if(nVetor[j]>nVetor[min]){
                        min = j;
                    }
                    continue;
                }
                if(nVetor[j]<nVetor[min]){
                    min = j;
                }   
            }
            int aux = nVetor[i];
            nVetor[i] = nVetor[min];
            nVetor[min] = aux;
        }

        return nVetor;
    }

    public static int[] insertionSort(int[] vetor, boolean dec){

        int[] novoVetor = substituirVetor(vetor);

        for(int i=0;i<novoVetor.length;i++){
            int chave = novoVetor[i];
            int j = i-1;
            
            if (dec){
                while (j>=0 && novoVetor[j]<chave) {
                    novoVetor[j + 1] = novoVetor[j];
                    j--;
                }
                novoVetor[j + 1] = chave;
                continue;
            }
            while (j>=0 && novoVetor[j]>chave) {
                novoVetor[j + 1] = novoVetor[j];
                j--;
            }
            novoVetor[j + 1] = chave;
        }
        return novoVetor;
    }

    public static int[] gerarVetor(int tam){
        int[] vetor = new int[tam];
        Random random = new Random();

        for(int i=0;i<vetor.length;i++){
            vetor[i] = random.nextInt(1000);
        }

        return vetor;
    }
}