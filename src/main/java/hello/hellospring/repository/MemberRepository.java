package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member); // 회원이 저장소에 저장이 됨
    Optional<Member> findById(Long id); // id이나 name으로 회원을 찾아올 수 있도록!
    Optional<Member> findByName(String name);
    List<Member> findAll(); // 전체 회원 조회
}
