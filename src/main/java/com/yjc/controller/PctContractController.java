package com.yjc.controller;

import com.yjc.entity.PctContract;
import com.yjc.service.PctContractService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 采购合同(PctContract)表控制层
 *
 * @author makejava
 * @since 2022-06-19 10:51:06
 */
@RestController
@RequestMapping("pctContract")
public class PctContractController {
    /**
     * 服务对象
     */
    @Resource
    private PctContractService pctContractService;

    /**
     * 分页查询
     *
     * @param pctContract 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<PctContract>> queryByPage(PctContract pctContract, PageRequest pageRequest) {
        return ResponseEntity.ok(this.pctContractService.queryByPage(pctContract, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<PctContract> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.pctContractService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param pctContract 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<PctContract> add(PctContract pctContract) {
        return ResponseEntity.ok(this.pctContractService.insert(pctContract));
    }

    /**
     * 编辑数据
     *
     * @param pctContract 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<PctContract> edit(PctContract pctContract) {
        return ResponseEntity.ok(this.pctContractService.update(pctContract));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(String id) {
        return ResponseEntity.ok(this.pctContractService.deleteById(id));
    }

}

