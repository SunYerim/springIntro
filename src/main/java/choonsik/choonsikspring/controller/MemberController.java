package choonsik.choonsikspring.controller;

import choonsik.choonsikspring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
    // 필드에 autowired -> 필드 주입. 그러나 별로 좋지 않음.
    @Autowired private MemberService memberService;

    // 생성ㅇ자
//    @Autowired // 연결시켜줄 때.
//    public MemberController(MemberService memberService) {
//        this.memberService = memberService;
//    }
}
