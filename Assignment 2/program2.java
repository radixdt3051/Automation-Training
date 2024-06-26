package PracticeAssignment;
import java.util.Arrays;

public class program2
{
    public static void main(String[] args) {
        String[] names = {"darshan", "rahul", "biren", "abhishek"};

        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(names));

        Arrays.sort(names);

        System.out.println("After sorting:");
        System.out.println(Arrays.toString(names));
    }
}