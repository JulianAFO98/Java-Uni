package ej1;

import java.io.Serializable;

import ej1.modelo.Automovil;
import ej1.modelo.Flota;
import ej1.modelo.Motor;
import ej1.modelo.DTO.FlotaDTO;
import ej1.modelo.persistencia.IPersistente;
import ej1.modelo.persistencia.PersistenciaBIN;
import ej1.modelo.persistencia.PersistenciaXML;
import ej1.utils.Utils;

public class Main {
    public static void main(String[] args) {
        IPersistente<Serializable> p = new PersistenciaBIN();
        Flota flota = new Flota("Flota 1");
        Automovil a1 = new Automovil("32312",2000,"Toyota", "m1", "aaa111", new Motor("ad2f3","Diesel"));
        Automovil a2 = new Automovil("23423",1998,"Ford", "m2", "aaa323", new Motor("1123s","Gasoil"));
        Automovil a3 = new Automovil("231123",2001,"Nissan", "m3", "aaa123",new Motor("kft45","Diesel"));
        Automovil a4 = new Automovil("23223",2019,"BMW", "m4", "aaa543", new Motor("zzfd3","Super"));
        flota.getAutos().add(a1);
        flota.getAutos().add(a2);
        flota.getAutos().add(a3);
        flota.getAutos().add(a4);
        
        FlotaDTO flotaDTO = Utils.fromClassToDTO(flota);
        flota = null;

        try {
            p.open_outputFile("arch.bin");
            p.writeFile(flotaDTO);
            p.close_outputFile();
        } catch (Exception e) {
            e.printStackTrace();
        }

        flotaDTO = null;

        try {
            p.open_inputFile("arch.bin");
            flotaDTO = (FlotaDTO) p.readFile();
            p.close_inputFile();
        } catch (Exception e) {
            e.printStackTrace();
        }

        flota = Utils.fromDTOToClass(flotaDTO);
        System.out.println(flota.toString());
    }
}