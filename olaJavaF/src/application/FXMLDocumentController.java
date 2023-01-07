package application;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.event.ActionEvent;

import javafx.scene.control.Label;

public class FXMLDocumentController {
	@FXML
	private Button btnClick;
	@FXML
	private Label lblMensagem;

	// Event Listener on Button[#btnClick].onAction
	@FXML
	public void clickButton(ActionEvent event) {
		lblMensagem.setText("Mudar");
		lblMensagem.setLayoutX(185.0);
		
	}
}
