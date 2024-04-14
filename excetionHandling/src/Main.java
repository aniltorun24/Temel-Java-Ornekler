// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        try {//try bloğu içindeki kod çalışır.eğer kodda bir hata varsa catch bloğu içindeki kod çalışır.
            int[] sayilar = new int[]{1, 2, 3};
            System.out.println(sayilar[5]);
        }
        catch (Exception exception){
            System.out.println("Hata oluştu");
        }finally {
            System.out.println("Ben her türlü çalışırım");

        }
        }
    }
