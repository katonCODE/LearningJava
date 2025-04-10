package MoreDSA;

/**
   Class which demonstrates how a list can be used to solve
   the Josephus problem. Starting with numPeople soldiers 
   in a circle, every gap-th soldier is removed until
   there are no soldiers remaining
   @author Lewis/Chase (adapted)
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; // Java 1.5 equivalent of cs1.Keyboard

public class Josephus {
   public static void main(String[] args) {
      int numPeople, gap, counter;
      List<Integer> list = new ArrayList<Integer>();
      Scanner in = new Scanner(System.in);
      // get the initial number of soldiers
      System.out.print("Enter the number of soldiers: ");
      numPeople = in.nextInt();
      in.nextLine();
      // get the gap between soldiers

      System.out.print("Enter the gap between soldiers: ");
      gap = in.nextInt();

      System.out.println("\nThe last one is: " + Josephus_Problem.josephus_problem(numPeople, gap));

      // load the initial list of soldiers
      // note that index i holds soldier i+1
      for (int count = 1; count <= numPeople; count++)
         list.add(count);
      counter = gap - 1; // first soldier to remove in list
      // treating the list as circular, remove every nth element
      // until the list is empty
      System.out.print("The order is: ");
      while (!list.isEmpty()) { // remove soldier at index counter
         System.out.print(list.remove(counter));
         numPeople--;
         if (numPeople > 0) {
            counter = (counter - 1 + gap) % numPeople;// note -1 since removal
            System.out.print(", ");
         }
      }
      System.out.println();
   }
}
