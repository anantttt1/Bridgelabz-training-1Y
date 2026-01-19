import java.util.Scanner;
class DistanceConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float feet = sc.nextFloat();
        float yards = feet / 3;
        float miles = yards / 1760;
        System.out.println("Distance in yards = " + yards);
        System.out.println("Distance in miles = " + miles);
    }
}
