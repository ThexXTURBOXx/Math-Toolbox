package de.thexxturboxx.mathtoolbox.util;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class JImage extends JPanel {
	
	Image img;
	
	public JImage(File img) throws IOException {
		super();
		this.img = ImageIO.read(img);
	}
	
	public JImage(URL url) throws IOException {
		super();
		img = ImageIO.read(url);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, 0, 0, null);
	}
	
	public Dimension getImageSize() {
		return new Dimension(img.getWidth(null), img.getHeight(null));
	}
	
	public void setOptimumSize() {
		setSize(getImageSize());
	}
	
}