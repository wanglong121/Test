package com.wangl.data2.mapper;

import com.wangl.bean.CourseSign;
import com.wangl.bean.Sign;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SignMapper {

    @Select("select * from sign where e_id=#{eid}")
    public Sign getSignByeId(int eid);

    @Select("select * from sign where c_id=#{cid}")
    public Sign getSignBycId(int cid);

    @Select("select s.e_id, s.c_id, s.sign_state, c.c_group, c.c_class, c.c_name, c.c_start, c.c_end, c.c_teacher, e.e_name from sign s natural join course c natural join employee e where s.e_id=#{eId} group by c.c_group having c.c_group=#{cGroup}")
    public List<CourseSign> getAllSign(int eId, int cGroup);

    @Insert("insert into sign(sign_state,e_id,c_id) values (#{signState},#{eId},#{cId})")
    public void insertSign(Sign sign);

    @Delete("delete from sign where id=#{id}")
    public void deleteSignById(int id);

    @Update("update sign set sign_state=#{sign_state},c_id=#{c_id},e_id=#{e_id} where id=#{id}")
    public void updateSignById(Sign sign);
}
