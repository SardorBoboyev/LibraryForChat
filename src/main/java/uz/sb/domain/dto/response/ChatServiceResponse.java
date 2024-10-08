package uz.sb.domain.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ChatServiceResponse extends BaseResponse {
    private Long user1Id;
    private Long user2Id;
}
