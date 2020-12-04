package com.hll.mapper;

import com.hll.model.PadModel;
import com.hll.model.PadModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PadModelMapper {
    long countByExample(PadModelExample example);

    int deleteByExample(PadModelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PadModel record);

    int insertSelective(PadModel record);

    List<PadModel> selectByExample(PadModelExample example);

    PadModel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PadModel record, @Param("example") PadModelExample example);

    int updateByExample(@Param("record") PadModel record, @Param("example") PadModelExample example);

    int updateByPrimaryKeySelective(PadModel record);

    int updateByPrimaryKey(PadModel record);
}