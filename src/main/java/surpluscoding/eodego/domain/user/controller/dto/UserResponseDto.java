package surpluscoding.eodego.domain.user.controller.dto;

import surpluscoding.eodego.domain.user.domain.User;

public record UserResponseDto (
        Long userId,
        String name,
        String email,
        String place,
        Long howLong,
        String what
) {
    public UserResponseDto(User user) {
        this(
                user.getId(),
                user.getName(),
                user.getEmail(),
                user.getPlace(),
                user.getHowLong(),
                user.getWhat()
        );
    }
}
