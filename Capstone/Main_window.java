import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;

import java.awt.Button;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Main_window {

	private JFrame frmHelloTina;
	private Button button;
	private JFrame frmSecondPanel;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_window window = new Main_window();
					window.frmHelloTina.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main_window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHelloTina = new JFrame();
		frmHelloTina.setTitle("Hello Tina");
		frmHelloTina.setBounds(100, 100, 518, 350);
		frmHelloTina.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
			frmSecondPanel = new JFrame();
			frmSecondPanel.setTitle("Second panel");
			frmSecondPanel.setBounds(100, 100, 450, 300);
			frmSecondPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			scrollPane = new JScrollPane();
			scrollPane.setToolTipText("Hello everybody  test ........................................................................................................................................");
			scrollPane.setViewportBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
			frmSecondPanel.getContentPane().add(scrollPane, BorderLayout.CENTER);

		
		button = new Button("New button");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmSecondPanel.setVisible(true);				
			}
		});
		button.setForeground(Color.DARK_GRAY);
		button.setBackground(new Color(255, 0, 255));
		frmHelloTina.getContentPane().add(button, BorderLayout.CENTER);
	}

	public Button getButton() {
		return button;
	}
}
