package fphln.sof2031.sd17321.Repsitory;

import fphln.sof2031.sd17321.Entity.HDChiTiet;
import fphln.sof2031.sd17321.Entity.IdHDChiTiet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HDChiTietRepstory extends JpaRepository<HDChiTiet, IdHDChiTiet> {
}
