package com.groupeisi.DemendeEmploieI.Controller;

import com.groupeisi.DemendeEmploieI.model.UserDtls;
import com.groupeisi.DemendeEmploieI.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin/")
public class AdminController {
    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/")
    public String home(Model m) {
        return "admin/home";
    }


}
