// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
Products products=new Products(1,"laptop","asus laptop",5000,3);
//Products products = new Products();
//products.setId(1);;
//products.setName("laptop");
//products.setDescription("asus laptop");
//products.setPrice(5000);
//products.setStockAmount(3);


ProductManager productManager=new ProductManager();
productManager.Add(products);
    }
}