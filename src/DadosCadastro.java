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
    // Apenas dois itens estão com as validações aplicadas. Em breve vou fazer o resto

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public void setApelido(String apelido) {
        if (apelido != null && apelido.length() >= 5 && apelido.length() <= 12 && apelido.matches("^[A-Za-zÀ-ÿ]+$")) {
            String apelidoFormatado = apelido.substring(0, 1).toUpperCase() + apelido.substring(1).toLowerCase();
        this.apelido = apelidoFormatado;
        } else {
            throw new IllegalArgumentException("Apelido inválido:");
        }
    }
    public void setEmail(String email) {
        if (email != null && email.contains("@") && email.matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$") && email.length() >= 8 && email.length() <= 50) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Email inválido: verifique o tamanho e o formato.");
        }
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
