# Physics-Simulator-Java-Swing-Project
# Physics Simulator

An interactive, Java Swing-based desktop application designed as an educational tool to help students visualize and explore key physics concepts from the Ontario Grade 11 and Grade 12 curricula. 

Rather than relying solely on static textbook diagrams or abstract formulas, this simulator maps physical equations to real-time, animated UI panels. Users can adjust parameters using text fields and controls, making abstract concepts tangible and intuitive.

## 🚀 Features

* **Two-Level Navigation:** Clean, organized user flow starting with grade-level selection, followed by modular unit selections.
* **Interactive Parameters:** Dynamic control inputs (mass, velocity, force, field strength, etc.) that lay the groundwork for real-time physics manipulation.
* **Curriculum Aligned:** Targeted panels explicitly mapped to Ontario high school physics modules.

---

## 🗂️ Curriculum Modules Covered

| Grade 11 Physics | Grade 12 Physics |
| :--- | :--- |
| 🔹 **Kinematics** (Velocity, Acceleration, Time) | 🔸 **Circular Motion** (Radius, Speed) |
| 🔹 **Forces** (Mass, Applied Force) | 🔸 **Collisions & Momentum** (Elastic/Inelastic variables) |
| 🔹 **Energy & Work** (Mass, Height, Velocity) | 🔸 **Magnetic & Electric Fields** (Charge, Field Strength) |
| 🔹 **Waves & Sound** *(Planned)* | 🔸 **Modern Physics** *(Planned)* |

---

## 🛠️ Project Structure

The codebase utilizes a modular, object-oriented design using Java Swing's `CardLayout`-style swapping principles centered around a main `JFrame`.

* `Main.java` — Core entry point that invokes the UI thread safely via `SwingUtilities.invokeLater`.
* `MainFrame.java` — The primary window handling content panel swapping and global routing logic.
* `GradeSelectionPanel.java` — The initial landing page split between Grade 11 and Grade 12 workflows.
* `ConceptSelectionPanel.java` — A dynamic grid dashboard filtering modules based on the selected grade.
* `*Panel.java` (e.g., `KinematicsPanel`, `ForcesPanel`, etc.) — Individual modular simulation sandboxes featuring input fields, control triggers, and canvas zones.
