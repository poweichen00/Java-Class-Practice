import java.util.Random;
import java.util.Scanner;
public class exe3_1 {
    public static void main(String[] args){
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int ans=0;
        int correct =0;
        System.out.printf("數學測驗開始:\n");
        for(int i = 0 ; i <= 4 ; i++ ){
            int a = random.nextInt(9)+1;
            int b = random.nextInt(9)+1;
            System.out.printf("%d x %d = ",a,b);
            ans=input.nextInt();
            if(a*b==ans){
                correct+=1;
            }
        }
        if(correct >= 4){
            System.out.printf("數學資優生");
        }
        else{
            System.out.printf("要再加油！");
        }
    } 
}
