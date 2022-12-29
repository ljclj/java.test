package number;

public class Demo01 {
    public static void main(String[] args) {
//        int a = 12;
//        int b = 20;
//        System.out.println(Math.max(a, b));
          float  a = 1.25f;
          float  b = 1.12f;
          float  c = a-b;
          if(Math.abs(c)<1.135){
              System.out.println("计算有效");
          }else
              System.out.println("计算无效");
        System.out.println(c);

    }
}