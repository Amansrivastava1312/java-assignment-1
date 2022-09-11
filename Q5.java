import java.util.*;
class Q5{
    public static void main(String[] arg){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks of student--");
        Float x = sc.nextFloat();
/*a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - */

        if (x<25){
            System.out.print("Grade-F");
        }
        else if (x>=25 && x<45 ){
            System.out.print("Grade-E");
        }
        else if (x>=45 && x<50 ){
            System.out.print("Grade-D");
        }
        else if (x>=50 && x<60 ){
            System.out.print("Grade-C");
        }
        else if (x>=60 && x<80 ){
            System.out.print("Grade-B");
        }
        else if (x>=80 && x<=100 ){
            System.out.print("Grade-A");
        }
        else{
            System.out.print("Enter the valid Marks");
        }
        }
    }
