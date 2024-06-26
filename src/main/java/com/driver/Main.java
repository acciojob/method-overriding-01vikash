package com.driver;

public class Main {
    public static void main(String[] args){
        A a = new A();
        String s =a.meth();
        System.out.println(s);
        B b=new B();
         s=b.meth();
        System.out.println(s);
    }

    public static class B extends A{
        public String meth(){
           return  "Method is overridden in Extendend class B";
        }
    }

    public static class A{
        public String meth(){
            return "Invoking method from class A";
        }
    }
}
