public class Main {
    public static void main(String[] args) {
        factorialIter(4);
        System.out.println(factorialRec(4));
    }

    public static long factorialIter(int p1) {
        long result = 1;
        for (int i = 2; i <= p1; i++) {
            result *= i;
        }
        System.out.println(result);
        return result;
    }

    public static long factorialRec(int p1) {
        if (p1 == 0 || p1 == 1) {
            return 1;
        }
        return p1 *= factorialRec(p1 - 1);
    }
}
