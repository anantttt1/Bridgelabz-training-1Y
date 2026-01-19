import java.util.Scanner;
class DistanceConvert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double distanceInFeet = input.nextDouble();
        double yards = distanceInFeet / 3;
        double miles = yards / 1760;
        System.out.println(
            "Distance in yards is " + yards +
            " and distance in miles is " + miles
        );
    }
}
