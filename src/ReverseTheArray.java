import java.util.Scanner;

public class ReverseTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];
        for(int i=0;i<size;i++)
        {
            array[i] = sc.nextInt();
        }
        reverseArray(size,array);
        for(int x : array)
        {
            System.out.print(x+" ");
        }
    }
    public static void reverseArray(int size,int[] array)
    {
        int i=0;
        int j=size-1;
        while(i<j)
        {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }
}
