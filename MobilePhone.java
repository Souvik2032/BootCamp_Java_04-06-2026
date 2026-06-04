package bankAccount;

public class MobilePhone {
    String Mobile_name;
    double price;
     
    public void Model1() {
        System.out.println("8 GB Ram + 512 GB Storage");
        price=price;
        System.out.println(price);
    }

    public void Model2() {
    	 System.out.println("16 GB Ram + 1 TB Storage");
         price=price+2000;
         System.out.println(price);
    }
    
    public static void main(String[] args) {
        MobilePhone obj = new MobilePhone();
        obj.Mobile_name = "MI";
        obj.price = 20000;

        obj.Model1();
        obj.Model2();

    }
}