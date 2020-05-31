class a3{
	
	public static void main(String[] args){
	
		List lista = new List();
		
		lista.add(new Item(1));
		lista.add(new Item(2));
		lista.add(new Item(3));
		lista.add(new Item(4));
		lista.add(new Item(5));
		
		Pilha pilha = new Pilha();
		
		int length = lista.length();
		
		for (int i = 0; i < length; i++){
			Item item = lista.pegaItem(0);
			lista.remove(item);
			
			pilha.add(item);
		}
		
		Fila fila = new Fila();
		
		while(!pilha.estaVazia()){
			
			fila.add(pilha.remove());
			
		}
		
		lista.add(new Item(6));
		lista.add(new Item(7));
		lista.add(new Item(8));
		lista.add(new Item(9));
		lista.add(new Item(10));
		 
		length = lista.length();
		
		for (int i = 0; i < length; i++){
			Item item = lista.pegaItem(0);
			lista.remove(item);
			
			pilha.add(item);
		}
		
		
		while(!pilha.estaVazia()){
			
			fila.add(pilha.remove());
			
		}
		
		while(!fila.estaVazia()){
			
			System.out.println(fila.remove().getInfo());
			
		}
		
	
	}

}