import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Metodos{

    static JFrame abertura;

    public static void mostrarTelaAbertura () {
        JFrame abertura = new JFrame("ABRINDO A APLICAÇÃO");
        abertura.setTitle("Seja Bem-Vindo");
        abertura.getContentPane().setBackground(Color.BLACK);
        abertura.setSize(1000,1000);
        abertura.setLocationRelativeTo(null);
        abertura.setResizable(true);
        abertura.setLayout(new BorderLayout());



        JLabel titulo = new JLabel("GASTEI");
        titulo.setForeground(Color.WHITE);
        titulo.setFont(new Font("Serif", Font.BOLD, 69));
        titulo.setHorizontalAlignment(SwingConstants.CENTER);

        JPanel painelTitulo = new JPanel(new BorderLayout());
        painelTitulo.setBackground(Color.BLACK);
        painelTitulo.setBorder(BorderFactory.createEmptyBorder(150,0,0,0));


        painelTitulo.add(titulo, BorderLayout.CENTER);
        abertura.add(painelTitulo, BorderLayout.NORTH);

        ImageIcon gifLoading = new ImageIcon("gif.gif");

        JLabel gifLabel = new JLabel();
        gifLabel.setHorizontalAlignment(SwingConstants.CENTER);
        gifLabel.setIcon(gifLoading);

        JPanel painelGif = new JPanel(new BorderLayout());
        painelGif.setBackground(Color.BLACK);
        painelGif.setBorder(BorderFactory.createEmptyBorder(0, 50, 500, 0));
        painelGif.add(gifLabel, BorderLayout.CENTER);

        abertura.add(painelTitulo, BorderLayout.NORTH);
        abertura.add(painelGif, BorderLayout.CENTER);

        abertura.setVisible(true);

        int delay = 3000;
        new Timer(delay, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                abertura.dispose();
            }
        }).start();
    }
}