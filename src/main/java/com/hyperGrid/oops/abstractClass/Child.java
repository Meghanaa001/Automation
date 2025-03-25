package com.hyperGrid.oops.abstractClass;



public class Child extends Parent {


    @Override
    public void test1(){
        System.out.println("Child Test1");
    }
    public void test2(){
        System.out.println("Test2");
    }

    public static void main(String[] args) {
        Parent parent = new Parent();
        //parent.test1();

        Child child = new Child();
//        child.test1();
//        child.test2();

        //Parent parent2 = (Parent) new Child();

        Parent parent1 = new Child();
        Ancestor ancestor = new Child();

        ancestor.test1();
        parent1.test1();




    }
}
