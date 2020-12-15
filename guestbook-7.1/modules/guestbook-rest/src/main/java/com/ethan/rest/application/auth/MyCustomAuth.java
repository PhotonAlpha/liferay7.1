package com.ethan.rest.application.auth;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.AuthException;
import com.liferay.portal.kernel.security.auth.Authenticator;
import com.liferay.portal.kernel.transaction.TransactionConfig;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;

import java.util.Map;

/*@Component(
    immediate = true, property = {"key=auth.pipeline.pre"},
    service = Authenticator.class
)*/
public class MyCustomAuth implements Authenticator {
  private final static Log log = LogFactoryUtil.getLog(MyCustomAuth.class);

  @Activate
  public void activate() {
   /* TransactionConfig.Factory<SecurityManager> factory = new IniSecurityManagerFactory(
        "classpath:CustomAuthenticatorSampleAuthenticator/userauth.ini");

    SecurityUtils.setSecurityManager(factory.getInstance());

    if (_log.isInfoEnabled()) {
      _log.info("activate");
    }*/
  }

  @Override
  public int authenticateByEmailAddress(long companyId, String emailAddress, String password, Map<String, String[]> headerMap, Map<String, String[]> parameterMap) throws AuthException {
    log.info(String.format("companyId:%d emailAddress:%d password:%d headerMap:%d parameterMap:%d", companyId, emailAddress, password, headerMap, parameterMap));
    return Authenticator.SUCCESS;
  }

  @Override
  public int authenticateByScreenName(long companyId, String screenName, String password, Map<String, String[]> headerMap, Map<String, String[]> parameterMap) throws AuthException {
    log.info(String.format("companyId:%d emailAddress:%d password:%d headerMap:%d parameterMap:%d", companyId, screenName, password, headerMap, parameterMap));
    return Authenticator.SUCCESS;
  }

  @Override
  public int authenticateByUserId(long companyId, long userId, String password, Map<String, String[]> headerMap, Map<String, String[]> parameterMap) throws AuthException {
    log.info(String.format("companyId:%d emailAddress:%d password:%d headerMap:%d parameterMap:%d", companyId, userId, password, headerMap, parameterMap));
    return Authenticator.SUCCESS;
  }
}
