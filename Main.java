public class Main {
    public static void main(String[] args) {
        SudokuSolver sudokuSolver = new SudokuSolver();
        View view = new View();
        System.out.println();
        System.out.println("Unsolved Sudoku : ");
        sudokuSolver.start();
        view.printBoard(sudokuSolver.getBoard().getTiles());
        System.out.println();
        System.out.println("Solved Sudoku : ");
        do {
            sudokuSolver.reduceAvailableValues();
            sudokuSolver.addValue();
        } while (!sudokuSolver.isCompleted());
        view.printBoard(sudokuSolver.getBoard().getTiles());
    }
}
