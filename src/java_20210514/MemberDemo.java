package java_20210514;

import java.util.ArrayList;

public class MemberDemo {
	public static void main(String[] args) {
		MemberManager m = new MemberManager();
		m.insert("jeongke1", "정광의1", 10);
		m.insert("jeongke2", "정광의2", 20);
		m.insert("jeongke3", "정광의3", 30);
		m.insert("jeongke4", "정광의4", 40);

		ArrayList list = m.select();
		for (int i = 0; i < list.size(); i++) {
			Member m2 = (Member) list.get(i);
			System.out.printf("%s, %s, %d %n", m2.getId(), m2.getName(), m2.getAge());
		}
		System.out.println("============================================================");
		m.delete("jeongke1");
		for (int i = 0; i < list.size(); i++) {
			Member m2 = (Member) list.get(i);
			System.out.printf("%s, %s, %d %n", m2.getId(), m2.getName(), m2.getAge());
		}
		System.out.println("============================================================");

		m.update("jeongke2","정광의2",100);
		for (int i = 0; i < list.size(); i++) {
			Member m2 = (Member) list.get(i);
			System.out.printf("%s, %s, %d %n", m2.getId(), m2.getName(), m2.getAge());
		}
		System.out.println("============================================================");

		
		Member m3 = m.select("jeongke4");
		System.out.printf("%s, %s, %d %n", m3.getId(), m3.getName(), m3.getAge());

	}
}

