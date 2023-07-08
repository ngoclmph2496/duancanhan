package fphln.sof2031.sd17321.ViewModel;

import fphln.sof2031.sd17321.Entity.ChucVu;
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
public class QLChucVu {

    @NotBlank(message = "không được để trống mã")
    private String ma;

    @NotBlank(message = "không được để trống tên")
    private String ten;

    public void loadformEntity(ChucVu cv) {
        this.setMa(cv.getMa());
        this.setTen(cv.getTen());
    }

}
