package ex6;

/***
 * integer的上限设置参数
 * -XX:AutoBoxCacheMax=256
 */
public class Hello {
    public static void main(String[] args){
        Integer n1=123;
        Integer n2=123;
        Integer n3=128;
        Integer n4=128;

        System.out.println(n1==n2);//true
        System.out.println(n3==n4);//false

        //设置  -XX:AutoBoxCacheMax=256
        System.out.println(n1==n2);//true
        System.out.println(n3==n4);//true
       // int b=a*10;

    }
}
