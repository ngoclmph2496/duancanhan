package fphln.sof2031.sd17321.ViewModel;

import fphln.sof2031.sd17321.Entity.HoaDon;
import fphln.sof2031.sd17321.Entity.KhachHang;
import fphln.sof2031.sd17321.Entity.NhanVien;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class QLHoaDon {


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


    private UUID nhanVien;

    private UUID khachHang;

    private void loadFormEntity(HoaDon hd) {
        this.setMa(hd.getMa());
        this.setNgaytao(hd.getNgaytao());
        this.setNgaythanhtoan(hd.getNgaythanhtoan());
        this.setNgayship(hd.getNgayship());
        this.setNgaynhan(hd.getNgaynhan());
        this.setTinhtrang(hd.getTinhtrang());
        this.setTennguoinhan(hd.getTennguoinhan());
        this.setDiachi(hd.getDiachi());
        this.setSdt(hd.getSdt());
        this.setNhanVien(hd.getNhanVien().getId());
        this.setKhachHang(hd.getKhachHang().getId());
    }


}


