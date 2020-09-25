package com.sinosoft.lis.dao;

import com.sinosoft.lis.entity.Lxtbxmlstore;
import com.sinosoft.lis.entity.LxtbxmlstoreCondition;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LxtbxmlstoreMapper {
    long countByExample(LxtbxmlstoreCondition example);

    int deleteByExample(LxtbxmlstoreCondition example);

    int deleteByPrimaryKey(Long serialno);

    int insert(Lxtbxmlstore record);

    int insertSelective(Lxtbxmlstore record);

    List<Lxtbxmlstore> selectByExample(LxtbxmlstoreCondition example);

    Lxtbxmlstore selectByPrimaryKey(Long serialno);

    int updateByExampleSelective(@Param("record") Lxtbxmlstore record, @Param("example") LxtbxmlstoreCondition example);

    int updateByExample(@Param("record") Lxtbxmlstore record, @Param("example") LxtbxmlstoreCondition example);

    int updateByPrimaryKeySelective(Lxtbxmlstore record);

    int updateByPrimaryKey(Lxtbxmlstore record);
}