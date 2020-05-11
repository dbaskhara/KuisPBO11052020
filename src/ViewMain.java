import java.awt.Color;
import static java.awt.SystemColor.window;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;


public class ViewMain extends JFrame {
        
	JLabel luniversitas = new JLabel("Universitas XYZ");
	
	JButton bassisten = new JButton("Assisten");
	JButton badmin = new JButton("Admin");
	
    public ViewMain() {
    	setLayout(null);
    	add(luniversitas);
    	add(bassisten);
    	add(badmin);
    	
    	luniversitas.setBounds(10,10,100,20);
    	bassisten.setBounds(10,50,100,20);
    	badmin.setBounds(10,80,100,20);
    	
    	setSize(300, 200);
    	setLocationRelativeTo(null);
    	setVisible(true);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

