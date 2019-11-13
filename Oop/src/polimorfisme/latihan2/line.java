package polimorfisme.latihan2;
public class line implements relation {
     private final double x1;
     private final double x2;
     private final double y1;
     private final double y2;
     //constructor
    public line(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    
    public double getLength(){
        double length = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        return length;
    }
    @Override
    public boolean isGreater(Object a, Object b){
        double aLength = ((line)a).getLength();
        double bLength = ((line)b).getLength();
        return(aLength > bLength);
    }
    @Override
    public boolean isLess(Object a, Object b){
        double aLength = ((line)a).getLength();
        double bLength = ((line)b).getLength();
        return (aLength < bLength);
    }
    @Override
    public boolean isEquals(Object a,Object b){
        double aLength = ((line)a).getLength();
        double bLength = ((line)b).getLength();
        return (aLength == bLength);
    }
}