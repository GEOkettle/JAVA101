package collectionFramework;

 public class MemberArrayListTest {

	 
	 
	 
	 
	public static void main(String[] args) {
		MemberArrayList memberArray = new MemberArrayList();
		 
		Member[] members = new Member[5]; 
		 
		for(int i = 0; i<members.length; i++) {
			members[i] = new Member(i,"newMem"+i);
			memberArray.addMember(members[i]);
		}
		
		memberArray.showAllMember();
		memberArray.removeMember(4);
		memberArray.showAllMember();
	 }
}
