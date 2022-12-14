package task3;

public class Main {
    public static void main(String[] args) {
        int arr1[] = new int[] {1,2,3,4,5};
        int arr2[] = new int[] {5,6,7};
        int len = arr1.length < arr2.length ? arr2.length : arr1.length;
        int arr3[] = new int[arr1.length + arr2.length];

        for(int i = 0, k = 0; i < len; i++){
            if(i < arr1.length){
                arr3[k] = arr1[i];
                k++;
            }
            if(i < arr2.length){
                arr3[k] = arr2[i];
                k++;
            }
        }
        for (int i = 0; i < arr3.length; i++){
            System.out.println(arr3[i]);
        }

    }
}