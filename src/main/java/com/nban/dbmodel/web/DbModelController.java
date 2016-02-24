package com.nban.dbmodel.web;

import com.nban.dbmodel.domain.TableSumarry;
import com.nban.dbmodel.service.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by liyi on 2016/2/24.
 */
@Controller
@RequestMapping
public class DbModelController {

    @Autowired
    private TableRepository tableRepository;

    @RequestMapping("tables/")
    public String tableInit(Model model){
        List<TableSumarry> tables = tableRepository.findAll();
        model.addAttribute("tables",tables);
        return "index";
    }
}
