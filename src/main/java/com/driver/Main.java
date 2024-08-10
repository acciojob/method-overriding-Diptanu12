package com.driver;

public class Main {

    public class A {
        public String meth() {
            return "Invoking method from class A";
        }
    }

    public class B extends A {
        @Override
        public String meth() {
            return "Method is overridden in Extended class B";
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        B obj = main.new B(); 
        System.out.println(obj.meth());
    }
}

