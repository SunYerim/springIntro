package choonsik.choonsikspring;

import choonsik.choonsikspring.repository.JdbcMemberRepository;
import choonsik.choonsikspring.repository.JdbcTemplateMemberRepository;
import choonsik.choonsikspring.repository.MemberRepository;
import choonsik.choonsikspring.repository.MemoryMemberRepository;
import choonsik.choonsikspring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    private final DataSource dataSource;
    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        //return new MemoryMemberRepository();
        //return new JdbcMemberRepository(dataSource);
        return new JdbcTemplateMemberRepository(dataSource);
        // interface는 new 안됨.
    }
}
