package java_classes.teacher.head_first.ch12_swing;
import javax.swing.*;
import java.awt.*;

public class MyPanelRandomColor extends JPanel {
	
	public void paintComponent(Graphics g) {
		
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		int red = (int) (Math.random()* 255);
//		int red =  (Math.random()* 255);
		int green = (int) (Math.random()* 255);
		int blue = (int) (Math.random()* 255);
		
		Color color = new Color(red, green, blue);
		
		g.setColor(color);
		
		g.fillOval(70, 70, 100, 150);
		
		
		
	}
	


}
