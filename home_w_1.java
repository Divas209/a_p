import java.util.Scanner;
public class home_w_1 {
   
    public static void main(String []args) {
        work_5();
        //work_6(3,50,3);
        // work_10(10,3,1);
    }
    public static void work_1(){
        int a = 5;
        float b = 0.4f;
        System.out.println("+" + (a+b)); 
        System.out.println("-" + (a-b)); 
        System.out.println("*" + (a*b)); 
        System.out.println("/" + (a/b)); 
    }
    public static void work_2(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        System.out.println(a*b*c);
    }
    public static void work_4(){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] str1 =  str.split(" ");
        int a = Integer.parseInt(str1[0]);
        int b = Integer.parseInt(str1[1]);
        System.out.println(a * b);
        System.out.println(a + b * 2);
    }
    public static void work_5(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        a = a/2;
        System.out.println(a+a+2);
    }
    public static void work_6(int _a, int _b,int _c){
        int a = _a;
        int b = _b;
        int c = _c;
        a = a*c;
        b = b*c;
        while(b > 100){
            b -= 100;
            a +=1;
        }
        System.out.println(a+"p "+b+"k");
    }
    public static void work_7(){
        String a = "23456";
        String[] b = a.split("");
        System.out.println(b[b.length-1]);
    }
    public static void work_8(){
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String[] b = a.split("");
        int num = 0;
        for (int i =0; i!=b.length;i++){
            num += Integer.parseInt(b[i]);
        }
        System.out.print(num);
    }
    public static void work_9(int _v, int _t){
        int road = 109;
        int vasya = 0;
        int v = _v;
        int t = _t;
        System.out.println(v*t);
    }
    public static void work_10(int _h, int _a, int _b){
        int h = _h, a = _a, b = _b;
        System.out.println(h/(a-b));
        
    }

} 

//javac home_w_1.java
//java -classpath . home_w_1