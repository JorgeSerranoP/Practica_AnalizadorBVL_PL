package cup.example;
import java.util.*;

public class tablaSimbolos{
		 HashMap t;
		 public tablaSimbolos(){
			 t = new HashMap();
		 }
		 public simboloLista insertar(String tipo, String id, Double valorD, Boolean valorB, Character valorC){
			 simboloLista s = new simboloLista(tipo, id, valorD, valorB, valorC); 
			 t.put(id, s);
			 return s;
		 }
		 public simboloLista insertarVector(String tipo, String id, Double valorD, Boolean valorB, Character valorC, Integer dimension1, Integer dimension2){
			 simboloLista s = new simboloLista(tipo, id, valorD, valorB, valorC, dimension1, dimension2); 
			 t.put(id, s);
			 return s;
		 }
		 public void put(String id, simboloLista s){
			 t.put(id, s);
		 }
		 public simboloLista buscar(String id){
			 return (simboloLista)(t.get(id));
		 }
		 public void imprimir(){
			 Iterator it = t.values().iterator();
			 while(it.hasNext()){
				 simboloLista s = (simboloLista)it.next();
				 if(s.tipo.equalsIgnoreCase("Entero") && s.dimension1 == null) 
					 System.out.println(s.tipo + " " + s.id + " := "+ s.valorD);
				 if(s.tipo.equalsIgnoreCase("Real") && s.dimension1 == null) 
					 System.out.println(s.tipo + " " + s.id + " := "+ s.valorD);
				 if(s.tipo.equalsIgnoreCase("Booleano") && s.dimension1 == null) 
					 System.out.println(s.tipo + " " + s.id + " := "+ s.valorB);
				 if(s.tipo.equalsIgnoreCase("Caracter") && s.dimension1 == null) 
					 System.out.println(s.tipo + " " + s.id + " := "+ s.valorC);	
				 if(s.dimension1 != null && s.dimension2 != null) {
					 if(s.tipo.equalsIgnoreCase("Entero")) 
							 System.out.println("VECTOR " + s.tipo + " " + s.id +  " [" + s.dimension1 + "]" + "[" + s.dimension2 + "] := "+ s.valorD);
					 if(s.tipo.equalsIgnoreCase("Real")) 
						 System.out.println("VECTOR " + s.tipo + " " + s.id +  " [" + s.dimension1 + "]" + "[" + s.dimension2 + "] := "+ s.valorD);
					 if(s.tipo.equalsIgnoreCase("Booleano")) 
						 System.out.println("VECTOR " + s.tipo + " " + s.id +  " [" + s.dimension1 + "]" + "[" + s.dimension2 + "] := "+ s.valorB);
					 if(s.tipo.equalsIgnoreCase("Caracter")) 
						 System.out.println("VECTOR " + s.tipo + " " + s.id +  " [" + s.dimension1 + "]" + "[" + s.dimension2 + "] := "+ s.valorC);
				 }
				 if(s.dimension1 != null && s.dimension2 == null) {
					 if(s.tipo.equalsIgnoreCase("Entero")) {
						 for (int i = 0; i < s.valorDVector.length; i++){
							 System.out.println("VECTOR " + s.tipo + " " + s.id +  " [" + i + "] := "+ s.valorDVector[i]);
						 }
					 }
					 if(s.tipo.equalsIgnoreCase("Real")) { 
						 for (int i = 0; i < s.valorDVector.length; i++){
							 System.out.println("VECTOR " + s.tipo + " " + s.id +  " [" + i + "] := "+ s.valorDVector[i]);
						 }
					 }
					 if(s.tipo.equalsIgnoreCase("Booleano")) { 
						 for (int i = 0; i < s.valorBVector.length; i++){
							 System.out.println("VECTOR " + s.tipo + " " + s.id +  " [" + i + "] := "+ s.valorBVector[i]);
						 }
				 	 }
					 if(s.tipo.equalsIgnoreCase("Caracter")) { 
						 for (int i = 0; i < s.valorCVector.length; i++){
							 System.out.println("VECTOR " + s.tipo + " " + s.id +  " [" + i + "] := "+ s.valorCVector[i]);
						 }
					 }
				 }
			 }
	}
}

