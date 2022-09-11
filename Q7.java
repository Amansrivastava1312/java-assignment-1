import java.util.*;
class Q7{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number-");
        int x= sc.nextInt();
        if (x<0){
            x= (-1)*x;
            System.out.print(x);

        }
        else{
            System.out.println(x);

        }
    }
}