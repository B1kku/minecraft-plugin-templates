This project is intended as a barebones Java plugin template for PaperMC
- Nothing that is not specifically essential should be added here.
- Gradle should expand most paper-plugin.yml base variables since it shares most anyways.

### Setup
- Delete flake.nix and flake.lock if you're not using nix.
- Adjust the variables on build.gradle.kts to your own.
- Move the plugin entry class such that it is found under `group.projectName(as lowercase).projectName`.
