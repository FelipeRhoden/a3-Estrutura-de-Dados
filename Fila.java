public class Fila{
	private Item primeiroItem;
	
	public Fila(){
		this.primeiroItem = new Item();
		return;
	}
	
	public Fila(Item newItem){
		this.primeiroItem = new Item();
		this.primeiroItem.setProx(newItem);
		
	}
	
	public void add(Item newItem){
		Item itens = this.primeiroItem;
		
		while(itens.getProx() != null){
			
			itens = itens.getProx();
			
		}
		
		itens.setProx(newItem);
	}
	
	
	public Item remove(){
		Item removeItem = this.primeiroItem.getProx();
		
		this.primeiroItem.setProx(removeItem.getProx());
		removeItem.setProx(null);
		
		return removeItem;
	}
	
	public void obtemPosicao(Item itemPosicao){
		
		Item itens = this.primeiroItem;
		int cont = 0;
		
		while (itens.getProx() != null &&
		(itens.getProx().getInfo() != itemPosicao.getInfo())){

			itens = itens.getProx();
			cont++;
			
		}
		
		if(itens.getProx() == null){
			System.out.println("Item nao encontrado");
			
		}else{
			System.out.println(cont);
			
		}
		
		
	}
	
	public boolean estaVazia(){
		if (this.primeiroItem.getProx() == null){
			return true;
		} else {
			return false;
		}
		
	}
	
}