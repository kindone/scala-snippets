package standalone

import java.sql._


object H2 extends App
{
	import org.h2.Driver
	//Class.forName("org.h2.Driver")
	val conn:Connection = DriverManager.getConnection("jdbc:h2:~/test")
	conn.close();

}

// vim: set ts=4 sw=4 et:
