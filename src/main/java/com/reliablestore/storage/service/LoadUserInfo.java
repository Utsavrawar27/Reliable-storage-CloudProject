package com.reliablestore.storage.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.reliablestore.storage.dao.UserUploadFileRecord;
import com.reliablestore.storage.dao.UserUploadFileRecordDao;
import com.reliablestore.storage.dto.UserUploadFileRecordDTO;

public class LoadUserInfo {

    @Autowired
    private UserUploadFileRecordDao dao;

    public List<UserUploadFileRecordDTO> getUserInfo(String userName) {
        List<UserUploadFileRecordDTO> dtos = new ArrayList<>();

        try {


            List<UserUploadFileRecord> records = dao.getUserUploadRecordByEmail(userName);
            if (records != null) {
                for (UserUploadFileRecord record : records) {
                    UserUploadFileRecordDTO dto = new UserUploadFileRecordDTO();

                    dto.setFilename(record.getFilename());
                    dto.setId(record.getId());
                    dto.setDescription(record.getDescription());
                    dto.setFirstname(record.getFirstname());
                    dto.setLastname(record.getLastname());
                    dto.setCreatedTime(record.getCreatedTime());
                    dto.setUpdatedTime(record.getUpdatedTime());
                    dto.setPath(record.getPath());
                    dtos.add(dto);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return dtos;
    }

}
