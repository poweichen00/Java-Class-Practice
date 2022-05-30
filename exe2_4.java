import java.util.Random;
import java.util.Scanner;
public class exe2_4 {
    public static void main(String[] args){
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int num=0;
        int ans=0;
        int correct =0;
        System.out.printf("數學測驗開始:\n");
        while(num<=4){
            int a = random.nextInt(9)+1;
            int b = random.nextInt(9)+1;
            System.out.printf("%d x %d = \n",a,b);
            ans=input.nextInt();
            if(a*b==ans){
                correct+=1;
            }
            num+=1;
        }
        if(correct>3){
            System.out.printf("太屌了");
        }
        else{
            System.out.printf("廢物");
        }
    }
}
