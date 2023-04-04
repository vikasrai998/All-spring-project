package org.jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Ride {
	@Autowired
	@Qualifier("myBike")
	private Vehicle v;

	public void startRide() {
		v.start();
	}
}
