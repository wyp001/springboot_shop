package com.example.springboot_shop.service.impl;

import com.example.springboot_shop.dao.SpAttributeMapper;
import com.example.springboot_shop.entity.SpAttribute;
import com.example.springboot_shop.service.SpAttributeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SpAttributeServiceImpl implements SpAttributeService {

    @Resource
    SpAttributeMapper attributeMapper;


    @Override
    public List<SpAttribute> getAttributeList(int catId,String sel) {
        return attributeMapper.getAttributeList(catId,sel);
    }

    @Override
    public int addAttributes(SpAttribute attribute) {
        return attributeMapper.insertSelective(attribute);
    }

    @Override
    public int delAttribute(short attrId) {
        return attributeMapper.deleteByPrimaryKey(attrId);
    }

    @Override
    public SpAttribute getAttributeSelective(short attrId, String attrSel) {
        return attributeMapper.getAttributeSelective(attrId,attrSel);
    }

    @Override
    public SpAttribute updateAttribute(short attrId,String attrSel, String attrName,String attrVals) {
        SpAttribute attribute = attributeMapper.getAttributeSelective(attrId, attrSel);
        attribute.setAttrName(attrName);
        if (attrVals != null){
            attribute.setAttrVals(attrVals);
        }
        attributeMapper.updateByPrimaryKeySelective(attribute);
        return attribute;
    }

//    @Override
//    public int addAttributes(short catId, String attrName, String attrSel, String attrVals) {
//        SpAttribute attribute = new SpAttribute();
//        attribute.setCatId(catId);
//        attribute.setAttrName(attrName);
//        attribute.setAttrSel(attrSel);
//        attribute.setAttrVals(attrVals);
//        return attributeMapper.insertSelective(attribute);
//    }
}
