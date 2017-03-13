package scratch;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;

import parts.Eye;

public class Test1 extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		Group root = new Group();
		Scene scene = new Scene(root, 500, 500, Color.BLACK);

    	Rectangle rect1 = new Rectangle(10, 10, 200, 200);
    	rect1.setFill(Color.BLUE);
    	
        Rectangle rect2 = new Rectangle(60, 60, 200, 200);
        rect2.setFill(Color.TRANSPARENT);
        rect2.setStroke(Color.RED);
        rect2.setStrokeWidth(10);
        
        Circle circ1 = new Circle(20, 20, 10);
        circ1.setFill(Color.TRANSPARENT);
        circ1.setStroke(Color.GREEN);
        circ1.setStrokeWidth(3);
        
        Eye eyeL = new Eye();
    	
    	root.getChildren().addAll(rect1, rect2, circ1);
    	for(Shape s : eyeL.getListOfShape()) root.getChildren().add(s);
    	
    	primaryStage.setScene(scene);
    	primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
