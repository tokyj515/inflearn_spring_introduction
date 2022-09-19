package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member); //회원이 저장소에 저장
    Optional<Member> findById(Long id); //id로 찾기
    Optional<Member> findByName(String name); //이름으로 찾기
    List<Member> findAll(); //저장된 모든 회원 리스트
}