import java.util.Random;
import javax.swing.JOptionPane;
public class exe3_4 {
    public static void main(String[] args){
        Random random = new Random();
        int reply;
        String output = "  ";
        String input = JOptionPane.showInputDialog("輸入一小於11大於1的正整數",3);
        reply = Integer.parseInt(input);
        for(int i=1;i<=reply;i++){
            for(int j=1;j<=reply;j++){
                output += random.nextInt(reply);
            }
            output+="\n";
    }
    JOptionPane.showMessageDialog(null,output);
    }
}
