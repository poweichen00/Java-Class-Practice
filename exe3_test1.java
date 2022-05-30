import java.util.Scanner;
public class exe3_test1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num ;
        System.out.printf("印列幾個口：");
        num = input.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                System.out.printf(i==1||i==num||j==1||j==num ?"口":"  ");
            }
            System.out.printf("\n");
        }
    }
}
