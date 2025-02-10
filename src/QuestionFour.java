//QUESTION 4:
// Create an interface Shape with a method draw(). Implement this interface in two classes, Circle and Rectangle, each providing its own implementation of the draw() method. Demonstrate polymorphism by calling the draw() method on instances of both classes.

public class QuestionFour {
    interface Shape {
        void draw();
    }

    static class Circle implements Shape {
        @Override
        public void draw() {
            System.out.println("This is a Circle");
        }
    }

    static class Rectangle implements Shape {
        @Override
        public void draw() {
            System.out.println("This is a Rectangle");
        }
    }
}
