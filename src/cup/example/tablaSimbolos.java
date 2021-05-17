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
		 public simboloLista buscar(String id){
			 return (simboloLista)(t.get(id));
		 }
		 public void imprimir(){
			 Iterator it = t.values().iterator();
			 while(it.hasNext()){
				 simboloLista s = (simboloLista)it.next();
				 if(s.tipo.equalsIgnoreCase("Entero")) 
					 System.out.println(s.tipo + " " + s.id + " := "+ s.valorD);
				 if(s.tipo.equalsIgnoreCase("Real")) 
					 System.out.println(s.tipo + " " + s.id + " := "+ s.valorD);
				 if(s.tipo.equalsIgnoreCase("Booleano")) 
					 System.out.println(s.tipo + " " + s.id + " := "+ s.valorB);
				 if(s.tipo.equalsIgnoreCase("Caracter")) 
					 System.out.println(s.tipo + " " + s.id + " := "+ s.valorC);	 
		 }
	}
}

