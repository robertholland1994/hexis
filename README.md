# Hexis

Hexis is a systems-oriented Java project focused on binary, hexadecimal, and low-level data representation.

The current application analyses decimal, binary, hexadecimal, signed byte, nibble, and RGB colour values through a structured console utility built while studying *Big Java 4e*.

Long-term, Hexis is intended to evolve into a fully fledged hex editor and text editor inspired by tools such as Vim, with a strong focus on:

- binary inspection
- hexadecimal analysis
- reverse engineering workflows
- file structure exploration
- low-level systems tooling

The project is being developed incrementally from first principles, with an emphasis on understanding how software works internally rather than relying heavily on external frameworks or libraries.

---

# Current Features

- Decimal, binary, and hexadecimal analysis
- Signed and unsigned byte interpretation
- Nibble analysis
- Manual hexadecimal formatting
- RGB hexadecimal colour formatting
- Structured terminal-style report output

---

# Example Output

```text
==================================================
                HEXIS v0.0.1
         Number Representation Lab
==================================================

Enter a byte value (0 - 255): 173

============= REPRESENTATIONS =============

Binary               : 10101101
Hex (Java)           : AD
Hex (Manual)         : AD

============== BYTE ANALYSIS ==============

Unsigned Byte        : 173
Signed Byte          : -83

High Nibble          : 10
Low Nibble           : 13
```

---

# Roadmap

## v0.0.2

- Repeated execution loop
- User-entered RGB values
- Binary padding to full 8-bit output
- Improved console formatting
- Hexadecimal lookup tables

## v0.0.3

- Decimal/hex/binary conversion tables
- Batch value analysis mode
- ASCII character representation
- Configurable output sections
- Improved formatter architecture

## v0.0.4

- Introduction of file handling
- Read raw bytes from files
- Display hexadecimal byte output
- Display ASCII alongside hexadecimal
- Offset/address column support

## v0.0.5

First true binary inspection release featuring:

- Hex dump viewer
- File signature detection
- Structured byte grouping
- Binary inspection tooling
- Magic number analysis
- Basic reverse engineering workflows
- Initial parser experimentation

---

# Long-Term Vision

Hexis is intended to gradually evolve into a serious low-level inspection and editing environment for:

- binary analysis
- reverse engineering
- file format research
- media container exploration
- systems programming experimentation

The project prioritises understanding and implementation depth over rapid development speed.