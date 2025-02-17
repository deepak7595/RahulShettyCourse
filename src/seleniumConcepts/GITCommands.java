package seleniumConcepts;

import org.openqa.selenium.bidi.script.Message;

public class GITCommands {

	public static void main(String[] args) {
		
		// Basic git commands
		//https://confluence.atlassian.com/bitbucketserver/basic-git-commands-776639767.html

//		or create a new repository on the command line
//		echo "# GitDemo" >> README.md
//		git init
//		git add README.md
//		git commit -m "first commit"
//		git branch -M main
//		git remote add origin https://github.com/deepak7595/GitDemo.git
//		git push -u origin main
//		
//		
//		
//		or push an existing repository from the command line
//		git remote add origin https://github.com/deepak7595/GitDemo.git
//		git branch -M main
//		git push -u origin main
		
		
		
		
		
		Steps
		
		-> to let git know, who are we 
		
		
		1. C:\Users\DeepakVaithylingam>git config --global user.name "Deepak"

		2. C:\Users\DeepakVaithylingam>git config --global user.email "johndeepak444@gmail.com"
		
		//create one folder and specify it 
		3. C:\Users\DeepakVaithylingam>cd SampleGit
		
		4. C:\Users\DeepakVaithylingam\SampleGit>git init ->initialize git repository
		
		//Initialized empty Git repository in C:/Users/DeepakVaithylingam/SampleGit/.git/ -> this will be returned from terminal
		
		we should commit the code first, then only we able to push the code. first add Staging -> then commit 
		
		5. git add * -> * means all files, if any specific file, then we have to give the path 
		
		6. git status -> gives the newly added files to Staging
		
		7. C:\Users\DeepakVaithylingam\SampleGit>git commit -m "first message"  -> m stands for Message. Message should be mandatory
		
		8. git remote add origin https://github.com/deepak7595/GitDemo.git -> need to specify the url, from our remote (link from github)
			
			now the connection is made to remote repository.
			
		9. git push origin master -> push all codes to master. but we should push the code to master branch in real time ..add. not directly to master
		
		
		10. To clone any fresh repository (for the first time only, one we clone the repository, we use only pull command.) pull gives the newly added codes.
		  git clone https://github.com/deepak7595/GitDemo.git  -> need to specify the repository 
			  
			  this will give one folder, in the specified path, we can see the folder name in the cmd line.
			  
			  means we clone all the existing code from repro. 
			  
			  
			  Need to import the folder into eclipse.
			  Import -> general -> Existing project into workspace -> next ->Browse -> select the cloned folder - ok -> finish
			  
	  11. if we made any changes in the clone items. and if we decided to push the code to repro.
	  we have to specify the folder path first in cmd line.
	  
	  cd ..
	  cd C:users/dvaithylingam/gitDemo 
	  
	  hit enter, then we have to say,
	  
	 12.   git status
	  
	  This will show the updated or modified lines 
	  displayed in red
	  
	  and 
	  
	 13. git add *
	 
	 this will add the updated lines to staging 
	 
	 14. git status
	 
	 this will show the lines in green, which means we added into staging
		
	15. git commit -m "own message"
	we have successfully committed, but not pushed to repository
	
	16. since we already mentioned the origin, we no need to specify this ("git remote add origin https://github.com/deepak7595/GitDemo.git")
	we directly go with push commands
	
	git push origin master
	
	******  Till this we have push our code to the repositiry and cloned the copy of the repository for the first time ***********
	
	***** Now, we do pull the code from repro, before we start our work in office ****  
	we should pull the latest code everytime before we start to work. 
	
	
	17. we have to specify, in which path we need to have the updated code. {work folder}
	
	cd foldername {ex. cd gitdemo}
	
	18. git pull origin master
	This will get all the update lines from repro, and will be updated in our folder. 
	
	and we can work on this, and at the end. we have to merge our code to repro, to do so.
	
	19. git status
	this will show the lines of code that we changed in red.
	
	20. git add *
	this will add all the latest updated lines. if we specify the file name, then that particular change, will be updated in repro.
	
	21. git commit -m "New chnages"
	
	22. git push origin master
	
	
	
	*********************  Branching **********************
	
	
	
	1-> git checkout -b branchName  {if we say git checkout branchName-> then we able to switch one branch to another branch} 
	-b is mandatory for create new branch.
	
	this comment will create new branch with specified name.
	This will replicate the masteR branch, we have to wrk on these, once we confirm, theres is nothing has broken. we have to merge the code to master.
	
	
	2-> git branch
	This will tell which branch we are in currently 
	
	3-> git status 
	show the change if we made
	
	4-> git add *
	will add the code to staging
	
	5-> git commit -m "first commit"
	code is ready for commit
	
	6-> git push origin branchNAme
	for created branch. 
	
	***************** merging the branch into master ***********************
	
	1-> switch to master first
	git checkout master
	
	2-> git pull origin master
	
	3-> git merge develop 
	This specified branch will be merged to the current focused branch.
	here, we have switched from develop to master. then master is current branch. if we push the develop code, then it will merge to the current focused branch
	
	
	
	
	**************** Git Conflicts ***************
	
	if conflicts occurs, just check the head and tails part. 
	head shows the current focused repro.
	once issue resolved, and remove the head and tails and lines..
	save your changes.
	commit your code. to respective branch again.
	
	
	
	To switch from one branch to another branch through eclipse 	
	right click the project-> Team -> switch to ->Select branch
		
		
	}

}
