package PracticeAssignment;
import java.util.Arrays;

public class program3
{
    public static void main(String[] args) {
        String[] first_names = {"darshan", "rahul", "biren", "abhishek"};

        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(first_names));

        Arrays.sort(first_names);

        System.out.println("After sorting:");
        System.out.println(Arrays.toString(first_names));
     
        String[] last_names = {"patel", "soni", "joshi", "nimje"};
        
        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(last_names));
        
        Arrays.sort(last_names);

        System.out.println("After sorting:");
        System.out.println(Arrays.toString(last_names));
    }
}