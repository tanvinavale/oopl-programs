import java.util.Scanner;

class Product{

String name;
double price;
int quantity;

// Constructor 1
Product(){
name="Unknown";
price=0.0;
quantity=0;
}

// Constructor 2
Product(String name,double price){
this.name=name;
this.price=price;
quantity=1;
}

// Constructor 3
Product(String name,double price,int quantity){
this.name=name;
this.price=price;
this.quantity=quantity;
}

double getTotalCost(){
return price*quantity;
}

// Discount Method
static double applyDiscount(double total){

if(total>1500)
return total-total*0.25;

else if(total>1000)
return total-total*0.20;

else if(total>500)
return total-total*0.15;

else
return total;
}

// Display Product
void displayProduct(){

System.out.printf("%-15s %-15s %-15s %-15s\n",
name,price,quantity,(price*quantity));

}

}

public class Ecommerce{

public static void main(String[] args){

Scanner scanner=new Scanner(System.in);

// User input
System.out.print("Enter product name: ");
String name=scanner.nextLine();

System.out.print("Enter product price: ");
double price=scanner.nextDouble();

System.out.print("Enter quantity: ");
int quantity=scanner.nextInt();

Product userProduct=new Product(name,price,quantity);

// Order Summary
System.out.println("\nOrder Summary:");

System.out.printf("%-15s %-15s %-15s %-15s\n",
"Name","Price","Quantity","Total");

userProduct.displayProduct();

// Total and Discount
double totalCost=userProduct.getTotalCost();

double finalAmount=Product.applyDiscount(totalCost);

System.out.println("\nTotal Cost Before Discount: "+totalCost);

System.out.println("Final Price After Discount: "+finalAmount);

System.out.println("Thank you for shopping!");

scanner.close();

}

}