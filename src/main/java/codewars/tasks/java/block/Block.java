package codewars.tasks.java.block;

public class Block {

    private int width;
    private int length;
    private int height;

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
            int volume = this.width * this.length * this.height;

            System.out.println(String.format("Block volume with params: %d, %d, %d is  %d", this.width, this.length , this.height, volume));
            return volume; }
    /**
     * This method counts block surface area with given params
     */
    public int getSurfaceArea(){
        int surfaceArea = 2*(this.width*this.length)+2*(this.length*this.height)+2*(this.height*this.width);

        System.out.println(String.format("Block surface area with params:  %d, %d, %d is  %d",this.width, this.length , this.height, surfaceArea));

        return surfaceArea;
    }
}
