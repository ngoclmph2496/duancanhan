package fphln.sof2031.sd17321.ViewModel;

import fphln.sof2031.sd17321.Entity.ChiTietSP;
import fphln.sof2031.sd17321.Entity.HoaDon;
import fphln.sof2031.sd17321.Entity.IdHDChiTiet;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class QLIdHDChiTiet {
    private HoaDon hoaDon;
    private ChiTietSP chiTietSP;

    private void loadFormEntity(IdHDChiTiet idHDChiTiet) {
        this.setHoaDon(idHDChiTiet.getHoaDon());
        this.setChiTietSP(idHDChiTiet.getChiTietSP());
    }
}
