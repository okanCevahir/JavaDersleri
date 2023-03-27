import java.util.Scanner;

public class Scaner {
    public static void Sca(){
        Scanner sca=new Scanner(System.in);
        System.out.println("Yaş gir: ");
        int yas=sca.nextInt();
        sca.nextLine();
        String ad=sca.nextLine();
        System.out.println("yaşınız: "+yas);
        System.out.println(ad);
    }
}
