package com.mdv.mybatis.mapper;

import com.mdv.mybatis.model.dto.CategoryDTO;
import com.mdv.mybatis.model.request.CategoryRequest;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CategoryMapper {
    List<CategoryDTO> findAll();

    List<CategoryDTO> findAllActive();

    CategoryDTO findById(Long id);

    boolean existsByName(String name);

    void insert(@Param("category") CategoryRequest category);

    void update(@Param("id") Long id, @Param("category") CategoryRequest category);

    void restore(@Param("id") Long id);

    void softDelete(Long id);
}
