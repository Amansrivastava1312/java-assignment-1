import java.util.Scanner;
class Q4{
    public static void main(String[] arg){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the salary of user");
        int x = sc.nextInt();
        System.out.print("Enter the working year of employee");
        int y = sc.nextInt();

        if(y>5){
            float z= (float)( x + 0.05*x); 
            System.out.println(z);

        }
        else{
            System.out.println(x);
        }

    }
}