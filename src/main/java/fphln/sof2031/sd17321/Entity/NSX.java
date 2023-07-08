package fphln.sof2031.sd17321.Entity;

import fphln.sof2031.sd17321.ViewModel.QLNhaSX;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity(name = "NSX")
@Table(name = "NSX")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NSX {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "Ma")
    private String ma;

    @Column(name = "ten")
    private String ten;

    public void loatFormViewMoel(QLNhaSX qlnsx) {
        this.setMa(qlnsx.getMa());
        this.setTen(qlnsx.getTen());
    }
}
