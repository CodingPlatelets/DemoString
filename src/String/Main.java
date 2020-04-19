package String;
/*
* String 的3+1种创建方法
*/
public class Main {

    public static void main(String[] args) {

//        使用空参构造
        String str1 = new String();
        System.out.println("The first : "+ str1);

//        使用字符数组构造
        char [] CharArray = {'A','B','C'};
        String str2 = new String(CharArray);
        System.out.println("The second : "+ str2);

//        使用字节数组构造
        byte [] ByArray = {97,98,99};
        String str3 = new String(ByArray);
        System.out.println("The third : "+ str3);

//        直接创建
        String str4 = "Hello!";
        System.out.println("The  : "+ str4);


        System.out.println("Hello world!");

//        str s = new str();
//        s.demo01();
    }
}
