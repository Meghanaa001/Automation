package com.hyperGrid.exceptions;

public class OrderOfCatchBlocks {

    public static void main(String[] args) {
        int a = 0;
        String s = null;
        try{
            a= 5/1;
            int[] b = {1,2,3,4,99};
            System.out.println(b[4]);
            System.out.println(b[4]);
            s.length();
        }

        catch (ArithmeticException ae){
            System.out.println(ae.toString());
            a = 5/1;
        }

        catch (ArrayIndexOutOfBoundsException aei){
            System.out.println(aei.toString());
            System.out.println("Provide right index within the length of the array");
        }

        catch (IndexOutOfBoundsException aei){
            System.out.println(aei.toString());
            System.out.println("Provide right index within the length of the array");
        }
        catch (NullPointerException e){
            System.out.println("Parent exception");
        }

        catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("a value :: "+ a);
        System.out.println("Automation Testing");
    }
}
