package org.fkjava.oa.leave.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.fkjava.oa.identity.bean.User;



/**
 * @Author chunlong.luo @tel 15622266642 @qq 584614151
 * @Date 2015年9月6日下午1:12:56
 * @Email 584614151&qq.com
 * @Version 1.0
 * @From http://www.fkit.org
 *
 */
@Entity @Table(name="OA_LEAVE_AUDIT")
public class LeaveAudit implements Serializable{
	
	private static final long serialVersionUID = -9203603567533179866L;
	@Id @Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	/** 与假期明细存在多对一关联 */
	@ManyToOne(fetch=FetchType.LAZY, targetEntity=LeaveItem.class)
	@JoinColumn(name="ITEM_ID", referencedColumnName="ID",
			foreignKey=@ForeignKey(name="FK_AUDIT_ITEM_ID"))
	private LeaveItem itemId;
	/** 审核状态： 1 : 同意  2: 不同意 */
	@Column(name="STATUS", columnDefinition="smallint(6) default 1", nullable=false)
	private Short status;
	/** 与审核人存在多对一关联 */
	@ManyToOne(fetch=FetchType.LAZY, targetEntity=User.class)
	@JoinColumn(name="CHECKER", referencedColumnName="USER_ID",
			foreignKey=@ForeignKey(name="FK_AUDIT_CHECKER"))
	private User checker;
	@Column(name="CHECK_DATE")
	private Date checkDate;
	@Column(name="REMARK", length=500)
	private String remark;
	
	/** setter and getter method */
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LeaveItem getItemId() {
		return itemId;
	}
	public void setItemId(LeaveItem itemId) {
		this.itemId = itemId;
	}
	public User getChecker() {
		return checker;
	}
	public void setChecker(User checker) {
		this.checker = checker;
	}
	public Date getCheckDate() {
		return checkDate;
	}
	public void setCheckDate(Date checkDate) {
		this.checkDate = checkDate;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Short getStatus() {
		return status;
	}
	public void setStatus(Short status) {
		this.status = status;
	}
}
