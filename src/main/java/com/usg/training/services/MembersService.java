package com.usg.training.services;

import com.usg.training.models.MemberModel;
import com.usg.training.repositories.MemberRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class MembersService implements MemberRepo {

    @Autowired
    JdbcTemplate jdbcTemplate;

    private SimpleJdbcCall simpleJdbcCall;

    @Override
    public String get_all_members() {

        return "null";
    }

    @Override
    public MemberModel get_one_member(int member_id) {

        simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("prc_get_student_by_id");
        SqlParameterSource in = new MapSqlParameterSource()
                .addValue("member_id", member_id);

        Map out = simpleJdbcCall.execute(in);



        return null;
    }
}
