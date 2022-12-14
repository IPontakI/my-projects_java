package task2;

public class Main {
    public static void main(String[] args) {

        int array[] = new int[] {1,2,3,4,5,6};
        int positions = 1;

        int size = array.length;
        for (int i = 0; i < positions; i++) {
            int temp = array[size - 1];
            for (int j = size - 1; j > 0; j--) {
                array[j] = array[j-1];
            }
            array[0] = temp;
    }
        for (int i = 0; i < array.length; i++){
            //arr1[i] = arr[i + 1];
            System.out.println(array[i]);
        }
}}
