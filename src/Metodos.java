import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//Método pra gerar a janela de abertura:


public class Metodos{

    static JFrame abertura;

    public static void mostrarTelaAbertura () {

        //Gerando a janela:

        JFrame abertura = new JFrame("ABRINDO A APLICAÇÃO");
        abertura.setTitle("Seja Bem-Vindo");
        abertura.getContentPane().setBackground(Color.BLACK);
        abertura.setSize(1000,1000);
        abertura.setLocationRelativeTo(null);
        abertura.setResizable(true);
        abertura.setLayout(new BorderLayout());

        //Criando o título:

        JLabel titulo = new JLabel("GASTEI");
        titulo.setForeground(Color.WHITE);
        titulo.setFont(new Font("Serif", Font.BOLD, 69));
        titulo.setHorizontalAlignment(SwingConstants.CENTER);

        //Adicionando o título:

        JPanel painelTitulo = new JPanel(new BorderLayout());
        painelTitulo.setBackground(Color.black);
        painelTitulo.setBorder(BorderFactory.createEmptyBorder(150,0,0,0));


        painelTitulo.add(titulo, BorderLayout.CENTER);
        abertura.add(painelTitulo, BorderLayout.NORTH);

        //Adicionando o Gif:

        ImageIcon gifLoading = new ImageIcon("gif.gif");

        JLabel gifLabel = new JLabel();
        gifLabel.setHorizontalAlignment(SwingConstants.CENTER);
        gifLabel.setIcon(gifLoading);

        JPanel painelGif = new JPanel(new BorderLayout());
        painelGif.setBackground(Color.BLACK);
        painelGif.setBorder(BorderFactory.createEmptyBorder(0, 50, 500, 0));
        painelGif.add(gifLabel, BorderLayout.CENTER);

        abertura.add(painelGif, BorderLayout.CENTER);

        //Adicionando um tim pra fechar a janela de abertura e iniciar a janela inicial:

        int delay = 3000;
        new Timer(delay, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                abertura.dispose();
                mostrarTelaInicial();
                ((Timer) e.getSource()).stop(); 
            }
        }).start();

         abertura.setVisible(true);
    }

//Método pra gerar a janela inicial(Área de login/registro:)

    public static void mostrarTelaInicial() {

        //Criando a janela:

        JFrame telaInicial = new JFrame();
        telaInicial.setTitle("GASTEI");
        telaInicial.getContentPane().setBackground(Color.BLACK);
        telaInicial.setSize(1000,1000);
        telaInicial.setLocationRelativeTo(null);
        telaInicial.setResizable(true);
        telaInicial.setLayout(new BorderLayout());

        //Criando novamente o título:

        JLabel titulo = new JLabel("GASTEI");
        titulo.setForeground(Color.WHITE);
        titulo.setFont(new Font("Serif", Font.BOLD, 69));
        titulo.setHorizontalAlignment(SwingConstants.CENTER);

        //Adicionando novamente o título:

        JPanel painelTitulo = new JPanel(new BorderLayout());
        painelTitulo.setBackground(Color.black);
        painelTitulo.setBorder(BorderFactory.createEmptyBorder(150,0,0,0));
        painelTitulo.add(titulo, BorderLayout.CENTER);

        //Criando e ajustando os botões de login/registro:

        JButton botaoLogin = new JButton ("Fazer Login");
        JButton botaoRegistro = new JButton ("Fazer Registro");

        JPanel painelBotoes = new JPanel();
        painelBotoes.add(botaoLogin);
        painelBotoes.add(botaoRegistro);
        painelBotoes.setBackground(Color.BLACK);

        painelBotoes.setLayout(new GridLayout(2,1,1,30));
        painelBotoes.setBorder(BorderFactory.createEmptyBorder(50, 300, 500, 300));


        botaoLogin.setFont(new Font("Serif", Font.BOLD, 25));
        botaoLogin.setBackground(new Color(65,17,74));
        botaoLogin.setForeground(Color.WHITE);
        botaoLogin.setBorderPainted(false);
        botaoLogin.setFocusPainted(false);

        botaoRegistro.setFont(new Font("Serif", Font.BOLD, 25));
        botaoRegistro.setFont(new Font("Serif", Font.BOLD, 25));
        botaoRegistro.setBackground(new Color(65,17,74));
        botaoRegistro.setForeground(Color.WHITE);
        botaoRegistro.setBorderPainted(false);
        botaoRegistro.setFocusPainted(false);
        
        telaInicial.add(painelTitulo, BorderLayout.NORTH);
        telaInicial.add(painelBotoes, BorderLayout.CENTER);
        telaInicial.setVisible(true);
    }
}