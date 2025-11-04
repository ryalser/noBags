package practice_3;

public class GameSettings {


    static int maxPlayers = 2;
    final String gameName;
    int currentPlayers;

    GameSettings(String gameName, int currentPlayers){
        this.gameName = gameName;
        this.currentPlayers = currentPlayers;
    }


    //Установить maxPlayers
    public static int setMaxPlayers (int newMaxPlayers){
        if (newMaxPlayers <= 0){
            throw new IllegalArgumentException("Некорректно задано максимальное количество игроков!");
        }
        maxPlayers = newMaxPlayers;
        return maxPlayers;
    }

    public void addPlayer(){
        if(currentPlayers >= maxPlayers){
            throw new IllegalArgumentException("Недопустимое количество игроков!");
        }
         currentPlayers++;
    }

    public String printGameStatus(){
        return String.format("Игра: " + gameName + ", играют сейчас: " + currentPlayers + ", допустимое кол-во игроков: " + maxPlayers);
    }


    public static void main(String[] args) {
        GameSettings game1 = new GameSettings("Шашки", 2);
        GameSettings game2 = new GameSettings("Волейбол", 2);


        //Устанавливаем максимальное кол-во игроков
        GameSettings.setMaxPlayers(4);

        //Добавляем игрока
        game1.addPlayer();


        //Выводим информацию по игре
        System.out.println(game1.printGameStatus());




    }



}
