package lab78;
import java.util.ArrayList;
import java.io.*;
public class labaa {
    public static void main(String[] args) {
        ArrayList<String> FIO = new ArrayList<String>();
        String[] fio = new String[7];
        FIO.add("Иванов Семен Семеныч");
        FIO.add("Маркин Кислый Грибоедович");
        FIO.add("Жириновский Лев Львиный");
        FIO.add("Путкин Путяга Петросович");
        FIO.add(1,"Новичок Неудачник Третий");
        FIO.add("Звонков Убивец Телефоний");
        System.out.println(FIO.get(1));
        FIO.remove("Молодец Политик Фелантропович");
        for(int i = 0;i<FIO.size();i++)System.out.println(FIO.get(i));
        System.out.println("////////////////////////");
        Object[] fiol = FIO.toArray();
        for(Object count : fiol){

            System.out.println(count);
        }
        System.out.println("////////////////////////");
        try{
            FileWriter writer = new FileWriter("C:\\Users\\Валерий\\IdeaProjects\\lab12.mogunov\\src\\lab78\\pismo.txt", true);

            // запись всей строки
            writer.append("\n");
            writer.append("Приобрести:");
            String text = "Порошок,Веревку,мыло-душистое";
            writer.write(text);
            // запись по символам
            writer.append('.');
            writer.append('\n');
            writer.append("Расчет окончен.");
            writer.append("\n");
            writer.write("Ну и бумагу с ручкой");


            writer.flush();
            FileReader reader = new FileReader("C:\\Users\\Валерий\\IdeaProjects\\lab12.mogunov\\src\\lab78\\pismo.txt");
            System.out.println("////////////////////////");
            // читаемпосимвольно
            int c;
            while((c=reader.read())!=-1){

                //System.out.print(" c= "+c);// Если добавить данну строчку мы увидим Unicode символов
                System.out.print((char)c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
