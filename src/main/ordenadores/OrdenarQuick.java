package ordenadores;
public class OrdenarQuick implements Ordenador{

    @Override
    public int[] ordene(int[] array) {

        return array;
    }

    public int quickParticio(int[] array, int inicio, int fim){
        int pivo=array[inicio];
        int onde=1;
        int ondePivo=0;
        for(int i=1;i<=fim;i++){
            if(pivo>array[i]){
              int a= array[i];
              array[i]=array[onde];
              array[onde]=a;
              ondePivo=ondePivo+1;
            }
            onde=onde+1;
        }
        return ondePivo;
    }
    
}
