package Demos.Genericity_demo;

import Demos.Array_demo.Student;

public class Genericity_interface implements Data<Student> {

    @Override
    public void add(Student student) {

    }

    @Override
    public void delete(int id) {

    }
}

interface Data<E> {
    void add(E e);

    void delete(int id);
}
