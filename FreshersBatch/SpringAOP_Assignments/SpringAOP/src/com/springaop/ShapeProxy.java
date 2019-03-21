package com.springaop;

import com.springaop.aspect.LoggingAspect;

public class ShapeProxy extends Shape {

	public Circle getCircle() {
		
		new LoggingAspect().loggingAdvice();
		return super.getCircle();
	}
}
