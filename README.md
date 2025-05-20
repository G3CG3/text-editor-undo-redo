# TextEditorUndoRedo

A simple Java console application demonstrating undo and redo functionality using `ArrayDeque`.

## Overview

This project simulates a basic text editor with the ability to type text, undo the last operation, and redo a previously undone operation. It uses two `ArrayDeque` instances to manage undo and redo stacks efficiently.

The `TextEditor` class provides the following methods:

- `type(String text)` – Appends new text.
- `undo()` – Reverts the last text change.
- `redo()` – Reapplies the last undone text change.
- `getText()` – Returns the current text.

The `TextEditorApp` main class demonstrates usage and outputs the state of the text after each operation.

## How to Run

1. Clone the repository and open it in your IDE (e.g., IntelliJ).
2. Compile the project.
3. Run the `TextEditorApp` class.
4. Observe the console output showing how text is modified, undone, and redone.

## Sample Output
Typed: Hello
Current Text: Hello

Typed: World
Current Text: Hello World

Undo performed.
Current Text: Hello

Redo performed.
Current Text: Hello World

## Concepts Demonstrated

- Stack-like behavior using `ArrayDeque`
- Undo/Redo operation logic
- Method encapsulation
- Java console input/output (optional for future enhancement)

## License

This project is licensed under the MIT License - see the LICENSE file for details.

---

Feel free to expand this project by adding:
- Delete functionality
- GUI (Swing/JavaFX)
- Persistent file saving/loading
- Support for formatting commands (like bold or italic)