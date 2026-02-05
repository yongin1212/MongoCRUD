package com.example.mongocrud.service;

import com.example.mongocrud.repository.CrawlingInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CrawlingInfoService {
    
    private final CrawlingInfoRepository crawlingInfoRepository;
    
    
}
