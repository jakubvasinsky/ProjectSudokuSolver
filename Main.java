public class Main {
    public static void main(String[] args) {
 int[][] arr = new InputData().getData();
 new View().printBoard(arr);

 new SudokuSolver().readData();
    }
}
