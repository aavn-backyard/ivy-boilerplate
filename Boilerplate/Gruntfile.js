'use strict';
module.exports = function(grunt) {
	require('load-grunt-tasks')(grunt);

	grunt.initConfig({
		buildFolder:"webContent/resources/gen-build",

		compassMultiple : {
			all : {
				options : {
					multiple : [ {
						sassDir : 'src_hd/',
						cssDir : 'temp/css',
					}, {
						sassDir : 'webContent/',
						cssDir : 'temp/css',
					} ]
				}
			}
		},
		concat : {
			css : {
				src : [ 'temp/css/**/*.css' ],
				dest : 'temp/dist/built.css',
			}

		},
		cssmin : {
			target : {
				files : [ {
					expand : true,
					cwd : "temp/dist",
					src : [ '**/*.css' ],
					dest : '<%= buildFolder %>/css',
					ext : '.min.css'
				} ]
			}
		},
		uglify : {
			dev : {
				options : {
					compress:false,
					mangle : false,
					beautify:true

				},
				files : {
					'<%= buildFolder %>/js/built.min.js' : [ 'webContent/**/*.js','src_hd/**/*.js', '!<%= buildFolder %>/**/*.js' ]
				}

			},
			prod : {
				options : {
					compress:true,

					mangle : true

				},
				files : {
					'<%= buildFolder %>/js/built.min.js' : [ 'webContent/**/*.js','src_hd/**/*.js', '!<%= buildFolder %>/**/*.js' ]
				}

			}
		},
		clean : {
			tmp : [ 'temp/' ],
			build : [ '<%= buildFolder %>' ]
		}
	});

	grunt.registerTask('jsDev', [ 'uglify:dev' ]);
	grunt.registerTask('jsProd', [ 'uglify:prod' ]);

	grunt.registerTask('css', [ 'compassMultiple', 'concat:css', 'cssmin' ]);

	grunt.registerTask('prod', [ "clean", "css", "jsProd","clean:tmp" ]);
	grunt.registerTask('dev', [ "clean", "css", "jsDev","clean:tmp"  ]);
	grunt.registerTask('default', ["dev"]);

};