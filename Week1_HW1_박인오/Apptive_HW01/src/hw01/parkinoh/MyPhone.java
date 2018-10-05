package hw01.parkinoh;

public class MyPhone {

	public static void main(String[] args) {
		Samsung myPhone = new Samsung();
		myPhone.getData(1000000, 8.0);
		
		myPhone.printPrice();
		myPhone.printSize();
	}

}
