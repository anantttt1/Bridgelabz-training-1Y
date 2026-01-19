import java.util.Scanner;
class SquareSide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float perimeter = sc.nextFloat();
        float side = perimeter / 4;
        System.out.println("Side of square = " + side);
    }
}
