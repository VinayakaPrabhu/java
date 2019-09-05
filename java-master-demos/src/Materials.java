
public class Materials {
	public static void main(String[] args) {
		Materials materials = new Materials();

		Door door = new Door();
		door.price = 200;

		Window window = new Window();
		window.price = 500;

		materials.addMaterial(door, window);
		
		int total1 = materials.addMaterial1(door, window);
		System.out.println(total1);
		
		System.out.println(materials.addMaterial1(door, window));
	}

	public void addMaterial(Door door, Window window) {
		int total = door.price + window.price;
		System.out.println(total);
	}
	
	public int addMaterial1(Door door, Window window) {
		int total = door.price + window.price;
		return total;
	}
}

class Door {
	int price;
}

class Window {
	int price;
}