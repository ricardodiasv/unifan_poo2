package org.usuario.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.usuario.model.Usuario;

public class MainController {
    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtPassword;

    @FXML
    private Button btnSalvar;
    private Usuario usuario;
    //===========================================================================================================



    @FXML
    public void onBtnSalvarAction(){
        this.usuario = new Usuario();
        usuario.setNome( txtNome.getText() );
        usuario.setSenha( txtPassword.getText() );
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("Senha: " + usuario.getSenha());
    }
}