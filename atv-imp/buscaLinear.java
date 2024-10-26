public class buscaLinear {
    
    public static void main(String[] args) {
        int[] vetor = {5,3,2,4,5,3,7,9,3,0,1,4,5,6};

        System.out.println("A posição do elemento é: "+ buscaL(vetor, 5));
    }

    public static int buscaL(int[] vetor, int busca){

        for(int i=0;i<vetor.length;i++){
            if(busca==vetor[i]){
                return i;
            }
        }
        return -1;
    }
}
