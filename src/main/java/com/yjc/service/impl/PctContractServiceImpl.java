package com.yjc.service.impl;

import com.yjc.entity.PctContract;
import com.yjc.dao.PctContractDao;
import com.yjc.service.PctContractService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 采购合同(PctContract)表服务实现类
 *
 * @author makejava
 * @since 2022-06-19 10:51:22
 */
@Service("pctContractService")
public class PctContractServiceImpl implements PctContractService {
    @Resource
    private PctContractDao pctContractDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PctContract queryById(String id) {
        return this.pctContractDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param pctContract 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<PctContract> queryByPage(PctContract pctContract, PageRequest pageRequest) {
        long total = this.pctContractDao.count(pctContract);
        return new PageImpl<>(this.pctContractDao.queryAllByLimit(pctContract, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param pctContract 实例对象
     * @return 实例对象
     */
    @Override
    public PctContract insert(PctContract pctContract) {
        this.pctContractDao.insert(pctContract);
        return pctContract;
    }

    /**
     * 修改数据
     *
     * @param pctContract 实例对象
     * @return 实例对象
     */
    @Override
    public PctContract update(PctContract pctContract) {
        this.pctContractDao.update(pctContract);
        return this.queryById(pctContract.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.pctContractDao.deleteById(id) > 0;
    }
}
