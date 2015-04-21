import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;


public class SumOfTwo implements ActionListener {

private JFrame frame;
private JPanel panel;
private JLabel label1;
private JLabel label2;
private JLabel output;
private JTextField TextField1;
private JTextField TextField2;
private JButton button;

public SumOfTwo(){
	frame = new JFrame("Calculator");
	frame.setVisible(true);
	frame.setSize(800, 600);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	panel = new JPanel();
	panel.setBackground(Color.RED);
	
	label1 = new JLabel();
	label1.setText("Number1: ");
	label1.setForeground(Color.DARK_GRAY);
	
	
	
	label2 = new JLabel();
	label2.setText("Number2: ");
	label2.setForeground(Color.ORANGE);
	
	output = new JLabel();
	output.setText("---------");
	output.setForeground(Color.BLUE);
	
	

	TextField1 = new JTextField(2);
	
	TextField2 = new JTextField(2);
	
	
	button = new JButton("Find Sum");
	button.addActionListener(this);

	
	panel.add(label1);
	panel.add(TextField1);
	panel.add(label2);
	panel.add(TextField2);
	panel.add(button);
	panel.add(output);
	
	frame.add(panel);
}

public void actionPerformed(ActionEvent e){
	double num1 = Double.parseDouble(TextField1.getText());
	double num2 =Double.parseDouble(TextField2.getText());
	double sum = num1 + num2;
	
	output.setText(String.valueOf(sum));
}


}