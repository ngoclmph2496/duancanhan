package fphln.sof2031.sd17321.Controller;

import fphln.sof2031.sd17321.Entity.*;
import fphln.sof2031.sd17321.Repsitory.*;
import fphln.sof2031.sd17321.ViewModel.QLChiTietSP;
import fphln.sof2031.sd17321.ViewModel.QLNhanVien;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


import java.util.UUID;

@Controller
@RequestMapping("ChiTietSP")
public class ChiTietSPController {
    @Autowired
    private ChiTietSPRepsitory chiTietSPRepsitory;

    @Autowired
    private SanPhamRepsitory sanPhamRepsitory;

    @Autowired
    private MauSacRepsitory mauSacRepsitory;

    @Autowired
    private DongSPRepsitory dongSPRepsitory;

    @Autowired
    private NhaSXRepsitory nhaSXRepsitory;

    @GetMapping("index")
    public String index(@RequestParam(defaultValue = "0", name = "page") Integer number, Model model) {
        Pageable pageable = PageRequest.of(number, 3);
        model.addAttribute("dsChiTietSP", chiTietSPRepsitory.findAll(pageable));
        model.addAttribute("view", "/views/ChiTietSP/index.jsp");
        return "layout";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") ChiTietSP chiTietSP) {
        chiTietSPRepsitory.delete(chiTietSP);
        return "redirect:/ChiTietSP/index";
    }

    @GetMapping("create")
    public String create(Model model, QLChiTietSP qlChiTietSP) {
        model.addAttribute("ctsp", qlChiTietSP);
        model.addAttribute("dsSanPham", sanPhamRepsitory.findAll());
        model.addAttribute("dsNSX", nhaSXRepsitory.findAll());
        model.addAttribute("dsMauSac", mauSacRepsitory.findAll());
        model.addAttribute("dsDSP", dongSPRepsitory.findAll());
        model.addAttribute("dsChitietSP", "/ChiTietSP/store");
        model.addAttribute("view", "/views/ChiTietSP/create.jsp");
        return "layout";
    }

    @PostMapping("store")
    public String store(Model model, @Valid @ModelAttribute("ctsp") QLChiTietSP qlChiTietSP,
                        BindingResult result) {
        if (result.hasErrors()) {
            model.addAttribute("ctsp", qlChiTietSP);
            model.addAttribute("dsSanPham", sanPhamRepsitory.findAll());
            model.addAttribute("dsNSX", nhaSXRepsitory.findAll());
            model.addAttribute("dsMauSac", mauSacRepsitory.findAll());
            model.addAttribute("dsDSP", dongSPRepsitory.findAll());
            model.addAttribute("dsChitietSP", "/ChiTietSP/store");
            model.addAttribute("view", "/views/ChiTietSP/create.jsp");
            return "layout";
        } else {
            ChiTietSP ctsp = new ChiTietSP();
            ctsp.loadFormViewModel(qlChiTietSP);
            SanPham sp = this.sanPhamRepsitory.findById(qlChiTietSP.getSanPham()).get();
            DongSP dsp = this.dongSPRepsitory.findById(qlChiTietSP.getDongSP()).get();
            MauSac ms = this.mauSacRepsitory.findById(qlChiTietSP.getMauSac()).get();
            NSX nsx = this.nhaSXRepsitory.findById(qlChiTietSP.getNsx()).get();
            ctsp.setDongSP(dsp);
            ctsp.setNsx(nsx);
            ctsp.setMauSac(ms);
            ctsp.setSanPham(sp);
            chiTietSPRepsitory.save(ctsp);
            return "redirect:/ChiTietSP/index";

        }
    }

    @GetMapping("edit/{id}")
    public String edit(Model model, @PathVariable("id") ChiTietSP ctsp) {
        QLChiTietSP qlctsp = new QLChiTietSP();
        qlctsp.loadFormEntity(ctsp);
        model.addAttribute("ctsp", ctsp);
        model.addAttribute("dsSanPham", sanPhamRepsitory.findAll());
        model.addAttribute("dsNSX", nhaSXRepsitory.findAll());
        model.addAttribute("dsMauSac", mauSacRepsitory.findAll());
        model.addAttribute("dsDSP", dongSPRepsitory.findAll());
        model.addAttribute("dsChitietSP", "/ChiTietSP/update/" + ctsp.getId());
        model.addAttribute("view", "/views/ChiTietSP/create.jsp");
        return "layout";
    }

    @PostMapping("update/{id}")
    public String update(Model model, @PathVariable("id") ChiTietSP ctsp, @Valid @ModelAttribute("ctsp") QLChiTietSP qlChiTietSP,
                         BindingResult result) {
        if (result.hasErrors()) {
            model.addAttribute("ctsp", qlChiTietSP);
            model.addAttribute("dsSanPham", sanPhamRepsitory.findAll());
            model.addAttribute("dsNSX", nhaSXRepsitory.findAll());
            model.addAttribute("dsMauSac", mauSacRepsitory.findAll());
            model.addAttribute("dsDSP", dongSPRepsitory.findAll());
            model.addAttribute("view", "/views/ChiTietSP/create.jsp");
            return "layout";
        } else {
            ctsp.loadFormViewModel(qlChiTietSP);
            SanPham sp = this.sanPhamRepsitory.findById(qlChiTietSP.getSanPham()).get();
            DongSP dsp = this.dongSPRepsitory.findById(qlChiTietSP.getDongSP()).get();
            MauSac ms = this.mauSacRepsitory.findById(qlChiTietSP.getMauSac()).get();
            NSX nsx = this.nhaSXRepsitory.findById(qlChiTietSP.getNsx()).get();
            ctsp.setDongSP(dsp);
            ctsp.setNsx(nsx);
            ctsp.setMauSac(ms);
            ctsp.setSanPham(sp);
            chiTietSPRepsitory.save(ctsp);
            return "redirect:/ChiTietSP/index";
        }
    }


}
