package ej1.modelo.persistencia;


public interface IPersistente<E> {

    void open_inputFile(String nombre) throws Exception;
    void close_inputFile() throws Exception;
    void open_outputFile(String nombre) throws Exception;
    void close_outputFile() throws Exception;
    void writeFile(E o) throws Exception;
    E readFile() throws Exception;
    


}
