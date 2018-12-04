public class InsertionSort {
    static int[] list = {4, 3, 2, 10, 12, 1, 5, 6};

    static void insertionSort(int[] list)
    {
        int n = list.length;
        for (int i=1; i<n; ++i)
        {
            int key = list[i];
            int j = i-1;

            while (j>=0 && list[j] > key)
            {
                list[j+1] = list[j];
                j = j-1;
            }
            list[j+1] = key;
        }
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String args[])
    {
        insertionSort(list);
        printArray(list);
    }
}
