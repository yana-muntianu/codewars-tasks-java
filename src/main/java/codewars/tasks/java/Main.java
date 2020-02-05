package codewars.tasks.java;


public class Main {

    public static void main (String [] args){
        /**
         * This method counts length of a vector with given params
         */
        Vector3D vector = new Vector3D();
        vector.getLength(0,2,0);
        /**
         * This method counts block volume and surface area with given params
         */
        Block block = new Block(new int[]{1,2,4});
        int length = block.getLength();
        int height = block.getHeight();
        int width = block.getWidth();
        int volume = block.getVolume();
        int surfaceArea = block.getSurfaceArea();

        /**
         * This method verify is given year leap or not
         */
        LeapYears isYearLeap = new LeapYears();
        isYearLeap.isYearLeap(2004);


    }
}
