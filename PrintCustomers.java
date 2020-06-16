import java.awt.List;
import java.util.ArrayList;

public class PrintCustomers {
	 //get the list of customers
	static ArrayList<Customer> customers = getCustomers();

    public static final void main(String[] args) {
       
        
        //let's print out all customers
        System.out.println("Printing all customers");
        customers.forEach(customer->System.out.println(customer));
        
        //let's print customers over the age of 25
        System.out.println("\nPrinting all customers over the age of 25");
        customers.forEach(customer -> {
            if (customer.getAge() > 25) {
                System.out.println(customer);
            }
        });
        
        System.out.println("\nPrinting all customers with a method reference");
        customers.forEach(System.out::println);
    }
    
    
    private static ArrayList<Customer> getCustomers() {
    	
    	ArrayList<Customer> customers = new ArrayList<>();
        
        customers.add(new Customer(1000l,"John","Smith",25));
        customers.add(new Customer(1001l,"Jane","Doe",36));
        customers.add(new Customer(1002l,"Jerry","Tyne",20));
        customers.add(new Customer(1003l,"Glenn","First",29));
        customers.add(new Customer(1004l,"Beth","Abbey",35));

        return customers;
    }
}