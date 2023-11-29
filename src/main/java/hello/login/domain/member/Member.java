package hello.login.domain.member;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class Member {

    private Long id;

    @NotBlank
    private String loginId; // 로그인 Id

    @NotBlank
    private String name;    // 사용자 이름

    @NotBlank
    private String password;
}
