import java.awt.*;
import javax.swing.JButton;

public class BotaoArredondado extends JButton{

    public BotaoArredondado (String texto) {
        super(texto);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
    }


    @Override
    protected void paintComponent (Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        if (getModel().isPressed()) {
            g2.setColor(new Color(65,17,94)); // cor quando clicado
        } else {
            g2.setColor(new Color(65,17,74)); // cor padrão
        }

        // Desenha botão com cantos arredondados
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
        g2.dispose();

        super.paintComponent(g);  // Desenha o texto por cima

    }
}