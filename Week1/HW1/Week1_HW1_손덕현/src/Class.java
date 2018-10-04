import org.omg.PortableInterceptor.SUCCESSFUL;

interface test {
	public int A = 10;
	public void func1();
}
class subclass {
	public int StundentID;
	public int PhoneNum;
	public String Name;
	
	public int Key = 10;
	
	public void setStudentID(int ID) {
		this.StundentID =  ID;
	}
	public int getStudentId() {
		return StundentID;
	}
	
	public void setPhoneNum(int Num) {
		this.PhoneNum = Num;
	}
	
	public int getPhoneNum() {
		return PhoneNum;
	}
	
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public String getName() {
		return Name;
	}		
}

class sub2class extends subclass {
	public void PrintKey() {
		System.out.println(Key);
	}
}

class sub3class implements test{

	@Override
	public void func1() {
		// TODO Auto-generated method stub
		System.out.println(A);
	}

}



public class Class {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subclass A = new subclass();
		subclass B = new subclass();
		sub2class C = new sub2class();
		sub3class D = new sub3class();
		
		A.setName("DeokHyeon");
		A.setPhoneNum(01045133341);
		A.setStudentID(201324467);
		
		B.setName("Apptive");
		B.setPhoneNum(01011112222);
		B.setStudentID(201311111);
		
		System.out.println("A의 Name : " + A.getName());
		System.out.println("A의 PhoneNumber : " + A.getPhoneNum());
		System.out.println("A의 StudentID : " + A.getStudentId());
		
		System.out.println("B의 Name : " + B.getName());
		
		System.out.println(A.Key);
		C.PrintKey();
		D.func1();
		
		
		
		
	}

}
