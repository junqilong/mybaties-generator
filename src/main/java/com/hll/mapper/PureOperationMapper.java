package com.hll.mapper;

import com.hll.model.PureOperation;
import com.hll.model.PureOperationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PureOperationMapper {
    long countByExample(PureOperationExample example);

    int deleteByExample(PureOperationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PureOperation record);

    int insertSelective(PureOperation record);

    List<PureOperation> selectByExample(PureOperationExample example);

    PureOperation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PureOperation record, @Param("example") PureOperationExample example);

    int updateByExample(@Param("record") PureOperation record, @Param("example") PureOperationExample example);

    int updateByPrimaryKeySelective(PureOperation record);

    int updateByPrimaryKey(PureOperation record);
}