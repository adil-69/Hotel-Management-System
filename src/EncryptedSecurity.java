import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

class EncryptedSecurity{

    public static String hashPassword(String password) throws NoSuchAlgorithmException{
		MessageDigest md = MessageDigest.getInstance("SHA");
		md.update(password.getBytes());
		byte[] b = md.digest();
		StringBuilder sb = new StringBuilder();
		for (byte b1 : b){
			sb.append(Integer.toHexString(b1 & 0xff));
		}
		return sb.toString();
	}

}