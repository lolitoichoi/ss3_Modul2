package ManegerMobile;

import java.util.ArrayList;
import java.util.Scanner;

public class XuLi extends Mobile {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<DienThoaiMoi> dtM = new ArrayList<>();
    static ArrayList<DienThoaiCu> dtC = new ArrayList<>();

    //1
    public static void showAll() {
        showDienThoaiMoi();
        showDienThoaiCu();
    }

    public static void showDienThoaiMoi() {
        System.out.println("Thong tin dien thoai moi");
        for(int i = 0; i < dtM.size(); i++) {
            dtM.get(i).output();
        }
    }

    public static void showDienThoaiCu() {
        System.out.println("Thong tin dien thoai cu");
        for(int i = 0; i < dtC.size(); i++) {
            dtC.get(i).output();
        }
    }

    // 2
    public static void addDienThoaiMoi() {
        DienThoaiMoi dtMoi = new DienThoaiMoi();
        dtMoi.input();
        dtM.add(dtMoi);
    }

    public static void addDienThoaiCu() {
        DienThoaiCu dtCu = new DienThoaiCu();
        dtCu.input();
        dtC.add(dtCu);
    }

    //
    public static void updateDienThoai() {
        System.out.print("Nhap ID can sua: ");
        String id=sc.nextLine();
        if(id.startsWith("DTM"))
        {
            for (int i = 0; i < dtM.size(); i++)
            {
                if(dtM.get(i).getId().equalsIgnoreCase(id))
                {
                    dtM.get(i).input();
                    break;
                }else {
                    System.out.println("ID khong hop le!");
                }
            }
        }else if (id.startsWith("DTC"))
        {
            for (int i = 0; i < dtC.size(); i++)
            {
                if(dtC.get(i).getId().equalsIgnoreCase(id))
                {
                    dtC.get(i).input();
                    break;
                }else {
                    System.out.println("ID khong hop le!");
                }
            }
        }else{
            System.out.println("ID khong hop le!");
        }
    }

    public static void remoteDienThoai()
    {
        System.out.print("Nhap ID can xoa: ");
        String id=sc.nextLine();
        if(id.startsWith("DTM"))
        {
            for (int i = 0; i < dtM.size(); i++)
            {
                if(dtM.get(i).getId().equalsIgnoreCase(id))
                {
                    System.out.print("Nhap 'Yes' de xoa: ");
                    if("yes".equalsIgnoreCase(sc.nextLine()))
                    {
                       System.out.println("Da xoa");
                        break;
                    }
                }else {
                    System.out.println("ID khong hop le!");
                }
            }
        }else if(id.startsWith("DTC"))
        {
            for (int i = 0; i < dtC.size(); i++)
            {
                if(dtC.get(i).getId().equalsIgnoreCase(id))
                {
                    System.out.print("Nhap 'Yes' de xoa: ");
                    if("yes".equalsIgnoreCase(sc.nextLine()))
                    {
                        dtC.remove(i);
                        System.out.println("Da xoa");
                        break;
                    }
                }else {
                    System.out.println("ID khong hop le!");
                }
            }
        }else{
            System.out.println("ID khong hop le!");
        }
    }

}
