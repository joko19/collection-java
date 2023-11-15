/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection;

/**
 *
 * @author joko
 */
public class SortExample {
    
    public static void main(String[] args) {
        int[] numbers = {40, 7, 59, 4, 1};
        displayValues(numbers);
//        sequentialSearch(numbers, 13);
//        sequentialSearch(numbers, 7);
        binarySearch(numbers, 7);
//        selectionSort(numbers);
        bubbleSort(numbers);
        displayValues(numbers);
    }//end method main

    static void selectionSort(int[] numbers) {
        int indexMin = 0; //the index of the smallest number
        for(int i = 0; i< numbers.length; i++){
            indexMin = i;
            for(int j = i + 1; j < numbers.length; j++){
                if(numbers[j] < numbers[indexMin]){//if we find a smaller int,
                    indexMin = j; //set it as the min
                }//endif
            }//endfor
            //we have the index of the smallest int and can swap the values
            int temp = numbers[i]; //use temp to store the value
            numbers[i] = numbers[indexMin];
            numbers[indexMin] = temp;
        }//endfor
    }//end method selectionSort

    static void displayValues(int[] numbers) {
        for(int i = 0; i< numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }//endfor
        System.out.println("\n");
    }
    
    static void bubbleSort(int[] numbers) {
        for(int i =0 ; i < numbers.length; i++){
            for(int j = 0; j < numbers.length-1; j ++){
                //if the numbers are not in order
                if(numbers[j] > numbers[j +1]){
                    //swap the numbers
                    int temp = numbers[j];
                    numbers[j] = numbers[j +1];
                    numbers[j +1] = temp;
                }//endif
            }//endfor
        }//endfor
    }//end method bubbleSort
    
    static void sequentialSearch(int[] numbers, int value) {
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == value) {
                System.out.println("The number "+ value + " is at position "
                + i + " in the list");
                return;
            }//endif
        }//endfor
        System.out.println("The number "+ value + " is not in the list");
    }//end method sequentialSearch
    
    static public void binarySearch(int[] numbers, int value){
        int low = 0;
        int high = numbers.length - 1;
        while(high >= low){
            int middle = (low + high)/2; // Middle index
            if(numbers[middle] == value){
                System.out.println("The number "+ value + " is at position "
                + middle + " in the list");
                return; //Target value was found
            }//endif
            if(numbers[middle] < value){
                low = middle + 1;
            }//endif
            if(numbers[middle] > value){
                high = middle - 1;
            }//endif
        }//endwhile //The value was not found
        System.out.println("The number "+ value + " is not in the list");
    }
}
