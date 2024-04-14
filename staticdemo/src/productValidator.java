public class productValidator {
    public boolean isValid(product product){
        if (!product.name.isEmpty()&&product.price>10){
            System.out.println("ürün eklendi");
            return true;
        }
        else {
            System.out.println("ürün eklenemedi");
            return false;
        }
    }

}
