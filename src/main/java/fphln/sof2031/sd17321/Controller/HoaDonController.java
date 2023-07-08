package fphln.sof2031.sd17321.Controller;

import fphln.sof2031.sd17321.Repsitory.HoaDonRepsitory;
import fphln.sof2031.sd17321.Repsitory.KhachHangRepsitory;
import fphln.sof2031.sd17321.Repsitory.NhanVienRepsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("HoaDon")
public class HoaDonController {
    @Autowired
    private HoaDonRepsitory hoaDonRepsitory;

    @Autowired
    private NhanVienRepsitory nhanVienRepsitory;

    @Autowired
    private KhachHangRepsitory khachHangRepsitory;

    @GetMapping("index")
    public String index(Model model) {
        model.addAttribute("dsHoaDon", hoaDonRepsitory.findAll());
        return "HoaDon/index";
    }
}
