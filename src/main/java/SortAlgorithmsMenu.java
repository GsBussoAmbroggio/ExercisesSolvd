import javax.swing.*;
import java.util.Arrays;
import java.util.Random;

public class SortAlgorithmsMenu {

    public static void main(String[] args) {

        int size ;
        int since;
        int until;
        //input size of Array
        size = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the size of list "));
        //input since & until for random numbers
        since = Integer.parseInt(JOptionPane.showInputDialog(null, "numbers since"));
        until = Integer.parseInt(JOptionPane.showInputDialog(null, "numbers until"));
            //instantiation of Random
            Random rnd = new Random();
            //random Array numbers
            int[] numbers = new int[size];
            for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rnd.nextInt(until - since +1);


        }
        System.out.println("Original list");
        System.out.println(Arrays.toString(numbers));

        //Display Menu
        int option = 0; //Save the user option
        while (option!=3){

            option = Integer.parseInt(JOptionPane.showInputDialog(null,
                    """
                            --------------------------------------------------------------
                            -    Enter ones of these options                             \s
                            -                                                            \s
                            -    1- Bubble Sort                                          \s
                            -    2- Insertion sort                                       \s
                            -    3- Exit                                                 \s
                            -                                                            \s
                            -                                                            \s
                            --------------------------------------------------------------"""));

            switch (option) {
                case 1://Bubble sort
                    for(int i=0; i<numbers.length; i++)
                    {
                        for(int j=i + 1; j<numbers.length; j++)
                        {
                            if(numbers[i] > numbers[j])
                            {
                                int temp = numbers[i];
                                numbers[i] = numbers[j];
                                numbers[j] = temp;
                            }
                        }
                    }
                    System.out.println("Sorting list with Bubble sort algorithm");
                    System.out.println(Arrays.toString(numbers));
                    break;
                case 2://Insertion sort
                    int a = numbers.length;
                    for (int j = 1; j < a; j++) {
                        int key = numbers[j];
                        int i = j-1;
                        while ( (i > -1) && ( numbers [i] > key ) ) {
                            numbers [i+1] = numbers [i];
                            i--;
                        }
                        numbers[i+1] = key;
                    }
                    System.out.println("Sorting list with Insertion sort algorithm");
                    System.out.println(Arrays.toString(numbers));
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null,"you are leaving the program ");
                    break;
                default:
                    System.out.println("Only you can enter numbers between 1 to 3");
            }
        }
    }
    }




