package com.example.springboot_shop.controller;

import com.example.springboot_shop.entity.SpAttribute;
import com.example.springboot_shop.service.SpAttributeService;
import com.example.springboot_shop.utils.Response;
import com.example.springboot_shop.utils.ResultFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.Attr;

import java.util.List;

@RestController
public class SpAttributeController {

    @Autowired
    SpAttributeService attributeService;

    @GetMapping("categories/{id}/attributes")
    public Response getAttributeList(@PathVariable("id") int catId,String sel){
        List<SpAttribute> attributeList = attributeService.getAttributeList(catId, sel);
        return ResultFactory.buildSuccessResult(attributeList,"获取成功");
    }

    @PostMapping("categories/{id}/attributes")
    public Response addAttribute(@PathVariable("id") short catId,
                                 @RequestParam("attr_name") String attrName,
                                 @RequestParam("attr_sel")String attrSel,
                                 @RequestParam(required = false,name = "attr_vals")  String attrVals){
        SpAttribute attribute = new SpAttribute();
        attribute.setCatId(catId);
        attribute.setAttrName(attrName);
        attribute.setAttrSel(attrSel);
        attribute.setAttrVals(attrVals);
        attributeService.addAttributes(attribute);
        return ResultFactory.buildAddSuccessResult(attribute,"创建成功");
    }

    @DeleteMapping("categories/{id}/attributes/{attrid}")
    public Response delAttribute(@PathVariable("id") short catId, @PathVariable("attrid") short attrId){
        attributeService.delAttribute(attrId);
        return ResultFactory.buildSuccessResult(null,"删除成功");
    }

    @GetMapping("categories/{id}/attributes/{attrId}")
    public Response getAttribute(@PathVariable("id") short catId,
                                 @PathVariable("attrId") short attrId,
                                 @RequestParam("attr_sel") String attrSel,
                                 @RequestParam(name = "attr_vals",required = false) String attrVals){
        SpAttribute attribute = attributeService.getAttributeSelective(attrId, attrSel);
        return ResultFactory.buildSuccessResult(attribute,"获取成功");
    }

    @PutMapping("categories/{id}/attributes/{attrId}")
    public Response updateAttribute(@PathVariable("id" ) short catId,
                                    @PathVariable("attrId") short attrId,
                                    @RequestParam("attr_name") String attrName,
                                    @RequestParam("attr_sel") String attrSel,
                                    @RequestParam(required = false,name = "attr_vals") String attrVals){
        SpAttribute attribute = attributeService.updateAttribute(attrId, attrSel, attrName,attrVals);
        return ResultFactory.buildSuccessResult(attribute,"更新成功");
    }





}
