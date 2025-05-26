package com.view;

import controller.*;

public class Main {
  
  public static void main(String[] args) {
    String path = "/storage/emulated/0/Documents";
    String absolutePath = "/storage/emulated/0/Documents/javaio.txt";
    IArquivosDirectorios iad = new ArquivosDirectorios();
    String nome = "javaio";
    
    try {
      //iad.leArquivo(path);
      //iad.criaTxt(path, nome);
      iad.leTxt(absolutePath);
    }catch(Exception e) {
      System.out.println("ERRO! " + e.getMessage());
    }
  }
  
}