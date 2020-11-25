package cn.bdqn.Mapper;

import cn.bdqn.domain.Employee;

public interface EmployeeMapper {
    // 根据id查询员工
    public Employee queryById(Integer id);

    // 添加员工
    public void save(Employee employee);
}
