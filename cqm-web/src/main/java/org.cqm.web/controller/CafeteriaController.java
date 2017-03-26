package org.cqm.web.controller;

import jdk.nashorn.internal.runtime.Context;
import org.apache.commons.codec.binary.Base64;
import org.cqm.data.entity.Cafeteria;
import org.cqm.data.services.CafeteriaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.io.*;
import java.util.List;

@Controller
public class CafeteriaController {

    @Resource(name = "cafeteriaService")
    private CafeteriaService cafeteriaService;

    @RequestMapping(value = "/cafeterias")
    public String listCafeterias(Model model) {
        List<Cafeteria> cafeterias = cafeteriaService.getCafeteriaRepository().findAllCafeteriasOrderByCafeIdAsc();
        int listSize = cafeterias.size();
        for (int i = 0; i < listSize; i++) {
            Cafeteria cafeteria = cafeterias.get(i);
          /*  try {
                File outputPhoto = new File(*//*"/src/main/webapp/resources/img/photo"*//*+ i + ".jpg");
                FileOutputStream fos = new FileOutputStream(outputPhoto);
                fos.write(cafeteria.getPhotoByte());
                cafeteria.setPhoto(outputPhoto);
                fos.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
*/          cafeteria.setEncodeBase64(Base64.encodeBase64(cafeteria.getPhotoByte()));
            try {
                cafeteria.setBase64DataString(new String(cafeteria.getEncodeBase64(), "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }

        }
        model.addAttribute("cafeterias", cafeterias);
        return "cafeteria";
    }
}
