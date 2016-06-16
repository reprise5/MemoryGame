package memorygame;
import java.util.*;

/**
 * @author reprise
 */
public class TileControl {
    //GLOBALS 
    
    //these hold the positions (ID) of each of the shapes and their pair.
    //this ID is handed out from initShuffleTiles() randomCollection array.
    int circle1, circle2;
    int cross1, cross2;
    int diamond1, diamond2;
    int donut1, donut2;
    int eclipse1, eclipse2;
    int square1, square2;
    int star1, star2;
    int X1, X2;
    
    //======================================================================================
    //generate random numbers & assign them to each shape twice.  its their location on the game board.
    public void initShuffleTiles(){
        int n = 0;

        //first add all the numbers from 0 to 15 into an array list, then shuffle it
        List<Integer> randomCollection = new ArrayList<>();
        for (int i = 0; i <= 15; i++){
            randomCollection.add(i); 
        }
        Collections.shuffle(randomCollection);

        circle1 = randomCollection.get(n);
        //System.out.println("Circle1: " + circle1);
        n++;

        circle2 = randomCollection.get(n);
        //System.out.println("Circle2: " + circle2);
        n++;
        
        cross1 = randomCollection.get(n);
        //System.out.println("Cross1: " + cross1);
        n++;
        
        cross2 = randomCollection.get(n);
        //System.out.println("Cross2: " + cross2);
        n++;
        
        diamond1 = randomCollection.get(n);
        //System.out.println("Diamond1: " + diamond1);
        n++;
        
        diamond2 = randomCollection.get(n);
        //System.out.println("Diamond2: " + diamond2);
        n++;
        
        donut1 = randomCollection.get(n);
        //System.out.println("Donut1: " + donut1);
        n++;
        
        donut2 = randomCollection.get(n);
        //System.out.println("Donut2: " + donut2);
        n++;
        
        eclipse1 = randomCollection.get(n);
        //System.out.println("Eclipse1: " + eclipse1);
        n++;
        
        eclipse2 = randomCollection.get(n);
        //System.out.println("Eclipse2: " + eclipse2);
        n++;
        
        square1 = randomCollection.get(n);
        //System.out.println("Square1: " + square1);
        n++;
        
        square2 = randomCollection.get(n);
        //System.out.println("Square2: " + square2);
        n++;
        
        star1 = randomCollection.get(n);
        //System.out.println("Star1: " + star1);
        n++;
        
        star2 = randomCollection.get(n);
        //System.out.println("Star2: " + star2);
        n++;
        
        X1 = randomCollection.get(n);
        //System.out.println("X1: " + X1);
        n++;
        
        X2 = randomCollection.get(n);
        //System.out.println("X2: " + X2);
        n++; 
    }
    
    //The type returned is a code from 0-7 that theoretically corresponds to a "shape". 
    //gives us some way of testing matches.
    public int getTileType(int ID){
        int type = 100;
        
        if (ID == circle1 || ID == circle2){
            //its a square, code 0.
            type = 0;
        }
        else if (ID == cross1 || ID == cross2){
            type = 1;
        }
        else if (ID == diamond1 || ID == diamond2){
            type = 2;
        }
        else if (ID == donut1 || ID == donut2){
            type = 3;
        }
        else if (ID == eclipse1 || ID == eclipse2){
            type = 4;
        }
        else if (ID == square1 || ID == square2){
            type = 5;
        }
        else if (ID == star1 || ID == star2){
            type = 6;
        }
        else if (ID == X1 || ID == X2){
            type = 7;
        }
        
        System.out.print("Shape_Code: " + type + " - ");
        switch (type){
            case 0:
                System.out.print("Circle");
                break;
            case 1:
                System.out.print("Cross");
                break;
            case 2:
                System.out.print("Diamond");
                break;
            case 3:
                System.out.print("Donut");
                break;
            case 4:
                System.out.print("Eclipse");
                break;
            case 5:
                System.out.print("Square");
                break;
            case 6:
                System.out.print("Star");
                break;
            case 7:
                System.out.print("X");
                break;    
        }
        System.out.println();
        
        return type;
    }
}
