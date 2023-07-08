package fphln.sof2031.sd17321.Entity;

import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Item {
    private UUID idChitietsp;
    private String tensanpham;
    private String tenmau;
    private Integer soLuong;
    private BigDecimal giaban;
}
