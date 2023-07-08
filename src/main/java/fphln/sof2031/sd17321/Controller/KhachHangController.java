package fphln.sof2031.sd17321.Controller;

import fphln.sof2031.sd17321.Entity.KhachHang;
import fphln.sof2031.sd17321.Repsitory.KhachHangRepsitory;
import fphln.sof2031.sd17321.ViewModel.QLKhachHang;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("KhachHang")
public class KhachHangController {
    @Autowired
    private KhachHangRepsitory khachHangRepsitory;

    @GetMapping("index")
    public String index(@RequestParam(defaultValue = "0", name = "page") Integer number, Model model) {
        Pageable pageable = PageRequest.of(number, 2);
        model.addAttribute("dsKhachHang", khachHangRepsitory.findAll(pageable));
        model.addAttribute("view", "/views/KhachHang/index.jsp");
        return "layout";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") KhachHang kh) {
        khachHangRepsitory.delete(kh);
        return "redirect:/KhachHang/index";
    }

    @GetMapping("create")
    public String create(Model model) {
        QLKhachHang kh = new QLKhachHang();
        model.addAttribute("kh", kh);
        model.addAttribute("dsKhachHang", "/KhachHang/store");
        model.addAttribute("view", "/views/KhachHang/create.jsp");
        return "layout";
    }

    @PostMapping("store")
    public String store(Model model, @Valid @ModelAttribute("kh") QLKhachHang qlkh, BindingResult result) {
        if (result.hasErrors()) {
            model.addAttribute("view", "/views/KhachHang/create.jsp");
            return "layout";
        } else {
            KhachHang kh = new KhachHang();
            kh.loadFormViewModel(qlkh);
            khachHangRepsitory.save(kh);
            return "redirect:/KhachHang/index";
        }
    }

    @GetMapping("edit/{id}")
    public String edit(@PathVariable("id") KhachHang kh, Model model) {
        QLKhachHang qlKhachHang = new QLKhachHang();
        qlKhachHang.loadFormEntity(kh);
        model.addAttribute("kh", qlKhachHang);
        model.addAttribute("dsKhachHang", "/KhachHang/update/" + kh.getId());
        model.addAttribute("view", "/views/KhachHang/create.jsp");
        return "layout";
    }

    @PostMapping("update/{id}")
    public String update(Model model, @PathVariable("id") KhachHang kh, @Valid @ModelAttribute("kh") QLKhachHang qlkh, BindingResult result) {
        if (result.hasErrors()) {
            model.addAttribute("view", "/views/KhachHang/create.jsp");
            return "layout";
        } else {
            kh.loadFormViewModel(qlkh);
            khachHangRepsitory.save(kh);
            return "redirect:/KhachHang/index";
        }
    }


}
