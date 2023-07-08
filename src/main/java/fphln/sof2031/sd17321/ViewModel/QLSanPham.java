package fphln.sof2031.sd17321.ViewModel;

import fphln.sof2031.sd17321.Entity.SanPham;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class QLSanPham {


    @NotBlank(message = "Không được để trống Mã")
    private String ma;

    @NotBlank(message = "Không được để trống Tên")
    private String ten;

    public void loatformEntity(SanPham sp) {
        this.setMa(sp.getMa());
        this.setTen(sp.getTen());

    }
}

