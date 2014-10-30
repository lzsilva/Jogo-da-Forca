package testes;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import gui.frames.FramePrincipal;

public class TesteForcaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
            // Set System L&F
	        UIManager.setLookAndFeel(
	            UIManager.getSystemLookAndFeelClassName());
	    } 
	    catch (UnsupportedLookAndFeelException e) {
	       // handle exception
	    }
	    catch (ClassNotFoundException e) {
	       // handle exception
	    }
	    catch (InstantiationException e) {
	       // handle exception
	    }
	    catch (IllegalAccessException e) {
	       // handle exception
	    }
		FramePrincipal framePrincipal = new FramePrincipal();
	}

}
