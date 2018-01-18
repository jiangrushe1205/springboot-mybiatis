package com.freefly.demo.model;

import com.alibaba.fastjson.JSON;

import javax.persistence.*;
import java.util.Date;

@Table(name = "t_pay_001_unification_order")
public class UnificationOrder {
    /**
     * 主键
     */
    @Id
    @Column(name = "unification_order_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer unificationOrderId;

    /**
     * 订单号
     */
    @Column(name = "business_order_code")
    private String businessOrderCode;

    /**
     * 业务类型
     */
    @Column(name = "business_type")
    private Integer businessType;

    /**
     * 支付类型
     */
    @Column(name = "pay_type")
    private String payType;

    /**
     * 支付状态
     */
    @Column(name = "pay_Status")
    private Integer payStatus;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 支付时间
     */
    @Column(name = "pay_time")
    private Date payTime;

    /**
     * 商品描述
     */
    private String body;

    /**
     * 总金额
     */
    @Column(name = "total_fee")
    private String totalFee;

    /**
     * 商品详情
     */
    private String detail;

    /**
     * 商品ID
     */
    @Column(name = "product_id")
    private String productId;

    /**
     * 获取主键
     *
     * @return unification_order_Id - 主键
     */
    public Integer getUnificationOrderId() {
        return unificationOrderId;
    }

    /**
     * 设置主键
     *
     * @param unificationOrderId 主键
     */
    public void setUnificationOrderId(Integer unificationOrderId) {
        this.unificationOrderId = unificationOrderId;
    }

    /**
     * 获取订单号
     *
     * @return business_order_code - 订单号
     */
    public String getBusinessOrderCode() {
        return businessOrderCode;
    }

    /**
     * 设置订单号
     *
     * @param businessOrderCode 订单号
     */
    public void setBusinessOrderCode(String businessOrderCode) {
        this.businessOrderCode = businessOrderCode == null ? null : businessOrderCode.trim();
    }

    /**
     * 获取业务类型
     *
     * @return business_type - 业务类型
     */
    public Integer getBusinessType() {
        return businessType;
    }

    /**
     * 设置业务类型
     *
     * @param businessType 业务类型
     */
    public void setBusinessType(Integer businessType) {
        this.businessType = businessType;
    }

    /**
     * 获取支付类型
     *
     * @return pay_type - 支付类型
     */
    public String getPayType() {
        return payType;
    }

    /**
     * 设置支付类型
     *
     * @param payType 支付类型
     */
    public void setPayType(String payType) {
        this.payType = payType;
    }

    /**
     * 获取支付状态
     *
     * @return pay_Status - 支付状态
     */
    public Integer getPayStatus() {
        return payStatus;
    }

    /**
     * 设置支付状态
     *
     * @param payStatus 支付状态
     */
    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取支付时间
     *
     * @return pay_time - 支付时间
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * 设置支付时间
     *
     * @param payTime 支付时间
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * 获取商品描述
     *
     * @return body - 商品描述
     */
    public String getBody() {
        return body;
    }

    /**
     * 设置商品描述
     *
     * @param body 商品描述
     */
    public void setBody(String body) {
        this.body = body == null ? null : body.trim();
    }

    /**
     * 获取总金额
     *
     * @return total_fee - 总金额
     */
    public String getTotalFee() {
        return totalFee;
    }

    /**
     * 设置总金额
     *
     * @param totalFee 总金额
     */
    public void setTotalFee(String totalFee) {
        this.totalFee = totalFee == null ? null : totalFee.trim();
    }

    /**
     * 获取商品详情
     *
     * @return detail - 商品详情
     */
    public String getDetail() {
        return detail;
    }

    /**
     * 设置商品详情
     *
     * @param detail 商品详情
     */
    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    /**
     * 获取商品ID
     *
     * @return product_id - 商品ID
     */
    public String getProductId() {
        return productId;
    }

    /**
     * 设置商品ID
     *
     * @param productId 商品ID
     */
    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }


    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}