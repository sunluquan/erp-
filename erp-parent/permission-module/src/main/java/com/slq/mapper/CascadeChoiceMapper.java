package com.slq.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.slq.common.CascadeChoice;
@Mapper
public interface CascadeChoiceMapper {

	List<CascadeChoice> getCascadePermission();

	List<CascadeChoice> getCascadePermissionChild(Integer parentId);
<<<<<<< HEAD

	List<CascadeChoice> getCascadeProductKind();
	
	List<CascadeChoice> getKindChildren(Integer id);
=======
>>>>>>> 2bf7a0da52f72433bd88fc6a5792af2603a1b10d
}
