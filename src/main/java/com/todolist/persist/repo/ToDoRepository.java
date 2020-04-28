package com.todolist.persist.repo;/*
 *@created 28/04/2020
 *@author timashvayko9
 */

import com.todolist.persist.entity.ToDo;
import com.todolist.persist.entity.User;
import com.todolist.repr.ToDoRepr;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ToDoRepository extends CrudRepository<ToDo, Long> {

    @Query("select new com.todolist.repr.ToDoRepr(t) from ToDo  t " +
            "where t.user.id = :userId")
    List<ToDoRepr> findToDosByUserId(@Param("userId") Long userId);
}
