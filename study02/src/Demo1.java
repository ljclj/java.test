import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Demo1 {
 //   public static void main(String[] args) {
//        String[] str = new String[10];
//
//        str[0] = "1";
//        str[1] = "2";
//        str[2] = "3";
//        str[3] = "4";
//        str[4] = "5";
//        int b = 0;
//        while (createdate(b)) {
//            for (String s : str) {
//                if (s == "3") {
//                    continue;
//                }
//            }
//            b += 1;
//            if (b == 1) {
//                continue;
//            }
//            System.out.println("自己循环");
//        }
//    }
//

    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a==1){
            System.out.println("这是1");
        }else  if(a==2) {
            System.out.println("这是2");
        } else  if(a==3) {
            System.out.println("这是3");
        }else {
            System.out.println("识别不到了");
        }


        }


    public static  Boolean  createdate(int  b){
        System.out.println("正在判断");
        if(b>=2){
            System.out.println("关闭");
            return false;
        }else
            return  true;
    }
}
