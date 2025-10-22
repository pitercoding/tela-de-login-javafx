package app;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LoginApp extends Application {

    @Override
    public void start(Stage stage) {
        Label labelUsuario = new Label("Usuário");
        TextField campoUsuario = new TextField();
        campoUsuario.setPromptText("Digite seu usuário");

        Label labelSenha = new Label("Senha");
        PasswordField campoSenha = new PasswordField();
        campoSenha.setPromptText("Digite sua senha");

        Label resultadoLogin = new Label();

        Button botaoLogin = new Button("Login");
        botaoLogin.setOnAction(e -> {
            String usuario = campoUsuario.getText();
            String senha = campoSenha.getText();

            if (usuario.equals("piter") && senha.equals("123456")) {
                resultadoLogin.setText("Login Sucessful!");
                resultadoLogin.setStyle("-fx-text-fill: green;");
            } else {
                resultadoLogin.setText("Login Failed!");
                resultadoLogin.setStyle("-fx-text-fill: red;");
            }
        });

        VBox layout = new VBox(20, labelUsuario, campoUsuario, labelSenha, campoSenha, botaoLogin, resultadoLogin);
        layout.setAlignment(Pos.CENTER);
        layout.setStyle("-fx-background-color: #2b2b2b; -fx-padding: 20; -fx-font-size: 14px;");

        labelUsuario.setStyle("-fx-text-fill: white;");
        labelSenha.setStyle("-fx-text-fill: white;");
        resultadoLogin.setStyle("-fx-text-fill: white;");

        Scene scene = new Scene(layout, 300, 300);
        stage.setTitle("Sistema de Login");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

