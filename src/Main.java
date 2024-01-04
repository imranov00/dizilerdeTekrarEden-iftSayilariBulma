import java.util.Arrays;

public class Main {
    static boolean isFind(int[] arr, int index) {
        for (int i = 0; i < index; i++) {
            if (arr[i] == arr[index]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {3, 7, 3, 3, 9, 10, 21, 1, 33, 9, 4, 6, 4, 6, 4, 6, 10, 8, 4, 6, 10, 10};

        System.out.println("Dizi: " + Arrays.toString(list));

        System.out.println("Tekrar eden çift sayılar:");
        for (int i = 0; i < list.length; i++) {
            if (list[i] % 2 == 0 && isFind(list, i)) {
                System.out.println(list[i]);

            }
        }

    }
}