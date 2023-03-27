import java.util.LinkedList;
import java.util.ListIterator;

public class Linedlist {
    public static void Linkeds(){
        LinkedList<String> link = new LinkedList<String>();
        link.add("Trabzon");
        link.add("Rize");
        link.add("Ordu");
        link.add("Tekirdağ");
        link.add("Tunceli");
        link.add("Tokat");
        link.add("Samsun");
        Yazdir(link);
        Yazdir2(link);
    }
    public static void Yazdir(LinkedList<String> link){
        for(int i=0;i< link.size();i++){
            System.out.println(link.get(i));
        }

        System.out.println("******************************");
    }

    public static void Yazdir2(LinkedList<String> link){
        ListIterator<String> ite = link.listIterator();
        while (ite.hasNext()){
            System.out.println(ite.next());
        }


    }
}
