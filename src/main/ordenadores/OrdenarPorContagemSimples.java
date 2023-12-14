package ordenadores;

public class OrdenarPorContagemSimples implements Ordenador{

    @Override
    public int[] ordene(int[] array) {
        int max=array[0];
        boolean tem0=false;
        for(int i=1;array.length>i;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        boolean[] novoArray = new boolean[max];
        for(int i=0;array.length>i;i++){
            if(array[i]==0){
                tem0=true;
            }
            else{    
            novoArray[array[i]-1]=true;
            }
        }
        
        for(int i=0;novoArray.length>i;i++){
            if(novoArray[i]){
                array[i]=i;
            }
        }
        if(tem0){
            int[] Array0= new int[array.length+1];
            for(int i=0;i<array.length;i++){
                Array0[i+1]=array[i];
            }
            Array0[0]=0;
            array=Array0;

        }
        return array;
    }
    
}
