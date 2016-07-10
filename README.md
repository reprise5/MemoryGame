# MemoryGame

Originally a card game, this is a Java Program of a Card-Matching game.  
All cards are face down when the game begins, and you need to flip 2 distinct cards to see if their shapes match.  if they don't, when you flip up a third card, the 2 previous will flip back down.  you need to remember those shapes to match them in the future.

Currently, if 2 shapes are showing and you press one of the showing shapes again, and proceed to make a new match you will confuse the game.  *You have to make a match with 2 distinct cards, and if they're not right,* **press an empty card.**
I'm trying to fix that.

##How it works
######Randomizing the board
First initShuffleTiles() is called from the startButton sub.initShuffleTiles loads the numbers 0-15 (4x4) or 0-35 (6x6) into an array, and shuffles the array.  Then the variables from index 0 and 1 are assigned to the first shape, index 2 and 3 to the next shape, and so on.

######Shape COdes
anything that is assigned to shapes, or any array or sub that reads shapes has to go in a specific order because each shape is assigned a code.  it is used to easily compare or deal with shapes, because a "shape" is more or less intagible in code. Here are all the shape codes and the shape they correspond to:

**4x4 codes**

| **Shape**     | **Code**      |
|:-------------:|:-------------:| 
| circle        | 0             |
| cross         | 1             |
| diamond       | 2             |
| donut         | 3             |
| eclipse       | 4             |
| square        | 5             |
| star          | 6             |
| x             | 7             |
 
 **6x6 codes**

| **Shape**     | **Code**      |
|:-------------:|:-------------:| 
| circle        | 0             |
| cross         | 1             |
| diamond       | 2             |
| dice          | 3             |
| donut         | 4             |
| eclipse       | 5             |
| eclipse2      | 6             |
| grapes        | 7             |
| grapes        | 7             |
| grapes        | 7             |
| grapes        | 7             |
| grapes        | 7             |


##How to Play

####How To Win

- flip up all matching pairs of shapes on the game board
- Preferably have a score higher than 0 by the time you match all shapes.
- Cheating off the console.

####How To Lose
- you really can't lose, you sort of keep going till you get them all right.
- Having a score of 0 or less is considered losing though the program doesn't let you know you technically lost.

####I'm not a developer, I just want to play.
I built the program into an executable .jar.  All you need to do is download this repository, go to the `dist` folder, and run `MemoryGame.jar` 
with your JRE. (which you need to have installed first).
