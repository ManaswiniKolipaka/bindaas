package edu.emory.cci.bindaas.core.jwt;

import java.util.Date;

import edu.emory.cci.bindaas.core.model.hibernate.HistoryLog.ActivityType;
import edu.emory.cci.bindaas.core.model.hibernate.UserRequest.Stage;
import edu.emory.cci.bindaas.security.api.BindaasUser;

public interface IJWTManager {

	public String generateJWT(BindaasUser bindaasUser , Date dateExpires, String initiatedBy ,String comments , ActivityType activityType , boolean throwErrorIfAlreadyExists) throws JWTManagerException;
	public String modifyJWT(Long id , Stage stage , Date dateExpires ,String initiatedBy , String comments , ActivityType activityType ) throws JWTManagerException;
	public BindaasUser lookupUser(String jwt) throws JWTManagerException;
//	public APIKey createShortLivedAPIKey(BindaasUser bindaasUser , int lifetime , String applicationId) throws APIKeyManagerException;
//	public Integer revokeAPIKey(BindaasUser bindaasUser,String initiatedBy ,String comments , ActivityType activityType) throws APIKeyManagerException;
//	public Integer revokeAPIKey(String apiKey,String initiatedBy ,String comments , ActivityType activityType) throws APIKeyManagerException;
//	public List<UserRequest> listAPIKeys() throws APIKeyManagerException;
//	public Integer purgeExpiredKeys() throws APIKeyManagerException;
//	public APIKey lookupAPIKeyByUsername(String username) throws APIKeyManagerException;
}
