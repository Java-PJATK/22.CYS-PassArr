// CYS-PassArr/PassArr.java
 
public class PassArr {

    public static void main(String[] args) {
          // array returned from a function
        int[] a = getArr(5);
        printArr(a, "Array returned from function");

          // passing  r e f e r e n c e  to function
        reverseArr(a);
        printArr(a, "Array a reversed");
    }

    /**
     *  prints an array of integer numbers
     */
    private static void printArr(int[] a, String message) {
        System.out.print(message + ":\n    [");
        for (int i : a) System.out.print(" " + i);
        System.out.println(" ]; size = " + a.length);
    }

    /**
     *  returns first n triangular numbers
     */
    private static int[] getArr(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i)
            arr[i] = (i+1)*(i+2)/2;
        return arr;
    }

    /**
     *  modifies input array (reversing order of elements)
     */
    private static void reverseArr(int[] a) {
        for (int i = 0, j = a.length-1; i < j; ++i,--j) {
            int p = a[i];
            a[i]  = a[j];
            a[j]  = p;
        }
    }
}
