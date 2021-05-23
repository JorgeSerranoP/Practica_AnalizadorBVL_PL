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
				 //Símbolos normales
				 if(s.tipo.equalsIgnoreCase("Entero") && s.dimension1 == null) 
					 System.out.println(s.tipo + " " + s.id + " := "+ s.valorD+ s.isChanged);
				 if(s.tipo.equalsIgnoreCase("Real") && s.dimension1 == null) 
					 System.out.println(s.tipo + " " + s.id + " := "+ s.valorD+ s.isChanged );
				 if(s.tipo.equalsIgnoreCase("Booleano") && s.dimension1 == null) 
					 System.out.println(s.tipo + " " + s.id + " := "+ s.valorB + s.isChanged);
				 if(s.tipo.equalsIgnoreCase("Caracter") && s.dimension1 == null) 
					 System.out.println(s.tipo + " " + s.id + " := "+ s.valorC);	
				 //Vectores dos dimensiones
				 if(s.dimension1 != null && s.dimension2 != null) {
					 if(s.tipo.equalsIgnoreCase("Entero")) {
						 for (int i = 0; i < s.dimension1; i++){
							 for (int j = 0; j < s.dimension2; j++){
								 System.out.println("VECTOR " + s.tipo + " " + s.id +  " [" + i + "]" + "[" + j + "] := "+ s.valorDVector2[i][j]+ s.isChanged );
							 }
						 }
					 }
					 if(s.tipo.equalsIgnoreCase("Real")) { 
						 for (int i = 0; i < s.dimension1; i++){
							 for (int j = 0; j < s.dimension2; j++){
								 System.out.println("VECTOR " + s.tipo + " " + s.id +  " [" + i + "]" + "[" + j + "] := "+ s.valorDVector2[i][j]+ s.isChanged);
							 }
						 }
					 }
					 if(s.tipo.equalsIgnoreCase("Booleano")) { 
						 for (int i = 0; i < s.dimension1; i++){
							 for (int j = 0; j < s.dimension2; j++){
								 System.out.println("VECTOR " + s.tipo + " " + s.id +  " [" + i + "]" + "[" + j + "] := "+ s.valorBVector2[i][j]+ s.isChanged);
							 }
						 }
					 }
					 if(s.tipo.equalsIgnoreCase("Caracter")) { 
						 for (int i = 0; i < s.dimension1; i++){
							 for (int j = 0; j < s.dimension2; j++){
								 System.out.println("VECTOR " + s.tipo + " " + s.id +  " [" + i + "]" + "[" + j + "] := "+ s.valorCVector2[i][j]+ s.isChanged);
							 }
						 }
					 }
				 }
				//Vectores una dimension
				 if(s.dimension1 != null && s.dimension2 == null) {
					 if(s.tipo.equalsIgnoreCase("Entero")) {
						 for (int i = 0; i < s.dimension1; i++){
							 System.out.println("VECTOR " + s.tipo + " " + s.id +  " [" + i + "] := "+ s.valorDVector[i]+ s.isChanged);
						 }
					 }
					 if(s.tipo.equalsIgnoreCase("Real")) { 
						 for (int i = 0; i < s.dimension1; i++){
							 System.out.println("VECTOR " + s.tipo + " " + s.id +  " [" + i + "] := "+ s.valorDVector[i]+ s.isChanged);
						 }
					 }
					 if(s.tipo.equalsIgnoreCase("Booleano")) { 
						 for (int i = 0; i < s.dimension1; i++){
							 System.out.println("VECTOR " + s.tipo + " " + s.id +  " [" + i + "] := "+ s.valorBVector[i]+ s.isChanged);
						 }
				 	 }
					 if(s.tipo.equalsIgnoreCase("Caracter")) { 
						 for (int i = 0; i < s.dimension1; i++){
							 System.out.println("VECTOR " + s.tipo + " " + s.id +  " [" + i + "] := "+ s.valorCVector[i]+ s.isChanged);
						 }
					 }
				 }
			 }
	}
}

