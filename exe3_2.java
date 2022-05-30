import java.util.Random;
import java.util.Scanner;
public class exe3_2 {
    public static void main(String[] args){
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int i = 0;
        int ans=0;
        int correct =0;
        System.out.printf("數學測驗開始:\n");
        do{
            int a = random.nextInt(9)+1;
            int b = random.nextInt(9)+1;
            System.out.printf("%d x %d = ",a,b);
            ans=input.nextInt();
            i++;
            if(a*b==ans){
                correct+=1;
            }
        }while(i <= 4);
        if(correct >= 4){
            System.out.printf("數學資優生");
        }
        else{
            System.out.printf("要再加油！");
        }
    } 
}
