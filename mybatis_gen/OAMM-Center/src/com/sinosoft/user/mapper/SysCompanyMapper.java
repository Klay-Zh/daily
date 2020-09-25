package com.sinosoft.user.mapper;

import com.sinosoft.pojo.SysCompany;
import com.sinosoft.pojo.SysCompanyCondition;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysCompanyMapper {
    long countByExample(SysCompanyCondition example);

    int deleteByExample(SysCompanyCondition example);

    int deleteByPrimaryKey(String id);

    int insert(SysCompany record);

    int insertSelective(SysCompany record);

    List<SysCompany> selectByExample(SysCompanyCondition example);

    SysCompany selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysCompany record, @Param("example") SysCompanyCondition example);

    int updateByExample(@Param("record") SysCompany record, @Param("example") SysCompanyCondition example);

    int updateByPrimaryKeySelective(SysCompany record);

    int updateByPrimaryKey(SysCompany record);
}