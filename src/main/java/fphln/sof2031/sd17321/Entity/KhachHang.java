package fphln.sof2031.sd17321.Entity;

import fphln.sof2031.sd17321.ViewModel.QLKhachHang;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "KhachHang")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class KhachHang {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;


    @Column(name = "Ma")
    private String ma;

    @Column(name = "Ho")
    private String ho;

    @Column(name = "TenDem")
    private String tendem;


    @Column(name = "ten")
    private String ten;


    @Column(name = "Email")
    private String email;

    @Column(name = "NgaySinh")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date ngaySinh;

    @Column(name = "Sdt")
    private String sdt;


    @Column(name = "DiaChi")
    private String diachi;

    @Column(name = "ThanhPho")
    private String thanhpho;


    @Column(name = "QuocGia")
    private String quocgia;

    @Column(name = "MatKhau")
    private String matkhau;

    public void loadFormViewModel(QLKhachHang qlkh) {
        this.setMa(qlkh.getMa());
        this.setHo(qlkh.getHo());
        this.setTendem(qlkh.getTendem());
        this.setTen(qlkh.getTen());
        this.setEmail(qlkh.getEmail());
        this.setNgaySinh(qlkh.getNgaySinh());
        this.setDiachi(qlkh.getDiachi());
        this.setSdt(qlkh.getSdt());
        this.setThanhpho(qlkh.getThanhpho());
        this.setQuocgia(qlkh.getQuocgia());
        this.setMatkhau(qlkh.getMatkhau());
    }
}
