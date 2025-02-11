//QUESTION 4 A): WAP using java 8:
//
//    -> Collect all  even numbers from a list using stream

package work;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Question4StreamsPart1 {
    public static void main(String[] args){
        List<Integer> list1= Arrays.asList(12,2,3,13,4,23);


        List<Integer> evenList= list1.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println("Original list" + list1);
        System.out.println("Filtered Even List" + evenList);
    }
}
