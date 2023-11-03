public class Main {
    public static void main(String[] args) {
        int a = 3;
        boolean prost = true;
        for (int i = 2; i < a; i++) {
            if (a % i == 0)
                prost = false;
        }
        if (prost) System.out.println("простое " + a);
        else System.out.println("составное " + a);
    }
}