package homeworkjava;


public class Animals {
	String name;
	int mv;
	String speed[];
	
	public void setName(String name) {
		this.name = name;
		System.out.println("이름 : "+name);
	}
	
	public void move(int mv) {
		this.mv = mv;
		System.out.println(this.name+"의 이속 = "+mv);	
	}
	
	public class dogs extends Animals{}

	public class cats extends Animals{}

	public void main(String[] args) {
		Animals dog = new dogs();
		Animals cat = new cats();
		
		dog.setName("U");
		cat.setName("W");
		dog.move(3);
		cat.move(5);
	}

}
