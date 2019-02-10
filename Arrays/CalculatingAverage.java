public class CalculatingAverage {
    public static void main(String[] args) {
        int[] arr = {75,73,72,80};
        int size = arr.length;
        int total = 0;
        for(int i = 0; i < size; i++){
            total += arr[i];
        }
        int average = total / size;
        System.out.println(average);
    }
}
