package com.java24hours;

public class Root {
	
			public static void main(String[] args) {
				float stick = 0;
				float output = 0;
				float slew = 0;
				float oldstick = 0;
				float change = 0;
				float newstick = 0;
				int i = 0;
				for (i = 0; i<=50; i++)
				{

		if (stick != 0) {
			if (stick <= 2 && stick >= -2)
				output = 0;
			else
				output = stick;
		} else {
			output = stick;
		}
		change = java.lang.Math.abs(output) - java.lang.Math.abs(oldstick);
		if (output == 0) {
			newstick = 0;
		}
		else if (output >= 0)
		{
			if (change >= 5)
			{
				newstick = oldstick + (float) 5;
			}
			else if (change <= -5)
			{
				newstick = oldstick - (float) 5;
			}
			else newstick = output;
		}
		else if (output <= 0)
		{
			if (change >= 5)
			{
				newstick = oldstick - (float) 5;
			}
			else if (change <= -0.05)
			{
				newstick = oldstick + (float) 5;
			}
			else
				newstick = output;
		}
		else
			newstick = output;
		oldstick = newstick;
		System.out.println(stick + " , " + newstick);
		stick = stick - 4;
		if( stick < 0 && stick <= -100)
		{
			stick = -100;
		}
	}
}
}


