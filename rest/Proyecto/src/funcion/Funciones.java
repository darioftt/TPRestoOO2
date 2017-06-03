package funcion;


import java.util.Calendar;
import java.util.GregorianCalendar;

public class Funciones {


	/*
	******************************
	         LISTA METODOS
	******************************
	01-TRAER DIA,
	02-TRAER MES,
	03-TRAER ANIO,
	04-AÑO BISIESTO,
	05-FECHA VALIDA,
	06-FECHA GREGORIAN CALENDAR CON PARAMETROS INT,
	07-FECHA GREGORIAN CALENDAR CON PARAMETRO STRING,
	08-FECHA CORTA,
	09-FECHA CORTA MAS HORA,
	10-FECHA PROXIMO,
	11-DIA HABIL,
	12-TRAER DIA DE LA SEMANA,
	13-TRAER MES EN LETRAS,
	14-TRAER FECHA LARGA,
	15-FECHAS IGUALES,
	16-FECHA HORA IGUALES,
	17-CANTIDAD DE DIAS DE UN MES,
	18-APROXIMAR DOS DECIMALES,
	19-ES NUMERO?,
	20-ES LETRA?,
	21-ES CADENA DE NUMERO?,
	22-ES CADENA DE LETRAS? */
	
	
	/* ***************METODOS********************* */
	
	
	
	
	//traer Anio
	
	//1- traer Anio actual
	public static int traerAnio (GregorianCalendar fecha){
		
		return fecha.get(Calendar.YEAR);
		
		}
	
	//2-Traer MES actual
	
	public static int  traerMes(GregorianCalendar fecha){
		
		return fecha.get(Calendar.MONTH)+1;
	
		
		
	}//3-traer DIA ACTUAL
	
	public static int traerDia (GregorianCalendar fecha){
		
		return fecha.get (Calendar.DAY_OF_MONTH);
		
	}
	//4-Traer esBisiesto
	//Anios divisibles por 4, exceptuando los que son divisible por 100 y no por 400.-
	
	public static boolean esBisiesto (int anio){
		boolean esBisiesto= false;
		//Defino caracteristicas de anio Bisiesto
		
		boolean div4=((anio%4)==0);
		boolean div100=((anio%100)==0);
		boolean div400=((anio%400)==0);
		
		if (div4 && (!div100 ||div400)){
			esBisiesto=true;
			
		
		
			
	}
	
		return esBisiesto;
		
           		
	}		
	

//5-FECHA VALIDA
//El mes es entero entre 1 y 12. En el caso de ser bisiesto es válido el día 29/02
	
	        public static boolean esFechaValida(int anio, int mes, int dia){
			boolean fechaValida=false;
			boolean bisiesto=esBisiesto(anio);
			
			if(mes>0 && mes <13){
				if((mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12)&&(dia<32)){
					 fechaValida=true;
				}else{
				if((mes==4 || mes==6 || mes==9 || mes==11)&&(dia<31)){
							fechaValida=true;
				}else{			
				if(mes==2 && bisiesto==true && dia<30){
					       fechaValida=true;
			
				}else{	       
				if(mes==2 && bisiesto!= true && dia<29){
					       
					 	fechaValida=true;
							}
						}
					}
				}
			}
			return fechaValida;
		}
		

	       //6-FECHA GREGORIAN CALENDAR
		
	        public static GregorianCalendar traerFecha(int anio, int mes, int dia){
			//GregorianCalendar fechaGregorian=null; //PROBE CON NULL Y SALTA ExceptionNullPointer 
			GregorianCalendar fechaGregorian=new GregorianCalendar();
			boolean fechaValida=esFechaValida(anio,mes,dia);
		    if(fechaValida==true){
		    	fechaGregorian.set(anio, mes, dia);
		    }
		    return fechaGregorian;
			}

     //7-TRAER FECHA (STRING) "20150322"
		
    
     public static GregorianCalendar traerFecha(String fecha){
	//GregorianCalendar fechaGregorian= null;
	GregorianCalendar fechaGregorian= new GregorianCalendar();
	boolean nro=false;
	int i=0;
	int longitudFecha=fecha.length();
	/*SUBSTRING: Devuelve una subcadena, la cual corresponde 
	 al contenido entre los valores beginIndex y endIndex.*/
	 
	String diaString=fecha.substring(0,2);
	String mesString=fecha.substring(3,4);
	String anioString=fecha.substring(5,8);
	
	//INTEGER.PARSEINT: se utiliza para pasar de CADENA A ENTERO.
	int dia=Integer.parseInt(diaString);
	int mes=Integer.parseInt(mesString);
	int anio=Integer.parseInt(anioString);
	
	while(i<longitudFecha && !nro){
		if(esNumero(diaString.charAt(i)) && esNumero(mesString.charAt(i)) && esNumero(anioString.charAt(i))==true){
		nro=true;
		fechaGregorian.set(anio, mes, dia);	//TODO no me lo setea en anio,mes,dia
		}
		i++;
	}
	return fechaGregorian;
}
	
