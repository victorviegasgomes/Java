package controller;

import java.io.*;
import java.util.Scanner;

public class ArquivosDirectorios implements IArquivosDirectorios {
  
  @Override
  public void leDirectorio(String path) throws IOException {
    File dir = new File(path);
    if(dir.exists() && dir.isDirectory()) {
      File[] listaDeDir = dir.listFiles();
      for(File f : listaDeDir) {
        if(f.isDirectory()) {
          System.out.println("[" + f.getName() + "]");
        }
      }
      for(File f : listaDeDir) {
        if(f.isFile()) {
          System.out.println(f.getName());
        }
      }
    } else {
      throw new IOException("Directório inválido!");
    }
  }
  
  @Override
  public void criaTxt(String path, String nome) throws IOException {
    File dir = new File(path);
    File arquivo = new File(path, nome + ".txt");
    if(dir.isDirectory()) {
      boolean arquivoExiste = false;
      if(arquivo.exists()) {
        arquivoExiste = true;
      }
      String conteudo = geraConteudoTxt();
      FileWriter fw = new FileWriter(arquivo, arquivoExiste);
      PrintWriter pw = new PrintWriter(fw);
      pw.write(conteudo);
      pw.flush();
      pw.close();
      fw.close();
    } else {
      throw new IOException("Directório inválido!");
    }
  }
  
  @Override
  public void leTxt(String absolutePath) throws IOException {
    File arquivo = new File(absolutePath);
    if(arquivo.exists()) {
      FileInputStream fluxo = new FileInputStream(arquivo);
      InputStreamReader leitor = new InputStreamReader(fluxo);
      BufferedReader buffer = new BufferedReader(leitor);
      String linha = buffer.readLine();
      while(linha != null) {
        System.out.println(linha);
        linha = buffer.readLine();
      }
      buffer.close();
      leitor.close();
      fluxo.close();
    }else {
      throw new IOException("Directório inválido!");
    }
  }
  
  private String geraConteudoTxt() {
    StringBuffer buffer = new StringBuffer();
    Scanner leitor = new Scanner(System.in);
    String linha = "";
    System.out.print("Escreva uma frase: ");
    
    while(!linha.equals("fim")) {
      linha = leitor.nextLine();
      buffer.append(linha + "\r\n");
    }
    
    return buffer.toString();
  }
  
}