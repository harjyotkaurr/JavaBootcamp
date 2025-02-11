//QUESTION 1: Write the following a functional interface and implement it using lambda:
//
//    -> First number is greater than second number or not Parameter (int ,int ) Return boolean
//   ->  Increment the number by 1 and return incremented value Parameter (int) Return int
//    -> Concatination of 2 string Parameter (String , String ) Return (String)
//    -> Convert a string to uppercase and return . Parameter (String) Return (String)



package coreJavaTwo;

@FunctionalInterface
interface MyInter <T, U, R> {
    R apply(T t, U u);


}


public class Question1 {
    public static void main(String[] args){

        MyInter<Integer, Integer, Boolean> isGreater= (a,b)-> a>b;
        System.out.println("Is 2 greater than 7? " + isGreater.apply(2,7));

        MyInter<Integer, Void, Integer>increment=(a,unused) -> a+1;
        System.out.println("After incrementing 2 by 1 we get: " + increment.apply(2,null));

        MyInter<String, String, String>concatenate=(str1, str2) ->str1 + str2;
        System.out.println("String after Concatenation is: " + concatenate.apply("Harjyot " , "Kaur"));

        MyInter<String, Void, String>upperCase= (str1, unused)-> str1.toUpperCase();
        System.out.println("String in uppercase is: " + upperCase.apply("harjyot kaur",null));



    }
}
