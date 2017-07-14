import com.google.copybara.util.console.Message;
        .matchesNext(MessageType.PROGRESS, "Git Destination: Fetching: file:.* master")
        .matchesNext(MessageType.WARNING, "Git Destination: 'master' doesn't exist in 'file://.*")
    thrown.expect(ValidationException.class);
    processWithBaseline(newWriter(), ref, firstCommit);