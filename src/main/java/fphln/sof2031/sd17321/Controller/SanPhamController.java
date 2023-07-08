package fphln.sof2031.sd17321.Controller;

import fphln.sof2031.sd17321.Repsitory.SanPhamRepsitory;
import fphln.sof2031.sd17321.Entity.SanPham;
import fphln.sof2031.sd17321.ViewModel.QLSanPham;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("SanPham")
public class SanPhamController {
    @Autowired
    private SanPhamRepsitory sanPhamRepsitory;

    @GetMapping("index")
    public String index(@RequestParam(defaultValue = "0", name = "page") Integer number, Model model) {
        Pageable pageable = PageRequest.of(number, 2);
        model.addAttribute("dsSanPham", sanPhamRepsitory.findAll(pageable));
        model.addAttribute("view", "/views/SanPham/index.jsp");
        return "layout";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") SanPham sp) {
        this.sanPhamRepsitory.delete(sp);
        return "redirect:/SanPham/index";
    }

    @GetMapping("create")
    public String create(Model model) {
        QLSanPham sp = new QLSanPham();
        model.addAttribute("sp", sp);
        model.addAttribute("dsSanPham", "/SanPham/store");
        model.addAttribute("view", "/views/SanPham/create.jsp");
        return "layout";
    }

    @PostMapping("store")
    public String store(Model model, @Valid @ModelAttribute("sp") QLSanPham qlsp, BindingResult result) {
        if (result.hasErrors()) {
            model.addAttribute("view", "/views/SanPham/create.jsp");
            return "layout";
        } else {
            SanPham sp = new SanPham();
            sp.loadFormVM(qlsp);
            sanPhamRepsitory.save(sp);
            return "redirect:/SanPham/index";
        }
    }

    @GetMapping("edit/{id}")
    public String edit(Model model, @PathVariable("id") SanPham sp) {
        QLSanPham qlSanPham = new QLSanPham();
        qlSanPham.loatformEntity(sp);
        model.addAttribute("sp", qlSanPham);
        model.addAttribute("dsSanPham", "/SanPham/update/" + sp.getId());
        model.addAttribute("view", "/views/SanPham/create.jsp");
        return "layout";
    }

    @PostMapping("update/{id}")
    public String update(Model model, @PathVariable("id") SanPham sp, @Valid @ModelAttribute("sp") QLSanPham qlsp, BindingResult result) {
        if (result.hasErrors()) {
            model.addAttribute("view", "/views/SanPham/create.jsp");
            return "layout";
        }
        sp.loadFormVM(qlsp);
        sanPhamRepsitory.save(sp);
        return "redirect:/SanPham/index";
    }

}


