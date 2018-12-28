package com.stackroute;

public class ExceptionDemo {
    public static String CheckNegativeArray(int i) {

        try{

                int[] arr = new int[i];

        }catch (NegativeArraySizeException e)
        {
            System.out.println("Negative Array size Exception generated");
        }
        return "Negative Array size Exception generated";
    }

    public static String CheckIndexOutOfBounds(int[] ints)
    {

        try
        {
            int a[]=new int[10];
            //Array has only 10 elements
            a[11] = 9;
        }catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception generated");
        }
        return "ArrayIndexOutOfBounds Exception generated";

    }

    public static String CheckNullPointer(String stackRoute)
    {
        try{
            String str=null;
            System.out.println (str.length());
        }
        catch(NullPointerException e){
            System.out.println("Null Pointer Exception Generated");
        }
        return "Null Pointer Exception Generated";
    }

}
