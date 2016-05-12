package de.thexxturboxx.mathtoolbox;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;

import de.thexxturboxx.mathtoolbox.util.LangHelper;
import de.thexxturboxx.mathtoolbox.util.TopicHelper;

/**Created using Eclipse's WindowBuilderPro.
 * Represents the Main Frame.*/
@SuppressWarnings({"serial", "unchecked", "rawtypes"})
public class MainFrame extends JFrame {
	
	protected ParallelGroup vertical, horizontal;
	
	protected JScrollPane scrollPane;
	protected GroupLayout groupLayout;
	
	protected int index;
	
	protected int width = 1024;
	protected int height = 512;
	
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	double dwidth = screenSize.getWidth();
	double dheight = screenSize.getHeight();
	
	public MainFrame(int topicIndex) throws IOException, URISyntaxException {
		index = topicIndex;
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(MathToolbox.class.getResource("/de/thexxturboxx/resources/images/battleaxe_diamond.png")));
		setTitle("Math Toolbox");
		setSize(width, height);
		setLocation((int) (dwidth / 2 - width / 2),(int)  (dheight / 2 - height / 2));
		
		scrollPane = new JScrollPane();
		groupLayout = new GroupLayout(getContentPane());
		
		groupLayout.setVerticalGroup(vertical =
				groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
						.addGap(469))
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE));
		
		groupLayout.setHorizontalGroup(horizontal =
				groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addContainerGap(772, Short.MAX_VALUE)));
		
		String[] l = new String[] {LangHelper.getTranslated("main.beginning"), LangHelper.getTranslated("math.vectors")};
		
		final JList list = new JList(l);
		list.setSelectedIndex(topicIndex);
		MouseListener mouseListener = new MouseAdapter() {
		    @Override
			public void mouseClicked(MouseEvent e) {
		    	if(list.getSelectedIndex() != index) {
		    		try {
						TopicHelper.openUpTopic(list.getSelectedIndex());
					} catch (IOException e1) {
						e1.printStackTrace();
					} catch (URISyntaxException e1) {
						e1.printStackTrace();
					}
		    	}
		    }
		};
		list.addMouseListener(mouseListener);
		scrollPane.setViewportView(list);
		getContentPane().setLayout(groupLayout);
	}
}