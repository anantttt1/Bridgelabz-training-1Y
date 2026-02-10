package BuiltInFunction;
import java.time.*;
public class DataArthematic {
        public static void main(String[] args) {
            LocalDate date = LocalDate.now();
            LocalDate result = date.plusDays(7)
                    .plusMonths(1)
                    .plusYears(2)
                    .minusWeeks(3);
            System.out.println(result);
        }
    }


