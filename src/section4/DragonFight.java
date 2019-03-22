package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	// 1. Create a main method and put all of the code below inside of it
	public static void main(String[] args) {
		
		ImageIcon dragon = new ImageIcon("src/section4/dragonPicture.jpg");		
		Random gen = new Random();
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);
		// 2. Create a variable called "playerHealth" to store your health (set it equal to 100)
	    int PlayerHP = 100;
		// 3. Create a variable called "dragonHealth" to store the dragon's health (set it equal to 100)
		int DragonHP = 100;
		// 4. Create a variable to hold the damage the player's attack does each round
		int Dmg = 0;
		// 5. Create a variable to hold the damage the dragon's attack does each round
		int DragDmg;
		int DMG;
		int ExDmg = 0;
		int Heal;
		// 6.  Delete the slashes at the beginning of the next line.  
		while(PlayerHP>0 && DragonHP>0) {    //this line of code keeps the battle going until someone's health reaches 0 
		
		// 7. Add a closing mustache at the very bottom of this program (since we just added an opening mustache on the previous step).
		
		// 8. Ask the player in a pop-up if they want to attack the dragon with a yell or a kick
		String OP = JOptionPane.showInputDialog("yell / kick / heal (do not try to type any other words)");
		// 9. If they typed in "yell":
		
			//-- Find a random number between 0 and 10 and store it in dragonDamage
			if(OP.equals("yell")) {
				Dmg = Dmg + gen.nextInt(26);
				JOptionPane.showConfirmDialog(null, "you have "+Dmg+" additonal attack!");
			}
			//-- Subtract that number from the dragon's health variable 
			
		// 10. If they typed in "kick":
		
			//-- Find a random number between 0 and 25 and store it in dragonDamage
			if(OP.equals("kick")) {
				DMG = gen.nextInt(26);
				DragonHP = DragonHP-(DMG+Dmg);
				JOptionPane.showConfirmDialog(null, "The dragon took "+DMG+"+"+Dmg+" damage!");
			}
			//-- Subtract that number from the dragon's health variable
		if(OP.equals("sleep")) {
			JOptionPane.showConfirmDialog(null, "The dragon assulted you while you are taking your nap(lol)");
			ExDmg = gen.nextInt(11);
		}
		if(OP.equals("suicide")) {
			JOptionPane.showConfirmDialog(null, "you commited suicide.");
				ExDmg= 999999999;
		}
		if(OP.equals("heal")) {
			Heal = gen.nextInt(31);
			PlayerHP = PlayerHP + Heal;
			JOptionPane.showConfirmDialog(null, "you healed yourself, you gained "+Heal+" HP!");
		}
		if(OP.equals("any other words")) {
			Heal = 299 + gen.nextInt(9999);
			PlayerHP = PlayerHP + Heal;
			JOptionPane.showConfirmDialog(null, "you got 200 iq. You gained "+Heal+" HP");
		}
			
		
		// 11.  Find a random number between 0 and 35 and store it in playerDamage
		DragDmg = gen.nextInt(36);
		// 12. Subtract this number from the player's health
		PlayerHP = PlayerHP-DragDmg-ExDmg;
		JOptionPane.showConfirmDialog(null, "You took "+(DragDmg+ExDmg)+" damage!");
		
		if(PlayerHP > 200) {
			JOptionPane.showConfirmDialog(null, "Dragon; 'NANI?'");
		}
		// 13. If the user's health is less than or equal to 0
		if(DragonHP<= 0) {
			//-- Tell the user that they lost
			JOptionPane.showConfirmDialog(null, "YOU WON! THE DRAGON GOT OOFED!");
		}
		// 14. Else if the dragon's health is less than or equal to 0
		else if(PlayerHP<=0) {
			//-- Tell the user that the dragon is dead and they took a ton of gold!
			JOptionPane.showConfirmDialog(null, "YOU DIED! STAY DETERMINED!");
	   //  15.  Else
		}
		else {
			JOptionPane.showConfirmDialog(null, "your hp :"+PlayerHP+"/100        dragon hp:"+DragonHP+"/100");
		}
			//-- Pop up a message that tells the their current health and the dragon's currently health (Bonus: Also display the amount of health that was lost for each player this round)
		 ExDmg = 0;
		}
	}
}
