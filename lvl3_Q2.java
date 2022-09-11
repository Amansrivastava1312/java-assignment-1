import java.util.*;
/* 2.Ask user to enter age, sex ( M or F ), marital status ( Y or N ) and then using following rules print their place of service.
if employee is female, then she will work only in urban areas.

if employee is a male and age is in between 20 to 40 then he may work in anywhere

if employee is male and age is in between 40 t0 60 then he will work in urban areas only.

And any other input of age should print "ERROR".
*/
class lvl2_Q2{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr the age- ");
        int age= sc.nextInt();
        System.out.print("Enter the sex only M/F");
        char sex= sc.next().charAt(0);
        System.out.print("enter the martial status Y/N");
        char mar= sc.next().charAt(0);

        if(sex == 'F'){
            System.out.print("You can work in urban area");
        }
        else if (sex == 'M' &&  (age>=20 && age<40 )){
            System.out.print("you can work anywhere ");
        }
        else if (sex == 'M' &&  (age>=40 && age<60 )){
            System.out.print("you can work in urban area ");
        }







    }
    }