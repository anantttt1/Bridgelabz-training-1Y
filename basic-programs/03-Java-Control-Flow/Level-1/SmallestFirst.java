import java.util.Scanner;

class SmallestFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a < b && a < c) {
            System.out.println("The first number is the smallest");
        } else {
            System.out.println("The first number is not the smallest");
        }
    }
}
