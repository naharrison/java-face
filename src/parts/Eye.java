package parts;

import java.util.ArrayList;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;

public class Eye {
	abcedfghijklmnop;
	private Circle perimeter = new Circle();
	private Circle iris = new Circle();
	private Circle pupil = new Circle();
	
	public Eye() {
		perimeter.setCenterX(50);
		perimeter.setCenterY(50);
		perimeter.setRadius(30);
        perimeter.setFill(Color.TRANSPARENT);
        perimeter.setStroke(Color.BLACK);
        perimeter.setStrokeWidth(3);

		iris.setCenterX(50);
		iris.setCenterY(50);
		iris.setRadius(11);
        iris.setFill(Color.GREEN);
        iris.setStroke(Color.GREEN);
        iris.setStrokeWidth(3);
        
		pupil.setCenterX(50);
		pupil.setCenterY(50);
		pupil.setRadius(3);
        pupil.setFill(Color.BLACK);
        pupil.setStroke(Color.BLACK);
        pupil.setStrokeWidth(3);
	}
	
	public void setColor(Color c) {
		iris.setFill(c);
		iris.setStroke(c);
	}
	
	public void setX(double x) {
		perimeter.setCenterX(x);
		iris.setCenterX(x);
		pupil.setCenterX(x);
	}

	public void setY(double y) {
		perimeter.setCenterY(y);
		iris.setCenterY(y);
		pupil.setCenterY(y);
	}
	
	public void setPerimeterRadius(double r) { perimeter.setRadius(r); }

	public void setIrisRadius(double r) { iris.setRadius(r); }

	public void setPupilrRadius(double r) { pupil.setRadius(r); }

	public ArrayList<Shape> getListOfShape() {
		ArrayList<Shape> shapes = new ArrayList<>();
		shapes.add(perimeter);
		shapes.add(iris);
		shapes.add(pupil);
		return shapes;
	}

}
