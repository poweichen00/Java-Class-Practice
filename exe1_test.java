import java.util.Scanner;
public class exe1_test{
    public static void main (String[] args){
Scanner input= new Scanner(System.in);
double a,b,c;
System.out.print("輸入分子(整數):");
a = input.nextDouble();
System.out.print("輸入分母(整數):");
b = input.nextDouble();
c=(a*a)/(b*b);
System.out.printf("結果為:%.2f",c);
input.close();
    }
}