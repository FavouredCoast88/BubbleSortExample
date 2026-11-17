
package bubblesortexample;


public class BubbleSortExample {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 4, 2};
        for(int i = 0; i < numbers.length - 1; i++){
            for(int j = 0; j < numbers.length -1 -i; j++){
                if(numbers[j] > numbers[j + 1]){
                    //sawp elements
                    int temp = numbers[j];
                    numbers[j]= numbers[j + 1];
                    numbers[j + 1] = temp;
                }//end if
            }//end for
        }//end for
        System.out.print("Sorted Array:");
        for(int num : numbers){
            System.out.print(num + " ");
        }//end for
    }//end main
}//end class
