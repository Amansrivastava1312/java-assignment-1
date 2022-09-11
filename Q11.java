import java.util.*;
class Q11{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character input");
        char a= sc.next().charAt(0);
        if (a>= 'a' && a<= 'z'){
            System.out.println("LOWER CASE");
        }
        else if (a>= 'A' && a<= 'Z'){
            System.out.println("UPPER CASE");

        }
        else{
            System.out.println("ENTER THE VALID INPUT");

        }
    }
}