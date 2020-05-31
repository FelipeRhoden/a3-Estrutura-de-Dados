public class Pilha{
	private Item primeiroItem;
	
	public Pilha(){
		this.primeiroItem = new Item();
		
		return;
	}
	
	public Pilha(Item newItem){
		this.primeiroItem = new Item();
		this.primeiroItem.setProx(newItem);
		
	}
	
	public void add(Item newItem){
		newItem.setProx(this.primeiroItem.getProx());
		
		this.primeiroItem.setProx(newItem);
	}
	
	
	public Item remove(){
		Item removeItem = this.primeiroItem.getProx();
		
		this.primeiroItem.setProx(removeItem.getProx());
		removeItem.setProx(null);
		
		return removeItem;
	}
	
	public boolean estaVazia(){
		if (this.primeiroItem.getProx() == null){
			return true;
		} else {
			return false;
		}
		
	}
	
}