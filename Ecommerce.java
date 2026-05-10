
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

System.out.println(name+"\t"+price+"\t"+quantity+"\t"+(price*quantity));

}

}

public class Ecommerce{

public static void main(String[] args){

Scanner scanner=new Scanner(System.in);

char choice;
double grandTotal=0;

do{

try{

System.out.print("Enter product name: ");
String name=scanner.nextLine();

System.out.print("Enter product price: ");
double price=scanner.nextDouble();

System.out.print("Enter quantity: ");
int quantity=scanner.nextInt();

scanner.nextLine();

Product userProduct=new Product(name,price,quantity);

System.out.println("\nOrder Summary:");
System.out.println("Name\tPrice\tQuantity\tTotal");

userProduct.displayProduct();

grandTotal=grandTotal+userProduct.getTotalCost();

}

catch(Exception e){

System.out.println("Invalid Input");
scanner.nextLine();

}

System.out.print("Do you want to add another product(y/n): ");
choice=scanner.next().charAt(0);

scanner.nextLine();

}while(choice=='y'||choice=='Y');

double finalAmount=Product.applyDiscount(grandTotal);

System.out.println("\nTotal Cost Before Discount: "+grandTotal);

System.out.println("Final Price After Discount: "+finalAmount);

System.out.println("Thank you for shopping!");

scanner.close();

}

}

