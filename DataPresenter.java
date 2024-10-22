public class DataPresenter {
    private DataModel model;
    private ConsoleView view;

    public DataPresenter(DataModel model, ConsoleView view) {
        this.model = model;
        this.view = view;
    }

    public void updateData() {
        String newData = view.getInput("Enter new data: ");
        model.setData(newData);
        view.displayMessage("Data updated to: " + model.getData());
    }

    public void appendMoreData() {
        String moreData = view.getInput("Enter another piece of data: ");
        model.appendData(moreData);
        view.displayMessage("Final combined data: " + model.getData());
    }

    public void run() {
        boolean running = true;
        while (running) {
            view.displayData(model.getData());
            String input = view.getInput("To write new data type \"new\" or \"append\" to append data.\nTo to stop type anything else.");
            if (input.equalsIgnoreCase("new")){
                updateData();
            } else if (input.equalsIgnoreCase("append")){
                appendMoreData();
            } else {
                running = false;
            }
        }
    }
}
