import javafx.application.Application;

import javafx.scene.Scene;

import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class JavaFXTemplate extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	//feel free to remove the starter code from this method
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("umm...Zoo?");
		Dragon myDragon = new Dragon();
		Dog myDog = new Dog();
		Cat myCat = new Cat();

		Label l1 = new Label(myDragon.title());
		Button bDrag = new Button("noise?");
		Button bDrag2 = new Button("pet");
		Label ldragon = new Label("");
		bDrag.setOnAction((ActionEvent)->{
				ldragon.setText(myDragon.speak());
		});
		bDrag2.setOnAction((ActionEvent)->{
			ldragon.setText(myDragon.attack());
		});

		Label l2 = new Label(myDog.name());
		Button bDog = new Button("noise?");
		Button bDog2 = new Button("pet");
		Label lDog = new Label("");
		bDog.setOnAction((ActionEvent)->{
			lDog.setText(myDog.roar());
		});
		bDog2.setOnAction((ActionEvent)->{
			lDog.setText(myDog.pet());
		});

		Label l3 = new Label(myCat.name());
		Button bCat = new Button("noise?");
		Button bCat2 = new Button("pet");
		Label lCat = new Label("");
		bCat.setOnAction((ActionEvent)->{
			lCat.setText(myCat.roar());
		});
		bCat2.setOnAction((ActionEvent)->{
			lCat.setText(myCat.pet());
		});

		VBox vb = new VBox(l1,bDrag2,bDrag,ldragon,l2,bDog,bDog2,lDog,l3,bCat,bCat2,lCat);
		vb.setStyle("-fx-font-family: Courier New;");
		Scene scene = new Scene(vb, 700,700);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
