import javax.swing.JOptionPane;

public class DadosCadastro {
    private String apelido;
    private String nome;
    private String sobrenome;
    private String email;
    private String nomeDeUsuario;
    private String senha;
    private int idade;

    //Getteers

    public String getApelido () {
        return apelido;
    }
    public String getNome () {
        return nome;
    }
    public String getSobrenome () {
        return sobrenome;
    }
    public String getEmail () {
        return email;
    }
    public String getNomeDeUsuario () {
        return nomeDeUsuario;
    }
    public String getSenha () {
        return senha;
    }
    public int getIdade () {
        return idade;
    }

    //Setters

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
    public void setEmail(String email) {
        if (email != null && email.contains("@") && email.matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$") && email.length() >= 8 && email.length() <= 50) {
            this.email = email;
        } else {
            JOptionPane.showMessageDialog(null, "Digite um email válido", email, JOptionPane.WARNING_MESSAGE);
        }
        this.email = email;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public void setUsuario(String nomeDeUsuario) {
        this.nomeDeUsuario = nomeDeUsuario;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
