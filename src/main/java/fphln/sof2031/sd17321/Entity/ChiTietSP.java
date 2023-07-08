package fphln.sof2031.sd17321.Entity;

import fphln.sof2031.sd17321.ViewModel.QLChiTietSP;
import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

@Entity(name = "ChiTietSP")
@Table(name = "ChiTietSP")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ChiTietSP {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID Id;

    @Column(name = "NamBH")
    private Integer nambanhang;

    @Column(name = "MoTa")
    private String mota;

    @Column(name = "SoLuongTon")
    private Integer soluongton;

    @Column(name = "GiaNhap")
    private BigDecimal gianhap;

    @Column(name = "GiaBan")
    private BigDecimal giaban;

    @ManyToOne
    @JoinColumn(name = "IdSP")
    private SanPham sanPham;

    @ManyToOne
    @JoinColumn(name = "IdNsx")
    private NSX nsx;

    @ManyToOne
    @JoinColumn(name = "IdMauSac")
    private MauSac mauSac;

    @ManyToOne
    @JoinColumn(name = "IdDongSP")
    private DongSP dongSP;

    public void loadFormViewModel(QLChiTietSP qlChiTietSP) {
        this.setNambanhang(qlChiTietSP.getNambanhang());
        this.setMota(qlChiTietSP.getMota());
        this.setSoluongton(qlChiTietSP.getSoluongton());
        this.setGiaban(qlChiTietSP.getGiaban());
        this.setGianhap(qlChiTietSP.getGianhap());

    }
}
