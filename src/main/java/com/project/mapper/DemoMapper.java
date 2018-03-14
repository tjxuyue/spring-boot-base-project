package com.cetc.data.client.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.cetc.data.client.entity.Demo;

@Mapper
public interface DemoMapper extends BaseMapper<Demo> {
	public List<Demo> demo();
}
