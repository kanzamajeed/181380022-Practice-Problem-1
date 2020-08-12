public class Rectangle{
    private double width;
    private double height;

    public Rectangle(){

    }
    public Rectangle(double w,double h){
        this.width=w;
        this.height=h;
    }
    public void setWidth(double w){
        this.width=w;
    }
    public double getWidth(){
        return width;
    }
    public void setHeight(double h){
        this.height=h;
    }
    public double getHeight(){
        return height;
    }
    public double getArea(){
        double area=height*width;
        return area;
    }
    public double getPerimeter(){
        double perimeter=2*(height*width);
        return perimeter;
    }

}