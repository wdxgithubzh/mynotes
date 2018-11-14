package com.dx.mynotes.dao;

import java.util.List;
import java.util.Map;

import com.dx.mynotes.entity.Notes;

public interface NotesDao extends BaseDao {

    /**
     * 新增笔记
     * @param notes
     */
    public void addNotes(Notes notes);

    /**
     * 删除，即更改笔记状态
     * @param notes
     * @return
     */
    public int deleteNotes(Notes notes);

    /**
     * 修改（更新）笔记
     * @param notes
     * @return
     */
    public int updateNotes(Notes notes);

    /**
     * 通过笔记本ID得到笔记本内的所有笔记
     * @param notebook_id
     * @return
     */
    public List<Map> findByNoteBook_Id(String notebook_id);

    /**
     * 通过笔记ID得到笔记相关信息
     * @param notes_id
     * @return
     */
    public Notes findByNotes_Id(String notes_id);
}