import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
import javax.swing.text.AttributeSet;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.Window;



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
        abertura.setResizable(false);


        //Criando o título:

        JLabel titulo = new JLabel("Bem-Vindo");
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
        telaInicial.setTitle("Bem-Vindo");
        telaInicial.getContentPane().setBackground(Color.BLACK);
        telaInicial.setSize(1000,1000);
        telaInicial.setLocationRelativeTo(null);
        telaInicial.setResizable(true);
        telaInicial.setLayout(new BorderLayout());
        telaInicial.setResizable(false);


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

        //Criando e ajustando os botões

        BotaoArredondado botaoLogin = new BotaoArredondado ("Fazer Login");
        BotaoArredondado botaoRegistro = new BotaoArredondado ("Fazer Registro");
        BotaoIconeRedondo botaoGoogle = new BotaoIconeRedondo("googleIcon.png");

        Dimension tamanhoBotoesGrandes = new Dimension(300,60);

        botaoGoogle.setPreferredSize(new Dimension(40, 40));
        botaoGoogle.setMaximumSize(new Dimension(50, 50));
        botaoGoogle.setMinimumSize(new Dimension(50, 50));

        botaoLogin.setAlignmentX(Component.CENTER_ALIGNMENT);
        botaoRegistro.setAlignmentX(Component.CENTER_ALIGNMENT);
        botaoGoogle.setAlignmentX(Component.CENTER_ALIGNMENT);


        JPanel painelBotoes = new JPanel();
        painelBotoes.add(botaoLogin);
        painelBotoes.add(Box.createRigidArea(new Dimension(0, 20)));
        painelBotoes.add(botaoRegistro);
        painelBotoes.add(Box.createRigidArea(new Dimension(0, 5)));
        painelBotoes.add(botaoGoogle);
        painelBotoes.add(Box.createRigidArea(new Dimension(0, 300)));
        painelBotoes.setBackground(Color.BLACK);

        painelBotoes.setLayout(new BoxLayout(painelBotoes, BoxLayout.Y_AXIS));
        painelBotoes.setBorder(BorderFactory.createEmptyBorder(50, 300, 500, 300));


        botaoLogin.setFont(new Font("Serif", Font.BOLD, 25));
        botaoLogin.setBackground(new Color(65,17,74));
        botaoLogin.setForeground(Color.WHITE);
        botaoLogin.setBorderPainted(false);
        botaoLogin.setFocusPainted(false);
        botaoLogin.setPreferredSize(tamanhoBotoesGrandes);
        botaoLogin.setMaximumSize(tamanhoBotoesGrandes);
        botaoLogin.setMinimumSize(tamanhoBotoesGrandes);

        botaoRegistro.setFont(new Font("Serif", Font.BOLD, 25));
        botaoRegistro.setFont(new Font("Serif", Font.BOLD, 25));
        botaoRegistro.setBackground(new Color(65,17,74));
        botaoRegistro.setForeground(Color.WHITE);
        botaoRegistro.setBorderPainted(false);
        botaoRegistro.setFocusPainted(false);
        botaoRegistro.setPreferredSize(tamanhoBotoesGrandes);
        botaoRegistro.setMaximumSize(tamanhoBotoesGrandes);
        botaoRegistro.setMinimumSize(tamanhoBotoesGrandes);

        telaInicial.add(painelTitulo, BorderLayout.NORTH);
        telaInicial.add(painelBotoes, BorderLayout.CENTER);

        painelBotoes.add(Box.createRigidArea(new Dimension(0, 30)));
        painelBotoes.add(botaoGoogle);
        botaoGoogle.setAlignmentX(Component.CENTER_ALIGNMENT);


        telaInicial.setVisible(true);

        //Adicionando funções aos botões

        botaoGoogle.addActionListener(e -> {

            JOptionPane optionPane = new JOptionPane("Em breve ;)", JOptionPane.INFORMATION_MESSAGE);
            JDialog dialog = optionPane.createDialog("Fazer login com o Google");
            dialog.setSize(300,150);
            dialog.setLocationRelativeTo(null);
            dialog.setVisible(true);
        });


        //Ação ao clicar no botão Login

        botaoLogin.addActionListener(e -> {
            Window janelaAtual = SwingUtilities.getWindowAncestor(botaoLogin);
            if (janelaAtual != null) {
                janelaAtual.dispose();
            }

            JFrame telaLogin = new JFrame();
            telaLogin.setTitle("Bem-Vindo");
            telaLogin.getContentPane().setBackground(Color.BLACK);
            telaLogin.setSize(1000,1000);
            telaLogin.setLocationRelativeTo(null);
            telaLogin.setResizable(true);
            telaLogin.setLayout(new BorderLayout());
            telaLogin.setResizable(false);


            JLabel tituloDoLogin = new JLabel("GASTEI");
            tituloDoLogin.setForeground(Color.WHITE);
            tituloDoLogin.setFont(new Font("Serif", Font.BOLD, 69));
            tituloDoLogin.setHorizontalAlignment(SwingConstants.CENTER);

            JPanel painelTituloLogin = new JPanel(new BorderLayout());
            painelTituloLogin.setBackground(Color.black);
            painelTituloLogin.setBorder(BorderFactory.createEmptyBorder(150,0,0,0));
            painelTituloLogin.add(tituloDoLogin, BorderLayout.CENTER);

            //----------------------------

            JLabel rotuloEmail = new JLabel("Digite seu email");
            rotuloEmail.setForeground(Color.WHITE);
            rotuloEmail.setFont(new Font("Serif", Font.BOLD, 30));
            rotuloEmail.setHorizontalAlignment(SwingConstants.CENTER);

            JLabel rotuloSenha = new JLabel("Digite sua senha");
            rotuloSenha.setForeground(Color.WHITE);
            rotuloSenha.setFont(new Font("Serif", Font.BOLD, 30));
            rotuloSenha.setHorizontalAlignment(SwingConstants.CENTER);

            JTextField campoEmail = new JTextField();
            campoEmail.setForeground(Color.WHITE);
            campoEmail.setFont(new Font("Serif", Font.PLAIN, 20));
            campoEmail.setHorizontalAlignment(SwingConstants.CENTER);
            campoEmail.setBackground(Color.BLACK);

            campoEmail.setDocument(new PlainDocument() {
                @Override
                public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
                    if (str != null && (getLength() + str.length() <= 50)) {
                        super.insertString(offs, str, a);
                    }
                }
            });


            telaLogin.add(painelTituloLogin, BorderLayout.NORTH);
            telaLogin.setVisible(true);
        });

        JButton botaoEntrar = new JButton("Entrar");
        botaoEntrar.setFont(new Font("Serif", Font.BOLD, 24));
        botaoEntrar.setForeground(Color.WHITE);
        botaoEntrar.setBackground(new Color(50, 50, 50));


    }
}