package de.thexxturboxx.mathtoolbox;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import de.thexxturboxx.mathtoolbox.util.LangHelper;

@SuppressWarnings("serial")
public class ConfigFrame extends JFrame implements ActionListener, WindowListener {

	protected int width = 256;
	protected int height = 128;
	
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	double dwidth = screenSize.getWidth();
	double dheight = screenSize.getHeight();
	
	JButton btnExit;
	
	public ConfigFrame() throws IOException, URISyntaxException {
		setType(Type.POPUP);
		setAlwaysOnTop(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle(LangHelper.getTranslated("main.cfg"));
		setSize(width, height);
		setLocation((int) (dwidth / 2 - width / 2),(int)  (dheight / 2 - height / 2));
		addWindowListener(this);
		
		JLabel lblNothingToSee = new JLabel(LangHelper.getTranslated("cfg.nts"));
		lblNothingToSee.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblNothingToSee, BorderLayout.NORTH);
		
		btnExit = new JButton(LangHelper.getTranslated("cfg.exit"));
		getContentPane().add(btnExit, BorderLayout.SOUTH);
		btnExit.addActionListener(this);
		
		JCheckBox chckbxThisFrameIs = new JCheckBox(LangHelper.getTranslated("cfg.tfiu"));
		chckbxThisFrameIs.setSelected(true);
		getContentPane().add(chckbxThisFrameIs, BorderLayout.CENTER);
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
	
}