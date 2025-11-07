package Arrays;

public class TWO_SUM_ARRAY {
	
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 6, 7, 9};
        int target = 9;
        findAllPairs(a, target);
    }

    static void findAllPairs(int[] a, int target) {
        boolean found = false;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == target) {
                    System.out.println(a[i] + ", " + a[j]);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No pairs found");
        }
    }
}
