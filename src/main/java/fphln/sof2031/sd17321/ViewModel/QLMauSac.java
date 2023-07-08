package fphln.sof2031.sd17321.ViewModel;

import fphln.sof2031.sd17321.Entity.MauSac;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.UUID;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class QLMauSac {


    @NotBlank(message = "Không được để trống Mã")
    private String ma;

    @NotBlank(message = "Không được để trống Tên")
    private String ten;

    public void loatformEntity(MauSac ms) {
        this.setMa(ms.getMa());
        this.setTen(ms.getTen());

    }
}

