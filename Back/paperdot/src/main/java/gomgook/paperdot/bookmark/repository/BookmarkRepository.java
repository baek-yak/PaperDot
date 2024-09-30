package gomgook.paperdot.bookmark.repository;

import gomgook.paperdot.bookmark.entity.Bookmark;
import gomgook.paperdot.bookmark.entity.BookmarkPaperIdProjection;
import gomgook.paperdot.member.entity.Member;
import gomgook.paperdot.paper.entity.Paper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {

    Optional<List<Bookmark>> findAllByMember(Member member);

    Optional<Bookmark> findAllByMemberAndPaper(Member member, Paper paper);
//
//    @Query("SELECT b FROM Bookmark b WHERE b.member.id = :memberId AND b.paper.id = :paperId")
//    Optional<Bookmark> findAllByMember_IdAndPaper_Id(@Param("memberId") Long memberId, @Param("paperId") Long paperId);
//    void deleteAllByMemberAndPaper(Member member, Paper paper);

    void deleteAllByMember(Member member);

//    List<BookmarkPaperIdProjection> findAllPaperIdByMemberId(Long memberId);
}
