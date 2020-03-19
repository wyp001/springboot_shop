package com.example.springboot_shop.dao;

import com.example.springboot_shop.entity.SpAttribute;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SpAttributeMapper {


    int deleteByPrimaryKey(Short attrId);

    int insert(SpAttribute record);

    int insertSelective(SpAttribute record);

    SpAttribute selectByPrimaryKey(Short attrId);

    int updateByPrimaryKeySelective(SpAttribute record);

    int updateByPrimaryKeyWithBLOBs(SpAttribute record);

    int updateByPrimaryKey(SpAttribute record);

    List<SpAttribute> getAttributeList(@Param("cate_id") int catId , @Param("sel")String sel);

    SpAttribute getAttributeSelective(@Param("attr_id") short attrId, @Param("attr_sel") String attrSel);

}