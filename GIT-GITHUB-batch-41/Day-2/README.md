# Day-2-git
### create a new repository on the command line
- echo "# Day-2-git" >> README.md
- git init
- git add README.md
- git commit -m "first commit"
- git branch -M main
- git remote add origin https://github.com/shakirmir/Day-2-git.git
- git push -u origin main

### push an existing repository from the command line

- git remote add origin https://github.com/shakirmir/Day-2-git.git
- git branch -M main [rename] [ in github main branch created but in local we get master by default]
- git push -u origin main

###
- git add * or git add .

### git setup for the first time on local machine /laptop
    - git config --global user.name shakirmir@gmail.com
    - git config --global name shakir
    - git config --list [ show the config name and config username]
### common git commands when pushing an existing repository from the command line
    - git init
    - git status
    - git add .
    - git commit -m "first commit"
    - git branch -M main [rename branch name]
    - git remote add origin https://github.com/shakirmir/Day-2-git.git
    - git push -u origin main
============================
### GIT Advanced commands
- git stash
- git rebase
- git squash 
    - multiple commits in one commit and raise a single PR before merging 
- git reset  commitid
- git reset filenamwe
- git fetch [ show the changes done not merge in local]
- git pull [ merge all the changes done in remote and local ]




