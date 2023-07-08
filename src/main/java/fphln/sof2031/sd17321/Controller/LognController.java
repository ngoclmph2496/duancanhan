package fphln.sof2031.sd17321.Controller;


import fphln.sof2031.sd17321.Entity.KhachHang;
import fphln.sof2031.sd17321.Entity.NhanVien;
import fphln.sof2031.sd17321.Repsitory.KhachHangRepsitory;
import fphln.sof2031.sd17321.Repsitory.NhanVienRepsitory;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;
import java.util.UUID;

@Controller
public class LognController {
    @Autowired
    private HttpSession session;
    @Autowired
    private NhanVienRepsitory nhanVienRepsitory;

    @Autowired
    private KhachHangRepsitory khachHangRepsitory;

    @GetMapping("viewloginNhanVien")
    public String loginnv(Model model) {
//        model.addAttribute("action", "loginnv");
        return "login";
    }

//    @GetMapping("mua-hang")
//    public String muaHang(Model model) {
////        model.addAttribute("action", "loginnv");
//        return "BanHang/layout";
//    }

    @PostMapping("login")
    public String login(
            @RequestParam("ma") String ma,
            @RequestParam("matKhau") String matKhau,
            Model model
    ) {
        KhachHang kh = this.khachHangRepsitory.findByMaAndMatkhau(ma, matKhau);
        NhanVien nv = this.nhanVienRepsitory.findByMaAndMatkhau(ma, matKhau);
        if (nv != null) {
            session.setAttribute("userId", nv.getId());
            session.setAttribute("nguoiDung", "nhanvien");
            model.addAttribute("nguoi", nv);
            return "redirect:/phan-quyen";
        } else if (kh != null) {
            session.setAttribute("userId", kh.getId());
            session.setAttribute("nguoiDung", "khachhang");
            model.addAttribute("nguoi", kh);
            return "redirect:/phan-quyen";
        } else {
            return "redirect:/viewloginNhanVien";
        }
    }


    @GetMapping("phan-quyen")
    public String dashboard(HttpSession session, Model model) {
        UUID userId = (UUID) session.getAttribute("userId");
        String userType = (String) session.getAttribute("nguoiDung");

        if (userId == null && userType == null) {
            return "redirect:/viewloginNhanVien";

        } else {
            if (userType.equals("nhanvien")) {
                Optional<NhanVien> nv = this.nhanVienRepsitory.findById(userId);
                model.addAttribute("idUser", userId);
                nv.ifPresent(nhanVien -> session.setAttribute("nhanVien", nhanVien));
                return "forward:/NhanVien/index";
            } else if (userType.equals("khachhang")) {
                Optional<KhachHang> kh = this.khachHangRepsitory.findById(userId);
                model.addAttribute("idUser", userId);
                kh.ifPresent(khachHang -> session.setAttribute("khachHang", khachHang));
                return "forward:/hien-thi";
            }
        }
//        session.setAttribute("error", "Sai tai khoản mật khẩu");
//        String thongBao = (String) session.getAttribute("error");
//        model.addAttribute("errorMessage", thongBao);
//        System.out.println(thongBao);
        return "BanHang/layout";
    }

}
