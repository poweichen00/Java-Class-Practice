import java.util.Random;
public class exe5_1 {
    public static void main(String[] args){
        Random random = new Random();
        int a[] = new int[6]; 
        for (int i=0;i<a.length;i++){
            a[i]=random.nextInt(42)+1;
            System.out.printf("%d ",a[i]);
        }
    }    
}
