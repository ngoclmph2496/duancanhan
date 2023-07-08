package fphln.sof2031.sd17321.Entity;


import fphln.sof2031.sd17321.ViewModel.QLCuaHang;
import fphln.sof2031.sd17321.ViewModel.QLMauSac;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Entity(name = "CuaHang")
@Table(name = "CuaHang")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CuaHang {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "Ma")
    private String ma;

    @Column(name = "Ten")
    private String ten;

    @Column(name = "DiaChi")

    private String diachi;

    @Column(name = "Thanhpho")
    @NotBlank
    private String thanhpho;

    @Column(name = "QuocGia")
    private String quocgia;


    public void loadFormViewModel(QLCuaHang qlms) {
        this.setMa(qlms.getMa());
        this.setTen(qlms.getTen());
        this.setDiachi(qlms.getDiachi());
        this.setThanhpho(qlms.getThanhpho());
        this.setQuocgia(qlms.getQuocgia());

    }
}
