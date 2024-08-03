package inheritance;

//single level
public class Father {
    int age = 45;

    void display() {
        System.out.println("old bike");
    }
}

class Son extends Father {
    public static void main(String[] args) {
        Son s = new Son();
        System.out.println("age : " + s.age);
        s.display();
    }
}
