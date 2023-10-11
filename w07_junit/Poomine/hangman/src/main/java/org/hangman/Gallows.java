package org.hangman;

public class Gallows implements Draw{
    @Override
    public String draw(int num){
        String image = "";
        switch(num) {
            case 0:
                image+="              \n";
                image+="              \n";
                image+="              \n";
                image+="              \n";
                image+="              \n";
                image+="_/¯¯¯------/¯¯¯¯¯¯¯¯¯¯¯¯¯\\-----\\_____";
                break;
            case 1:
                image+="              \n";
                image+="              \n";
                image+="              \n";
                image+="              |\n";
                image+="              |\n";
                image+="_/¯¯¯------/¯¯¯¯¯¯¯¯¯¯¯¯¯\\-----\\_____";
                break;
            case 2:
                image+="              \n";
                image+="              |\n";
                image+="              |\n";
                image+="              |\n";
                image+="              |\n";
                image+="_/¯¯¯------/¯¯¯¯¯¯¯¯¯¯¯¯¯\\-----\\_____";
                break;
            case 3:
                image+="              _\n";
                image+="              |\n";
                image+="              |\n";
                image+="              |\n";
                image+="              |\n";
                image+="_/¯¯¯------/¯¯¯¯¯¯¯¯¯¯¯¯¯\\-----\\_____";
                break;
            case 4:
                image+="              __\n";
                image+="              |\n";
                image+="              |\n";
                image+="              |\n";
                image+="              |\n";
                image+="_/¯¯¯------/¯¯¯¯¯¯¯¯¯¯¯¯¯\\-----\\_____";
                break;
            case 5:
                image+="              ___\n";
                image+="              |\n";
                image+="              |\n";
                image+="              |\n";
                image+="              |\n";
                image+="_/¯¯¯------/¯¯¯¯¯¯¯¯¯¯¯¯¯\\-----\\_____";
                break;
            case 6:
                image+="              _____\n";
                image+="              |\n";
                image+="              |\n";
                image+="              |\n";
                image+="              |\n";
                image+="_/¯¯¯------/¯¯¯¯¯¯¯¯¯¯¯¯¯\\-----\\_____";
                break;
            case 7:
                image+="              _______\n";
                image+="              |      |\n";
                image+="              |\n";
                image+="              |\n";
                image+="              |\n";
                image+="_/¯¯¯------/¯¯¯¯¯¯¯¯¯¯¯¯¯\\-----\\_____";
                break;
            case 8: 
                image+="              _______\n";
                image+="              |      |\n";
                image+="              |      Q\n";
                image+="              |    --T--\n";
                image+="              |     | |\n";
                image+="_/¯¯¯------/¯¯¯¯¯¯¯¯¯¯¯¯¯\\-----\\_____";
                break;
        }
        return image;
    }
}
