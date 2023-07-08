package fphln.sof2031.sd17321.Controller;

import fphln.sof2031.sd17321.Entity.MauSac;
import fphln.sof2031.sd17321.Repsitory.CuaHangRepsitory;
import fphln.sof2031.sd17321.ViewModel.QLCuaHang;
import fphln.sof2031.sd17321.ViewModel.QLMauSac;
import jakarta.validation.Valid;
import fphln.sof2031.sd17321.Entity.CuaHang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
@RequestMapping("CuaHang")
public class CuaHangController {

    @Autowired
    private CuaHangRepsitory cuaHangRepsitory;

    @GetMapping("create")
    public String create(Model model) {
        QLCuaHang qlch = new QLCuaHang();
        model.addAttribute("ch", qlch);
        model.addAttribute("dsCuaHang", "/CuaHang/store");
        model.addAttribute("view", "/views/CuaHang/create.jsp");
        return "layout";
    }

    @PostMapping("store")
    public String store(Model model, @Valid @ModelAttribute("ch") QLCuaHang qlch,
                        BindingResult result) {
        if (result.hasErrors()) {
            model.addAttribute("view", "/views/CuaHang/create.jsp");
            return "layout";
        } else {
            CuaHang ch = new CuaHang();
            ch.loadFormViewModel(qlch);
            cuaHangRepsitory.save(ch);
            return "redirect:/CuaHang/index";
        }
    }


    @GetMapping("index")
    public String index(@RequestParam(defaultValue = "0", name = "page") Integer number, Model model) {
        Pageable pageable = PageRequest.of(number, 2);
        model.addAttribute("dsCuaHang", cuaHangRepsitory.findAll(pageable));
        model.addAttribute("view", "/views/CuaHang/index.jsp");
        return "layout";
    }

    @GetMapping("edit/{id}")
    public String edit(@PathVariable("id") CuaHang ch, Model model) {
        QLCuaHang qlch = new QLCuaHang();
        qlch.loadFormEntity(ch);
        model.addAttribute("ch", qlch);
        model.addAttribute("dsCuaHang", "/CuaHang/update/" + ch.getId());
        model.addAttribute("view", "/views/CuaHang/create.jsp");
        return "layout";
    }

    @PostMapping("update/{id}")
    public String update(Model model, @PathVariable("id") CuaHang ch, @Valid @ModelAttribute("ch") QLCuaHang qlch, BindingResult result) {
        if (result.hasErrors()) {
            model.addAttribute("view", "/views/CuaHang/create.jsp");
            return "layout";
        }
        ch.loadFormViewModel(qlch);
        cuaHangRepsitory.save(ch);
        return "redirect:/CuaHang/index";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") CuaHang ch) {
        cuaHangRepsitory.delete(ch);
        return "redirect:/CuaHang/index";
    }
}
