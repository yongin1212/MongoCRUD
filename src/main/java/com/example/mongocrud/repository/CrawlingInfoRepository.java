package com.example.mongocrud.repository;

import com.example.mongocrud.entity.CrawlingInfo;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface CrawlingInfoRepository extends MongoRepository<CrawlingInfo, String> {
    Optional<CrawlingInfo> findById(Long id);

}
