import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class GUITask extends JFrame {

	public static void main (String []args) {
		GUITask frame = new GUITask();
		frame.setVisible(true);
		frame.setSize(900,500);
		frame.setTitle("Amr");
		
		JPanel jPanel = new JPanel();
		jPanel.setSize(500,500);
		frame.add(jPanel);
		
		JMenuBar bar = new JMenuBar();
		JMenu fileJMenu = new JMenu("File ");
		JMenuItem newItem = new JMenuItem("New ");
		newItem.setAccelerator(KeyStroke.getKeyStroke('N' , KeyEvent.CTRL_MASK));
		JMenuItem openItem = new JMenuItem("Open ");
		openItem.setAccelerator(KeyStroke.getKeyStroke('O' , KeyEvent.CTRL_MASK));
		JMenuItem saveItem = new JMenuItem("Save ");
		saveItem.setAccelerator(KeyStroke.getKeyStroke('S' , KeyEvent.CTRL_MASK));
		JMenuItem ExitItem = new JMenuItem("Exit ");
		ExitItem.setAccelerator(KeyStroke.getKeyStroke('E' , KeyEvent.CTRL_MASK));
		fileJMenu.add(newItem);
		fileJMenu.add(openItem);
		fileJMenu.add(saveItem);
		fileJMenu.add(ExitItem);

		JMenu editJMenu = new JMenu("Edit");
		JMenuItem cutItem = new JMenuItem("Cut");
		JMenuItem copyItem = new JMenuItem("Copy");
		JMenuItem pasteItem = new JMenuItem("Paste");
		JMenuItem deleteItem = new JMenuItem("Delete");
		JMenuItem selectAllItem = new JMenuItem("Select All");
		editJMenu.add(cutItem);
		editJMenu.add(copyItem);
		editJMenu.add(pasteItem);
		editJMenu.add(deleteItem);
		editJMenu.add(selectAllItem);

		JMenu helpJMenu = new JMenu("Help");
		JMenuItem aboutItem = new JMenuItem("About");
    	helpJMenu.add(aboutItem);
    	aboutItem.setAccelerator(KeyStroke.getKeyStroke('A' , KeyEvent.ALT_MASK));
    	aboutItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent args) {
		        JOptionPane.showMessageDialog(frame, "This is a trial application for UI  ");	
				
			}
		}); 
    

		bar.add(fileJMenu);
		bar.add(editJMenu);
		bar.add(helpJMenu);
		
		frame.setJMenuBar(bar);


	}

	
	}

