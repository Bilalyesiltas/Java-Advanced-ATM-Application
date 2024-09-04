import java.util.Scanner;

public class ATM {

    public void calis(Hesap hesap) {
        Login login = new Login();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bankamıza Hoşgeldiniz!");
        
        System.out.println("*********************************");
        System.out.println("Kullanıcı girişini yapınız.");
        System.out.println("*********************************");
        
        int giris_hakki = 3;
        
        while (true) {
            if (login.login(hesap)) {
                System.out.println("Giriş başarılı. İşlemlerinize başlayabilirsiniz.");
                break; 
                
                
            } 
            
            else {
                System.out.println("Giriş başarısız. Tekrar deneyiniz.");
                giris_hakki -= 1;
                System.out.println("Kalan Giriş Hakkı: " + giris_hakki);
            }
            
            if (giris_hakki == 0) {
                System.out.println("Giriş Hakkınız Bitmiştir...");
                return; 
                
            }
        }
        
        
        System.out.println("***************************");
        String islemler = "1. Bakiye Görüntele\n"
                         +"2. Para Yatırma\n"
                         +"3. Para çekme\n"
                         +"Çıkış yapmak için q'ya basınız...";
        System.out.println(islemler);
        System.out.println("***************************");
        
        
        while (true){
            
            System.out.println("İşlemi Seçiniz: ");
            String islem = scanner.nextLine();
            
            if (islem.equals ("q")){
                break;
            }
            else if (islem.equals("1")){
                System.out.println("BAKİYENİZ: " + hesap.getBakiye());
            }
            
            else if (islem.equals("2")){
                System.out.println("Yatırmak İstediğiniz Tutar : " );
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraYatir(tutar);
                
                
            }
            else if (islem.equals("3")){
                System.out.println("Çekmek İstediğiniz Tutar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraCek(tutar);
                
                
            }
            else {
                System.out.println("Geçersiz İşlem...");
            }
            
        }
                
                            
    }
}
