package org.monkey;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        String temp="";
        String name1 ="Andrew";
        String name2="William";
        temp =name1;
        name1 = name2;
        name2=temp;

        System.out.println( "Hello World: " + name1 +", "+name2);
    }
}
