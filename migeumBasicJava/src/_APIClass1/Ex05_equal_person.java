package _APIClass1;

class PersonEx5{
	long id;
	String name;
	int[] score=new int[3];
	
//	@Override
//	public boolean equals(Object obj) {
//		PersonEx5 p= (PersonEx5) obj;
//		return id==p.id&&p.name.equals(obj)&&p.score.equals(obj);
//	}
	
	@Override
	public boolean equals(Object obj) {
		PersonEx5 p= (PersonEx5) obj;
		
		return id==p.id&&name==p.name&&score[0]==p.score[0]&&score[1]==p.score[1]&&score[2]==p.score[2];
	}
	
	public PersonEx5(int id, String name,int[] score) {
		this.id=id;
		this.name=name;
		this.score[0]=score[0];
		this.score[1]=score[1];
		this.score[2]=score[2];
	}
}

public class Ex05_equal_person {

	public static void main(String[] args) {
		int score[]= {1,2,3};
		PersonEx5 p1=new PersonEx5(111,"Prodo",score);
		PersonEx5 p2=new PersonEx5(111,"Prodo",score);
		
		//p2=p1;
//		
//		if (p1.equals(p2)) {
//			System.out.println("�� ��ü�� ����.");
//		} else {
//			System.out.println("�� ��ü�� �ٸ���.");
//		}
//		
		if (p1.equals(p2)) {
			System.out.println("�� ��ü�� ����.");
		} else {
			System.out.println("�� ��ü�� �ٸ���.");
		}
	}

}
