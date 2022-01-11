public class Line {
   private double slope;
   private double y_intercept;

    public Line(double slope, double y_intercept) {
        this.slope = slope;
        this.y_intercept = y_intercept;
    }
    public double getSlope() {
        return slope;
    }

    public double getY_intercept() {
        return y_intercept;
    }

    public void setSlope(double slope) {
        this.slope = slope;
    }

    public void setY_intercept(double y_intercept) {
        this.y_intercept = y_intercept;
    }
}