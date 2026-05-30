# Hexis

Hexis is a systems-oriented Java project focused on binary, hexadecimal, and low-level data representation.

The long-term goal of the project is to evolve into a fully fledged hex editor and text editor inspired by tools such as Vim, with a strong focus on binary inspection, hexadecimal analysis, file structure exploration, and reverse engineering workflows.

The project is being developed incrementally from first principles as part of a long-term study of Java, computer science, and systems programming.

---

# Current Features

## Byte Analysis

Analyse byte values and display:

* Decimal representation
* Binary representation
* Hexadecimal representation
* Signed and unsigned byte interpretation
* Nibble analysis
* Manual hexadecimal conversion

## RGB Colour Analysis

* RGB colour modelling using object composition
* RGB hexadecimal colour generation
* Terminal colour highlighting using ANSI escape sequences

## Terminal Utilities

* Terminal foreground colour support
* Terminal background colour support
* Terminal reset functionality
* Terminal screen clearing

---

# Example Output

```text
==================================================
                HEXIS v0.0.2
          Terminal Colour Highlighting
==================================================

================ INPUT =================

Decimal Input        : 173

============= REPRESENTATIONS =============

Binary               : 10101101
Hex (Java)           : AD
Hex (Manual)         : AD

============== BYTE ANALYSIS ==============

Unsigned Byte        : 173
Signed Byte          : -83

High Nibble          : 10
Low Nibble           : 13

============== HEX BREAKDOWN ===============

Hex Digits           : 0123456789ABCDEF

High Hex Digit       : A
Low Hex Digit        : D

Combined Hex         : AD

================ END REPORT ================
```

---

# Version History

## v0.0.1 — Number Representation Lab

Initial release featuring:

* Decimal, binary, and hexadecimal analysis
* Signed byte interpretation
* Nibble analysis
* Manual hexadecimal formatting
* RGB hexadecimal colour generation
* Structured terminal reporting

## v0.0.2 — Terminal Colour Highlighting

Added:

* ANSI terminal colour support
* Dynamic foreground colour rendering
* RGB-driven terminal highlighting
* `TerminalStyle` class
* Terminal reset functionality
* Terminal screen clearing

This release introduced terminal styling so Hexis can visually represent RGB colour data directly in the console.

---

# Future Direction

Future versions of Hexis are expected to introduce:

* User-configurable RGB terminal colours
* File reading and binary inspection
* Hex dump generation
* File signature and magic number detection
* Binary structure exploration
* Reverse engineering utilities
* Hex viewing and editing
* Text editing capabilities
* Vim-inspired workflows

The project ultimately aims to become a practical environment for exploring, understanding, and editing binary data.