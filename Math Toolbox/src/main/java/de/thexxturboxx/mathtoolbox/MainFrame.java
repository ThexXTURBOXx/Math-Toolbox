package de.thexxturboxx.mathtoolbox;

import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

import de.thexxturboxx.mathtoolbox.util.LangHelper;
import de.thexxturboxx.mathtoolbox.util.TopicHelper;

/**Created using Eclipse's WindowBuilderPro.
 * Represents the Main Frame.*/
@SuppressWarnings({"serial", "unchecked", "rawtypes"})
public class MainFrame extends JFrame {
	
	protected static JScrollPane scrollPane;
	
	protected static GroupLayout groupLayout;
	
	private int width = 1024;
	private int height = 512;
	
	public MainFrame(int topicIndex, GroupLayout.Group vertical, GroupLayout.Group horizontal) throws IOException, URISyntaxException {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(MathToolbox.class.getResource("/de/thexxturboxx/resources/images/battleaxe_diamond.png")));
		setTitle("Math Toolbox");
		setSize(width, height);
		
		scrollPane = new JScrollPane();
		groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(horizontal);
		groupLayout.setVerticalGroup(vertical);
		
		String[] l = new String[] {LangHelper.getTranslated("main.beginning"), LangHelper.getTranslated("math.vectors")};
		
		final JList list = new JList(l);
		list.setSelectedIndex(topicIndex);
		MouseListener mouseListener = new MouseAdapter() {
		    public void mouseClicked(MouseEvent e) {
		    	if(e.getButton() == 1) {
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
		setVisible(true);
	}
}