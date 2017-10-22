package bubblesort;

import java.util.ArrayList;


public class BubbleSort {

    public static void sort(ArrayList<Integer> array){
        int size  = array.size();
        
        for(int i = 0; i < size-1; i++){
            for(int j = 0; j < size-1; j++){
                if(array.get(j) > array.get(j+1)){
                    int aux = array.get(j);
                    array.set(j, array.get(j+1));
                    array.set(j+1, aux);
                }
            }    
        }
    }
    
        public static void print(ArrayList<Integer> array){
        
        for(int i = 0; i < array.size(); i++){
            System.out.print(array.get(i) + " ");
        }
        System.out.println();
       
        }
    
    public static void main(String[] args) {
         ArrayList<Integer> array = new ArrayList<>();
        array.add(5);
        array.add(65);
        array.add(20);
        array.add(18);
        array.add(1);
        array.add(63);
        array.add(2);
        array.add(32);

        print(array);
        sort(array);
        print(array);
    }
    
}
