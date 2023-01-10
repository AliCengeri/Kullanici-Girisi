import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ad, pass;
        System.out.print("Kullanıcı adınız giriniz: ");
        ad = input.nextLine();
        System.out.print("Şifreyi Giriniz: ");
        pass = input.nextLine();
        if (ad.equals("Ali") && pass.equals("956")) {
            System.out.println("Başarıyla giriş yaptınız.");
        } else {
            System.out.println("Bilgileriniz yanlış.");
            System.out.println("Şifrenizi değiştirmek ister misiniz?\nEvet\nHayır");
            String ynl;
            ynl = input.nextLine();
            if (ynl.equals("Evet")) {
                String pass2;
                System.out.print("Yeni Şifreyi Giriniz: ");
                pass2 = input.nextLine();
                if (pass2.equals(pass) || pass2.equals("956")) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu.");
                }
            }
        }
    }
}
