package Main;

import java.util.ArrayList;

/**
 * Класс "База данных пользователи"
 */
public class DB_Users extends DateBase{


    /**
     * Конструктор, где базе данных присваивается имя и сразу две колонки для пользователей
     * @param name Название базы данных
     */
    public DB_Users(String name) {
        super(name);
        addCol(new String(), "Логин");
        addCol(new String(), "Пароль");
    }

    /**
     * Функция находит в БД по введеному логину и паролю пользователя
     * @param login логин
     * @param password пароль
     * @return идентификатор пользователя, если он найден и -1, если не найден
     */
    public int signUp(String login, String password){
        if (search(0, login) == search(1, password)) return search(0,login);
        else return -1;
    }

    /**
     * Добавление пользователя
     * @param login логин пользователя
     * @param password пароль пользователя
     */
    public void addUser(String login, String password){
        addRow();
        addRowValue(super.getId(),0,login);
        addRowValue(super.getId(),1,password);
    }
}

