package ManegerMobile;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    static ArrayList<Mobile> mobiles = new ArrayList<>();
    static ArrayList<DienThoaiCu> oldPhonesList = new ArrayList<>();
    static ArrayList<DienThoaiMoi> newPhonesList = new ArrayList<>();

    static {
        oldPhonesList.add(new DienThoaiCu("cu1", "Iphone 12", 7000000.0, "Apple", 10, 95, "tot"));
        oldPhonesList.add(new DienThoaiCu("cu2", "Iphone 13 ", 14000000.0, "Apple", 10, 90, "tot"));
        newPhonesList.add(new DienThoaiMoi("moi3", "Iphone 14", 18000000.0, "Apple", 10, 25));
        newPhonesList.add(new DienThoaiMoi("moi4", "Iphone 15 ", 2400000.0, "Apple", 10, 12));
    }

    public static void main(String[] args) {
        int choose;
        do {
            System.out.println("=============MENU=============");
            System.out.println("1. Xem danh sách điện thoại");
            System.out.println("2. Thêm mới");
            System.out.println("3. Cập nhật");
            System.out.println("4. Xóa");
            System.out.println("5. Xắp xếp theo giá");
            System.out.println("6. Tìm kiếm");
            System.out.println("7. Tính tổng tiền");
            System.out.println("8. Giảm giá cho điện thoại cũ");
            System.out.println("9. Thoát");
            System.out.println("=========================================");

            System.out.print("Chọn chức năng mong muốn: ");
            choose = Integer.parseInt(sc.nextLine());
            if (choose < 1 || choose > 9) {
                System.out.println("Không có chức năng đó, vui lòng nhập lại");
                continue;
            }

            switch (choose) {
                case 1:
                    showList();
                    break;
                case 2:
                    addPhone();
                    break;
                case 3:
                    updatePhone();
                    break;
                case 4:
                    deletePhone();
                    break;
                case 5:
                    sorth();
                    break;
                case 6:
                    search();
                    break;
                case 7:
                    System.out.println("Tổng gía của tất cả điện thoại: " + calculateTotalPriceInStore());
                    break;
                case 8:
                    System.out.println("Phần trăm muốn giảm giá: ");
                    double percentDiscount = Double.parseDouble(sc.nextLine());
                    applyDiscountTotalDienThoaiCu(percentDiscount);
                    System.out.println("Đã giảm giá thành công ^.^");
                    break;
                case 9:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại ^.^ ");
            }
        } while (choose < 1 || choose > 5);
    }

    public static void showList() {
        while (true) {
            int choose;
            do {
                System.out.println("=============DANH SÁCH ĐIỆN THOẠI=============");
                System.out.println("1. Xem tất cả");
                System.out.println("2. Xem điện thoại cũ");
                System.out.println("3. Xem điện thoại mới");
                System.out.println("4. Trở về menu chính");

                System.out.print("Mời bạn lựa chọn: ");
                choose = Integer.parseInt(sc.nextLine());

                switch (choose) {
                    case 1:
                        System.out.println("=======Danh sách tất cả điện thoại=======");
                        for (int i = 0; i < oldPhonesList.size(); i++) {
                            System.out.println("===Thông tin điện thoại thứ " + (i + 1));
                            oldPhonesList.get(i).output();
                        }
                        for (int i = 0; i < newPhonesList.size(); i++) {
                            System.out.println("===Thông tin điện thoại thứ " + (i + 1 + oldPhonesList.size()));
                            newPhonesList.get(i).output();
                        }
                        break;
                    case 2:
                        System.out.println("=======Danh sách điện thoại cũ=======");
                        for (int i = 0; i < oldPhonesList.size(); i++) {
                            System.out.println("===Thông tin điện thoại thứ " + (i + 1));
                            oldPhonesList.get(i).output();
                        }
                        break;
                    case 3:
                        System.out.println("======= Danh sách điện thoại mới =======");
                        for (int i = 0; i < newPhonesList.size(); i++) {
                            System.out.println("===Thông tin điện thoại thứ " + (i + 1));
                            newPhonesList.get(i).output();
                        }
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Không có chức năng đó, vui lòng nhập lại !!!!!!");
                }
            } while (choose < 1 || choose > 4);
        }
    }

    public static void addPhone() {
        while (true) {
            int choose;
            do {
                System.out.println("=============THÊM MỚI ĐIỆN THOẠI=============");
                System.out.println("1. Thêm mới điện thoại mới");
                System.out.println("2. Thêm mới điện thoại cũ");
                System.out.println("3. Trở về menu chính");

                System.out.print("Mời bạn lựa chọn: ");
                choose = Integer.parseInt(sc.nextLine());

                switch (choose) {
                    case 1:
                        DienThoaiMoi newPhones = new DienThoaiMoi();
                        newPhones.setId(Main.getNewPhoneId());
                        newPhones.input();
                        newPhonesList.add(newPhones);
                        break;
                    case 2:
                        DienThoaiCu oldPhones = new DienThoaiCu();
                        oldPhones.setId(Main.getOldPhoneId());
                        oldPhones.input();
                        oldPhonesList.add(oldPhones);
                        break;
                    case 3:
                        return;
                    default:
                        System.out.println("Không có chức năng đó, vui lòng nhập lại ");
                }
            } while (choose < 1 || choose > 3);
        }
    }

    public static String getNewPhoneId() {
        if (newPhonesList.isEmpty()) {
            return "moi3";
        }

        String lastId = newPhonesList.get(newPhonesList.size() - 1).getId();
        int numberPart = Integer.parseInt(lastId.substring(3));
        numberPart++;

        return String.format("moi%03d", numberPart);
    }

    public static String getOldPhoneId() {
        if (oldPhonesList.isEmpty()) {
            return "cu1";
        }

        String lastId = oldPhonesList.get(oldPhonesList.size() - 1).getId();
        int numberPart = Integer.parseInt(lastId.substring(3));
        numberPart++;

        return String.format("cu%03d", numberPart);
    }

    public static void updatePhone() {
        System.out.println("============UPDATE PHONE==========");
        System.out.println("Nhập vào mã điện thoại: ");
        String idPhone = sc.nextLine();
        if (idPhone.startsWith("DTC")) {
            for (DienThoaiCu oldPhone : oldPhonesList) {
                if (oldPhone.getId().equals(idPhone)) {
                    oldPhone.input();
                    System.out.println("Cập nhật thành công");
                } else {
                    System.out.println("Không tìm thấy mã");
                }
            }
        } else if (idPhone.startsWith("DTM")) {
            for (DienThoaiMoi newPhone : newPhonesList) {
                if (newPhone.getId().equals(idPhone)) {
                    newPhone.input();
                    System.out.println("Cập nhật thành công ");
                } else {
                    System.out.println("Không tìm thấy mã");
                }
            }
        } else {
            System.out.println("Mã không hợp lệ ");
        }
    }

    public static void deletePhone() {
        System.out.println("=============DELETE PHONE============");
        System.out.println("Nhập vào mã điện thoại: ");
        String idPhone = sc.nextLine();
        if (idPhone.startsWith("DTC")) {
            for (DienThoaiCu oldPhone : oldPhonesList) {
                if (oldPhone.getId().equals(idPhone)) {
                    oldPhonesList.remove(oldPhone);
                    System.out.println("Xóa thành công ");
                } else {
                    System.out.println("Không tìm thấy mã");
                }
            }
        } else if (idPhone.startsWith("DTM")) {
            for (DienThoaiMoi newPhone : newPhonesList) {
                if (newPhone.getId().equals(idPhone)) {
                    newPhonesList.remove(newPhone);
                    System.out.println("Xóa thành công ");
                } else {
                    System.out.println("Không tìm thấy mã");
                }
            }
        } else {
            System.out.println("Mã không hợp lệ ");
        }
    }

    public static void sorth() {
        while (true) {
            int choose;
            do {
                System.out.println("=============XẮP XẾP ĐIỆN THOẠI THEO GIÁ=============");
                System.out.println("1. TĂNG DẦN");
                System.out.println("2. GIẢM DẦN");
                System.out.println("3. Trở về menu chính");

                System.out.print("Mời bạn lựa chọn: ");
                choose = Integer.parseInt(sc.nextLine());

                switch (choose) {
                    case 1:
                        for (int i = 0; i < oldPhonesList.size(); i++) {
                            for (int j = i + 1; j < oldPhonesList.size(); j++) {
                                if (oldPhonesList.get(i).getGiaBan() > oldPhonesList.get(j).getGiaBan()) {
                                    DienThoaiCu temp = oldPhonesList.get(i);
                                    oldPhonesList.set(i, oldPhonesList.get(j));
                                    oldPhonesList.set(j, temp);
                                }
                            }
                        }
                        break;
                    case 2:
                        for (int i = 0; i < oldPhonesList.size(); i++) {
                            for (int j = i + 1; j < oldPhonesList.size(); j++) {
                                if (oldPhonesList.get(i).getGiaBan() < oldPhonesList.get(j).getGiaBan()) {
                                    DienThoaiCu temp = oldPhonesList.get(i);
                                    oldPhonesList.set(i, oldPhonesList.get(j));
                                    oldPhonesList.set(j, temp);
                                }
                            }
                        }
                        break;
                    case 3:
                        for (int i = 0; i < newPhonesList.size(); i++) {
                            for (int j = i + 1; j < newPhonesList.size(); j++) {
                                if (newPhonesList.get(i).getGiaBan() > newPhonesList.get(j).getGiaBan()) {
                                    DienThoaiMoi temp1 = newPhonesList.get(i);
                                    newPhonesList.set(i, newPhonesList.get(j));
                                    newPhonesList.set(j, temp1);
                                }
                            }
                        }
                        break;
                    case 4:
                        for (int i = 0; i < newPhonesList.size(); i++) {
                            for (int j = i + 1; j < newPhonesList.size(); j++) {
                                if (newPhonesList.get(i).getGiaBan() < newPhonesList.get(j).getGiaBan()) {
                                    DienThoaiMoi temp1 = newPhonesList.get(i);
                                    newPhonesList.set(i, newPhonesList.get(j));
                                    newPhonesList.set(j, temp1);
                                }
                            }
                        }
                        break;
                    case 5:
                        return;
                    default:
                        System.out.println("Không có chức năng đó, vui lòng nhập lại ");
                }
            } while (choose < 1 || choose > 3);
        }
    }

    public static void search() {
        int choose;
        while (true) {
            do {
                System.out.println("=== Tìm kiếm điện thoại của bạn ===");
                System.out.println("1. TÌm kiếm tát cả điện thoại ");
                System.out.println("2. Tìm kiếm điện thoại cũ");
                System.out.println("3. Tìm kiếm điện thoại mới");
                System.out.println("4. Trả về menu chính");
                System.out.println("Moi bạn lựa chọn");
                choose = Integer.parseInt(sc.nextLine());
                switch (choose) {
                    case 1:
                        searchAllPhone();
                        break;
                    case 2:
                        searchOldPhone();
                        break;
                    case 3:
                        searchNewPhone();
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại");
                }
            } while (choose < 1 || choose > 4);
        }
    }

    public static void searchAllPhone() {
        int choose;
        while (true) {
            do {
                System.out.println("=== TÌm kiếm theo tất cả điện thoại ===");
                System.out.println("1. Tìm kiếm theo giá");
                System.out.println("2. TÌm kiếm theo tên");
                System.out.println("3. TÌm kiếm theo hãng");
                System.out.println("4. TÌm kiếm theo độ bán chạy");
                System.out.println("5. Trở về ");

                System.out.println("Mời bạn chọn ");
                choose = Integer.parseInt(sc.nextLine());

                switch (choose) {
                    case 1:
                        System.out.println("MỜi bạn nhập vào giá bạn muốn tìm: ");
                        System.out.println("Nhập vào giá từ: ");
                        int giaTu = Integer.parseInt(sc.nextLine());

                        System.out.println("Mời bạn nhập giá đến: ");
                        int giaDen = Integer.parseInt(sc.nextLine());
                        int dem = 1;
                        for (Mobile mobile: mobiles) {
                            if(mobile.getGiaBan() >= giaTu && mobile.getGiaBan() <= giaDen ) {
                                System.out.println("Thong tin dien thoai thứ: " + dem++);
                                mobile.output();
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Nhập vào tên điện thoại bạn cần tìm: ");
                        String nameDT = sc.nextLine();
                        dem = 1;
                        for (Mobile mobile: mobiles) {
                            if(mobile.getTenDienThoai().contains(nameDT)) {
                                System.out.println("Thông tin điện thoại thứ: " + dem++);
                                mobile.output();
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Nhập vào hãng điện thoại bạn muốn tìm: ");
                        String tenHang = sc.nextLine();
                        dem = 1;
                        for (Mobile mobile: mobiles) {
                            if(mobile.getHangSX().contains(tenHang)) {
                                System.out.println("Thông tin điện thoại từ: " + dem++);
                                mobile.output();
                            }
                        }
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp nhé nhé ^^, vui lòng chọn lại !");
                }
            } while (choose < 1 || choose > 4);
        }
    }

    public static void searchOldPhone() {
        int choose;
        while (true) {
            do {
                System.out.println("=== TÌm kiếm điện thoại cũ ===");
                System.out.println("1. Tìm kiếm theo giá");
                System.out.println("2. TÌm kiếm theo tên");
                System.out.println("3. TÌm kiếm theo hãng");
                System.out.println("4. TÌm kiếm theo độ bán chạy");
                System.out.println("5. Trở về ");

                System.out.println("Mời bạn chọn ");
                choose = Integer.parseInt(sc.nextLine());

                switch (choose) {
                    case 1:
                        System.out.println("Mời bạn nhập vào khoảng giá muốn tìm: ");
                        System.out.println("Nhập vào giá tu: ");
                        int giaTu = Integer.parseInt(sc.nextLine());

                        System.out.println("Nhập vào giá đến: ");
                        int giaDen = Integer.parseInt(sc.nextLine());
                        int dem = 1;
                        for (DienThoaiCu dienThoaiCu : oldPhonesList) {
                            if(dienThoaiCu.getGiaBan() >= giaTu && dienThoaiCu.getGiaBan() <= giaDen ) {
                                System.out.println("Thông tin điện thoại thứ: " + dem++);
                                dienThoaiCu.output();
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Nhập vào tên cần tìm: ");
                        String nameDT = sc.nextLine();
                        dem = 1;
                        for(DienThoaiCu dienThoaiCu : oldPhonesList) {
                            if(dienThoaiCu.getTenDienThoai().contains(nameDT)) {
                                System.out.println("Thông tin điện thoại thứ: " + dem++);
                                dienThoaiCu.output();
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Nhập vào hãng điện thoại cần tìm: ");
                        String tenHang = sc.nextLine();
                        dem = 1;

                        for(DienThoaiCu dienThoaiCu : oldPhonesList) {
                            if(dienThoaiCu.getHangSX().contains(tenHang)) {
                                System.out.println("Thông tin điện thoại thứ: " + dem++);
                                dienThoaiCu.output();
                            }
                        }
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp nhé nhé ^^, vui lòng chọn lại !");
                }
            } while (choose < 1 || choose > 4);
        }
    }

    public static void searchNewPhone() {
        int choose;
        while (true) {
            do {
                System.out.println("=== TÌm kiếm điện thoại mới ===");
                System.out.println("1. Tìm kiếm theo giá");
                System.out.println("2. TÌm kiếm theo tên");
                System.out.println("3. TÌm kiếm theo hãng");
                System.out.println("4. TÌm kiếm theo độ bán chạy");
                System.out.println("5. Trở về ");

                System.out.println("Mời bạn chọn ");
                choose = Integer.parseInt(sc.nextLine());

                switch (choose) {
                    case 1:
                        System.out.println("Mời bạn nhập vào khoảng giá muốn tìm: ");
                        System.out.println("Nhập vào giá tu: ");
                        int giaTu = Integer.parseInt(sc.nextLine());

                        System.out.println("Nhập vào giá đến: ");
                        int giaDen = Integer.parseInt(sc.nextLine());
                        int dem = 1;
                        for (DienThoaiMoi dienThoaiMoi : newPhonesList) {
                            if(dienThoaiMoi.getGiaBan() >= giaTu && dienThoaiMoi.getGiaBan() <= giaDen ) {
                                System.out.println("Thông tin điện thoại thứ: " + dem++);
                                dienThoaiMoi.output();
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Nhập vào tên cần tìm: ");
                        String nameDT = sc.nextLine();
                        dem = 1;
                        for(DienThoaiMoi dienThoaiMoi : newPhonesList) {
                            if(dienThoaiMoi.getTenDienThoai().contains(nameDT)) {
                                System.out.println("Thông tin điện thoại thứ: " + dem++);
                                dienThoaiMoi.output();
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Nhập vào hãng điện thoại cần tìm: ");
                        String tenHang = sc.nextLine();
                        dem = 1;

                        for(DienThoaiMoi dienThoaiMoi : newPhonesList) {
                            if(dienThoaiMoi.getHangSX().contains(tenHang)) {
                                System.out.println("Thông tin điện thoại thứ: " + dem++);
                                dienThoaiMoi.output();
                            }
                        }
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp nhé nhé ^^, vui lòng chọn lại !");
                }
            } while (choose < 1 || choose > 4);
        }
    }


    // tính tổng giá các điện thoại
    private static double calculateTotalPriceInStore() {
        double total = 0.0;
        for (Mobile mobile : mobiles) {
            total += mobile.calculateTotalPrice();
        }
        return total;
    }

    // giảm giá cho các điện thoại cũ
    public static void applyDiscountTotalDienThoaiCu(double percentDiscount) {
        for (Mobile mobile : mobiles) {
            if(mobile instanceof DienThoaiCu) {
                ((DienThoaiCu) mobile).applyDiscount(percentDiscount);
            }
        }
    }
}
