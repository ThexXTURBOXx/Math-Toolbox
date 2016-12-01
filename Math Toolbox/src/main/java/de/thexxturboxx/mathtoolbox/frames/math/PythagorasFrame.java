package de.thexxturboxx.mathtoolbox.frames.math;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import de.thexxturboxx.mathtoolbox.MainFrame;
import de.thexxturboxx.mathtoolbox.MathToolbox;
import de.thexxturboxx.mathtoolbox.api.math.Pythagoras;
import de.thexxturboxx.mathtoolbox.exc.MathException;
import de.thexxturboxx.mathtoolbox.util.JImage;
import de.thexxturboxx.mathtoolbox.util.LangHelper;

@SuppressWarnings({"serial"})
public class PythagorasFrame extends MainFrame implements ActionListener {
	
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	double dwidth = screenSize.getWidth();
	double dheight = screenSize.getHeight();
	
	private JTextField a, b, c;
	private JButton btnNewButton;
	private JLabel alpha, beta;
	
	public PythagorasFrame() throws IOException, URISyntaxException {
		super(2);
		
		JLabel lblNewLabel = new JLabel("<html><u>" + LangHelper.getTranslated("math.pythagoras") + "</u></<html>");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel label = new JLabel(LangHelper.getTranslated("pyth.desc"));
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JImage panel = new JImage(MathToolbox.class.getResource("/de/thexxturboxx/resources/images/pythagoras.png"));
		panel.setOptimumSize();
		
		b = new JTextField();
		b.setColumns(10);
		
		c = new JTextField();
		c.setColumns(10);
		
		a = new JTextField();
		a.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("c =");
		
		JLabel lblA = new JLabel("a =");
		
		JLabel lblNewLabel_2 = new JLabel("b =");
		
		btnNewButton = new JButton(LangHelper.getTranslated("math.compute"));
		btnNewButton.addActionListener(this);
		
		JLabel lblu = new JLabel("\u03B1 =");
		
		JLabel lblu_1 = new JLabel("\u03B2 =");
		
		JLabel lblNewLabel_3 = new JLabel("\u03B3 =");
		
		alpha = new JLabel("");
		
		beta = new JLabel("");
		
		JLabel lblNewLabel_4 = new JLabel("90");
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel)
								.addComponent(label, GroupLayout.PREFERRED_SIZE, 862, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblu)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(alpha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblu_1)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(beta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel_3)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel_4))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(186)
							.addComponent(lblNewLabel_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(c, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(139)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel_2)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(b, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(btnNewButton)
										.addComponent(panel, GroupLayout.PREFERRED_SIZE, 289, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblA)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(a, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(49)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(b, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(c, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(122)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(a, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblA))))
					.addGap(16)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblu)
						.addComponent(alpha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblu_1)
						.addComponent(beta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(lblNewLabel_4))
					.addGap(82))
		);
		
		getContentPane().setLayout(groupLayout);
		
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnNewButton) {
			double a, b, c;
			if(this.a.getText().equals("")) {
				a = 0;
			} else {
				a = Double.parseDouble(this.a.getText());
			}
			if(this.b.getText().equals("")) {
				b = 0;
			} else {
				b = Double.parseDouble(this.b.getText());
			}
			if(this.c.getText().equals("")) {
				c = 0;
			} else {
				c = Double.parseDouble(this.c.getText());
			}
			Pythagoras p = null;
			try {
				p = new Pythagoras(a, b, c);
			} catch (MathException e1) {
				e1.printStackTrace();
			}
			try {
				this.a.setText(Double.toString(a = p.get("a")));
				this.b.setText(Double.toString(b = p.get("b")));
				this.c.setText(Double.toString(c = p.get("c")));
			} catch (MathException e1) {
				e1.printStackTrace();
			}
			alpha.setText(Double.toString(Math.toDegrees(Math.asin(a / c))));
			beta.setText(Double.toString(Math.toDegrees(Math.asin(b / c))));
		}
	}
	
}