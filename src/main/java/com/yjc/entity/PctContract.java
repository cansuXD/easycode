package com.yjc.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 采购合同(PctContract)实体类
 *
 * @author makejava
 * @since 2022-06-19 10:51:16
 */
public class PctContract implements Serializable {
    private static final long serialVersionUID = 803274399015953457L;
    /**
     * 合同Id
     */
    private String id;
    /**
     * 合同名称
     */
    private String contractName;
    /**
     * 合同编号
     */
    private String contractNo;
    /**
     * 合同类别Id
     */
    private String classId;
    /**
     * 合同类别名称
     */
    private String className;
    /**
     * 合同类别全称
     */
    private String classNamePath;
    /**
     * 合同类型
     */
    private Integer contractType;
    /**
     * 签约归属类型
     */
    private Integer signBelongType;
    /**
     * 所属项目Id
     */
    private String projectId;
    /**
     * 所属项目名称
     */
    private String projectName;
    /**
     * 所属公司Id
     */
    private String corpId;
    /**
     * 所属公司名称
     */
    private String corpName;
    /**
     * 票据类型Id
     */
    private String invoiceTypeId;
    /**
     * 票据类型名称
     */
    private String invoiceTypeName;
    /**
     * 供应商名称
     */
    private String supplierName;
    /**
     * 签约日期
     */
    private Date signDate;
    /**
     * 签约币种
     */
    private String signCurrency;
    /**
     * 签约币种名称
     */
    private String signCurrencyName;
    /**
     * 立项id
     */
    private String purchaseId;
    /**
     * 立项名称
     */
    private String purchaseName;
    /**
     * 战略协议id
     */
    private String protocolId;
    /**
     * 战略协议名称
     */
    private String protocolName;
    /**
     * 来源，1：常规合同，2：采购立项，3：战采协议
     */
    private Integer sourceType;
    /**
     * 是否关联合约
     */
    private Integer enabledRelatePlanContract;
    /**
     * 汇率
     */
    private Double exchangeRate;
    /**
     * 经办人Id
     */
    private String operatorId;
    /**
     * 经办人
     */
    private String operatorName;
    /**
     * 经办人部门Id
     */
    private String operatorDeptId;
    /**
     * 经办部门
     */
    private String operatorDeptName;
    /**
     * 签约总额(含税）
     */
    private Double signTotalAmount;
    /**
     * 签约成本
     */
    private Double signCostAmount;
    /**
     * 综合税率
     */
    private Double signTaxRate;
    /**
     * 签约税额
     */
    private Double signTaxAmount;
    /**
     * 签约总额（折合人民币)
     */
    private Double signTotalAmountRmb;
    /**
     * 签约成本（折合人民币）
     */
    private Double signCostAmountRmb;
    /**
     * 签约税额（折合人民币）
     */
    private Double signTaxAmountRmb;
    /**
     * 付款控制比例
     */
    private Double paymentControlRate;
    /**
     * 允许变更比例
     */
    private Double allowedChangeRate;
    /**
     * 处理人名称
     */
    private String currentTaskCandidatesName;
    /**
     * 正式时间
     */
    private Date formalTime;
    /**
     * 状态
     */
    private Integer status;
    /**
     * 流程实例Id
     */
    private String entryId;
    /**
     * 是否移除
     */
    private Integer isDeleted;
    /**
     * 是否已结算
     */
    private Integer isSettled;
    /**
     * 创建人Id
     */
    private String creatorId;
    /**
     * 创建人名称
     */
    private String creatorName;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新人Id
     */
    private String updatorId;
    /**
     * 更新人名称
     */
    private String updatorName;
    /**
     * 更新时间
     */
    private Date updateTime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassNamePath() {
        return classNamePath;
    }

    public void setClassNamePath(String classNamePath) {
        this.classNamePath = classNamePath;
    }

    public Integer getContractType() {
        return contractType;
    }

    public void setContractType(Integer contractType) {
        this.contractType = contractType;
    }

    public Integer getSignBelongType() {
        return signBelongType;
    }

