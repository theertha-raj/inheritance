package inheritance;

public class Simpleinheritance1 {

    static class Son {
        public void display() {
            System.out.println("bike");
        }
    }

    static class Father extends Son {
        public void display() {
            // super.display();
            System.out.println("old bike");
        }
    }

    public static void main(String[] args) {
        Son son = new Son();
        son.display(); // Output is "bike"

        Father father = new Father();
        father.display(); // Output is"old bike"
    }
}
