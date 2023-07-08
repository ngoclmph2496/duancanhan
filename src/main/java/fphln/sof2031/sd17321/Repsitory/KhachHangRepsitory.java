package fphln.sof2031.sd17321.Repsitory;


import fphln.sof2031.sd17321.Entity.KhachHang;
import fphln.sof2031.sd17321.Entity.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface KhachHangRepsitory extends JpaRepository<KhachHang, UUID> {
    KhachHang findByMaAndMatkhau(String ma, String matkhau);
}   
