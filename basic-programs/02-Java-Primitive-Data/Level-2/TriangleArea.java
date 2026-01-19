import java.util.Scanner;
class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float base = sc.nextFloat();
        float height = sc.nextFloat();
        float areaCm = 0.5f * base * height;
        float areaIn = areaCm / (2.54f * 2.54f);
        System.out.println("Area in sq cm = " + areaCm);
        System.out.println("Area in sq inch = " + areaIn);
    }
}
