package memorygame;
import java.util.*;

/**
 * @author reprise
 */
public class TileControl {
    //GLOBALS 
    
    //these hold the positions (ID) of each of the shapes and their pair.
    //this ID is handed out from initShuffle4x4Tiles() randomCollection array.
    int circle1, circle2;
    int cross1, cross2;
    int diamond1, diamond2;
    int dice1, dice2;
    int donut1, donut2;
    int eclipse1, eclipse2;
    int eclipse3, eclipse4;
    int grapes1, grapes2;
    int heart1, heart2;
    int L1, L2;
    int rectangle1, rectangle2;
    int snowflake1, snowflake2;
    int sqdonut1, sqdonut2;
    int square1, square2;
    int star1, star2;
    int tear1, tear2;
    int triangle1, triangle2;
    int X1, X2;
    
    //========================================================================================
    //          4X4 GAME BOARD TILE CONTROL
    //========================================================================================
    
    //generate random numbers & assign them to each shape twice.  its their location on the game board.
    public void initShuffle4x4Tiles(){
        int n = 0;

        //first add all the numbers from 0 to 15 into an array list, then shuffle it
        List<Integer> randomCollection = new ArrayList<>();
        for (int i = 0; i <= 15; i++){
            randomCollection.add(i); 
        }
        Collections.shuffle(randomCollection);

        circle1 = randomCollection.get(n);
        n++;
        circle2 = randomCollection.get(n);
        n++;
        cross1 = randomCollection.get(n);
        n++;       
        cross2 = randomCollection.get(n);
        n++   ;   
        diamond1 = randomCollection.get(n);
        n++;
        diamond2 = randomCollection.get(n);
        n++; 
        donut1 = randomCollection.get(n);
        n++;
        donut2 = randomCollection.get(n);
        n++;
        eclipse1 = randomCollection.get(n);
        n++;
        eclipse2 = randomCollection.get(n);
        n++; 
        square1 = randomCollection.get(n);
        n++;
        square2 = randomCollection.get(n);
        n++;
        star1 = randomCollection.get(n);
        n++;
        star2 = randomCollection.get(n);
        n++;
        X1 = randomCollection.get(n);
        n++;
        X2 = randomCollection.get(n);
        n++; 
    }
    
    //The type returned is a code from 0-7 that theoretically corresponds to a "shape". 
    //gives us some way of testing matches.
    public int get4x4TileType(int ID){
        int type = 100;
        
        System.out.print("Shape_Code: ");
        if (ID == circle1 || ID == circle2){
            type = 0;
            System.out.print(type + " - Circle");
        }
        else if (ID == cross1 || ID == cross2){
            type = 1;
            System.out.print(type + " - Cross");
        }
        else if (ID == diamond1 || ID == diamond2){
            type = 2;
            System.out.print(type + " - Diamond");
        }
        else if (ID == donut1 || ID == donut2){
            type = 3;
            System.out.print(type + " - Donut");
        }
        else if (ID == eclipse1 || ID == eclipse2){
            type = 4;
            System.out.print(type + " - Eclipse");
        }
        else if (ID == square1 || ID == square2){
            type = 5;
            System.out.print(type + " - Square");      
        }
        else if (ID == star1 || ID == star2){
            type = 6;
            System.out.print(type + " - Star");
        }
        else if (ID == X1 || ID == X2){
            type = 7;
            System.out.print(type + " - X");
        }
        System.out.println();
        
        return type;
    }
    //========================================================================================
    //          6X6 GAME BOARD TILE CONTROL
    //========================================================================================
   
