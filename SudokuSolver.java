public class SudokuSolver {
    private
    int[][] arr;

    public void start(){
        if (readData()== false){
            System.out.println("data source failed");
            return;
        }
    }

    public boolean readData(){
        arr = new InputData().getData();
        return true;
    }
    public void reduceAvailableValues(){
        reduceAvailableValuesinRow();
        //reduceAvailableValuesinCol();
        //reduceAvailableValuesinSquare();

    }
    public void reduceAvailableValuesinRow(){

    }

}

