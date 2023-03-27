import java.util.Scanner;

public class ConsoleApp_1 {
   public static void Car(){
       Scanner sca=new Scanner(System.in);
       System.out.println("Aracınız kilometre başı ne kadar yakıyor: ");
       double price=sca.nextDouble();
       System.out.println("Aracınız kaç kilometre yol aldı: ");
       double km= sca.nextDouble();
       double result;
       result=price*km;
       System.out.println(result);
   }
}
