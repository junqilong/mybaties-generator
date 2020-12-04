package com.hll.mapper;

import com.hll.model.TRecommend;
import com.hll.model.TRecommendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TRecommendMapper {
    long countByExample(TRecommendExample example);

    int deleteByExample(TRecommendExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TRecommend record);

    int insertSelective(TRecommend record);

    List<TRecommend> selectByExample(TRecommendExample example);

    TRecommend selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TRecommend record, @Param("example") TRecommendExample example);

    int updateByExample(@Param("record") TRecommend record, @Param("example") TRecommendExample example);

    int updateByPrimaryKeySelective(TRecommend record);

    int updateByPrimaryKey(TRecommend record);
}