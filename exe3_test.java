import java.util.Scanner;
public class exe3_test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num ;
        System.out.printf("畫出邊長為a的正方形口字,a設為(輸入一個大於3的正整數):");
        num = input.nextInt();
        for(int i=0;i<num;i++){
            if(i==0||i==num-1){
                for(int j=0;j<num;j++){
            System.out.printf("口");
                }
                System.out.printf("\n");
                continue;
            }
            for(int j=0;j<num;j++){
                System.out.print(j==0||j+1==num?"口":"  ");
            }
            System.out.printf("\n");
        }
    }
}
