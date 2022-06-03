package com.example.demo.ampq;

import com.example.demo.ampq.service.DataSendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DataSend {
    @Autowired
    DataSendService dataSendService;
    @GetMapping("/")
    public ResponseEntity sendData(){
        dataSendService.sendData();
        return new ResponseEntity("Sent",HttpStatus.MULTI_STATUS);
    }
}
