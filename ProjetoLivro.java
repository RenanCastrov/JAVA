public class ProjetoLivro 
{
    public static void main(String[] args)
    {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Renan", 23, "M");
        p[1] = new Pessoa("Rafaela", 22, "F");

        l[0] = new Livro("A arte de codar", "José Java de Alencar", p[0], 200);
        l[1] = new Livro("Fluxos e C++, O Amor", "Valtemir Alencar", p[1], 350);
        l[2] = new Livro("Bioquímica: A Ciência", "Natália Bressan", p[0], 100);

        System.out.println(l[1].detalhes());
    }
}
