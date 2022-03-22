public class SelectionSort {

    public static void selectOrder(int[] lista){
     int aux = 0;
     int cont = 0;
     int cont2 = 0;
     for (int i=0; i<lista.length; i++){

          for (int j = 0; j<lista.length; j++){
              aux = lista[i];
              if(lista[i]<lista[j]){
                  lista[i] = lista[j];
                  lista[j] = aux;
                  cont++;
              }
          }
     }
        System.out.println(cont);
        System.out.println(cont2);
        for (int i: lista) {
            System.out.println(i);
        }
    }
    public static void bubbleOrder(int[] lista){

        for (int i = 0; i<(lista.length-1); i++){
            for(int j =1; j< (lista.length-1); j++){
                if(lista[j-1]>lista[j]){
                    lista[j] = lista[j-1];
                }
            }

        }
        for (int i: lista) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] lista = new int[]{4,7,5,2,8,1,6,3};

        selectOrder(lista);
        System.out.println("================================");
        bubbleOrder(lista);
    }
}
