package com.example.ecommerce.service.serviceImpl;

import com.example.ecommerce.dto.LoginRequestDto;
import com.example.ecommerce.dto.LoginResponseDto;
import com.example.ecommerce.dto.RegistrationRequestDto;
import com.example.ecommerce.dto.RegistrationResponseDto;
import com.example.ecommerce.entity.User;
import com.example.ecommerce.repository.UserRepository;
import com.example.ecommerce.service.RegistrationService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author meghna.bajoria
 * @since 17/03/21 12:11 PM
 **/
@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public RegistrationResponseDto insertDataIntoUser(RegistrationRequestDto registrationRequestDto) {

        User user = new User();
        BeanUtils.copyProperties(registrationRequestDto,user);

        User savedUser = userRepository.save(user);
        RegistrationResponseDto registrationResponseDto = new RegistrationResponseDto();
        BeanUtils.copyProperties(savedUser,registrationResponseDto);
        registrationResponseDto.setMessage("Update SuccessFully");
        return registrationResponseDto;

    }

    @Override
    public LoginResponseDto loginUser(LoginRequestDto loginRequestDto) {
        String email = loginRequestDto.getEmailId();
        System.out.println(email);
//        Long userId = userRepository.findByEmailId(loginRequestDto.getEmailId());
        Long userId = userRepository.findByEmailId(email);
        System.out.println(userId+"----");
        LoginResponseDto loginResponseDto = new LoginResponseDto();
        if(userId!=null){
            loginResponseDto.setMessage("Login successful");
//            loginResponseDto.setUserId(userId);
        }
        else {
            loginResponseDto.setMessage("User not found");
        }
        return loginResponseDto;
    }
}
