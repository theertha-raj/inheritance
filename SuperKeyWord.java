package inheritance;

class Whatspfeature {
    public void update() {
        System.out.println("Added Single tick");
    }
}

class version extends Whatspfeature {
    public void update() {
        super.update();
        System.out.println("Added double tick");
    }
}

class version2 extends version {
    public void update() {
        super.update();
        System.out.println("Added blue tick");
    }
}

public class SuperKeyWord {
    public static void main(String[] args) {
        version2 ver3 = new version2();
        ver3.update();
    }
}
