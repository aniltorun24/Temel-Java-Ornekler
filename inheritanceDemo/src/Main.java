public class Main {
    public static void main(String[] args) {
       KrediUI krediUI = new KrediUI();
       krediUI.krediHesapla(new OgretmenKrediManager());//metodu oluştururken basekredimanager tipinde bir veri atmıştık
        // fakat basekredimanager inherit edildiği için bu şekilde bir kullanım yapılabilir

    }
}