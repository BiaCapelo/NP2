package com.example.np2;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;


public class CadastroController implements Initializable {

    @FXML
    private TextField nome;

    @FXML
    private TextField cpf;

    @FXML
    private TextField altura;

    @FXML
    private TextField peso;

    @FXML
    private Button btn_cadastrar;

    @FXML
    private Button btn_consultar;

    @FXML
    public void setCadastrar(ActionEvent event) throws SQLException{

        System.out.println(nome.getText());
        System.out.println(cpf.getText());
        System.out.println(altura.getText());
        System.out.println(peso.getText());


        String nome1 = nome.getText();
        int cpf1 = Integer.parseInt(cpf.getText());
        float altura1 = Float.parseFloat(altura.getText());
        float peso1 = Float.parseFloat(peso.getText());

        DbUtils.insertRecord(nome1,cpf1,altura1,peso1);

    }




    @Override
    public void initialize(URL location, ResourceBundle resources) {
        btn_consultar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                GUIUtils.changeScene(event, "com/example/np2/consulta.fxml", "Pagina_de_Consulta");
            }
        });
    }

}