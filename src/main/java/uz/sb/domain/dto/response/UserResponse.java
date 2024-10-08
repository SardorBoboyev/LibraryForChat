package uz.sb.domain.dto.response;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class UserResponse {

    private String firstName;
    private String lastName;
    private String username;
    private String phoneNumber;
}
