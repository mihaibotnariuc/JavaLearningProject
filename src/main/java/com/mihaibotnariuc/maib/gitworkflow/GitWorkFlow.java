package com.mihaibotnariuc.maib.gitworkflow;

public class GitWorkFlow {
    public static void main(String[] args) {
        String step1 =  "Execute git stash in the console";
                String step2 = "Perform checkout master - to move to the local master branch";
                        String step3 = "Execute git fetch command - to see if there are any changes on remote/origin";
        String step4 = "Execute git pull - this will download the latest changes from origin/master on local master";
        String step5 = "Execute git branch New_Branch_Name - as a result we redirected to the new branch";
        String step6 = "Perform the checkout New_Branch_Name changes in the solution";
        String step7 = "Add the task related changes in the solution";
        String step8 = "Execute git commit command rom the Intellij Idea to store the chnages at a local level - on the current branch";
        String step9 = "Execute git push from Intellij Idea panel - as a result, anew remote branch is created with origin/New_Branch_Name";
        String step10 = "Create a pull requiest from origini/New_Branch_Name into master";
        String step11 = "Add the pull Request details like name, description and reviewers";
        String step12 = "If we collect at least 1 approval then we can merge the changes and continue wit another task";
        String step13 ="Do not forget the locally you are still on the New_Branch_Name";
        String step14 = "If someone asks for changes then we should open the project and make sure that are on the same New_Branch_Name branch";
        String step15 = "Change the requested lines of code";
        String step16 = "Perform a git commit amend to change the latest changes";
        String step17 = "Perform git push to update the status";

        System.out.println(step1);
        System.out.println(step2);
        System.out.println(step3);
        System.out.println(step4);
        System.out.println(step5);
        System.out.println(step6);
        System.out.println(step7);
        System.out.println(step8);
        System.out.println(step9);
        System.out.println(step10);
        System.out.println(step11);
        System.out.println(step12);
        System.out.println(step13);
        System.out.println(step14);
        System.out.println(step15);
        System.out.println(step16);
        System.out.println(step17);

    }
}
