package fphln.sof2031.sd17321.Controller;

import fphln.sof2031.sd17321.Entity.CuaHang;
import fphln.sof2031.sd17321.Repsitory.MauSacRepsitory;
import fphln.sof2031.sd17321.Entity.MauSac;
import fphln.sof2031.sd17321.ViewModel.QLMauSac;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("MauSac")
public class MauSacController {
    @Autowired
    private MauSacRepsitory mauSacRepsitory;


    @GetMapping("index")
    public String index(@RequestParam(defaultValue = "0", name = "page") Integer number, Model model) {
        Pageable pageable = PageRequest.of(number, 2);
        model.addAttribute("dsMauSac", mauSacRepsitory.findAll(pageable));
        model.addAttribute("view", "/views/MauSac/index.jsp");
        return "layout";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") MauSac ms) {
        mauSacRepsitory.delete(ms);
        return "redirect:/MauSac/index";
    }

    //
    @GetMapping("create")
    public String create(Model model) {
        QLMauSac qlms = new QLMauSac();
        model.addAttribute("ms", qlms);
        model.addAttribute("dsMauSac", "/MauSac/store");
        model.addAttribute("view", "/views/MauSac/create.jsp");
        return "layout";
    }

    @PostMapping("store")
    public String store(Model model, @Valid @ModelAttribute("ms") QLMauSac qlms, BindingResult result) {
        if (result.hasErrors()) {
            model.addAttribute("view", "/views/MauSac/create.jsp");
            return "layout";
        } else {
            MauSac ms = new MauSac();
            ms.loatFormViewModel(qlms);
            mauSacRepsitory.save(ms);
            return "redirect:/MauSac/index";
        }
    }

    @GetMapping("edit/{id}")
    public String edit(@ModelAttribute("id") MauSac ms, Model model) {
        QLMauSac qlms = new QLMauSac();
        qlms.loatformEntity(ms);
        model.addAttribute("ms", qlms);
        model.addAttribute("dsMauSac", "/MauSac/update/" + ms.getId());
        model.addAttribute("view", "/views/MauSac/create.jsp");
        return "layout";
    }

    @PostMapping("update/{id}")
    public String update(Model model, @PathVariable("id") MauSac ms, @Valid @ModelAttribute("ms") QLMauSac qlMauSac, BindingResult result) {
        if (result.hasErrors()) {
            model.addAttribute("view", "/views/MauSac/create.jsp");
            return "layout";
        }
        ms.loatFormViewModel(qlMauSac);
        mauSacRepsitory.save(ms);
        return "redirect:/MauSac/index";
    }

}
