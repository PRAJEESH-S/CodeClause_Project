import java.util.*;

public class ExamSeatingArrangementSystem {
  
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    // Get input from user
    System.out.print("Enter the number of students : ");
    int numOfStudents = input.nextInt();
    
    System.out.print("Enter the number of rows in class : ");
    int numOfRows = input.nextInt();
    
    System.out.print("Enter the number of columns in class: ");
    int numOfColumns = input.nextInt();
    
    // Initialize seating chart
    int[][] seatingChart = new int[numOfRows][numOfColumns];
    for (int row = 0; row < numOfRows; row++) {
      for (int column = 0; column < numOfColumns; column++) {
        seatingChart[row][column] = -1;
      }
    }
    
    // Assign seats to students
    int studentIndex = 0;
    for (int row = 0; row < numOfRows; row++) {
      for (int column = 0; column < numOfColumns; column++) {
        if (studentIndex < numOfStudents) {
          if (seatingChart[row][column] == -1) {
            seatingChart[row][column] = studentIndex + 1;
            studentIndex++;
          }
        }
      }
    }
    
    // Randomize seat assignments
    Random rand = new Random();
    for (int row = 0; row < numOfRows; row++) {
      for (int column = 0; column < numOfColumns; column++) {
        if (seatingChart[row][column] != -1) {
          int randomRow = rand.nextInt(numOfRows);
          int randomColumn = rand.nextInt(numOfColumns);
          int temp = seatingChart[row][column];
          seatingChart[row][column] = seatingChart[randomRow][randomColumn];
          seatingChart[randomRow][randomColumn] = temp;
        }
      }
    }
    
    // Print seating chart
    System.out.println("Seating Chart:");
    for (int row = 0; row < numOfRows; row++) {
      for (int column = 0; column < numOfColumns; column++) {
        if (seatingChart[row][column] != -1) {
          System.out.printf("%3d", seatingChart[row][column]);
        } else {
          System.out.print("   ");
        }
      }
      System.out.println();
    }
    
  }
  
}

