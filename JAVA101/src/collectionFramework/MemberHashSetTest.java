package collectionFramework;

public class MemberHashSetTest {

	
	public static void main(String[] args) {
		
		MemberHashSet memberHashSet = new MemberHashSet();
		Member[] members = new Member[5]; 
		 
		for(int i = 0; i<members.length; i++) {
			members[i] = new Member(i,"newMem"+i);
			memberHashSet.addMember(members[i]);
		}

		//hashset은 중복을 허용하지않는데 equals와 hascode를 override하지 않아서 중복검사를 통과해버림
		//hashcode에 대한 재정의해서 아이디가 같으면 중복처리하게 override
		memberHashSet.showAllMember();
		Member dupliMember= new Member(2,"newMem2");
		memberHashSet.addMember(dupliMember);
		
		
		
		memberHashSet.showAllMember();
		//순서대로정렬안되는건 확인가능
//		newMem2 회원님의 아이디는 2 입니다.
//		newMem4 회원님의 아이디는 4 입니다.
//		newMem1 회원님의 아이디는 1 입니다.
//		newMem3 회원님의 아이디는 3 입니다.
//		newMem0 회원님의 아이디는 0 입니다.
		memberHashSet.removeMember(1);
		memberHashSet.showAllMember();
 
		
	}
}
