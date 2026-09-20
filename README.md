# No Creative Drift 26.3

A tiny client-side Fabric mod for Minecraft Java 26.3. When the player is
flying in Creative mode and releases all four horizontal movement keys, the
mod immediately sets horizontal velocity to zero. Vertical movement is left
unchanged.

## Installation

1. Install Fabric Loader 0.19.5 or newer for Minecraft 26.3.
2. Put `no-creative-drift-1.0.0.jar` in the Minecraft instance's `mods` folder.
3. Only the affected player's client needs the mod. Fabric API is not required.

## Build from source

Minecraft 26.3 mod development requires Java 25, Loom 1.17, and Gradle 9.6.
Run `gradle build` using Gradle 9.6 and Java 25. The remapped mod JAR will be
written to `build/libs`.

## Build online without installing Java or Gradle

Upload this project's contents to a GitHub repository. Open the repository's
Actions tab, select **Build mod**, and choose **Run workflow**. When the run
finishes, open it and download the `no-creative-drift-1.0.0` artifact. Unzip
that artifact to obtain the installable mod JAR.
