public abstract class Pessoa {

    // ATRIBUTOS

    protected String cpfConsulta;
    protected String nome;
    protected String cpf;
    protected int telefone;
    protected boolean cadastrado;

    // METODOS

    public abstract void alterar();
    public abstract void manipular();
    public abstract void coletar();
    public abstract void cadastrar();
    public abstract void dados();

    // METODOS ESPECIAIS

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public boolean isCadastrado() {
        return cadastrado;
    }

    public void setCadastrado(boolean cadastrado) {
        this.cadastrado = cadastrado;
    }

    public String getCpfConsulta() {
        return cpfConsulta;
    }

    public void setCpfConsulta(String cpfConsulta) {
        this.cpfConsulta = cpfConsulta;
    }
}
