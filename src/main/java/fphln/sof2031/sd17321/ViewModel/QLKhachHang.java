package fphln.sof2031.sd17321.ViewModel;


import fphln.sof2031.sd17321.Entity.KhachHang;
import fphln.sof2031.sd17321.Entity.NhanVien;
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
public class QLKhachHang {

    @NotBlank(message = "không được để trống Mã")
    private String ma;

    @NotBlank(message = "không được để trống Họ")
    private String ho;

    @NotBlank(message = "không được để trống Tên đệm")
    private String tendem;

    @NotBlank(message = "không được để trống Tên")
    private String ten;


    @NotBlank(message = "không được để trống Email")
    @Email(message = "Email không đúng định dạng ")
    private String email;


    @NotNull(message = "không được để trống ngày sinh")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date ngaySinh;

    @NotBlank(message = "không được để trống sdt")
    private String sdt;


    @NotBlank(message = "không được để trống địa chỉ")
    private String diachi;

    @NotBlank(message = "không được để trống Thành phố")
    private String thanhpho;

    @NotBlank(message = "không được để trống quốc gia")
    private String quocgia;


    @NotBlank(message = "không được để trống mật khẩu")
    private String matkhau;


    public void loadFormEntity(KhachHang kh) {
        this.setMa(kh.getMa());
        this.setHo(kh.getHo());
        this.setTendem(kh.getTendem());
        this.setTen(kh.getTen());
        this.setEmail(kh.getEmail());
        this.setNgaySinh(kh.getNgaySinh());
        this.setDiachi(kh.getDiachi());
        this.setSdt(kh.getSdt());
        this.setThanhpho(kh.getThanhpho());
        this.setQuocgia(kh.getQuocgia());
        this.setMatkhau(kh.getMatkhau());


    }


}
