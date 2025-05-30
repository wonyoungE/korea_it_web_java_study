package _29_Builder;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class MemberLombok {
    private String name;
    private int age;
    private String email;
}
