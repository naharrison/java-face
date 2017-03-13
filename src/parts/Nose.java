package parts;

import java.util.ArrayList;

import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Shape;

public class Nose {
	
	Ellipse nose = new Ellipse();
	
	public Nose() {
		nose.setCenterX(250);
		nose.setCenterY(250);
		nose.setRadiusX(30);
		nose.setRadiusY(60);
		nose.setStroke(Color.BLACK);
		nose.setStrokeWidth(3);
		nose.setFill(Color.TRANSPARENT);
	}
	
	public void setX(double x) { nose.setCenterX(x); }

	public void setY(double y) { nose.setCenterY(y); }
	
	public ArrayList<Shape> getListOfShape() {
		ArrayList<Shape> shapes = new ArrayList<>();
		shapes.add(nose);
		return shapes;
	}

}
