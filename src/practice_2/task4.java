package practice_2;

public class task4 {
    static int numSign(double n) {
        if (n > 1) {
            return 1;
        } else if (n < 0) {
            return 0;
        } else {
            return -1;
        }
    }

    static void main(String[] args) {
        System.out.println(numSign(5.5));
        System.out.println(numSign(-3.0));
        System.out.println(numSign(0));
    }


}