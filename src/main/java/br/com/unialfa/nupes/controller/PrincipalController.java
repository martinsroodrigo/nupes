package br.com.unialfa.nupes.controller;

import java.io.IOException;
import java.net.URL;

import com.jfoenix.controls.JFXButton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class PrincipalController {
	   @FXML
	    private AnchorPane PanePrincipal;

	    @FXML
	    private JFXButton btnDeslogar;

	    @FXML
	    private Button btnCadastro;

	    @FXML
	    private Button btnDocumentos;

	    @FXML
	    private Button btnRelatorio;

	@FXML
	void cadastrar(ActionEvent event) throws IOException {
		URL arquivoFXML;
		arquivoFXML = getClass().getResource("../view/FXMLCadastro.fxml");
		Parent fxmlParent = (Parent) FXMLLoader.load(arquivoFXML);
		PanePrincipal.getChildren().clear();
		PanePrincipal.getChildren().add(fxmlParent);
		//Scene scene = new Scene(fxmlParent, 774, 521);

	}

}