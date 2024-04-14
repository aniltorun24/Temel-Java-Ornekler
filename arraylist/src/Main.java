import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       /* ArrayList arrayList= new ArrayList();
        arrayList.add(1);
        arrayList.add(10);
        arrayList.add("ankara");
        arrayList.set(2,100);
        arrayList.add(25);
        arrayList.add('c');
        //arrayList.remove(0);//verdiğimiz indexi siler
        //arrayList.clear();//bütün arrayi siler
        System.out.println(arrayList);*/
        ArrayList<Customer>customers=new ArrayList<Customer>();
        customers.add(new Customer(1,"anıl","torun"));
        customers.add(new Customer(2,"mustafa","demir"));
        customers.add(new Customer(3,"yusuf","aras"));
        customers.add(new Customer(4,"cihan","bilgin"));
        for(Customer customer:customers){
            System.out.println(customer.name);
        }

    }
}