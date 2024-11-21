class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 4, 1, 3 };
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int Current = i;
            int prev = i - 1;

            while (prev >= 0 && arr[prev] > arr[Current]) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            arr[prev + 1] = Current;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }
}