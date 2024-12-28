package Static_ls3;

import java.time.LocalDate;

public class QuanLi_LocalDateUntil {
    public static void main(String[] args) {

        String dateString1 = "13/06/2003";
        String dateString2 = "2003/06/13";
        //chuyen doi chuoi thanh localdate
        LocalDate localDate1 = LocalDateUntil.fromString_dd(dateString1);
        LocalDate localDate2 = LocalDateUntil.fromString_yyyy(dateString2);

        System.out.println("Localdate tu chuoi dd/MM/yyyy: " + LocalDateUntil.toString_dd(localDate1));
        System.out.println("Localdate tu chuoi yyyy/MM/dd: " + localDate2);

        // chuyen doi local date thanh chuoi

        LocalDate currentDate = LocalDate.now();

        String formatterDate1 = LocalDateUntil.toString_dd(currentDate);
        String formatterDate2 = LocalDateUntil.toString_yyyy(currentDate);

        System.out.println("formatterDate1 dd/MM/yyyy : " + formatterDate1);
        System.out.println("formatterDate2yyyy/MM/dd : " + formatterDate2);
    }
}
