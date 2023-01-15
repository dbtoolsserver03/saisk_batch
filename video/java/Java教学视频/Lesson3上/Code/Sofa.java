interface Sittable
{
	void sit();
}
interface Lie
{
	void sleep();
}
/*interface Chair extends Sittable
{
}

interface Sofa extends Sittable,Lie
{
}*/
/*class Sofa implements Sittable,Lie
{
	public void sit()
	{
	}
	public void sleep()
	{
	}
}*/

interface HealthCare
{
	void massage();
}

class Chair implements Sittable
{
	public void sit(){};
}

class Sofa extends Chair implements Lie,HealthCare
{
	public void sleep(){};
	public void massage(){};
}
