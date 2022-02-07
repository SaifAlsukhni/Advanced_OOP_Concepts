public class Shape {
    protected String name;
    public String getName(){ return this.name;}
    public void setName(String name){this.name = name;}
    public double getArea(){return 0.0;}
    public double getPerimeter(){return 0.0;}

    //constructor
    public Shape(String name) {
        this.name = name;
    }
}
