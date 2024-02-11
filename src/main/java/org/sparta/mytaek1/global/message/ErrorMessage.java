package org.sparta.mytaek1.global.message;

public enum ErrorMessage {
    NOT_EXIST_TOKEN_ERROR_MESSAGE("토큰을 찾을 수 없습니다."),
    NOT_EXIST_USER_ERROR_MESSAGE("존재하지 않는 사용자입니다."),
    NOT_EXIST_EMAIL_ERROR_MESSAGE("존재하지 않는 이메일입니다."),
    NOT_EXIST_BROADCAST_ERROR_MESSAGE("존재하지 않는 방송입니다."),
    NOT_EXIST_PRODUCT_ERROR_MESSAGE("존재하지 않는 상품입니다."),
    NOT_EXIST_STOCK_ERROR_MESSAGE("재고가 없습니다."),
    INVALID_JWT_ERROR_MESSAGE("Invalid JWT signature, 유효하지 않는 JWT 서명 입니다."),
    EXPIRED_JWT_ERROR_MESSAGE("Expired JWT token, 만료된 JWT token 입니다."),
    UNSUPPORTED_JWT_ERROR_MESSAGE("Unsupported JWT token, 지원되지 않는 JWT 토큰 입니다."),
    EMPTY_JWT_ERROR_MESSAGE("JWT claims is empty, 잘못된 JWT 토큰 입니다."),
    PASSWORD_MISMATCH_ERROR_MESSAGE("로그인에 실패하였습니다."),
    AUTH_EXCEPTION_MESSAGE("로그인 해야 가능한 기능입니다."),
    DUPLICATED_USER__ERROR_MESSAGE("중복된 사용자가 존재합니다."),
    DUPLICATED_EMAIL_ERROR_MESSAGE("중복된 Email이 존재합니다."),
    EMAIL_FORMAT_ERROR_MESSAGE("올바른 이메일 형식이 아닙니다."),
    PASSWORD_VALIDATION_ERROR_MESSAGE("비밀번호는 최소 8자 이상, 15자 이하이며 알파벳 대소문자, 숫자, 특수문자로 구성되어야 합니다."),
    UPDATE_BOARD_AUTH_ERROR_MESSAGE("자신이 만든 보드만 수정할 수 있습니다."),
    DELETE_BOARD_AUTH_ERROR_MESSAGE("자신이 만든 보드만 삭제할 수 있습니다."),
    UPDATE_USER_AUTH_ERROR_MESSAGE("본인만 수정할 수 있습니다."),
    DELETE_USER_AUTH_ERROR_MESSAGE("본인만 삭제할 수 있습니다."),
    ID_MISMATCH_ERROR_MESSAGE("요청 게시판 ID가 컬럼이 속한 게시판 ID와 다릅니다."),
    LOCK_NOT_ACQUIRED_ERROR_MESSAGE("락을 획득하지 못했습니다. 잠시 후 다시 시도해주세요.");

    private final String errorMessage;

    ErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return "[ERROR] " + errorMessage;
    }
}
