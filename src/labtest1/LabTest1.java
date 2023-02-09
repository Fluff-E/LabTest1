/**
 * @author Eric Yate
 */

package labtest1;

public class LabTest1 {
    /**
     * @see sort in accending order
     * @param unsorted
     */
    void sortFunction7(int unsorted[]) {
        int len = unsorted.length;
        for (int i = 0; i < len; i++) // removed = sign in i<=len
        {
            int index = i;
            for (int j = i + 1; j < len; j++) // change from len-1 to length
                if (unsorted[j] < unsorted[index])// if next smaller than assingn index to previous
                    index = j;
            int t = unsorted[index];
            unsorted[index] = unsorted[i];
            unsorted[i] = t;
        }
    }

    /**
     * @see sort in acending order
     * @param unsorted
     */
    void sortFunction8(int unsorted[]) {
        int ln = unsorted.length;
        for (int i = 1; i < ln; ++i) { // change ln-1 to ln
            int item = unsorted[i];
            int j = i; // change from i+1 to i

            while (j > 0 && unsorted[j - 1] > item) { // if next item greater //change from j>0
                unsorted[j] = unsorted[j - 1];// assingn it to one farther down
                j = j - 1;
            }
            unsorted[j] = item;// remove +1
        }
    }

    /**
     * @see sort in decending order
     * @param unsorted
     */
    void sortFunction9(int unsorted[]) {
        
        
        int index = 0;
        int n = unsorted.length;
        while (index < n) { // change to less than n
             if (index == 0)
                index++; //comment out
            if (unsorted[index - 1] > unsorted[index]) {// change > to <
                int temp = unsorted[index-1];
                unsorted[index-1] = unsorted[index];// switch assing index to index -1
                unsorted[index] = temp;
                index++;// change to plus

            } 
            else {
               index++;
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
