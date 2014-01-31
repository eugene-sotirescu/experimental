package org.sonatype.mavenbook;
import org.apache.commons.lang3.StringUtils;
import org.sonatype.mavenbook.model.Profile;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String s = "Hello World!";
    	if (StringUtils.isNotEmpty(s)) {
    		System.out.println( s );
    	}
    	
    	Profile profile = new Profile();
    	profile.setLastName("john");
    	profile.setAge(34);
    	
    	System.out.println(profile);
    	Gson gson = new Gson();
    	String json = gson.toJson(profile);
    	System.out.println(json);
    }
}
