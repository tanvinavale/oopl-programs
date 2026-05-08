
import java.util.Scanner;

class Book{

String Name;
boolean isIssued;
static int totalbooks=0;

Book(String Name){

this.Name=Name;
this.isIssued=false;
totalbooks++;

}

void issueBook(){

if(!isIssued){

isIssued=true;
System.out.println("Book "+Name+" has been issued");

}

else{

System.out.println("Book "+Name+" is already issued");

}

}

void returnBook(){

if(isIssued){

isIssued=false;
System.out.println("Book "+Name+" has been returned");

}

else{

System.out.println("Book "+Name+" was not issued");

}

}

void displayBook(){

System.out.println(Name+" | "+(isIssued?"Issued":"Available"));

}

static void displaytotalBooks(){

System.out.println("Total available books: "+totalbooks);

}

}

public class Library{

public static void main(String[] args){

Scanner sc=new Scanner(System.in);

Book[] Library=new Book[5];

int count=0;

while(true){

System.out.println("\nLibrary Management System");
System.out.println("1-Add Book");
System.out.println("2-Issue Book");
System.out.println("3-Return Book");
System.out.println("4-View Books");
System.out.println("5-Check Total Books");
System.out.println("6-Exit");

System.out.println("Enter your choice:");

int choice=sc.nextInt();

sc.nextLine();

switch(choice){

case 1:

if(count<5){

System.out.println("Enter Book name:");

String Name=sc.nextLine();

Library[count]=new Book(Name);

count++;

System.out.println("Book added successfully");

}

else{

System.out.println("Library is full");

}

break;

case 2:

System.out.println("Enter Book number to Issue(1-"+count+"):");

int issueno=sc.nextInt();

Library[issueno-1].issueBook();

break;

case 3:

System.out.println("Enter Book number to Return(1-"+count+"):");

int returnno=sc.nextInt();

Library[returnno-1].returnBook();

break;

case 4:

System.out.println("\nLibrary Books");

for(int i=0;i<count;i++){

System.out.println((i+1)+" ");

Library[i].displayBook();

}

break;

case 5:

Book.displaytotalBooks();

break;

case 6:

System.out.println("Exit");

System.exit(0);

break;

default:

System.out.println("Invalid choice");

break;

}

}

}

}

