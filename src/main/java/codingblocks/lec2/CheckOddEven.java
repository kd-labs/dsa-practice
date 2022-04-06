package codingblocks.lec2;

public class CheckOddEven {

    public static void main(String[] args) {

//        int n = 11;
//        String res = checkOddEven(n);
//        System.out.println(res);

//        int marks = 43;
        int marks = 62;
        String grade = getGrade(marks);
        System.out.println("Grade obtained : " + grade);

        printN(7);
    }

    private static String checkOddEven(int n) {

        return (n & 1) == 1 ? "odd" : "even";
    }

    private static boolean eligibleVoter(int age) {
        return age >= 18;
    }

    private static String getGrade(int marks) {

        if(marks >= 75) return "A";
        else if(marks >= 65) return "B";
        else if(marks >= 55) return "C";
        else if(marks >= 45) return "D";
        else return "fail";

    }

    private static void printN(int n) {

        int i = 0;
        while (i <=n) {
            System.out.println(i);
            i++;
        }
    }
}
