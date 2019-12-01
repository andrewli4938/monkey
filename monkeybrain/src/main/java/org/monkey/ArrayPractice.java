package org.monkey;

public class ArrayPractice {

    public static void main( String[] args ) {
        String [] family ={"Dad", "Mom", "Will", "Andy"};

        String temp="";
        temp=family[0];
        family[0]=family[1];
        family[1]=temp;
        for (int i=0; i<family.length; i++){
            System.out.println(family[i]);
        }


//        for (int i=0;i<=10;i++){
//            System.out.println(i);
//        }
        //swap the array and put mom first, and dad second

    }


}
