import java.util.Scanner;
class Q2{
    public static void main (String[] arg){

     Scanner sc = new Scanner(System.in);
     int x = sc.nextInt();
     int y = sc.nextInt();

        if (x>y) {
            System.out.print(x  +"is greatest");
            
        }
        else if (x<y){
            System.out.print(y  +"is greatest");

        }
        else{
            System.out.print("both are equal");
        }
    }


}