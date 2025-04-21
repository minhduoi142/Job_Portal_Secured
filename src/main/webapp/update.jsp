<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-10 col-lg-8">
            <div class="card border-warning shadow-lg">
                <div class="card-header bg-warning text-white text-center fs-3 fw-semibold">
                    ✨ Update Job Information
                </div>
                <div class="card-body bg-light-subtle">
                    <form:form modelAttribute="job" action="/updatejob" method="post">

                        <div class="mb-3">
                            <label for="postId" class="form-label fw-semibold text-primary">Post ID</label>
                            <form:input path="postId" type="text" id="postId" cssClass="form-control bg-white border-primary" readonly="true" />
                        </div>

                        <div class="mb-3">
                            <label for="postProfile" class="form-label fw-semibold text-success">Job Title</label>
                            <form:input path="postProfile" type="text" id="postProfile" cssClass="form-control border-success bg-white" />
                        </div>

                        <div class="mb-3">
                            <label for="postDesc" class="form-label fw-semibold text-info">Job Description</label>
                            <form:textarea path="postDesc" id="postDesc" cssClass="form-control border-info bg-white" rows="3" />
                        </div>

                        <div class="mb-3">
                            <label for="reqExperience" class="form-label fw-semibold text-danger">Required Experience (Years)</label>
                            <form:input path="reqExperience" type="number" id="reqExperience" cssClass="form-control border-danger bg-white" />
                        </div>

                        <div class="mb-4">
                            <label for="postTechStack" class="form-label fw-semibold text-warning">Tech Stack</label>
                            <form:select path="postTechStack" items="${techOptions}" multiple="true" cssClass="form-select border-warning bg-white text-dark" />
                            <small class="form-text text-muted">Hold Ctrl (Cmd on Mac) to select multiple.</small>
                        </div>

                        <div class="text-center">
                            <button type="submit" class="btn btn-lg btn-warning px-5 py-2 fw-semibold">
                                <i class="fas fa-sync-alt me-2"></i>Update Job
                            </button>
                        </div>
                    </form:form>
                </div>
            </div>
        </div>
    </div>
</div>
