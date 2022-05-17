package com.shippment.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name = "shippment")
public class Tracking {

	@Id
	@Column(name = "customer_id")
	Integer customerId = 0;
	@Column(name = "customer_name")
	String customerName = null;

	@Column(name = "order_id")
	Integer orderId = 0;

	@Column(name = "delivery_location")
	String deliveryLocation = null;

	@Column(name = "courier_status")
	String courierStatus = null;

	public Tracking() {
		super();
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getDeliveryLocation() {
		return deliveryLocation;
	}

	public void setDeliveryLocation(String deliveryLocation) {
		this.deliveryLocation = deliveryLocation;
	}

	public String getCourierStatus() {
		return courierStatus;
	}

	public void setCourierStatus(String courierStatus) {
		this.courierStatus = courierStatus;
	}

	@Override
	public String toString() {
		return "Tracking [customerId=" + customerId + ", customerName=" + customerName + ", orderId=" + orderId
				+ ", deliveryLocation=" + deliveryLocation + ", courierStatus=" + courierStatus + "]";
	}

//	@Override
//	public String toString() {
//		return "Tracking [customerId=" + customerId + ", customerName=" + customerName + ", orderId=" + orderId
//				+ ", deliveryLocation=" + deliveryLocation + ", courierStatus=" + courierStatus + "]";
//	}
//
//	public Integer getCustomerId() {
//		return customerId;
//	}
//
//	public void setCustomerId(int customerId) {
//		this.customerId = customerId;
//	}
//
//	public String getCustomerName() {
//		return customerName;
//	}
//
//	public void setCustomerName(String customerName) {
//		this.customerName = customerName;
//	}
//
//	public Integer getOrderId() {
//		return orderId;
//	}
//
//	public void setOrderId(Integer orderId) {
//		this.orderId = orderId;
//	}
//
//	public String getDeliveryLocation() {
//		return deliveryLocation;
//	}
//
//	public void setDeliveryLocation(String deliveryLocation) {
//		this.deliveryLocation = deliveryLocation;
//	}
//
//	public String getCourierStatus() {
//		return courierStatus;
//	}
//
//	public void setCourierStatus(String courierStatus) {
//		this.courierStatus = courierStatus;
//	}
//


}
