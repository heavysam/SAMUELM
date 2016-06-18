package com.picoplaca;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

import com.entidades.Vehiculo;

public class Predictor {
	
	public String predictor(Vehiculo v){
		try{
			//
			
			//			
		}catch(Throwable t){
			
		}
		return "ok";
	}
	
	

	public static void main(String[] args) {
		//
		try{
			if (args[0]== null){
				System.out.println("Debe ingresar una placa...");
				return ;
			}
			if (args[1]== null){
				System.out.println("Debe ingresar una fecha..");
				System.exit(0);
			}
			if (args[2]== null){
				System.out.println("Debe ingresar una hora...");
				System.exit(0);
			}
		}catch(Throwable t){
			System.out.println("Debe ingresar una placa...");
			return ;
		}
		String placa = args[0];
		String fecha = args[1];
		String hora = args[2];
		Validaciones val = new Validaciones();
		if (val.validaPlaca(placa) == 1) {
			System.out.println("Debe ingresar una placa valida: (GJA-124) ");
			System.exit(0);
		}
		if (val.validaFecha(fecha) == 1) {
			System.out.println("Debe ingresar una fecha valida: (dd/MM/yyyy) ");
			System.exit(0);
		}
		if (val.validaHora(hora) == 1) {
			System.out.println("Debe ingresar una hora valida: (18:30) ");
			System.exit(0);
		}
		
		Vehiculo ve = new Vehiculo(placa, fecha, hora);
		
		if (val.validaVehiculo(ve) == 1) {
			System.out.println("Vehiculo no puede circular...");
		}else{
			System.out.println("Vehiculo puede circular...");
		}
		//
	}

}
