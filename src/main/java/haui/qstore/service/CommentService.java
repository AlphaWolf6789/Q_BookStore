package haui.qstore.service;

import java.util.List;

import haui.qstore.entity.Comment;
import haui.qstore.model.CommentModel;

public interface CommentService {

	List<Comment> getListCommentByProductId(Integer id);

	CommentModel createComment(CommentModel commentModel);

	List<Comment> getListCommentPending();

	Comment getCommentByCommentId(Integer id);

	void approveComment(Integer id);

	void delete(Integer id);

	List<Comment> getListCommentChecked();

	int getCountCommentByProductNameSearch(String nameSearch);

	int getAllStarCommentByProductNameSearch(String nameSearch);

}
