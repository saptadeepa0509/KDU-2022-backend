
class ParallelLineException extends Exception {
    public ParallelLineException(String message) {
        super(message);
    }
}
public class Program6 {
    public static void main(String[] args) {
        Line l1 = new Line(1, 2);
        Line l2 = new Line(1, 3);
        try{
            if(l1.getSlope()==l2.getSlope())
            {
                throw new ParallelLineException("Lines are Parallel");
            }
            double y = (l1.getSlope()* l2.getY_intercept() - l2.getSlope() * l1.getY_intercept()) / (l1.getSlope() - l2.getSlope());
            double x = (y - l1.getY_intercept()) / l1.getSlope();
            System.out.println(x +" "+y);
        }
        catch (ParallelLineException e){
            System.out.println(e);
        }
    }
}

