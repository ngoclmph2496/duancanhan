package fphln.sof2031.sd17321.Controller;

import fphln.sof2031.sd17321.Entity.NSX;
import fphln.sof2031.sd17321.Repsitory.NhaSXRepsitory;
import fphln.sof2031.sd17321.ViewModel.QLNhaSX;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("NSX")
public class NhaSXController {
    @Autowired
    private NhaSXRepsitory nhaSXRepsitory;

    @GetMapping("index")
    public String index(@RequestParam(defaultValue = "0", name = "page") Integer number, Model model) {
        Pageable pageable = PageRequest.of(number, 2);
        model.addAttribute("dsNSX", nhaSXRepsitory.findAll(pageable));
        model.addAttribute("view", "/views/NSX/index.jsp");
        return "layout";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") NSX nsx) {
        nhaSXRepsitory.delete(nsx);
        return "redirect:/NSX/index";
    }

    @GetMapping("create")
    public String create(Model model) {
        QLNhaSX qlNhaSX = new QLNhaSX();
        model.addAttribute("nsx", qlNhaSX);
        model.addAttribute("dsNSX", "/NSX/store");
        model.addAttribute("view", "/views/NSX/create.jsp");
        return "layout";
    }

    @PostMapping("store")
    public String store(Model model, @Valid @ModelAttribute("nsx") QLNhaSX qlNhaSX, BindingResult result) {
        if (result.hasErrors()) {
            model.addAttribute("view", "/views/NSX/create.jsp");
            return "layout";
        } else {
            NSX nsx = new NSX();
            nsx.loatFormViewMoel(qlNhaSX);
            nhaSXRepsitory.save(nsx);
            return "redirect:/NSX/index";
        }
    }

    @GetMapping("edit/{id}")
    public String edit(Model model, @PathVariable("id") NSX nsx) {
        QLNhaSX qlNhaSX = new QLNhaSX();
        qlNhaSX.loatFormEntity(nsx);
        model.addAttribute("nsx", qlNhaSX);
        model.addAttribute("dsNSX", "/NSX/update/" + nsx.getId());
        model.addAttribute("view", "/views/NSX/create.jsp");
        return "layout";
    }

    @PostMapping("update/{id}")
    public String store(Model model, @PathVariable("id") NSX nsx, @Valid @ModelAttribute("nsx") QLNhaSX qlNhaSX, BindingResult result) {
        if (result.hasErrors()) {
            model.addAttribute("view", "/views/NSX/create.jsp");
            return "layout";
        } else {
            nsx.loatFormViewMoel(qlNhaSX);
            nhaSXRepsitory.save(nsx);
            return "redirect:/NSX/index";
        }
    }

}
