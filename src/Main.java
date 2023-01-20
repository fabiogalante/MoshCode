import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        log(new int[] { 1, 2,5});
    }


    public static void log(int[] numbers){

        System.out.println(Arrays.toString(numbers));

        System.out.println(numbers.length);


//        for (int i =0; i < numbers.length; i++)
//            System.out.println(numbers[0]);
//
//        for (int number: numbers)
//            System.out.println(number);
    }
}