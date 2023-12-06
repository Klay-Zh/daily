package com.transmit.datatransfer.service.impl;

import com.transmit.datatransfer.domain.MaterialData;
import com.transmit.datatransfer.mapper.MaterialDataMapper;
import com.transmit.datatransfer.service.IMaterialDataService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 物料主数据表 服务实现类
 * </p>
 *
 * @author zkl
 * @since 2023-12-06
 */
@Service
public class MaterialDataServiceImpl extends ServiceImpl<MaterialDataMapper, MaterialData> implements IMaterialDataService {

}
