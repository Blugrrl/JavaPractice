
public class Shoes {
	
	private int shoeSize;
	private String material;
	private int heelSize;
	
	public Shoes(int shoeSize, String material, int heelSize) {
		this.shoeSize = shoeSize;
		this.material = material;
		this.heelSize = heelSize;
	}
	
	public int getShoeSize() {
		return shoeSize;
	}
	
	public void setShoeSize(int shoeSize) {
		this.shoeSize = shoeSize;
	}
	
	public String getMaterial() {
		return material;
	}
	
	public void setMaterial(String material) {
		this.material = material;
	}

	public int getHeelSize() {
		return heelSize;
	}
	
	public void setHeelSize(int heelSize) {
		this.heelSize = heelSize;
	}
}
