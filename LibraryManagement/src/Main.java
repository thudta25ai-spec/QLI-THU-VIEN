import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class LibraryManagement extends Application {

    BorderPane root = new BorderPane();

    @Override
    public void start(Stage stage) {

        Label title = new Label("📚 LIBRARY MANAGEMENT SYSTEM");
        title.setFont(Font.font(24));
        title.setStyle("-fx-text-fill: #6A5ACD; -fx-font-weight: bold;");

        HBox header = new HBox(title);
        header.setAlignment(Pos.CENTER);
        header.setPadding(new Insets(15));
        header.setStyle("-fx-background-color: #F3EFFF;");
        root.setTop(header);

        VBox menu = new VBox(15);
        menu.setPadding(new Insets(20));
        menu.setStyle("-fx-background-color: #E6E6FA;");

        Button b1 = new Button("📖 Quản lý sách");
        Button b2 = new Button("👤 Quản lý độc giả");
        Button b3 = new Button("🔄 Mượn / Trả");

        menu.getChildren().addAll(b1, b2, b3);
        root.setLeft(menu);

        Label welcome = new Label("🌸 Chào mừng đến với thư viện 🌸");
        welcome.setFont(Font.font(18));
        root.setCenter(new StackPane(welcome));

        Scene scene = new Scene(root, 900, 550);
        stage.setScene(scene);
        stage.setTitle("Library System");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
