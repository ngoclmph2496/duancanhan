package fphln.sof2031.sd17321.ViewModel;

import fphln.sof2031.sd17321.Entity.DongSP;
import fphln.sof2031.sd17321.Entity.MauSac;
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
public class QLDongSP {


    @NotBlank(message = "Không được để trống Mã")
    private String ma;

    @NotBlank(message = "Không được để trống Tên")
    private String ten;

    public void loatformEntity(DongSP dsp) {
        this.setMa(dsp.getMa());
        this.setTen(dsp.getTen());

    }
}

