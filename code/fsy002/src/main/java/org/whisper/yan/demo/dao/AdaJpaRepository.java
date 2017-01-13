package org.whisper.yan.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.whisper.yan.demo.entity.Ada;

/**
 * Created by yjw on 2017/1/12.
 */
public interface AdaJpaRepository  extends JpaRepository<Ada,Long> {

    Ada findFirstAdaByName(String name);

}

