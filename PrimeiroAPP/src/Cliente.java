import java.time.LocalDate;

public class Cliente {

    private String nome;
    private int anoDeNascimento;
    private int idade;
    private String faixaEtaria;

    public Cliente(String nome, int anoDeNascimento) {
        this.nome = nome;
        this.anoDeNascimento = anoDeNascimento;
        LocalDate data = LocalDate.now();

        this.setIdade(data.getYear() - this.getAnoDeNascimento());
        this.setFaixaEtaria(idade);
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public String getFaixaEtaria() {
        return faixaEtaria;
    }

    private void setFaixaEtaria(int idade) {
        /**
         * Classificação etária
         * Se idade <= 17 então "ADOLESCENTE"
         * Se idade >= 18 E idade <=29 então "JOVEM"
         * Se idade >=30 E idade <=59 então "ADULTO"
         * Se idade >= 60 então "IDOSO"
         */

        if (this.idade <= 17) {
            this.faixaEtaria = "Adolescente";
        } else if (this.idade <= 29) {
            this.faixaEtaria = "Jovem";
        } else if (this.idade <= 59) {
            this.faixaEtaria = "Adulto";
        } else
            this.faixaEtaria = "Idoso";
    }

    public int getAnoDeNascimento() {
        return anoDeNascimento;
    }

    public void setAnoDeNascimento(int anoDeNascimento) {
        this.anoDeNascimento = anoDeNascimento;
    }

    @Override
    public String toString() {
        return this.nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
