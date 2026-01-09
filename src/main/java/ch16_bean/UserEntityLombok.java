package ch16_bean;

import lombok.*;

@AllArgsConstructor
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
@Getter // 여기가 클래스 레벨
@Setter
public class UserEntityLombok {
    private int username;
    @Setter     // 여기가 필드 레벨에 해당합니다.
    private int password;
    @NonNull
    private String email;
    @NonNull
    private String name;
}