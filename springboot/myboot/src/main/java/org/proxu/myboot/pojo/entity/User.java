package org.proxu.myboot.pojo.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * TODO
 *
 * @author ProXu
 * @version 1.0
 * @date 2020/9/16 0016 19:30
 */
@Data
public class User implements Serializable {
	private static final long serialVersionUID = -4138979548397827192L;
	private Long id;
	private String name;
}
