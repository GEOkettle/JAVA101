package collectionFramework;

import java.util.HashMap;

public class MemberHashMapTest {

	
	public static void main(String[] args) {
		

		MemberHashMap memberHashMap = new MemberHashMap();
		Member[] members = new Member[5]; 
		 
		for(int i = 0; i<members.length; i++) {
			members[i] = new Member(i,"newMem"+i);
			memberHashMap.addMember(members[i]);
		}
		memberHashMap.showAllMember();
	//vanilla hashmap
		HashMap <Integer,String> hashMap = new HashMap<Integer,String>();
		
		for(int i =0; i<5; i++) {
			
		
			hashMap.put(i, "newMem"+i);
		}
		System.out.println(hashMap);
	}
}
