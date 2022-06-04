package com.korea.teamps.controller;

import com.korea.teamps.domain.Member;
import com.korea.teamps.repository.JdbcMemberRepository;
import com.korea.teamps.repository.MemberRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;
import java.util.Random;

@Controller
public class BoardController {

    private final MemberRepository memberRepository;

    public BoardController(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @GetMapping("/community")
    public String free() {
        return "free";
    }

    @GetMapping("/community/build")
    public String build() {
        return "build";
    }

    @GetMapping("/notice")
    public String notice() {
        return "notice";
    }

}
