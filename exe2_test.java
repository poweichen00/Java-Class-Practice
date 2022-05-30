import java.util.Scanner;
public class exe2_test {
    public static void main(String[] agrs){
        Scanner input = new Scanner (System.in);
        int count;
        int food;
        int a=0,b=0,c=0;
        count=0;
        System.out.printf("票選最喜歡的台灣小吃:(1)臭豆腐(2)蚵ㄚ煎(3)滷味。請選擇:");
        food=input.nextInt();
        while(food!=-1){
    switch(food)
        {
            
            case 1:
            a++;
            count++;
            break;
            case 2:
            b++;
            count++;
            break;
            case 3:
            c++;
            count++;
            break;
        }
        System.out.printf("票選最喜歡的台灣小吃:(1)臭豆腐(2)蚵ㄚ煎(3)滷味。請選擇:");
        food=input.nextInt();
    }
        System.out.printf("票選結果:\n");
        System.out.printf("(1)臭豆腐:%d 得票率:%.2f\n",a,(100.0*a)/(double)count);
        System.out.printf("(2)蚵ㄚ煎:%d 得票率:%.2f\n",b,(100.0*b)/(double)count);
        System.out.printf("(3)滷味:%d 得票率:%.2f\n",c,(100.0*c)/(double)count);

    if(a>b&&a>c){
        System.out.printf("最高票為臭豆腐");
    }
    else if(b>a&&b>c){
        System.out.printf("最高票為蚵ㄚ煎");
    }
     else if(c>a&&c>b){
        System.out.printf("最高票為滷味");
    }
    else{
        System.out.printf("從缺");
    }
}
}  


    

