package com.yjc.service;

import com.yjc.entity.PctContract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 采购合同(PctContract)表服务接口
 *
 * @author makejava
 * @since 2022-06-19 10:51:18
 */
public interface PctContractService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    PctContract queryById(String id);

    /**
     * 分页查询
     *
     * @param pctContract 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<PctContract> queryByPage(PctContract pctContract, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param pctContract 实例对象
     * @return 实例对象
     */
    PctContract insert(PctContract pctContract);

    /**
     * 修改数据
     *
     * @param pctContract 实例对象
     * @return 实例对象
     */
    PctContract update(PctContract pctContract);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

}
