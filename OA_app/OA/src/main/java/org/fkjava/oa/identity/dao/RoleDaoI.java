package org.fkjava.oa.identity.dao;

import java.util.List;

import org.fkjava.oa.identity.bean.Role;
import org.fkjava.oa.identity.bean.User;
import org.fkjava.oa.identity.dao.base.HibernateDao;
import org.fkjava.oa.util.webTag.PageModel;

public interface RoleDaoI  extends HibernateDao{

	//角色分页查询
	List<Role> selectRolePage(PageModel pageModel);

	//删除角色用户
	void deleteRoleByIds(String[] ids);





	


}
