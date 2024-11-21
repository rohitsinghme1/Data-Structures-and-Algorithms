class selectionSort {
    public static void main(String[] args) {
        int[] arr = { 4, 1, 5, 2, 3 };
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

        for (int i = 0; i < n - 1; i++) {
            int st = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[st]) {
                    st = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[st];
            arr[st] = temp;

        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}