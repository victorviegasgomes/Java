package javadb02.src.db;
import java.util.Calendar;

public class Javadb {
  private Long id;
  private String nome;
  private String email;
  private String endereco;
  private Calendar nascimento;
  
  public void getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  
  public void getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  
  public void getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  
  public void getEndereco() {
    return endereco;
  }
  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }
  
  public void getNascimento() {
    return nascimento;
  }
  public void setNascimento(Calendar nascimento) {
    this.nascimento = nascimento;
  }
}