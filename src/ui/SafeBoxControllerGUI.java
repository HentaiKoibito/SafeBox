package ui;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.LoadException;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SafeBoxControllerGUI  {
	
	@FXML
    private Label changeMessage;
	
	@FXML
  private TextField passwordChange1;

	 @FXML
	private TextField passwordChange2;

	
	@FXML
    private Button btnChangePassword;

    @FXML
    private Button btnCloseSafeBox;
     
    @FXML
    private Button btnChange;

    @FXML
    private PasswordField passwordFirst;
    
    @FXML
    private Label firstMsg;
    
    private Stage mainStage;
    
   
    
    String defaultPassword = "000000" ;
  
	public Stage getMainStage() {
		return mainStage;
	}

	public void setMainStage(Stage mainStage) {
		this.mainStage = mainStage;
	}
	
	  @FXML
	   public void openBox(ActionEvent event) throws IOException {
		  String password = passwordFirst.getText();
		 
		  	String message="";
		  	
		  	if(password.isEmpty()) {
		  		 message="Enter a password";
		  		firstMsg.setText(message);
		  	}
		  	
		  	else if(password.equals(defaultPassword)) {
		  		
		  		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SafeBox2.fxml"));
		    	fxmlLoader.setController(this);
		    	Parent root = fxmlLoader.load();
		    	Scene scene = new Scene(root); 
		    	
		    	mainStage.setScene(scene);
		    	mainStage.setTitle("SafeBox");
		    	mainStage.show();
		  		
		  	}
		  	
		  	else {
		  		message="wrong password";
		  		firstMsg.setText(message);
		  	
		  	}
	
	   	 }
	  	public void closeSafeBox (ActionEvent event) throws IOException {
	  		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SafeBox1.fxml"));
	    	fxmlLoader.setController(this);
	    	Parent root = fxmlLoader.load();
	    	Scene scene = new Scene(root); 
	    	
	    	mainStage.setScene(scene);
	    	mainStage.setTitle("Safe Box");
	    	mainStage.show();
		  
	  }
	  	public void goToChangePassword (ActionEvent event) throws IOException {
	  		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SafeBox3.fxml"));
	    	fxmlLoader.setController(this);
	    	Parent root = fxmlLoader.load();
	    	Scene scene = new Scene(root); 
	    	
	    	mainStage.setScene(scene);
	    	mainStage.setTitle("Safe Box");
	    	mainStage.show();
	  		}
	  	
	  	public void changePassword (ActionEvent event) throws IOException {
	  		 String passwordChangeFirst = passwordChange1.getText(); 
	  		 String passwordChangeSecond = passwordChange2.getText();
	  		 String message="";

	  		 
	  		if(passwordChangeFirst.isEmpty()) {
		  		 message="Enter a password";
		  		changeMessage.setText(message);
		  	}
	  		else if (passwordChangeSecond.isEmpty()) {
		  		 message="Enter a password";
		  		changeMessage.setText(message);
		  	}
	  		
	  		else if (!passwordChangeFirst.equals(passwordChangeSecond)) {
	  			message="passwords have to be the same";
	  			changeMessage.setText(message);
	  		}
	  		
		  	else if(passwordChangeFirst.equals(passwordChangeSecond)) {
		  		 String newPassword=passwordChangeFirst;
		  		 defaultPassword = newPassword;
		  		 message="password changed successfully";
		  		 changeMessage.setText(message);
		  	}
	  		
			  	
	  		}
	  
	  	public void closeChangeSafeBox (ActionEvent event) throws IOException {
	  		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SafeBox1.fxml"));
	    	fxmlLoader.setController(this);
	    	Parent root = fxmlLoader.load();
	    	Scene scene = new Scene(root); 
	    	
	    	mainStage.setScene(scene);
	    	mainStage.setTitle("Safe Box");
	    	mainStage.show();
		 }
}

