package choonsik.choonsikspring.service;

import choonsik.choonsikspring.domain.Member;
import choonsik.choonsikspring.repository.MemberRepository;
import choonsik.choonsikspring.repository.MemoryMemberRepository;

import java.util.List;
import java.util.Optional;

// service는 비즈니스를 처리를 한다.
public class MemberService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();

    // 회원 가입
    public Long join(Member member) {
        // 같은 이름이 있는 중복회원은 허용하지 않음.
        // Optional
        validateDuplicateMember(member); // 중복 회원 검증
        memberRepository.save(member);
        return member.getId();
    }

    private void validateDuplicateMember(Member member) {
        memberRepository.findByName(member.getName())
                .ifPresent(m -> {
                    throw new IllegalArgumentException("이미 존재하는 회원입니다.");
                });
    }

    // 전체 회원 조회
    public List<Member> findMembers() {
        return memberRepository.findAll();
    }

    public Optional<Member> findOne(Long memberId) {
        return memberRepository.findById(memberId);
    }

}
