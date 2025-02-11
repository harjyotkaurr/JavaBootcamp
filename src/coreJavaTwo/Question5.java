//QUESTION 5: Implement multiple inheritance with default method inside interface.

package coreJavaTwo;


interface Interface1
{

    default void display()
    {
        System.out.println("Inside Interface1");
    }
}

interface Interface2
{

    default void display()
    {
        System.out.println("Inside Interface2");
    }
}


public class Question5 implements Interface1, Interface2{
    public void display()
    {
        Interface1.super.display();

        Interface2.super.display();
    }

    public static void main(String args[])
    {
        Question5 d = new Question5();
        d.display();
    }
}




