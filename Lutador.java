public class Lutador 
{
    //Atributos
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private double altura, peso;
    //Métodos públicos
    public void apresentar()
    {
        System.out.println("-------------------------------------------------------");
        System.out.println("CHEGOU A HORA! Apresentamos o lutador " + this.getNome());
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("Possuindo " + this.getIdade() + " anos de idade...");
        System.out.println("Tendo " + this.getAltura() + "m de altura...");
        System.out.println("E pesando incríveis " + this.getPeso() + "Kg");
        System.out.println("Com um total de " + this.getVitorias() + " vitórias");
        System.out.println("Um total de " + this.getDerrotas() + " derrotas");
        System.out.println("E um total de " + this.getEmpates() + " empates!!!");
    }
    public void status()
    {
        System.out.println(this.getNome() + " é um lutador Peso " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias() + " lutas");
        System.out.println("Perdeu " + this.getDerrotas() + " lutas");
        System.out.println("E empatou em " + this.getEmpates() + " lutas");
    }
    public void ganharLuta()
    {
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta()
    {
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta()
    {
        this.setEmpates(this.getEmpates() + 1);
    }
    //Métodos especiais
    public Lutador(String no, String na, int id, int vi, int de, int em, double al, double pe) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
        this.altura = al;
        this.setPeso(pe);
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }
    public String getCategoria() {
        return categoria;
    }
    private void setCategoria() {
        if(this.peso < 52.2)
        {
            this.categoria = "Inválido";
        }
        else if(this.peso <= 70.3)
        {
            this.categoria = "Leve";
        }
        else if(this.peso <= 83.9)
        {
            this.categoria = "Médio";
        }
        else if(this.peso <= 120.2)
        {
            this.categoria = "Pesado";
        }
        else
        {
            this.categoria = "Inválido";
        }
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}
