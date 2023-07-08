package fphln.sof2031.sd17321.ViewModel;


import fphln.sof2031.sd17321.Entity.CuaHang;
import fphln.sof2031.sd17321.Entity.MauSac;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class QLCuaHang {

    @NotBlank(message = "không được để trống Mã")
    private String ma;

    @NotBlank(message = "không được để trống Tên")
    private String ten;

    @NotBlank(message = "không được để trống Địa Chỉ")
    private String diachi;

    @NotBlank
    private String thanhpho;

    @NotBlank(message = "không được để trống Quốc Gia")
    private String quocgia;

    public void loadFormEntity(CuaHang ch) {
        this.setMa(ch.getMa());
        this.setTen(ch.getTen());
        this.setDiachi(ch.getDiachi());
        this.setThanhpho(ch.getThanhpho());
        this.setQuocgia(ch.getQuocgia());
    }
}
