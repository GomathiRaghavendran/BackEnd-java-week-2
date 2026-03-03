package projects;

public class ShoppingCart {

    public static void main(String[] args) {


        Product[] p1 = new Product[5];
        p1[0] = new Product("Handbags", 15.32, 2);
        p1[1] = new Product("shoes", 60.99, 3);
        p1[2] = new Product("Jacket", 45.60, 4);
        p1[3] = new Product("Hats", 5.00, 5);
        p1[4] = new Product("Shocks", 3.00, 10);

        for (Product pd : p1) {
            pd.calculateTotal();
            pd.printBill();
        }
    }
}

/**class Product {


    String[] name = {"Handbags", "shoes", "Jacket", "hats", "shocks"};
    double[] price = {15.32, 60.99, 45.60, 5.00, 3.00};
    int[] numberOfItems = {2, 3, 4, 5, 10};

    double total[]=new double[name.length];


    public double calculateTotal() {
        double grandTotal = 0;
        for(int i=0;i<name.length;i++){
            total[i]=price[i]*numberOfItems[i];
            grandTotal =grandTotal+ total[i];
        }
        return grandTotal;
    }

    public void printBill(){
        for(int i=0;i<name.length;i++) {
            System.out.println(name[i] +" X "+price[i] +" is: "+ total[i]);
        }
    }*/



class Product{

    String name;
    double price;
    int quantity;
    double grandTotal=0;

    public Product(String name,double price,int quantity){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }

    public double calculateTotal(){
           double total=price*quantity;
            grandTotal =grandTotal+ total;
            return grandTotal;

    }
    public void printBill() {
        System.out.println(name + " X " + price + " is: " + grandTotal);

    }
}

