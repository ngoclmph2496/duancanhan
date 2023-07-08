package fphln.sof2031.sd17321.Entity;

import fphln.sof2031.sd17321.ViewModel.QLChucVu;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "ChucVu")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChucVu {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "ma")
    private String ma;

    @Column(name = "ten")
    private String ten;

    public void loadformViewModel(QLChucVu qlcv) {
        this.setMa(qlcv.getMa());
        this.setTen(qlcv.getTen());
    }

}
