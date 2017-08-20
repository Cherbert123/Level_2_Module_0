package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	ArrayList<String> people = new ArrayList();
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	JButton AddButton = new JButton();
	JButton ViewButton = new JButton();
	JButton RemoveButton = new JButton();
	String list = "";
	public static void main(String[] args){
		GuestBook run = new GuestBook();
		run.Buttons();
		
	}
	public void Buttons() {
		AddButton.setText("Add Guest");
		ViewButton.setText("View List");
		RemoveButton.setText("Remove");
		AddButton.addActionListener(this);
		ViewButton.addActionListener(this);
		RemoveButton.addActionListener(this);
		frame.add(panel);
		frame.setVisible(true);
		panel.add(AddButton);
		panel.add(ViewButton);
		panel.add(RemoveButton);
		frame.pack();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == AddButton) {
			people.add(JOptionPane.showInputDialog("Enter A Name:"));
		}
		if(e.getSource() == ViewButton) {
			list = "";
			for(int i = 1; i < people.size() + 1; i++){
				list = list + "Guest #" + i + " " + people.get(i - 1) + "\n";
			}
			JOptionPane.showMessageDialog(null, list);
		}
		if(e.getSource() == RemoveButton) {
			people.remove(Integer.parseInt(JOptionPane.showInputDialog("Enter Guest Number:")) - 1);
		}
		
	}
}
