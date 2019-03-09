package ArraySupport.sorter;


/**
 * 
 */
public class selection// Using selection Sort for sorting
{

    /**
     * 
     */
    public int[] selectionInt(int[] A)//for integers
    {
        int i = 0;
        while (i <= A.length - 2) {
            int min = A[i];
            int t = i;
            int j = i;
            while (j <= A.length - 1) {
                if (min > A[j]) {
                    t = j;
                    min = A[j];
                }
                j = j + 1;
            }
            int temp = A[i];
            A[i] = A[t];
            A[t] = temp;
            i = i + 1;
        }
        return A;
    }

    /**
     * 
     */
    public double[] selectionDouble(double[] A)//for double
    {
        int i = 0;
        while (i <= A.length - 2) {
            double min = A[i];
            int t = i;
            int j = i;
            while (j <= A.length - 1) {
                if (min > A[j]) {
                    t = j;
                    min = A[j];
                }
                j = j + 1;
            }
            double temp = A[i];
            A[i] = A[t];
            A[t] = temp;
            i = i + 1;
        }
        return A;
    }

    /**
     * 
     */
    public String[] selectionString(String[] A)//for string
    {
        int i = 0;
        while (i <= A.length - 2) {
            String min = A[i];
            int t = i;
            int j = i;
            while (j <= A.length - 1) {
                if (min.compareToIgnoreCase(A[j]) > 0) {
                    t = j;
                    min = A[j];
                }
                j = j + 1;
            }
            String temp = A[i];
            A[i] = A[t];
            A[t] = temp;
            i = i + 1;
        }
        return A;
    }
}
