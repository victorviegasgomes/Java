package controller;

import java.io.IOException;

public interface IArquivosDirectorios {
  
  public void leDirectorio(String path)
    throws IOException;
  
  public void criaTxt(String path, String nome)
    throws IOException;
  
  public void leTxt(String absolutePath)
    throws IOException;
  
}