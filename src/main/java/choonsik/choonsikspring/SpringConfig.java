package choonsik.choonsikspring;

import choonsik.choonsikspring.repository.MemberRepository;
import choonsik.choonsikspring.repository.MemoryMemberRepository;
import choonsik.choonsikspring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
        // interface는 new 안됨.
    }
}
