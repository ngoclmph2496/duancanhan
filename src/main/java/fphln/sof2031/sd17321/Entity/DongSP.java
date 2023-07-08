package fphln.sof2031.sd17321.Entity;

import fphln.sof2031.sd17321.ViewModel.QLDongSP;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity(name = "DongSP")
@Table(name = "DongSP")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DongSP {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID Id;

    @Column(name = "Ma")
    private String ma;

    @Column(name = "Ten")
    private String ten;

    public void loatformViewModel(QLDongSP qldsp) {
        this.setMa(qldsp.getMa());
        this.setTen(qldsp.getTen());

    }
}
