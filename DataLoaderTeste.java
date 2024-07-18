package javacore.Minterfaces.Teste;

import javacore.Minterfaces.Dominio.DataBaseLoader;
import javacore.Minterfaces.Dominio.DataLoader;
import javacore.Minterfaces.Dominio.FileLoader;

public class DataLoaderTeste {
    public static void main(String[] args) {
        DataBaseLoader databaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();
        databaseLoader.checkPermission();
        fileLoader.checkPermission();
    }
}
