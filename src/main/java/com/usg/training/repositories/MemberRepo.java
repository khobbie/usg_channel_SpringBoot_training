package com.usg.training.repositories;

import com.usg.training.models.MemberModel;

public interface MemberRepo {
    String get_all_members();

    MemberModel get_one_member(int member_id);
}
