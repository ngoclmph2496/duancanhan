package fphln.sof2031.sd17321.Controller;

import fphln.sof2031.sd17321.Repsitory.HoaDonRepsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("HDChiTiet")
public class HoaDonChiTietController {
    @Autowired
    private HoaDonRepsitory hoaDonRepsitory;

    @GetMapping("index")
    public String HoaDonCT(Model model){
        model.addAttribute("dsHDChiTiet", hoaDonRepsitory.findAll());
        return "HDChiTiet/index";
    }
}
