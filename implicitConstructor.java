package inheritance;

public class implicitConstructor {
    implicitConstructor() {
        System.out.println("implicitConstructor");
    }
}

class InnerimplicitConstructor extends implicitConstructor {

    InnerimplicitConstructor() {
        System.out.println("InnerimplicitConstructor");
    }

    public static void main(String[] args) {
        new InnerimplicitConstructor();
    }
}
