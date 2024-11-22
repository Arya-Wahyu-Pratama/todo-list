package todoapp.repositories;


import org.springframework.stereotype.Component;
import todoapp.entities.TodoList;

@Component
public interface TodoListRepository {
    TodoList[] getAll();

    void add(TodoList todolist);

    Boolean remove(Integer id);

    Boolean edit(TodoList todolist);
}
