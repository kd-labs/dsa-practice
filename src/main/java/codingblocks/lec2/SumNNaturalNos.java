package codingblocks.lec2;

public class SumNNaturalNos {

    public static void main(String[] args) {

        int n = 20;
        int res = sumNNos(n);
        System.out.println(res);
    }

    private static int sumNNos(int n) {
        int sum = 0;

        for(int i = 1 ; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    private static int sumNNosUsingWhile(int n) {
        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum += i;
            i++;
        }

        return sum;
    }
}
