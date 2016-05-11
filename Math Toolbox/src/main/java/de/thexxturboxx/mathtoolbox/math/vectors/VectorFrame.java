package de.thexxturboxx.mathtoolbox.math.vectors;

import java.io.IOException;
import java.net.URISyntaxException;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import de.thexxturboxx.mathtoolbox.MainFrame;

/**Created using Eclipse's WindowBuilderPro.
 * Represents the Main Frame.*/
@SuppressWarnings({"serial"})
public class VectorFrame extends MainFrame {
	
	public VectorFrame() throws IOException, URISyntaxException {
		super(0,groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
				.addGap(469))
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE),
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
				.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addContainerGap(772, Short.MAX_VALUE)));
	}
	
}