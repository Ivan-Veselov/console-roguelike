# Console Roguelike Game

[![Build Status](https://travis-ci.org/Ivan-Veselov/console-roguelike.svg?branch=master)](https://travis-ci.org/Ivan-Veselov/console-roguelike)

<p align="center">
  <img src="https://github.com/Ivan-Veselov/console-roguelike/wiki/images/demo.gif">
</p>

This project was done as part of Software Design course in Saint Petersburg Academic University (Spring 2018). It is a simple [roguelike](https://en.wikipedia.org/wiki/Roguelike) console game written in Kotlin.

## Building

One can build sources with single command from project root directory (JDK is required):

```
./gradlew jar
```

## How to play

Use keyboard numpad digits (all but `5`) to move hero (`@`) in the game. `I` opens inventory, use arrows (up and down) to switch between items, `Enter` to apply highlighted item and `Esc` to exit inventory. `Esc` exits the game as well.
