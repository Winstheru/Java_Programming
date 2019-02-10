import java.util.Arrays; //use this library to change array into string so we can easily output the array's value
public class Main {
    public static void main(String[] args) {
        //assignment
        //format : tipe_data[] nama_variable = {component, component}

        System.out.println("Assignment Array");
        int[] arrInteger = {1,2,3,4};
        System.out.println(arrInteger); //outputnya gajelas karena itu sebenarnya address di memory heap-nya. Memory heap memang tidak pasti lokasinya, berbeda dgn memori stack yg sudah pasti cthnya int b = 10; nah ini sudah jelas nilai b disimpan di memory stack

        arrInteger[2] = 10; //change the value of array index-2 into 10
        System.out.println(arrInteger[0]);
        System.out.println(arrInteger[1]);
        System.out.println(arrInteger[2]);
        System.out.println(arrInteger[3]);

        //Declaration
        //format : data_type[] variable_name = new int[arrayNumbers]  <- array is actually an object in java so we use "new"

        System.out.println("Array Declaration");
        float[] arrFloat = new float[5];
        arrFloat[2] = 10.5f; //change the value of array index-2 into 10

        System.out.println(arrFloat[0]); //default value of the empty array is 0
        System.out.println(arrFloat[1]);
        System.out.println(arrFloat[2]);
        System.out.println(arrFloat[3]);
        System.out.println(arrFloat[4]);

        System.out.println(Arrays.toString(arrInteger)); //easy way to output the arrInteger's value
        System.out.println(Arrays.toString(arrFloat));

    }
}
