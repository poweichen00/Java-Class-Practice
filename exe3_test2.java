import java.util.Scanner;
public class exe3_test2 {
    public static void main( String[] args ){
        Scanner input = new Scanner(System.in);
        int num;
    System.out.printf("how much row 工 :");
    num = input.nextInt();
    for(int i = 1 ; i <= num ; i++){
        for(int j = 1 ; j <= num ;j++){
            System.out.printf(i==1||i==num||j==num/2+1?"工":"  ");
        }
        System.out.printf("\n");
    }



    }
}
