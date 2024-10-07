package uz.sb.domain.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class JwtResponse {

    private String accessToken;

    private String refreshToken;

    public JwtResponse(String accessToken) {
        this.accessToken = accessToken;
    }
}
