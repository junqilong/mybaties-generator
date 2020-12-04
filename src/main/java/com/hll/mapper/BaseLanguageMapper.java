package com.hll.mapper;

import com.hll.model.BaseLanguage;
import com.hll.model.BaseLanguageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseLanguageMapper {
    long countByExample(BaseLanguageExample example);

    int deleteByExample(BaseLanguageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseLanguage record);

    int insertSelective(BaseLanguage record);

    List<BaseLanguage> selectByExample(BaseLanguageExample example);

    BaseLanguage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseLanguage record, @Param("example") BaseLanguageExample example);

    int updateByExample(@Param("record") BaseLanguage record, @Param("example") BaseLanguageExample example);

    int updateByPrimaryKeySelective(BaseLanguage record);

    int updateByPrimaryKey(BaseLanguage record);
}