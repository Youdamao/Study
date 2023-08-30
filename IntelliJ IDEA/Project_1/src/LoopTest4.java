import java.util.Random;
import java.util.Scanner;

public class LoopTest4 {

    public static void main(String[] args) {
        System.out.println("input zhe max number:");
        Scanner q = new Scanner(System.in);
        int input = q.nextInt();
        Random r = new Random();
        int number = r.nextInt(input) + 1;
        System.out.println("zhe random number is :" + number);
    }
}
