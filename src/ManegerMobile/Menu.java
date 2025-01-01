package ManegerMobile;

import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);
    int luaChon;
    public void menu() {
        while (true) {
            do {
                System.out.println("==Chuong trinh quan li dien thoai==");
                System.out.println("1. Xem danh sach dien thoai");
                System.out.println("2. Them moi");
                System.out.println("3. Cap nhat");
                System.out.println("4. Xoa");
                System.out.println("5. Sap xep theo gia");
                System.out.println("6. Tim kiem");
                System.out.println("7. Tinh tong tien");
                System.out.println("8. Giam gia cho dien thoai cu");
                System.out.println("9. Thoat");
                System.out.println("Moi ban nhap lua chon");
                luaChon = Integer.parseInt(sc.nextLine());
                switch (luaChon) {
                    case 1:
                        showList();
                        break;
                    case 2:
                        addPhone();
                        break;
                    case 3:
                        updateDienThoai();
                        break;
                    case 4:
                        remoteDienThoai();
                    case 5:
                        sortPrice();
                        break;
                    case 6:
                        findPhone();
                        break;
                    case 7:
                        sumPrice();
                        break;
                    case 8:
                        discountPhoneOld();
                        break;
                    case 9:
                        return;
                    default:
                        System.out.println("Lua chon khong hop le! Nhap lai.");
                }
            } while (luaChon < 1 || luaChon > 9);
        }
    }

    private void showList() {
        while (true) {
            System.out.println("========1=========");
            System.out.println("1. Xem tat ca");
            System.out.println("2. Xem dien thoai cu");
            System.out.println("3. Xem dien thoai moi");
            System.out.println("4. Tro ve");
            System.out.println("nhap lua chon cua ban");
            luaChon = sc.nextInt();
            luaChon = Integer.parseInt(sc.nextLine());
            switch (luaChon) {
                case 1:
                    XuLi.showAll();
                    break;
                case 2:
                    XuLi.addDienThoaiCu();
                    break;
                case 3:
                    XuLi.addDienThoaiMoi();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Lua chon khong hop le! Nhap lai.");
            }
        }
    }
    private void addPhone() {
        while(true) {
            System.out.println("===== 2 =====");
            System.out.println("1. Them moi dien thoai moi.");
            System.out.println("2. Them moi dien thoai cu.");
            System.out.println("3. Tro ve.");
            System.out.print("Nhap lua chon: ");
            luaChon = Integer.parseInt(sc.nextLine());
            switch (luaChon) {
                case 1:
                    XuLi.addDienThoaiMoi();
                    break;
                case 2:
                    XuLi.addDienThoaiCu();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Lua chon khong hop le! Nhap lai.");
            }
        }
    }

    private void updateDienThoai() {
        XuLi.updateDienThoai();
    }

    private void remoteDienThoai() {
        XuLi.remoteDienThoai();
    }
    private void sortPrice() {
        while (true) {
            System.out.println("===== 5 =====");
            System.out.println("1. Tang dan.");
            System.out.println("2. Giam dan.");
            System.out.println("3. Tro ve");
            System.out.print("Nhap lua chon: ");
            luaChon = Integer.parseInt(sc.nextLine());
            switch (luaChon) {
                case 1:
                case 2:
                case 3:
                    return;
                default:
                    System.out.println("Lua chon khong hop le! Nhap lai.");
            }
        }
    }
    private void findPhone() {
        while (true) {
            do {
                System.out.println("===== 6 =====");
                System.out.println("1. Tim kiem tat ca dien thoai.");
                System.out.println("2. Tim kiem dien thoai cu.");
                System.out.println("3. Tim kiem dien thoai moi.");
                System.out.println("4. Tro ve");
                System.out.print("Nhap lua chon: ");
                luaChon = Integer.parseInt(sc.nextLine());
                switch (luaChon)
                {
                    case 1:
                        menuFindPhone();
                        break;
                    case 2:
                        menuFindPhone();
                        break;
                    case 3:
                        menuFindPhone();
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Lua chon khong hop le! Nhap lai.");
                }
            }while (luaChon<1 || luaChon>4);
        }
    }

    private void menuFindPhone() {
        while (true) {
            System.out.println("=======================");
            System.out.println("1. Tim kiem theo gia.");
            System.out.println("2. Tim kiem theo ten.");
            System.out.println("3. Tim kiem theo hang.");
            System.out.println("4. Tro ve");
            System.out.print("Nhap lua chon: ");
            luaChon = Integer.parseInt(sc.nextLine());
            switch (luaChon)
            {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Lua chon khong hop le! Nhap lai.");
            }
        }
    }

    private void sumPrice() {

    }

    private void discountPhoneOld() {
    }
}

























