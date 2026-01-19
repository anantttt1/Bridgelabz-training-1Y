import java.util.Scanner;
class AreaTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base = input.nextDouble();
        double height = input.nextDouble();
        double areaCm = 0.5 * base * height;
        double areaInch = areaCm / 6.4516;   // 1 sq inch = 6.4516 sq cm
        System.out.println(
            "Area of triangle in square centimeters is " + areaCm +
            " and in square inches is " + areaInch
        );
    }
}
