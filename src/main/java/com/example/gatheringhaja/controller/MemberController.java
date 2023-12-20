package com.example.gatheringhaja.controller;

import com.example.gatheringhaja.dto.response.FindByIdMemberResponse;
import com.example.gatheringhaja.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/members")
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/{memberId}")
    public ResponseEntity<FindByIdMemberResponse> findById(@PathVariable("memberId") Long memberId) {
        return ResponseEntity.ok().body(memberService.findById(memberId));
    }

}
