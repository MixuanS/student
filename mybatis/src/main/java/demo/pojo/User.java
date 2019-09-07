package demo.pojo;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * 用户
 *
 * @author hc
 * @version 1.0.0
 * @date 2019/7/26
 */
@Data
@ToString
public class User {
    private Integer id;
    private String username;
    private Date birthday;
    private String sex;
    private String address;
}
