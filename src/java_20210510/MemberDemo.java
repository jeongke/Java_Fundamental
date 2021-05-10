package java_20210510;

public class MemberDemo {
	public static void print(Member m) {
		String name = m.getName();
		String email = m.getEmail();
		String zipcode = m.getZipcode();
		String addr1 = m.getAddr1();
		String addr2 = m.getAddr2();
		int age = m.getAge();
	
		System.out.println(name);
		System.out.println(email);
		System.out.println(zipcode);
		System.out.println(addr1);
		System.out.println(addr2);
		System.out.println(age);
		
	
		
	}
	
	public static void main(String[] args) {
		Member m = new Member();
		//m.name = "이름" X
		
		m.setMain("이름");
		m.setEmail("jeongke26@naver.com");
		m.setZipcode("12345");
		m.setAddr1("서울 중구");
		m.setAddr2("동아빌딩");
		m.setAge(30);
		print(m); //
		
		
		
		
		
		
		
		

		
	}
}
