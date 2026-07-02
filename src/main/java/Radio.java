public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStationsCount;

    public Radio() {
        this.maxStationsCount = 10;
    }

    public Radio(int maxStationsCount) {
        this.maxStationsCount = maxStationsCount;
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0 || currentStation > maxStationsCount - 1) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0 || currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    // Методы для работы со станциями
    public void next() {
        if (currentStation == maxStationsCount - 1) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = maxStationsCount - 1;
        } else {
            currentStation--;
        }
    }

    // Методы для работы с громкостью
    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}