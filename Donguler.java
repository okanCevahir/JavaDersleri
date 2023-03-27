import java.util.Scanner;

public class Donguler {
    public static void Foor(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi= sc.nextInt();
        int i;
        int result=1;

        for(i=1;i<=sayi;i++){
            result=result*i;

        }
        System.out.println(result);

    }
}
