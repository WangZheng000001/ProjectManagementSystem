package com.seisoul.projectmanagementsystem.service;


import org.springframework.stereotype.Service;

/**
 * @ Author YOSHIGAWA
 * @ Description 这是service层的一个接口类,接口里有抽象方法,方法包括查找"成员和项目"
 * @ Date 2023-07-2023/07/10 14:59
 */

public interface LoginService {

    String searchMemAndProj(Integer memId, String memPassword, String projPassword);


}
