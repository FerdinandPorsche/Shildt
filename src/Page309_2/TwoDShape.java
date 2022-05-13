package Page309_2;

abstract class TwoDShape {
    private double width;
    private double height;
    private String name;

    public TwoDShape() {
        width = height = 0.0;
        name = "none";
    }

    public TwoDShape(double width, double height, String name) {
        this.width = width;
        this.height = height;
        this.name = name;
    }

    public TwoDShape(double x, String name){
        this.width = this.height = x;
        this.name = name;
    }

    public TwoDShape(TwoDShape ob){
        this.width = ob.width;
        this.height = ob.height;
        this.name = ob.name;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    void showDim(){
        System.out.println("Ширина и высота " + width + " и " + height);
    }

    abstract double area();
}
