//QUESTION 3:
// Explain the difference between method overloading and method overriding in Java. Provide code examples to illustrate both concepts.

public class QuestionThree {
//    -----METHOD OVERLOADING----
    public double calculateArea(double radius){
        return 3.14*radius*radius;

    }
    public double calculateArea(double length,double width){
        return length * width;
    }

//    -----METHOD OVERRIDING----
    public void sound(){
        System.out.println("general animal");

    }
    static class Dog extends QuestionThree{
        @Override
        public void sound() {
            System.out.println("Dog Barks");
        }
    }
    static class Cat extends QuestionThree{
        public void sound(){
            System.out.println("Cat meows");
        }
    }


}
