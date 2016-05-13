package de.thexxturboxx.mathtoolbox.math.vectors;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import de.thexxturboxx.mathtoolbox.MainFrame;
import de.thexxturboxx.mathtoolbox.util.LangHelper;

@SuppressWarnings({"serial"})
public class VectorFrame extends MainFrame implements ActionListener {
	
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	double dwidth = screenSize.getWidth();
	double dheight = screenSize.getHeight();
	
	private JTextField X1, X2, X3, Y1, Y2, Y3;
	
	private JLabel label_9, label_10, label_11;
	
	JButton btnAddition, btnCrossproduct, btnDivision, btnScaleproduct, btnSmultiplication, btnSubtraction, btnLength, btnUnitVector;
	
	public VectorFrame() throws IOException, URISyntaxException {
		super(1);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("<html><u>" + LangHelper.getTranslated("math.vectors") + "</u></<html>");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel label = new JLabel(LangHelper.getTranslated("vectors.desc"));
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblNewLabel_1 = new JLabel("X1 = ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel label_1 = new JLabel("X2 = ");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel label_2 = new JLabel("X3 = ");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel label_3 = new JLabel("Y1 = ");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel label_4 = new JLabel("Y2 = ");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel label_5 = new JLabel("Y3 = ");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		X1 = new JTextField();
		X1.setColumns(10);
		
		X2 = new JTextField();
		X2.setColumns(10);
		
		X3 = new JTextField();
		X3.setColumns(10);
		
		Y1 = new JTextField();
		Y1.setColumns(10);
		
		Y2 = new JTextField();
		Y2.setColumns(10);
		
		Y3 = new JTextField();
		Y3.setColumns(10);
		
		btnCrossproduct = new JButton(LangHelper.getTranslated("vectors.cross"));
		
		btnSmultiplication = new JButton(LangHelper.getTranslated("vectors.smultiply"));
		
		btnScaleproduct = new JButton(LangHelper.getTranslated("vectors.scale"));
		
		btnAddition = new JButton(LangHelper.getTranslated("vectors.add"));
		
		btnSubtraction = new JButton(LangHelper.getTranslated("vectors.sub"));
		
		btnDivision = new JButton(LangHelper.getTranslated("vectors.div"));
		
		btnAddition.addActionListener(this);
		btnCrossproduct.addActionListener(this);
		btnDivision.addActionListener(this);
		btnScaleproduct.addActionListener(this);
		btnSmultiplication.addActionListener(this);
		btnSubtraction.addActionListener(this);
		
		JLabel lblNewLabel_2 = new JLabel("<html><u>" + LangHelper.getTranslated("math.result") + ":</u></html>");
		lblNewLabel_2.setForeground(Color.MAGENTA);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JLabel label_6 = new JLabel("R1 = ");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel label_7 = new JLabel("R2 = ");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel label_8 = new JLabel("R3 = ");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		label_9 = new JLabel("");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		label_10 = new JLabel("");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		label_11 = new JLabel("");
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		btnLength = new JButton(LangHelper.getTranslated("vectors.length"));
		btnUnitVector = new JButton(LangHelper.getTranslated("vectors.unitvec"));
		btnLength.addActionListener(this);
		btnUnitVector.addActionListener(this);
		
		JLabel lblNewLabel_3 = new JLabel("(" + LangHelper.getTranslated("vectors.factor") + ")");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnDivision)
						.addComponent(lblNewLabel)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(X1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(X2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(X3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(label_3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(label_4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(label_5, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(Y3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(Y2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(Y1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel_3)))
							.addContainerGap())
						.addComponent(lblNewLabel_2)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(label_8, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(label_6, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(label_7, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(label_11, GroupLayout.DEFAULT_SIZE, 815, Short.MAX_VALUE)
									.addContainerGap())
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
									.addComponent(label_9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(label_10, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 862, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btnCrossproduct)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnSmultiplication))
								.addComponent(btnAddition)
								.addComponent(btnSubtraction))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnUnitVector)
								.addComponent(btnLength)
								.addComponent(btnScaleproduct))
							.addGap(565))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(X1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(X2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(X3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(Y1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(Y2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(Y3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCrossproduct)
						.addComponent(btnSmultiplication)
						.addComponent(btnScaleproduct))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAddition)
						.addComponent(btnLength))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSubtraction)
						.addComponent(btnUnitVector))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnDivision)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_2)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addGap(8)
							.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label_10, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_11, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(26))
		);
		
		getContentPane().setLayout(groupLayout);
		
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Vec1 vec1 = null, vec11 = null, vec1r = null;
		Vec2 vec2 = null, vec21 = null, vec2r = null;
		Vec3 vec3 = null, vec31 = null, vec3r = null;
		double r = Double.NaN, i = Double.NaN;
		if(X1.getText().equals("")) {
			try {
				throw new IllegalArgumentException(LangHelper.getTranslated("exc.onevec"));
			} catch (IOException e1) {
				e1.printStackTrace();
			} catch (URISyntaxException e1) {
				e1.printStackTrace();
			}
		} else if(X2.getText().equals("") && !Y1.getText().equals("") && Y2.getText().equals("")) {
			vec1 = new Vec1(Double.parseDouble(X1.getText()));
			i = Double.parseDouble(Y1.getText());
			vec11 = new Vec1(Double.parseDouble(Y1.getText()));
		} else if(X3.getText().equals("") && !Y1.getText().equals("") && Y2.getText().equals("")) {
			vec2 = new Vec2(Double.parseDouble(X1.getText()), Double.parseDouble(X2.getText()));
			i = Double.parseDouble(Y1.getText());
		} else if(X3.getText().equals("") && Y3.getText().equals("")) {
			vec2 = new Vec2(Double.parseDouble(X1.getText()), Double.parseDouble(X2.getText()));
			vec21 = new Vec2(Double.parseDouble(Y1.getText()), Double.parseDouble(Y2.getText()));
		} else if(!Y1.getText().equals("") && Y2.getText().equals("")) {
			vec3 = new Vec3(Double.parseDouble(X1.getText()), Double.parseDouble(X2.getText()), Double.parseDouble(X3.getText()));
			i = Double.parseDouble(Y1.getText());
		} else {
			vec3 = new Vec3(Double.parseDouble(X1.getText()), Double.parseDouble(X2.getText()), Double.parseDouble(X3.getText()));
			vec31 = new Vec3(Double.parseDouble(Y1.getText()), Double.parseDouble(Y2.getText()), Double.parseDouble(Y3.getText()));
		}
		if(e.getSource() == btnAddition) {
			if(vec1 == null && vec2 == null) {
				//Vec3
				vec3r = vec3.add(vec31);
				label_9.setText(Double.toString(vec3r.x1).replace(".0", ""));
				label_10.setText(Double.toString(vec3r.x2).replace(".0", ""));
				label_11.setText(Double.toString(vec3r.x3).replace(".0", ""));
			} else if(vec2 == null && vec3 == null) {
				//Vec1
				vec1r = vec1.add(vec11);
				label_9.setText(Double.toString(vec1r.x1).replace(".0", ""));
				label_10.setText("");
				label_11.setText("");
			} else if(vec1 == null && vec3 == null) {
				//Vec2
				vec2r = vec2.add(vec21);
				label_9.setText(Double.toString(vec2r.x1).replace(".0", ""));
				label_10.setText(Double.toString(vec2r.x2).replace(".0", ""));
				label_11.setText("");
			}
		}
		if(e.getSource() == btnCrossproduct) {
			if(vec1 == null && vec2 == null) {
				//Vec3
				vec3r = vec3.crossProduct(vec31);
				label_9.setText(Double.toString(vec3r.x1).replace(".0", ""));
				label_10.setText(Double.toString(vec3r.x2).replace(".0", ""));
				label_11.setText(Double.toString(vec3r.x3).replace(".0", ""));
			} else {
				try {
					throw new IllegalArgumentException(LangHelper.getTranslated("exc.cross3d"));
				} catch (IOException e1) {
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					e1.printStackTrace();
				}
			}		
		}
		if(e.getSource() == btnDivision) {
			if(vec1 == null && vec2 == null) {
				//Vec3
				vec3r = vec3.divide(i);
				label_9.setText(Double.toString(vec3r.x1).replace(".0", ""));
				label_10.setText(Double.toString(vec3r.x2).replace(".0", ""));
				label_11.setText(Double.toString(vec3r.x3).replace(".0", ""));
			} else if(vec2 == null && vec3 == null) {
				//Vec1
				vec1r = vec1.divide(i);
				label_9.setText(Double.toString(vec1r.x1).replace(".0", ""));
				label_10.setText("");
				label_11.setText("");
			} else if(vec1 == null && vec3 == null) {
				//Vec2
				vec2r = vec2.divide(i);
				label_9.setText(Double.toString(vec2r.x1).replace(".0", ""));
				label_10.setText(Double.toString(vec2r.x2).replace(".0", ""));
				label_11.setText("");
			}
		}
		if(e.getSource() == btnScaleproduct) {
			if(vec1 == null && vec2 == null) {
				//Vec3
				r = vec3.scaleProduct(vec31);
			} else if(vec2 == null && vec3 == null) {
				//Vec1
				r = vec1.scaleProduct(vec11);
			} else if(vec1 == null && vec3 == null) {
				//Vec2
				r = vec2.scaleProduct(vec21);
			}
			label_9.setText(Double.toString(r).replace(".0", ""));
			label_10.setText("");
			label_11.setText("");		
		}
		if(e.getSource() == btnSmultiplication) {
			if(vec1 == null && vec2 == null) {
				//Vec3
				vec3r = vec3.sProduct(i);
				label_9.setText(Double.toString(vec3r.x1).replace(".0", ""));
				label_10.setText(Double.toString(vec3r.x2).replace(".0", ""));
				label_11.setText(Double.toString(vec3r.x3).replace(".0", ""));
			} else if(vec2 == null && vec3 == null) {
				//Vec1
				vec1r = vec1.sProduct(i);
				label_9.setText(Double.toString(vec1r.x1).replace(".0", ""));
				label_10.setText("");
				label_11.setText("");
			} else if(vec1 == null && vec3 == null) {
				//Vec2
				vec2r = vec2.sProduct(i);
				label_9.setText(Double.toString(vec2r.x1).replace(".0", ""));
				label_10.setText(Double.toString(vec2r.x2).replace(".0", ""));
				label_11.setText("");
			}		
		}
		if(e.getSource() == btnSubtraction) {
			if(vec1 == null && vec2 == null) {
				//Vec3
				vec3r = vec3.substract(vec31);
				label_9.setText(Double.toString(vec3r.x1).replace(".0", ""));
				label_10.setText(Double.toString(vec3r.x2).replace(".0", ""));
				label_11.setText(Double.toString(vec3r.x3).replace(".0", ""));
			} else if(vec2 == null && vec3 == null) {
				//Vec1
				vec1r = vec1.substract(vec11);
				label_9.setText(Double.toString(vec1r.x1).replace(".0", ""));
				label_10.setText("");
				label_11.setText("");
			} else if(vec1 == null && vec3 == null) {
				//Vec2
				vec2r = vec2.substract(vec21);
				label_9.setText(Double.toString(vec2r.x1).replace(".0", ""));
				label_10.setText(Double.toString(vec2r.x2).replace(".0", ""));
				label_11.setText("");
			}			
		}
		if(e.getSource() == btnLength) {
			if(vec1 == null && vec2 == null) {
				//Vec3
				r = vec3.length();
			} else if(vec2 == null && vec3 == null) {
				//Vec1
				r = vec1.length();
			} else if(vec1 == null && vec3 == null) {
				//Vec2
				r = vec2.length();
			}	
			label_9.setText(Double.toString(r).replace(".0", ""));
			label_10.setText("");
			label_11.setText("");		
		}
		if(e.getSource() == btnUnitVector) {
			if(vec1 == null && vec2 == null) {
				//Vec3
				vec3r = vec3.unitVec();
				label_9.setText(Double.toString(vec3r.x1).replace(".0", ""));
				label_10.setText(Double.toString(vec3r.x2).replace(".0", ""));
				label_11.setText(Double.toString(vec3r.x3).replace(".0", ""));
			} else if(vec2 == null && vec3 == null) {
				//Vec1
				vec1r = vec1.unitVec();
				label_9.setText(Double.toString(vec1r.x1).replace(".0", ""));
				label_10.setText("");
				label_11.setText("");
			} else if(vec1 == null && vec3 == null) {
				//Vec2
				vec2r = vec2.unitVec();
				label_9.setText(Double.toString(vec2r.x1).replace(".0", ""));
				label_10.setText(Double.toString(vec2r.x2).replace(".0", ""));
				label_11.setText("");
			}			
		}
	}
	
}