package de.thexxturboxx.mathtoolbox;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;

import de.thexxturboxx.mathtoolbox.util.LangHelper;

@SuppressWarnings({"serial"})
public class StartFrame extends MainFrame implements ActionListener {
	
	JButton btnConfig, btnNewButton;
	
	public StartFrame() throws IOException, URISyntaxException {
		super(0);
		JLabel lblWelcomeIHope = new JLabel(LangHelper.getTranslated("main.welcome"));
		lblWelcomeIHope.setFont(new Font("Tahoma", Font.PLAIN, 16));
		JLabel lblF = new JLabel(LangHelper.getTranslated("main.desc"));
		lblF.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnConfig = new JButton(LangHelper.getTranslated("main.cfg"));
		btnConfig.addActionListener(this);
		btnNewButton = new JButton(LangHelper.getTranslated("main.website"));
		btnNewButton.addActionListener(this);
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(Color.MAGENTA);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		if(UpdateCheck.latestVersion != null && !UpdateCheck.isNewest) {
			lblNewLabel.setText(LangHelper.getTranslated("main.ufound"));
		}
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(53)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblWelcomeIHope)
								.addComponent(lblF)
								.addComponent(lblNewLabel))
							.addPreferredGap(ComponentPlacement.RELATED, 432, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addComponent(btnConfig))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblWelcomeIHope)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblF)
					.addGap(363)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnConfig)
						.addComponent(btnNewButton)))
		);
		
		getContentPane().setLayout(groupLayout);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if(e.getSource() == btnConfig) {
				new ConfigFrame();
				setVisible(false);
			}
			if(e.getSource() == btnNewButton) {
				Desktop.getDesktop().browse(new URI(MathToolbox.homeURL));
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (URISyntaxException e1) {
			e1.printStackTrace();
		}
	}
	
}
