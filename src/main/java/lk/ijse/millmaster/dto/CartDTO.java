package lk.ijse.millmaster.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CartDTO {
    private String code;
    private Integer qty;
    private Double unitPrice;
}
