public class App {
    static int[] array = {1, 2, 3, 4, 5};

    public static int getNumAt(int[] array, int position) {
        return array[position];
    }

    public static void main(String[] args) throws Exception {
        int result = getNumAt(array, 2);
        System.out.println(result);
    }
}
