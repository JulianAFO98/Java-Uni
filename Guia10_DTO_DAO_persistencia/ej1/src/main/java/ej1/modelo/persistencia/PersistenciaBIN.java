package ej1.modelo.persistencia;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class PersistenciaBIN implements IPersistente<Serializable>{

    private FileOutputStream fileoutput;
    private FileInputStream fileinput;
    private ObjectOutputStream objectoutput;
    private ObjectInputStream objectinput;

    @Override
    public void open_inputFile(String nombre) throws Exception{
        fileinput = new FileInputStream(nombre);
        objectinput = new ObjectInputStream(fileinput);
    }

    @Override
    public void close_inputFile()  throws Exception{
        if(objectinput!=null){
            objectinput.close();
        }
    }

    @Override
    public void open_outputFile(String nombre)  throws Exception{
        fileoutput = new FileOutputStream(nombre);
        objectoutput = new ObjectOutputStream(fileoutput);
    }

    @Override
    public void close_outputFile()  throws Exception{
        if(objectoutput!=null){
            objectoutput.close();
        }
    }

    @Override
    public void writeFile(Serializable serializable)  throws Exception{
       if (objectoutput != null)
            objectoutput.writeObject(serializable);
    }

    @Override
    public Serializable readFile()  throws Exception{
        Serializable serializable = null;
        if (objectinput != null)
            serializable = (Serializable) objectinput.readObject();
        return serializable;
    }

}
