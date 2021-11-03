package oop1;

public class RecordPlayer extends Device{
    public RecordPlayer(Сarrier p1){
        this.pl_carr = p1;
    }
    
    public String toString(){
        return String.format("Player: Record");
    }

    public void play(Сarrier car) {
        if (!this.condition){
            System.out.println("Система выключена");
        } else if (!(car instanceof Record)){
            System.out.println("Данный накопитель информации не подходит к этой системе\n");
        } else {
            this.id = 0;
            this.pl_carr = car;
            System.out.println("Сейчас играет: \n" + this.pl_carr.song[this.id] + "\n");
            this.id++;
        }
    }
    
    public void play() {
        if (!this.condition){
            System.out.println("Система выключена");
        } else if (!(this.pl_carr instanceof Record)){
            System.out.println("Данный накопитель информации не подходит к этой системе\n");
        } else {
            if (this.id == this.pl_carr.song.length){
                this.id = 0;
            }
            System.out.println("Сейчас играет: \n" + this.pl_carr.song[this.id] + "\n");
            this.id++;
        }
    }
}
