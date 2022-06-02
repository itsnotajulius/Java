# JavaFX Notes

Def:

> Designed with MVC, Model-View-Controller.

> Pattern that keeps the model and view separate. (Code and UI separate)

- Controller is the glue between the model and the view.

- Model is the data.

- View is the user interface. UI

<br/>

<br/>

Extras:
Application:

- Main class must extend Application.

<br/>
<br/>

---

## APPLICATIONS:

Def:
Application class from which JavaFX applications extend.

Life-cycle

```
The entry point for JavaFX applications is the Application class. The JavaFX runtime does the following, in order, whenever an application is launched:
Constructs an instance of the specified Application class
Calls the init() method
Calls the start(javafx.stage.Stage) method
Waits for the application to finish, which happens when either of the following occur:
the application calls Platform.exit()
the last window has been closed and the implicitExit attribute on Platform is true
Calls the stop() method
```

Note that the start method is abstract and must be overridden. The init and stop methods have concrete implementations that do nothing.

Calling Platform.exit() is the preferred way to explicitly terminate a JavaFX Application. Directly calling System.exit(int) is an acceptable alternative, but doesn't allow the Application stop() method to run.

A JavaFX Application should not attempt to use JavaFX after the FX toolkit has terminated or from a ShutdownHook, that is, after the stop() method returns or System.exit(int) is called.
