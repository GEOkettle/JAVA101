package collectionFramework;

public class MemberTreeSetTest {

	
	public static void main(String[] args) {
		
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		Member[] members = new Member[5]; 
		 
		for(int i = 0; i<members.length; i++) {
			members[i] = new Member(i,"newMem"+i);
			memberTreeSet.addMember(members[i]);
		}
		memberTreeSet.showAllMember();
	
		Member dupliMember= new Member(2,"newMem2");
		memberTreeSet.addMember(dupliMember);
		memberTreeSet.showAllMember();
		
		
		
	}
}
