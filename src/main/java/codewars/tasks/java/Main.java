package codewars.tasks.java;


public class Main {

    public static void main (String [] args){

        Vector3D vector = new Vector3D();
        vector.getLength(0,2,0);

        Block block = new Block(new int[]{1,2,4});
        int volume = block.getVolume();
        int surfaceArea = block.getSurfaceArea();

        LeapYears isYearLeap = new LeapYears();
        isYearLeap.isYearLeap(2004);


    }
}
