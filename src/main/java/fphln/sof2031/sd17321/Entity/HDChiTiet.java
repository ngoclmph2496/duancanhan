package fphln.sof2031.sd17321.Entity;


import fphln.sof2031.sd17321.ViewModel.QLHDChiTiet;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;

@Entity(name = "HoaDonChiTiet")
@Table(name = "HoaDonChiTiet")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class HDChiTiet {
    @EmbeddedId
    private IdHDChiTiet id;
    @Column(name = "SoLuong")
    private Integer soluong;

    @Column(name = "DonGia")
    private BigDecimal donGia;

    public void loadFormViewModel(QLHDChiTiet qlhdChiTiet) {
        this.setSoluong(qlhdChiTiet.getSoluong());
        this.setDonGia(qlhdChiTiet.getDonGia());

    }
}
