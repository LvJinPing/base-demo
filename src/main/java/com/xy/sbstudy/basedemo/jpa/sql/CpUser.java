package com.xy.sbstudy.basedemo.jpa.sql;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Proxy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author ljp
 * @version 1.0
 * @since 2019-04-11
 */
@Entity
@Table(name = "cp_user") // 表名
@Proxy(lazy = false) // 关闭懒加载 ==》 这个与hibernate 运行机制有关 后期了解 @todo  了解完成后关闭
@Getter
@Setter
@ToString
public class CpUser {
    @Column(name = "user_id")  // 数据库列名
    @Id //这是一个主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 表名是自增主键
    private Integer userId;
    @Column(name = "group_id")
    private Integer groupId;
    @Column // 不写时默认小写
    private String truename;
    @Column
    private Date birthday;
}
