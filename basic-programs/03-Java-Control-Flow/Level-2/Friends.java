import java.util.Scanner;

class Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int aAge = sc.nextInt();
        int bAge = sc.nextInt();
        int cAge = sc.nextInt();

        int minAge = Math.min(aAge, Math.min(bAge, cAge));
        System.out.println("Youngest age: " + minAge);

        int aH = sc.nextInt();
        int bH = sc.nextInt();
        int cH = sc.nextInt();

        int maxH = Math.max(aH, Math.max(bH, cH));
        System.out.println("Tallest height: " + maxH);
    }
}
