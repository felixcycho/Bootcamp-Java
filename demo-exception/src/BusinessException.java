public class BusinessException extends RuntimeException {
  private int code;

  public static BusinessException of(SysCode sysCode) {
    return new BusinessException(sysCode);
  }

    private BusinessException(SysCode sysCode) {            // to ensure cannot new, so as to control users' commands
    super(sysCode.getDesc());
    this.code = sysCode.getCode();
  }

  private BusinessException(int code, String message) {            // to ensure cannot new, so as to control users' commands
    super(message);
    this.code = code;
  }

  private BusinessException(String message) {
    super(message);
  }

  public int getCode() {
    return this.code;
  }

  public static void main(String[] args) {
  // public static void main(String[] args) throws BusinessException {
  //   new BusinessException(1, "Login Fail.");
  //   new BusinessException(99, "Login Fail!!!")
  //   new BusinessException(SysCode.LOGIN_FAIL);         // SysCode 用於 control users command.
  //   throw BusinessException.of(SysCode.LOGIN_FAIL);    // 一 throw, 就 BusinessException
    BusinessException.of(SysCode.LOGIN_FAIL);
  }
  

}
