package choonsik.choonsikspring.repository;

import choonsik.choonsikspring.domain.Member;

import java.util.Optional;
import java.util.List;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    List<Member> findAll(); // 모든 회원 리스트 반환


}
