package com.example.springboot_shop.service;

import com.example.springboot_shop.entity.SpAttribute;

import java.util.List;

public interface SpAttributeService {

    List<SpAttribute> getAttributeList(int catId ,String sel);

//    int addAttributes(short catId, String attrName,String attrSel,String attrVals);

    int addAttributes(SpAttribute attribute);

    int delAttribute(short attrId);

    SpAttribute getAttributeSelective(short attrId,String attrSel);

    SpAttribute updateAttribute(short attrId,String attrSel, String attrName,String attrVals);

}
