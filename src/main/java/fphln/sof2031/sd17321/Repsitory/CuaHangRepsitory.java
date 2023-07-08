package fphln.sof2031.sd17321.Repsitory;

import fphln.sof2031.sd17321.Entity.CuaHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface CuaHangRepsitory extends JpaRepository<CuaHang, UUID> {


}
