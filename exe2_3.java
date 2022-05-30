import java.util.Scanner;
public class exe2_3 {
    public static void main(String[] agrs){
        Scanner input = new Scanner (System.in);
        int count;
        int food,a=0,b=0,c=0;
        count=0;
        System.out.printf("票選最喜歡的台灣小吃:(1)臭豆腐(2)蚵ㄚ煎(3)滷味。請選擇:");
        food=input.nextInt();
        while(food!=-1){
            System.out.printf("票選最喜歡的台灣小吃:(1)臭豆腐(2)蚵ㄚ煎(3)滷味。請選擇:");
            food=input.nextInt();
            if(food==1){
                a=a+1;
            }
            else if(food==2){
                b=b+1;
            }
            else if(food==3){
                c=c+1;
            }
            
        }
        if(count!=0){
         System.out.printf("票選結果:\n");
        System.out.printf("(1)臭豆腐:%d 得票率:%d%%\n",a,(100*a)/count);
        System.out.printf("(2)蚵ㄚ煎:%d 得票率:%d%%\n",b,(100*b)/count);
        System.out.printf("(3)滷味:%d 得票率:%d%%\n",c,(100*c)/count);
        }
        else{System.out.printf("no enter");
    }
    }    
}
