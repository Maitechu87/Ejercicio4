public class Punt {

    private int[] coord;

    public Punt(int x, int y){
        coord = new int [2];
        if (x < 0) {
            throw new IllegalArgumentException();
        } else {
            coord[0] = x;
        }
        if (y < 0) {
            throw new IllegalArgumentException();
        } else {
            coord[1] = y;
        }
    }

    public int getX() {
        return coord[0];
    }

    public int getY(){
        return coord[1];
    }

    public void setX(int x) {
        if (x < 0) {
            throw new IllegalArgumentException();
        } else{
            this.coord[0] = x;
        }
    }
    public void setY(int y) {
        if (y < 0) {
            throw new IllegalArgumentException();
        } else {
            this.coord[1] = y;
        }
    }

    public Punt() { this(0, 0); }

    //public Punt(int x, int y) { this.x=x; this.y=y; }

    public void suma(Punt p) {
        coord[0]+=p.coord[0];
        coord[1]+=p.coord[1];
    }

}
