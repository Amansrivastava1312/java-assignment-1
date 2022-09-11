import java.util.*;
class lvl2_Q3{
    public static void main(String[] arg)
    {Scanner sc = new Scanner(System.in); 
    System.out.print("Enter the number to be reversed");
    int n = sc.nextInt();
    int remainder =0;
    int reverse=0;
    int c=0;
    while(n!=0){

    remainder = n % 10;
    reverse = reverse * 10 + remainder;
    n /= 10;
  }
     System.out.print(reverse);


    

    }
    }
