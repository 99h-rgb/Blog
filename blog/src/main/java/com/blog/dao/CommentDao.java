package com.blog.dao;
//博客评论对应的数据库接口，定义了博客评论的查询、增加和删除
import com.blog.entity.Comment;
import java.util.List;
import java.util.Map;

public abstract interface CommentDao
{
  public abstract int add(Comment paramComment);
  
  public abstract int update(Comment paramComment);
  
  public abstract List<Comment> list(Map<String, Object> paramMap);
  
  public abstract Long getTotal(Map<String, Object> paramMap);
  
  public abstract Integer delete(Integer paramInteger);
}



/* Location:           D:\classes\

 * Qualified Name:     com.blog.dao.CommentDao

 * JD-Core Version:    0.7.0.1

 */