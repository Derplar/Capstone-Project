# Capstone-Project
Sait 2020 Capstone Project-Restaurant Website

Install git bash command console.
https://git-scm.com/downloads

Default/recommended options are fine for everything.

Open a new folder in your computer.  This is where the project will live.

Open git bash.

Navigate to the folder.

Type 'git init' into the console.  This will create a new git repository.

Type git clone <<REPOSITORY LINK HERE>>

This will copy the entire repository into your folder.



Should you ever want to make a change, please create a new branch with your changes and upload it to that branch.
When it is done it'll be merged into the main branch.

git checkout -b <<BRANCH NAME>>

git push --set-upstream origin <<BRANCH NAME>>


To do a normal push, these commands will get you started on putting things onto the repository.

git add *    (You are free to individually add the items if you want)

git commit -m "This is a message to detail exactly what is different about that commit"

git push     (This pushes the changes you made to whatever branch)


INSTALLING THE NODE JS

install node.js
https://nodejs.org/en/

The default for each option should be fine.

Navigate to the repository location in your computer, go into reactapp/reactapp/src and copy all contents into the srcHolder, then delete all files in reactapp/reactapp/

Open up the command line terminal and navigate back one directory, back to reactapp/

then type in the command

npx create-react-app reactapp

After it's done installing, go into the reactapp folder, so you're in reactapp/reactapp

npm add axios

This will install all necessary files to your local machine.  These files will not be pushed

Then delete everything in reactapp/reactapp/src and replace the contents with the srcHolder contents

That's it!
