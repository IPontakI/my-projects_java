package task1;

public class Main {
    public static void main(String[] args) {
        int[] values = new int[] {1, 0, 2, 5, 6, 4, 10, 3};
        int minValue = values[0], maxValue = values[0], minIndex = 0, maxIndex = 0;
        int sum = 0;

        for (int i = 0; i < values.length; i++){
            if (values[i] < minValue){
                minValue = values[i];
                minIndex = i;
            }
            if (values[i] > maxValue){
                maxValue = values[i];
                maxIndex = i;
            }
        }
        //System.out.println("min value " + minValue);
        System.out.println("min index " + minIndex);
        //System.out.println("max value " + maxValue);
        System.out.println("max index " + maxIndex);

        for (;minIndex < maxIndex;minIndex++){
            sum += values[minIndex];
        }
        System.out.println("Sum = " + sum);
    }
}