         //8-FECHA CORTA
   		public static String traerFechaCorta(GregorianCalendar fecha){
   		String fechaCorta;
   		String dia1;
   		String mes1;
   		int anio=traerAnio(fecha);
   		int mes= traerMes(fecha);
   		int dia= traerDia(fecha);
   		
   		if(dia<10){//AGREGO EL CERO PARA QUE LA FECHA TENGA LONGITUD 10
   			dia1="0"+dia;
   		}else{dia1=String.valueOf(dia);}
   		
   		if(mes<10){
   			mes1="0"+mes;
   		}else{mes1=String.valueOf(mes);}
   		
   		return fechaCorta=dia1+"/"+mes1+"/"+anio;
   		}

		
		                                    
        
		
        	//9-TRAER FECHA CORTA MAS HORA
   			public static String traerFechaCortaHora(GregorianCalendar fecha){
   			String fechaCortaHora;
   			String fechacorta=traerFechaCorta(fecha);
   			int hora=fecha.get(Calendar.HOUR_OF_DAY);
   			int minutos=fecha.get(Calendar.MINUTE);
   			int segundos=fecha.get(Calendar.SECOND);
   			String minutos1;
   			String segundos1;
   			
   			if(minutos<10){
   				minutos1="0"+minutos;
   			}else{minutos1=String.valueOf(minutos);}
   			if(segundos<10){
   				segundos1="0"+segundos;
   			}else{segundos1=String.valueOf(segundos);}
   			
   			return fechaCortaHora=fechacorta+" "+hora+":"+minutos1+":"+segundos1;//ver long 16
   			}
		
   		    //10-TRAER FECHA PROXIMO
   			public static GregorianCalendar traerFechaProximo(GregorianCalendar fecha, int cantDias){
   			//capturar anio mes y dia de fecha 
   			GregorianCalendar fechaProximo =new GregorianCalendar();//crear un objeto nuevo con fecha
   			fechaProximo.add(Calendar.DAY_OF_MONTH, cantDias);
   			return fechaProximo;
   			}
   			
   			//11-DIA HABIL: SE CONSIDERA DIA HABIL DE LUNES A VIERNES
   			public static boolean esDiaHabil(GregorianCalendar fecha){
   			boolean diaHabil=false;
   			int dia=fecha.get(Calendar.DAY_OF_WEEK);
   				
   			//1=DOMINGO,2=LUNES, 3=MARTES,4=MIERCOLES,5=JUEVES,6=VIERNES,7=SABADO 
   			if(dia>1 && dia<=6){ 
   				diaHabil=true;
   				}
   				return diaHabil;
   			}
		//12- TRAER DIA DE LA SEMANA EN LETRAS.
		//PRE=DADA UNA FECHA EN FORMATO GREGORIANCALENDAR.
		//POST=NOS DEVUELVE EL DIA DE LA SEMANA EN LETRAS.
   		//12-TRAER DIA DE LA SEMANA
   		public static String traerDiaDeLaSemana(GregorianCalendar fecha){
   		String diasDeLaSemana[]={"Domingo","Lunes","Martes","Miercoles","Jueves","Viernes","Sabado"};
   		int dia=fecha.get(Calendar.DAY_OF_WEEK);		
   		return diasDeLaSemana[dia-1];
   			}
		    
