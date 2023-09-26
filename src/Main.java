public class Main {
    public static void main(String[] args) {
        int i = 10;

        printNumbers(1000,50);
//        printNumbers(10);

//        System.out.println(add(1, 3));
//        System.out.println(add(1, 10000L));
    }

    static long add(int a, int b) {
        System.out.println("Adding ints");
        return a + b;
    }

    static void printNumbers(int maxNumbers) {
        printNumbers(maxNumbers,1);
    }

    static void printNumbers(int maxNumber, int step) {
        for (int i = 0; i < maxNumber; i = i + step) {
            System.out.println(i);
        }
    }

}
