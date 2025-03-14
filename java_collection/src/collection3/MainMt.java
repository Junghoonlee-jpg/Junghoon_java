package collection3;

import java.util.ArrayList;
import java.util.Collections;

public class MainMt {

	public static void main(String[] args) {
		
//		ArrayList<Member> list = new ArrayList<>();
//		
//		list.add(new Member(1l,"jkr","jkr@naver.com","1234","19990101"));
//		list.add(new Member(2l, "dw","dw@naver.com","1234","19981010"));
//		
//		System.out.println(list);
		
		MemberDao dao = new MemberDao(); // 객체 만들어서 실행 했을경우 아무것도 안떠야 정상
		
		ArrayList<Member> memberList = dao.select();
		
		for(Member m : memberList) {
			System.out.println(m);
		}
		// 이메일로 아이디와 비밀번호를 조회
		String email="brown@gmail.com";
		for(Member mem : memberList) {
			if(mem.getEmail().equals(email)) {
				System.out.println(mem.getMemberId());
				System.out.println(mem.getPassword());
				break;
			}
		}
		
//		System.out.println(
//				memberList.contains(email)
//			);
		
//		memberList.contains( 대상 );
//		타입에대해서도 비교하기 때문에 동일한 타입으로 비교할 수 있게
//		email은 String 클래스 타입이라 안된다. 그래서
//		Member 클래스 객체에 email을 담아서 비교 되게 한다.
		
//		Member 대상 = new Member();
//		대상.setEmail(email);
//		
//		for(int i=0; i<memberList.size(); i++) {
//			Member cmp = memberList.get(i);
//			
//			if(cmp.equals(대상)) {
//				System.out.println("찾았다!");
//			}
//		}
		
//		System.out.println(memberList.contains(대상));
		
		// memberList에 등록된 사람들
		// 장은호와 같은 회원 있나? 
		
		Member 장은호 = new Member();
		장은호.setBirth("19970818");
		장은호.setEmail("babo@daum.net");
		장은호.setMemberId("kkk1");
		
		System.out.println(memberList.contains(장은호));
		System.out.println(memberList.indexOf(장은호));
		
		System.out.println("apple".compareTo("apple"));
		
		Collections.sort(memberList);
		System.out.println(memberList);
		for(Member m : memberList) {
			System.out.println(m.getId()+" "+m.getMeberId()+" "+m.getAge());
		}
//		Collections.sort(memberList);
		
	}

}
