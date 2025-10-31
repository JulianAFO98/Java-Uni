package ej1.modelo.persistencia;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class PersistenciaXML implements IPersistente<Object> {

    private FileOutputStream fileoutput;
    private FileInputStream fileinput;
    private XMLEncoder xmlEncoder;
    private XMLDecoder xmlDecoder;

    @Override
    public void open_inputFile(String nombre) throws Exception {
        fileinput = new FileInputStream(nombre);
        xmlDecoder = new XMLDecoder(fileinput);
    }

    @Override
    public void close_inputFile() throws Exception {
        if (xmlDecoder != null)
            xmlDecoder.close();
    }

    @Override
    public void open_outputFile(String nombre) throws Exception {
        fileoutput = new FileOutputStream(nombre);
        xmlEncoder = new XMLEncoder(fileoutput);
    }

    @Override
    public void close_outputFile() throws Exception {
        if (xmlEncoder!=null)
            xmlEncoder.close();
    }

    @Override
    public void writeFile(Object o) throws Exception {
            xmlEncoder.writeObject(o);
    }

    @Override
    public Object readFile() throws Exception {
        Object objecto = null;
        if (xmlDecoder != null)
            objecto =  xmlDecoder.readObject();

        return objecto;
    }

}
