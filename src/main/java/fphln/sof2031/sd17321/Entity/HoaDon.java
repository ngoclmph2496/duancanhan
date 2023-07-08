package fphln.sof2031.sd17321.Entity;

import fphln.sof2031.sd17321.ViewModel.QLHoaDon;
import fphln.sof2031.sd17321.ViewModel.QLNhanVien;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.UUID;

@Entity(name = "HoaDon")
@Table(name = "HoaDon")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class HoaDon {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "Ma")
    private String ma;

    @Column(name = "NgayTao")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date ngaytao;

    @Column(name = "NgayThanhToan")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date ngaythanhtoan;

    @Column(name = "NgayShip")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date ngayship;

    @Column(name = "NgayNhan")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date ngaynhan;

    @Column(name = "TinhTrang")
    private Integer tinhtrang;

    @Column(name = "TenNguoiNhan")
    private String tennguoinhan;

    @Column(name = "DiaChi")
    private String diachi;

    @Column(name = "Sdt")
    private String sdt;

    @ManyToOne
    @JoinColumn(name = "IdNV")
    private NhanVien nhanVien;

    @ManyToOne
    @JoinColumn(name = "IdKH")
    private KhachHang khachHang;

    private void loadFormViewModel(QLHoaDon qlhd) {
        this.setMa(qlhd.getMa());
        this.setNgaytao(qlhd.getNgaytao());
        this.setNgaythanhtoan(qlhd.getNgaythanhtoan());
        this.setNgayship(qlhd.getNgayship());
        this.setNgaynhan(qlhd.getNgaynhan());
        this.setTinhtrang(qlhd.getTinhtrang());
        this.setTennguoinhan(qlhd.getTennguoinhan());
        this.setDiachi(qlhd.getDiachi());
        this.setSdt(qlhd.getSdt());
    }


}
