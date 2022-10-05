package packmvn.modelo;

public class Editora {
    private String nome;
    private String cnpj;
    private String email;
    public Editora(String nome, String cnpj, String email) {
        super();
        this.nome = nome;
        this.cnpj = cnpj;
        this.email = email;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
