package com.hll.mapper;

import com.hll.model.TVersion;
import com.hll.model.TVersionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TVersionMapper {
    long countByExample(TVersionExample example);

    int deleteByExample(TVersionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TVersion record);

    int insertSelective(TVersion record);

    List<TVersion> selectByExample(TVersionExample example);

    TVersion selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TVersion record, @Param("example") TVersionExample example);

    int updateByExample(@Param("record") TVersion record, @Param("example") TVersionExample example);

    int updateByPrimaryKeySelective(TVersion record);

    int updateByPrimaryKey(TVersion record);
}