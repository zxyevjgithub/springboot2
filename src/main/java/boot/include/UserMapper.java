package boot.include;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {


    public  void addUser(User user) throws Exception;

    @Select(" select * from user")
    public  List<User>  selectUser() throws Exception;

    @Select( " select * from user where name= #{name} and  password=#{password} ")
    public  User  selectUserone(User user) throws Exception;
}
