import java.util.Scanner;
class TotalPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float unitPrice = sc.nextFloat();
        int quantity = sc.nextInt();
        float total = unitPrice * quantity;
        System.out.println("Total price = INR " + total);
    }
}
