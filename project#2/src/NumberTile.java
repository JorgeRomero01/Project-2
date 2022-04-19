import java.util.ArrayList ;
import java.util.Random;

// A NumberTile is a square tile with a number from 1 to 9 on each side
public class NumberTile 
{
    private ArrayList<Integer> tile ;    // the 4-sided tile
    private static final Random gen = new Random() ;
      
    // Create a NumberTile object with 4 random ints in the range 1 to 9
    public NumberTile() 
    {
       // TO DO: Code the body of this method
    	tile = new ArrayList<Integer>();
    	int topNum = gen.nextInt(9) + 1;
    	int bottomNum = gen.nextInt(9) + 1;
    	int rightNum = gen.nextInt(9) + 1;
    	int leftNum = gen.nextInt(9) + 1;
    	
    	tile.add(0, leftNum);
    	tile.add(1 , topNum);
    	tile.add(2 , rightNum);
    	tile.add(3 , bottomNum);
    	
    }
    
    // Rotate this NumberTile 90 degrees
    public void rotate() 
    {
    	int temp = tile.get(0);
    	tile.set(0, tile.get(3));
    	tile.set(3, tile.get(2));
    	tile.set(2, tile.get(1));
    	tile.set(1, tile.get(temp));	
    	
       // TO DO: Code the body of this method
    }
    
    // Return the number on the left side of this NumberTile
    public int getLeft()
    {
    	// Do NOT modify this method
        return tile.get(0) ;
    }
    
    // Return the number on the right side of this NumberTile
    public int getRight() 
    {
        // Do NOT modify this method
        return tile.get(2) ;
    }
    
    // Return this NumberTile as a multiline string in the form:
    //     9
    //  3     7
    //     6
    //
    public String toString() 
    {
       // TO DO: Code the body of this method
       String output = " "	+	tile.get(0) +	"\n" + 
    		   tile.get(0) + 		" "			+ tile.get(2) + "\n"+
    		   " "		+			tile.get(3)		+ "\n";
       
       // temporary return statement so program skeleton will compile and run
       return output ;
    }    
} // end of NumberTile class