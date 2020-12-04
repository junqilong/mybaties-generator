package com.hll.mapper;

import com.hll.model.OperationRecommend;
import com.hll.model.OperationRecommendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OperationRecommendMapper {
    long countByExample(OperationRecommendExample example);

    int deleteByExample(OperationRecommendExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OperationRecommend record);

    int insertSelective(OperationRecommend record);

    List<OperationRecommend> selectByExample(OperationRecommendExample example);

    OperationRecommend selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OperationRecommend record, @Param("example") OperationRecommendExample example);

    int updateByExample(@Param("record") OperationRecommend record, @Param("example") OperationRecommendExample example);

    int updateByPrimaryKeySelective(OperationRecommend record);

    int updateByPrimaryKey(OperationRecommend record);
}