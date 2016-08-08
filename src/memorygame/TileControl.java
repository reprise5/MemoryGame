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
    int dice1 , dice2;
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

        //first add all the numbers from 0 to 15 into an array list, then shuffle it
        List<Integer> randomCollection = new ArrayList<>();
        for (int i = 0; i <= 15; i++){
            randomCollection.add(i); 
        }
        Collections.shuffle(randomCollection);

        //assign each shape their locations
        circle1 = randomCollection.get(0);
        circle2 = randomCollection.get(1);
        cross1 = randomCollection.get(2);    
        cross2 = randomCollection.get(3);   
        diamond1 = randomCollection.get(4);
        diamond2 = randomCollection.get(5);
        donut1 = randomCollection.get(6);
        donut2 = randomCollection.get(7);
        eclipse1 = randomCollection.get(8);
        eclipse2 = randomCollection.get(9);
        square1 = randomCollection.get(10);
        square2 = randomCollection.get(11);
        star1 = randomCollection.get(12);
        star2 = randomCollection.get(13);
        X1 = randomCollection.get(14);;
        X2 = randomCollection.get(15);
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

        //first add all the numbers from 0 to 35 into an array list, then shuffle it.
        //then assign the value in slot 0 to a shape, etc etc. each shape gets a random value. 
        List<Integer> randomCollection = new ArrayList<>();
        for (int i = 0; i <= 35; i++){
            randomCollection.add(i); 
        }
        Collections.shuffle(randomCollection);

        circle1 = randomCollection.get(0);
        circle2 = randomCollection.get(1);
        cross1 = randomCollection.get(2);
        cross2 = randomCollection.get(3);
        diamond1 = randomCollection.get(4);
        diamond2 = randomCollection.get(5);
        dice1 = randomCollection.get(6);
        dice2 = randomCollection.get(7);
        donut1 = randomCollection.get(8);
        donut2 = randomCollection.get(9);
        eclipse1 = randomCollection.get(10);
        eclipse2 = randomCollection.get(11);
        eclipse3 = randomCollection.get(12);
        eclipse4 = randomCollection.get(13);
        grapes1 = randomCollection.get(14);
        grapes2 = randomCollection.get(15);
        heart1 = randomCollection.get(16);
        heart2 = randomCollection.get(16);
        L1 = randomCollection.get(17);
        L2 = randomCollection.get(18);
        rectangle1 = randomCollection.get(19);
        rectangle2 = randomCollection.get(20);
        snowflake1 = randomCollection.get(21);
        snowflake2 = randomCollection.get(22);
        sqdonut1 = randomCollection.get(23);
        sqdonut2 = randomCollection.get(24);
        square1 = randomCollection.get(25);
        square2 = randomCollection.get(26);
        star1 = randomCollection.get(27);
        star2 = randomCollection.get(28);
        tear1 = randomCollection.get(29);
        tear2 = randomCollection.get(30);
        triangle1 = randomCollection.get(31);
        triangle2 = randomCollection.get(32);
        X1 = randomCollection.get(33);
        X2 = randomCollection.get(34);
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
