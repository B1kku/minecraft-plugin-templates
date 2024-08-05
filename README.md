This project is intended as a barebones Java plugin template for PaperMC
- Nothing that is not specifically essential should be added here.
- Gradle should expand most plugin.yml base variables since it shares most anyways.

There's also a kotlin template on a different branch.

### Setup
- Delete flake.nix and flake.lock if you're not using nix.

- Replace build.gradle variables to suit your needs, and move your project such that
your main file is on `src/main/java/your/group/name/projectname/ProjectName.java`.

- Change API version on plugin.yml and the paper repository (Not done by gradle yet).

- Replace the package and class name on your name file and it should be done.

No need to change anything else in plugin.yml since that's somewhat done from build.gradle

If I ever feel like it I might make different branches for more complete templates.
