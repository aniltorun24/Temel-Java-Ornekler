public class products {
    public products(){
        //bu constructerdır ya böyle kullanılır ya da
    }
    public products(int id,String name,String discription,double price,int stockamount){
        //böylde de kullanılır
    }
    int id;
    private String name;
    private String discription;
    private double price;
    private int stockamount;
    private String renk;
    private String kod;

    public int getId(){
        return id;
        }
    public void setId(int id){
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockamount() {
        return stockamount;
    }

    public void setStockamount(int stockamount) {
        this.stockamount = stockamount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return this.name.substring(0,1)+id;
    }


    }

