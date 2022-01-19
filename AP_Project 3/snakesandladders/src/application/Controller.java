package application;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import application.snakes;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import application.ladder;
import application.Pair;
public class Controller {

    @FXML
    private Button exit;

    @FXML
    private AnchorPane scenepane;

    private Stage stage;
    private Scene scene;
    private Parent root;
    private int step;
    
    public void switchtoscene1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Objectcontrollers1.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void switchtoscene2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Objectcontroller.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void logout(ActionEvent event){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("LOGOUT");
        alert.setHeaderText("You are about to EXIT");
        alert.setContentText("Do you want to Quit Anyway??");

        if(alert.showAndWait().get() == ButtonType.OK) {
            stage = (Stage) scenepane.getScene().getWindow();
            System.out.println("logout");
            stage.close();
        }
    }

    Random random = new Random();
    @FXML
    private ImageView diceimage;

    @FXML
    private  Button rollbutton;


	  	@FXML
	    void roll(ActionEvent event) {
	  		rollbutton.setDisable(true);
		       Thread req = new Thread(new Runnable() {
		           @Override
		           public void run() {
		                int x=1;
		                for(int i=0;i<14;i++){
		                    Random random = new Random();
		                    x = random.nextInt(6)+1;
		                    File file = new File("src/application/Dice/dice"+ x +".png");
		                    diceimage.setImage(new Image(file.toURI().toString()));
		                   
		                    try {
		                        Thread.sleep(50);
		                    } catch (InterruptedException e) {
		                        e.printStackTrace();
		                    }
		                }
		                step = x;
		                
		           }
		           });
	       
			        req.start();
			    }
}	  		
//	      int dice_no = 0;
//	        while(true){
//	            Random random = new Random();
//	            dice_no = random.nextInt(7);
//	            if(dice_no!= 0)
//	                break;
//	        }
//	        
//	        System.out.print(dice_no);
//	        String location = "src/application/Dice/dice" + dice_no + ".png";
//	        File file = new File(location);
//	        diceimage.setImage(new Image(file.toURI().toString()));
//	  }

//	  	@FXML
//	  	private ImageView Player_1;
//	    private ImageView Player_2;
//	    int base_x = 140;
//	    int base_y = 420;
//	   @Override
//	    public void initialize(URL arg0,  ResourceBundle arg1) {
//	    	TranslateTransition translate_ = new TranslateTransition();
//	    	translate_.setNode(Player_1);
//	    	translate_.setNode(Player_2);
//	    	translate_.setByX(base_x);
//	    	translate_.setByY(base_y);
//	    	translate_.play();
////	    	adding ladder1;
//	    	ladder l = new ladder();
//	    	
//	    	Pair p1 = new Pair(5,34);
//	    	
//	    	l.setLadder(0, p1);
//	    		
////	    	adding ladder2;
//	    	Pair p2 = new Pair(7,36);
//	    	l.setLadder(1, p2);
//	    	
//
////	    	adding ladder3;
//	    	Pair p3 = new Pair(9,31);
//	    
//	    	l.setLadder(2, p3);
//
////	    	adding ladder4;
//	    	Pair p4 = new Pair(13,52);
//	    	
//	    	l.setLadder(3, p4);
//
////	    	adding ladder5;
//	    	Pair p5 = new Pair(20,23);
//	    	
//	    	l.setLadder(4, p5);
//
////	    	adding ladder6;
//	    	Pair p6 = new Pair(43,87);
//	    	
//	    	l.setLadder(5, p6);
//
////	    	adding ladder7;
//	    	Pair p7 = new Pair(68,97);
//	    	
//	    	l.setLadder(6, p7);
//
////	    	adding ladder8;
//	    	Pair p8 = new Pair(70,89);
//	    	
//	    	l.setLadder(7, p8);
//
////	    	adding ladder9;
//	    	Pair p9 = new Pair(74,92);
//	    	
//	    	l.setLadder(8, p9);
//
////	    	adding ladder10;
//	    	Pair p10 = new Pair(80,90);
//	    	
//	    	l.setLadder(9, p10);
//
//	    	snakes s = new snakes();
//	    	
////	    	adding snake1
//	    	
//	    	Pair p1_ = new Pair(60,3);
//	    	
//	    	s.setIndex(0, p1_);
//	    		
////	    	adding snake2;
//	    	Pair p2_ = new Pair(33,10);
//	    	s.setIndex(1, p2_);
//	    	
//
////	    	adding snake3;
//	    	Pair p3_ = new Pair(56,14);
//	    
//	    	s.setIndex(2, p3_);
//
////	    	adding snake4;
//	    	Pair p4_ = new Pair(40,17);
//	    	
//	    	s.setIndex(3, p4_);
//
////	    	adding snake5;
//	    	Pair p5_ = new Pair(79,41);
//	    	
//	    	s.setIndex(4, p5_);
//
////	    	adding snake6;
//	    	Pair p6_ = new Pair(95,47);
//	    	
//	    	s.setIndex(5, p6_);
//
////	    	adding snake7;
//	    	Pair p7_ = new Pair(93,50);
//	    	
//	    	s.setIndex(6, p7_);
//
////	    	adding snake8
//	    	Pair p8_ = new Pair(99,77);
//	    	
//	    	s.setIndex(7, p8_);
//
////	    	adding snake9
//	    	Pair p9_ = new Pair(63,25);
//	    	
//	    	s.setIndex(8, p9_);
//
//	    	
//	    	while((base_x>=140 && base_y<=-300))
//	    	{
//	    		TranslateTransition translate = new TranslateTransition();
//	        	translate.setNode(Player_1);
//	    		
//	        	if(base_x<=490)
//	        	{
//	        		
//	        		translate.setByX(base_x+step*70);
//	        		base_x = base_x+step*70;
//	            	translate.setByY(base_y);
//	            	translate.play();
//	        	}
//	        	else if(base_x<=140 && (base_y>-300||base_y<-230))
//	        	{
//	        		end.result.settranslate(1120);
//	        		Alert.display(title:"Quest Completed" ,message: "You are the champion");
//	        		
//	        	}
//	        	else {
//	        		int sub = Math.abs(1120-(base_x+step*70));
//	        		int new_step = (int) sub/70;
//	        		System.out.println("Con2");
//	        		if(1120-(base_x+step*70)<0)
//	        		{
//	        			step = step-new_step;
//	        			base_x = 1120;
//	        			base_x = base_x-step*70;
//	        			translate.setByX(base_x);
//	            		base_y = base_y+70;
//	                	translate.setByY(base_y);
//	                	translate.play();
//	        		}
//	        	}
//	    	}
//	   }
//}
//
////


	    



       
		