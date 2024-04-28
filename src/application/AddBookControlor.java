package application;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.Window;



public class AddBookControlor implements Initializable{
	


	    @FXML
	    private TextField email;

	    @FXML
	    private TextField prenom;
	    

	    @FXML
	    private TextField nom;

	    @FXML
	    private TableView<Person> table;

	    @FXML
	    private TableColumn<Person, String> Tprenom;

	    @FXML
	    private TableColumn<Person, String> Tnom;

	    @FXML
	    private TableColumn<Person,String> Temail;
	    
	    @FXML
	    private Button quitter;
	    
	    private DataClass data =new DataClass();

		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			Tnom.setCellValueFactory(new PropertyValueFactory<Person, String>("nom2"));
			Tprenom.setCellValueFactory(new PropertyValueFactory<Person, String>("prenom2"));
			Temail.setCellValueFactory(new PropertyValueFactory<Person, String>("email2"));
			Tnom.setCellFactory(TextFieldTableCell.forTableColumn());
			Tprenom.setCellFactory(TextFieldTableCell.forTableColumn());
		    Temail.setCellFactory(TextFieldTableCell.forTableColumn());
			
		}
		
		private void showAlert(String message) {
	        Alert alert = new Alert(AlertType.ERROR);
	        alert.setTitle("Erreur");
	        alert.setHeaderText(null);
	        alert.setContentText(message);
	        alert.showAndWait();
	    }
		
		
		
		@FXML
		protected void add(ActionEvent event)
		{
			String nom1=nom.getText();
			String prenom1=prenom.getText();
			String email1=email.getText();
			
			if (nom1.isEmpty() || prenom1.isEmpty() || email1.isEmpty()) {
	            showAlert("Veuillez remplir tous les champs.");
	            return;
	        }
			table.getItems().add(new Person(nom1,prenom1,email1));
		
		}
		
		
		@FXML
		protected void remove(ActionEvent event)
		{
			Person selected=table.getSelectionModel().getSelectedItem();
			table.getItems().remove(selected);
			
		}
		
		@FXML
		protected void importbtn(ActionEvent event)
		{
			for(Person p : data.getImportList()) {
	    		table.getItems().add(p);
		}
		
		}
		@FXML
		protected void exportbtn(ActionEvent event) {
	    	List<Person> p = table.getItems();
	    	data.setExportList(p);
	    	System.out.println(data.getExportList());
		}
		
		@FXML
		protected void quitter(ActionEvent event)
		{

		Platform.exit();

		}
}

