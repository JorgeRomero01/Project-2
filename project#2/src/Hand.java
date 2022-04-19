import java.util.ArrayList;

// A player's hand of NumberTiles
public class Hand
{
    private ArrayList<NumberTile> hand ;
    private final static int INITIAL_SIZE = 5 ;  // starting hand size
    
    // Creates a new hand of INITIAL_SIZE NumberTiles 
    public Hand()
    {
       hand = new ArrayList<>();// TO DO: Code the body of this method
       NumberTile newtile = new NumberTile();
       for(int i = 0; i < INITIAL_SIZE; i++) {
    	   hand.add(newtile);
       }
    }
       
    // Get the NumberTile at the specified index in this Hand
    public NumberTile get(int index)
    {
       // TO DO: Code the body of this method
    
       // temporary return statement so program skeleton will compile and run
       return hand.get(index);
    }
    
    // Get the number of tiles in this Hand
    public int getSize()
    {
       // TO DO: Code the body of this method
       
       // temporary return statement so program skeleton will compile and run
       return hand.size();
    }
    
    // Add a new NumberTile to this Hand
    public void addTile()
    {
       hand.add(new NumberTile());// TO DO: Code the body of this method
    }
    
    // Remove the NumberTile at the specified index from this Hand
    public void removeTile(int index)
    {
        hand.remove(index);
    	// TO DO: Code the body of this method
    }
    
    // Is this hand empty?
    public boolean isEmpty()
    {
       // TO DO: Code the body of this method
       
       // temporary return statement so program skeleton will compile and run
       return hand.isEmpty();
    }
    
    // Return this Hand as a multiline String.
    // If this Hand is empty, return an appropriate message
    public String toString()
    {
       // TO DO: Code the body of this method
       if(isEmpty()) {	//if empty return "empty"
    	   return "empty";
       }
       else {
    	   return hand.toString();
       }
       // temporary return statement so program skeleton will compile and run
       
    }
}