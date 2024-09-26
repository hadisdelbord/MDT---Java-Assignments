package assignment;

public class MathCalc {
	public static void main(String[] args) {
		
		double SunDiameter = 865000;
		double EarthDiameter = 7600;
		double SunVolume;
		double EarthVolume;
		double VolumeRate;
		
		SunVolume = (4.0 / 3.0) * Math.PI * Math.pow((SunDiameter/2), 3);
		EarthVolume = (4.0 / 3.0) * Math.PI * Math.pow((EarthDiameter/2), 3);
		VolumeRate = SunVolume / EarthVolume;

		
		System.out.printf(" The volume of Sun is %.2f \n The volume of Earth is %.2f \n The rate of volume Sun to volume Erarth is %.2f", SunVolume, EarthVolume, VolumeRate);

		
		
	}
}
