package fphln.sof2031.sd17321.ViewModel;

import fphln.sof2031.sd17321.Entity.HDChiTiet;
import jakarta.persistence.Column;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class QLHDChiTiet {
    private Integer soluong;
    private BigDecimal donGia;

    public void loadFormEntity(HDChiTiet hdChiTiet) {
        this.setSoluong(hdChiTiet.getSoluong());
        this.setDonGia(hdChiTiet.getDonGia());

    }
}
