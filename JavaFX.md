# JavaFX Notes

Def:

> Designed with MVC, Model-View-Controller.

> Pattern that keeps the model and view separate. (Code and UI separate)

- Controller is the glue between the model and the view.

- Model is the data.

- View is the user interface. UI

<br/>

<br/>

## Extras:

- Application:
  - Main class must extend Application.
- FXML
  - Flavour of XML
  - XML is a markup language.
- Understaning
  - Need a Stage for different scenes. We use root nodes(fxml) to build the scene.

<br/>
<br/>

---

## APPLICATIONS:

Def:
The entry point for JavaFX applications is the Application class. The JavaFX runtime does the following

Life-cycle

1. Constructs an instance of Application class
2. Calls the init() method
3. Calls start(javafx.stage.Stage) method
4. Waits for the application to finish:
   - the application calls Platform.exit()
   - the last window has been closed and the implicitExit attribute on Platform is true
5. Calls the stop() method

Note:

> Start method is abstract and must be overridden.

> The init and stop methods have concrete implementations that do nothing.

> Calling `Platform.exit()` is the preferred way to terminate Application. Calling `System.exit(int)` is acceptable, but `stop()` method doesn't run.

A JavaFX Application should not attempt to use JavaFX after the FX toolkit has terminated or from a ShutdownHook, that is, after the stop() method returns or System.exit(int) is called.

<br/>
<br/>

---

### Stage

<br/>

Def:

- Stage is the top-level container for a JavaFX application.
- Stage is the root of the scene graph.
- Aka `Main Window`

<br/>

Methods:

- Title:
  - Sets the title of the stage.
  - `setTitle(String)`
- Scene
  - Sets the scene for the stage.
  - `setScene(Scene)`
- Show
  - Shows the stage.
  - `show()`
- Close
  - Closes the stage.
  - `close()`
- Minimize
  - Minimizes the stage.
  - `setIconified(boolean)`
- Maximize
  - Maximizes the stage.
  - `setMaximized(boolean)`
- Full Screen
  - Enables full screen mode.
  - `setFullScreen(boolean)`
- Full Screen Exit Hint
  - Sets the full screen exit hint.
  - `setFullScreenExitHint(String)`

<br/>

---

## FXML

<br/>

- The name of the controller class.
  - fx:controller = "package.MyController"
  - In `<gridpane>`
