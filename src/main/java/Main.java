public class Main {
    public static void main(String[] args) {
        int verificationNum = 3; //ввести число
        boolean primeNum = true;
        for (int i = 2; i < verificationNum; i++) {
            if (verificationNum % i == 0) {
                primeNum = false;
            }
        }
        if (primeNum) {
            System.out.println("Число " + verificationNum + " является простым");
        } else {
            System.out.println("Число " + verificationNum + " является составным");
        }
    }
}