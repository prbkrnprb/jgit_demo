package in.prabakaran.jgit;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;

import java.io.File;

public class Main {

    public static void main(String args[]) throws GitAPIException {
        Git git = Git.cloneRepository()
                .setURI("https://github.com/prbkrnprb/firmware.git")
                .setDirectory(new File("/Users/prabakaran/jgit repo"))
                .call();

        System.out.println("done");
    }
}
