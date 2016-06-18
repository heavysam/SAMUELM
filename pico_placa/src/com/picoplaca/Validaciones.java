package com.picoplaca;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

import com.entidades.Vehiculo;

public class Validaciones {
	
public int validaVehiculo(Vehiculo v){
		
	    String placa = v.getMatricula(); 
	    String fecha = v.getFecha();
	    String hora = v.getHora();
		int retorno = 0;
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date startDate = null;
		
		try{
			//
			StringTokenizer stk = new StringTokenizer(hora, ":");
			String horas = stk.nextToken();
			String minutos = stk.nextToken();
			int ultimoPlaca = Integer.parseInt(placa.substring(placa.length()-1));
			
			int horamin =0;
			horamin = (Integer.parseInt(horas)*100) + Integer.parseInt(minutos);
			
			startDate = df.parse(fecha);
			if ((ultimoPlaca == 1 || ultimoPlaca == 2) && (startDate.getDay() == 1) && ((horamin >= 700 && horamin <= 930) || (horamin >= 1600 && horamin <= 1930))){
				retorno = 1;
			}
			if ((ultimoPlaca == 3 || ultimoPlaca == 4) && (startDate.getDay() == 2) && ((horamin >= 700 && horamin <= 930) || (horamin >= 1600 && horamin <= 1930))){
				retorno = 1;
			}
			if ((ultimoPlaca == 5 || ultimoPlaca == 6) && (startDate.getDay() == 3) && ((horamin >= 700 && horamin <= 930) || (horamin >= 1600 && horamin <= 1930))){
				retorno = 1;
			}
			if ((ultimoPlaca == 7 || ultimoPlaca == 8) && (startDate.getDay() == 4) && ((horamin >= 700 && horamin <= 930) || (horamin >= 1600 && horamin <= 1930))){
				retorno = 1;
			}
			if ((ultimoPlaca == 9 || ultimoPlaca == 0) && (startDate.getDay() == 5) && ((horamin >= 700 && horamin <= 930) || (horamin >= 1600 && horamin <= 1930))){
				retorno = 1;
			}
			String DiaSemana;
	        switch (startDate.getDay()) {
	            case 0:  DiaSemana = "Domingo";
	                     break;
	            case 1:  DiaSemana = "Lunes";
	                     break;
	            case 2:  DiaSemana = "Martes";
	                     break;
	            case 3:  DiaSemana = "Miercoles";
	                     break;
	            case 4:  DiaSemana = "Jueves";
	                     break;
	            case 5:  DiaSemana = "Viernes";
	                     break;
	            case 6:  DiaSemana = "Sabado";
	                     break;
	            default: DiaSemana = "dia invalido";
	                     break;
	        }
			System.out.println("Vehiculo "+ v.getMatricula() +". Dia " + DiaSemana + ". Hora " + v.getHora());
			//			
		}catch(Throwable t){
			System.out.println(t.getStackTrace());
		}
		return retorno;
	}

public int validaFecha(String fecha){
	int retorno = 0;
	try {
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		Date startDate = null;
		startDate = df.parse(fecha);
	} catch (ParseException e) {
		retorno = 1;
	}
	return retorno;
}

public int validaHora(String hora){
	int retorno = 0;
	try {
		StringTokenizer stk = new StringTokenizer(hora, ":");
		String horas = stk.nextToken();
		String minutos = stk.nextToken();		
		int horamin =0;
		horamin = (Integer.parseInt(horas)*100) + Integer.parseInt(minutos);
	} catch (Throwable e) {
		retorno = 1;
	}
	return retorno;
}

public int validaPlaca(String placa){
	int retorno = 0;
	try {
		int ultimoPlaca = Integer.parseInt(placa.substring(placa.length()-1));
	} catch (Throwable e) {
		retorno = 1;
	}
	return retorno;
}

}
