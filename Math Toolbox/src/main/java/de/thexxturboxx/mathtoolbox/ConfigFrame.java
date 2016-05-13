package de.thexxturboxx.mathtoolbox;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;

import de.thexxturboxx.mathtoolbox.util.ConfigHelper;
import de.thexxturboxx.mathtoolbox.util.LangHelper;

@SuppressWarnings({"serial", "rawtypes", "unchecked"})
public class ConfigFrame extends JFrame implements ActionListener, WindowListener, ItemListener {
	
	protected int width = 350;
	protected int height = 175;
	
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	double dwidth = screenSize.getWidth();
	double dheight = screenSize.getHeight();
	
	JButton btnExit;
	
	JComboBox comboBox;
	private JLabel lblDasdasda;
	
	public ConfigFrame() throws IOException, URISyntaxException {
		setType(Type.POPUP);
		setAlwaysOnTop(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle(LangHelper.getTranslated("main.cfg"));
		setSize(width, height);
		setLocation((int) (dwidth / 2 - width / 2),(int)  (dheight / 2 - height / 2));
		addWindowListener(this);
		
		btnExit = new JButton(LangHelper.getTranslated("cfg.exit"));
		
		JLabel lblLanguage = new JLabel(LangHelper.getTranslated("cfg.lang") + ":");
		
		comboBox = new JComboBox();
		comboBox.addItem(LangHelper.newTranslation("lang", "de_DE"));
		comboBox.addItem(LangHelper.newTranslation("lang", "en_GB"));
		comboBox.addItemListener(this);
		comboBox.setSelectedIndex(LangHelper.getLangIndex());
		
		lblDasdasda = new JLabel(LangHelper.getTranslated("cfg.restart"));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblLanguage)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addComponent(btnExit, GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblDasdasda)
					.addContainerGap(194, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLanguage)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
					.addComponent(lblDasdasda)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnExit))
		);
		getContentPane().setLayout(groupLayout);
		btnExit.addActionListener(this);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnExit) {
			dispose();
			MathToolbox.frame.setVisible(true);
		}
	}
	
	@Override
	public void windowOpened(WindowEvent e) {
		
	}
	
	@Override
	public void windowClosing(WindowEvent e) {
		dispose();
		MathToolbox.frame.setVisible(true);
	}
	
	@Override
	public void windowClosed(WindowEvent e) {
		
	}
	
	@Override
	public void windowIconified(WindowEvent e) {
		
	}
	
	@Override
	public void windowDeiconified(WindowEvent e) {
		
	}
	
	@Override
	public void windowActivated(WindowEvent e) {
		
	}
	
	@Override
	public void windowDeactivated(WindowEvent e) {
		
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource() ==  comboBox) {
			try {
				ConfigHelper.setInFile("lang", LangHelper.getLangKey((String) e.getItem()));
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
}