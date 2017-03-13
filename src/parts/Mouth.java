package parts;

import java.util.ArrayList;

import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Shape;

public class Mouth {
	
	Arc mouth = new Arc();
	
	public Mouth() {
		mouth.setType(ArcType.OPEN);
		mouth.setCenterX(250);
		mouth.setCenterY(350);
		mouth.setRadiusX(150);
		mouth.setRadiusY(50);
		mouth.setStartAngle(180);
		mouth.setLength(160);
	}

	public ArrayList<Shape> getListOfShape() {
		ArrayList<Shape> shapes = new ArrayList<>();
		shapes.add(mouth);
		return shapes;
	}

}
