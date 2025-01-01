package TinhDaHinh;


// Truong hop 1  ==> OR
public class HocVien {
    public void a() {
        System.out.println("a cha");
    }
}

//public class SinhVien extends HocVien {
//    public void a() {
//        System.out.println("a con");
//    }
//}


// Truong hop 2 ==> OR
/*
public class HocVien() {
    void a() {
        System.out.println("a cha");
    }
}
public class SinhVien extends HocVien {
    void a() {
         System.out.println("a con");
     }
}
*/


// Truong hop 3 ==> K Co
/*
public class HocVien() {
    private void a() {
        System.out.println("a cha");
    }
}
public class SinhVien extends HocVien {
    public void a() {
        System.out.println("a con");
    }
}
 */

// Truong hop 4 ==> OR
/*
public class HocVien() {
    private void a() {
        System.out.println("a cha");
    }
}
public class SinhVien extends HocVien {
    protected void a() {
        System.out.println("a con");
    }
}
 */

//Truong hop 5 ==> K co
/*
public class HocVien() {
    public byte a() {
        System.out.println("a cha");
    }
}
public class SinhVien extends HocVien {
    public int a() {
        System.out.println("a con");
    }
}
 */

// Truong hop 6 ==> OR
/*
public class HocVien() {
    public Animal a() {
        System.out.println("a cha");
        return null;
    }
}
public class SinhVien extends HocVien {
    public Dog a() {
        System.out.println("a con");
        return null;
    }
}
 */

// Truong hop 7 ==> OL
/*
public class HocVien() {
    public void a() {
    }
}
public class SinhVien extends HocVien {
    public void a(int i) {
    }
}
 */

//Truong hop 8 ==> K CO
/*
public class HocVien() {
    public static void a() {
    }
}
public class SinhVien extends HocVien {
    public static void a() {
    }
}
 */

// Truong hop 9 ==> OL
/*
public class HocVien() {
    public  void a(int b, int c) {
        System.out.println(b + "" + c);
    }
}
public class SinhVien extends HocVien {
    public static void a(double d, int c) {
        System.out.println(d + "" + c);
    }
}
 */

//Truong hop 10 ==> KH CO
/*
public class HocVien() {
    public  void a(int b, int c) {
        System.out.println(b + "" + c);
    }
}
public class SinhVien extends HocVien {
    public static void b(double d, int c) {
        System.out.println(d + "" + c);
    }
}
 */




