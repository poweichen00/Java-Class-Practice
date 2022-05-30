import java.util.Scanner;
public class exe2_1 {
 public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     String name;
     int food;
     System.out.printf("貴姓大名:");
     name=input.nextLine();
    System.out.printf("票選最喜歡的台灣小吃:(1)臭豆腐(2)蚵ㄚ煎(3)滷味。請選擇:");
    food=input.nextInt();
    if(food==1){System.out.printf("%s選臭豆腐\n",name);}
    else if(food==2){System.out.printf("%s選蚵ㄚ煎",name);}
    else if(food==3){System.out.printf("%s選滷味",name);}
 }   
}
