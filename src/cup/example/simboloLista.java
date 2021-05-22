package cup.example;

public class simboloLista {
	String tipo;
	String id;
	Double valorD;
	Boolean valorB;
	Character valorC;
	Double valorDVector[];
	Boolean valorBVector[];
	Character valorCVector[];
	Double valorDVector2[][];
	Boolean valorBVector2[][];
	Character valorCVector2[][];
	Integer dimension1;
	Integer dimension2;
	Boolean isChanged;
	
	public simboloLista(String tipo, String id, Double valorD, Boolean valorB, Character valorC){
		this.tipo = tipo;
		this.id = id;
		this.valorD = valorD;
		this.valorB = valorB;
		this.valorC = valorC;
	}

	public simboloLista(String tipo, String id, Double valorD, Boolean valorB, Character valorC, Integer dimension1, Integer dimension2 ){
		this.tipo = tipo;
		this.id = id;
		this.valorDVector = new Double[dimension1];
		this.valorBVector = new Boolean[dimension1];
		this.valorCVector = new Character[dimension1];
		this.valorD = valorD;
		this.valorB = valorB;
		this.valorC = valorC;
		this.dimension1 = dimension1;
		this.dimension2 = dimension2;
		if (dimension2 != null) {
			this.valorDVector2 = new Double[dimension1][dimension2];
			this.valorBVector2 = new Boolean[dimension1][dimension2];
			this.valorCVector2 = new Character[dimension1][dimension2];
		}
	}
	
}
