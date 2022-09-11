import java.util.*;
class lvl2_Q1{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        String s= y%400 ==0 || (y%4 == 0 && y % 100 !=0) ? " leap year":"not leap year" ;
        System.out.print(s);
    }
}