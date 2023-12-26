import java.util.Scanner;

public class Kasir implements Login {
    String password = "Vatya0906";
    String captcha = "09bcV65r";
    String inputCaptcha;
    String inputPassword;

    //method login
    public void login(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Silahkan Anda Login Terlebih Dahulu");

        //Captcha
        System.out.println("Kode captcha = " + captcha);
        System.out.println("Masukkan captcha");
        inputCaptcha = scanner.next();

        while(!inputCaptcha.equalsIgnoreCase(captcha)){
            System.out.println("ANDA BUKAN MANUSIA\n");
            System.out.println("Masukkan captcha");
            inputCaptcha = scanner.next();
        }

        System.out.println("CAPTCHA BENAR, ANDA MANUSIA\n\n");

        //Password
        System.out.println("Masukkan Password");
        inputPassword = scanner.next();

        while(!inputPassword.equals(password)){
            System.out.println("PASSWORD SALAH\n");
            System.out.println("Masukkan password : ");
            inputPassword = scanner.next();
        }
        
        System.out.println("BERHASIL LOGIN\n\n");


    }
}
