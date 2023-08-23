import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number:");
        int number = sc.nextInt();

        for (int i = 1; i < number; i++) {
            if (i * i == number) {
                System.out.println(i + "is" + number + "/'s 平方根");
                break;
            } else if (i * i >number) {
                System.out.println((i - 1) + "is" + number + "/'s 平方根");
                break;
            }
        }
    }
}