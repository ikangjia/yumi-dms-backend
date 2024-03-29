package cn.ikangjia.yumi.dms.domain.mapper;

import cn.ikangjia.yumi.dms.domain.entity.UserDO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author kangJia
 * @email ikangjia.cn@outlook.com
 */
@Mapper
public interface UserMapper extends BaseMapper<UserDO> {
}
