package codewars.tasks.java;

public class Block {

    private int width;
    private int length;
    private int height;

    Block(int[] measurements) {
        if(measurements.length == 3) {
            this.width = measurements[0];
            this.length = measurements[1];
            this.height = measurements[2];
        }
    }

    /**
     * Returns Vector width
     */
    public int getWidth() {
            return width;
        }
    /**
     * Returns Vector length
     */
    public int getLength() {
        return length;
    }
    /**
     * Returns Vector height
     */
     public int getHeight() {
        return height;
    }
    /**
     * This method counts block volume with given params
     */
    public int getVolume() {
        int volume = getWidth()*getLength()*getHeight();
        System.out.println("Block volume with params "+length+" "+width+" "+height+" is "+volume);
        return volume;
    }
    /**
     * This method counts block surface area with given params
     */
    public int getSurfaceArea(){
        int surfaceArea = 2*(getLength()*getWidth())+2*(getLength()*getHeight())+2*(getHeight()*getWidth());
        System.out.println("Block surface area with params "+length+" "+width+" "+height+" is "+surfaceArea);return surfaceArea;
    }
}
