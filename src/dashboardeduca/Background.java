package DashBoardEduca;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.border.Border;

/**
 *
 * @author Usuario
 */
public class Background implements Border {

    public BufferedImage back;
    public URL path;

    public void _Background() {
        try {
            path = new URL(getClass().getResource("../_Img/Koala.jpg").toString());
            back = ImageIO.read(path);

        } catch (IOException ex) {
            System.out.print("ERRO:\n" + ex.getMessage() + "\n");
        }
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
   g.drawImage(back, (x+(width - back.getWidth()/2)), (y+(height - back.getHeight()/2)), null); }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(0, 0, 0, 0);
    }

    @Override
    public boolean isBorderOpaque() {
        return false;
    }

}
