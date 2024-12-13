public class Swaping_int {
        static void swap(int[] values) {

            values[0] = values[0] - values[1];
            values[1] = values[0] + values[1];
            values[0] = values[1] - values[0];
        }

        public static void main(String[] args) {
            // Random numbers of integer type
            int[] values = {9, 5};
            swap(values);
            System.out.println("Value of m is " + values[0] + " and Value of n is " + values[1]);
        }
    }

