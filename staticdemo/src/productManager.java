public class productManager {
    public void add(product product){
        productValidator valiator =new productValidator();
        if(valiator.isValid(product)){
            System.out.println("eklendi");
        }
        else {
            System.out.println("ürün bilgileri geçersiz");
        }
    }
}
