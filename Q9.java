//Modify the above question to allow student to sit if he/she has medical cause. Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.

import java.util.*;
class Q9{
    public static void main(String[] arg){
         Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of class-");
        int x =sc.nextInt();
        System.out.print("Enter the number of class attended-");
        int y =sc.nextInt();
        System.out.print("press y/Y for medical case-");
        char a = sc.next().charAt(0);
        Float z = (float) y/x;
        //System.out.print(z);

        if (z>= 0.75){
            System.out.print("you can sit in exam your attendence is" + z*100);

        }
        else{
            if(a == 'Y' || a == 'y'){
                System.out.print("Eligible to sit in exam because of medial reason");
            }
            else{
            System.out.print("you are not eligible to sit i exam" + z*100);
            }
        }
       
        



    }
}