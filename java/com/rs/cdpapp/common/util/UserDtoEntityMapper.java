package com.rs.cdpapp.common.util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rs.cdpapp.config.dto.ApiResponseDto;
import com.rs.cdpapp.config.security.entity.UserEntity;
import com.rs.cdpapp.constants.ErrConstatns;
import com.rs.cdpapp.dto.UserDto;
import com.rs.cdpapp.repository.UserRepository;

@Component
public class UserDtoEntityMapper {
	
	
	@Autowired
	private UserRepository userRepo;
	
	SimpleDateFormat formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");  

	
	public  ApiResponseDto<?> userMapper(String userName){
		
		ApiResponseDto apiResponseDto =new ApiResponseDto();
		try{
			
		
		List<UserDto> userDtoList=new ArrayList<UserDto>();
		Optional<List<UserEntity>> userEntity=userRepo.findByCreadtedBy(userName);
		
		
		if(userEntity.isPresent()){
			
			for(UserEntity user : userEntity.get()){
				
				UserDto dto=new UserDto();
				dto.setLoginId(user.getId());
				dto.setUserName(user.getUsername());
				dto.setFirstName(user.getFirstName());
				dto.setPassword(user.getPassword());
				dto.setEmail(user.getEmail());
				dto.setEmployeeName(user.getCreadtedBy());
				dto.setCreationDate(formatter.format(user.getCreationDate()));
				dto.setLastModifiedDate(formatter.format(user.getLastModifiedDate()));
				dto.setStatus(user.getStatus());
				userDtoList.add(dto);
				
			}
		}
		apiResponseDto.setData(userDtoList);
		apiResponseDto.setMessage(ErrConstatns.SUCCESS);
		
		}catch(Exception e){
			
			System.out.println(e);
		}
		return apiResponseDto;
		
		
	}
	

}
