package fphln.sof2031.sd17321.Entity;

import fphln.sof2031.sd17321.ViewModel.QLNhanVien;
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

@Entity(name = "NhanVien")
@Table(name = "NhanVien")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NhanVien {
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

    @Column(name = "Ten")
    private String ten;

    @Column(name = "Email")
    private String email;

    @Column(name = "GioiTinh")
    private String gioitinh;


    @Column(name = "NgaySinh")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date ngaySinh;

    @Column(name = "DiaChi")
    private String diachi;

    @Column(name = "Sdt")
    private String sdt;

    @Column(name = "MatKhau")
    private String matkhau;

    @ManyToOne
    @JoinColumn(name = "IdCV")
    private ChucVu chucVu;

    @ManyToOne
    @JoinColumn(name = "IdCH")
    private CuaHang cuaHang;

    public void loadFormViewModel(QLNhanVien qlnv) {
        this.setMa(qlnv.getMa());
        this.setHo(qlnv.getHo());
        this.setTendem(qlnv.getTendem());
        this.setTen(qlnv.getTen());
        this.setEmail(qlnv.getEmail());
        this.setGioitinh(qlnv.getGioitinh());
        this.setNgaySinh(qlnv.getNgaySinh());
        this.setDiachi(qlnv.getDiachi());
        this.setSdt(qlnv.getSdt());
        this.setMatkhau(qlnv.getMatkhau());

    }
}
