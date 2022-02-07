public class Square extends Shape {

    public double side;

    public Square(double side, String name) {
        super(name);
        this.side = side;
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public double getPerimeter() {
        return this.side * 4;
    }

    @Override
    public boolean equals (Object obj) {
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;

    Square square = (Square)obj;
        if (this.name.equals(square.name) &&
            this.side == square.side)
            return true;
        return false;
    }

    @Override
    public String toString() {
        return (this.name + ":" + this.side);
    }
}

