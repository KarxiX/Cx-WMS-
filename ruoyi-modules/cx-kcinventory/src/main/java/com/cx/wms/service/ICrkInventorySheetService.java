package com.cx.wms.service;

import com.cx.wms.domain.CrkInventorySheet;
import com.cx.wms.domain.HpGood;
import com.cx.wms.domain.User;
import com.cx.wms.domain.WareHouse;

import java.util.List;
import java.util.Map;

/**
 * 库存盘点Service接口
 *
 * @author xrc
 * @date 2023-12-14
 */
public interface ICrkInventorySheetService {
    /**
     * 查询库存盘点
     *
     * @param isId 库存盘点主键
     * @return 库存盘点
     */
    public CrkInventorySheet selectCrkInventorySheetByIsId(Long isId);

    /**
     * 查询库存盘点列表
     *
     * @param crkInventorySheet 库存盘点
     * @return 库存盘点集合
     */
    public List<CrkInventorySheet> selectCrkInventorySheetList(CrkInventorySheet crkInventorySheet);

    /**
     * 新增库存盘点
     *
     * @param crkInventorySheet 库存盘点
     * @return 结果
     */
    public int insertCrkInventorySheet(CrkInventorySheet crkInventorySheet);

    /**
     * 修改库存盘点
     *
     * @param crkInventorySheet 库存盘点
     * @return 结果
     */
    public int updateCrkInventorySheet(CrkInventorySheet crkInventorySheet);

    /**
     * 批量删除库存盘点
     *
     * @param isIds 需要删除的库存盘点主键集合
     * @return 结果
     */
    public int deleteCrkInventorySheetByIsIds(Long[] isIds);

    /**
     * 删除库存盘点信息
     *
     * @param isId 库存盘点主键
     * @return 结果
     */
    public int deleteCrkInventorySheetByIsId(Long isId);

    /**
     * 查询最新的is_code
     * @return 最新的is_code
     */
    public String findIsCode();
    public String findIsId();

    public String genIsCode();

    /**
     * 查询仓库name 仓库id
     * @return 仓库name 仓库id
     */
    public List<WareHouse> findWareHouse();

    public List<User> findAllUser();

    public List<HpGood> findAllHpGoods();
}
