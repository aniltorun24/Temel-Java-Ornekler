import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String>sozluk=new HashMap<String,String>();
        sozluk.put("table","masa");
        sozluk.put("book","kitap");
        sozluk.put("computer","bilgisayar");
        for (String item : sozluk.keySet());
        System.out.println(sozluk.get(item));


    }
}