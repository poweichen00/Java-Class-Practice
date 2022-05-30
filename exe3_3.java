import java.util.Scanner;
public class exe3_3 {
    public static void main(String[] args){
        int row;
        Scanner input = new Scanner(System.in);
        System.out.print("請問要印列幾列的三角形星星？");
        row = input.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.printf("\n");
        }
    }    
}
