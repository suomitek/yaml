package work.eip.example.svc.book;

import lombok.Data;

import java.util.Date;

/**
 * @Author: colin
 * @Date: 2019/4/26 10:04
 * @Description:
 * @Version: V1.0
 */
@Data
public class BookDTO extends BookCreateDTO {

    private long id;
    private Date createTime;
    private Date updateTime;

}
