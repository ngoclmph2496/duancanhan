package fphln.sof2031.sd17321.ViewModel;


import fphln.sof2031.sd17321.Entity.NhanVien;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class QLNhanVien {

    @NotBlank(message = "không được để trống Mã")
    private String ma;

    @NotBlank(message = "không được để trống Họ")
    private String ho;

    @NotBlank(message = "không được để trống Tên đệm")
    private String tendem;

    @NotBlank(message = "không được để trống Tên")
    private String ten;


    @NotBlank(message = "không được để trống Email")
    @Email(message = "Email không đúng định đạng")
    private String email;

    @NotBlank
    private String gioitinh;

    @NotNull(message = "không được để trống ngày sinh")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date ngaySinh;


    @NotBlank(message = "không được để trống địa chỉ")
    private String diachi;


    @NotBlank(message = "không được để trống sdt")
    private String sdt;

    @NotBlank(message = "không được để trống mật khẩu")
    private String matkhau;


    private UUID chucVu;
    private UUID cuaHang;

    public void loadFormEntity(NhanVien nv) {
        this.setMa(nv.getMa());
        this.setHo(nv.getHo());
        this.setTendem(nv.getTendem());
        this.setTen(nv.getTen());
        this.setEmail(nv.getEmail());
        this.setGioitinh(nv.getGioitinh());
        this.setNgaySinh(nv.getNgaySinh());
        this.setDiachi(nv.getDiachi());
        this.setSdt(nv.getSdt());
        this.setMatkhau(nv.getMatkhau());
        this.setChucVu(nv.getChucVu().getId());
        this.setCuaHang(nv.getCuaHang().getId());


    }


}
