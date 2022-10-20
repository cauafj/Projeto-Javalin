package packmvn.modelo;

public class Editora {
    private String nome;
    private String cnpj;
    private String email;
    private int id;

    public Editora(String nome, String cnpj, String email) {
        super();
        this.nome = nome;
        this.cnpj = cnpj;
        this.email = email;
    }
    
    public Editora(int id, String nome, String cnpj, String email) {
        this(nome, cnpj,email);
        this.id = id; 
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
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
