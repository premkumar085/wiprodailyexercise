package com.wipro.usermgmt.controller;

import com.wipro.usermgmt.dto.Mobile;
import com.wipro.usermgmt.service.MobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/mobile")
public class MobileController {

    @Autowired
    private MobileService service;

    @PostMapping
    public String createMobile(@RequestBody Mobile mobile) {
        service.save(mobile);
        return "Mobile created.";
    }

    @GetMapping("/{id}")
    public Mobile getMobile(@PathVariable int id) {
        return service.findById(id);
    }

    @GetMapping
    public Collection<Mobile> getAllMobiles() {
        return service.findAll();
    }

    @PutMapping
    public String updateMobile(@RequestBody Mobile mobile) {
        service.update(mobile);
        return "Mobile updated.";
    }

    @DeleteMapping("/{id}")
    public String deleteMobile(@PathVariable int id) {
        service.delete(id);
        return "Mobile deleted.";
    }
}
