package fphln.sof2031.sd17321.Entity;

import fphln.sof2031.sd17321.ViewModel.QLCuaHang;
import fphln.sof2031.sd17321.ViewModel.QLMauSac;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "mausac")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MauSac {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "ma")
    private String ma;

    @Column(name = "ten")
    private String ten;

    public void loatFormViewModel(QLMauSac qlms) {
        this.setMa(qlms.getMa());
        this.setTen(qlms.getTen());
    }
}
