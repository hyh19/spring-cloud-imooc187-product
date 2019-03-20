package com.imooc.product.common;

import lombok.Data;

/**
 * Created by 廖师兄
 * 2019-03-20 21:55
 */
@Data
public class DecreaseStockInput {

	/**
	 * 商品id
	 */
	private String productId;

	/**
	 * 商品数量
	 */
	private Integer productQuantity;

	public DecreaseStockInput() {
	}

	public DecreaseStockInput(String productId, Integer productQuantity) {
		this.productId = productId;
		this.productQuantity = productQuantity;
	}
}
