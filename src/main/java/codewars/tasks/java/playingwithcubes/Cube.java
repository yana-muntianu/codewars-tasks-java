package codewars.tasks.java.playingwithcubes;

public class Cube {

    public int side;
    private int volume;
    private int surface;

    public Cube(){

    }

    public Cube(int side)
    {
        this.side = side;
        this.volume = (side*side*side);
        this.surface = 6*(side*side);
    }

    public int getVolume() {
        return this.volume;
    }

    private void setVolume(int volume) {
        this.volume = Math.abs(volume);
    }

    public int getSurface() {
        return this.surface;
    }

    private void setSurface(int surface) {
        this.surface = Math.abs(surface);
    }
}
