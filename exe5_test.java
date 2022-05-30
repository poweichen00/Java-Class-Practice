import java.util.Arrays;
import javax.swing.JOptionPane;
import java.util.Random;
public class exe5_test {   
        public static void main(String[] args){
          int play [] = new int[6];
          for(int i=0; i<6; i++){ 
              play[i] = Integer.parseInt(JOptionPane.showInputDialog("請投注第 " + (i+1) + " 個號碼（1到42）： ")); 
             }
          Arrays.sort(play);
          int lotto [] = draw(); //開出六個中獎號碼
          check(play, lotto);  //對獎
        }    
        
        public static int [] draw(){ //可多利用EXE5_3
            Random random = new Random();
            int ans [] = new int [6];       
            int temp=0;
            for(int i =0;i<6;i++){
                do{
                    temp = random.nextInt(9)+1;
                }while(Arrays.binarySearch(ans,temp)>=0);
                ans[0]=temp;
                Arrays.sort(ans);
        }
        return ans;
    }
    
        public static void check(int lotto[], int draw[]){
            int num=0;
            for(int i =0;i<6;i++){
                for(int j=0;j<6;j++){
                    if(lotto[i]==draw[j]){
                        num++;
                    }
                }
            }
            String output = "";
            String input = "";
            for(int i=0;i<6;i++){
                input = input+lotto[i]+" " ;
             } 
             for(int i=0;i<6;i++){
                 output = output + draw[i]+" " ;
             }
             if(num<3){
                JOptionPane.showMessageDialog(null,"中獎號碼為："+output+"\n您的號碼："+input+"\n沒中");
            }
            if(num==3){
                JOptionPane.showMessageDialog(null,"中獎號碼為："+output+"\n您的號碼："+input+"\n4獎");
            }
            if(num==4){
                JOptionPane.showMessageDialog(null,"中獎號碼為："+output+"\n您的號碼："+input+"\n3獎");
            }
            if(num==5){
                JOptionPane.showMessageDialog(null,"中獎號碼為："+output+"\n您的號碼："+input+"\n2獎");
            }
            if(num==6){
                JOptionPane.showMessageDialog(null,"中獎號碼為："+output+"\n您的號碼："+input+"\n頭獎");
            }
        }
    }