    public void setSignBelongType(Integer signBelongType) {
        this.signBelongType = signBelongType;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getCorpId() {
        return corpId;
    }

    public void setCorpId(String corpId) {
        this.corpId = corpId;
    }

    public String getCorpName() {
        return corpName;
    }

    public void setCorpName(String corpName) {
        this.corpName = corpName;
    }

    public String getInvoiceTypeId() {
        return invoiceTypeId;
    }

    public void setInvoiceTypeId(String invoiceTypeId) {
        this.invoiceTypeId = invoiceTypeId;
    }

    public String getInvoiceTypeName() {
        return invoiceTypeName;
    }

    public void setInvoiceTypeName(String invoiceTypeName) {
        this.invoiceTypeName = invoiceTypeName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public Date getSignDate() {
        return signDate;
    }

    public void setSignDate(Date signDate) {
        this.signDate = signDate;
    }

    public String getSignCurrency() {
        return signCurrency;
    }

    public void setSignCurrency(String signCurrency) {
        this.signCurrency = signCurrency;
    }

    public String getSignCurrencyName() {
        return signCurrencyName;
    }

    public void setSignCurrencyName(String signCurrencyName) {
        this.signCurrencyName = signCurrencyName;
    }

    public String getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(String purchaseId) {
        this.purchaseId = purchaseId;
    }

    public String getPurchaseName() {
        return purchaseName;
    }

    public void setPurchaseName(String purchaseName) {
        this.purchaseName = purchaseName;
    }

    public String getProtocolId() {
        return protocolId;
    }

    public void setProtocolId(String protocolId) {
        this.protocolId = protocolId;
    }

    public String getProtocolName() {
        return protocolName;
    }

    public void setProtocolName(String protocolName) {
        this.protocolName = protocolName;
    }

    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    public Integer getEnabledRelatePlanContract() {
        return enabledRelatePlanContract;
    }

    public void setEnabledRelatePlanContract(Integer enabledRelatePlanContract) {
        this.enabledRelatePlanContract = enabledRelatePlanContract;
    }

    public Double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getOperatorDeptId() {
        return operatorDeptId;
    }

    public void setOperatorDeptId(String operatorDeptId) {
        this.operatorDeptId = operatorDeptId;
    }

    public String getOperatorDeptName() {
        return operatorDeptName;
    }

    public void setOperatorDeptName(String operatorDeptName) {
        this.operatorDeptName = operatorDeptName;
    }

    public Double getSignTotalAmount() {
        return signTotalAmount;
    }

    public void setSignTotalAmount(Double signTotalAmount) {
        this.signTotalAmount = signTotalAmount;
    }

    public Double getSignCostAmount() {
        return signCostAmount;
    }

    public void setSignCostAmount(Double signCostAmount) {
        this.signCostAmount = signCostAmount;
    }

    public Double getSignTaxRate() {
        return signTaxRate;
    }

    public void setSignTaxRate(Double signTaxRate) {
        this.signTaxRate = signTaxRate;
    }

    public Double getSignTaxAmount() {
        return signTaxAmount;
    }

    public void setSignTaxAmount(Double signTaxAmount) {
        this.signTaxAmount = signTaxAmount;
    }

    public Double getSignTotalAmountRmb() {
        return signTotalAmountRmb;
    }

    public void setSignTotalAmountRmb(Double signTotalAmountRmb) {
        this.signTotalAmountRmb = signTotalAmountRmb;
    }

    public Double getSignCostAmountRmb() {
        return signCostAmountRmb;
    }

    public void setSignCostAmountRmb(Double signCostAmountRmb) {
        this.signCostAmountRmb = signCostAmountRmb;
    }

    public Double getSignTaxAmountRmb() {
        return signTaxAmountRmb;
    }

    public void setSignTaxAmountRmb(Double signTaxAmountRmb) {
        this.signTaxAmountRmb = signTaxAmountRmb;
    }

    public Double getPaymentControlRate() {
        return paymentControlRate;
    }

    public void setPaymentControlRate(Double paymentControlRate) {
        this.paymentControlRate = paymentControlRate;
    }

    public Double getAllowedChangeRate() {
        return allowedChangeRate;
    }

    public void setAllowedChangeRate(Double allowedChangeRate) {
        this.allowedChangeRate = allowedChangeRate;
    }

    public String getCurrentTaskCandidatesName() {
        return currentTaskCandidatesName;
    }

    public void setCurrentTaskCandidatesName(String currentTaskCandidatesName) {
        this.currentTaskCandidatesName = currentTaskCandidatesName;
    }

    public Date getFormalTime() {
        return formalTime;
    }

    public void setFormalTime(Date formalTime) {
        this.formalTime = formalTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getEntryId() {
        return entryId;
    }

    public void setEntryId(String entryId) {
        this.entryId = entryId;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Integer getIsSettled() {
        return isSettled;
    }

    public void setIsSettled(Integer isSettled) {
        this.isSettled = isSettled;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdatorId() {
        return updatorId;
    }

    public void setUpdatorId(String updatorId) {
        this.updatorId = updatorId;
    }

    public String getUpdatorName() {
        return updatorName;
    }

    public void setUpdatorName(String updatorName) {
        this.updatorName = updatorName;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

}

