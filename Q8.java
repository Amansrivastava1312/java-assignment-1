/*A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.*/
import java.util.*;
class Q8{
    public static void main(String[] arg){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of class-");
        int x =sc.nextInt();
        System.out.print("Enter the number of class attended-");
        int y =sc.nextInt();

        Float z = (float) y/x;
        //System.out.print(z);

        if (z>= 0.75){
            System.out.print("you can sit in exam your attendence is" + z*100);

        }
        else{
            System.out.print("you are not eligible to sit i exam" + z*100);
        }
        


    }
}