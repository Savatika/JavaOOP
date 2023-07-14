package Seminar.Seminar5.notebook;

import Seminar.Seminar5.notebook.controller.UserController;
import Seminar.Seminar5.notebook.dao.impl.FileOperation;
import Seminar.Seminar5.notebook.model.User;
import Seminar.Seminar5.notebook.repository.GBRepository;
import Seminar.Seminar5.notebook.repository.impl.UserRepository;
import Seminar.Seminar5.notebook.view.UserView;

import static Seminar.Seminar5.notebook.util.DBConnector.DB_PATH;
import static Seminar.Seminar5.notebook.util.DBConnector.createDB;

public class Main {
    public static void main(String[] args) {
        createDB();
        FileOperation fileOperation = new FileOperation(DB_PATH);
        GBRepository<User, Long> repository = new UserRepository(fileOperation);
        UserController controller = new UserController(repository);
        UserView view = new UserView(controller);
        view.run();
    }
}