   	    //13-TRAER MES EN LETRAS
   		public static String traerMesEnLetras(GregorianCalendar fecha){
   		String mesEnLetras[]={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
   		int mes=fecha.get(Calendar.MONTH);//0=ENERO
   		return mesEnLetras[mes+1];
   				}
   				
   	 //14-TRAER FECHA LARGA
		public static String traerFechaLarga(GregorianCalendar fecha){
		String mes=traerMesEnLetras(fecha);
		int anio=traerAnio(fecha);
		int dia=traerDia(fecha);
		String diaSemana=traerDiaDeLaSemana(fecha);
		String fechaLarga=diaSemana+" "+dia+" de "+mes+" del "+anio;
		return fechaLarga;
		}
		

		//15-FECHAS IGUALES
		public static boolean sonFechasIguales(GregorianCalendar fecha , GregorianCalendar fecha1){
			int dia1=fecha.get(Calendar.DAY_OF_MONTH);
			int mes1=fecha.get(Calendar.MONTH);
			int anio1=fecha.get(Calendar.YEAR);
			int dia2=fecha.get(Calendar.DAY_OF_MONTH);
			int mes2=fecha.get(Calendar.MONTH);
			int anio2=fecha.get(Calendar.YEAR);
			boolean fechasIguales=false;
			if(dia1==dia2 && mes1==mes2 && anio1==anio2){
				fechasIguales=true;
			}
			return fechasIguales;//capturando anio mes y dia de ambas fechas devolver la proposición
		}
		
		//16-FECHAS HORAS IGUALES
		public static boolean sonFechasHorasIguales(GregorianCalendar fecha , GregorianCalendar fecha1){
		boolean fechaHoraIguales=false;
		boolean fechasIguales=sonFechasIguales(fecha,fecha1);
		//VARIABLES PARA FECHA
		int hora1=fecha.get(Calendar.HOUR);
		int minutos1=fecha.get(Calendar.MINUTE);
		int AM_PM1=fecha.get(Calendar.AM_PM);
		//VARIABLES PARA FECHA1
		int hora2=fecha.get(Calendar.HOUR);
		int minutos2=fecha.get(Calendar.MINUTE);
		int AM_PM2=fecha.get(Calendar.AM_PM);
			
		//objeto1.equals(objeto2)
		if(fechasIguales==true && hora1==hora2 && minutos1==minutos2 && AM_PM1==AM_PM2){
		fechaHoraIguales=true;
		}//reutilizar la anterior despues caturar hora de ambas teniendo en cuenta am y pm
			return fechaHoraIguales;	
		}
		
		//17-CANTIDAD DE DIAS DE UN MES
		public static int traerCantDiasDeUnMes (int anio, int mes){
			int cantidad=0, dia=0;
			boolean bisiesto=esBisiesto(anio);
			if(mes==1 || mes==03||mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
				dia=31;
			}else{
				if(mes==4 || mes==6||mes==5 || mes==9 || mes==11){
					dia=30;
				}else{
					if(mes==2 && bisiesto==true){
						dia=29;
					}else{
						dia=28;
					}
				}
			}
			cantidad=dia;
			return cantidad;//TODO ver de resolverlo con arreglo tope de mes
		}
		
		//18-APROXIMAR DOS DECIMALES
		public static double aproximar2Decimal (double valor){
		//Si el tercer decimal es mayor o igual 5, suma 1 al segundo decimal
		double aproximado=0;
		aproximado=valor * Math.pow(10, 2); 
		/*SE MULTIPLICA EL VALOR POR 10^2 (CANTIDAD DE DECIMALES QUE SE DESEAN OBTENER)
		PARA OBTENER LA PARTE ENTERA DEL DECIMAL QUE INTERESA REDONDEAR*/
		aproximado=Math.round(aproximado);//CON MATH.ROUND SE REDONDEA EL VALOR ENTERO ANTERIOR
		aproximado= aproximado/Math.pow(10, 2);//SE VUELVE A PASAR A DECIMAL LO QUE SE HABIA TRANSFORMADO EN ENTERO PARA REDONDEAR
		return aproximado;	
		}
		
		//19-NUMERO?
		public static boolean esNumero(char c){
			String diccionario="0123456789";
			int longitudString=diccionario.length();
			boolean numero=false;
			int i=0;
			
			//while hasta que finalice o que lo encontro
				while(i<longitudString && !numero){
				numero=(diccionario.charAt(i)==c);
				i++;
			}
			return numero;
		}
		
		//20-LETRA?
		public static boolean esLetra(char c){
			String diccionarioLetras="abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
			int i=0;
			boolean esLetra=false;
			int longitudString=diccionarioLetras.length();
			
			while(i<longitudString && !esLetra){
				esLetra=(diccionarioLetras.charAt(i)==c);
				i++;
			}
			return esLetra;
		}
		
		//21-CADENA DE NROS?
		public static boolean esCadenaNros(String cadena){
			boolean cadenaNro=false;
			int longitudCadena=cadena.length();
			int i=0;
			
			while(i<longitudCadena && !cadenaNro){
				/*EL METODO ESNUMERO TIENE COMO PARAMETRO UN CHAR POR LO CUAL SE CONVIERTE
				CADENA A CHAR CON LA FUNCION "charAt" */
				cadenaNro= esNumero(cadena.charAt(i));
				i++;
			}
			return cadenaNro;
		}
		
		//22-CADENA DE LETRAS?
		public static boolean esCadenaLetras(String cadena){
			boolean cadenaLetras=false;
			int longitudString=cadena.length();
			int i=0;
			
				while(i<longitudString && !cadenaLetras){
				/*EL METODO ESNUMERO TIENE COMO PARAMETRO UN CHAR POR LO CUAL SE CONVIERTE
				CADENA A CHAR CON LA FUNCION "charAt" */
				cadenaLetras= esLetra(cadena.charAt(i));
				i++;
			}
			return cadenaLetras;
		}
		
		public static double convertirADouble ( int n ){
			return (( double) n);
			}
		
}
		
		
		
		
		