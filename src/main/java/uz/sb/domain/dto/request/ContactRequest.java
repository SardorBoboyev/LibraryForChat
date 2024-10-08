package uz.sb.domain.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ContactRequest {


    private Long userId; // adder

    private Long contactUserId;  // person to join contact

    private String ContactName;
}
