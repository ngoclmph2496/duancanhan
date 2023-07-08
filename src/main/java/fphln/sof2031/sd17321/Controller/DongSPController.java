package fphln.sof2031.sd17321.Controller;

import fphln.sof2031.sd17321.Repsitory.DongSPRepsitory;
import fphln.sof2031.sd17321.Entity.DongSP;
import fphln.sof2031.sd17321.ViewModel.QLDongSP;
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
@RequestMapping("DongSP")
public class DongSPController {
    @Autowired
    private DongSPRepsitory dongSPRepsitory;

    @GetMapping("index")
    public String index(@RequestParam(defaultValue = "0", name = "page") Integer number, Model model) {
        Pageable pageable = PageRequest.of(number, 2);
        model.addAttribute("dsDongSP", dongSPRepsitory.findAll(pageable));
        model.addAttribute("view", "/views/DongSP/index.jsp");
        return "layout";

    }


    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") DongSP dsp) {
        dongSPRepsitory.delete(dsp);
        return "redirect:/DongSP/index";
    }


    @GetMapping("create")
    public String create(Model model) {
        QLDongSP dsp = new QLDongSP();
        model.addAttribute("dsp", dsp);
        model.addAttribute("dsDongSP", "/DongSP/store");
        model.addAttribute("view", "/views/DongSP/create.jsp");
        return "layout";
    }


    @PostMapping("store")
    public String store(Model model, @Valid @ModelAttribute("dsp") QLDongSP qldsp, BindingResult result) {
        if (result.hasErrors()) {
            model.addAttribute("view", "/views/DongSP/create.jsp");
            return "layout";
        } else {
            DongSP dsp = new DongSP();
            dsp.loatformViewModel(qldsp);
            dongSPRepsitory.save(dsp);
            return "redirect:/DongSP/index";
        }
    }

    @GetMapping("edit/{id}")
    public String edit(Model model, @PathVariable("id") DongSP dsp) {
        QLDongSP qlDongSP = new QLDongSP();
        qlDongSP.loatformEntity(dsp);
        model.addAttribute("dsp", dsp);
        model.addAttribute("dsDongSP", "/DongSP/update/" + dsp.getId());
        model.addAttribute("view", "/views/DongSP/create.jsp");
        return "layout";
    }

    @PostMapping("update/{id}")
    public String update(Model model, @PathVariable("id") DongSP dsp, @Valid @ModelAttribute("dsp") QLDongSP qlDongSP, BindingResult result) {
        if (result.hasErrors()) {
            model.addAttribute("view", "/views/DongSP/create.jsp");
            return "layout";
        }
        dsp.loatformViewModel(qlDongSP);
        dongSPRepsitory.save(dsp);
        return "redirect:/DongSP/index";
    }

}


