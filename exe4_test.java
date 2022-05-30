import java.util.Random;
import javax.swing.JOptionPane;

public class exe4_test {
    public static void main(String[] args){
        int input =JOptionPane.showConfirmDialog(null,"開始玩水果拉霸？");
        while(input==0){
            String a = spin();
            String b = spin();
            String c = spin();
        if(a==b && b==c){
            input = JOptionPane.showConfirmDialog(null," "+a+" "+b+" "+c+"\n恭喜中獎，要繼續玩嗎？");
        }
        else{
            input = JOptionPane.showConfirmDialog(null," "+a+" "+b+" "+c+"\n是否要繼續玩嗎？");
        }
        }
}
    public static String spin(){
        Random random = new Random();
        int a = random.nextInt(2);
    if(a==1){
        return "香蕉";
}
    else{
        return "草莓";
}
    }
}
