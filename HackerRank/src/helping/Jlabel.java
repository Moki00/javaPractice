/**
 * 
 */
package helping;

public class Jlabel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	public void generateRandVars()
    {
        for (int i = 0; i < 10; i++)
        {
            randNumPanel[i] = new JPanel();
            randNumPanel[i].setBounds(generateRand(1100), generateRand(700), 50, 50);
            randNumPanel[i].setBackground(Color.BLACK);
            randNumPanel[i].setOpaque(false);
            
            randNum[i] = new JLabel();
            randNum[i].setText(generateRand(10) + "");
            randNum[i].setFont(new Font("Serif", Font.PLAIN, 30));
            randNum[i].setForeground(Color.RED);
            
            randNumPanel[i].add(randNum[i]);
            WindowForGame.add(randNumPanel[i]);
        }
        
        randLetterPanel = new JPanel();
        randLetterPanel.setBounds(generateRand(1100), generateRand(700), 50, 50);
        randLetterPanel.setBackground(Color.BLACK);
        randLetterPanel.setOpaque(false);
        
        randLetter = new JLabel();
        char randomLetter = (char) (rand.nextInt(26) + 'A');
        randLetter.setText(randomLetter + "");
        randLetter.setFont(new Font("Serif", Font.PLAIN, 30));
        randLetter.setForeground(Color.GREEN);
        
        randLetterPanel.add(randLetter);
        WindowForGame.add(randLetterPanel);
    }
}
