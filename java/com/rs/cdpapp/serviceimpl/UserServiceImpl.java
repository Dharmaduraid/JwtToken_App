package com.rs.cdpapp.serviceimpl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import com.rs.cdpapp.common.util.QueryString;
import com.rs.cdpapp.common.util.UserDtoEntityMapper;
import com.rs.cdpapp.config.dto.ApiResponseDto;
import com.rs.cdpapp.config.security.dto.UserContext;
import com.rs.cdpapp.config.security.entity.UserEntity;
import com.rs.cdpapp.config.security.entity.UserRolesEntity;
import com.rs.cdpapp.constants.ErrConstatns;
import com.rs.cdpapp.dto.CimsUpdatedDto;
import com.rs.cdpapp.dto.UserDto;
import com.rs.cdpapp.dto.UserEntityDto;
import com.rs.cdpapp.dto.UserRoleEntityDto;
import com.rs.cdpapp.mapper.CimsUpdatedMapper;
import com.rs.cdpapp.mapper.CimsUserMapper;
import com.rs.cdpapp.repository.UserRepository;
import com.rs.cdpapp.repository.UserRoleRepository;
import com.rs.cdpapp.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDtoEntityMapper userEntityMapper;
	
	@Autowired
	UserRepository userRepo;
	
	@Autowired
	NamedParameterJdbcTemplate cdpAppNamedParameterJdbcTemplate;
	
	@Autowired
    UserRoleRepository userRoleRepo;
	
	SimpleDateFormat formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");  

	@Override
	public ApiResponseDto saveUserData(UserDto userDto,Authentication auth) {
		
		ApiResponseDto apiResponseDto =new ApiResponseDto();
		UserContext userContext = (UserContext) auth.getPrincipal();
		String userName = userContext.getUserName();
		
		try {
			UserEntity user = new UserEntity();

			user.setUsername(userDto.getUserName());
			user.setPassword(userDto.getPassword());
			user.setEmail(userDto.getEmail());
			user.setEmployeeId(userDto.getEmployeeId());
			user.setFirstName(userDto.getEmployeeName());
			user.setCreadtedBy(userContext.getUserName());
			user.setCreationDate(new Date());
			user.setLastModifiedDate(new Date());
			user.setMobileNum(userDto.getMobileNo());
			user.setStatus(userDto.getStatus());
			user.setUserRoles(mapRoleToEntity(userDto.getRole()));
			userRepo.save(user);
			
			apiResponseDto.setMessage("SUCCESS");
			
		} catch (Exception e) {

			apiResponseDto.setMessage("FAIL");
		}

		return apiResponseDto;
	}

	private Set<UserRolesEntity> mapRoleToEntity(String roleName) {
		Set<UserRolesEntity> roleList = new HashSet<>();

		if (null !=roleName && !roleName.isEmpty()) {
			
				UserRolesEntity userRolesEntity = userRoleRepo.findByRoleName(roleName);
				roleList.add(userRolesEntity);
			}

		
		return roleList;
	}

	
	@Override
	public ApiResponseDto viewUserData(String userName) {
		
		return userEntityMapper.userMapper(userName);
	}

	@Override
	public ApiResponseDto<?> updateUserData(Long userId) {
		ApiResponseDto apiResponseDto =new ApiResponseDto();
		try {
			
			Optional<UserEntity> userData=userRepo.findById(userId);

			
			if(userData.isPresent()){
				
				UserDto dto=new UserDto();
				
				dto.setUserName(userData.get().getUsername());
				dto.setFirstName(userData.get().getFirstName());
				dto.setPassword(userData.get().getPassword());
				dto.setCreationDate(formatter.format(userData.get().getCreationDate()));
				dto.setEmployeeName(userData.get().getFirstName());
				dto.setEmployeeId(userData.get().getEmployeeId());
				dto.setLastModifiedDate(formatter.format(userData.get().getLastModifiedDate()));
				dto.setEmail(userData.get().getEmail());
				dto.setMobileNo(userData.get().getMobileNum());
				dto.setStatus(userData.get().getStatus());
				userData.get().getUserRoles().forEach(obj->{
					dto.setRole(obj.getRoleName());
				});
				
				apiResponseDto.setData(dto);
				apiResponseDto.setMessage(ErrConstatns.SUCCESS);
			}else{
				
				apiResponseDto.setMessage("FAIL");
			}

			
			
		} catch (Exception e) {

			apiResponseDto.setMessage("FAIL");
		}

		return apiResponseDto;
	}

	@Override
	public ApiResponseDto saveUserDataById(long loginId, UserDto userDto, String userName) {
		
		ApiResponseDto apiResponseDto =new ApiResponseDto();
		try{
			
			Optional<UserEntity> userData=userRepo.findById(loginId);
			userData.get().setPassword(userDto.getPassword());
			userData.get().setEmail(userDto.getEmail());
			userData.get().setEmployeeId(userDto.getEmployeeId());
			userData.get().setFirstName(userDto.getEmployeeName());
			userData.get().setMobileNum(userDto.getMobileNo());
			userData.get().setStatus(userDto.getStatus());
			userData.get().setLastModifiedDate(new Date());
			userRepo.save(userData.get());	
			
			apiResponseDto.setMessage(ErrConstatns.SUCCESS);
		}catch(Exception e){
			
			apiResponseDto.setMessage(ErrConstatns.FAIL);
			System.out.println(e);
		}
		
		
		return apiResponseDto;
	}

	@Override
	public ApiResponseDto getAllRole(String userName) {
		
		ApiResponseDto apiResponseDto=new ApiResponseDto();
		
		List<String> list=userRoleRepo.findRoleName(userName);
		
		apiResponseDto.setData(list);
		
		
		return apiResponseDto;
	}

	@Override
	public ApiResponseDto findUserName(String userName) {
		
		ApiResponseDto apiResponseDto=new ApiResponseDto();
		
	Optional<UserEntity> user=userRepo.findByUsername(userName);
		
		
		apiResponseDto.setData(user.get().getUsername());
		
		return apiResponseDto;
	}

	@Override
	public ApiResponseDto searchByUserName(String userName) {
		
//		ApiResponseDto apiResponseDto=new ApiResponseDto();
//		
//      List<String> user=userRepo.findByUserName(userName);
//		
//		apiResponseDto.setData(user);
		
		ApiResponseDto<List<UserEntityDto>> apiResponseDto =new ApiResponseDto<List<UserEntityDto>>();
		try{
			SqlParameterSource parameters = new MapSqlParameterSource()
					
					.addValue("userName",userName);
					
					List<UserEntityDto> dto=cdpAppNamedParameterJdbcTemplate.query(QueryString.GETUSERNAME, parameters,new CimsUserMapper());
					apiResponseDto.setMessage("SUCCESS");
					apiResponseDto.setData(dto);
		}
		catch(Exception e){
			apiResponseDto.setMessage("FAIL");
			System.out.println(e);
		}
		
		return apiResponseDto;
	}

	

}
