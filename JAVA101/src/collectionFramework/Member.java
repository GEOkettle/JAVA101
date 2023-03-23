package collectionFramework;

public class Member implements Comparable<Member> {
	private int memberId;
	private String memberName;
	
	public Member(int memberId, String memberName) {
		
		setMemberId(memberId);
		setMemberName(memberName);
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {

		return memberName + " 회원님의 아이디는 " + memberId + " 입니다.";
	}
	

	@Override
	public int hashCode() {
		
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Member) {
			//downcasting
			Member member = (Member) obj;
			if(this.memberId == member.memberId) {
				return true;
			}else return false;
		}
		return false;
	}

	@Override
	public int compareTo(Member member) {

		return (this.memberId - member.memberId);//오름
//		return (member.memberId - this.memberId);//내림
	}
	
//	@override
//	public int compare (Member member1, Member member2) {
//		
//		return blahblah;
//	}
//	파라메터 두개넣어서 여러개비교하고싶을떄는 Comparator를 상속받고 compare 메서드를 오버라이드한다.
// comparable과 달리 comparator를 사용할 때는 자료형 생성시 생성자에 구현하는 객체를 명시해준다
	
	//생성자
//	public MemberTreeSeet() {
//		treeSet = new TreeSet<>(new Member());
//		}
	
	
	
}
