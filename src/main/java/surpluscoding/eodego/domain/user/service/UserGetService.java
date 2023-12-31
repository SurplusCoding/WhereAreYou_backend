package surpluscoding.eodego.domain.user.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import surpluscoding.eodego.domain.user.controller.dto.UserResponseDto;
import surpluscoding.eodego.domain.user.domain.User;
import surpluscoding.eodego.domain.user.repository.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserGetService {

    private final UserRepository userRepository;

    public User getUser() {
        Long id = getUserId();
        return userRepository.findById(id).orElseThrow();
    }

    public List<UserResponseDto> getUsers(List<Long> userIds) {
        return userRepository.findAllByIdIn(userIds).stream().map(UserResponseDto::new).toList();
    }

    public Long getUserId() {
        return Long.valueOf(SecurityContextHolder.getContext().getAuthentication().getName());
    }

    public String getUserName() {
        return getUser().getName();
    }

    public UserResponseDto get() {
        Long userId = getUserId();
        return new UserResponseDto(userRepository.findById(userId).orElseThrow());
    }
}
