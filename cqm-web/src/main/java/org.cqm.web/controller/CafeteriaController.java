package org.cqm.web.controller;

import org.cqm.data.entity.Cafeteria;
import org.cqm.data.services.CafeteriaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Dmitriy on 02.12.2016.
 */
@Controller
public class CafeteriaController {

    @Resource(name = "cafeteriaService")
    private CafeteriaService cafeteriaService;

    @RequestMapping(value = "/cafeterias")
    public String listCafeterias(Model model) {
        List<Cafeteria> cafeterias = cafeteriaService.getCafeteriaRepository().findAllByOrderByCafeIdAsc();
        model.addAttribute("cafeterias", cafeterias);
        return "cafeteria";
    }
}
