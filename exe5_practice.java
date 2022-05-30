import javax.swing.JOptionPane;
import java.util.Random;
public class exe5_practice {
    static int row=0,column=0;
    static int count [][] = {{0,0,0,0,0,0},
                            {0,0,0,0,0,0,0,0,0,0},
                            {0,0,0,0,0,0,0,0,0,0},
                            {0,0,0,0,0,0,0,0,0,0},
                            {0,0,0,0,0,0,0,0,0,0},
                            {0,0,0,0,0,0,0,0,0,0},
                            {0,0,0,0,0,0,0,0,0,0}};
    public static void main(String[] args){
        int input = JOptionPane.showConfirmDialog(null,"開始點名");
            while(input==0){
                String name = call();
                int z = add(row,column,1);
            if(z>1){
                input=JOptionPane.showConfirmDialog(null,"點到的是 \""+name+"\" 共"+z+"次"+"\n要繼續點名嗎？");
            }
            else{
                input=JOptionPane.showConfirmDialog(null,"點到的是 \""+name+"\" \n要繼續點名嗎？");
            }
        }
    }
    public static String call(){
    String name [][] = {{"戴柏誠","劉心怡","陳芊卉","洪宇承","何羽軒","林喬楚"},
    {"邱安琪","邱奕輝","周恩傑","陳柏瑋039","王彥蓉","盧韋仲","蔡知遠","范凱崴","許佳硯","王瑛莉"},
    {"張皓宇","張宏安","林俊廷","黃欣慈","陳盈倩","蔡昀茜","吳柏毅","王惟帆","李晨瑜","周冠逸"},
    {"温楫驊","李偉云","秦瓏","陳柏瑋566","王冠程","張婷婷","吳琪溱","石昀翰","吳孟璇","黃亮穎"},
    {"管奕凱","周炯辰","謝子尉"," 鄭婷云","陳政傑","蔡秉成","潘韋凱翔","陳元敏","賴羿文","賴羿文"},
    {"李亦喬","邱筱筑","陳美靜","徐瑋駿","陳妙芯","林煒佳","趙翊安","李宗陶","張穎珊","涂安締"},
    {"蘇若新","林郁芯","呂學宇","鄭古洋","胡加萱","柯韋豪","蔡承紘","鄧同恩","張廷宇","吳亦鴻"}};
        Random random = new Random();
        row = random.nextInt(7);
        column = random.nextInt(10); 
    do{
        row = random.nextInt(7);
        column = random.nextInt(10);
    }while(row==0&&column>5);
        add(row,column,0);
        return name[row][column];
    }
    public static int add(int row , int column,int adc){
        if(adc==0){
            count[row][column]++;
            return 0;
        }
        else{
           return count[row][column];
        }
    }
}
