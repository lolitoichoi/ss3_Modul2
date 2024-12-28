package Static_ls3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateUntil {
    private final static DateTimeFormatter dateFormatter_dd = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private final static DateTimeFormatter dateFormatter_yyyy = DateTimeFormatter.ofPattern("yyyy/MM/dd");

    // chuyen doi chuoi dd/mm/yyyy sang local date
    public static LocalDate fromString_dd(String day) {
        return LocalDate.parse(day, dateFormatter_dd);
    }

    // chuyen doi chuoi "yyyy-MM-dd" sang local date
    public static LocalDate fromString_yyyy(String day) {
        return LocalDate.parse(day, dateFormatter_yyyy);
    }

    // phuong thuc chuyen doi localdate sang chuoi
    public static String toString_dd(LocalDate localDate) {
        return localDate.format(dateFormatter_dd);
    }
    public static String toString_yyyy(LocalDate localDate) {
        return localDate.format(dateFormatter_yyyy);
    }
}
