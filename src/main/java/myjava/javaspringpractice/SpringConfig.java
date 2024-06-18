package myjava.javaspringpractice;

import myjava.javaspringpractice.repository.MemberRepository;
import myjava.javaspringpractice.repository.MemoryMemberRepository;
import myjava.javaspringpractice.service.MemberService;
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
    }
}
