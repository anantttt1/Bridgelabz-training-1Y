package BuiltInFunction;
import java.time.*;
public class DataCompare {
    public static void main(String[] args) {
            LocalDate d1 = LocalDate.of(2024, 2, 1);
            LocalDate d2 = LocalDate.of(2024, 3, 1);

            if (d1.isBefore(d2))
                System.out.println("First date is before second");
            else if (d1.isAfter(d2))
                System.out.println("First date is after second");
            else
                System.out.println("Both dates are equal");
        }
    }


