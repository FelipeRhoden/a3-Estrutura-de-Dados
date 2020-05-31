public class Item {
	private Item prox;
	private int info;
	
	public Item(){
		
	}
	
	public Item(int info){
		this.info = info;
	}
	
	public Item getProx(){
		return this.prox;
	}
	
	public int getInfo(){
		return this.info;
	}
	
	public void setProx(Item newProx){
		this.prox = newProx;
	}
	
	public void setInfo(int newInfo){
		this.info = newInfo;
	}
}