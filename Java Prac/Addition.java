interface interfaceprac {
    void Add();
}

class Exceptionclass extends Exception {
    public Exceptionclass(String message) {
        super(message);
    }
}

class child implements interfaceprac {
    int a, b, c;

    child(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int calculation() throws Exceptionclass {
        if (a > 0) {
            return a + b + c;
        } else {
            throw new Exceptionclass("Errorrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
        }
    }

    public void Add() {
        try {
            System.out.print("Result: Sikho SHik " + calculation());
        } catch (Exceptionclass e) {
            System.out.println(e.getMessage());
        }
    }
}

public class Addition {
    public static void main(String[] args) {
        child obj = new child(-1, 12, 13);
        obj.Add();
    }
}
