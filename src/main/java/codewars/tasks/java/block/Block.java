package codewars.tasks.java.block;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Block {

    private int width;
    private int length;
    private int height;
    private static final Logger LOG = LogManager.getLogger(Block.class.getName());

    public Block(int[] measurements) {
        if(measurements.length == 3) {
            this.width = measurements[0];
            this.length = measurements[1];
            this.height = measurements[2];

        }
    }
    /**
     * This method counts block volume with given params
     */
    public int getVolume() {

        LOG.info("Running getVolume() method");
        int volume = this.width * this.length * this.height;

        return volume; }
    /**
     * This method counts block surface area with given params
     */
    public int getSurfaceArea(){

        LOG.info("Running getSurfaceArea() method");
        int surfaceArea = 2*(this.width*this.length)+2*(this.length*this.height)+2*(this.height*this.width);

        return surfaceArea;
    }
}
