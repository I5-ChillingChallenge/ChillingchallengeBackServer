package com.example.oauth2jwt.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


public class UserInfoForm {
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Response{
        private String nickname;
        private int missionCnt; // 총 미션 수행 갯수
        private String attendance; // 출석 날짜들 (달력을 위해)
        private int continuous; // 연속출석일수

    }



}
