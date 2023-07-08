package fphln.sof2031.sd17321.Entity;

import fphln.sof2031.sd17321.ViewModel.QLNhanVien;
import fphln.sof2031.sd17321.ViewModel.QLSanPham;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity(name = "SanPham")
@Table(name = "SanPham")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SanPham {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID Id;

    @Column(name = "Ma")
    private String ma;

    @Column(name = "Ten")
    private String ten;

    public void loadFormVM(QLSanPham qlsp) {
        this.setMa(qlsp.getMa());
        this.setTen(qlsp.getTen());
    }
}
