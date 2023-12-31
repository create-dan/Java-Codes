
import java.util.ArrayList;
import java.util.List;

//product class
class Product{
   
   private String name;
   private double price;
   private String description;
   
   public Product(String name , double price , String description){
    this.name = name;
    this.price = price;
    this.description = description;
   }

   @Override
   public String toString(){
  return "Product{name='" + name + "', price=" + price + ", description='" + description + "'}";

   }

}

//customer class
class Customer{
    private String name;
    private String email;
    private List<Order> orderHistory;

    public Customer(String name , String email){
        this.name = name;
        this.email = email;
        this.orderHistory = new ArrayList<>();
    }

   public void addToOrderHistoy(Order order){
        orderHistory.add(order);
    }

    public void viewOrderHistory(){
        System.out.println("Order History for customer " + name + ":");

        for(Order order : orderHistory){
            System.out.println(order);
        }
    }

}


//order class
class Order{
    private List<Product> products;
    private String status;

   public Order(){
    this.products = new ArrayList<>();
    this.status = "Pending";
   }

   public void addProduct(Product product){
    products.add(product);
   }

   public void placeOrder(){
    status = "Placed";
   }

   @Override
   public String toString(){
    return "Order{products=" + products + ", status='" + status + "'}";
   }


}
                    
                
public class EcommerceSystem {
    public static void main(String[] args) {

        //create product
        Product laptop = new Product("Laptop",1000,"Dell Laptop");
        Product tv = new Product("TV",999,"TV");


        //create customer
        Customer dnyaneshwar = new Customer("Dnyaneshwar","dnyan@gmail.com");

        //create order
        Order order = new Order();
        order.addProduct(laptop);
        order.addProduct(tv);

        order.placeOrder();

        dnyaneshwar.addToOrderHistoy(order);
        dnyaneshwar.viewOrderHistory();

        
    }
}