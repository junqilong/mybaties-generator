package com.hll.mapper;

import com.hll.model.TLearningcenter;
import com.hll.model.TLearningcenterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TLearningcenterMapper {
    long countByExample(TLearningcenterExample example);

    int deleteByExample(TLearningcenterExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TLearningcenter record);

    int insertSelective(TLearningcenter record);

    List<TLearningcenter> selectByExample(TLearningcenterExample example);

    TLearningcenter selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TLearningcenter record, @Param("example") TLearningcenterExample example);

    int updateByExample(@Param("record") TLearningcenter record, @Param("example") TLearningcenterExample example);

    int updateByPrimaryKeySelective(TLearningcenter record);

    int updateByPrimaryKey(TLearningcenter record);
}