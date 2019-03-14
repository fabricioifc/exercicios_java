package br.edu.ifc.aula.ufc;

public class Lutador {

  private String nome;
  private Integer idade;
  private Double altura;
  private Double peso;
  private int vitorias, derrotas, empates;

  private CategoriaType categoria;
  private NacionalidadeType nacionalidade;

  public Lutador() {
  }

  public Lutador(String nome, Integer idade, Double altura, Double peso, int vitorias, int derrotas, int empates, CategoriaType categoria, NacionalidadeType nacionalidade) {
    this.nome = nome;
    this.idade = idade;
    this.altura = altura;
    this.peso = peso;
    this.vitorias = vitorias;
    this.derrotas = derrotas;
    this.empates = empates;
    this.categoria = categoria;
    this.nacionalidade = nacionalidade;
  }

  public void apresentar() {
    System.out.println("------------------------------------");
    System.out.println("Chegou o grande dia! Apresentamos o lutador " + nome);
    System.out.println("Diretamente de " + this.nacionalidade.name());
    System.out.println("com " + this.idade + " anos e " + this.altura + "m");
    System.out.println("pesando " + this.peso + "kg");
    this.status();
  }

  public void status() {
    System.out.println("O lutador " + this.nome);
    System.out.println("da categoria " + this.categoria);
    System.out.println("Ganhou " + this.vitorias);
    System.out.println("Perdeu " + this.derrotas);
    System.out.println("Empatou " + this.empates);
  }

  public void ganharLuta() {
    System.out.println(this.nome + " é o vencedor!");
    this.vitorias++;
  }

  public void perderLuta() {
    System.out.println(this.nome + " é o perdedor!");
    this.derrotas++;
  }

  public void empatarLuta() {
    this.empates++;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Integer getIdade() {
    return idade;
  }

  public void setIdade(Integer idade) {
    this.idade = idade;
  }

  public Double getAltura() {
    return altura;
  }

  public void setAltura(Double altura) {
    this.altura = altura;
  }

  public Double getPeso() {
    return peso;
  }

  public void setPeso(Double peso) {
    this.peso = peso;
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

  public CategoriaType getCategoria() {
    return categoria;
  }

  public void setCategoria(CategoriaType categoria) {
    this.categoria = categoria;
  }

  public NacionalidadeType getNacionalidade() {
    return nacionalidade;
  }

  public void setNacionalidade(NacionalidadeType nacionalidade) {
    this.nacionalidade = nacionalidade;
  }

}
