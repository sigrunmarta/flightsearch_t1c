package flightsearch;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Flight_interface extends JFrame {

	private JPanel contentPane;
	private JTextField txt_fromAirport;
	private JTextField txt_toAirport;
	private JTextField txt_dateDeparture;
	private JTextField txt_nr_passengers;
	private JTextField txt_class_type;
	private JTextField txt_dateArrival;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Flight_interface frame = new Flight_interface();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Flight_interface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lbl_DepartureAirport = new JLabel("From :");
		lbl_DepartureAirport.setBounds(36, 118, 31, 14);
		panel.add(lbl_DepartureAirport);
		
		JLabel lbl_ArrivalAirport = new JLabel("To : ");
		lbl_ArrivalAirport.setBounds(176, 118, 31, 14);
		panel.add(lbl_ArrivalAirport);
		
		txt_fromAirport = new JTextField();
		txt_fromAirport.setBounds(67, 115, 86, 20);
		panel.add(txt_fromAirport);
		txt_fromAirport.setColumns(10);
		
		txt_toAirport = new JTextField();
		txt_toAirport.setBounds(207, 115, 85, 20);
		panel.add(txt_toAirport);
		txt_toAirport.setColumns(10);
		
		JLabel lbl_DepartureDate = new JLabel("Date :");
		lbl_DepartureDate.setBounds(36, 146, 31, 14);
		panel.add(lbl_DepartureDate);
		
		txt_dateDeparture = new JTextField();
		txt_dateDeparture.setHorizontalAlignment(SwingConstants.TRAILING);
		txt_dateDeparture.setText("2015-03-31");
		txt_dateDeparture.setBounds(67, 143, 86, 20);
		panel.add(txt_dateDeparture);
		txt_dateDeparture.setColumns(10);
		
		JLabel lblNrPassangers = new JLabel("");
		lblNrPassangers.setBounds(144, 43, 57, 14);
		panel.add(lblNrPassangers);
		
		txt_nr_passengers = new JTextField();
		txt_nr_passengers.setBounds(36, 200, 124, 20);
		panel.add(txt_nr_passengers);
		txt_nr_passengers.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nr. of passengers");
		lblNewLabel_2.setBounds(36, 185, 92, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblClass = new JLabel("Class");
		lblClass.setBounds(176, 185, 46, 14);
		panel.add(lblClass);
		
		txt_class_type = new JTextField();
		txt_class_type.setBounds(176, 200, 98, 20);
		panel.add(txt_class_type);
		txt_class_type.setColumns(10);
		
		txt_dateArrival = new JTextField();
		txt_dateArrival.setText("2015-03-31");
		txt_dateArrival.setHorizontalAlignment(SwingConstants.TRAILING);
		txt_dateArrival.setColumns(10);
		txt_dateArrival.setBounds(207, 143, 85, 20);
		panel.add(txt_dateArrival);
		
		JLabel lbl_ArrivalDate = new JLabel("Date :");
		lbl_ArrivalDate.setBounds(176, 146, 31, 14);
		panel.add(lbl_ArrivalDate);
		
		JRadioButton rdbtnRoundTrip = new JRadioButton("Round trip");
		rdbtnRoundTrip.setBounds(298, 114, 75, 23);
		panel.add(rdbtnRoundTrip);
		
		JRadioButton rdbtnOneWay = new JRadioButton("One Way");
		rdbtnOneWay.setBounds(298, 142, 75, 23);
		panel.add(rdbtnOneWay);
		
		JButton button_FindFlights = new JButton("Find Flights");
		button_FindFlights.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String fromAiport = txt_fromAirport.getText();
				String toAirport = txt_toAirport.getText();
				String dateDeparture = txt_dateDeparture.getText();
				String dateArrival = txt_dateArrival.getText();
				String nrPassengers= txt_nr_passengers.getText();
				
				
				//FindFlights.dbflights(fromAiport);
				
			}
		});
		button_FindFlights.setBounds(284, 199, 110, 23);
		panel.add(button_FindFlights);
	}
}
