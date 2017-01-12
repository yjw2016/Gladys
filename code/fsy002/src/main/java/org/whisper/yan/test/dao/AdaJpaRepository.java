package org.whisper.yan.test.dao;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.whisper.yan.test.entity.Ada;

/**
 * Created by yjw on 2017/1/12.
 */
public interface AdaJpaRepository  extends JpaRepository<Ada,Long> {

    Ada findFirstAdaByName(String name);

}

