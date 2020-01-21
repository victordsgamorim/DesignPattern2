package Builder;

public class Pessoa {

    private String nome;
    private int idade;
    private String cpf;
    private String rg;
    private String nomeDoPai;
    private String nomeDaMae;


    private Pessoa(String nome, int idade, String cpf, String rg, String nomeDoPai, String nomeDaMae) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.rg = rg;
        this.nomeDoPai = nomeDoPai;
        this.nomeDaMae = nomeDaMae;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNomeDoPai() {
        return nomeDoPai;
    }

    public void setNomeDoPai(String nomeDoPai) {
        this.nomeDoPai = nomeDoPai;
    }

    public String getNomeDaMae() {
        return nomeDaMae;
    }

    public void setNomeDaMae(String nomeDaMae) {
        this.nomeDaMae = nomeDaMae;
    }

    public static class Builder {
        private String nome;
        private int idade;
        private String cpf;
        private String rg;
        private String nomeDoPai;
        private String nomeDaMae;

        public Builder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder idade(int idade) {
            this.idade = idade;
            return this;
        }

        public Builder cpf(String cpf) {
            this.cpf = cpf;
            return this;
        }

        public Builder rg(String rg) {
            this.rg = rg;
            return this;
        }

        public Builder nomeDoPai(String nomeDoPai) {
            this.nomeDoPai = nomeDoPai;
            return this;
        }

        public Builder nomeDaMae(String nomeDaMae) {
            this.nomeDaMae = nomeDaMae;
            return this;
        }

        public Pessoa build() {
            return new Pessoa(nome, idade, cpf, rg, nomeDoPai, nomeDaMae);
        }


    }
}
