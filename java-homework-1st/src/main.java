// task 1
public class main {

    // task 2-1
    public static int add(int x, int y) {
        return x + y;
    }

    // task 2-2
    public static int subtract(int x, int y) {
        return x - y;
    }

    // task 3
    public static void main(String[] args) {

        // task 4
        int addResult = add(10, 5);
        int addResult2 = add(2, 22);
        int addResult3 = add(864, -56);

        int subtractResult = subtract(214, 10);
        int subtractResult2 = subtract(-45, 234);
        int subtractResult3 = subtract(9, 234);

        // task 5
        int[] additionResults = {addResult, addResult2, addResult3};
        int[] subtractionResults = {subtractResult, subtractResult2, subtractResult3};

        // task 6
        for (int i = 0; i < additionResults.length; i++) { // if (additionResults.length == subtractionResults.length)
            System.out.println(additionResults[i]);
            System.out.println(subtractionResults[i]);
        }

        // task 7
        int index = 0;
        while (index < additionResults.length) { // if (additionResults.length == subtractionResults.length)
            int n = additionResults[index];
            int m = subtractionResults[index];
            System.out.print(n + " " + m + " ");
            index++;
        }

        System.out.println("");

        // task 8
        for (int i = 0; i < additionResults.length; i++) {
            if (additionResults[i] % 2 == 0) {
                System.out.println("even: " + additionResults[i]);
            } else {
                System.out.println("odd: " + additionResults[i]);
            }

            if (subtractionResults[i] % 2 == 0) {
                System.out.println("even: " + subtractionResults[i]);
            } else {
                System.out.println("odd: " + subtractionResults[i]);
            }
        }
    }
}
