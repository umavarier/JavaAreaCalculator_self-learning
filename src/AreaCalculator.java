import java.util.Scanner;

public class AreaCalculator {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int choice;
        do {


        System.out.println("Choice 1 : area of rectangle: ");
        System.out.println("Choice 2 :Area of circle ");
        System.out.println("Choice 3: EXIT");
        System.out.println("enter the choice: ");
        choice = sc.nextInt();
        sc.nextLine();
        switch(choice)
        {
            case 1: System.out.println("enter the length and breadth of rectangle ");
                    int n1=sc.nextInt();
                    sc.nextLine();
                    int n2=sc.nextInt();
                    sc.nextLine();
                    area(n1,n2);
                    break;
            case 2 : System.out.println("enter the radius of the circle: ");
                     int r=sc.nextInt();
                     sc.nextLine();
                     area(r);
                     break;
            case 3 : System.out.println("Thank u for using area calculator ");
                     break;
            default: System.out.println("Invalid choice!");

        }}while(choice!=3);
    }
    public static void area (double radius)
    {   double r=0;

        if(radius<0)
        {
            System.out.println("Invalid value ");
        }
        else
        {
            r=Math.PI*radius*radius;
            System.out.println("the area of the circle is "+r);
        }


    }
    public static void area (double x, double y)
    {   double a=0;
        if(x<0||y<0)
        {
           // return -1.0;
            System.out.println("Invalid values");
        }
        else
        {
            a=x*y;
           // return a;
            System.out.println("The area is: "+a);
        }
    }
}
