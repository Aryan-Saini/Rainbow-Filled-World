import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private final int RECTANGLE_WIDTH = 50;
    /**
     * Constructor for objects of class MyWorld.
     * 
     * @param none there are no parameters
     * @return nothing is returned
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        //prepareWorldFor();
        //prepareWorldWhile();
        prepareWorldDoWhile();
    }
    /**
     * prepareWorldFor preapares the world using a for loop
     * adds rainbow colored rects width 50 across the world
     * 
     * @param none there are no parameters
     * @return nothing is returned
     */
    private void prepareWorldFor(){
        for (int i = 0; i < getWidth() / RECTANGLE_WIDTH; i++ ){
            if (i % 7 == 0){
                getBackground().setColor(Color.RED);
                
            }
            else if (i % 7 == 1){
                getBackground().setColor(Color.ORANGE);
                
            }
            else if (i % 7 == 2){
                getBackground().setColor(Color.YELLOW);
                
            }
            else if (i % 7 == 3){
                getBackground().setColor(Color.GREEN);
                
            }
            
            else if (i % 7 == 4){
                
                getBackground().setColor(Color.BLUE);
            }
            else if (i % 7 == 5){
                getBackground().setColor(new Color(49, 0, 102));
                
            }
            else {
                
                getBackground().setColor(new Color(32, 0, 127));
            }
            
            getBackground().fillRect(i*RECTANGLE_WIDTH,0,RECTANGLE_WIDTH,getHeight());
            
            
            
            
            
            
        }
        
    }
    /**
     * prepareWorldWhile preapares the world using a While loop
     * adds rainbow colored rects width 50 across the world
     * 
     * @param none there are no parameters
     * @return nothing is returned
     */
    private void prepareWorldWhile(){
        int j = 0;
        while( j < getWidth() / RECTANGLE_WIDTH){
            if (j % 7 == 0){
                getBackground().setColor(Color.RED);
                
            }
            else if (j % 7 == 1){
                getBackground().setColor(Color.ORANGE);
                
            }
            else if (j % 7 == 2){
                getBackground().setColor(Color.YELLOW);
                
            }
            else if (j % 7 == 3){
                getBackground().setColor(Color.GREEN);
                
            }
            
            else if (j % 7 == 4){
                
                getBackground().setColor(Color.BLUE);
            }
            else if (j % 7 == 5){
                getBackground().setColor(new Color(49, 0, 102));
                
            }
            else {
                
                getBackground().setColor(new Color(32, 0, 127));
            }
            
            
            
            
            getBackground().fillRect(j*RECTANGLE_WIDTH,0,RECTANGLE_WIDTH,getHeight());
            
            j++;
        }
    }
    /**
     * prepareWorldDoWhile preapares the world using a do while loop
     * adds rainbow colored rects width 50 across the world
     * 
     * @param none there are no parameters
     * @return nothing is returned
     */
    private void prepareWorldDoWhile(){
        int k = 0;
        do{
            if (k % 7 == 0){
                getBackground().setColor(Color.RED);
                
            }
            else if (k % 7 == 1){
                getBackground().setColor(Color.ORANGE);
                
            }
            else if (k % 7 == 2){
                getBackground().setColor(Color.YELLOW);
                
            }
            else if (k % 7 == 3){
                getBackground().setColor(Color.GREEN);
                
            }
            
            else if (k % 7 == 4){
                
                getBackground().setColor(Color.BLUE);
            }
            else if (k % 7 == 5){
                getBackground().setColor(new Color(49, 0, 102));
                
            }
            else {
                
                getBackground().setColor(new Color(32, 0, 127));
            }
            
            
            
            
            getBackground().fillRect(k*RECTANGLE_WIDTH,0,RECTANGLE_WIDTH,getHeight());
            
            k++;
        }while( k < getWidth() / RECTANGLE_WIDTH);
    }
}
