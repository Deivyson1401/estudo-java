public class ValoresUn {
    
    public static void main(String[] args){
        int[] vetor = {1,1,2,1,3,4,5,6,7,3,4,5,9};
        System.out.println("\nTamanho da lista:" + vetor.length + "\n");

        int[] vUnicos = valoresUnicos(vetor);
        System.out.println("Tamanho da nova lista:" + vUnicos.length + "\n");

        for(int i=0;i<vUnicos.length;i++){
            System.out.println("valor: " + vUnicos[i]);
        }
    }

    public static int[] valoresUnicos(int[] vetor){
        int[] vetorAux = new int[vetor.length];
        int contVetorAux = 0;

        for (int i=0;i<vetor.length;i++){
            boolean isDuplicado = false;
            int contAux = 0;

            for(int j=0;j<vetor.length;j++){
                if(vetor[i]==vetorAux[j]){
                    contAux++;
                }

                if(contAux>0){
                    isDuplicado = true;
                    break;
                }
            }

            if(!isDuplicado){
                vetorAux[contVetorAux] = vetor[i];
                contVetorAux++;
            }
        }

        int[] vetUni = new int[contVetorAux];

        for(int x=0;x<vetUni.length;x++){
            vetUni[x] = vetorAux[x];
        }

        return vetUni;
    }
}
