public class Products {
    public Products(int id,String name ,String description,double price,int stockAmount){//burada aşağıdaki kullanım olmadan da sadece yapıcı metod ile de yapılabileceğini gösterdim.iki kullanım da doğrudur.
        this.id=id;//burada verileri set etmiş oluyoruz.
        this.name=name;
        this.description=description;
        this.price=price;
        this.stockAmount=stockAmount;
    }
    public Products(){

    }
    private int id; //hiç bir şey yazımadı ise default olarak publictir.
    private String name;
    private String description;
    private double price;
    private int stockAmount;

    public int getId(){  //get metodu sadece okuma işlemleri için kullanılır.
        return id;
    }
    public void setId(int id){  //set metodu kullanıcı bir değişiklik yapacağı zaman kullanılır.
        this.id=id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }
}
