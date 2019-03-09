

package ArraySupport.sorter;


public class bubble// Using bubble sort
{
    public int[]  bubbleInt(int A[])//for int
{
       for(int i=1;i<=A.length-1;i++)
       {
          for(int j=0;j<=(A.length-1)-i;j++)
          {
              if(A[j]>A[j+1])
              {
                   int t=A[j];
                   A[j]=A[j+1];
                   A[j+1]=t;
                  
              }
          }
       }
       return A;
}
    public double[] bubbleDouble(double A[])//for double
{
     for(int i=1;i<=A.length-1;i++)
     {
       for(int j=0;j<=(A.length-1)-i;j++)
       {
         if(A[j]>A[j+1])
           {
               double t=A[j];
                A[j]=A[j+1];
               A[j+1]=t;
           }
       }
    }  
    return A;
}
public String[] bubbleString(String A[])//for string
{
    for(int i=1;i<=A.length-1;i++)
    {
        for(int j=0;j<=(A.length-1)-i;j++)
           {
               if(A[j].compareToIgnoreCase(A[j+1])>0)
                {
                   String t=A[j];
                   A[j]=A[j+1];
                   A[j+1]=t;
                }
            }
    }
    return A;
}
}