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

//        public int getWidth() {
//            return width;
//        }
//
//        public int getLength() {
//            return length;
//        }
//
//        public int getHeight() {
//            return height;
//        }

    public int getVolume() {
            int volume = this.width * this.length * this.height;

            System.out.println("Block volume with params "+length+" "+width+" "+height+" is "+volume);
//            String.format("Block volume with params: l:%d w:%d h:%d v:%d", this.width * this.length * this.height, volume);

            return volume; }

        public int getSurfaceArea(){
            int surfaceArea = 2*(this.width*this.length)+2*(this.length*this.height)+2*(this.height*this.width);

            System.out.println("Block surface area with params "+length+" "+width+" "+height+" is "+surfaceArea);
//            String.format("Block surface area with params:  l:%d w:%d h:%d s:%d"+2*(this.width*this.length)+2*(this.length*this.height)+2*(this.height*this.width),surfaceArea);

            return surfaceArea;
        }
}
