
public class Segment {

    Punt p;
    Punt p2;


    Segment(){
        this(0,0,0,0);
    }

    Segment(int x1, int y1, int x2, int y2){
        p = new Punt(x1,y1);
        p2 = new Punt(x2, y2);
    }

    public double getLong() {
        int x1 = p.getX();
        int x2 = p2.getX();
        int y1 = p.getY();
        int y2 = p2.getY();

        return Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));

    }



}