    //generate random numbers & assign them to each shape twice.  its their location on the game board.
    public void initShuffle6x6Tiles(){
        int n = 0;

        //first add all the numbers from 0 to 35 into an array list, then shuffle it.
        //then assign the value in slot 0 to a shape, etc etc. each shape gets a random value. 
        List<Integer> randomCollection = new ArrayList<>();
        for (int i = 0; i <= 35; i++){
            randomCollection.add(i); 
        }
        Collections.shuffle(randomCollection);

        circle1 = randomCollection.get(n);
        n++;
        circle2 = randomCollection.get(n);
        n++;
        cross1 = randomCollection.get(n);
        n++;       
        cross2 = randomCollection.get(n);
        n++   ;   
        diamond1 = randomCollection.get(n);
        n++;
        diamond2 = randomCollection.get(n);
        n++;
        dice1 = randomCollection.get(n);
        n++;
        dice2 = randomCollection.get(n);
        n++;
        donut1 = randomCollection.get(n);
        n++;
        donut2 = randomCollection.get(n);
        n++;
        eclipse1 = randomCollection.get(n);
        n++;
        eclipse2 = randomCollection.get(n);
        n++;
        eclipse3 = randomCollection.get(n);
        n++;
        eclipse4 = randomCollection.get(n);
        n++;
        grapes1 = randomCollection.get(n);
        n++;
        grapes2 = randomCollection.get(n);
        n++;
        heart1 = randomCollection.get(n);
        n++;
        heart2 = randomCollection.get(n);
        n++;
        L1 = randomCollection.get(n);
        n++;
        L2 = randomCollection.get(n);
        n++;
        rectangle1 = randomCollection.get(n);
        n++;
        rectangle2 = randomCollection.get(n);
        n++;
        snowflake1 = randomCollection.get(n);
        n++;
        snowflake2 = randomCollection.get(n);
        n++;
        sqdonut1 = randomCollection.get(n);
        n++;
        sqdonut2 = randomCollection.get(n);
        n++;
        square1 = randomCollection.get(n);
        n++;
        square2 = randomCollection.get(n);
        n++;
        star1 = randomCollection.get(n);
        n++;
        star2 = randomCollection.get(n);
        n++;
        tear1 = randomCollection.get(n);
        n++;
        tear2 = randomCollection.get(n);
        n++;
        triangle1 = randomCollection.get(n);
        n++;
        triangle2 = randomCollection.get(n);
        n++;
        X1 = randomCollection.get(n);
        n++;
        X2 = randomCollection.get(n);
        n++; 
    }
    
    //The type returned is a code from 0-7 that theoretically corresponds to a "shape". 
    //gives us some way of testing matches.
    public int get6x6TileType(int ID){
        int type = 100;
        
        System.out.print("Shape_Code: ");
        if (ID == circle1 || ID == circle2){
            type = 0;
            System.out.print(type + " - Circle");
        }
        else if (ID == cross1 || ID == cross2){
            type = 1;
            System.out.print(type + " - Cross");
        }
        else if (ID == diamond1 || ID == diamond2){
            type = 2;
            System.out.print(type + " - Diamond");
        }
        else if (ID == dice1 || ID == dice2){
            type = 3;
            System.out.print(type + " - Dice");
        }
        else if (ID == donut1 || ID == donut2){
            type = 4;
            System.out.print(type + " - Donut");
        }
        else if (ID == eclipse1 || ID == eclipse2){
            type = 5;
            System.out.print(type + " - Eclipse");
        }
        else if (ID == eclipse3 || ID == eclipse4){
            type = 6;
            System.out.print(type + " - Eclipse2");
        }
        else if (ID == grapes1 || ID == grapes2){
            type = 7;
            System.out.print(type + " - Grapes");
        }
        else if (ID == heart1 || ID == heart2){
            type = 8;
            System.out.print(type + " - Heart");
        }
        else if (ID == L1 || ID == L2){
            type = 9;
            System.out.print(type + " - L");
        }
        else if (ID == rectangle1 || ID == rectangle2){
            type = 10;
            System.out.print(type + " - Rectangle");
        }
        else if (ID == snowflake1 || ID == snowflake2){
            type = 11;
            System.out.print(type + " - Snowflake");
        }
        else if (ID == sqdonut1 || ID == sqdonut2){
            type = 12;
            System.out.print(type + " - SquareDonut");
        }
        else if (ID == square1 || ID == square2){
            type = 13;
            System.out.print(type + " - Square");      
        }
        else if (ID == star1 || ID == star2){
            type = 14;
            System.out.print(type + " - Star");
        }
        else if (ID == tear1 || ID == tear2){
            type = 15;
            System.out.print(type + " - Tear");
        }
        else if (ID == triangle1 || ID == triangle2){
            type = 16;
            System.out.print(type + " - Triangle");
        }       
        else if (ID == X1 || ID == X2){
            type = 17;
            System.out.print(type + " - X");
        }
        System.out.println();
        
        return type;
    }
}
