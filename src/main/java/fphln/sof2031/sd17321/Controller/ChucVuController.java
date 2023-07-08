package fphln.sof2031.sd17321.Controller;


import fphln.sof2031.sd17321.Entity.ChucVu;
import fphln.sof2031.sd17321.Repsitory.ChucVuRepsitory;
import fphln.sof2031.sd17321.ViewModel.QLChucVu;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("ChucVu")
public class ChucVuController {

    @Autowired
    private ChucVuRepsitory chucVuRepsitory;

    @GetMapping("index")
    public String index(@RequestParam(defaultValue = "0", name = "page") Integer number, Model model) {
        Pageable pageable = PageRequest.of(number, 2);
        model.addAttribute("dsChucVu", chucVuRepsitory.findAll(pageable));
        model.addAttribute("view", "/views/ChucVu/index.jsp");
        return "layout";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") ChucVu cv) {
        chucVuRepsitory.delete(cv);
        return "redirect:/ChucVu/index";
    }

    @GetMapping("create")
    public String create(Model model, QLChucVu qlcv) {
        model.addAttribute("cv", qlcv);
        model.addAttribute("dsChucVu", "/ChucVu/store");
        model.addAttribute("view", "/views/ChucVu/create.jsp");
        return "layout";
    }

    @PostMapping("store")
    public String store(Model model, @Valid @ModelAttribute("cv") QLChucVu qlcv, BindingResult result) {
        if (result.hasErrors()) {
            model.addAttribute("view", "/views/ChucVu/create.jsp");
            return "layout";
        } else {
            ChucVu cv = new ChucVu();
            cv.loadformViewModel(qlcv);
            chucVuRepsitory.save(cv);
            return "redirect:/ChucVu/index";
        }
    }

    @GetMapping("edit/{id}")
    public String edit(@PathVariable("id") ChucVu cv, Model model) {
        QLChucVu qlChucVu = new QLChucVu();
        qlChucVu.loadformEntity(cv);
        model.addAttribute("cv", qlChucVu);
        model.addAttribute("dsChucVu", "/ChucVu/update/" + cv.getId());
        model.addAttribute("view", "/views/ChucVu/create.jsp");
        return "layout";
    }

    @PostMapping("update/{id}")
    public String update(Model model, @PathVariable("id") ChucVu cv, @Valid
    @ModelAttribute("cv") QLChucVu qlChucVu, BindingResult result) {
        if (result.hasErrors()) {
            model.addAttribute("view", "/views/ChucVu/create.jsp");
            return "layout";
        } else {
            cv.loadformViewModel(qlChucVu);
            chucVuRepsitory.save(cv);
            return "redirect:/ChucVu/index";
        }
    }
}
