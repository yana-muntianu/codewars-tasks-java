package codewars.tasks.java.action;

import codewars.tasks.java.block.Block;

public class BlockExecution {

    public static void main (String [] args){

        Block block = new Block(new int[]{1,2,4});
        int volume = block.getVolume();
        int surfaceArea = block.getSurfaceArea();
    }
}
