import java.util.Random;
import java.util.Arrays;
public class exe5_3 {
    public static void main(String[] args){
        Random random = new Random();
        int a[] = new int[6]; 
        for (int i=0;i<a.length;i++){
            a[i]=random.nextInt(42)+1;
            Arrays.sort(a);
            int location = Arrays.binarySearch(a,6);
            System.out.printf("%d ",a[i]);
        }
    }    
}
