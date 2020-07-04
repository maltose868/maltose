package test;

public class abstract2 extends abstract1 {

    public static void main(String[] args){
        abstract1 a = new abstract2();
        a.fun1();
        Integer x = 1;//Integer 引用
        Integer y = 1;
        System.out.println(x.equals(y));
        System.out.println(x==y);
    }
    @Override
    public void fun1(){
        System.out.println("222");

    }


}
