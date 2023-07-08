package fphln.sof2031.sd17321.ViewModel;

import fphln.sof2031.sd17321.Entity.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class QLChiTietSP {


    @NotNull(message = "Không được để trống năm bán hàng")
    private Integer nambanhang;


    @NotBlank(message = "Không được để trống Mô Tả")
    private String mota;


    @NotNull(message = "Không được để trống Số lượng tồn")
    private Integer soluongton;


    @NotNull(message = "Không được để trống Gía Nhập")
    private BigDecimal gianhap;


    @NotNull(message = "Không được để trống Gía Bán")
    private BigDecimal giaban;


    private UUID sanPham;
    private UUID nsx;
    private UUID mauSac;
    private UUID dongSP;

    public void loadFormEntity(ChiTietSP chiTietSP) {
        this.setNambanhang(chiTietSP.getNambanhang());
        this.setMota(chiTietSP.getMota());
        this.setSoluongton(chiTietSP.getSoluongton());
        this.setGiaban(chiTietSP.getGiaban());
        this.setGianhap(chiTietSP.getGianhap());
        this.setDongSP(chiTietSP.getDongSP().getId());
        this.setSanPham(chiTietSP.getSanPham().getId());
        this.setMauSac(chiTietSP.getMauSac().getId());
        this.setNsx(chiTietSP.getNsx().getId());

    }
}
