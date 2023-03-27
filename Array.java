import java.util.ArrayList;

public class Array {
    public static  void  Arrays(){
        ArrayList<String> array = new ArrayList<String>();
        array.add("Trabzon");
        array.add("Rize");
        array.add("Samsun");
        array.remove(2);
        array.set(1,"Ankara");
        for (int i=0;i<array.size();i++){
          System.out.println(array.get(i));
        }
    }
}
