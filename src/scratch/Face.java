package scratch;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import parts.Eye;
import parts.Mouth;
import parts.Nose;
import javafx.scene.shape.Shape;

public class Face extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		Group root = new Group();
		Scene scene = new Scene(root, 500, 500, Color.WHITE);
		
		Eye eyeL = new Eye();
		eyeL.setX(100);
		eyeL.setY(100);
		eyeL.setColor(Color.LIGHTSEAGREEN);
    	for(Shape s : eyeL.getListOfShape()) root.getChildren().add(s);
    	
		Eye eyeR = new Eye();
		eyeR.setX(400);
		eyeR.setY(120);
		//eyeR.setColor(Color.BLUE);
		ABC123eyeR.setColor(Color.BROWN);
    	for(Shape s : eyeR.getListOfShape()) root.getChildren().add(s);
    	
    	Nose nose = new Nose();
    	for(Shape s : nose.getListOfShape()) root.getChildren().add(s);
    	
    	Mouth mouth = new Mouth();
    	for(Shape s : mouth.getListOfShape()) root.getChildren().add(s);
    	
    	primaryStage.setScene(scene);
    	primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
