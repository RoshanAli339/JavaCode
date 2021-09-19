package com.company;
import java.util.*;
public class Online_lib {
    static Scanner sc = new Scanner(System.in);
    static String[] issued = new String[1000];
    static String[] avail = new String[1000];
    int issuedCount=0;
    int availCount=10;
    public void addBooks(){
        System.out.print("Please enter the name of the book you want to add: ");
        String bname = sc.next();
        avail[availCount]=bname;
        availCount+=1;
        System.out.println("The new book has been added to the library successfully and can be downloaded.");
    }
    public void issuedBooks(){
        System.out.print("Please enter the name of the book to be issued: ");
        String bname= sc.next();
        boolean check=false;
        for(int i=0;i<availCount;i++)
        {
            if(avail[i].equals(bname))
            {
                check =true;
                issuedCount++;
                availCount--;
                issued[issuedCount]=avail[i];
                avail[i]="NIL";
                break;
            }
        }
        if(check)
            System.out.println("The requested book is available and is being downloaded...");
        else
            System.out.println("The requested book is not available now, please try again later!!");
    }
    public void returnBooks(){
        System.out.print("Please enter the name of the book you want to return: ");
        String rname = sc.next();
        System.out.println("Thank you for returning the book");
        issuedCount-=1;
        availCount+=1;
        avail[availCount]=rname;
    }

    public void printing()
    {
        System.out.println("Do you want to : \n1.Add a book \n2.Issue a book \n3.Return a book \n4.List of available books");
        System.out.print("Please enter your choice: ");
        int option  = sc.nextInt();
        if(option==1)
            addBooks();
        else if(option==2)
            issuedBooks();
        else if(option==3)
            returnBooks();
        else if(option==4)
        {
            System.out.println("The list of available books is: ");
            for (int i=0;i<availCount;i++)
            {
                if(avail[i].equals("NIL"))
                    System.out.print("");
                else{
                    System.out.println((i+1)+avail[i]);
                }
            }
        }
        System.out.print("Do you want to do any other process(Y/N): ");
        char guess = sc.next().charAt(0);
        if(guess=='Y')
            printing();
        else if(guess=='N')
            System.out.println("\t\t\t\t\tThank You for using our Online Library. ;) ");
    }
    public static void main(String[] args) {
        Online_lib obj = new Online_lib();
        avail[0]="VECTORS AND 3D GEOMETRY";
        avail[1]="MECHANICS VOLUME 1";
        avail[2]="MECHANICS VOLUME 2";
        avail[3]="WAVES AND THERMODYNAMICS";
        avail[4]="ELECTRICITY AND MAGNETISM";
        avail[5]="MODERN PHYSICS AND SEMICONDUCTORS";
        avail[6]="ALGEBRA";
        avail[7]="TRIGONOMETRY";
        avail[8]="CALCULUS";
        avail[9]="COORDINATE GEOMETRY";
        System.out.println("\t\t\t\t\t*****ONLINE LIBRARY******");
        obj.printing();
    }
}
