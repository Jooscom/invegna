package kr.co.invegan.board.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.annotations.Param;

import kr.co.invegan.board.dto.FeedDTO;
import kr.co.invegan.board.dto.FeedListDTO;


public interface FeedDAO {
   
   
   void feedWrite(FeedDTO dto);

   void tagWrite(FeedDTO dto);


   void feedtagWrite(FeedDTO dto);


   
   
   void feedWritePhoto(@Param("postidx") int postidx, @Param("server_file_name") String server_file_name);

   ArrayList<FeedListDTO> list();

   ArrayList<FeedListDTO> detailList(int post_id);

   ArrayList<FeedListDTO> commentList(int post_id);



   void feedWriteComment(FeedListDTO dto);

   String findCommentUserNickName(int user_no);

   int findBoardUserno(int post_id);

   
   void feedDelComments(int post_id);
   void feedDelPost(int post_id);

   

void feedUpdatePost(HashMap<String, String> params);




   
   


   
   


   
   

}