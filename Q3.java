import java.util.Scanner;
class Q3{
    public static void main( String[] arg){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the quantity the user want to buy in unit");
        int x = sc.nextInt();
        int z=0;
        if ((x*100) >= 1000){
            z = x*100;
            z=z-(z/10);
            System.out.print(z);
        }
        else{
            System.out.print(x*100);
        }

    }
}