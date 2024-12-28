import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String nums = scanner.nextLine();
        String regex = " ";
        String[] myArray = nums.split(regex);
        System.out.println(myArray);




        /*Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            arr[i] = num;
        }
        int max1 = arr[0];
        int min1 = arr[0];
        for (int i = 1; i < 10; i++) {
            if (arr[i] > max1)
            {
                max1 = arr[i];
            }
            if (arr[i] < min1)
            {
                min1 = arr[i];
            }
        }
        System.out.println(max1);
        System.out.println(min1);*/

    }
}

