package track.java.advanced;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BigIntegerFactorialDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int factorialOf = Integer.parseInt(sc.nextLine());

        System.out.println(factorial(factorialOf));

//        int[] arr = {10,30,40};
//        IntConsumer process = System.out::println;
//        Arrays.stream(arr).max().ifPresent(process);
//
//        Stream.iterate(1, x -> x+1)
//                .filter(x -> x.toString().contains("5"))
//                .limit(10)
//                .forEach(System.out::println);
    }

    public static int sumUsingStreams(int []arr)
    {
        return Arrays.stream(arr).max().getAsInt();
    }

    private static BigInteger factorial(int factorialOf) {
        BigInteger res = BigInteger.ONE;
        int i = 2;
        while(i <= factorialOf) {
            res = res.multiply(BigInteger.valueOf(i++));
        }
        return res;
    }
}
