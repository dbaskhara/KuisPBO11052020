public class MVC{
    ViewMain viewMain = new ViewMain();
    ViewTest viewTest = new ViewTest();
    Model model = new Model();
    Controller controller = new Controller(model,viewMain,viewTest);
}
