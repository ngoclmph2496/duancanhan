package fphln.sof2031.sd17321.Demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class loginController {
    @GetMapping("login")
    public String getLoginForm() {
        return "login";
    }


//    @PostMapping("login")
//    public String login(@RequestParam("username") String username,
//                        @RequestParam("password") Optional<String> pass,
//                        @RequestParam(name = "remember",defaultValue = "false") boolean remember,
//                        Model fphln.sof2031.sd17321.model) {
//        if (username.equals("nam123") && password.equals("123")) {
//            return "hello";
//        } else {
//            fphln.sof2031.sd17321.model.addAttribute("error", "Tên đăng nhập hoặc mật khẩu không đúng!");
//            return "login";
//        }
//
//
////        System.out.println(username);
////        if (pass.isPresent()){
////            System.out.println(pass.get());
////        }else {
////            System.out.println("password empty");
////        }
//
//

}
