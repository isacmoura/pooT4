package locacao.controls;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ControllerPrincipal {
	@FXML
	StackPane stack;

	public void telaCliente() throws Exception{
		Stage outraTela = new Stage();
		
		Parent formCliente = FXMLLoader.load(getClass().getResource("../view/FormCliente.fxml"));
		
		outraTela.setTitle("tela de cliente");
		outraTela.setScene(new Scene(formCliente, 530, 550));
		outraTela.show();
	}
	
	public void telaAtor() throws Exception{
		Stage outraTela = new Stage();
		
		Parent formAutor = FXMLLoader.load(getClass().getResource("../view/FormAtor.fxml"));
		
		outraTela.setTitle("Cadastro de ator");
		
		Scene tela = new Scene(formAutor, 530, 200);
		
		outraTela.setScene(tela);
		outraTela.show();
	}
	
	public void telaGenero() throws Exception{
		Stage outraTela = new Stage();
		
		Parent formGenero = FXMLLoader.load(getClass().getResource("../view/FormGenero.fxml"));
		
		outraTela.setTitle("Cadastro de g�nero");
		
		Scene tela = new Scene(formGenero, 530, 200);
		
		outraTela.setScene(tela);
		outraTela.show();
	}
	
	public void telaProdutor() throws Exception{
		Stage outraTela = new Stage();
		
		Parent formProdutor = FXMLLoader.load(getClass().getResource("../view/FormProdutor.fxml"));
		
		outraTela.setTitle("Cadastro de produtor");
		
		Scene tela = new Scene(formProdutor, 530, 200);
		
		outraTela.setScene(tela);
		outraTela.show();
	}
	
	public void telaGravadora() throws Exception{
		Stage outraTela = new Stage();
		
		Parent formGravadora = FXMLLoader.load(getClass().getResource("../view/FormGravadora.fxml"));
		
		outraTela.setTitle("Cadastro de gravadora");
		
		Scene tela = new Scene(formGravadora, 530, 200);
		
		outraTela.setScene(tela);
		outraTela.show();
	}
	
	public void telaDVD() throws Exception{
		Stage outraTela = new Stage();
		
		Parent formGravadora = FXMLLoader.load(getClass().getResource("../view/FormDVD.fxml"));
		
		outraTela.setTitle("Cadastro de DVD'S");
		
		Scene tela = new Scene(formGravadora, 600, 600);
		
		outraTela.setScene(tela);
		outraTela.show();
	}
	
	public void telaAtendente() throws Exception{
		Stage outraTela = new Stage();
		
		Parent formAtendente = FXMLLoader.load(getClass().getResource("../view/FormAtendente.fxml"));
		
		outraTela.setTitle("Cadastro de atendente");
		
		Scene tela = new Scene(formAtendente, 530, 600);
		
		outraTela.setScene(tela);
		outraTela.show();
	}
	
	public void telaAluguel() throws Exception{
		Stage outraTela = new Stage();
		
		Parent formAluguel = FXMLLoader.load(getClass().getResource("../view/FormAluguel.fxml"));
		
		outraTela.setTitle("Gerenciamento de Alugu�is");
		
		Scene tela = new Scene(formAluguel, 600, 600);
		
		outraTela.setScene(tela);
		outraTela.show();
	}
	
	public void sobre(){
		Alert a = new Alert(AlertType.INFORMATION, "Desenvolvido por:\n\tBruno de Carvalho\n\tIsac Moura", ButtonType.CLOSE);
		a.show();
	}
	
}
