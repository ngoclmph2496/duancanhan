package fphln.sof2031.sd17321.Controller;

import fphln.sof2031.sd17321.Repsitory.ChucVuRepsitory;
import fphln.sof2031.sd17321.Repsitory.CuaHangRepsitory;
import fphln.sof2031.sd17321.Repsitory.NhanVienRepsitory;
import fphln.sof2031.sd17321.Entity.ChucVu;
import fphln.sof2031.sd17321.Entity.CuaHang;
import fphln.sof2031.sd17321.ViewModel.QLNhanVien;
import jakarta.validation.Valid;
import fphln.sof2031.sd17321.Entity.NhanVien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Controller
@RequestMapping("NhanVien")
public class NhanVienController {


    @Autowired
    private NhanVienRepsitory nhanVienRepsitory;

    @Autowired
    private ChucVuRepsitory chucVuRepsitory;

    @Autowired
    private CuaHangRepsitory cuaHangRepsitory;

    @GetMapping("index")
    public String index(@RequestParam(defaultValue = "0", name = "page") Integer number, Model model) {
        Pageable pageable = PageRequest.of(number, 2);
        model.addAttribute("danhsachNhanVien", nhanVienRepsitory.findAll(pageable));
        model.addAttribute("view", "/views/NhanVien/index.jsp");
        return "layout";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") NhanVien nv) {
        nhanVienRepsitory.delete(nv);
        return "redirect:/NhanVien/index";
    }

    @GetMapping("create")
    public String create(Model model, QLNhanVien qlnv) {
        model.addAttribute("nv", qlnv);
        model.addAttribute("dsCuaHang", cuaHangRepsitory.findAll());
        model.addAttribute("dsChucVu", chucVuRepsitory.findAll());
        model.addAttribute("dsNhanVien", "/NhanVien/store");
        model.addAttribute("view", "/views/NhanVien/create.jsp");
        return "layout";
    }

    @PostMapping("store")
    public String store(Model model, @Valid @ModelAttribute("nv") QLNhanVien qlnv,
                        BindingResult result) {

        if (result.hasErrors()) {
            model.addAttribute("nv", qlnv);
            model.addAttribute("dsCuaHang", cuaHangRepsitory.findAll());
            model.addAttribute("dsChucVu", chucVuRepsitory.findAll());
            model.addAttribute("dsNhanVien", "/NhanVien/store");
            model.addAttribute("view", "/views/NhanVien/create.jsp");
            return "layout";

        } else {
            NhanVien nv = new NhanVien();
            nv.loadFormViewModel(qlnv);
            CuaHang ch = this.cuaHangRepsitory.findById(qlnv.getCuaHang()).get();
            ChucVu cv = this.chucVuRepsitory.findById(qlnv.getChucVu()).get();
            nv.setCuaHang(ch);
            nv.setChucVu(cv);
            nhanVienRepsitory.save(nv);
            return "redirect:/NhanVien/index";

        }
    }

    @GetMapping("edit/{id}")
    public String edit(@PathVariable("id") NhanVien nv, Model model) {
        QLNhanVien qlnv = new QLNhanVien();
        qlnv.loadFormEntity(nv);
        model.addAttribute("nv", qlnv);
        model.addAttribute("dsCuaHang", cuaHangRepsitory.findAll());
        model.addAttribute("dsChucVu", chucVuRepsitory.findAll());
        model.addAttribute("dsNhanVien", "/NhanVien/update/" + nv.getId());
        model.addAttribute("view", "/views/NhanVien/create.jsp");
        return "layout";
    }

    @PostMapping("update/{id}")
    public String update(@PathVariable("id") NhanVien nv, Model model,
                         @Valid @ModelAttribute("nv") QLNhanVien qlnv, BindingResult result) {
        if (result.hasErrors()) {
            model.addAttribute("nv", qlnv);
            model.addAttribute("dsCuaHang", cuaHangRepsitory.findAll());
            model.addAttribute("dsChucVu", chucVuRepsitory.findAll());
            model.addAttribute("dsNhanVien", "/NhanVien/update/" + nv.getId());
            model.addAttribute("view", "/views/NhanVien/create.jsp");
            return "layout";
        }
        nv.loadFormViewModel(qlnv);
        CuaHang ch = this.cuaHangRepsitory.findById(qlnv.getCuaHang()).get();
        ChucVu cv = this.chucVuRepsitory.findById(qlnv.getChucVu()).get();
        nv.setCuaHang(ch);
        nv.setChucVu(cv);
        nhanVienRepsitory.save(nv);
        return "redirect:/NhanVien/index";
    }
}

