package com.discaATLAS.Blank.discaATLAS.Rolling;

import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JlistToMongoDBVersa extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JList<String> items;
	 
    public JlistToMongoDBVersa() {
        //create the model and add elements
        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement("Donuts");
        listModel.addElement("Fries");
        listModel.addElement("Burgers");
        listModel.addElement("Salats");
        listModel.addElement("Ice");
        listModel.addElement("Chicken Fingers");
        listModel.addElement("Cola");
        listModel.addElement("Jelly Beans");
 
        //create the list
        items = new JList<>(listModel);
        items.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    final List<String> selectedValuesList = items.getSelectedValuesList();
                    System.out.println(selectedValuesList);
                }
            }
        });
        
        add(new JScrollPane(items));
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Items");
        this.setSize(200, 200);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
}
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JlistToMongoDBVersa ();
            }
        });
    }
    
}
