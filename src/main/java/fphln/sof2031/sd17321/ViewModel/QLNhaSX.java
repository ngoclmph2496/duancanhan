package fphln.sof2031.sd17321.ViewModel;

import fphln.sof2031.sd17321.Entity.NSX;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class QLNhaSX {
    @NotBlank(message = "Không được mã trống")
    private String ma;
    @NotBlank(message = "Không được tên trống")
    private String ten;

    public void loatFormEntity(NSX nsx) {
        this.setMa(nsx.getMa());
        this.setTen(nsx.getTen());
    }
}
