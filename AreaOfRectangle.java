public class AreaOfRectangle{


private double height;

private double width;



public double getHeight() {

return height;

}

public void setHeight(double height) {

this.height = height;

}


public double getWidth() {

return width;

}

public void setWidth(double width) {

this.width = width;

}

public double getArea() {

return this.height * this.width;

}

public void display() {

System.out.println("Height: " + this.height);

System.out.println("Width: " + this.width);

System.out.println("Area: " + getArea());

}

}