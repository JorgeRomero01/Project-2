import java.util.ArrayList;

// The board for the NumberTile game  
public class Board
{
    private ArrayList<NumberTile> board ;    // the board for a NumberTile game
    
    // Creates a new Board containing a single NumberTile
    public Board()
    {
       board = new ArrayList<>();// TO DO: Code the body of this method
       board.add(new NumberTile());
    }
    
    // Return the NumberTile at the specified index on this Board
    public NumberTile getTile (int index)
    {
       // TO DO: Code the body of this method
       
       // temporary return statement so program skeleton will compile and run
       return board.get(index);
    }
    
    // Return the current number of tiles on this Board
    public int getSize()
    {
       // TO DO: Code the body of this method
       
       // temporary return statement so program skeleton will compile and run
       return board.size();
    }
    
    // Insert a new tile into this Board at the specified index
    public void addTile(int index, NumberTile tile)
    {
       board.set(index, tile);
    	// TO DO: Code the body of this method
    }
    
    // Return a multiline string containing all the tiles on this Board
    public String toString()
    {
       // TO DO: Code the body of this method
       
       // temporary return statement so program skeleton will compile and run
       return board.toString();
    }           
}