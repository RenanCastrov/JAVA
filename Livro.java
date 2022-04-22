public class Livro implements Publicacao
{
    private String titulo, autor;
    private int totPaginas, pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    
    
    public Livro(String titulo, String autor, Pessoa leitor, int totPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.leitor = leitor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
    }

    public String detalhes() {
        return "Livro [ Está aberto = " + aberto + ",\n Autor = " + autor + ",\n Leitor = " + leitor.getNome() + ",\n Página Atual = " + pagAtual
                + ",\n Título = " + titulo + ",\n Total de Páginas = " + totPaginas + ",\n Idade do leitor = " + 
                leitor.getIdade() + ",\n Sexo do leitor = " + leitor.getSexo() + "]";
    }
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public Pessoa getLeitor() {
        return leitor;
    }
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    public int getTotPaginas() {
        return totPaginas;
    }
    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }
    public int getPagAtual() {
        return pagAtual;
    }
    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }
    public boolean isAberto() {
        return aberto;
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    
    @Override
    public void abrir()
    {
        this.aberto = true;
    }

    @Override
    public void fechar()
    {
        this.aberto = false;
    }

    @Override
    public void avancarPag()
    {
        this.pagAtual++;
    }

    @Override
    public void voltarPag()
    {
        this.pagAtual--;
    }

    @Override
    public void folhear(int p) 
    {
        if(p > this.totPaginas)
        {
            this.pagAtual = 0;
        }
        else
        {
            this.pagAtual = p;
        }
    }
}
