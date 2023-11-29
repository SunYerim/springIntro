package choonsik.choonsikspring.service;

import choonsik.choonsikspring.domain.Member;
import choonsik.choonsikspring.repository.MemberRepository;
import choonsik.choonsikspring.repository.MemoryMemberRepository;

public class MemberService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();

    // 회원 가입
    public Long join(Member member) {
        memberRepository.save(member);
        return member.getId();
    }
}
