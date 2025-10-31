package ej1.utils;

import java.util.ArrayList;

import ej1.modelo.Automovil;
import ej1.modelo.Flota;
import ej1.modelo.Motor;
import ej1.modelo.DTO.AutomovilDTO;
import ej1.modelo.DTO.FlotaDTO;
import ej1.modelo.DTO.MotorDTO;

public class Utils {

    public static FlotaDTO fromClassToDTO(Flota f){
        FlotaDTO fd = new FlotaDTO(f.getNombre());
        ArrayList<Automovil> autos = f.getAutos();
        ArrayList<AutomovilDTO> autosDTO = fd.getAutos();

        for (Automovil auto : autos) {
            AutomovilDTO autodto = new AutomovilDTO();
            autodto.setAnio_fabricacion(auto.getAnio_fabricacion());
            autodto.setMarca(auto.getMarca());
            autodto.setModelo(auto.getModelo());
            autodto.setN_Chasis(auto.getN_Chasis());
            autodto.setPatente(auto.getPatente());
            autodto.setMotorDTO(new MotorDTO(auto.getMotor().getN_Serie(),auto.getMotor().getTipoCombustible()));

            autosDTO.add(autodto);
        }

        return fd;
    }

     public static Flota fromDTOToClass(FlotaDTO fd){
        Flota f = new Flota(fd.getNombre());
        ArrayList<Automovil> autos = f.getAutos();
        ArrayList<AutomovilDTO> autosDTO = fd.getAutos();

        for (AutomovilDTO autodto : autosDTO) {
            Automovil auto = new Automovil();
            auto.setAnio_fabricacion(autodto.getAnio_fabricacion());
            auto.setMarca(autodto.getMarca());
            auto.setModelo(autodto.getModelo());
            auto.setN_Chasis(autodto.getN_Chasis());
            auto.setPatente(autodto.getPatente());
            auto.setMotor(new Motor(autodto.getMotorDTO().getN_Serie(),autodto.getMotorDTO().getTipoCombustible()));

            autos.add(auto);
        }

        return f;
    }
}
