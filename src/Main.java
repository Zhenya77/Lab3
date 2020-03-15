public class Main {
    public static void main(String args[]){
        Place.loadLocation();
        //мы указываем координаты поверхностей, выделенных голубым, иначе объекту тупа не на чем стоять.
        //в 4 лабе это будет реализовано как Exception, здесь просто объект не появится на карте.
        Kenga kenga = new Kenga("Кенга", 6,7, 'K'); //четвертый парметр, говорит о том каким символом отмечается объект на карте.
        Roo roo = new Roo("Ру",2,7, 'R');
        Home home = new Home("Дом", CoordsOfPlaces.HOME);
        PitWithSand pit = new PitWithSand("Большая Яма С Песком", CoordsOfPlaces.PITWITHSAND);
        MouseHoles holes = new MouseHoles("Мышиные Норы", CoordsOfPlaces.MOUSEHOLES);
        Place.printLocationWithCharacters();
        kenga.spendTimeWith(roo, pit);
        roo.setName("Крошка Ру");
        roo.practiceJumping();//координата Ру поменялась, так как он прыгает в яме. Если выводить метод Place.printLocationWithCharacters() картинка будет меняться, просто спамить не хочется
        roo.learnHotToFallIn(holes);//координата Ру поменялась, так как он прыгает в нору
        roo.learnHotToEscapeOf(holes);//координата Ру поменялась, так как он выбирается из норы
        System.out.println(kenga.setAction("волновалась"));
        kenga.sayTo(roo);
        roo.setName("Ру");
        kenga.goToWith(roo, home);
        WinnieThePooh winnie = new WinnieThePooh("Винни Пух",26, 6,'W');
        Place.printLocationWithCharacters();
    }
}
