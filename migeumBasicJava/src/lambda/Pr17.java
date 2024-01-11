package lambda;

import java.util.function.Function;

class Section17 {
	private String division;
	private String school;

	public Section17(String division, String school) {
		this.division = division;
		this.school = school;
	}

	public String getDivision() {
		return division;
	}

	public String getSchool() {
		return school;
	}
}

class Member17 {
	private String name;
	private String major;
	private String tel;
	private Section17 section;

	public Member17(String name, String major, String tel, Section17 section) {
		this.name = name;
		this.major = major;
		this.tel = tel;
		this.section = section;
	}

	public String getName() {
		return name;
	}

	public String getMajor() {
		return major;
	}

	public String getTel() {
		return tel;
	}

	public Section17 getSection() {
		return section;
	}
}

public class Pr17 {
	public static void main(String[] args) {
		Member17 member = new Member17("홍길동", "컴공과", "111-1111", new Section17("대학", "공과"));
		Function<Member17, Section17> MembertoSectionFunction = m -> m.getSection();
		Function<Section17, String> sectiontoStringFunction;

		sectiontoStringFunction = s -> s.getDivision();
		Function<Member17, String> divisionFunction = MembertoSectionFunction.andThen(sectiontoStringFunction);

		sectiontoStringFunction = s -> s.getSchool();
		Function<Member17, String> schoolFunction = MembertoSectionFunction.andThen(sectiontoStringFunction);

		System.out.println(divisionFunction.apply(member));
		System.out.println(schoolFunction.apply(member));
		System.out.println(member.getName());

	}
}
