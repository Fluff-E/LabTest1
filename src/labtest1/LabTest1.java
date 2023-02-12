package labtest1;

public class LabTest1 {

    void sortFunction7(int unsorted[]) {
        int len = unsorted.length;
        for (int i = 0; i < len; i++) // remove <= to fully iterate loop
        {
            int index = i;
            for (int j = i + 1; j < len; j++)// remove len -1 at end of loop to include last index
                if (unsorted[index] > unsorted[j])// if next less than current index
                    index = j;// move index forward
            // when at index end
            int t = unsorted[index];// switch i with index storing in t
            unsorted[index] = unsorted[i];
            unsorted[i] = t;
        }
    }

    void sortFunction8(int unsorted[]) {

        int ln = unsorted.length;
        for (int i = 1; i < ln; ++i) {
            int item = unsorted[i];// store item outside array
            int j = i - 1;// change to subtract 1 because the method is based on looking backward from
                          // item
            while (j >= 0 && unsorted[j] > item) {// change to j>= 0 so that first element of array included
                unsorted[j + 1] = unsorted[j];// assign j to next index
                j = j - 1;
            }
            unsorted[j + 1] = item;// place item back inside array
        }
    }

    void sortFunction9(int unsorted[]) {
        int index = 0;
        int n = unsorted.length;
        while (index < n) {//change <= to <
            if (index == 0)
                index++;
            if (unsorted[index - 1] <= unsorted[index])//Change > to <=
                index++;
            else {
                int temp = unsorted[index];
                unsorted[index] = unsorted[index - 1];
                unsorted[index - 1] = temp;
                index=0;//change to zero
            }
        }
    }

    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        LabTest1 obj = new LabTest1();

        int unsorted7[] = { 76, 45, 10, 29, 10 };
        obj.sortFunction7(unsorted7);
        System.out.println("Sorted array7 : ");
        obj.printArray(unsorted7);

        int unsorted8[] = { 76, 45, 10, 29, 10 };
        obj.sortFunction8(unsorted8);
        System.out.println("Sorted array8 : ");
        obj.printArray(unsorted8);

        int unsorted9[] = { 76, 45, 10, 29, 10 };
        obj.sortFunction9(unsorted9);
        System.out.println("Sorted array9 : ");
        obj.printArray(unsorted9);

    }

}
