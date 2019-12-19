package com.project.javafx.controller;

import com.project.logic.service.inf.BusinessService;
import javafx.fxml.FXML;
import javafx.scene.web.WebView;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

/**
 * @author edward.reyes
 */
@Controller
@RequiredArgsConstructor
@Slf4j
public class SampleController {
    private static final String MY_URL = "https://www.google.com";
    private final BusinessService businessSevice;

    @FXML
    private WebView myWebView;

    @FXML
    private void initialize() {
        myWebView.getEngine().load(SampleController.MY_URL);
        log.info(businessSevice.findAllByNameStartWith("Edward").toString());
    }

}
