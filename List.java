public class List{
	private Item primeiroItema;
	
	public List(){
		this.primeiroItema = new Item();
		
		return;
	}
	
	public List(Item newItem){
		this.primeiroItema = new Item();
		this.primeiroItema.setProx(newItem);
		
	}
	
	public void add(Item newItem){
		Item lastItem = this.primeiroItema;
		while(lastItem.getProx() != null){
			lastItem = lastItem.getProx();
		}
		
		lastItem.setProx(newItem);
		
	}
	
	public void add(Item newItem,int posicao){
		Item itemIncert = this.primeiroItema;
		int i = 0;
		
		while(i != posicao && itemIncert.getProx() != null){
			itemIncert = itemIncert.getProx();
			i++;
		}
	
		itemIncert.setProx(newItem); 
		
	}
	
	public void remove(Item itemRemove){
		Item item = this.primeiroItema;
		while(item.getProx() != null
		&& item.getProx().getInfo() != itemRemove.getInfo()){
			item = item.getProx();
		}
		
		if(item.getProx() != null){

			Item prox = item.getProx(); 
		
			item.setProx(prox.getProx());
		
			prox.setProx(null);
		}
			
	}
	
	public Item pegaItem(int posicao){
		Item item = this.primeiroItema;
		int i = 0;
		
		while (item.getProx() != null && posicao != i){
			item = item.getProx();
			i++;
		}
		
		if(item.getProx() == null){
			return null;
			
		}
		
		return item.getProx();
		
		
	}
	
	public void read(int posicao){
		Item itemRead = this.primeiroItema;
		int i = 0;
		
		while(i != posicao && itemRead.getProx() != null){
			itemRead = itemRead.getProx();
			i++;
		}
		
		if(itemRead.getProx() == null){
			System.out.println("Item não existente");
			
		}else{
			Item item = itemRead.getProx(); 
			System.out.println(item.getInfo());
		
		}
		
	}
	
	public int length(){
		Item item = this.primeiroItema;
		int i = 0;
		
		while (item.getProx() != null){
			item = item.getProx();
			i++;
		}
		
		return i;
	} 
	
	public boolean has(Item hasItem){
		Item item = this.primeiroItema;
		
		while(item.getProx() != null &&
		item.getProx().getInfo() != hasItem.getInfo()){
			item = item.getProx();
		}
		
		if(item.getProx() != null){
			return true;
		}else{
			return false;
		}
	}
	
}