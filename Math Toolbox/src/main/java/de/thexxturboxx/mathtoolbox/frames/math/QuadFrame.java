package de.thexxturboxx.mathtoolbox.frames.math;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import de.thexxturboxx.mathtoolbox.MainFrame;
import de.thexxturboxx.mathtoolbox.api.math.QuadEquation;
import de.thexxturboxx.mathtoolbox.util.LangHelper;

@SuppressWarnings("serial")
public class QuadFrame extends MainFrame implements ActionListener {
	
	JTextField textField, textField_1, textField_2;
	JButton btnNewButton;
	JLabel R1, R2;
	
	public QuadFrame() throws IOException, URISyntaxException {
		super(3);
		
		JLabel lblNewLabel = new JLabel("<html><u>" + LangHelper.getTranslated("math.quadequation") + "</u></<html>");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblNewLabel_1 = new JLabel(LangHelper.getTranslated("qe.desc"));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblFx = new JLabel("f(x) =");
		lblFx.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setColumns(10);
		
		JLabel lblX = new JLabel("x^2 +");
		lblX.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("x +");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("x1 =");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblX_1 = new JLabel("x2 =");
		lblX_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		R1 = new JLabel("");
		R1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		R2 = new JLabel("");
		R2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		btnNewButton = new JButton(LangHelper.getTranslated("math.compute"));
		btnNewButton.addActionListener(this);
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblFx)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblX)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_2)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel)
						.addComponent(lblNewLabel_1)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel_3)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(R1))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblX_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(R2))
						.addComponent(btnNewButton))
					.addContainerGap(245, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_1)
					.addGap(87)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFx)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblX)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(R1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblX_1)
						.addComponent(R2))
					.addContainerGap(220, Short.MAX_VALUE))
		);
		
		getContentPane().setLayout(groupLayout);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnNewButton) {
			double a, b, c;
			if(textField.getText().equals("")) {
				a = 0;
			} else {
				a = Double.parseDouble(textField.getText());
			}
			if(textField_1.getText().equals("")) {
				b = 0;
			} else {
				b = Double.parseDouble(textField_1.getText());
			}
			if(textField_2.getText().equals("")) {
				c = 0;
			} else {
				c = Double.parseDouble(textField_2.getText());
			}
			QuadEquation qe = null;
			try {
				qe = new QuadEquation(a, b, c);
			} catch (IOException e1) {
				e1.printStackTrace();
			} catch (URISyntaxException e1) {
				e1.printStackTrace();
			}
			R1.setText(Double.toString(qe.results().get(0)));
			R2.setText(Double.toString(qe.results().get(1)));
		}
	}
	
}