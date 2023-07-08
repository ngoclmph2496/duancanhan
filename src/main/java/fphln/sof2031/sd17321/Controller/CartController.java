package fphln.sof2031.sd17321.Controller;

import fphln.sof2031.sd17321.Entity.Cart;
import fphln.sof2031.sd17321.Entity.ChiTietSP;
import fphln.sof2031.sd17321.Entity.Item;
import fphln.sof2031.sd17321.Repsitory.ChiTietSPRepsitory;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

@Controller

public class CartController {
    @Autowired
    private HttpSession httpSession;
    @Autowired
    ChiTietSPRepsitory chiTietSPRepsitory;

    @GetMapping("hien-thi")
    public String hienthi(Model model) {
        model.addAttribute("chiTietSanPhams", chiTietSPRepsitory.findAll());
        model.addAttribute("view", "/views/BanHang/ChiTietSP.jsp");
        return "BanHang/layout";
    }


    @GetMapping("/cart/add")
    public String addToCart(@RequestParam("ctspId") UUID ctspId) {
        // lấy ctsp từ repo
        Optional<ChiTietSP> chiTietSanPham = chiTietSPRepsitory.findById(ctspId);
        // tạo ra giỏ hàng chi tiết
        Item item = new Item(chiTietSanPham.get().getId(),
                chiTietSanPham.get().getSanPham().getTen(),
                chiTietSanPham.get().getMauSac().getTen(),
                1,
                chiTietSanPham.get().getGiaban());
        //lấy gior hàng từ session
        Cart cartSesion = (Cart) httpSession.getAttribute("cart");
        // nếu chưa có giỏ hàng
        if (cartSesion == null) {
            Cart cart = new Cart();
            ArrayList<Item> list = new ArrayList<>();
            list.add(item);
            cart.setItems(list);
            httpSession.setAttribute("cart", cart);
        } else {
            // nếu có giỏ hàng
            Cart cart = (Cart) httpSession.getAttribute("cart");
            ArrayList<Item> listItem = cart.getItems();
            // kieemr tra sản phẩm đã có trong giỏ hàng chưa
            // nếu có thì tăng số lwonjg lên 1
            for (Item itemTmp : listItem) {
                if (itemTmp.getIdChitietsp().equals(ctspId)) {
                    itemTmp.setSoLuong(itemTmp.getSoLuong() + 1);
                    return "redirect:/cart/view";
                }
            }
            // không có thì thêm sản phẩm vào
            listItem.add(item);
        }
        return "redirect:/cart/view";
    }

    @GetMapping("/cart/view")
    public String addToCart(Model model) {
        Cart cart = (Cart) httpSession.getAttribute("cart");
        System.out.println(cart.toString());
        ArrayList<Item> list = cart.getItems();
        model.addAttribute("gioHangChiTiet", list);
        model.addAttribute("view", "/views/BanHang/giohang.jsp");
        return "BanHang/layout";
    }
}
