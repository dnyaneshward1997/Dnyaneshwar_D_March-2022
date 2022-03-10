import java.util.Scanner;

class Assignq6
{
    public static void main (String args[])
   {
     Scanner sc =new Scanner (System.in);
	 System.out.println("Enter the number 1 :");
	 int num1= sc.nextInt();
	 
	 System.out.println("Enter the number 2 :");
	 int num2= sc.nextInt();
	 
	 int result1 = num1 + num2;
	 int result2 = num1 - num2;
	 int result3 = num1 * num2;
	 int result4 = num1 / num2;
	 int result5 = num1 % num2;
	 
   
      System.out.println("The results is "+result1);
	  System.out.println("The results is "+result2);
	  System.out.println("The results is "+result3);
	  System.out.println("The results is "+result4);
	  System.out.println("The results is "+result5);
   
   }

}