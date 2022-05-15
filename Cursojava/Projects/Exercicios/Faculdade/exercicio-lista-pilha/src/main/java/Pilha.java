public class Pilha {

    private int topo;
    private int[] pilha;

    public Pilha(int capacidade) {
        this.topo = -1;
        this.pilha = new int[capacidade];
    }

    //METODOS
    public boolean isEmpty(){
        return topo == -1;
    }

    public boolean isFull(){
        return topo == pilha.length-1;
    }

    public void push(int num){
        if(isFull()){
            System.out.println("Pilha cheia");
        }else{
            topo++;
            pilha[topo] = num;

        }
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("-1");
        }else{
            topo--;
        }
    }

    public void peek(){
        if(isEmpty()){
            System.out.println("-1");
        }else{
            System.out.println(pilha[topo]);
        }
    }

    public void exibe(){
        if(isEmpty()){
            System.out.println("Lista vazia");
        }else{
            for (int i = topo; i>=0; i--){
                System.out.println(pilha[i]);
            }
        }
    }

    public boolean isPalindromo(int[] vector){
        for(int i = 0; i<vector.length; i++){
            push(vector[i]);
        }
        boolean is = false;
        for(int x = topo ; x>=0; x--){
            for(int i = 0; i<vector.length; i++){
                if(pilha[topo] == pilha[i]){
                    is = true;
                }else {
                    is = false;
                }
            }
        }

        return is;
    }

    public void binario(int numero) {
        int d = numero;
        StringBuffer binario = new StringBuffer();
        while (d > 0) {
            int b = d % 2;
            binario.append(b);
            d = d >> 1;
        }
        System.out.println(binario.reverse().toString());
    }

}
