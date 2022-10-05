package packmvn.util;

import packmvn.persistencia.EditoraDao;

public class TesteCon {
    public static void main(String[] args) {
        EditoraDao eDao = new EditoraDao();
        System.out.println(eDao.listar(10, 0));
    }
}
