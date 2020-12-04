package com.hll.mapper;

import com.hll.model.BaseCountry;
import com.hll.model.BaseCountryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseCountryMapper {
    long countByExample(BaseCountryExample example);

    int deleteByExample(BaseCountryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseCountry record);

    int insertSelective(BaseCountry record);

    List<BaseCountry> selectByExample(BaseCountryExample example);

    BaseCountry selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseCountry record, @Param("example") BaseCountryExample example);

    int updateByExample(@Param("record") BaseCountry record, @Param("example") BaseCountryExample example);

    int updateByPrimaryKeySelective(BaseCountry record);

    int updateByPrimaryKey(BaseCountry record);
}