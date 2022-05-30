import javax.swing.JOptionPane;
import java.util.Random;
public class exe5_2 {
    public static void main(String[] args){
        Random random = new Random();
        String a[] = {"a","b","c","d","e"};
        int input=JOptionPane.showConfirmDialog(null,"開始點名");
        while(input==0){
            input = JOptionPane.showConfirmDialog(null,"點到的是"+a[random.nextInt(a.length)]+"\n要繼續點名嗎？");
    }        
    }
}

