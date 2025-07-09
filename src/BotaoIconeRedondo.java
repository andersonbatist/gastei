import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;


public class BotaoIconeRedondo extends JButton {

    private Image imagem;
    private boolean clicado = false;

    public BotaoIconeRedondo (String caminhoImagem) {

        addActionListener(e -> {
        clicado = !clicado; // alterna entre clicado e não clicado
        repaint();          // redesenha o botão
        } );

        imagem = new ImageIcon("googleIcon.png").getImage();

        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
        setPreferredSize(new Dimension(60, 60));
    }


    @Override
    protected void paintComponent (Graphics g) {

        

        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2.setColor(new Color(65, 17, 74));
        if (getModel().isPressed()) {
            g2.setColor(new Color(65,17,94)); // cor quando clicado
        } else {
            g2.setColor(new Color(65,17,74)); // cor padrão
        }
        g2.fillOval(0, 0, getWidth(), getHeight());

        int larguraIcone = 40;
        int alturaIcone = 40;
        int imgX = (getWidth() - larguraIcone) / 2;
        int imgY = (getHeight() - alturaIcone) / 2;
        g2.drawImage(imagem, imgX, imgY, larguraIcone, alturaIcone, null);

        g2.dispose();
    }
}