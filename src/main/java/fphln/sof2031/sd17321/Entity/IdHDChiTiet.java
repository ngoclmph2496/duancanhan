package fphln.sof2031.sd17321.Entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.io.Serializable;

@Embeddable
@Data
public class IdHDChiTiet implements Serializable {
    @ManyToOne
    @JoinColumn(name = "IdHoaDon")
    private HoaDon hoaDon;

    @ManyToOne
    @JoinColumn(name = "IdChiTietSP")
    private ChiTietSP chiTietSP;
}
