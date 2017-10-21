package insertionsort;

import java.util.ArrayList;

public class InsertionSort {

    public static void sort(ArrayList<Integer> array){
        
        for (int i = 0; i < array.size(); i++) {
            int x = array.get(i);
            int j = i-1;
            
            while (j >= 0 && array.get(j) > x){
                array.set(j+1, array.get(j));
                j = j-1;
            }
            
            array.set(j+1, x);
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
