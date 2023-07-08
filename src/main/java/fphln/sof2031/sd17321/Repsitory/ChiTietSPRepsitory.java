package fphln.sof2031.sd17321.Repsitory;

import fphln.sof2031.sd17321.Entity.ChiTietSP;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ChiTietSPRepsitory extends JpaRepository<ChiTietSP, UUID> {

}
