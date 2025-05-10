Command Line GUI (CliGui) project includes a command line arguments parser library for constructing .NET console app with complex arguments. This is a migration from [Command Line GUI](https://github.com/zijianhuang/commandlinegui) (commandlinegui) which was developed for .NET Framework and WinForms.

You define a data model class decorated with some attributes for represeting arguments. The core library will parse the commaline arguments and populate the Plain Old CLR Object which is the router of the functionality of your command line program. And the Core library may also generates CLI help page.

Command Line GUI exe is a host program that generates GUI for existing command line programs. .NET command line programs constructed through the core library could become a plugin of Command Line GUI and have the GUI generated.

You may use the core library to wrap existing command line programs like Robocopy, and the wrapper may become a plugin, thus a native command line program could easily have a GUI. This project includes a primary plugin for Robocopy, which reassembles Better Robocopy GUI.

## Roapmap

1. CLI with many complex parameters. Done.
1. Cross platform GUI based on the data models of parameters.

## Features (WIP)

* Generate GUI controls for editing parameters and options.
* Provide a text editor to edit command line arguments directly, and reflect changes back to the property grid, and vice-versa.
* Provide immediate hints to an option highlighted in the property grid or in the text editor.
* Support rules of inclusion, exclusion and combination among options.
* Command line programs utilizing Plossum library may get GUI without the need for further programming.

## References

* [Get the Best of Both Worlds: Command Line and GUI](https://www.codeproject.com/Articles/649950/Get-the-Best-of-Both-Worlds-Command-Line-and-GUI) / [Local Copy](Docs/Articles/Get%20the%20Best%20of%20Both%20Worlds_%20Command%20Line%20and%20GUI%20-%20CodeProject.html)
