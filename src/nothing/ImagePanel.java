/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nothing;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
/**
 *
 * @author zhoushuwen
 */
public class ImagePanel extends JPanel {
    private Image img;
    public ImagePanel(String img) {
        this(new ImageIcon(img).getImage());
    }
    
    public ImagePanel(Image img){
        this.img = img;
        Dimension size = new Dimension(img.getWidth(null),img.getHeight(null));
        this.setPreferredSize(size);
        //this.setMinimumSize(size);
        //this.setMaximumSize(size);
        this.setSize(size);
        setLayout(null);
    }
    
    public void paintComponent(Graphics g){
        g.drawImage(img, 0, 0, null);
    }
}
