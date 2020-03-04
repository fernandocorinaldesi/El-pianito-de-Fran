package main;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import controller.Controller;
import controller.MainController;
import model.Model;
import view.SwingView;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 try {
		        UIManager.setLookAndFeel(new NimbusLookAndFeel());
		      } catch (UnsupportedLookAndFeelException e) {
		        Logger log = Logger.getGlobal();
		        log.log(Level.INFO, "No NimbusLookAndFeel");
		      }
	
		 
		Model m=new Model();
		SwingView v=new SwingView();
		Controller controller=new MainController(v,m);
		controller.openView();

	}

}
