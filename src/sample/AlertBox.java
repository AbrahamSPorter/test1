package sample;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class AlertBox {
    public static void display(String title,String message){
       Stage window = new Stage();
       window.initModality(Modality.APPLICATION_MODAL); // makes user deal with this first
       window.setTitle(title);
       window.setMinWidth(250);
       Label label = new Label(message);
       Button closeButton = new Button("Close this window");
       closeButton.setOnAction(e -> window.close());

       VBox layout = new VBox(10);
       layout.getChildren().addAll(label,closeButton);
       layout.setAlignment(Pos.CENTER); // aligns to center
       Scene scene = new Scene(layout);
       window.setScene(scene);
       window.showAndWait(); // because the application modal










    }

}
