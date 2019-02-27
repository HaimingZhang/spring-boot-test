CREATE TABLE `user`
(
  `id`         bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增id主键',
  `name`       varchar(1028) NOT NULL DEFAULT '' COMMENT 'name',
  `password`   varchar(1028) NOT NULL DEFAULT '' COMMENT '密码',
  `created_at` datetime      NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT "创建时间",
  `updated_at` timestamp     NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT "更新时间",
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;