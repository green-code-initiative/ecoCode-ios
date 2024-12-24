/*
 * Creedengo iOS plugin - Help the earth, adopt this green plugin for your applications
 * Copyright © 2024 green-code-initiative (https://green-code-initiative.org/)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.greencodeinitiative.creedengo.ios.pbxproj.antlr.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PbxprojParser extends Parser {
    static { RuntimeMetaData.checkVersion("4.10", RuntimeMetaData.VERSION); }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, ARCHIVE_VERSION=8,
            CLASSES=9, DASH=10, DOT=11, ISA=12, NUMBER=13, OBJECT_VERSION=14, OBJECTS=15,
            ROOT_OBJECT=16, SLASH=17, UNDERSCORE=18, DOLLAR=19, PBX_AGGREGATE_TARGET=20,
            PBX_BUILD_FILE=21, PBX_BUILD_RULE=22, PBX_BUILD_STYLE=23, PBX_CONTAINER_ITEM_PROXY=24,
            PBX_COPY_FILES_BUILD_PHASE=25, PBX_FILE_REFERENCE=26, PBX_FRAMEWORKS_BUILD_PHASE=27,
            PBX_GROUP=28, PBX_HEADERS_BUILD_PHASE=29, PBX_NATIVE_TARGET=30, PBX_LEGACY_TARGET=31,
            PBX_PROJECT=32, PBX_REFERENCE_PROXY=33, PBX_RESOURCES_BUILD_PHASE=34,
            PBX_SHELL_SCRIPT_BUILD_PHASE=35, PBX_SHELL_BUILD_PHASE=36, PBX_SOURCES_BUILD_PHASE=37,
            PBX_TARGET_DEPENDENCY=38, PBX_VARIANT_GROUP=39, XC_BUILD_CONFIGURATION=40,
            XC_CONFIGURATION_LIST=41, XC_REMOTE_SWIFT_PACKAGE_REFERENCE=42, XC_SWIFT_PACKAGE_PRODUCT_DEPENDENCY=43,
            XC_VERSION_GROUP=44, ALWAYS_OUT_OF_DATE=45, FILE_REF=46, PRODUCT_REF=47,
            CONTAINER_PORTAL=48, PROXY_TYPE=49, REMOTE_GLOBAL_ID_STRING=50, REMOTE_INFO=51,
            FILE_ENCODING=52, COMMENTS=53, EXPLICIT_FILE_TYPE=54, LAST_KNOWN_FILE_TYPE=55,
            INCLUDE_IN_INDEX=56, INDENT_WIDTH=57, TAB_WIDTH=58, USES_TABS=59, WRAPS_LINES=60,
            PLATFORM_FILTER=61, PLATFORM_FILTERS=62, CHILDREN=63, PRODUCT_INSTALL_PATH=64,
            REPOSITORY_URL=65, REQUIREMENT=66, PACKAGE=67, PACKAGE_PRODUCT_DEPENDENCIES=68,
            NAME=69, PATH=70, SOURCE_TREE=71, BUILD_ACTION_MASK=72, FILES=73, RUN_ONLY_FOR_DEPLOYMENT_POSTPROCESSING=74,
            BUILD_CONFIGURATION_LIST=75, BUILD_PHASES=76, BUILD_RULES=77, BUILD_ARGUMENTS_STRING=78,
            BUILD_TOOL_PATH=79, BUILD_WORKING_DIRECTORY=80, PASS_BUILD_SETTINGS_IN_ENVIRONMENT=81,
            DEPENDENCIES=82, PRODUCT_NAME=83, PRODUCT_REFERENCE=84, PRODUCT_TYPE=85,
            LINE_ENDING=86, XC_LANGUAGE_SPECIFICATION_IDENTIFIER=87, PLIST_STRUCTURE_DEFINITION_IDENTIFIER=88,
            REF_TYPE=89, COMPILER_SPEC=90, FILE_PATTERNS=91, INPUT_FILES=92, IS_EDITABLE=93,
            OUTPUT_FILES=94, RUN_ONCE_PER_ARCH=95, SCRIPT=96, ATTRIBUTES=97, LAST_SWIFT_MIGRATION=98,
            DEFAULT_BUILD_SYSTEM_TYPE_FOR_WORKSPACE=99, LAST_SWIFT_UPDATE_CHECK=100,
            BUILD_INDEPENDENT_TARGETS_IN_PARALLEL=101, LAST_TESTING_UPGRADE_CHECK=102,
            LAST_UPGRADE_CHECK=103, ORGANIZATION_NAME=104, TARGET_ATTRIBUTES=105,
            CREATED_ON_TOOLS_VERSION=106, TEST_TARGET_ID=107, DEVELOPMENT_TEAM=108,
            DEVELOPMENT_TEAM_NAME=109, PROVISIONING_STYLE=110, COMPATIBILITY_VERSION=111,
            DEVELOPMENT_REGION=112, HAS_SCANNED_FOR_ENCODINGS=113, KNOWN_REGIONS=114,
            MAIN_GROUP=115, PRODUCT_REF_GROUP=116, PACKAGE_REFERENCES=117, PRODUCT_DIR_PATH=118,
            PROJECT_REFERENCES=119, PROJECT_ROOT=120, TARGETS=121, INPUT_FILE_LIST_PATHS=122,
            INPUT_PATHS=123, OUTPUT_FILE_LIST_PATHS=124, OUTPUT_PATHS=125, SHELL_PATH=126,
            SHELL=127, SHELL_SCRIPT=128, SHOW_ENV_VARS_IN_LOG=129, TARGET=130, TARGET_PROXY=131,
            FILE_TYPE=132, REMOTE_REF=133, BASE_CONFIGURATION_REFERENCE=134, BUILD_SETTINGS=135,
            BUILD_STYLES=136, DST_PATH=137, DST_SUBFOLDER_SPEC=138, PRODUCT_GROUP=139,
            PROJECT_REF=140, BUILD_CONFIGURATIONS=141, DEFAULT_CONFIGURATION_IS_VISIBLE=142,
            DEFAULT_CONFIGURATION_NAME=143, SETTINGS=144, SYSTEM_CAPABILITIES=145,
            CURRENT_VERSION=146, VERSION_GROUP_TYPE=147, CLASSPREFIX=148, REFERENCE=149,
            QUOTED_STRING=150, NON_QUOTED_STRING=151, VARIABLE=152, ALPHA_NUMERIC=153,
            ALPHA_NUMERIC_CAP=154, WS=155, COMMENT=156, LINE_COMMENT=157;
    public static final int
            RULE_start = 0, RULE_root_element = 1, RULE_archive_version = 2, RULE_classes = 3,
            RULE_object_version = 4, RULE_objects = 5, RULE_root_object = 6, RULE_pbx_aggregate_target_section = 7,
            RULE_pbx_build_file_section = 8, RULE_pbx_build_rule_section = 9, RULE_pbx_build_style_section = 10,
            RULE_pbx_container_item_proxy_section = 11, RULE_pbx_copy_files_build_phase_section = 12,
            RULE_pbx_file_reference_section = 13, RULE_pbx_frameworks_build_phase_section = 14,
            RULE_pbx_group_section = 15, RULE_pbx_headers_build_phase_section = 16,
            RULE_pbx_native_target_section = 17, RULE_pbx_legacy_target_section = 18,
            RULE_pbx_project_section = 19, RULE_pbx_reference_proxy_section = 20,
            RULE_pbx_resources_build_phase_section = 21, RULE_pbx_shell_script_build_phase_section = 22,
            RULE_pbx_shell_build_phase_section = 23, RULE_pbx_sources_build_phase_section = 24,
            RULE_pbx_target_dependency_section = 25, RULE_pbx_variant_group_section = 26,
            RULE_xc_build_configuration_section = 27, RULE_xc_configuration_list_section = 28,
            RULE_xc_remote_swift_package_reference_section = 29, RULE_xc_swift_package_product_dependency_section = 30,
            RULE_xc_version_group_section = 31, RULE_pbx_aggregate_target = 32, RULE_pbx_build_file = 33,
            RULE_pbx_build_rule = 34, RULE_pbx_build_style = 35, RULE_pbx_container_item_proxy = 36,
            RULE_pbx_copy_files_build_phase = 37, RULE_pbx_file_reference = 38, RULE_pbx_frameworks_build_phase = 39,
            RULE_pbx_group = 40, RULE_pbx_headers_build_phase = 41, RULE_pbx_native_target = 42,
            RULE_pbx_legacy_target = 43, RULE_pbx_project = 44, RULE_pbx_reference_proxy = 45,
            RULE_pbx_resources_build_phase = 46, RULE_pbx_shell_script_build_phase = 47,
            RULE_pbx_shell_build_phase = 48, RULE_pbx_sources_build_phase = 49, RULE_pbx_target_dependency = 50,
            RULE_pbx_variant_group = 51, RULE_xc_build_configuration = 52, RULE_xc_configuration_list = 53,
            RULE_xc_remote_swift_package_reference = 54, RULE_xc_swift_package_product_dependency = 55,
            RULE_xc_version_group = 56, RULE_isa_pbx_aggregate_target = 57, RULE_isa_pbx_build_file = 58,
            RULE_isa_pbx_build_rule = 59, RULE_isa_pbx_build_style = 60, RULE_isa_pbx_container_item_proxy = 61,
            RULE_isa_pbx_copy_files_build_phase = 62, RULE_isa_pbx_file_reference = 63,
            RULE_isa_pbx_frameworks_build_phase = 64, RULE_isa_pbx_group = 65, RULE_isa_pbx_header_build_phase = 66,
            RULE_isa_pbx_native_target = 67, RULE_isa_pbx_legacy_target = 68, RULE_isa_pbx_project = 69,
            RULE_isa_pbx_reference_proxy = 70, RULE_isa_pbx_resources_build_phase = 71,
            RULE_isa_pbx_shell_script_build_phase = 72, RULE_isa_pbx_shell_build_phase = 73,
            RULE_isa_pbx_sources_build_phase = 74, RULE_isa_pbx_target_dependency = 75,
            RULE_isa_pbx_variant_group = 76, RULE_isa_xc_build_configuration = 77,
            RULE_isa_xc_configuration_list = 78, RULE_isa_xc_remote_swift_package_reference = 79,
            RULE_isa_xc_swift_package_product_dependency = 80, RULE_isa_xc_version_group = 81,
            RULE_always_out_of_date = 82, RULE_file_ref = 83, RULE_product_ref = 84,
            RULE_container_portal = 85, RULE_proxy_type = 86, RULE_remote_global_id_string = 87,
            RULE_remote_info = 88, RULE_file_encoding = 89, RULE_comments = 90, RULE_explicit_file_type = 91,
            RULE_last_known_file_type = 92, RULE_include_in_index = 93, RULE_indent_width = 94,
            RULE_tab_width = 95, RULE_uses_tabs = 96, RULE_wraps_lines = 97, RULE_platform_filter = 98,
            RULE_platform_filters = 99, RULE_children = 100, RULE_product_install_path = 101,
            RULE_repository_url = 102, RULE_requirement = 103, RULE_xc_package = 104,
            RULE_package_product_dependencies = 105, RULE_name = 106, RULE_path = 107,
            RULE_source_tree = 108, RULE_build_action_mask = 109, RULE_files = 110,
            RULE_run_only_for_deployment_postprocessing = 111, RULE_reference_list = 112,
            RULE_any_string_list = 113, RULE_non_quoted_strings_list = 114, RULE_build_configuration_list = 115,
            RULE_build_phases = 116, RULE_build_rules = 117, RULE_build_arguments_string = 118,
            RULE_build_tool_path = 119, RULE_build_working_directory = 120, RULE_pass_build_settings_in_environment = 121,
            RULE_dependencies = 122, RULE_product_name = 123, RULE_product_reference = 124,
            RULE_product_type = 125, RULE_line_ending = 126, RULE_xc_language_specification_identifier = 127,
            RULE_plist_structure_definition_identifier = 128, RULE_ref_type = 129,
            RULE_compiler_spec = 130, RULE_file_patterns = 131, RULE_input_files = 132,
            RULE_is_editable = 133, RULE_output_files = 134, RULE_run_once_per_arch = 135,
            RULE_script = 136, RULE_attributes = 137, RULE_last_swift_migration = 138,
            RULE_default_build_system_type_for_workspace = 139, RULE_last_swift_update_check = 140,
            RULE_build_targets_in_parallel = 141, RULE_last_testing_upgrade_check = 142,
            RULE_last_upgrade_check = 143, RULE_organization_name = 144, RULE_target_attributes = 145,
            RULE_target_attribute = 146, RULE_created_on_tools_version = 147, RULE_test_target_id = 148,
            RULE_development_team = 149, RULE_development_team_name = 150, RULE_provisioning_style = 151,
            RULE_compatibility_version = 152, RULE_development_region = 153, RULE_has_scanned_for_encodings = 154,
            RULE_known_regions = 155, RULE_main_group = 156, RULE_product_ref_group = 157,
            RULE_package_references = 158, RULE_project_dir_path = 159, RULE_project_references = 160,
            RULE_project_root = 161, RULE_targets = 162, RULE_input_file_list_paths = 163,
            RULE_input_paths = 164, RULE_output_file_list_paths = 165, RULE_output_paths = 166,
            RULE_shell_path = 167, RULE_shell = 168, RULE_shell_script = 169, RULE_show_env_vars_in_log = 170,
            RULE_target = 171, RULE_target_proxy = 172, RULE_file_type = 173, RULE_remote_ref = 174,
            RULE_base_configuration_reference = 175, RULE_build_settings = 176, RULE_build_styles = 177,
            RULE_dst_path = 178, RULE_dst_subfolder_spec = 179, RULE_project_references_list = 180,
            RULE_project_references_list_element = 181, RULE_key_value = 182, RULE_build_configurations = 183,
            RULE_default_configuration_is_visible = 184, RULE_default_configuration_name = 185,
            RULE_settings = 186, RULE_system_capabilities = 187, RULE_current_version = 188,
            RULE_version_group_type = 189, RULE_class_prefix = 190, RULE_any_string = 191,
            RULE_str_number_variable = 192, RULE_any_token = 193;
    private static String[] makeRuleNames() {
        return new String[] {
                "start", "root_element", "archive_version", "classes", "object_version",
                "objects", "root_object", "pbx_aggregate_target_section", "pbx_build_file_section",
                "pbx_build_rule_section", "pbx_build_style_section", "pbx_container_item_proxy_section",
                "pbx_copy_files_build_phase_section", "pbx_file_reference_section", "pbx_frameworks_build_phase_section",
                "pbx_group_section", "pbx_headers_build_phase_section", "pbx_native_target_section",
                "pbx_legacy_target_section", "pbx_project_section", "pbx_reference_proxy_section",
                "pbx_resources_build_phase_section", "pbx_shell_script_build_phase_section",
                "pbx_shell_build_phase_section", "pbx_sources_build_phase_section", "pbx_target_dependency_section",
                "pbx_variant_group_section", "xc_build_configuration_section", "xc_configuration_list_section",
                "xc_remote_swift_package_reference_section", "xc_swift_package_product_dependency_section",
                "xc_version_group_section", "pbx_aggregate_target", "pbx_build_file",
                "pbx_build_rule", "pbx_build_style", "pbx_container_item_proxy", "pbx_copy_files_build_phase",
                "pbx_file_reference", "pbx_frameworks_build_phase", "pbx_group", "pbx_headers_build_phase",
                "pbx_native_target", "pbx_legacy_target", "pbx_project", "pbx_reference_proxy",
                "pbx_resources_build_phase", "pbx_shell_script_build_phase", "pbx_shell_build_phase",
                "pbx_sources_build_phase", "pbx_target_dependency", "pbx_variant_group",
                "xc_build_configuration", "xc_configuration_list", "xc_remote_swift_package_reference",
                "xc_swift_package_product_dependency", "xc_version_group", "isa_pbx_aggregate_target",
                "isa_pbx_build_file", "isa_pbx_build_rule", "isa_pbx_build_style", "isa_pbx_container_item_proxy",
                "isa_pbx_copy_files_build_phase", "isa_pbx_file_reference", "isa_pbx_frameworks_build_phase",
                "isa_pbx_group", "isa_pbx_header_build_phase", "isa_pbx_native_target",
                "isa_pbx_legacy_target", "isa_pbx_project", "isa_pbx_reference_proxy",
                "isa_pbx_resources_build_phase", "isa_pbx_shell_script_build_phase",
                "isa_pbx_shell_build_phase", "isa_pbx_sources_build_phase", "isa_pbx_target_dependency",
                "isa_pbx_variant_group", "isa_xc_build_configuration", "isa_xc_configuration_list",
                "isa_xc_remote_swift_package_reference", "isa_xc_swift_package_product_dependency",
                "isa_xc_version_group", "always_out_of_date", "file_ref", "product_ref",
                "container_portal", "proxy_type", "remote_global_id_string", "remote_info",
                "file_encoding", "comments", "explicit_file_type", "last_known_file_type",
                "include_in_index", "indent_width", "tab_width", "uses_tabs", "wraps_lines",
                "platform_filter", "platform_filters", "children", "product_install_path",
                "repository_url", "requirement", "xc_package", "package_product_dependencies",
                "name", "path", "source_tree", "build_action_mask", "files", "run_only_for_deployment_postprocessing",
                "reference_list", "any_string_list", "non_quoted_strings_list", "build_configuration_list",
                "build_phases", "build_rules", "build_arguments_string", "build_tool_path",
                "build_working_directory", "pass_build_settings_in_environment", "dependencies",
                "product_name", "product_reference", "product_type", "line_ending", "xc_language_specification_identifier",
                "plist_structure_definition_identifier", "ref_type", "compiler_spec",
                "file_patterns", "input_files", "is_editable", "output_files", "run_once_per_arch",
                "script", "attributes", "last_swift_migration", "default_build_system_type_for_workspace",
                "last_swift_update_check", "build_targets_in_parallel", "last_testing_upgrade_check",
                "last_upgrade_check", "organization_name", "target_attributes", "target_attribute",
                "created_on_tools_version", "test_target_id", "development_team", "development_team_name",
                "provisioning_style", "compatibility_version", "development_region",
                "has_scanned_for_encodings", "known_regions", "main_group", "product_ref_group",
                "package_references", "project_dir_path", "project_references", "project_root",
                "targets", "input_file_list_paths", "input_paths", "output_file_list_paths",
                "output_paths", "shell_path", "shell", "shell_script", "show_env_vars_in_log",
                "target", "target_proxy", "file_type", "remote_ref", "base_configuration_reference",
                "build_settings", "build_styles", "dst_path", "dst_subfolder_spec", "project_references_list",
                "project_references_list_element", "key_value", "build_configurations",
                "default_configuration_is_visible", "default_configuration_name", "settings",
                "system_capabilities", "current_version", "version_group_type", "class_prefix",
                "any_string", "str_number_variable", "any_token"
        };
    }
    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames() {
        return new String[] {
                null, "'{'", "'}'", "'='", "';'", "'('", "','", "')'", "'archiveVersion'",
                "'classes'", "'-'", "'.'", "'isa'", null, "'objectVersion'", "'objects'",
                "'rootObject'", "'/'", "'_'", "'$'", "'PBXAggregateTarget'", "'PBXBuildFile'",
                "'PBXBuildRule'", "'PBXBuildStyle'", "'PBXContainerItemProxy'", "'PBXCopyFilesBuildPhase'",
                "'PBXFileReference'", "'PBXFrameworksBuildPhase'", "'PBXGroup'", "'PBXHeadersBuildPhase'",
                "'PBXNativeTarget'", "'PBXLegacyTarget'", "'PBXProject'", "'PBXReferenceProxy'",
                null, "'PBXShellScriptBuildPhase'", "'PBXShellBuildPhase'", "'PBXSourcesBuildPhase'",
                "'PBXTargetDependency'", "'PBXVariantGroup'", "'XCBuildConfiguration'",
                "'XCConfigurationList'", "'XCRemoteSwiftPackageReference'", "'XCSwiftPackageProductDependency'",
                "'XCVersionGroup'", "'alwaysOutOfDate'", "'fileRef'", "'productRef'",
                "'containerPortal'", "'proxyType'", "'remoteGlobalIDString'", "'remoteInfo'",
                "'fileEncoding'", "'comments'", "'explicitFileType'", "'lastKnownFileType'",
                "'includeInIndex'", "'indentWidth'", "'tabWidth'", "'usesTabs'", "'wrapsLines'",
                "'platformFilter'", "'platformFilters'", "'children'", "'productInstallPath'",
                "'repositoryURL'", "'requirement'", "'package'", "'packageProductDependencies'",
                "'name'", "'path'", "'sourceTree'", "'buildActionMask'", "'files'", "'runOnlyForDeploymentPostprocessing'",
                "'buildConfigurationList'", "'buildPhases'", "'buildRules'", "'buildArgumentsString'",
                "'buildToolPath'", "'buildWorkingDirectory'", "'passBuildSettingsInEnvironment'",
                "'dependencies'", "'productName'", "'productReference'", "'productType'",
                "'lineEnding'", "'xcLanguageSpecificationIdentifier'", "'plistStructureDefinitionIdentifier'",
                "'refType'", "'compilerSpec'", "'filePatterns'", "'inputFiles'", "'isEditable'",
                "'outputFiles'", "'runOncePerArchitecture'", "'script'", "'attributes'",
                "'LastSwiftMigration'", "'DefaultBuildSystemTypeForWorkspace'", "'LastSwiftUpdateCheck'",
                "'BuildIndependentTargetsInParallel'", "'LastTestingUpgradeCheck'", "'LastUpgradeCheck'",
                "'ORGANIZATIONNAME'", "'TargetAttributes'", "'CreatedOnToolsVersion'",
                "'TestTargetID'", "'DevelopmentTeam'", "'DevelopmentTeamName'", "'ProvisioningStyle'",
                "'compatibilityVersion'", "'developmentRegion'", "'hasScannedForEncodings'",
                "'knownRegions'", "'mainGroup'", "'productRefGroup'", "'packageReferences'",
                "'projectDirPath'", "'projectReferences'", "'projectRoot'", "'targets'",
                "'inputFileListPaths'", "'inputPaths'", "'outputFileListPaths'", "'outputPaths'",
                "'shellPath'", "'shell'", "'shellScript'", "'showEnvVarsInLog'", "'target'",
                "'targetProxy'", "'fileType'", "'remoteRef'", "'baseConfigurationReference'",
                "'buildSettings'", "'buildStyles'", "'dstPath'", "'dstSubfolderSpec'",
                "'ProductGroup'", "'ProjectRef'", "'buildConfigurations'", "'defaultConfigurationIsVisible'",
                "'defaultConfigurationName'", "'settings'", "'SystemCapabilities'", "'currentVersion'",
                "'versionGroupType'", "'CLASSPREFIX'"
        };
    }
    private static final String[] _LITERAL_NAMES = makeLiteralNames();
    private static String[] makeSymbolicNames() {
        return new String[] {
                null, null, null, null, null, null, null, null, "ARCHIVE_VERSION", "CLASSES",
                "DASH", "DOT", "ISA", "NUMBER", "OBJECT_VERSION", "OBJECTS", "ROOT_OBJECT",
                "SLASH", "UNDERSCORE", "DOLLAR", "PBX_AGGREGATE_TARGET", "PBX_BUILD_FILE",
                "PBX_BUILD_RULE", "PBX_BUILD_STYLE", "PBX_CONTAINER_ITEM_PROXY", "PBX_COPY_FILES_BUILD_PHASE",
                "PBX_FILE_REFERENCE", "PBX_FRAMEWORKS_BUILD_PHASE", "PBX_GROUP", "PBX_HEADERS_BUILD_PHASE",
                "PBX_NATIVE_TARGET", "PBX_LEGACY_TARGET", "PBX_PROJECT", "PBX_REFERENCE_PROXY",
                "PBX_RESOURCES_BUILD_PHASE", "PBX_SHELL_SCRIPT_BUILD_PHASE", "PBX_SHELL_BUILD_PHASE",
                "PBX_SOURCES_BUILD_PHASE", "PBX_TARGET_DEPENDENCY", "PBX_VARIANT_GROUP",
                "XC_BUILD_CONFIGURATION", "XC_CONFIGURATION_LIST", "XC_REMOTE_SWIFT_PACKAGE_REFERENCE",
                "XC_SWIFT_PACKAGE_PRODUCT_DEPENDENCY", "XC_VERSION_GROUP", "ALWAYS_OUT_OF_DATE",
                "FILE_REF", "PRODUCT_REF", "CONTAINER_PORTAL", "PROXY_TYPE", "REMOTE_GLOBAL_ID_STRING",
                "REMOTE_INFO", "FILE_ENCODING", "COMMENTS", "EXPLICIT_FILE_TYPE", "LAST_KNOWN_FILE_TYPE",
                "INCLUDE_IN_INDEX", "INDENT_WIDTH", "TAB_WIDTH", "USES_TABS", "WRAPS_LINES",
                "PLATFORM_FILTER", "PLATFORM_FILTERS", "CHILDREN", "PRODUCT_INSTALL_PATH",
                "REPOSITORY_URL", "REQUIREMENT", "PACKAGE", "PACKAGE_PRODUCT_DEPENDENCIES",
                "NAME", "PATH", "SOURCE_TREE", "BUILD_ACTION_MASK", "FILES", "RUN_ONLY_FOR_DEPLOYMENT_POSTPROCESSING",
                "BUILD_CONFIGURATION_LIST", "BUILD_PHASES", "BUILD_RULES", "BUILD_ARGUMENTS_STRING",
                "BUILD_TOOL_PATH", "BUILD_WORKING_DIRECTORY", "PASS_BUILD_SETTINGS_IN_ENVIRONMENT",
                "DEPENDENCIES", "PRODUCT_NAME", "PRODUCT_REFERENCE", "PRODUCT_TYPE",
                "LINE_ENDING", "XC_LANGUAGE_SPECIFICATION_IDENTIFIER", "PLIST_STRUCTURE_DEFINITION_IDENTIFIER",
                "REF_TYPE", "COMPILER_SPEC", "FILE_PATTERNS", "INPUT_FILES", "IS_EDITABLE",
                "OUTPUT_FILES", "RUN_ONCE_PER_ARCH", "SCRIPT", "ATTRIBUTES", "LAST_SWIFT_MIGRATION",
                "DEFAULT_BUILD_SYSTEM_TYPE_FOR_WORKSPACE", "LAST_SWIFT_UPDATE_CHECK",
                "BUILD_INDEPENDENT_TARGETS_IN_PARALLEL", "LAST_TESTING_UPGRADE_CHECK",
                "LAST_UPGRADE_CHECK", "ORGANIZATION_NAME", "TARGET_ATTRIBUTES", "CREATED_ON_TOOLS_VERSION",
                "TEST_TARGET_ID", "DEVELOPMENT_TEAM", "DEVELOPMENT_TEAM_NAME", "PROVISIONING_STYLE",
                "COMPATIBILITY_VERSION", "DEVELOPMENT_REGION", "HAS_SCANNED_FOR_ENCODINGS",
                "KNOWN_REGIONS", "MAIN_GROUP", "PRODUCT_REF_GROUP", "PACKAGE_REFERENCES",
                "PRODUCT_DIR_PATH", "PROJECT_REFERENCES", "PROJECT_ROOT", "TARGETS",
                "INPUT_FILE_LIST_PATHS", "INPUT_PATHS", "OUTPUT_FILE_LIST_PATHS", "OUTPUT_PATHS",
                "SHELL_PATH", "SHELL", "SHELL_SCRIPT", "SHOW_ENV_VARS_IN_LOG", "TARGET",
                "TARGET_PROXY", "FILE_TYPE", "REMOTE_REF", "BASE_CONFIGURATION_REFERENCE",
                "BUILD_SETTINGS", "BUILD_STYLES", "DST_PATH", "DST_SUBFOLDER_SPEC", "PRODUCT_GROUP",
                "PROJECT_REF", "BUILD_CONFIGURATIONS", "DEFAULT_CONFIGURATION_IS_VISIBLE",
                "DEFAULT_CONFIGURATION_NAME", "SETTINGS", "SYSTEM_CAPABILITIES", "CURRENT_VERSION",
                "VERSION_GROUP_TYPE", "CLASSPREFIX", "REFERENCE", "QUOTED_STRING", "NON_QUOTED_STRING",
                "VARIABLE", "ALPHA_NUMERIC", "ALPHA_NUMERIC_CAP", "WS", "COMMENT", "LINE_COMMENT"
        };
    }
    private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    static {
        tokenNames = new String[_SYMBOLIC_NAMES.length];
        for (int i = 0; i < tokenNames.length; i++) {
            tokenNames[i] = VOCABULARY.getLiteralName(i);
            if (tokenNames[i] == null) {
                tokenNames[i] = VOCABULARY.getSymbolicName(i);
            }

            if (tokenNames[i] == null) {
                tokenNames[i] = "<INVALID>";
            }
        }
    }

    @Override
    @Deprecated
    public String[] getTokenNames() {
        return tokenNames;
    }

    @Override

    public Vocabulary getVocabulary() {
        return VOCABULARY;
    }

    @Override
    public String getGrammarFileName() { return "Pbxproj.g4"; }

    @Override
    public String[] getRuleNames() { return ruleNames; }

    @Override
    public String getSerializedATN() { return _serializedATN; }

    @Override
    public ATN getATN() { return _ATN; }

    public PbxprojParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
    }

    public static class StartContext extends ParserRuleContext {
        public Root_elementContext root_element() {
            return getRuleContext(Root_elementContext.class,0);
        }
        public StartContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_start; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterStart(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitStart(this);
        }
    }

    public final StartContext start() throws RecognitionException {
        StartContext _localctx = new StartContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_start);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(388);
                root_element();
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Root_elementContext extends ParserRuleContext {
        public Archive_versionContext archive_version() {
            return getRuleContext(Archive_versionContext.class,0);
        }
        public ClassesContext classes() {
            return getRuleContext(ClassesContext.class,0);
        }
        public Object_versionContext object_version() {
            return getRuleContext(Object_versionContext.class,0);
        }
        public ObjectsContext objects() {
            return getRuleContext(ObjectsContext.class,0);
        }
        public Root_objectContext root_object() {
            return getRuleContext(Root_objectContext.class,0);
        }
        public Root_elementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_root_element; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterRoot_element(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitRoot_element(this);
        }
    }

    public final Root_elementContext root_element() throws RecognitionException {
        Root_elementContext _localctx = new Root_elementContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_root_element);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(390);
                match(T__0);
                setState(391);
                archive_version();
                setState(392);
                classes();
                setState(393);
                object_version();
                setState(394);
                objects();
                setState(395);
                root_object();
                setState(396);
                match(T__1);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Archive_versionContext extends ParserRuleContext {
        public TerminalNode ARCHIVE_VERSION() { return getToken(PbxprojParser.ARCHIVE_VERSION, 0); }
        public TerminalNode NUMBER() { return getToken(PbxprojParser.NUMBER, 0); }
        public Archive_versionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_archive_version; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterArchive_version(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitArchive_version(this);
        }
    }

    public final Archive_versionContext archive_version() throws RecognitionException {
        Archive_versionContext _localctx = new Archive_versionContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_archive_version);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(398);
                match(ARCHIVE_VERSION);
                setState(399);
                match(T__2);
                setState(400);
                match(NUMBER);
                setState(401);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ClassesContext extends ParserRuleContext {
        public TerminalNode CLASSES() { return getToken(PbxprojParser.CLASSES, 0); }
        public ClassesContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_classes; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterClasses(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitClasses(this);
        }
    }

    public final ClassesContext classes() throws RecognitionException {
        ClassesContext _localctx = new ClassesContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_classes);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(403);
                match(CLASSES);
                setState(404);
                match(T__2);
                setState(405);
                match(T__0);
                setState(406);
                match(T__1);
                setState(407);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Object_versionContext extends ParserRuleContext {
        public TerminalNode OBJECT_VERSION() { return getToken(PbxprojParser.OBJECT_VERSION, 0); }
        public TerminalNode NUMBER() { return getToken(PbxprojParser.NUMBER, 0); }
        public Object_versionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_object_version; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterObject_version(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitObject_version(this);
        }
    }

    public final Object_versionContext object_version() throws RecognitionException {
        Object_versionContext _localctx = new Object_versionContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_object_version);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(409);
                match(OBJECT_VERSION);
                setState(410);
                match(T__2);
                setState(411);
                match(NUMBER);
                setState(412);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ObjectsContext extends ParserRuleContext {
        public TerminalNode OBJECTS() { return getToken(PbxprojParser.OBJECTS, 0); }
        public Pbx_group_sectionContext pbx_group_section() {
            return getRuleContext(Pbx_group_sectionContext.class,0);
        }
        public Pbx_project_sectionContext pbx_project_section() {
            return getRuleContext(Pbx_project_sectionContext.class,0);
        }
        public Xc_build_configuration_sectionContext xc_build_configuration_section() {
            return getRuleContext(Xc_build_configuration_sectionContext.class,0);
        }
        public Xc_configuration_list_sectionContext xc_configuration_list_section() {
            return getRuleContext(Xc_configuration_list_sectionContext.class,0);
        }
        public Pbx_aggregate_target_sectionContext pbx_aggregate_target_section() {
            return getRuleContext(Pbx_aggregate_target_sectionContext.class,0);
        }
        public Pbx_build_file_sectionContext pbx_build_file_section() {
            return getRuleContext(Pbx_build_file_sectionContext.class,0);
        }
        public Pbx_build_rule_sectionContext pbx_build_rule_section() {
            return getRuleContext(Pbx_build_rule_sectionContext.class,0);
        }
        public Pbx_build_style_sectionContext pbx_build_style_section() {
            return getRuleContext(Pbx_build_style_sectionContext.class,0);
        }
        public Pbx_container_item_proxy_sectionContext pbx_container_item_proxy_section() {
            return getRuleContext(Pbx_container_item_proxy_sectionContext.class,0);
        }
        public Pbx_copy_files_build_phase_sectionContext pbx_copy_files_build_phase_section() {
            return getRuleContext(Pbx_copy_files_build_phase_sectionContext.class,0);
        }
        public Pbx_file_reference_sectionContext pbx_file_reference_section() {
            return getRuleContext(Pbx_file_reference_sectionContext.class,0);
        }
        public Pbx_frameworks_build_phase_sectionContext pbx_frameworks_build_phase_section() {
            return getRuleContext(Pbx_frameworks_build_phase_sectionContext.class,0);
        }
        public Pbx_headers_build_phase_sectionContext pbx_headers_build_phase_section() {
            return getRuleContext(Pbx_headers_build_phase_sectionContext.class,0);
        }
        public Pbx_legacy_target_sectionContext pbx_legacy_target_section() {
            return getRuleContext(Pbx_legacy_target_sectionContext.class,0);
        }
        public Pbx_native_target_sectionContext pbx_native_target_section() {
            return getRuleContext(Pbx_native_target_sectionContext.class,0);
        }
        public Pbx_reference_proxy_sectionContext pbx_reference_proxy_section() {
            return getRuleContext(Pbx_reference_proxy_sectionContext.class,0);
        }
        public Pbx_resources_build_phase_sectionContext pbx_resources_build_phase_section() {
            return getRuleContext(Pbx_resources_build_phase_sectionContext.class,0);
        }
        public Pbx_shell_script_build_phase_sectionContext pbx_shell_script_build_phase_section() {
            return getRuleContext(Pbx_shell_script_build_phase_sectionContext.class,0);
        }
        public Pbx_shell_build_phase_sectionContext pbx_shell_build_phase_section() {
            return getRuleContext(Pbx_shell_build_phase_sectionContext.class,0);
        }
        public Pbx_sources_build_phase_sectionContext pbx_sources_build_phase_section() {
            return getRuleContext(Pbx_sources_build_phase_sectionContext.class,0);
        }
        public Pbx_target_dependency_sectionContext pbx_target_dependency_section() {
            return getRuleContext(Pbx_target_dependency_sectionContext.class,0);
        }
        public Pbx_variant_group_sectionContext pbx_variant_group_section() {
            return getRuleContext(Pbx_variant_group_sectionContext.class,0);
        }
        public Xc_remote_swift_package_reference_sectionContext xc_remote_swift_package_reference_section() {
            return getRuleContext(Xc_remote_swift_package_reference_sectionContext.class,0);
        }
        public Xc_swift_package_product_dependency_sectionContext xc_swift_package_product_dependency_section() {
            return getRuleContext(Xc_swift_package_product_dependency_sectionContext.class,0);
        }
        public Xc_version_group_sectionContext xc_version_group_section() {
            return getRuleContext(Xc_version_group_sectionContext.class,0);
        }
        public ObjectsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_objects; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterObjects(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitObjects(this);
        }
    }

    public final ObjectsContext objects() throws RecognitionException {
        ObjectsContext _localctx = new ObjectsContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_objects);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(414);
                match(OBJECTS);
                setState(415);
                match(T__2);
                setState(416);
                match(T__0);
                setState(418);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
                    case 1:
                    {
                        setState(417);
                        pbx_aggregate_target_section();
                    }
                    break;
                }
                setState(421);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
                    case 1:
                    {
                        setState(420);
                        pbx_build_file_section();
                    }
                    break;
                }
                setState(424);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
                    case 1:
                    {
                        setState(423);
                        pbx_build_rule_section();
                    }
                    break;
                }
                setState(427);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
                    case 1:
                    {
                        setState(426);
                        pbx_build_style_section();
                    }
                    break;
                }
                setState(430);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
                    case 1:
                    {
                        setState(429);
                        pbx_container_item_proxy_section();
                    }
                    break;
                }
                setState(433);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
                    case 1:
                    {
                        setState(432);
                        pbx_copy_files_build_phase_section();
                    }
                    break;
                }
                setState(436);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
                    case 1:
                    {
                        setState(435);
                        pbx_file_reference_section();
                    }
                    break;
                }
                setState(439);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
                    case 1:
                    {
                        setState(438);
                        pbx_frameworks_build_phase_section();
                    }
                    break;
                }
                setState(441);
                pbx_group_section();
                setState(443);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
                    case 1:
                    {
                        setState(442);
                        pbx_headers_build_phase_section();
                    }
                    break;
                }
                setState(446);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
                    case 1:
                    {
                        setState(445);
                        pbx_legacy_target_section();
                    }
                    break;
                }
                setState(449);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
                    case 1:
                    {
                        setState(448);
                        pbx_native_target_section();
                    }
                    break;
                }
                setState(451);
                pbx_project_section();
                setState(453);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
                    case 1:
                    {
                        setState(452);
                        pbx_reference_proxy_section();
                    }
                    break;
                }
                setState(456);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
                    case 1:
                    {
                        setState(455);
                        pbx_resources_build_phase_section();
                    }
                    break;
                }
                setState(459);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
                    case 1:
                    {
                        setState(458);
                        pbx_shell_script_build_phase_section();
                    }
                    break;
                }
                setState(462);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
                    case 1:
                    {
                        setState(461);
                        pbx_shell_build_phase_section();
                    }
                    break;
                }
                setState(465);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
                    case 1:
                    {
                        setState(464);
                        pbx_sources_build_phase_section();
                    }
                    break;
                }
                setState(468);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
                    case 1:
                    {
                        setState(467);
                        pbx_target_dependency_section();
                    }
                    break;
                }
                setState(471);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
                    case 1:
                    {
                        setState(470);
                        pbx_variant_group_section();
                    }
                    break;
                }
                setState(473);
                xc_build_configuration_section();
                setState(474);
                xc_configuration_list_section();
                setState(476);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
                    case 1:
                    {
                        setState(475);
                        xc_remote_swift_package_reference_section();
                    }
                    break;
                }
                setState(479);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
                    case 1:
                    {
                        setState(478);
                        xc_swift_package_product_dependency_section();
                    }
                    break;
                }
                setState(482);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==REFERENCE) {
                    {
                        setState(481);
                        xc_version_group_section();
                    }
                }

                setState(484);
                match(T__1);
                setState(485);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Root_objectContext extends ParserRuleContext {
        public TerminalNode ROOT_OBJECT() { return getToken(PbxprojParser.ROOT_OBJECT, 0); }
        public TerminalNode REFERENCE() { return getToken(PbxprojParser.REFERENCE, 0); }
        public Root_objectContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_root_object; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterRoot_object(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitRoot_object(this);
        }
    }

    public final Root_objectContext root_object() throws RecognitionException {
        Root_objectContext _localctx = new Root_objectContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_root_object);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(487);
                match(ROOT_OBJECT);
                setState(488);
                match(T__2);
                setState(489);
                match(REFERENCE);
                setState(490);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Pbx_aggregate_target_sectionContext extends ParserRuleContext {
        public List<Pbx_aggregate_targetContext> pbx_aggregate_target() {
            return getRuleContexts(Pbx_aggregate_targetContext.class);
        }
        public Pbx_aggregate_targetContext pbx_aggregate_target(int i) {
            return getRuleContext(Pbx_aggregate_targetContext.class,i);
        }
        public Pbx_aggregate_target_sectionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_pbx_aggregate_target_section; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterPbx_aggregate_target_section(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitPbx_aggregate_target_section(this);
        }
    }

    public final Pbx_aggregate_target_sectionContext pbx_aggregate_target_section() throws RecognitionException {
        Pbx_aggregate_target_sectionContext _localctx = new Pbx_aggregate_target_sectionContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_pbx_aggregate_target_section);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(493);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1:
                        {
                            {
                                setState(492);
                                pbx_aggregate_target();
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(495);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,21,_ctx);
                } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Pbx_build_file_sectionContext extends ParserRuleContext {
        public List<Pbx_build_fileContext> pbx_build_file() {
            return getRuleContexts(Pbx_build_fileContext.class);
        }
        public Pbx_build_fileContext pbx_build_file(int i) {
            return getRuleContext(Pbx_build_fileContext.class,i);
        }
        public Pbx_build_file_sectionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_pbx_build_file_section; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterPbx_build_file_section(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitPbx_build_file_section(this);
        }
    }

    public final Pbx_build_file_sectionContext pbx_build_file_section() throws RecognitionException {
        Pbx_build_file_sectionContext _localctx = new Pbx_build_file_sectionContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_pbx_build_file_section);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(498);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1:
                        {
                            {
                                setState(497);
                                pbx_build_file();
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(500);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,22,_ctx);
                } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Pbx_build_rule_sectionContext extends ParserRuleContext {
        public List<Pbx_build_ruleContext> pbx_build_rule() {
            return getRuleContexts(Pbx_build_ruleContext.class);
        }
        public Pbx_build_ruleContext pbx_build_rule(int i) {
            return getRuleContext(Pbx_build_ruleContext.class,i);
        }
        public Pbx_build_rule_sectionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_pbx_build_rule_section; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterPbx_build_rule_section(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitPbx_build_rule_section(this);
        }
    }

    public final Pbx_build_rule_sectionContext pbx_build_rule_section() throws RecognitionException {
        Pbx_build_rule_sectionContext _localctx = new Pbx_build_rule_sectionContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_pbx_build_rule_section);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(503);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1:
                        {
                            {
                                setState(502);
                                pbx_build_rule();
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(505);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,23,_ctx);
                } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Pbx_build_style_sectionContext extends ParserRuleContext {
        public List<Pbx_build_styleContext> pbx_build_style() {
            return getRuleContexts(Pbx_build_styleContext.class);
        }
        public Pbx_build_styleContext pbx_build_style(int i) {
            return getRuleContext(Pbx_build_styleContext.class,i);
        }
        public Pbx_build_style_sectionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_pbx_build_style_section; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterPbx_build_style_section(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitPbx_build_style_section(this);
        }
    }

    public final Pbx_build_style_sectionContext pbx_build_style_section() throws RecognitionException {
        Pbx_build_style_sectionContext _localctx = new Pbx_build_style_sectionContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_pbx_build_style_section);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(508);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1:
                        {
                            {
                                setState(507);
                                pbx_build_style();
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(510);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,24,_ctx);
                } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Pbx_container_item_proxy_sectionContext extends ParserRuleContext {
        public List<Pbx_container_item_proxyContext> pbx_container_item_proxy() {
            return getRuleContexts(Pbx_container_item_proxyContext.class);
        }
        public Pbx_container_item_proxyContext pbx_container_item_proxy(int i) {
            return getRuleContext(Pbx_container_item_proxyContext.class,i);
        }
        public Pbx_container_item_proxy_sectionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_pbx_container_item_proxy_section; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterPbx_container_item_proxy_section(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitPbx_container_item_proxy_section(this);
        }
    }

    public final Pbx_container_item_proxy_sectionContext pbx_container_item_proxy_section() throws RecognitionException {
        Pbx_container_item_proxy_sectionContext _localctx = new Pbx_container_item_proxy_sectionContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_pbx_container_item_proxy_section);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(513);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1:
                        {
                            {
                                setState(512);
                                pbx_container_item_proxy();
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(515);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,25,_ctx);
                } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Pbx_copy_files_build_phase_sectionContext extends ParserRuleContext {
        public List<Pbx_copy_files_build_phaseContext> pbx_copy_files_build_phase() {
            return getRuleContexts(Pbx_copy_files_build_phaseContext.class);
        }
        public Pbx_copy_files_build_phaseContext pbx_copy_files_build_phase(int i) {
            return getRuleContext(Pbx_copy_files_build_phaseContext.class,i);
        }
        public Pbx_copy_files_build_phase_sectionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_pbx_copy_files_build_phase_section; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterPbx_copy_files_build_phase_section(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitPbx_copy_files_build_phase_section(this);
        }
    }

    public final Pbx_copy_files_build_phase_sectionContext pbx_copy_files_build_phase_section() throws RecognitionException {
        Pbx_copy_files_build_phase_sectionContext _localctx = new Pbx_copy_files_build_phase_sectionContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_pbx_copy_files_build_phase_section);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(518);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1:
                        {
                            {
                                setState(517);
                                pbx_copy_files_build_phase();
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(520);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,26,_ctx);
                } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Pbx_file_reference_sectionContext extends ParserRuleContext {
        public List<Pbx_file_referenceContext> pbx_file_reference() {
            return getRuleContexts(Pbx_file_referenceContext.class);
        }
        public Pbx_file_referenceContext pbx_file_reference(int i) {
            return getRuleContext(Pbx_file_referenceContext.class,i);
        }
        public Pbx_file_reference_sectionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_pbx_file_reference_section; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterPbx_file_reference_section(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitPbx_file_reference_section(this);
        }
    }

    public final Pbx_file_reference_sectionContext pbx_file_reference_section() throws RecognitionException {
        Pbx_file_reference_sectionContext _localctx = new Pbx_file_reference_sectionContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_pbx_file_reference_section);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(523);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1:
                        {
                            {
                                setState(522);
                                pbx_file_reference();
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(525);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,27,_ctx);
                } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Pbx_frameworks_build_phase_sectionContext extends ParserRuleContext {
        public List<Pbx_frameworks_build_phaseContext> pbx_frameworks_build_phase() {
            return getRuleContexts(Pbx_frameworks_build_phaseContext.class);
        }
        public Pbx_frameworks_build_phaseContext pbx_frameworks_build_phase(int i) {
            return getRuleContext(Pbx_frameworks_build_phaseContext.class,i);
        }
        public Pbx_frameworks_build_phase_sectionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_pbx_frameworks_build_phase_section; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterPbx_frameworks_build_phase_section(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitPbx_frameworks_build_phase_section(this);
        }
    }

    public final Pbx_frameworks_build_phase_sectionContext pbx_frameworks_build_phase_section() throws RecognitionException {
        Pbx_frameworks_build_phase_sectionContext _localctx = new Pbx_frameworks_build_phase_sectionContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_pbx_frameworks_build_phase_section);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(528);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1:
                        {
                            {
                                setState(527);
                                pbx_frameworks_build_phase();
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(530);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,28,_ctx);
                } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Pbx_group_sectionContext extends ParserRuleContext {
        public List<Pbx_groupContext> pbx_group() {
            return getRuleContexts(Pbx_groupContext.class);
        }
        public Pbx_groupContext pbx_group(int i) {
            return getRuleContext(Pbx_groupContext.class,i);
        }
        public Pbx_group_sectionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_pbx_group_section; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterPbx_group_section(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitPbx_group_section(this);
        }
    }

    public final Pbx_group_sectionContext pbx_group_section() throws RecognitionException {
        Pbx_group_sectionContext _localctx = new Pbx_group_sectionContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_pbx_group_section);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(533);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1:
                        {
                            {
                                setState(532);
                                pbx_group();
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(535);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,29,_ctx);
                } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Pbx_headers_build_phase_sectionContext extends ParserRuleContext {
        public List<Pbx_headers_build_phaseContext> pbx_headers_build_phase() {
            return getRuleContexts(Pbx_headers_build_phaseContext.class);
        }
        public Pbx_headers_build_phaseContext pbx_headers_build_phase(int i) {
            return getRuleContext(Pbx_headers_build_phaseContext.class,i);
        }
        public Pbx_headers_build_phase_sectionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_pbx_headers_build_phase_section; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterPbx_headers_build_phase_section(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitPbx_headers_build_phase_section(this);
        }
    }

    public final Pbx_headers_build_phase_sectionContext pbx_headers_build_phase_section() throws RecognitionException {
        Pbx_headers_build_phase_sectionContext _localctx = new Pbx_headers_build_phase_sectionContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_pbx_headers_build_phase_section);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(538);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1:
                        {
                            {
                                setState(537);
                                pbx_headers_build_phase();
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(540);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,30,_ctx);
                } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Pbx_native_target_sectionContext extends ParserRuleContext {
        public List<Pbx_native_targetContext> pbx_native_target() {
            return getRuleContexts(Pbx_native_targetContext.class);
        }
        public Pbx_native_targetContext pbx_native_target(int i) {
            return getRuleContext(Pbx_native_targetContext.class,i);
        }
        public Pbx_native_target_sectionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_pbx_native_target_section; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterPbx_native_target_section(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitPbx_native_target_section(this);
        }
    }

    public final Pbx_native_target_sectionContext pbx_native_target_section() throws RecognitionException {
        Pbx_native_target_sectionContext _localctx = new Pbx_native_target_sectionContext(_ctx, getState());
        enterRule(_localctx, 34, RULE_pbx_native_target_section);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(543);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1:
                        {
                            {
                                setState(542);
                                pbx_native_target();
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(545);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,31,_ctx);
                } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Pbx_legacy_target_sectionContext extends ParserRuleContext {
        public List<Pbx_legacy_targetContext> pbx_legacy_target() {
            return getRuleContexts(Pbx_legacy_targetContext.class);
        }
        public Pbx_legacy_targetContext pbx_legacy_target(int i) {
            return getRuleContext(Pbx_legacy_targetContext.class,i);
        }
        public Pbx_legacy_target_sectionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_pbx_legacy_target_section; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterPbx_legacy_target_section(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitPbx_legacy_target_section(this);
        }
    }

    public final Pbx_legacy_target_sectionContext pbx_legacy_target_section() throws RecognitionException {
        Pbx_legacy_target_sectionContext _localctx = new Pbx_legacy_target_sectionContext(_ctx, getState());
        enterRule(_localctx, 36, RULE_pbx_legacy_target_section);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(548);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1:
                        {
                            {
                                setState(547);
                                pbx_legacy_target();
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(550);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,32,_ctx);
                } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Pbx_project_sectionContext extends ParserRuleContext {
        public List<Pbx_projectContext> pbx_project() {
            return getRuleContexts(Pbx_projectContext.class);
        }
        public Pbx_projectContext pbx_project(int i) {
            return getRuleContext(Pbx_projectContext.class,i);
        }
        public Pbx_project_sectionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_pbx_project_section; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterPbx_project_section(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitPbx_project_section(this);
        }
    }

    public final Pbx_project_sectionContext pbx_project_section() throws RecognitionException {
        Pbx_project_sectionContext _localctx = new Pbx_project_sectionContext(_ctx, getState());
        enterRule(_localctx, 38, RULE_pbx_project_section);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(553);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1:
                        {
                            {
                                setState(552);
                                pbx_project();
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(555);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,33,_ctx);
                } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Pbx_reference_proxy_sectionContext extends ParserRuleContext {
        public List<Pbx_reference_proxyContext> pbx_reference_proxy() {
            return getRuleContexts(Pbx_reference_proxyContext.class);
        }
        public Pbx_reference_proxyContext pbx_reference_proxy(int i) {
            return getRuleContext(Pbx_reference_proxyContext.class,i);
        }
        public Pbx_reference_proxy_sectionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_pbx_reference_proxy_section; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterPbx_reference_proxy_section(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitPbx_reference_proxy_section(this);
        }
    }

    public final Pbx_reference_proxy_sectionContext pbx_reference_proxy_section() throws RecognitionException {
        Pbx_reference_proxy_sectionContext _localctx = new Pbx_reference_proxy_sectionContext(_ctx, getState());
        enterRule(_localctx, 40, RULE_pbx_reference_proxy_section);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(558);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1:
                        {
                            {
                                setState(557);
                                pbx_reference_proxy();
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(560);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,34,_ctx);
                } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Pbx_resources_build_phase_sectionContext extends ParserRuleContext {
        public List<Pbx_resources_build_phaseContext> pbx_resources_build_phase() {
            return getRuleContexts(Pbx_resources_build_phaseContext.class);
        }
        public Pbx_resources_build_phaseContext pbx_resources_build_phase(int i) {
            return getRuleContext(Pbx_resources_build_phaseContext.class,i);
        }
        public Pbx_resources_build_phase_sectionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_pbx_resources_build_phase_section; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterPbx_resources_build_phase_section(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitPbx_resources_build_phase_section(this);
        }
    }

    public final Pbx_resources_build_phase_sectionContext pbx_resources_build_phase_section() throws RecognitionException {
        Pbx_resources_build_phase_sectionContext _localctx = new Pbx_resources_build_phase_sectionContext(_ctx, getState());
        enterRule(_localctx, 42, RULE_pbx_resources_build_phase_section);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(563);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1:
                        {
                            {
                                setState(562);
                                pbx_resources_build_phase();
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(565);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,35,_ctx);
                } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Pbx_shell_script_build_phase_sectionContext extends ParserRuleContext {
        public List<Pbx_shell_script_build_phaseContext> pbx_shell_script_build_phase() {
            return getRuleContexts(Pbx_shell_script_build_phaseContext.class);
        }
        public Pbx_shell_script_build_phaseContext pbx_shell_script_build_phase(int i) {
            return getRuleContext(Pbx_shell_script_build_phaseContext.class,i);
        }
        public Pbx_shell_script_build_phase_sectionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_pbx_shell_script_build_phase_section; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterPbx_shell_script_build_phase_section(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitPbx_shell_script_build_phase_section(this);
        }
    }

    public final Pbx_shell_script_build_phase_sectionContext pbx_shell_script_build_phase_section() throws RecognitionException {
        Pbx_shell_script_build_phase_sectionContext _localctx = new Pbx_shell_script_build_phase_sectionContext(_ctx, getState());
        enterRule(_localctx, 44, RULE_pbx_shell_script_build_phase_section);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(568);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1:
                        {
                            {
                                setState(567);
                                pbx_shell_script_build_phase();
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(570);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,36,_ctx);
                } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Pbx_shell_build_phase_sectionContext extends ParserRuleContext {
        public List<Pbx_shell_build_phaseContext> pbx_shell_build_phase() {
            return getRuleContexts(Pbx_shell_build_phaseContext.class);
        }
        public Pbx_shell_build_phaseContext pbx_shell_build_phase(int i) {
            return getRuleContext(Pbx_shell_build_phaseContext.class,i);
        }
        public Pbx_shell_build_phase_sectionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_pbx_shell_build_phase_section; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterPbx_shell_build_phase_section(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitPbx_shell_build_phase_section(this);
        }
    }

    public final Pbx_shell_build_phase_sectionContext pbx_shell_build_phase_section() throws RecognitionException {
        Pbx_shell_build_phase_sectionContext _localctx = new Pbx_shell_build_phase_sectionContext(_ctx, getState());
        enterRule(_localctx, 46, RULE_pbx_shell_build_phase_section);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(573);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1:
                        {
                            {
                                setState(572);
                                pbx_shell_build_phase();
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(575);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,37,_ctx);
                } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Pbx_sources_build_phase_sectionContext extends ParserRuleContext {
        public List<Pbx_sources_build_phaseContext> pbx_sources_build_phase() {
            return getRuleContexts(Pbx_sources_build_phaseContext.class);
        }
        public Pbx_sources_build_phaseContext pbx_sources_build_phase(int i) {
            return getRuleContext(Pbx_sources_build_phaseContext.class,i);
        }
        public Pbx_sources_build_phase_sectionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_pbx_sources_build_phase_section; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterPbx_sources_build_phase_section(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitPbx_sources_build_phase_section(this);
        }
    }

    public final Pbx_sources_build_phase_sectionContext pbx_sources_build_phase_section() throws RecognitionException {
        Pbx_sources_build_phase_sectionContext _localctx = new Pbx_sources_build_phase_sectionContext(_ctx, getState());
        enterRule(_localctx, 48, RULE_pbx_sources_build_phase_section);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(578);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1:
                        {
                            {
                                setState(577);
                                pbx_sources_build_phase();
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(580);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,38,_ctx);
                } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Pbx_target_dependency_sectionContext extends ParserRuleContext {
        public List<Pbx_target_dependencyContext> pbx_target_dependency() {
            return getRuleContexts(Pbx_target_dependencyContext.class);
        }
        public Pbx_target_dependencyContext pbx_target_dependency(int i) {
            return getRuleContext(Pbx_target_dependencyContext.class,i);
        }
        public Pbx_target_dependency_sectionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_pbx_target_dependency_section; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterPbx_target_dependency_section(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitPbx_target_dependency_section(this);
        }
    }

    public final Pbx_target_dependency_sectionContext pbx_target_dependency_section() throws RecognitionException {
        Pbx_target_dependency_sectionContext _localctx = new Pbx_target_dependency_sectionContext(_ctx, getState());
        enterRule(_localctx, 50, RULE_pbx_target_dependency_section);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(583);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1:
                        {
                            {
                                setState(582);
                                pbx_target_dependency();
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(585);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,39,_ctx);
                } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Pbx_variant_group_sectionContext extends ParserRuleContext {
        public List<Pbx_variant_groupContext> pbx_variant_group() {
            return getRuleContexts(Pbx_variant_groupContext.class);
        }
        public Pbx_variant_groupContext pbx_variant_group(int i) {
            return getRuleContext(Pbx_variant_groupContext.class,i);
        }
        public Pbx_variant_group_sectionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_pbx_variant_group_section; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterPbx_variant_group_section(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitPbx_variant_group_section(this);
        }
    }

    public final Pbx_variant_group_sectionContext pbx_variant_group_section() throws RecognitionException {
        Pbx_variant_group_sectionContext _localctx = new Pbx_variant_group_sectionContext(_ctx, getState());
        enterRule(_localctx, 52, RULE_pbx_variant_group_section);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(588);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1:
                        {
                            {
                                setState(587);
                                pbx_variant_group();
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(590);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,40,_ctx);
                } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Xc_build_configuration_sectionContext extends ParserRuleContext {
        public List<Xc_build_configurationContext> xc_build_configuration() {
            return getRuleContexts(Xc_build_configurationContext.class);
        }
        public Xc_build_configurationContext xc_build_configuration(int i) {
            return getRuleContext(Xc_build_configurationContext.class,i);
        }
        public Xc_build_configuration_sectionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_xc_build_configuration_section; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterXc_build_configuration_section(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitXc_build_configuration_section(this);
        }
    }

    public final Xc_build_configuration_sectionContext xc_build_configuration_section() throws RecognitionException {
        Xc_build_configuration_sectionContext _localctx = new Xc_build_configuration_sectionContext(_ctx, getState());
        enterRule(_localctx, 54, RULE_xc_build_configuration_section);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(593);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1:
                        {
                            {
                                setState(592);
                                xc_build_configuration();
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(595);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,41,_ctx);
                } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Xc_configuration_list_sectionContext extends ParserRuleContext {
        public List<Xc_configuration_listContext> xc_configuration_list() {
            return getRuleContexts(Xc_configuration_listContext.class);
        }
        public Xc_configuration_listContext xc_configuration_list(int i) {
            return getRuleContext(Xc_configuration_listContext.class,i);
        }
        public Xc_configuration_list_sectionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_xc_configuration_list_section; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterXc_configuration_list_section(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitXc_configuration_list_section(this);
        }
    }

    public final Xc_configuration_list_sectionContext xc_configuration_list_section() throws RecognitionException {
        Xc_configuration_list_sectionContext _localctx = new Xc_configuration_list_sectionContext(_ctx, getState());
        enterRule(_localctx, 56, RULE_xc_configuration_list_section);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(598);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1:
                        {
                            {
                                setState(597);
                                xc_configuration_list();
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(600);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,42,_ctx);
                } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Xc_remote_swift_package_reference_sectionContext extends ParserRuleContext {
        public List<Xc_remote_swift_package_referenceContext> xc_remote_swift_package_reference() {
            return getRuleContexts(Xc_remote_swift_package_referenceContext.class);
        }
        public Xc_remote_swift_package_referenceContext xc_remote_swift_package_reference(int i) {
            return getRuleContext(Xc_remote_swift_package_referenceContext.class,i);
        }
        public Xc_remote_swift_package_reference_sectionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_xc_remote_swift_package_reference_section; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterXc_remote_swift_package_reference_section(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitXc_remote_swift_package_reference_section(this);
        }
    }

    public final Xc_remote_swift_package_reference_sectionContext xc_remote_swift_package_reference_section() throws RecognitionException {
        Xc_remote_swift_package_reference_sectionContext _localctx = new Xc_remote_swift_package_reference_sectionContext(_ctx, getState());
        enterRule(_localctx, 58, RULE_xc_remote_swift_package_reference_section);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(603);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1:
                        {
                            {
                                setState(602);
                                xc_remote_swift_package_reference();
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(605);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,43,_ctx);
                } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Xc_swift_package_product_dependency_sectionContext extends ParserRuleContext {
        public List<Xc_swift_package_product_dependencyContext> xc_swift_package_product_dependency() {
            return getRuleContexts(Xc_swift_package_product_dependencyContext.class);
        }
        public Xc_swift_package_product_dependencyContext xc_swift_package_product_dependency(int i) {
            return getRuleContext(Xc_swift_package_product_dependencyContext.class,i);
        }
        public Xc_swift_package_product_dependency_sectionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_xc_swift_package_product_dependency_section; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterXc_swift_package_product_dependency_section(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitXc_swift_package_product_dependency_section(this);
        }
    }

    public final Xc_swift_package_product_dependency_sectionContext xc_swift_package_product_dependency_section() throws RecognitionException {
        Xc_swift_package_product_dependency_sectionContext _localctx = new Xc_swift_package_product_dependency_sectionContext(_ctx, getState());
        enterRule(_localctx, 60, RULE_xc_swift_package_product_dependency_section);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(608);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1:
                        {
                            {
                                setState(607);
                                xc_swift_package_product_dependency();
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(610);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,44,_ctx);
                } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Xc_version_group_sectionContext extends ParserRuleContext {
        public List<Xc_version_groupContext> xc_version_group() {
            return getRuleContexts(Xc_version_groupContext.class);
        }
        public Xc_version_groupContext xc_version_group(int i) {
            return getRuleContext(Xc_version_groupContext.class,i);
        }
        public Xc_version_group_sectionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_xc_version_group_section; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterXc_version_group_section(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitXc_version_group_section(this);
        }
    }

    public final Xc_version_group_sectionContext xc_version_group_section() throws RecognitionException {
        Xc_version_group_sectionContext _localctx = new Xc_version_group_sectionContext(_ctx, getState());
        enterRule(_localctx, 62, RULE_xc_version_group_section);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(613);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(612);
                            xc_version_group();
                        }
                    }
                    setState(615);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while ( _la==REFERENCE );
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Pbx_aggregate_targetContext extends ParserRuleContext {
        public TerminalNode REFERENCE() { return getToken(PbxprojParser.REFERENCE, 0); }
        public Isa_pbx_aggregate_targetContext isa_pbx_aggregate_target() {
            return getRuleContext(Isa_pbx_aggregate_targetContext.class,0);
        }
        public Build_configuration_listContext build_configuration_list() {
            return getRuleContext(Build_configuration_listContext.class,0);
        }
        public Build_phasesContext build_phases() {
            return getRuleContext(Build_phasesContext.class,0);
        }
        public DependenciesContext dependencies() {
            return getRuleContext(DependenciesContext.class,0);
        }
        public NameContext name() {
            return getRuleContext(NameContext.class,0);
        }
        public Build_settingsContext build_settings() {
            return getRuleContext(Build_settingsContext.class,0);
        }
        public CommentsContext comments() {
            return getRuleContext(CommentsContext.class,0);
        }
        public Product_nameContext product_name() {
            return getRuleContext(Product_nameContext.class,0);
        }
        public Pbx_aggregate_targetContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_pbx_aggregate_target; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterPbx_aggregate_target(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitPbx_aggregate_target(this);
        }
    }

    public final Pbx_aggregate_targetContext pbx_aggregate_target() throws RecognitionException {
        Pbx_aggregate_targetContext _localctx = new Pbx_aggregate_targetContext(_ctx, getState());
        enterRule(_localctx, 64, RULE_pbx_aggregate_target);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(617);
                match(REFERENCE);
                setState(618);
                match(T__2);
                setState(619);
                match(T__0);
                setState(620);
                isa_pbx_aggregate_target();
                setState(621);
                build_configuration_list();
                setState(622);
                build_phases();
                setState(624);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==BUILD_SETTINGS) {
                    {
                        setState(623);
                        build_settings();
                    }
                }

                setState(627);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==COMMENTS) {
                    {
                        setState(626);
                        comments();
                    }
                }

                setState(629);
                dependencies();
                setState(630);
                name();
                setState(632);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==PRODUCT_NAME) {
                    {
                        setState(631);
                        product_name();
                    }
                }

                setState(634);
                match(T__1);
                setState(635);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Pbx_build_fileContext extends ParserRuleContext {
        public TerminalNode REFERENCE() { return getToken(PbxprojParser.REFERENCE, 0); }
        public Isa_pbx_build_fileContext isa_pbx_build_file() {
            return getRuleContext(Isa_pbx_build_fileContext.class,0);
        }
        public File_refContext file_ref() {
            return getRuleContext(File_refContext.class,0);
        }
        public Platform_filterContext platform_filter() {
            return getRuleContext(Platform_filterContext.class,0);
        }
        public Platform_filtersContext platform_filters() {
            return getRuleContext(Platform_filtersContext.class,0);
        }
        public Product_refContext product_ref() {
            return getRuleContext(Product_refContext.class,0);
        }
        public SettingsContext settings() {
            return getRuleContext(SettingsContext.class,0);
        }
        public Pbx_build_fileContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_pbx_build_file; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterPbx_build_file(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitPbx_build_file(this);
        }
    }

    public final Pbx_build_fileContext pbx_build_file() throws RecognitionException {
        Pbx_build_fileContext _localctx = new Pbx_build_fileContext(_ctx, getState());
        enterRule(_localctx, 66, RULE_pbx_build_file);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(637);
                match(REFERENCE);
                setState(638);
                match(T__2);
                setState(639);
                match(T__0);
                setState(640);
                isa_pbx_build_file();
                setState(642);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==FILE_REF) {
                    {
                        setState(641);
                        file_ref();
                    }
                }

                setState(645);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==PLATFORM_FILTER) {
                    {
                        setState(644);
                        platform_filter();
                    }
                }

                setState(648);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==PLATFORM_FILTERS) {
                    {
                        setState(647);
                        platform_filters();
                    }
                }

                setState(651);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==PRODUCT_REF) {
                    {
                        setState(650);
                        product_ref();
                    }
                }

                setState(654);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==SETTINGS) {
                    {
                        setState(653);
                        settings();
                    }
                }

                setState(656);
                match(T__1);
                setState(657);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Pbx_build_ruleContext extends ParserRuleContext {
        public TerminalNode REFERENCE() { return getToken(PbxprojParser.REFERENCE, 0); }
        public Isa_pbx_build_ruleContext isa_pbx_build_rule() {
            return getRuleContext(Isa_pbx_build_ruleContext.class,0);
        }
        public Compiler_specContext compiler_spec() {
            return getRuleContext(Compiler_specContext.class,0);
        }
        public File_typeContext file_type() {
            return getRuleContext(File_typeContext.class,0);
        }
        public Input_filesContext input_files() {
            return getRuleContext(Input_filesContext.class,0);
        }
        public Is_editableContext is_editable() {
            return getRuleContext(Is_editableContext.class,0);
        }
        public Output_filesContext output_files() {
            return getRuleContext(Output_filesContext.class,0);
        }
        public File_patternsContext file_patterns() {
            return getRuleContext(File_patternsContext.class,0);
        }
        public Run_once_per_archContext run_once_per_arch() {
            return getRuleContext(Run_once_per_archContext.class,0);
        }
        public ScriptContext script() {
            return getRuleContext(ScriptContext.class,0);
        }
        public Pbx_build_ruleContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_pbx_build_rule; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterPbx_build_rule(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitPbx_build_rule(this);
        }
    }

    public final Pbx_build_ruleContext pbx_build_rule() throws RecognitionException {
        Pbx_build_ruleContext _localctx = new Pbx_build_ruleContext(_ctx, getState());
        enterRule(_localctx, 68, RULE_pbx_build_rule);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(659);
                match(REFERENCE);
                setState(660);
                match(T__2);
                setState(661);
                match(T__0);
                setState(662);
                isa_pbx_build_rule();
                setState(663);
                compiler_spec();
                setState(665);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==FILE_PATTERNS) {
                    {
                        setState(664);
                        file_patterns();
                    }
                }

                setState(667);
                file_type();
                setState(668);
                input_files();
                setState(669);
                is_editable();
                setState(670);
                output_files();
                setState(672);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==RUN_ONCE_PER_ARCH) {
                    {
                        setState(671);
                        run_once_per_arch();
                    }
                }

                setState(675);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==SCRIPT) {
                    {
                        setState(674);
                        script();
                    }
                }

                setState(677);
                match(T__1);
                setState(678);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Pbx_build_styleContext extends ParserRuleContext {
        public TerminalNode REFERENCE() { return getToken(PbxprojParser.REFERENCE, 0); }
        public Isa_pbx_build_styleContext isa_pbx_build_style() {
            return getRuleContext(Isa_pbx_build_styleContext.class,0);
        }
        public Build_settingsContext build_settings() {
            return getRuleContext(Build_settingsContext.class,0);
        }
        public NameContext name() {
            return getRuleContext(NameContext.class,0);
        }
        public Pbx_build_styleContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_pbx_build_style; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterPbx_build_style(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitPbx_build_style(this);
        }
    }

    public final Pbx_build_styleContext pbx_build_style() throws RecognitionException {
        Pbx_build_styleContext _localctx = new Pbx_build_styleContext(_ctx, getState());
        enterRule(_localctx, 70, RULE_pbx_build_style);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(680);
                match(REFERENCE);
                setState(681);
                match(T__2);
                setState(682);
                match(T__0);
                setState(683);
                isa_pbx_build_style();
                setState(685);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==BUILD_SETTINGS) {
                    {
                        setState(684);
                        build_settings();
                    }
                }

                setState(688);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==NAME) {
                    {
                        setState(687);
                        name();
                    }
                }

                setState(690);
                match(T__1);
                setState(691);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Pbx_container_item_proxyContext extends ParserRuleContext {
        public TerminalNode REFERENCE() { return getToken(PbxprojParser.REFERENCE, 0); }
        public Isa_pbx_container_item_proxyContext isa_pbx_container_item_proxy() {
            return getRuleContext(Isa_pbx_container_item_proxyContext.class,0);
        }
        public Container_portalContext container_portal() {
            return getRuleContext(Container_portalContext.class,0);
        }
        public Proxy_typeContext proxy_type() {
            return getRuleContext(Proxy_typeContext.class,0);
        }
        public Remote_global_id_stringContext remote_global_id_string() {
            return getRuleContext(Remote_global_id_stringContext.class,0);
        }
        public Remote_infoContext remote_info() {
            return getRuleContext(Remote_infoContext.class,0);
        }
        public Pbx_container_item_proxyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_pbx_container_item_proxy; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterPbx_container_item_proxy(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitPbx_container_item_proxy(this);
        }
    }

    public final Pbx_container_item_proxyContext pbx_container_item_proxy() throws RecognitionException {
        Pbx_container_item_proxyContext _localctx = new Pbx_container_item_proxyContext(_ctx, getState());
        enterRule(_localctx, 72, RULE_pbx_container_item_proxy);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(693);
                match(REFERENCE);
                setState(694);
                match(T__2);
                setState(695);
                match(T__0);
                setState(696);
                isa_pbx_container_item_proxy();
                setState(697);
                container_portal();
                setState(698);
                proxy_type();
                setState(699);
                remote_global_id_string();
                setState(700);
                remote_info();
                setState(701);
                match(T__1);
                setState(702);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Pbx_copy_files_build_phaseContext extends ParserRuleContext {
        public TerminalNode REFERENCE() { return getToken(PbxprojParser.REFERENCE, 0); }
        public Isa_pbx_copy_files_build_phaseContext isa_pbx_copy_files_build_phase() {
            return getRuleContext(Isa_pbx_copy_files_build_phaseContext.class,0);
        }
        public Build_action_maskContext build_action_mask() {
            return getRuleContext(Build_action_maskContext.class,0);
        }
        public Dst_subfolder_specContext dst_subfolder_spec() {
            return getRuleContext(Dst_subfolder_specContext.class,0);
        }
        public Run_only_for_deployment_postprocessingContext run_only_for_deployment_postprocessing() {
            return getRuleContext(Run_only_for_deployment_postprocessingContext.class,0);
        }
        public Dst_pathContext dst_path() {
            return getRuleContext(Dst_pathContext.class,0);
        }
        public FilesContext files() {
            return getRuleContext(FilesContext.class,0);
        }
        public NameContext name() {
            return getRuleContext(NameContext.class,0);
        }
        public Pbx_copy_files_build_phaseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_pbx_copy_files_build_phase; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterPbx_copy_files_build_phase(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitPbx_copy_files_build_phase(this);
        }
    }

    public final Pbx_copy_files_build_phaseContext pbx_copy_files_build_phase() throws RecognitionException {
        Pbx_copy_files_build_phaseContext _localctx = new Pbx_copy_files_build_phaseContext(_ctx, getState());
        enterRule(_localctx, 74, RULE_pbx_copy_files_build_phase);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(704);
                match(REFERENCE);
                setState(705);
                match(T__2);
                setState(706);
                match(T__0);
                setState(707);
                isa_pbx_copy_files_build_phase();
                setState(708);
                build_action_mask();
                setState(710);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==DST_PATH) {
                    {
                        setState(709);
                        dst_path();
                    }
                }

                setState(712);
                dst_subfolder_spec();
                setState(714);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==FILES) {
                    {
                        setState(713);
                        files();
                    }
                }

                setState(717);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==NAME) {
                    {
                        setState(716);
                        name();
                    }
                }

                setState(719);
                run_only_for_deployment_postprocessing();
                setState(720);
                match(T__1);
                setState(721);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Pbx_file_referenceContext extends ParserRuleContext {
        public TerminalNode REFERENCE() { return getToken(PbxprojParser.REFERENCE, 0); }
        public Isa_pbx_file_referenceContext isa_pbx_file_reference() {
            return getRuleContext(Isa_pbx_file_referenceContext.class,0);
        }
        public CommentsContext comments() {
            return getRuleContext(CommentsContext.class,0);
        }
        public List<File_encodingContext> file_encoding() {
            return getRuleContexts(File_encodingContext.class);
        }
        public File_encodingContext file_encoding(int i) {
            return getRuleContext(File_encodingContext.class,i);
        }
        public Explicit_file_typeContext explicit_file_type() {
            return getRuleContext(Explicit_file_typeContext.class,0);
        }
        public Include_in_indexContext include_in_index() {
            return getRuleContext(Include_in_indexContext.class,0);
        }
        public Indent_widthContext indent_width() {
            return getRuleContext(Indent_widthContext.class,0);
        }
        public Last_known_file_typeContext last_known_file_type() {
            return getRuleContext(Last_known_file_typeContext.class,0);
        }
        public Line_endingContext line_ending() {
            return getRuleContext(Line_endingContext.class,0);
        }
        public NameContext name() {
            return getRuleContext(NameContext.class,0);
        }
        public PathContext path() {
            return getRuleContext(PathContext.class,0);
        }
        public Ref_typeContext ref_type() {
            return getRuleContext(Ref_typeContext.class,0);
        }
        public Plist_structure_definition_identifierContext plist_structure_definition_identifier() {
            return getRuleContext(Plist_structure_definition_identifierContext.class,0);
        }
        public Source_treeContext source_tree() {
            return getRuleContext(Source_treeContext.class,0);
        }
        public Tab_widthContext tab_width() {
            return getRuleContext(Tab_widthContext.class,0);
        }
        public Xc_language_specification_identifierContext xc_language_specification_identifier() {
            return getRuleContext(Xc_language_specification_identifierContext.class,0);
        }
        public Uses_tabsContext uses_tabs() {
            return getRuleContext(Uses_tabsContext.class,0);
        }
        public Wraps_linesContext wraps_lines() {
            return getRuleContext(Wraps_linesContext.class,0);
        }
        public Pbx_file_referenceContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_pbx_file_reference; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterPbx_file_reference(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitPbx_file_reference(this);
        }
    }

    public final Pbx_file_referenceContext pbx_file_reference() throws RecognitionException {
        Pbx_file_referenceContext _localctx = new Pbx_file_referenceContext(_ctx, getState());
        enterRule(_localctx, 76, RULE_pbx_file_reference);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(723);
                match(REFERENCE);
                setState(724);
                match(T__2);
                setState(725);
                match(T__0);
                setState(726);
                isa_pbx_file_reference();
                setState(728);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==COMMENTS) {
                    {
                        setState(727);
                        comments();
                    }
                }

                setState(731);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
                    case 1:
                    {
                        setState(730);
                        file_encoding();
                    }
                    break;
                }
                setState(734);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==EXPLICIT_FILE_TYPE) {
                    {
                        setState(733);
                        explicit_file_type();
                    }
                }

                setState(737);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==FILE_ENCODING) {
                    {
                        setState(736);
                        file_encoding();
                    }
                }

                setState(740);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==INCLUDE_IN_INDEX) {
                    {
                        setState(739);
                        include_in_index();
                    }
                }

                setState(743);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==INDENT_WIDTH) {
                    {
                        setState(742);
                        indent_width();
                    }
                }

                setState(746);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==LAST_KNOWN_FILE_TYPE) {
                    {
                        setState(745);
                        last_known_file_type();
                    }
                }

                setState(749);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==LINE_ENDING) {
                    {
                        setState(748);
                        line_ending();
                    }
                }

                setState(752);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==NAME) {
                    {
                        setState(751);
                        name();
                    }
                }

                setState(755);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==PATH) {
                    {
                        setState(754);
                        path();
                    }
                }

                setState(758);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==REF_TYPE) {
                    {
                        setState(757);
                        ref_type();
                    }
                }

                setState(761);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==PLIST_STRUCTURE_DEFINITION_IDENTIFIER) {
                    {
                        setState(760);
                        plist_structure_definition_identifier();
                    }
                }

                setState(764);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==SOURCE_TREE) {
                    {
                        setState(763);
                        source_tree();
                    }
                }

                setState(767);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==TAB_WIDTH) {
                    {
                        setState(766);
                        tab_width();
                    }
                }

                setState(770);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==XC_LANGUAGE_SPECIFICATION_IDENTIFIER) {
                    {
                        setState(769);
                        xc_language_specification_identifier();
                    }
                }

                setState(773);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==USES_TABS) {
                    {
                        setState(772);
                        uses_tabs();
                    }
                }

                setState(776);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==WRAPS_LINES) {
                    {
                        setState(775);
                        wraps_lines();
                    }
                }

                setState(778);
                match(T__1);
                setState(779);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Pbx_frameworks_build_phaseContext extends ParserRuleContext {
        public TerminalNode REFERENCE() { return getToken(PbxprojParser.REFERENCE, 0); }
        public Isa_pbx_frameworks_build_phaseContext isa_pbx_frameworks_build_phase() {
            return getRuleContext(Isa_pbx_frameworks_build_phaseContext.class,0);
        }
        public Build_action_maskContext build_action_mask() {
            return getRuleContext(Build_action_maskContext.class,0);
        }
        public FilesContext files() {
            return getRuleContext(FilesContext.class,0);
        }
        public Run_only_for_deployment_postprocessingContext run_only_for_deployment_postprocessing() {
            return getRuleContext(Run_only_for_deployment_postprocessingContext.class,0);
        }
        public Pbx_frameworks_build_phaseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_pbx_frameworks_build_phase; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterPbx_frameworks_build_phase(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitPbx_frameworks_build_phase(this);
        }
    }

    public final Pbx_frameworks_build_phaseContext pbx_frameworks_build_phase() throws RecognitionException {
        Pbx_frameworks_build_phaseContext _localctx = new Pbx_frameworks_build_phaseContext(_ctx, getState());
        enterRule(_localctx, 78, RULE_pbx_frameworks_build_phase);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(781);
                match(REFERENCE);
                setState(782);
                match(T__2);
                setState(783);
                match(T__0);
                setState(784);
                isa_pbx_frameworks_build_phase();
                setState(785);
                build_action_mask();
                setState(786);
                files();
                setState(787);
                run_only_for_deployment_postprocessing();
                setState(788);
                match(T__1);
                setState(789);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Pbx_groupContext extends ParserRuleContext {
        public TerminalNode REFERENCE() { return getToken(PbxprojParser.REFERENCE, 0); }
        public Isa_pbx_groupContext isa_pbx_group() {
            return getRuleContext(Isa_pbx_groupContext.class,0);
        }
        public ChildrenContext children() {
            return getRuleContext(ChildrenContext.class,0);
        }
        public Source_treeContext source_tree() {
            return getRuleContext(Source_treeContext.class,0);
        }
        public CommentsContext comments() {
            return getRuleContext(CommentsContext.class,0);
        }
        public Indent_widthContext indent_width() {
            return getRuleContext(Indent_widthContext.class,0);
        }
        public Include_in_indexContext include_in_index() {
            return getRuleContext(Include_in_indexContext.class,0);
        }
        public NameContext name() {
            return getRuleContext(NameContext.class,0);
        }
        public PathContext path() {
            return getRuleContext(PathContext.class,0);
        }
        public Tab_widthContext tab_width() {
            return getRuleContext(Tab_widthContext.class,0);
        }
        public Uses_tabsContext uses_tabs() {
            return getRuleContext(Uses_tabsContext.class,0);
        }
        public Wraps_linesContext wraps_lines() {
            return getRuleContext(Wraps_linesContext.class,0);
        }
        public Pbx_groupContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_pbx_group; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterPbx_group(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitPbx_group(this);
        }
    }

    public final Pbx_groupContext pbx_group() throws RecognitionException {
        Pbx_groupContext _localctx = new Pbx_groupContext(_ctx, getState());
        enterRule(_localctx, 80, RULE_pbx_group);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(791);
                match(REFERENCE);
                setState(792);
                match(T__2);
                setState(793);
                match(T__0);
                setState(794);
                isa_pbx_group();
                setState(795);
                children();
                setState(797);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==COMMENTS) {
                    {
                        setState(796);
                        comments();
                    }
                }

                setState(800);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==INDENT_WIDTH) {
                    {
                        setState(799);
                        indent_width();
                    }
                }

                setState(803);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==INCLUDE_IN_INDEX) {
                    {
                        setState(802);
                        include_in_index();
                    }
                }

                setState(806);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==NAME) {
                    {
                        setState(805);
                        name();
                    }
                }

                setState(809);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==PATH) {
                    {
                        setState(808);
                        path();
                    }
                }

                setState(811);
                source_tree();
                setState(813);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==TAB_WIDTH) {
                    {
                        setState(812);
                        tab_width();
                    }
                }

                setState(816);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==USES_TABS) {
                    {
                        setState(815);
                        uses_tabs();
                    }
                }

                setState(819);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==WRAPS_LINES) {
                    {
                        setState(818);
                        wraps_lines();
                    }
                }

                setState(821);
                match(T__1);
                setState(822);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Pbx_headers_build_phaseContext extends ParserRuleContext {
        public TerminalNode REFERENCE() { return getToken(PbxprojParser.REFERENCE, 0); }
        public Isa_pbx_header_build_phaseContext isa_pbx_header_build_phase() {
            return getRuleContext(Isa_pbx_header_build_phaseContext.class,0);
        }
        public Build_action_maskContext build_action_mask() {
            return getRuleContext(Build_action_maskContext.class,0);
        }
        public FilesContext files() {
            return getRuleContext(FilesContext.class,0);
        }
        public Run_only_for_deployment_postprocessingContext run_only_for_deployment_postprocessing() {
            return getRuleContext(Run_only_for_deployment_postprocessingContext.class,0);
        }
        public Pbx_headers_build_phaseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_pbx_headers_build_phase; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterPbx_headers_build_phase(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitPbx_headers_build_phase(this);
        }
    }

    public final Pbx_headers_build_phaseContext pbx_headers_build_phase() throws RecognitionException {
        Pbx_headers_build_phaseContext _localctx = new Pbx_headers_build_phaseContext(_ctx, getState());
        enterRule(_localctx, 82, RULE_pbx_headers_build_phase);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(824);
                match(REFERENCE);
                setState(825);
                match(T__2);
                setState(826);
                match(T__0);
                setState(827);
                isa_pbx_header_build_phase();
                setState(828);
                build_action_mask();
                setState(829);
                files();
                setState(830);
                run_only_for_deployment_postprocessing();
                setState(831);
                match(T__1);
                setState(832);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Pbx_native_targetContext extends ParserRuleContext {
        public TerminalNode REFERENCE() { return getToken(PbxprojParser.REFERENCE, 0); }
        public Isa_pbx_native_targetContext isa_pbx_native_target() {
            return getRuleContext(Isa_pbx_native_targetContext.class,0);
        }
        public Build_configuration_listContext build_configuration_list() {
            return getRuleContext(Build_configuration_listContext.class,0);
        }
        public Build_phasesContext build_phases() {
            return getRuleContext(Build_phasesContext.class,0);
        }
        public Build_rulesContext build_rules() {
            return getRuleContext(Build_rulesContext.class,0);
        }
        public DependenciesContext dependencies() {
            return getRuleContext(DependenciesContext.class,0);
        }
        public NameContext name() {
            return getRuleContext(NameContext.class,0);
        }
        public Product_nameContext product_name() {
            return getRuleContext(Product_nameContext.class,0);
        }
        public Product_typeContext product_type() {
            return getRuleContext(Product_typeContext.class,0);
        }
        public CommentsContext comments() {
            return getRuleContext(CommentsContext.class,0);
        }
        public Build_settingsContext build_settings() {
            return getRuleContext(Build_settingsContext.class,0);
        }
        public Product_install_pathContext product_install_path() {
            return getRuleContext(Product_install_pathContext.class,0);
        }
        public Package_product_dependenciesContext package_product_dependencies() {
            return getRuleContext(Package_product_dependenciesContext.class,0);
        }
        public Product_referenceContext product_reference() {
            return getRuleContext(Product_referenceContext.class,0);
        }
        public Pbx_native_targetContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_pbx_native_target; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterPbx_native_target(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitPbx_native_target(this);
        }
    }

    public final Pbx_native_targetContext pbx_native_target() throws RecognitionException {
        Pbx_native_targetContext _localctx = new Pbx_native_targetContext(_ctx, getState());
        enterRule(_localctx, 84, RULE_pbx_native_target);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(834);
                match(REFERENCE);
                setState(835);
                match(T__2);
                setState(836);
                match(T__0);
                setState(837);
                isa_pbx_native_target();
                setState(838);
                build_configuration_list();
                setState(839);
                build_phases();
                setState(840);
                build_rules();
                setState(842);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==COMMENTS) {
                    {
                        setState(841);
                        comments();
                    }
                }

                setState(845);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==BUILD_SETTINGS) {
                    {
                        setState(844);
                        build_settings();
                    }
                }

                setState(847);
                dependencies();
                setState(848);
                name();
                setState(850);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==PRODUCT_INSTALL_PATH) {
                    {
                        setState(849);
                        product_install_path();
                    }
                }

                setState(853);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==PACKAGE_PRODUCT_DEPENDENCIES) {
                    {
                        setState(852);
                        package_product_dependencies();
                    }
                }

                setState(855);
                product_name();
                setState(857);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==PRODUCT_REFERENCE) {
                    {
                        setState(856);
                        product_reference();
                    }
                }

                setState(859);
                product_type();
                setState(860);
                match(T__1);
                setState(861);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Pbx_legacy_targetContext extends ParserRuleContext {
        public TerminalNode REFERENCE() { return getToken(PbxprojParser.REFERENCE, 0); }
        public Isa_pbx_legacy_targetContext isa_pbx_legacy_target() {
            return getRuleContext(Isa_pbx_legacy_targetContext.class,0);
        }
        public Build_arguments_stringContext build_arguments_string() {
            return getRuleContext(Build_arguments_stringContext.class,0);
        }
        public Build_configuration_listContext build_configuration_list() {
            return getRuleContext(Build_configuration_listContext.class,0);
        }
        public Build_phasesContext build_phases() {
            return getRuleContext(Build_phasesContext.class,0);
        }
        public Build_tool_pathContext build_tool_path() {
            return getRuleContext(Build_tool_pathContext.class,0);
        }
        public Build_working_directoryContext build_working_directory() {
            return getRuleContext(Build_working_directoryContext.class,0);
        }
        public DependenciesContext dependencies() {
            return getRuleContext(DependenciesContext.class,0);
        }
        public NameContext name() {
            return getRuleContext(NameContext.class,0);
        }
        public Pass_build_settings_in_environmentContext pass_build_settings_in_environment() {
            return getRuleContext(Pass_build_settings_in_environmentContext.class,0);
        }
        public Product_nameContext product_name() {
            return getRuleContext(Product_nameContext.class,0);
        }
        public Pbx_legacy_targetContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_pbx_legacy_target; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterPbx_legacy_target(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitPbx_legacy_target(this);
        }
    }

    public final Pbx_legacy_targetContext pbx_legacy_target() throws RecognitionException {
        Pbx_legacy_targetContext _localctx = new Pbx_legacy_targetContext(_ctx, getState());
        enterRule(_localctx, 86, RULE_pbx_legacy_target);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(863);
                match(REFERENCE);
                setState(864);
                match(T__2);
                setState(865);
                match(T__0);
                setState(866);
                isa_pbx_legacy_target();
                setState(867);
                build_arguments_string();
                setState(868);
                build_configuration_list();
                setState(869);
                build_phases();
                setState(870);
                build_tool_path();
                setState(871);
                build_working_directory();
                setState(872);
                dependencies();
                setState(873);
                name();
                setState(874);
                pass_build_settings_in_environment();
                setState(875);
                product_name();
                setState(876);
                match(T__1);
                setState(877);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Pbx_projectContext extends ParserRuleContext {
        public TerminalNode REFERENCE() { return getToken(PbxprojParser.REFERENCE, 0); }
        public Isa_pbx_projectContext isa_pbx_project() {
            return getRuleContext(Isa_pbx_projectContext.class,0);
        }
        public Build_configuration_listContext build_configuration_list() {
            return getRuleContext(Build_configuration_listContext.class,0);
        }
        public Has_scanned_for_encodingsContext has_scanned_for_encodings() {
            return getRuleContext(Has_scanned_for_encodingsContext.class,0);
        }
        public Main_groupContext main_group() {
            return getRuleContext(Main_groupContext.class,0);
        }
        public Project_dir_pathContext project_dir_path() {
            return getRuleContext(Project_dir_pathContext.class,0);
        }
        public TargetsContext targets() {
            return getRuleContext(TargetsContext.class,0);
        }
        public AttributesContext attributes() {
            return getRuleContext(AttributesContext.class,0);
        }
        public Build_settingsContext build_settings() {
            return getRuleContext(Build_settingsContext.class,0);
        }
        public Build_stylesContext build_styles() {
            return getRuleContext(Build_stylesContext.class,0);
        }
        public Compatibility_versionContext compatibility_version() {
            return getRuleContext(Compatibility_versionContext.class,0);
        }
        public Development_regionContext development_region() {
            return getRuleContext(Development_regionContext.class,0);
        }
        public Known_regionsContext known_regions() {
            return getRuleContext(Known_regionsContext.class,0);
        }
        public Package_referencesContext package_references() {
            return getRuleContext(Package_referencesContext.class,0);
        }
        public Product_ref_groupContext product_ref_group() {
            return getRuleContext(Product_ref_groupContext.class,0);
        }
        public Project_referencesContext project_references() {
            return getRuleContext(Project_referencesContext.class,0);
        }
        public Project_rootContext project_root() {
            return getRuleContext(Project_rootContext.class,0);
        }
        public Pbx_projectContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_pbx_project; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterPbx_project(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitPbx_project(this);
        }
    }

    public final Pbx_projectContext pbx_project() throws RecognitionException {
        Pbx_projectContext _localctx = new Pbx_projectContext(_ctx, getState());
        enterRule(_localctx, 88, RULE_pbx_project);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(879);
                match(REFERENCE);
                setState(880);
                match(T__2);
                setState(881);
                match(T__0);
                setState(882);
                isa_pbx_project();
                setState(884);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==ATTRIBUTES) {
                    {
                        setState(883);
                        attributes();
                    }
                }

                setState(886);
                build_configuration_list();
                setState(888);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==BUILD_SETTINGS) {
                    {
                        setState(887);
                        build_settings();
                    }
                }

                setState(891);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==BUILD_STYLES) {
                    {
                        setState(890);
                        build_styles();
                    }
                }

                setState(894);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==COMPATIBILITY_VERSION) {
                    {
                        setState(893);
                        compatibility_version();
                    }
                }

                setState(897);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==DEVELOPMENT_REGION) {
                    {
                        setState(896);
                        development_region();
                    }
                }

                setState(899);
                has_scanned_for_encodings();
                setState(901);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==KNOWN_REGIONS) {
                    {
                        setState(900);
                        known_regions();
                    }
                }

                setState(903);
                main_group();
                setState(905);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==PACKAGE_REFERENCES) {
                    {
                        setState(904);
                        package_references();
                    }
                }

                setState(908);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==PRODUCT_REF_GROUP) {
                    {
                        setState(907);
                        product_ref_group();
                    }
                }

                setState(910);
                project_dir_path();
                setState(912);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==PROJECT_REFERENCES) {
                    {
                        setState(911);
                        project_references();
                    }
                }

                setState(915);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==PROJECT_ROOT) {
                    {
                        setState(914);
                        project_root();
                    }
                }

                setState(917);
                targets();
                setState(918);
                match(T__1);
                setState(919);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Pbx_reference_proxyContext extends ParserRuleContext {
        public TerminalNode REFERENCE() { return getToken(PbxprojParser.REFERENCE, 0); }
        public Isa_pbx_reference_proxyContext isa_pbx_reference_proxy() {
            return getRuleContext(Isa_pbx_reference_proxyContext.class,0);
        }
        public File_typeContext file_type() {
            return getRuleContext(File_typeContext.class,0);
        }
        public PathContext path() {
            return getRuleContext(PathContext.class,0);
        }
        public Remote_refContext remote_ref() {
            return getRuleContext(Remote_refContext.class,0);
        }
        public Source_treeContext source_tree() {
            return getRuleContext(Source_treeContext.class,0);
        }
        public NameContext name() {
            return getRuleContext(NameContext.class,0);
        }
        public Pbx_reference_proxyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_pbx_reference_proxy; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterPbx_reference_proxy(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitPbx_reference_proxy(this);
        }
    }

    public final Pbx_reference_proxyContext pbx_reference_proxy() throws RecognitionException {
        Pbx_reference_proxyContext _localctx = new Pbx_reference_proxyContext(_ctx, getState());
        enterRule(_localctx, 90, RULE_pbx_reference_proxy);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(921);
                match(REFERENCE);
                setState(922);
                match(T__2);
                setState(923);
                match(T__0);
                setState(924);
                isa_pbx_reference_proxy();
                setState(925);
                file_type();
                setState(927);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==NAME) {
                    {
                        setState(926);
                        name();
                    }
                }

                setState(929);
                path();
                setState(930);
                remote_ref();
                setState(931);
                source_tree();
                setState(932);
                match(T__1);
                setState(933);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Pbx_resources_build_phaseContext extends ParserRuleContext {
        public TerminalNode REFERENCE() { return getToken(PbxprojParser.REFERENCE, 0); }
        public Isa_pbx_resources_build_phaseContext isa_pbx_resources_build_phase() {
            return getRuleContext(Isa_pbx_resources_build_phaseContext.class,0);
        }
        public Build_action_maskContext build_action_mask() {
            return getRuleContext(Build_action_maskContext.class,0);
        }
        public FilesContext files() {
            return getRuleContext(FilesContext.class,0);
        }
        public Run_only_for_deployment_postprocessingContext run_only_for_deployment_postprocessing() {
            return getRuleContext(Run_only_for_deployment_postprocessingContext.class,0);
        }
        public Pbx_resources_build_phaseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_pbx_resources_build_phase; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterPbx_resources_build_phase(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitPbx_resources_build_phase(this);
        }
    }

    public final Pbx_resources_build_phaseContext pbx_resources_build_phase() throws RecognitionException {
        Pbx_resources_build_phaseContext _localctx = new Pbx_resources_build_phaseContext(_ctx, getState());
        enterRule(_localctx, 92, RULE_pbx_resources_build_phase);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(935);
                match(REFERENCE);
                setState(936);
                match(T__2);
                setState(937);
                match(T__0);
                setState(938);
                isa_pbx_resources_build_phase();
                setState(939);
                build_action_mask();
                setState(940);
                files();
                setState(941);
                run_only_for_deployment_postprocessing();
                setState(942);
                match(T__1);
                setState(943);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Pbx_shell_script_build_phaseContext extends ParserRuleContext {
        public TerminalNode REFERENCE() { return getToken(PbxprojParser.REFERENCE, 0); }
        public Isa_pbx_shell_script_build_phaseContext isa_pbx_shell_script_build_phase() {
            return getRuleContext(Isa_pbx_shell_script_build_phaseContext.class,0);
        }
        public Build_action_maskContext build_action_mask() {
            return getRuleContext(Build_action_maskContext.class,0);
        }
        public FilesContext files() {
            return getRuleContext(FilesContext.class,0);
        }
        public Run_only_for_deployment_postprocessingContext run_only_for_deployment_postprocessing() {
            return getRuleContext(Run_only_for_deployment_postprocessingContext.class,0);
        }
        public Shell_pathContext shell_path() {
            return getRuleContext(Shell_pathContext.class,0);
        }
        public Shell_scriptContext shell_script() {
            return getRuleContext(Shell_scriptContext.class,0);
        }
        public Always_out_of_dateContext always_out_of_date() {
            return getRuleContext(Always_out_of_dateContext.class,0);
        }
        public Input_file_list_pathsContext input_file_list_paths() {
            return getRuleContext(Input_file_list_pathsContext.class,0);
        }
        public Input_pathsContext input_paths() {
            return getRuleContext(Input_pathsContext.class,0);
        }
        public NameContext name() {
            return getRuleContext(NameContext.class,0);
        }
        public Output_file_list_pathsContext output_file_list_paths() {
            return getRuleContext(Output_file_list_pathsContext.class,0);
        }
        public Output_pathsContext output_paths() {
            return getRuleContext(Output_pathsContext.class,0);
        }
        public Show_env_vars_in_logContext show_env_vars_in_log() {
            return getRuleContext(Show_env_vars_in_logContext.class,0);
        }
        public Pbx_shell_script_build_phaseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_pbx_shell_script_build_phase; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterPbx_shell_script_build_phase(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitPbx_shell_script_build_phase(this);
        }
    }

    public final Pbx_shell_script_build_phaseContext pbx_shell_script_build_phase() throws RecognitionException {
        Pbx_shell_script_build_phaseContext _localctx = new Pbx_shell_script_build_phaseContext(_ctx, getState());
        enterRule(_localctx, 94, RULE_pbx_shell_script_build_phase);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(945);
                match(REFERENCE);
                setState(946);
                match(T__2);
                setState(947);
                match(T__0);
                setState(948);
                isa_pbx_shell_script_build_phase();
                setState(950);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==ALWAYS_OUT_OF_DATE) {
                    {
                        setState(949);
                        always_out_of_date();
                    }
                }

                setState(952);
                build_action_mask();
                setState(953);
                files();
                setState(955);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==INPUT_FILE_LIST_PATHS) {
                    {
                        setState(954);
                        input_file_list_paths();
                    }
                }

                setState(958);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==INPUT_PATHS) {
                    {
                        setState(957);
                        input_paths();
                    }
                }

                setState(961);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==NAME) {
                    {
                        setState(960);
                        name();
                    }
                }

                setState(964);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==OUTPUT_FILE_LIST_PATHS) {
                    {
                        setState(963);
                        output_file_list_paths();
                    }
                }

                setState(967);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==OUTPUT_PATHS) {
                    {
                        setState(966);
                        output_paths();
                    }
                }

                setState(969);
                run_only_for_deployment_postprocessing();
                setState(970);
                shell_path();
                setState(971);
                shell_script();
                setState(973);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==SHOW_ENV_VARS_IN_LOG) {
                    {
                        setState(972);
                        show_env_vars_in_log();
                    }
                }

                setState(975);
                match(T__1);
                setState(976);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Pbx_shell_build_phaseContext extends ParserRuleContext {
        public TerminalNode REFERENCE() { return getToken(PbxprojParser.REFERENCE, 0); }
        public Isa_pbx_shell_build_phaseContext isa_pbx_shell_build_phase() {
            return getRuleContext(Isa_pbx_shell_build_phaseContext.class,0);
        }
        public Build_action_maskContext build_action_mask() {
            return getRuleContext(Build_action_maskContext.class,0);
        }
        public FilesContext files() {
            return getRuleContext(FilesContext.class,0);
        }
        public Input_file_list_pathsContext input_file_list_paths() {
            return getRuleContext(Input_file_list_pathsContext.class,0);
        }
        public Input_pathsContext input_paths() {
            return getRuleContext(Input_pathsContext.class,0);
        }
        public NameContext name() {
            return getRuleContext(NameContext.class,0);
        }
        public Output_file_list_pathsContext output_file_list_paths() {
            return getRuleContext(Output_file_list_pathsContext.class,0);
        }
        public Output_pathsContext output_paths() {
            return getRuleContext(Output_pathsContext.class,0);
        }
        public Run_only_for_deployment_postprocessingContext run_only_for_deployment_postprocessing() {
            return getRuleContext(Run_only_for_deployment_postprocessingContext.class,0);
        }
        public Shell_pathContext shell_path() {
            return getRuleContext(Shell_pathContext.class,0);
        }
        public ShellContext shell() {
            return getRuleContext(ShellContext.class,0);
        }
        public Pbx_shell_build_phaseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_pbx_shell_build_phase; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterPbx_shell_build_phase(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitPbx_shell_build_phase(this);
        }
    }

    public final Pbx_shell_build_phaseContext pbx_shell_build_phase() throws RecognitionException {
        Pbx_shell_build_phaseContext _localctx = new Pbx_shell_build_phaseContext(_ctx, getState());
        enterRule(_localctx, 96, RULE_pbx_shell_build_phase);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(978);
                match(REFERENCE);
                setState(979);
                match(T__2);
                setState(980);
                match(T__0);
                setState(981);
                isa_pbx_shell_build_phase();
                setState(982);
                build_action_mask();
                setState(983);
                files();
                setState(984);
                input_file_list_paths();
                setState(985);
                input_paths();
                setState(986);
                name();
                setState(987);
                output_file_list_paths();
                setState(988);
                output_paths();
                setState(989);
                run_only_for_deployment_postprocessing();
                setState(990);
                shell_path();
                setState(991);
                shell();
                setState(992);
                match(T__1);
                setState(993);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Pbx_sources_build_phaseContext extends ParserRuleContext {
        public TerminalNode REFERENCE() { return getToken(PbxprojParser.REFERENCE, 0); }
        public Isa_pbx_sources_build_phaseContext isa_pbx_sources_build_phase() {
            return getRuleContext(Isa_pbx_sources_build_phaseContext.class,0);
        }
        public Build_action_maskContext build_action_mask() {
            return getRuleContext(Build_action_maskContext.class,0);
        }
        public FilesContext files() {
            return getRuleContext(FilesContext.class,0);
        }
        public Run_only_for_deployment_postprocessingContext run_only_for_deployment_postprocessing() {
            return getRuleContext(Run_only_for_deployment_postprocessingContext.class,0);
        }
        public Pbx_sources_build_phaseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_pbx_sources_build_phase; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterPbx_sources_build_phase(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitPbx_sources_build_phase(this);
        }
    }

    public final Pbx_sources_build_phaseContext pbx_sources_build_phase() throws RecognitionException {
        Pbx_sources_build_phaseContext _localctx = new Pbx_sources_build_phaseContext(_ctx, getState());
        enterRule(_localctx, 98, RULE_pbx_sources_build_phase);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(995);
                match(REFERENCE);
                setState(996);
                match(T__2);
                setState(997);
                match(T__0);
                setState(998);
                isa_pbx_sources_build_phase();
                setState(999);
                build_action_mask();
                setState(1000);
                files();
                setState(1001);
                run_only_for_deployment_postprocessing();
                setState(1002);
                match(T__1);
                setState(1003);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Pbx_target_dependencyContext extends ParserRuleContext {
        public TerminalNode REFERENCE() { return getToken(PbxprojParser.REFERENCE, 0); }
        public Isa_pbx_target_dependencyContext isa_pbx_target_dependency() {
            return getRuleContext(Isa_pbx_target_dependencyContext.class,0);
        }
        public NameContext name() {
            return getRuleContext(NameContext.class,0);
        }
        public Platform_filterContext platform_filter() {
            return getRuleContext(Platform_filterContext.class,0);
        }
        public Platform_filtersContext platform_filters() {
            return getRuleContext(Platform_filtersContext.class,0);
        }
        public Product_refContext product_ref() {
            return getRuleContext(Product_refContext.class,0);
        }
        public TargetContext target() {
            return getRuleContext(TargetContext.class,0);
        }
        public Target_proxyContext target_proxy() {
            return getRuleContext(Target_proxyContext.class,0);
        }
        public Pbx_target_dependencyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_pbx_target_dependency; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterPbx_target_dependency(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitPbx_target_dependency(this);
        }
    }

    public final Pbx_target_dependencyContext pbx_target_dependency() throws RecognitionException {
        Pbx_target_dependencyContext _localctx = new Pbx_target_dependencyContext(_ctx, getState());
        enterRule(_localctx, 100, RULE_pbx_target_dependency);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1005);
                match(REFERENCE);
                setState(1006);
                match(T__2);
                setState(1007);
                match(T__0);
                setState(1008);
                isa_pbx_target_dependency();
                setState(1010);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==NAME) {
                    {
                        setState(1009);
                        name();
                    }
                }

                setState(1013);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==PLATFORM_FILTER) {
                    {
                        setState(1012);
                        platform_filter();
                    }
                }

                setState(1016);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==PLATFORM_FILTERS) {
                    {
                        setState(1015);
                        platform_filters();
                    }
                }

                setState(1019);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==PRODUCT_REF) {
                    {
                        setState(1018);
                        product_ref();
                    }
                }

                setState(1022);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==TARGET) {
                    {
                        setState(1021);
                        target();
                    }
                }

                setState(1025);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==TARGET_PROXY) {
                    {
                        setState(1024);
                        target_proxy();
                    }
                }

                setState(1027);
                match(T__1);
                setState(1028);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Pbx_variant_groupContext extends ParserRuleContext {
        public TerminalNode REFERENCE() { return getToken(PbxprojParser.REFERENCE, 0); }
        public Isa_pbx_variant_groupContext isa_pbx_variant_group() {
            return getRuleContext(Isa_pbx_variant_groupContext.class,0);
        }
        public ChildrenContext children() {
            return getRuleContext(ChildrenContext.class,0);
        }
        public NameContext name() {
            return getRuleContext(NameContext.class,0);
        }
        public Source_treeContext source_tree() {
            return getRuleContext(Source_treeContext.class,0);
        }
        public PathContext path() {
            return getRuleContext(PathContext.class,0);
        }
        public Pbx_variant_groupContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_pbx_variant_group; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterPbx_variant_group(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitPbx_variant_group(this);
        }
    }

    public final Pbx_variant_groupContext pbx_variant_group() throws RecognitionException {
        Pbx_variant_groupContext _localctx = new Pbx_variant_groupContext(_ctx, getState());
        enterRule(_localctx, 102, RULE_pbx_variant_group);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1030);
                match(REFERENCE);
                setState(1031);
                match(T__2);
                setState(1032);
                match(T__0);
                setState(1033);
                isa_pbx_variant_group();
                setState(1034);
                children();
                setState(1035);
                name();
                setState(1037);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==PATH) {
                    {
                        setState(1036);
                        path();
                    }
                }

                setState(1039);
                source_tree();
                setState(1040);
                match(T__1);
                setState(1041);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Xc_build_configurationContext extends ParserRuleContext {
        public TerminalNode REFERENCE() { return getToken(PbxprojParser.REFERENCE, 0); }
        public Isa_xc_build_configurationContext isa_xc_build_configuration() {
            return getRuleContext(Isa_xc_build_configurationContext.class,0);
        }
        public Build_settingsContext build_settings() {
            return getRuleContext(Build_settingsContext.class,0);
        }
        public NameContext name() {
            return getRuleContext(NameContext.class,0);
        }
        public Base_configuration_referenceContext base_configuration_reference() {
            return getRuleContext(Base_configuration_referenceContext.class,0);
        }
        public Xc_build_configurationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_xc_build_configuration; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterXc_build_configuration(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitXc_build_configuration(this);
        }
    }

    public final Xc_build_configurationContext xc_build_configuration() throws RecognitionException {
        Xc_build_configurationContext _localctx = new Xc_build_configurationContext(_ctx, getState());
        enterRule(_localctx, 104, RULE_xc_build_configuration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1043);
                match(REFERENCE);
                setState(1044);
                match(T__2);
                setState(1045);
                match(T__0);
                setState(1046);
                isa_xc_build_configuration();
                setState(1048);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==BASE_CONFIGURATION_REFERENCE) {
                    {
                        setState(1047);
                        base_configuration_reference();
                    }
                }

                setState(1050);
                build_settings();
                setState(1051);
                name();
                setState(1052);
                match(T__1);
                setState(1053);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Xc_configuration_listContext extends ParserRuleContext {
        public TerminalNode REFERENCE() { return getToken(PbxprojParser.REFERENCE, 0); }
        public Isa_xc_configuration_listContext isa_xc_configuration_list() {
            return getRuleContext(Isa_xc_configuration_listContext.class,0);
        }
        public Build_configurationsContext build_configurations() {
            return getRuleContext(Build_configurationsContext.class,0);
        }
        public Default_configuration_is_visibleContext default_configuration_is_visible() {
            return getRuleContext(Default_configuration_is_visibleContext.class,0);
        }
        public Default_configuration_nameContext default_configuration_name() {
            return getRuleContext(Default_configuration_nameContext.class,0);
        }
        public Xc_configuration_listContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_xc_configuration_list; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterXc_configuration_list(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitXc_configuration_list(this);
        }
    }

    public final Xc_configuration_listContext xc_configuration_list() throws RecognitionException {
        Xc_configuration_listContext _localctx = new Xc_configuration_listContext(_ctx, getState());
        enterRule(_localctx, 106, RULE_xc_configuration_list);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1055);
                match(REFERENCE);
                setState(1056);
                match(T__2);
                setState(1057);
                match(T__0);
                setState(1058);
                isa_xc_configuration_list();
                setState(1059);
                build_configurations();
                setState(1060);
                default_configuration_is_visible();
                setState(1062);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==DEFAULT_CONFIGURATION_NAME) {
                    {
                        setState(1061);
                        default_configuration_name();
                    }
                }

                setState(1064);
                match(T__1);
                setState(1065);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Xc_remote_swift_package_referenceContext extends ParserRuleContext {
        public TerminalNode REFERENCE() { return getToken(PbxprojParser.REFERENCE, 0); }
        public Isa_xc_remote_swift_package_referenceContext isa_xc_remote_swift_package_reference() {
            return getRuleContext(Isa_xc_remote_swift_package_referenceContext.class,0);
        }
        public Repository_urlContext repository_url() {
            return getRuleContext(Repository_urlContext.class,0);
        }
        public RequirementContext requirement() {
            return getRuleContext(RequirementContext.class,0);
        }
        public Xc_remote_swift_package_referenceContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_xc_remote_swift_package_reference; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterXc_remote_swift_package_reference(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitXc_remote_swift_package_reference(this);
        }
    }

    public final Xc_remote_swift_package_referenceContext xc_remote_swift_package_reference() throws RecognitionException {
        Xc_remote_swift_package_referenceContext _localctx = new Xc_remote_swift_package_referenceContext(_ctx, getState());
        enterRule(_localctx, 108, RULE_xc_remote_swift_package_reference);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1067);
                match(REFERENCE);
                setState(1068);
                match(T__2);
                setState(1069);
                match(T__0);
                setState(1070);
                isa_xc_remote_swift_package_reference();
                setState(1071);
                repository_url();
                setState(1072);
                requirement();
                setState(1073);
                match(T__1);
                setState(1074);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Xc_swift_package_product_dependencyContext extends ParserRuleContext {
        public TerminalNode REFERENCE() { return getToken(PbxprojParser.REFERENCE, 0); }
        public Isa_xc_swift_package_product_dependencyContext isa_xc_swift_package_product_dependency() {
            return getRuleContext(Isa_xc_swift_package_product_dependencyContext.class,0);
        }
        public Product_nameContext product_name() {
            return getRuleContext(Product_nameContext.class,0);
        }
        public Xc_packageContext xc_package() {
            return getRuleContext(Xc_packageContext.class,0);
        }
        public Xc_swift_package_product_dependencyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_xc_swift_package_product_dependency; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterXc_swift_package_product_dependency(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitXc_swift_package_product_dependency(this);
        }
    }

    public final Xc_swift_package_product_dependencyContext xc_swift_package_product_dependency() throws RecognitionException {
        Xc_swift_package_product_dependencyContext _localctx = new Xc_swift_package_product_dependencyContext(_ctx, getState());
        enterRule(_localctx, 110, RULE_xc_swift_package_product_dependency);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1076);
                match(REFERENCE);
                setState(1077);
                match(T__2);
                setState(1078);
                match(T__0);
                setState(1079);
                isa_xc_swift_package_product_dependency();
                setState(1081);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==PACKAGE) {
                    {
                        setState(1080);
                        xc_package();
                    }
                }

                setState(1083);
                product_name();
                setState(1084);
                match(T__1);
                setState(1085);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Xc_version_groupContext extends ParserRuleContext {
        public TerminalNode REFERENCE() { return getToken(PbxprojParser.REFERENCE, 0); }
        public Isa_xc_version_groupContext isa_xc_version_group() {
            return getRuleContext(Isa_xc_version_groupContext.class,0);
        }
        public ChildrenContext children() {
            return getRuleContext(ChildrenContext.class,0);
        }
        public Current_versionContext current_version() {
            return getRuleContext(Current_versionContext.class,0);
        }
        public PathContext path() {
            return getRuleContext(PathContext.class,0);
        }
        public Source_treeContext source_tree() {
            return getRuleContext(Source_treeContext.class,0);
        }
        public Version_group_typeContext version_group_type() {
            return getRuleContext(Version_group_typeContext.class,0);
        }
        public NameContext name() {
            return getRuleContext(NameContext.class,0);
        }
        public Xc_version_groupContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_xc_version_group; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterXc_version_group(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitXc_version_group(this);
        }
    }

    public final Xc_version_groupContext xc_version_group() throws RecognitionException {
        Xc_version_groupContext _localctx = new Xc_version_groupContext(_ctx, getState());
        enterRule(_localctx, 112, RULE_xc_version_group);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1087);
                match(REFERENCE);
                setState(1088);
                match(T__2);
                setState(1089);
                match(T__0);
                setState(1090);
                isa_xc_version_group();
                setState(1091);
                children();
                setState(1092);
                current_version();
                setState(1094);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==NAME) {
                    {
                        setState(1093);
                        name();
                    }
                }

                setState(1096);
                path();
                setState(1097);
                source_tree();
                setState(1098);
                version_group_type();
                setState(1099);
                match(T__1);
                setState(1100);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Isa_pbx_aggregate_targetContext extends ParserRuleContext {
        public TerminalNode ISA() { return getToken(PbxprojParser.ISA, 0); }
        public TerminalNode PBX_AGGREGATE_TARGET() { return getToken(PbxprojParser.PBX_AGGREGATE_TARGET, 0); }
        public Isa_pbx_aggregate_targetContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_isa_pbx_aggregate_target; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterIsa_pbx_aggregate_target(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitIsa_pbx_aggregate_target(this);
        }
    }

    public final Isa_pbx_aggregate_targetContext isa_pbx_aggregate_target() throws RecognitionException {
        Isa_pbx_aggregate_targetContext _localctx = new Isa_pbx_aggregate_targetContext(_ctx, getState());
        enterRule(_localctx, 114, RULE_isa_pbx_aggregate_target);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1102);
                match(ISA);
                setState(1103);
                match(T__2);
                setState(1104);
                match(PBX_AGGREGATE_TARGET);
                setState(1105);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Isa_pbx_build_fileContext extends ParserRuleContext {
        public TerminalNode ISA() { return getToken(PbxprojParser.ISA, 0); }
        public TerminalNode PBX_BUILD_FILE() { return getToken(PbxprojParser.PBX_BUILD_FILE, 0); }
        public Isa_pbx_build_fileContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_isa_pbx_build_file; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterIsa_pbx_build_file(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitIsa_pbx_build_file(this);
        }
    }

    public final Isa_pbx_build_fileContext isa_pbx_build_file() throws RecognitionException {
        Isa_pbx_build_fileContext _localctx = new Isa_pbx_build_fileContext(_ctx, getState());
        enterRule(_localctx, 116, RULE_isa_pbx_build_file);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1107);
                match(ISA);
                setState(1108);
                match(T__2);
                setState(1109);
                match(PBX_BUILD_FILE);
                setState(1110);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Isa_pbx_build_ruleContext extends ParserRuleContext {
        public TerminalNode ISA() { return getToken(PbxprojParser.ISA, 0); }
        public TerminalNode PBX_BUILD_RULE() { return getToken(PbxprojParser.PBX_BUILD_RULE, 0); }
        public Isa_pbx_build_ruleContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_isa_pbx_build_rule; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterIsa_pbx_build_rule(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitIsa_pbx_build_rule(this);
        }
    }

    public final Isa_pbx_build_ruleContext isa_pbx_build_rule() throws RecognitionException {
        Isa_pbx_build_ruleContext _localctx = new Isa_pbx_build_ruleContext(_ctx, getState());
        enterRule(_localctx, 118, RULE_isa_pbx_build_rule);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1112);
                match(ISA);
                setState(1113);
                match(T__2);
                setState(1114);
                match(PBX_BUILD_RULE);
                setState(1115);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Isa_pbx_build_styleContext extends ParserRuleContext {
        public TerminalNode ISA() { return getToken(PbxprojParser.ISA, 0); }
        public TerminalNode PBX_BUILD_STYLE() { return getToken(PbxprojParser.PBX_BUILD_STYLE, 0); }
        public Isa_pbx_build_styleContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_isa_pbx_build_style; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterIsa_pbx_build_style(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitIsa_pbx_build_style(this);
        }
    }

    public final Isa_pbx_build_styleContext isa_pbx_build_style() throws RecognitionException {
        Isa_pbx_build_styleContext _localctx = new Isa_pbx_build_styleContext(_ctx, getState());
        enterRule(_localctx, 120, RULE_isa_pbx_build_style);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1117);
                match(ISA);
                setState(1118);
                match(T__2);
                setState(1119);
                match(PBX_BUILD_STYLE);
                setState(1120);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Isa_pbx_container_item_proxyContext extends ParserRuleContext {
        public TerminalNode ISA() { return getToken(PbxprojParser.ISA, 0); }
        public TerminalNode PBX_CONTAINER_ITEM_PROXY() { return getToken(PbxprojParser.PBX_CONTAINER_ITEM_PROXY, 0); }
        public Isa_pbx_container_item_proxyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_isa_pbx_container_item_proxy; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterIsa_pbx_container_item_proxy(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitIsa_pbx_container_item_proxy(this);
        }
    }

    public final Isa_pbx_container_item_proxyContext isa_pbx_container_item_proxy() throws RecognitionException {
        Isa_pbx_container_item_proxyContext _localctx = new Isa_pbx_container_item_proxyContext(_ctx, getState());
        enterRule(_localctx, 122, RULE_isa_pbx_container_item_proxy);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1122);
                match(ISA);
                setState(1123);
                match(T__2);
                setState(1124);
                match(PBX_CONTAINER_ITEM_PROXY);
                setState(1125);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Isa_pbx_copy_files_build_phaseContext extends ParserRuleContext {
        public TerminalNode ISA() { return getToken(PbxprojParser.ISA, 0); }
        public TerminalNode PBX_COPY_FILES_BUILD_PHASE() { return getToken(PbxprojParser.PBX_COPY_FILES_BUILD_PHASE, 0); }
        public Isa_pbx_copy_files_build_phaseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_isa_pbx_copy_files_build_phase; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterIsa_pbx_copy_files_build_phase(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitIsa_pbx_copy_files_build_phase(this);
        }
    }

    public final Isa_pbx_copy_files_build_phaseContext isa_pbx_copy_files_build_phase() throws RecognitionException {
        Isa_pbx_copy_files_build_phaseContext _localctx = new Isa_pbx_copy_files_build_phaseContext(_ctx, getState());
        enterRule(_localctx, 124, RULE_isa_pbx_copy_files_build_phase);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1127);
                match(ISA);
                setState(1128);
                match(T__2);
                setState(1129);
                match(PBX_COPY_FILES_BUILD_PHASE);
                setState(1130);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Isa_pbx_file_referenceContext extends ParserRuleContext {
        public TerminalNode ISA() { return getToken(PbxprojParser.ISA, 0); }
        public TerminalNode PBX_FILE_REFERENCE() { return getToken(PbxprojParser.PBX_FILE_REFERENCE, 0); }
        public Isa_pbx_file_referenceContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_isa_pbx_file_reference; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterIsa_pbx_file_reference(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitIsa_pbx_file_reference(this);
        }
    }

    public final Isa_pbx_file_referenceContext isa_pbx_file_reference() throws RecognitionException {
        Isa_pbx_file_referenceContext _localctx = new Isa_pbx_file_referenceContext(_ctx, getState());
        enterRule(_localctx, 126, RULE_isa_pbx_file_reference);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1132);
                match(ISA);
                setState(1133);
                match(T__2);
                setState(1134);
                match(PBX_FILE_REFERENCE);
                setState(1135);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Isa_pbx_frameworks_build_phaseContext extends ParserRuleContext {
        public TerminalNode ISA() { return getToken(PbxprojParser.ISA, 0); }
        public TerminalNode PBX_FRAMEWORKS_BUILD_PHASE() { return getToken(PbxprojParser.PBX_FRAMEWORKS_BUILD_PHASE, 0); }
        public Isa_pbx_frameworks_build_phaseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_isa_pbx_frameworks_build_phase; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterIsa_pbx_frameworks_build_phase(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitIsa_pbx_frameworks_build_phase(this);
        }
    }

    public final Isa_pbx_frameworks_build_phaseContext isa_pbx_frameworks_build_phase() throws RecognitionException {
        Isa_pbx_frameworks_build_phaseContext _localctx = new Isa_pbx_frameworks_build_phaseContext(_ctx, getState());
        enterRule(_localctx, 128, RULE_isa_pbx_frameworks_build_phase);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1137);
                match(ISA);
                setState(1138);
                match(T__2);
                setState(1139);
                match(PBX_FRAMEWORKS_BUILD_PHASE);
                setState(1140);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Isa_pbx_groupContext extends ParserRuleContext {
        public TerminalNode ISA() { return getToken(PbxprojParser.ISA, 0); }
        public TerminalNode PBX_GROUP() { return getToken(PbxprojParser.PBX_GROUP, 0); }
        public Isa_pbx_groupContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_isa_pbx_group; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterIsa_pbx_group(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitIsa_pbx_group(this);
        }
    }

    public final Isa_pbx_groupContext isa_pbx_group() throws RecognitionException {
        Isa_pbx_groupContext _localctx = new Isa_pbx_groupContext(_ctx, getState());
        enterRule(_localctx, 130, RULE_isa_pbx_group);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1142);
                match(ISA);
                setState(1143);
                match(T__2);
                setState(1144);
                match(PBX_GROUP);
                setState(1145);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Isa_pbx_header_build_phaseContext extends ParserRuleContext {
        public TerminalNode ISA() { return getToken(PbxprojParser.ISA, 0); }
        public TerminalNode PBX_HEADERS_BUILD_PHASE() { return getToken(PbxprojParser.PBX_HEADERS_BUILD_PHASE, 0); }
        public Isa_pbx_header_build_phaseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_isa_pbx_header_build_phase; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterIsa_pbx_header_build_phase(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitIsa_pbx_header_build_phase(this);
        }
    }

    public final Isa_pbx_header_build_phaseContext isa_pbx_header_build_phase() throws RecognitionException {
        Isa_pbx_header_build_phaseContext _localctx = new Isa_pbx_header_build_phaseContext(_ctx, getState());
        enterRule(_localctx, 132, RULE_isa_pbx_header_build_phase);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1147);
                match(ISA);
                setState(1148);
                match(T__2);
                setState(1149);
                match(PBX_HEADERS_BUILD_PHASE);
                setState(1150);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Isa_pbx_native_targetContext extends ParserRuleContext {
        public TerminalNode ISA() { return getToken(PbxprojParser.ISA, 0); }
        public TerminalNode PBX_NATIVE_TARGET() { return getToken(PbxprojParser.PBX_NATIVE_TARGET, 0); }
        public Isa_pbx_native_targetContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_isa_pbx_native_target; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterIsa_pbx_native_target(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitIsa_pbx_native_target(this);
        }
    }

    public final Isa_pbx_native_targetContext isa_pbx_native_target() throws RecognitionException {
        Isa_pbx_native_targetContext _localctx = new Isa_pbx_native_targetContext(_ctx, getState());
        enterRule(_localctx, 134, RULE_isa_pbx_native_target);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1152);
                match(ISA);
                setState(1153);
                match(T__2);
                setState(1154);
                match(PBX_NATIVE_TARGET);
                setState(1155);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Isa_pbx_legacy_targetContext extends ParserRuleContext {
        public TerminalNode ISA() { return getToken(PbxprojParser.ISA, 0); }
        public TerminalNode PBX_LEGACY_TARGET() { return getToken(PbxprojParser.PBX_LEGACY_TARGET, 0); }
        public Isa_pbx_legacy_targetContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_isa_pbx_legacy_target; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterIsa_pbx_legacy_target(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitIsa_pbx_legacy_target(this);
        }
    }

    public final Isa_pbx_legacy_targetContext isa_pbx_legacy_target() throws RecognitionException {
        Isa_pbx_legacy_targetContext _localctx = new Isa_pbx_legacy_targetContext(_ctx, getState());
        enterRule(_localctx, 136, RULE_isa_pbx_legacy_target);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1157);
                match(ISA);
                setState(1158);
                match(T__2);
                setState(1159);
                match(PBX_LEGACY_TARGET);
                setState(1160);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Isa_pbx_projectContext extends ParserRuleContext {
        public TerminalNode ISA() { return getToken(PbxprojParser.ISA, 0); }
        public TerminalNode PBX_PROJECT() { return getToken(PbxprojParser.PBX_PROJECT, 0); }
        public Isa_pbx_projectContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_isa_pbx_project; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterIsa_pbx_project(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitIsa_pbx_project(this);
        }
    }

    public final Isa_pbx_projectContext isa_pbx_project() throws RecognitionException {
        Isa_pbx_projectContext _localctx = new Isa_pbx_projectContext(_ctx, getState());
        enterRule(_localctx, 138, RULE_isa_pbx_project);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1162);
                match(ISA);
                setState(1163);
                match(T__2);
                setState(1164);
                match(PBX_PROJECT);
                setState(1165);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Isa_pbx_reference_proxyContext extends ParserRuleContext {
        public TerminalNode ISA() { return getToken(PbxprojParser.ISA, 0); }
        public TerminalNode PBX_REFERENCE_PROXY() { return getToken(PbxprojParser.PBX_REFERENCE_PROXY, 0); }
        public Isa_pbx_reference_proxyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_isa_pbx_reference_proxy; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterIsa_pbx_reference_proxy(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitIsa_pbx_reference_proxy(this);
        }
    }

    public final Isa_pbx_reference_proxyContext isa_pbx_reference_proxy() throws RecognitionException {
        Isa_pbx_reference_proxyContext _localctx = new Isa_pbx_reference_proxyContext(_ctx, getState());
        enterRule(_localctx, 140, RULE_isa_pbx_reference_proxy);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1167);
                match(ISA);
                setState(1168);
                match(T__2);
                setState(1169);
                match(PBX_REFERENCE_PROXY);
                setState(1170);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Isa_pbx_resources_build_phaseContext extends ParserRuleContext {
        public TerminalNode ISA() { return getToken(PbxprojParser.ISA, 0); }
        public TerminalNode PBX_RESOURCES_BUILD_PHASE() { return getToken(PbxprojParser.PBX_RESOURCES_BUILD_PHASE, 0); }
        public Isa_pbx_resources_build_phaseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_isa_pbx_resources_build_phase; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterIsa_pbx_resources_build_phase(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitIsa_pbx_resources_build_phase(this);
        }
    }

    public final Isa_pbx_resources_build_phaseContext isa_pbx_resources_build_phase() throws RecognitionException {
        Isa_pbx_resources_build_phaseContext _localctx = new Isa_pbx_resources_build_phaseContext(_ctx, getState());
        enterRule(_localctx, 142, RULE_isa_pbx_resources_build_phase);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1172);
                match(ISA);
                setState(1173);
                match(T__2);
                setState(1174);
                match(PBX_RESOURCES_BUILD_PHASE);
                setState(1175);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Isa_pbx_shell_script_build_phaseContext extends ParserRuleContext {
        public TerminalNode ISA() { return getToken(PbxprojParser.ISA, 0); }
        public TerminalNode PBX_SHELL_SCRIPT_BUILD_PHASE() { return getToken(PbxprojParser.PBX_SHELL_SCRIPT_BUILD_PHASE, 0); }
        public Isa_pbx_shell_script_build_phaseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_isa_pbx_shell_script_build_phase; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterIsa_pbx_shell_script_build_phase(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitIsa_pbx_shell_script_build_phase(this);
        }
    }

    public final Isa_pbx_shell_script_build_phaseContext isa_pbx_shell_script_build_phase() throws RecognitionException {
        Isa_pbx_shell_script_build_phaseContext _localctx = new Isa_pbx_shell_script_build_phaseContext(_ctx, getState());
        enterRule(_localctx, 144, RULE_isa_pbx_shell_script_build_phase);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1177);
                match(ISA);
                setState(1178);
                match(T__2);
                setState(1179);
                match(PBX_SHELL_SCRIPT_BUILD_PHASE);
                setState(1180);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Isa_pbx_shell_build_phaseContext extends ParserRuleContext {
        public TerminalNode ISA() { return getToken(PbxprojParser.ISA, 0); }
        public TerminalNode PBX_SHELL_BUILD_PHASE() { return getToken(PbxprojParser.PBX_SHELL_BUILD_PHASE, 0); }
        public Isa_pbx_shell_build_phaseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_isa_pbx_shell_build_phase; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterIsa_pbx_shell_build_phase(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitIsa_pbx_shell_build_phase(this);
        }
    }

    public final Isa_pbx_shell_build_phaseContext isa_pbx_shell_build_phase() throws RecognitionException {
        Isa_pbx_shell_build_phaseContext _localctx = new Isa_pbx_shell_build_phaseContext(_ctx, getState());
        enterRule(_localctx, 146, RULE_isa_pbx_shell_build_phase);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1182);
                match(ISA);
                setState(1183);
                match(T__2);
                setState(1184);
                match(PBX_SHELL_BUILD_PHASE);
                setState(1185);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Isa_pbx_sources_build_phaseContext extends ParserRuleContext {
        public TerminalNode ISA() { return getToken(PbxprojParser.ISA, 0); }
        public TerminalNode PBX_SOURCES_BUILD_PHASE() { return getToken(PbxprojParser.PBX_SOURCES_BUILD_PHASE, 0); }
        public Isa_pbx_sources_build_phaseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_isa_pbx_sources_build_phase; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterIsa_pbx_sources_build_phase(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitIsa_pbx_sources_build_phase(this);
        }
    }

    public final Isa_pbx_sources_build_phaseContext isa_pbx_sources_build_phase() throws RecognitionException {
        Isa_pbx_sources_build_phaseContext _localctx = new Isa_pbx_sources_build_phaseContext(_ctx, getState());
        enterRule(_localctx, 148, RULE_isa_pbx_sources_build_phase);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1187);
                match(ISA);
                setState(1188);
                match(T__2);
                setState(1189);
                match(PBX_SOURCES_BUILD_PHASE);
                setState(1190);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Isa_pbx_target_dependencyContext extends ParserRuleContext {
        public TerminalNode ISA() { return getToken(PbxprojParser.ISA, 0); }
        public TerminalNode PBX_TARGET_DEPENDENCY() { return getToken(PbxprojParser.PBX_TARGET_DEPENDENCY, 0); }
        public Isa_pbx_target_dependencyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_isa_pbx_target_dependency; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterIsa_pbx_target_dependency(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitIsa_pbx_target_dependency(this);
        }
    }

    public final Isa_pbx_target_dependencyContext isa_pbx_target_dependency() throws RecognitionException {
        Isa_pbx_target_dependencyContext _localctx = new Isa_pbx_target_dependencyContext(_ctx, getState());
        enterRule(_localctx, 150, RULE_isa_pbx_target_dependency);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1192);
                match(ISA);
                setState(1193);
                match(T__2);
                setState(1194);
                match(PBX_TARGET_DEPENDENCY);
                setState(1195);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Isa_pbx_variant_groupContext extends ParserRuleContext {
        public TerminalNode ISA() { return getToken(PbxprojParser.ISA, 0); }
        public TerminalNode PBX_VARIANT_GROUP() { return getToken(PbxprojParser.PBX_VARIANT_GROUP, 0); }
        public Isa_pbx_variant_groupContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_isa_pbx_variant_group; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterIsa_pbx_variant_group(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitIsa_pbx_variant_group(this);
        }
    }

    public final Isa_pbx_variant_groupContext isa_pbx_variant_group() throws RecognitionException {
        Isa_pbx_variant_groupContext _localctx = new Isa_pbx_variant_groupContext(_ctx, getState());
        enterRule(_localctx, 152, RULE_isa_pbx_variant_group);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1197);
                match(ISA);
                setState(1198);
                match(T__2);
                setState(1199);
                match(PBX_VARIANT_GROUP);
                setState(1200);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Isa_xc_build_configurationContext extends ParserRuleContext {
        public TerminalNode ISA() { return getToken(PbxprojParser.ISA, 0); }
        public TerminalNode XC_BUILD_CONFIGURATION() { return getToken(PbxprojParser.XC_BUILD_CONFIGURATION, 0); }
        public Isa_xc_build_configurationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_isa_xc_build_configuration; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterIsa_xc_build_configuration(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitIsa_xc_build_configuration(this);
        }
    }

    public final Isa_xc_build_configurationContext isa_xc_build_configuration() throws RecognitionException {
        Isa_xc_build_configurationContext _localctx = new Isa_xc_build_configurationContext(_ctx, getState());
        enterRule(_localctx, 154, RULE_isa_xc_build_configuration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1202);
                match(ISA);
                setState(1203);
                match(T__2);
                setState(1204);
                match(XC_BUILD_CONFIGURATION);
                setState(1205);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Isa_xc_configuration_listContext extends ParserRuleContext {
        public TerminalNode ISA() { return getToken(PbxprojParser.ISA, 0); }
        public TerminalNode XC_CONFIGURATION_LIST() { return getToken(PbxprojParser.XC_CONFIGURATION_LIST, 0); }
        public Isa_xc_configuration_listContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_isa_xc_configuration_list; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterIsa_xc_configuration_list(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitIsa_xc_configuration_list(this);
        }
    }

    public final Isa_xc_configuration_listContext isa_xc_configuration_list() throws RecognitionException {
        Isa_xc_configuration_listContext _localctx = new Isa_xc_configuration_listContext(_ctx, getState());
        enterRule(_localctx, 156, RULE_isa_xc_configuration_list);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1207);
                match(ISA);
                setState(1208);
                match(T__2);
                setState(1209);
                match(XC_CONFIGURATION_LIST);
                setState(1210);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Isa_xc_remote_swift_package_referenceContext extends ParserRuleContext {
        public TerminalNode ISA() { return getToken(PbxprojParser.ISA, 0); }
        public TerminalNode XC_REMOTE_SWIFT_PACKAGE_REFERENCE() { return getToken(PbxprojParser.XC_REMOTE_SWIFT_PACKAGE_REFERENCE, 0); }
        public Isa_xc_remote_swift_package_referenceContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_isa_xc_remote_swift_package_reference; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterIsa_xc_remote_swift_package_reference(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitIsa_xc_remote_swift_package_reference(this);
        }
    }

    public final Isa_xc_remote_swift_package_referenceContext isa_xc_remote_swift_package_reference() throws RecognitionException {
        Isa_xc_remote_swift_package_referenceContext _localctx = new Isa_xc_remote_swift_package_referenceContext(_ctx, getState());
        enterRule(_localctx, 158, RULE_isa_xc_remote_swift_package_reference);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1212);
                match(ISA);
                setState(1213);
                match(T__2);
                setState(1214);
                match(XC_REMOTE_SWIFT_PACKAGE_REFERENCE);
                setState(1215);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Isa_xc_swift_package_product_dependencyContext extends ParserRuleContext {
        public TerminalNode ISA() { return getToken(PbxprojParser.ISA, 0); }
        public TerminalNode XC_SWIFT_PACKAGE_PRODUCT_DEPENDENCY() { return getToken(PbxprojParser.XC_SWIFT_PACKAGE_PRODUCT_DEPENDENCY, 0); }
        public Isa_xc_swift_package_product_dependencyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_isa_xc_swift_package_product_dependency; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterIsa_xc_swift_package_product_dependency(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitIsa_xc_swift_package_product_dependency(this);
        }
    }

    public final Isa_xc_swift_package_product_dependencyContext isa_xc_swift_package_product_dependency() throws RecognitionException {
        Isa_xc_swift_package_product_dependencyContext _localctx = new Isa_xc_swift_package_product_dependencyContext(_ctx, getState());
        enterRule(_localctx, 160, RULE_isa_xc_swift_package_product_dependency);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1217);
                match(ISA);
                setState(1218);
                match(T__2);
                setState(1219);
                match(XC_SWIFT_PACKAGE_PRODUCT_DEPENDENCY);
                setState(1220);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Isa_xc_version_groupContext extends ParserRuleContext {
        public TerminalNode ISA() { return getToken(PbxprojParser.ISA, 0); }
        public TerminalNode XC_VERSION_GROUP() { return getToken(PbxprojParser.XC_VERSION_GROUP, 0); }
        public Isa_xc_version_groupContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_isa_xc_version_group; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterIsa_xc_version_group(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitIsa_xc_version_group(this);
        }
    }

    public final Isa_xc_version_groupContext isa_xc_version_group() throws RecognitionException {
        Isa_xc_version_groupContext _localctx = new Isa_xc_version_groupContext(_ctx, getState());
        enterRule(_localctx, 162, RULE_isa_xc_version_group);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1222);
                match(ISA);
                setState(1223);
                match(T__2);
                setState(1224);
                match(XC_VERSION_GROUP);
                setState(1225);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Always_out_of_dateContext extends ParserRuleContext {
        public TerminalNode ALWAYS_OUT_OF_DATE() { return getToken(PbxprojParser.ALWAYS_OUT_OF_DATE, 0); }
        public TerminalNode NUMBER() { return getToken(PbxprojParser.NUMBER, 0); }
        public Always_out_of_dateContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_always_out_of_date; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterAlways_out_of_date(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitAlways_out_of_date(this);
        }
    }

    public final Always_out_of_dateContext always_out_of_date() throws RecognitionException {
        Always_out_of_dateContext _localctx = new Always_out_of_dateContext(_ctx, getState());
        enterRule(_localctx, 164, RULE_always_out_of_date);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1227);
                match(ALWAYS_OUT_OF_DATE);
                setState(1228);
                match(T__2);
                setState(1229);
                match(NUMBER);
                setState(1230);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class File_refContext extends ParserRuleContext {
        public TerminalNode FILE_REF() { return getToken(PbxprojParser.FILE_REF, 0); }
        public TerminalNode REFERENCE() { return getToken(PbxprojParser.REFERENCE, 0); }
        public File_refContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_file_ref; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterFile_ref(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitFile_ref(this);
        }
    }

    public final File_refContext file_ref() throws RecognitionException {
        File_refContext _localctx = new File_refContext(_ctx, getState());
        enterRule(_localctx, 166, RULE_file_ref);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1232);
                match(FILE_REF);
                setState(1233);
                match(T__2);
                setState(1234);
                match(REFERENCE);
                setState(1235);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Product_refContext extends ParserRuleContext {
        public TerminalNode PRODUCT_REF() { return getToken(PbxprojParser.PRODUCT_REF, 0); }
        public TerminalNode REFERENCE() { return getToken(PbxprojParser.REFERENCE, 0); }
        public Product_refContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_product_ref; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterProduct_ref(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitProduct_ref(this);
        }
    }

    public final Product_refContext product_ref() throws RecognitionException {
        Product_refContext _localctx = new Product_refContext(_ctx, getState());
        enterRule(_localctx, 168, RULE_product_ref);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1237);
                match(PRODUCT_REF);
                setState(1238);
                match(T__2);
                setState(1239);
                match(REFERENCE);
                setState(1240);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Container_portalContext extends ParserRuleContext {
        public TerminalNode CONTAINER_PORTAL() { return getToken(PbxprojParser.CONTAINER_PORTAL, 0); }
        public TerminalNode REFERENCE() { return getToken(PbxprojParser.REFERENCE, 0); }
        public Container_portalContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_container_portal; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterContainer_portal(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitContainer_portal(this);
        }
    }

    public final Container_portalContext container_portal() throws RecognitionException {
        Container_portalContext _localctx = new Container_portalContext(_ctx, getState());
        enterRule(_localctx, 170, RULE_container_portal);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1242);
                match(CONTAINER_PORTAL);
                setState(1243);
                match(T__2);
                setState(1244);
                match(REFERENCE);
                setState(1245);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Proxy_typeContext extends ParserRuleContext {
        public TerminalNode PROXY_TYPE() { return getToken(PbxprojParser.PROXY_TYPE, 0); }
        public TerminalNode NUMBER() { return getToken(PbxprojParser.NUMBER, 0); }
        public Proxy_typeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_proxy_type; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterProxy_type(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitProxy_type(this);
        }
    }

    public final Proxy_typeContext proxy_type() throws RecognitionException {
        Proxy_typeContext _localctx = new Proxy_typeContext(_ctx, getState());
        enterRule(_localctx, 172, RULE_proxy_type);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1247);
                match(PROXY_TYPE);
                setState(1248);
                match(T__2);
                setState(1249);
                match(NUMBER);
                setState(1250);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Remote_global_id_stringContext extends ParserRuleContext {
        public TerminalNode REMOTE_GLOBAL_ID_STRING() { return getToken(PbxprojParser.REMOTE_GLOBAL_ID_STRING, 0); }
        public TerminalNode REFERENCE() { return getToken(PbxprojParser.REFERENCE, 0); }
        public Remote_global_id_stringContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_remote_global_id_string; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterRemote_global_id_string(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitRemote_global_id_string(this);
        }
    }

    public final Remote_global_id_stringContext remote_global_id_string() throws RecognitionException {
        Remote_global_id_stringContext _localctx = new Remote_global_id_stringContext(_ctx, getState());
        enterRule(_localctx, 174, RULE_remote_global_id_string);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1252);
                match(REMOTE_GLOBAL_ID_STRING);
                setState(1253);
                match(T__2);
                setState(1254);
                match(REFERENCE);
                setState(1255);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Remote_infoContext extends ParserRuleContext {
        public TerminalNode REMOTE_INFO() { return getToken(PbxprojParser.REMOTE_INFO, 0); }
        public Str_number_variableContext str_number_variable() {
            return getRuleContext(Str_number_variableContext.class,0);
        }
        public Remote_infoContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_remote_info; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterRemote_info(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitRemote_info(this);
        }
    }

    public final Remote_infoContext remote_info() throws RecognitionException {
        Remote_infoContext _localctx = new Remote_infoContext(_ctx, getState());
        enterRule(_localctx, 176, RULE_remote_info);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1257);
                match(REMOTE_INFO);
                setState(1258);
                match(T__2);
                setState(1259);
                str_number_variable();
                setState(1260);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class File_encodingContext extends ParserRuleContext {
        public TerminalNode FILE_ENCODING() { return getToken(PbxprojParser.FILE_ENCODING, 0); }
        public TerminalNode NUMBER() { return getToken(PbxprojParser.NUMBER, 0); }
        public File_encodingContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_file_encoding; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterFile_encoding(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitFile_encoding(this);
        }
    }

    public final File_encodingContext file_encoding() throws RecognitionException {
        File_encodingContext _localctx = new File_encodingContext(_ctx, getState());
        enterRule(_localctx, 178, RULE_file_encoding);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1262);
                match(FILE_ENCODING);
                setState(1263);
                match(T__2);
                setState(1264);
                match(NUMBER);
                setState(1265);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class CommentsContext extends ParserRuleContext {
        public TerminalNode COMMENTS() { return getToken(PbxprojParser.COMMENTS, 0); }
        public Str_number_variableContext str_number_variable() {
            return getRuleContext(Str_number_variableContext.class,0);
        }
        public CommentsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_comments; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterComments(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitComments(this);
        }
    }

    public final CommentsContext comments() throws RecognitionException {
        CommentsContext _localctx = new CommentsContext(_ctx, getState());
        enterRule(_localctx, 180, RULE_comments);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1267);
                match(COMMENTS);
                setState(1268);
                match(T__2);
                setState(1269);
                str_number_variable();
                setState(1270);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Explicit_file_typeContext extends ParserRuleContext {
        public TerminalNode EXPLICIT_FILE_TYPE() { return getToken(PbxprojParser.EXPLICIT_FILE_TYPE, 0); }
        public Str_number_variableContext str_number_variable() {
            return getRuleContext(Str_number_variableContext.class,0);
        }
        public Explicit_file_typeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_explicit_file_type; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterExplicit_file_type(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitExplicit_file_type(this);
        }
    }

    public final Explicit_file_typeContext explicit_file_type() throws RecognitionException {
        Explicit_file_typeContext _localctx = new Explicit_file_typeContext(_ctx, getState());
        enterRule(_localctx, 182, RULE_explicit_file_type);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1272);
                match(EXPLICIT_FILE_TYPE);
                setState(1273);
                match(T__2);
                setState(1274);
                str_number_variable();
                setState(1275);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Last_known_file_typeContext extends ParserRuleContext {
        public TerminalNode LAST_KNOWN_FILE_TYPE() { return getToken(PbxprojParser.LAST_KNOWN_FILE_TYPE, 0); }
        public Str_number_variableContext str_number_variable() {
            return getRuleContext(Str_number_variableContext.class,0);
        }
        public Last_known_file_typeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_last_known_file_type; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterLast_known_file_type(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitLast_known_file_type(this);
        }
    }

    public final Last_known_file_typeContext last_known_file_type() throws RecognitionException {
        Last_known_file_typeContext _localctx = new Last_known_file_typeContext(_ctx, getState());
        enterRule(_localctx, 184, RULE_last_known_file_type);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1277);
                match(LAST_KNOWN_FILE_TYPE);
                setState(1278);
                match(T__2);
                setState(1279);
                str_number_variable();
                setState(1280);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Include_in_indexContext extends ParserRuleContext {
        public TerminalNode INCLUDE_IN_INDEX() { return getToken(PbxprojParser.INCLUDE_IN_INDEX, 0); }
        public TerminalNode NUMBER() { return getToken(PbxprojParser.NUMBER, 0); }
        public Include_in_indexContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_include_in_index; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterInclude_in_index(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitInclude_in_index(this);
        }
    }

    public final Include_in_indexContext include_in_index() throws RecognitionException {
        Include_in_indexContext _localctx = new Include_in_indexContext(_ctx, getState());
        enterRule(_localctx, 186, RULE_include_in_index);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1282);
                match(INCLUDE_IN_INDEX);
                setState(1283);
                match(T__2);
                setState(1284);
                match(NUMBER);
                setState(1285);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Indent_widthContext extends ParserRuleContext {
        public TerminalNode INDENT_WIDTH() { return getToken(PbxprojParser.INDENT_WIDTH, 0); }
        public TerminalNode NUMBER() { return getToken(PbxprojParser.NUMBER, 0); }
        public Indent_widthContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_indent_width; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterIndent_width(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitIndent_width(this);
        }
    }

    public final Indent_widthContext indent_width() throws RecognitionException {
        Indent_widthContext _localctx = new Indent_widthContext(_ctx, getState());
        enterRule(_localctx, 188, RULE_indent_width);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1287);
                match(INDENT_WIDTH);
                setState(1288);
                match(T__2);
                setState(1289);
                match(NUMBER);
                setState(1290);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Tab_widthContext extends ParserRuleContext {
        public TerminalNode TAB_WIDTH() { return getToken(PbxprojParser.TAB_WIDTH, 0); }
        public TerminalNode NUMBER() { return getToken(PbxprojParser.NUMBER, 0); }
        public Tab_widthContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_tab_width; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterTab_width(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitTab_width(this);
        }
    }

    public final Tab_widthContext tab_width() throws RecognitionException {
        Tab_widthContext _localctx = new Tab_widthContext(_ctx, getState());
        enterRule(_localctx, 190, RULE_tab_width);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1292);
                match(TAB_WIDTH);
                setState(1293);
                match(T__2);
                setState(1294);
                match(NUMBER);
                setState(1295);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Uses_tabsContext extends ParserRuleContext {
        public TerminalNode USES_TABS() { return getToken(PbxprojParser.USES_TABS, 0); }
        public TerminalNode NUMBER() { return getToken(PbxprojParser.NUMBER, 0); }
        public Uses_tabsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_uses_tabs; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterUses_tabs(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitUses_tabs(this);
        }
    }

    public final Uses_tabsContext uses_tabs() throws RecognitionException {
        Uses_tabsContext _localctx = new Uses_tabsContext(_ctx, getState());
        enterRule(_localctx, 192, RULE_uses_tabs);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1297);
                match(USES_TABS);
                setState(1298);
                match(T__2);
                setState(1299);
                match(NUMBER);
                setState(1300);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Wraps_linesContext extends ParserRuleContext {
        public TerminalNode WRAPS_LINES() { return getToken(PbxprojParser.WRAPS_LINES, 0); }
        public TerminalNode NUMBER() { return getToken(PbxprojParser.NUMBER, 0); }
        public Wraps_linesContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_wraps_lines; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterWraps_lines(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitWraps_lines(this);
        }
    }

    public final Wraps_linesContext wraps_lines() throws RecognitionException {
        Wraps_linesContext _localctx = new Wraps_linesContext(_ctx, getState());
        enterRule(_localctx, 194, RULE_wraps_lines);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1302);
                match(WRAPS_LINES);
                setState(1303);
                match(T__2);
                setState(1304);
                match(NUMBER);
                setState(1305);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Platform_filterContext extends ParserRuleContext {
        public TerminalNode PLATFORM_FILTER() { return getToken(PbxprojParser.PLATFORM_FILTER, 0); }
        public Any_stringContext any_string() {
            return getRuleContext(Any_stringContext.class,0);
        }
        public Platform_filterContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_platform_filter; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterPlatform_filter(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitPlatform_filter(this);
        }
    }

    public final Platform_filterContext platform_filter() throws RecognitionException {
        Platform_filterContext _localctx = new Platform_filterContext(_ctx, getState());
        enterRule(_localctx, 196, RULE_platform_filter);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1307);
                match(PLATFORM_FILTER);
                setState(1308);
                match(T__2);
                setState(1309);
                any_string();
                setState(1310);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Platform_filtersContext extends ParserRuleContext {
        public TerminalNode PLATFORM_FILTERS() { return getToken(PbxprojParser.PLATFORM_FILTERS, 0); }
        public Any_string_listContext any_string_list() {
            return getRuleContext(Any_string_listContext.class,0);
        }
        public Platform_filtersContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_platform_filters; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterPlatform_filters(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitPlatform_filters(this);
        }
    }

    public final Platform_filtersContext platform_filters() throws RecognitionException {
        Platform_filtersContext _localctx = new Platform_filtersContext(_ctx, getState());
        enterRule(_localctx, 198, RULE_platform_filters);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1312);
                match(PLATFORM_FILTERS);
                setState(1313);
                match(T__2);
                setState(1314);
                any_string_list();
                setState(1315);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ChildrenContext extends ParserRuleContext {
        public TerminalNode CHILDREN() { return getToken(PbxprojParser.CHILDREN, 0); }
        public Reference_listContext reference_list() {
            return getRuleContext(Reference_listContext.class,0);
        }
        public ChildrenContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_children; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterChildren(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitChildren(this);
        }
    }

    public final ChildrenContext children() throws RecognitionException {
        ChildrenContext _localctx = new ChildrenContext(_ctx, getState());
        enterRule(_localctx, 200, RULE_children);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1317);
                match(CHILDREN);
                setState(1318);
                match(T__2);
                setState(1319);
                reference_list();
                setState(1320);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Product_install_pathContext extends ParserRuleContext {
        public TerminalNode PRODUCT_INSTALL_PATH() { return getToken(PbxprojParser.PRODUCT_INSTALL_PATH, 0); }
        public Any_stringContext any_string() {
            return getRuleContext(Any_stringContext.class,0);
        }
        public Product_install_pathContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_product_install_path; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterProduct_install_path(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitProduct_install_path(this);
        }
    }

    public final Product_install_pathContext product_install_path() throws RecognitionException {
        Product_install_pathContext _localctx = new Product_install_pathContext(_ctx, getState());
        enterRule(_localctx, 202, RULE_product_install_path);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1322);
                match(PRODUCT_INSTALL_PATH);
                setState(1323);
                match(T__2);
                setState(1324);
                any_string();
                setState(1325);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Repository_urlContext extends ParserRuleContext {
        public TerminalNode REPOSITORY_URL() { return getToken(PbxprojParser.REPOSITORY_URL, 0); }
        public TerminalNode QUOTED_STRING() { return getToken(PbxprojParser.QUOTED_STRING, 0); }
        public Repository_urlContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_repository_url; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterRepository_url(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitRepository_url(this);
        }
    }

    public final Repository_urlContext repository_url() throws RecognitionException {
        Repository_urlContext _localctx = new Repository_urlContext(_ctx, getState());
        enterRule(_localctx, 204, RULE_repository_url);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1327);
                match(REPOSITORY_URL);
                setState(1328);
                match(T__2);
                setState(1329);
                match(QUOTED_STRING);
                setState(1330);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class RequirementContext extends ParserRuleContext {
        public TerminalNode REQUIREMENT() { return getToken(PbxprojParser.REQUIREMENT, 0); }
        public List<Key_valueContext> key_value() {
            return getRuleContexts(Key_valueContext.class);
        }
        public Key_valueContext key_value(int i) {
            return getRuleContext(Key_valueContext.class,i);
        }
        public RequirementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_requirement; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterRequirement(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitRequirement(this);
        }
    }

    public final RequirementContext requirement() throws RecognitionException {
        RequirementContext _localctx = new RequirementContext(_ctx, getState());
        enterRule(_localctx, 206, RULE_requirement);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1332);
                match(REQUIREMENT);
                setState(1333);
                match(T__2);
                setState(1334);
                match(T__0);
                setState(1338);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARCHIVE_VERSION) | (1L << CLASSES) | (1L << DASH) | (1L << DOT) | (1L << ISA) | (1L << NUMBER) | (1L << OBJECT_VERSION) | (1L << OBJECTS) | (1L << ROOT_OBJECT) | (1L << UNDERSCORE) | (1L << PBX_AGGREGATE_TARGET) | (1L << PBX_BUILD_FILE) | (1L << PBX_BUILD_RULE) | (1L << PBX_BUILD_STYLE) | (1L << PBX_CONTAINER_ITEM_PROXY) | (1L << PBX_COPY_FILES_BUILD_PHASE) | (1L << PBX_FILE_REFERENCE) | (1L << PBX_FRAMEWORKS_BUILD_PHASE) | (1L << PBX_NATIVE_TARGET) | (1L << PBX_LEGACY_TARGET) | (1L << PBX_PROJECT) | (1L << PBX_REFERENCE_PROXY) | (1L << PBX_RESOURCES_BUILD_PHASE) | (1L << PBX_SHELL_SCRIPT_BUILD_PHASE) | (1L << PBX_SOURCES_BUILD_PHASE) | (1L << PBX_TARGET_DEPENDENCY) | (1L << PBX_VARIANT_GROUP) | (1L << XC_BUILD_CONFIGURATION) | (1L << XC_CONFIGURATION_LIST) | (1L << XC_REMOTE_SWIFT_PACKAGE_REFERENCE) | (1L << XC_SWIFT_PACKAGE_PRODUCT_DEPENDENCY) | (1L << XC_VERSION_GROUP) | (1L << FILE_REF) | (1L << PRODUCT_REF) | (1L << CONTAINER_PORTAL) | (1L << PROXY_TYPE) | (1L << REMOTE_GLOBAL_ID_STRING) | (1L << REMOTE_INFO) | (1L << FILE_ENCODING) | (1L << COMMENTS) | (1L << EXPLICIT_FILE_TYPE) | (1L << LAST_KNOWN_FILE_TYPE) | (1L << INCLUDE_IN_INDEX) | (1L << INDENT_WIDTH) | (1L << TAB_WIDTH) | (1L << USES_TABS) | (1L << WRAPS_LINES) | (1L << PLATFORM_FILTER) | (1L << PLATFORM_FILTERS) | (1L << CHILDREN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PRODUCT_INSTALL_PATH - 64)) | (1L << (REPOSITORY_URL - 64)) | (1L << (REQUIREMENT - 64)) | (1L << (PACKAGE - 64)) | (1L << (PACKAGE_PRODUCT_DEPENDENCIES - 64)) | (1L << (NAME - 64)) | (1L << (PATH - 64)) | (1L << (SOURCE_TREE - 64)) | (1L << (BUILD_ACTION_MASK - 64)) | (1L << (FILES - 64)) | (1L << (RUN_ONLY_FOR_DEPLOYMENT_POSTPROCESSING - 64)) | (1L << (BUILD_CONFIGURATION_LIST - 64)) | (1L << (BUILD_PHASES - 64)) | (1L << (BUILD_RULES - 64)) | (1L << (BUILD_ARGUMENTS_STRING - 64)) | (1L << (BUILD_TOOL_PATH - 64)) | (1L << (BUILD_WORKING_DIRECTORY - 64)) | (1L << (PASS_BUILD_SETTINGS_IN_ENVIRONMENT - 64)) | (1L << (DEPENDENCIES - 64)) | (1L << (PRODUCT_NAME - 64)) | (1L << (PRODUCT_REFERENCE - 64)) | (1L << (PRODUCT_TYPE - 64)) | (1L << (LINE_ENDING - 64)) | (1L << (XC_LANGUAGE_SPECIFICATION_IDENTIFIER - 64)) | (1L << (PLIST_STRUCTURE_DEFINITION_IDENTIFIER - 64)) | (1L << (REF_TYPE - 64)) | (1L << (COMPILER_SPEC - 64)) | (1L << (FILE_PATTERNS - 64)) | (1L << (INPUT_FILES - 64)) | (1L << (IS_EDITABLE - 64)) | (1L << (OUTPUT_FILES - 64)) | (1L << (RUN_ONCE_PER_ARCH - 64)) | (1L << (SCRIPT - 64)) | (1L << (ATTRIBUTES - 64)) | (1L << (LAST_SWIFT_MIGRATION - 64)) | (1L << (DEFAULT_BUILD_SYSTEM_TYPE_FOR_WORKSPACE - 64)) | (1L << (LAST_SWIFT_UPDATE_CHECK - 64)) | (1L << (BUILD_INDEPENDENT_TARGETS_IN_PARALLEL - 64)) | (1L << (LAST_TESTING_UPGRADE_CHECK - 64)) | (1L << (LAST_UPGRADE_CHECK - 64)) | (1L << (ORGANIZATION_NAME - 64)) | (1L << (TARGET_ATTRIBUTES - 64)) | (1L << (CREATED_ON_TOOLS_VERSION - 64)) | (1L << (TEST_TARGET_ID - 64)) | (1L << (DEVELOPMENT_TEAM - 64)) | (1L << (DEVELOPMENT_TEAM_NAME - 64)) | (1L << (PROVISIONING_STYLE - 64)) | (1L << (COMPATIBILITY_VERSION - 64)) | (1L << (DEVELOPMENT_REGION - 64)) | (1L << (HAS_SCANNED_FOR_ENCODINGS - 64)) | (1L << (KNOWN_REGIONS - 64)) | (1L << (MAIN_GROUP - 64)) | (1L << (PRODUCT_REF_GROUP - 64)) | (1L << (PACKAGE_REFERENCES - 64)) | (1L << (PRODUCT_DIR_PATH - 64)) | (1L << (PROJECT_REFERENCES - 64)) | (1L << (PROJECT_ROOT - 64)) | (1L << (TARGETS - 64)) | (1L << (INPUT_FILE_LIST_PATHS - 64)) | (1L << (INPUT_PATHS - 64)) | (1L << (OUTPUT_FILE_LIST_PATHS - 64)) | (1L << (OUTPUT_PATHS - 64)) | (1L << (SHELL_PATH - 64)) | (1L << (SHELL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (SHELL_SCRIPT - 128)) | (1L << (SHOW_ENV_VARS_IN_LOG - 128)) | (1L << (TARGET - 128)) | (1L << (TARGET_PROXY - 128)) | (1L << (FILE_TYPE - 128)) | (1L << (REMOTE_REF - 128)) | (1L << (BASE_CONFIGURATION_REFERENCE - 128)) | (1L << (BUILD_SETTINGS - 128)) | (1L << (DST_PATH - 128)) | (1L << (DST_SUBFOLDER_SPEC - 128)) | (1L << (PRODUCT_GROUP - 128)) | (1L << (PROJECT_REF - 128)) | (1L << (BUILD_CONFIGURATIONS - 128)) | (1L << (DEFAULT_CONFIGURATION_IS_VISIBLE - 128)) | (1L << (DEFAULT_CONFIGURATION_NAME - 128)) | (1L << (SETTINGS - 128)) | (1L << (SYSTEM_CAPABILITIES - 128)) | (1L << (CURRENT_VERSION - 128)) | (1L << (VERSION_GROUP_TYPE - 128)) | (1L << (CLASSPREFIX - 128)) | (1L << (QUOTED_STRING - 128)) | (1L << (NON_QUOTED_STRING - 128)) | (1L << (VARIABLE - 128)))) != 0)) {
                    {
                        {
                            setState(1335);
                            key_value();
                        }
                    }
                    setState(1340);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(1341);
                match(T__1);
                setState(1342);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Xc_packageContext extends ParserRuleContext {
        public TerminalNode PACKAGE() { return getToken(PbxprojParser.PACKAGE, 0); }
        public TerminalNode REFERENCE() { return getToken(PbxprojParser.REFERENCE, 0); }
        public Xc_packageContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_xc_package; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterXc_package(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitXc_package(this);
        }
    }

    public final Xc_packageContext xc_package() throws RecognitionException {
        Xc_packageContext _localctx = new Xc_packageContext(_ctx, getState());
        enterRule(_localctx, 208, RULE_xc_package);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1344);
                match(PACKAGE);
                setState(1345);
                match(T__2);
                setState(1346);
                match(REFERENCE);
                setState(1347);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Package_product_dependenciesContext extends ParserRuleContext {
        public TerminalNode PACKAGE_PRODUCT_DEPENDENCIES() { return getToken(PbxprojParser.PACKAGE_PRODUCT_DEPENDENCIES, 0); }
        public Reference_listContext reference_list() {
            return getRuleContext(Reference_listContext.class,0);
        }
        public Package_product_dependenciesContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_package_product_dependencies; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterPackage_product_dependencies(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitPackage_product_dependencies(this);
        }
    }

    public final Package_product_dependenciesContext package_product_dependencies() throws RecognitionException {
        Package_product_dependenciesContext _localctx = new Package_product_dependenciesContext(_ctx, getState());
        enterRule(_localctx, 210, RULE_package_product_dependencies);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1349);
                match(PACKAGE_PRODUCT_DEPENDENCIES);
                setState(1350);
                match(T__2);
                setState(1351);
                reference_list();
                setState(1352);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class NameContext extends ParserRuleContext {
        public TerminalNode NAME() { return getToken(PbxprojParser.NAME, 0); }
        public Any_stringContext any_string() {
            return getRuleContext(Any_stringContext.class,0);
        }
        public NameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_name; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterName(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitName(this);
        }
    }

    public final NameContext name() throws RecognitionException {
        NameContext _localctx = new NameContext(_ctx, getState());
        enterRule(_localctx, 212, RULE_name);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1354);
                match(NAME);
                setState(1355);
                match(T__2);
                setState(1356);
                any_string();
                setState(1357);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class PathContext extends ParserRuleContext {
        public TerminalNode PATH() { return getToken(PbxprojParser.PATH, 0); }
        public Str_number_variableContext str_number_variable() {
            return getRuleContext(Str_number_variableContext.class,0);
        }
        public PathContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_path; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterPath(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitPath(this);
        }
    }

    public final PathContext path() throws RecognitionException {
        PathContext _localctx = new PathContext(_ctx, getState());
        enterRule(_localctx, 214, RULE_path);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1359);
                match(PATH);
                setState(1360);
                match(T__2);
                setState(1361);
                str_number_variable();
                setState(1362);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Source_treeContext extends ParserRuleContext {
        public TerminalNode SOURCE_TREE() { return getToken(PbxprojParser.SOURCE_TREE, 0); }
        public Any_stringContext any_string() {
            return getRuleContext(Any_stringContext.class,0);
        }
        public Source_treeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_source_tree; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterSource_tree(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitSource_tree(this);
        }
    }

    public final Source_treeContext source_tree() throws RecognitionException {
        Source_treeContext _localctx = new Source_treeContext(_ctx, getState());
        enterRule(_localctx, 216, RULE_source_tree);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1364);
                match(SOURCE_TREE);
                setState(1365);
                match(T__2);
                setState(1366);
                any_string();
                setState(1367);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Build_action_maskContext extends ParserRuleContext {
        public TerminalNode BUILD_ACTION_MASK() { return getToken(PbxprojParser.BUILD_ACTION_MASK, 0); }
        public TerminalNode NUMBER() { return getToken(PbxprojParser.NUMBER, 0); }
        public Build_action_maskContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_build_action_mask; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterBuild_action_mask(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitBuild_action_mask(this);
        }
    }

    public final Build_action_maskContext build_action_mask() throws RecognitionException {
        Build_action_maskContext _localctx = new Build_action_maskContext(_ctx, getState());
        enterRule(_localctx, 218, RULE_build_action_mask);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1369);
                match(BUILD_ACTION_MASK);
                setState(1370);
                match(T__2);
                setState(1371);
                match(NUMBER);
                setState(1372);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class FilesContext extends ParserRuleContext {
        public TerminalNode FILES() { return getToken(PbxprojParser.FILES, 0); }
        public Reference_listContext reference_list() {
            return getRuleContext(Reference_listContext.class,0);
        }
        public FilesContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_files; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterFiles(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitFiles(this);
        }
    }

    public final FilesContext files() throws RecognitionException {
        FilesContext _localctx = new FilesContext(_ctx, getState());
        enterRule(_localctx, 220, RULE_files);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1374);
                match(FILES);
                setState(1375);
                match(T__2);
                setState(1376);
                reference_list();
                setState(1377);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Run_only_for_deployment_postprocessingContext extends ParserRuleContext {
        public TerminalNode RUN_ONLY_FOR_DEPLOYMENT_POSTPROCESSING() { return getToken(PbxprojParser.RUN_ONLY_FOR_DEPLOYMENT_POSTPROCESSING, 0); }
        public TerminalNode NUMBER() { return getToken(PbxprojParser.NUMBER, 0); }
        public Run_only_for_deployment_postprocessingContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_run_only_for_deployment_postprocessing; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterRun_only_for_deployment_postprocessing(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitRun_only_for_deployment_postprocessing(this);
        }
    }

    public final Run_only_for_deployment_postprocessingContext run_only_for_deployment_postprocessing() throws RecognitionException {
        Run_only_for_deployment_postprocessingContext _localctx = new Run_only_for_deployment_postprocessingContext(_ctx, getState());
        enterRule(_localctx, 222, RULE_run_only_for_deployment_postprocessing);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1379);
                match(RUN_ONLY_FOR_DEPLOYMENT_POSTPROCESSING);
                setState(1380);
                match(T__2);
                setState(1381);
                match(NUMBER);
                setState(1382);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Reference_listContext extends ParserRuleContext {
        public List<TerminalNode> REFERENCE() { return getTokens(PbxprojParser.REFERENCE); }
        public TerminalNode REFERENCE(int i) {
            return getToken(PbxprojParser.REFERENCE, i);
        }
        public Reference_listContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_reference_list; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterReference_list(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitReference_list(this);
        }
    }

    public final Reference_listContext reference_list() throws RecognitionException {
        Reference_listContext _localctx = new Reference_listContext(_ctx, getState());
        enterRule(_localctx, 224, RULE_reference_list);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1384);
                match(T__4);
                setState(1389);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==REFERENCE) {
                    {
                        {
                            setState(1385);
                            match(REFERENCE);
                            setState(1386);
                            match(T__5);
                        }
                    }
                    setState(1391);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(1392);
                match(T__6);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Any_string_listContext extends ParserRuleContext {
        public List<Str_number_variableContext> str_number_variable() {
            return getRuleContexts(Str_number_variableContext.class);
        }
        public Str_number_variableContext str_number_variable(int i) {
            return getRuleContext(Str_number_variableContext.class,i);
        }
        public Any_string_listContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_any_string_list; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterAny_string_list(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitAny_string_list(this);
        }
    }

    public final Any_string_listContext any_string_list() throws RecognitionException {
        Any_string_listContext _localctx = new Any_string_listContext(_ctx, getState());
        enterRule(_localctx, 226, RULE_any_string_list);
        int _la;
        try {
            int _alt;
            setState(1410);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1394);
                    match(T__4);
                    setState(1395);
                    match(T__6);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1396);
                    match(T__4);
                    setState(1397);
                    str_number_variable();
                    setState(1402);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,123,_ctx);
                    while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                        if ( _alt==1 ) {
                            {
                                {
                                    setState(1398);
                                    match(T__5);
                                    setState(1399);
                                    str_number_variable();
                                }
                            }
                        }
                        setState(1404);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,123,_ctx);
                    }
                    setState(1406);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la==T__5) {
                        {
                            setState(1405);
                            match(T__5);
                        }
                    }

                    setState(1408);
                    match(T__6);
                }
                break;
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Non_quoted_strings_listContext extends ParserRuleContext {
        public List<TerminalNode> NON_QUOTED_STRING() { return getTokens(PbxprojParser.NON_QUOTED_STRING); }
        public TerminalNode NON_QUOTED_STRING(int i) {
            return getToken(PbxprojParser.NON_QUOTED_STRING, i);
        }
        public Non_quoted_strings_listContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_non_quoted_strings_list; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterNon_quoted_strings_list(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitNon_quoted_strings_list(this);
        }
    }

    public final Non_quoted_strings_listContext non_quoted_strings_list() throws RecognitionException {
        Non_quoted_strings_listContext _localctx = new Non_quoted_strings_listContext(_ctx, getState());
        enterRule(_localctx, 228, RULE_non_quoted_strings_list);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1412);
                match(T__4);
                setState(1417);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==NON_QUOTED_STRING) {
                    {
                        {
                            setState(1413);
                            match(NON_QUOTED_STRING);
                            setState(1414);
                            match(T__5);
                        }
                    }
                    setState(1419);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(1420);
                match(T__6);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Build_configuration_listContext extends ParserRuleContext {
        public TerminalNode BUILD_CONFIGURATION_LIST() { return getToken(PbxprojParser.BUILD_CONFIGURATION_LIST, 0); }
        public TerminalNode REFERENCE() { return getToken(PbxprojParser.REFERENCE, 0); }
        public Build_configuration_listContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_build_configuration_list; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterBuild_configuration_list(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitBuild_configuration_list(this);
        }
    }

    public final Build_configuration_listContext build_configuration_list() throws RecognitionException {
        Build_configuration_listContext _localctx = new Build_configuration_listContext(_ctx, getState());
        enterRule(_localctx, 230, RULE_build_configuration_list);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1422);
                match(BUILD_CONFIGURATION_LIST);
                setState(1423);
                match(T__2);
                setState(1424);
                match(REFERENCE);
                setState(1425);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Build_phasesContext extends ParserRuleContext {
        public TerminalNode BUILD_PHASES() { return getToken(PbxprojParser.BUILD_PHASES, 0); }
        public Reference_listContext reference_list() {
            return getRuleContext(Reference_listContext.class,0);
        }
        public Build_phasesContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_build_phases; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterBuild_phases(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitBuild_phases(this);
        }
    }

    public final Build_phasesContext build_phases() throws RecognitionException {
        Build_phasesContext _localctx = new Build_phasesContext(_ctx, getState());
        enterRule(_localctx, 232, RULE_build_phases);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1427);
                match(BUILD_PHASES);
                setState(1428);
                match(T__2);
                setState(1429);
                reference_list();
                setState(1430);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Build_rulesContext extends ParserRuleContext {
        public TerminalNode BUILD_RULES() { return getToken(PbxprojParser.BUILD_RULES, 0); }
        public Reference_listContext reference_list() {
            return getRuleContext(Reference_listContext.class,0);
        }
        public Build_rulesContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_build_rules; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterBuild_rules(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitBuild_rules(this);
        }
    }

    public final Build_rulesContext build_rules() throws RecognitionException {
        Build_rulesContext _localctx = new Build_rulesContext(_ctx, getState());
        enterRule(_localctx, 234, RULE_build_rules);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1432);
                match(BUILD_RULES);
                setState(1433);
                match(T__2);
                setState(1434);
                reference_list();
                setState(1435);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Build_arguments_stringContext extends ParserRuleContext {
        public TerminalNode BUILD_ARGUMENTS_STRING() { return getToken(PbxprojParser.BUILD_ARGUMENTS_STRING, 0); }
        public Any_stringContext any_string() {
            return getRuleContext(Any_stringContext.class,0);
        }
        public Build_arguments_stringContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_build_arguments_string; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterBuild_arguments_string(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitBuild_arguments_string(this);
        }
    }

    public final Build_arguments_stringContext build_arguments_string() throws RecognitionException {
        Build_arguments_stringContext _localctx = new Build_arguments_stringContext(_ctx, getState());
        enterRule(_localctx, 236, RULE_build_arguments_string);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1437);
                match(BUILD_ARGUMENTS_STRING);
                setState(1438);
                match(T__2);
                setState(1439);
                any_string();
                setState(1440);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Build_tool_pathContext extends ParserRuleContext {
        public TerminalNode BUILD_TOOL_PATH() { return getToken(PbxprojParser.BUILD_TOOL_PATH, 0); }
        public Any_stringContext any_string() {
            return getRuleContext(Any_stringContext.class,0);
        }
        public Build_tool_pathContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_build_tool_path; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterBuild_tool_path(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitBuild_tool_path(this);
        }
    }

    public final Build_tool_pathContext build_tool_path() throws RecognitionException {
        Build_tool_pathContext _localctx = new Build_tool_pathContext(_ctx, getState());
        enterRule(_localctx, 238, RULE_build_tool_path);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1442);
                match(BUILD_TOOL_PATH);
                setState(1443);
                match(T__2);
                setState(1444);
                any_string();
                setState(1445);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Build_working_directoryContext extends ParserRuleContext {
        public TerminalNode BUILD_WORKING_DIRECTORY() { return getToken(PbxprojParser.BUILD_WORKING_DIRECTORY, 0); }
        public Any_stringContext any_string() {
            return getRuleContext(Any_stringContext.class,0);
        }
        public Build_working_directoryContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_build_working_directory; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterBuild_working_directory(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitBuild_working_directory(this);
        }
    }

    public final Build_working_directoryContext build_working_directory() throws RecognitionException {
        Build_working_directoryContext _localctx = new Build_working_directoryContext(_ctx, getState());
        enterRule(_localctx, 240, RULE_build_working_directory);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1447);
                match(BUILD_WORKING_DIRECTORY);
                setState(1448);
                match(T__2);
                setState(1449);
                any_string();
                setState(1450);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Pass_build_settings_in_environmentContext extends ParserRuleContext {
        public TerminalNode PASS_BUILD_SETTINGS_IN_ENVIRONMENT() { return getToken(PbxprojParser.PASS_BUILD_SETTINGS_IN_ENVIRONMENT, 0); }
        public TerminalNode NUMBER() { return getToken(PbxprojParser.NUMBER, 0); }
        public Pass_build_settings_in_environmentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_pass_build_settings_in_environment; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterPass_build_settings_in_environment(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitPass_build_settings_in_environment(this);
        }
    }

    public final Pass_build_settings_in_environmentContext pass_build_settings_in_environment() throws RecognitionException {
        Pass_build_settings_in_environmentContext _localctx = new Pass_build_settings_in_environmentContext(_ctx, getState());
        enterRule(_localctx, 242, RULE_pass_build_settings_in_environment);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1452);
                match(PASS_BUILD_SETTINGS_IN_ENVIRONMENT);
                setState(1453);
                match(T__2);
                setState(1454);
                match(NUMBER);
                setState(1455);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class DependenciesContext extends ParserRuleContext {
        public TerminalNode DEPENDENCIES() { return getToken(PbxprojParser.DEPENDENCIES, 0); }
        public Reference_listContext reference_list() {
            return getRuleContext(Reference_listContext.class,0);
        }
        public DependenciesContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_dependencies; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterDependencies(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitDependencies(this);
        }
    }

    public final DependenciesContext dependencies() throws RecognitionException {
        DependenciesContext _localctx = new DependenciesContext(_ctx, getState());
        enterRule(_localctx, 244, RULE_dependencies);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1457);
                match(DEPENDENCIES);
                setState(1458);
                match(T__2);
                setState(1459);
                reference_list();
                setState(1460);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Product_nameContext extends ParserRuleContext {
        public TerminalNode PRODUCT_NAME() { return getToken(PbxprojParser.PRODUCT_NAME, 0); }
        public Str_number_variableContext str_number_variable() {
            return getRuleContext(Str_number_variableContext.class,0);
        }
        public Product_nameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_product_name; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterProduct_name(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitProduct_name(this);
        }
    }

    public final Product_nameContext product_name() throws RecognitionException {
        Product_nameContext _localctx = new Product_nameContext(_ctx, getState());
        enterRule(_localctx, 246, RULE_product_name);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1462);
                match(PRODUCT_NAME);
                setState(1463);
                match(T__2);
                setState(1464);
                str_number_variable();
                setState(1465);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Product_referenceContext extends ParserRuleContext {
        public TerminalNode PRODUCT_REFERENCE() { return getToken(PbxprojParser.PRODUCT_REFERENCE, 0); }
        public TerminalNode REFERENCE() { return getToken(PbxprojParser.REFERENCE, 0); }
        public Product_referenceContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_product_reference; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterProduct_reference(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitProduct_reference(this);
        }
    }

    public final Product_referenceContext product_reference() throws RecognitionException {
        Product_referenceContext _localctx = new Product_referenceContext(_ctx, getState());
        enterRule(_localctx, 248, RULE_product_reference);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1467);
                match(PRODUCT_REFERENCE);
                setState(1468);
                match(T__2);
                setState(1469);
                match(REFERENCE);
                setState(1470);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Product_typeContext extends ParserRuleContext {
        public TerminalNode PRODUCT_TYPE() { return getToken(PbxprojParser.PRODUCT_TYPE, 0); }
        public TerminalNode QUOTED_STRING() { return getToken(PbxprojParser.QUOTED_STRING, 0); }
        public Product_typeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_product_type; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterProduct_type(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitProduct_type(this);
        }
    }

    public final Product_typeContext product_type() throws RecognitionException {
        Product_typeContext _localctx = new Product_typeContext(_ctx, getState());
        enterRule(_localctx, 250, RULE_product_type);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1472);
                match(PRODUCT_TYPE);
                setState(1473);
                match(T__2);
                setState(1474);
                match(QUOTED_STRING);
                setState(1475);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Line_endingContext extends ParserRuleContext {
        public TerminalNode LINE_ENDING() { return getToken(PbxprojParser.LINE_ENDING, 0); }
        public TerminalNode NUMBER() { return getToken(PbxprojParser.NUMBER, 0); }
        public Line_endingContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_line_ending; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterLine_ending(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitLine_ending(this);
        }
    }

    public final Line_endingContext line_ending() throws RecognitionException {
        Line_endingContext _localctx = new Line_endingContext(_ctx, getState());
        enterRule(_localctx, 252, RULE_line_ending);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1477);
                match(LINE_ENDING);
                setState(1478);
                match(T__2);
                setState(1479);
                match(NUMBER);
                setState(1480);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Xc_language_specification_identifierContext extends ParserRuleContext {
        public TerminalNode XC_LANGUAGE_SPECIFICATION_IDENTIFIER() { return getToken(PbxprojParser.XC_LANGUAGE_SPECIFICATION_IDENTIFIER, 0); }
        public Str_number_variableContext str_number_variable() {
            return getRuleContext(Str_number_variableContext.class,0);
        }
        public Xc_language_specification_identifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_xc_language_specification_identifier; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterXc_language_specification_identifier(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitXc_language_specification_identifier(this);
        }
    }

    public final Xc_language_specification_identifierContext xc_language_specification_identifier() throws RecognitionException {
        Xc_language_specification_identifierContext _localctx = new Xc_language_specification_identifierContext(_ctx, getState());
        enterRule(_localctx, 254, RULE_xc_language_specification_identifier);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1482);
                match(XC_LANGUAGE_SPECIFICATION_IDENTIFIER);
                setState(1483);
                match(T__2);
                setState(1484);
                str_number_variable();
                setState(1485);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Plist_structure_definition_identifierContext extends ParserRuleContext {
        public TerminalNode PLIST_STRUCTURE_DEFINITION_IDENTIFIER() { return getToken(PbxprojParser.PLIST_STRUCTURE_DEFINITION_IDENTIFIER, 0); }
        public Str_number_variableContext str_number_variable() {
            return getRuleContext(Str_number_variableContext.class,0);
        }
        public Plist_structure_definition_identifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_plist_structure_definition_identifier; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterPlist_structure_definition_identifier(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitPlist_structure_definition_identifier(this);
        }
    }

    public final Plist_structure_definition_identifierContext plist_structure_definition_identifier() throws RecognitionException {
        Plist_structure_definition_identifierContext _localctx = new Plist_structure_definition_identifierContext(_ctx, getState());
        enterRule(_localctx, 256, RULE_plist_structure_definition_identifier);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1487);
                match(PLIST_STRUCTURE_DEFINITION_IDENTIFIER);
                setState(1488);
                match(T__2);
                setState(1489);
                str_number_variable();
                setState(1490);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Ref_typeContext extends ParserRuleContext {
        public TerminalNode REF_TYPE() { return getToken(PbxprojParser.REF_TYPE, 0); }
        public TerminalNode NUMBER() { return getToken(PbxprojParser.NUMBER, 0); }
        public Ref_typeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_ref_type; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterRef_type(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitRef_type(this);
        }
    }

    public final Ref_typeContext ref_type() throws RecognitionException {
        Ref_typeContext _localctx = new Ref_typeContext(_ctx, getState());
        enterRule(_localctx, 258, RULE_ref_type);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1492);
                match(REF_TYPE);
                setState(1493);
                match(T__2);
                setState(1494);
                match(NUMBER);
                setState(1495);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Compiler_specContext extends ParserRuleContext {
        public TerminalNode COMPILER_SPEC() { return getToken(PbxprojParser.COMPILER_SPEC, 0); }
        public Any_stringContext any_string() {
            return getRuleContext(Any_stringContext.class,0);
        }
        public Compiler_specContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_compiler_spec; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterCompiler_spec(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitCompiler_spec(this);
        }
    }

    public final Compiler_specContext compiler_spec() throws RecognitionException {
        Compiler_specContext _localctx = new Compiler_specContext(_ctx, getState());
        enterRule(_localctx, 260, RULE_compiler_spec);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1497);
                match(COMPILER_SPEC);
                setState(1498);
                match(T__2);
                setState(1499);
                any_string();
                setState(1500);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class File_patternsContext extends ParserRuleContext {
        public TerminalNode FILE_PATTERNS() { return getToken(PbxprojParser.FILE_PATTERNS, 0); }
        public Any_stringContext any_string() {
            return getRuleContext(Any_stringContext.class,0);
        }
        public File_patternsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_file_patterns; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterFile_patterns(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitFile_patterns(this);
        }
    }

    public final File_patternsContext file_patterns() throws RecognitionException {
        File_patternsContext _localctx = new File_patternsContext(_ctx, getState());
        enterRule(_localctx, 262, RULE_file_patterns);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1502);
                match(FILE_PATTERNS);
                setState(1503);
                match(T__2);
                setState(1504);
                any_string();
                setState(1505);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Input_filesContext extends ParserRuleContext {
        public TerminalNode INPUT_FILES() { return getToken(PbxprojParser.INPUT_FILES, 0); }
        public Any_string_listContext any_string_list() {
            return getRuleContext(Any_string_listContext.class,0);
        }
        public Input_filesContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_input_files; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterInput_files(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitInput_files(this);
        }
    }

    public final Input_filesContext input_files() throws RecognitionException {
        Input_filesContext _localctx = new Input_filesContext(_ctx, getState());
        enterRule(_localctx, 264, RULE_input_files);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1507);
                match(INPUT_FILES);
                setState(1508);
                match(T__2);
                setState(1509);
                any_string_list();
                setState(1510);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Is_editableContext extends ParserRuleContext {
        public TerminalNode IS_EDITABLE() { return getToken(PbxprojParser.IS_EDITABLE, 0); }
        public TerminalNode NUMBER() { return getToken(PbxprojParser.NUMBER, 0); }
        public Is_editableContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_is_editable; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterIs_editable(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitIs_editable(this);
        }
    }

    public final Is_editableContext is_editable() throws RecognitionException {
        Is_editableContext _localctx = new Is_editableContext(_ctx, getState());
        enterRule(_localctx, 266, RULE_is_editable);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1512);
                match(IS_EDITABLE);
                setState(1513);
                match(T__2);
                setState(1514);
                match(NUMBER);
                setState(1515);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Output_filesContext extends ParserRuleContext {
        public TerminalNode OUTPUT_FILES() { return getToken(PbxprojParser.OUTPUT_FILES, 0); }
        public Any_string_listContext any_string_list() {
            return getRuleContext(Any_string_listContext.class,0);
        }
        public Output_filesContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_output_files; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterOutput_files(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitOutput_files(this);
        }
    }

    public final Output_filesContext output_files() throws RecognitionException {
        Output_filesContext _localctx = new Output_filesContext(_ctx, getState());
        enterRule(_localctx, 268, RULE_output_files);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1517);
                match(OUTPUT_FILES);
                setState(1518);
                match(T__2);
                setState(1519);
                any_string_list();
                setState(1520);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Run_once_per_archContext extends ParserRuleContext {
        public TerminalNode RUN_ONCE_PER_ARCH() { return getToken(PbxprojParser.RUN_ONCE_PER_ARCH, 0); }
        public TerminalNode NUMBER() { return getToken(PbxprojParser.NUMBER, 0); }
        public Run_once_per_archContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_run_once_per_arch; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterRun_once_per_arch(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitRun_once_per_arch(this);
        }
    }

    public final Run_once_per_archContext run_once_per_arch() throws RecognitionException {
        Run_once_per_archContext _localctx = new Run_once_per_archContext(_ctx, getState());
        enterRule(_localctx, 270, RULE_run_once_per_arch);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1522);
                match(RUN_ONCE_PER_ARCH);
                setState(1523);
                match(T__2);
                setState(1524);
                match(NUMBER);
                setState(1525);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ScriptContext extends ParserRuleContext {
        public TerminalNode SCRIPT() { return getToken(PbxprojParser.SCRIPT, 0); }
        public Any_stringContext any_string() {
            return getRuleContext(Any_stringContext.class,0);
        }
        public ScriptContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_script; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterScript(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitScript(this);
        }
    }

    public final ScriptContext script() throws RecognitionException {
        ScriptContext _localctx = new ScriptContext(_ctx, getState());
        enterRule(_localctx, 272, RULE_script);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1527);
                match(SCRIPT);
                setState(1528);
                match(T__2);
                setState(1529);
                any_string();
                setState(1530);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class AttributesContext extends ParserRuleContext {
        public TerminalNode ATTRIBUTES() { return getToken(PbxprojParser.ATTRIBUTES, 0); }
        public Build_targets_in_parallelContext build_targets_in_parallel() {
            return getRuleContext(Build_targets_in_parallelContext.class,0);
        }
        public Class_prefixContext class_prefix() {
            return getRuleContext(Class_prefixContext.class,0);
        }
        public Default_build_system_type_for_workspaceContext default_build_system_type_for_workspace() {
            return getRuleContext(Default_build_system_type_for_workspaceContext.class,0);
        }
        public Last_swift_migrationContext last_swift_migration() {
            return getRuleContext(Last_swift_migrationContext.class,0);
        }
        public Last_swift_update_checkContext last_swift_update_check() {
            return getRuleContext(Last_swift_update_checkContext.class,0);
        }
        public Last_testing_upgrade_checkContext last_testing_upgrade_check() {
            return getRuleContext(Last_testing_upgrade_checkContext.class,0);
        }
        public Last_upgrade_checkContext last_upgrade_check() {
            return getRuleContext(Last_upgrade_checkContext.class,0);
        }
        public Organization_nameContext organization_name() {
            return getRuleContext(Organization_nameContext.class,0);
        }
        public Target_attributesContext target_attributes() {
            return getRuleContext(Target_attributesContext.class,0);
        }
        public AttributesContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_attributes; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterAttributes(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitAttributes(this);
        }
    }

    public final AttributesContext attributes() throws RecognitionException {
        AttributesContext _localctx = new AttributesContext(_ctx, getState());
        enterRule(_localctx, 274, RULE_attributes);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1532);
                match(ATTRIBUTES);
                setState(1533);
                match(T__2);
                setState(1534);
                match(T__0);
                setState(1536);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==BUILD_INDEPENDENT_TARGETS_IN_PARALLEL) {
                    {
                        setState(1535);
                        build_targets_in_parallel();
                    }
                }

                setState(1539);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==CLASSPREFIX) {
                    {
                        setState(1538);
                        class_prefix();
                    }
                }

                setState(1542);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==DEFAULT_BUILD_SYSTEM_TYPE_FOR_WORKSPACE) {
                    {
                        setState(1541);
                        default_build_system_type_for_workspace();
                    }
                }

                setState(1545);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==LAST_SWIFT_MIGRATION) {
                    {
                        setState(1544);
                        last_swift_migration();
                    }
                }

                setState(1548);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==LAST_SWIFT_UPDATE_CHECK) {
                    {
                        setState(1547);
                        last_swift_update_check();
                    }
                }

                setState(1551);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==LAST_TESTING_UPGRADE_CHECK) {
                    {
                        setState(1550);
                        last_testing_upgrade_check();
                    }
                }

                setState(1554);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==LAST_UPGRADE_CHECK) {
                    {
                        setState(1553);
                        last_upgrade_check();
                    }
                }

                setState(1557);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==ORGANIZATION_NAME) {
                    {
                        setState(1556);
                        organization_name();
                    }
                }

                setState(1560);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==TARGET_ATTRIBUTES) {
                    {
                        setState(1559);
                        target_attributes();
                    }
                }

                setState(1562);
                match(T__1);
                setState(1563);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Last_swift_migrationContext extends ParserRuleContext {
        public TerminalNode LAST_SWIFT_MIGRATION() { return getToken(PbxprojParser.LAST_SWIFT_MIGRATION, 0); }
        public TerminalNode NUMBER() { return getToken(PbxprojParser.NUMBER, 0); }
        public Last_swift_migrationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_last_swift_migration; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterLast_swift_migration(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitLast_swift_migration(this);
        }
    }

    public final Last_swift_migrationContext last_swift_migration() throws RecognitionException {
        Last_swift_migrationContext _localctx = new Last_swift_migrationContext(_ctx, getState());
        enterRule(_localctx, 276, RULE_last_swift_migration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1565);
                match(LAST_SWIFT_MIGRATION);
                setState(1566);
                match(T__2);
                setState(1567);
                match(NUMBER);
                setState(1568);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Default_build_system_type_for_workspaceContext extends ParserRuleContext {
        public TerminalNode DEFAULT_BUILD_SYSTEM_TYPE_FOR_WORKSPACE() { return getToken(PbxprojParser.DEFAULT_BUILD_SYSTEM_TYPE_FOR_WORKSPACE, 0); }
        public TerminalNode NON_QUOTED_STRING() { return getToken(PbxprojParser.NON_QUOTED_STRING, 0); }
        public Default_build_system_type_for_workspaceContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_default_build_system_type_for_workspace; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterDefault_build_system_type_for_workspace(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitDefault_build_system_type_for_workspace(this);
        }
    }

    public final Default_build_system_type_for_workspaceContext default_build_system_type_for_workspace() throws RecognitionException {
        Default_build_system_type_for_workspaceContext _localctx = new Default_build_system_type_for_workspaceContext(_ctx, getState());
        enterRule(_localctx, 278, RULE_default_build_system_type_for_workspace);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1570);
                match(DEFAULT_BUILD_SYSTEM_TYPE_FOR_WORKSPACE);
                setState(1571);
                match(T__2);
                setState(1572);
                match(NON_QUOTED_STRING);
                setState(1573);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Last_swift_update_checkContext extends ParserRuleContext {
        public TerminalNode LAST_SWIFT_UPDATE_CHECK() { return getToken(PbxprojParser.LAST_SWIFT_UPDATE_CHECK, 0); }
        public TerminalNode NUMBER() { return getToken(PbxprojParser.NUMBER, 0); }
        public Last_swift_update_checkContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_last_swift_update_check; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterLast_swift_update_check(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitLast_swift_update_check(this);
        }
    }

    public final Last_swift_update_checkContext last_swift_update_check() throws RecognitionException {
        Last_swift_update_checkContext _localctx = new Last_swift_update_checkContext(_ctx, getState());
        enterRule(_localctx, 280, RULE_last_swift_update_check);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1575);
                match(LAST_SWIFT_UPDATE_CHECK);
                setState(1576);
                match(T__2);
                setState(1577);
                match(NUMBER);
                setState(1578);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Build_targets_in_parallelContext extends ParserRuleContext {
        public TerminalNode BUILD_INDEPENDENT_TARGETS_IN_PARALLEL() { return getToken(PbxprojParser.BUILD_INDEPENDENT_TARGETS_IN_PARALLEL, 0); }
        public TerminalNode NUMBER() { return getToken(PbxprojParser.NUMBER, 0); }
        public TerminalNode NON_QUOTED_STRING() { return getToken(PbxprojParser.NON_QUOTED_STRING, 0); }
        public Build_targets_in_parallelContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_build_targets_in_parallel; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterBuild_targets_in_parallel(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitBuild_targets_in_parallel(this);
        }
    }

    public final Build_targets_in_parallelContext build_targets_in_parallel() throws RecognitionException {
        Build_targets_in_parallelContext _localctx = new Build_targets_in_parallelContext(_ctx, getState());
        enterRule(_localctx, 282, RULE_build_targets_in_parallel);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1580);
                match(BUILD_INDEPENDENT_TARGETS_IN_PARALLEL);
                setState(1581);
                match(T__2);
                setState(1582);
                _la = _input.LA(1);
                if ( !(_la==NUMBER || _la==NON_QUOTED_STRING) ) {
                    _errHandler.recoverInline(this);
                }
                else {
                    if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
                setState(1583);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Last_testing_upgrade_checkContext extends ParserRuleContext {
        public TerminalNode LAST_TESTING_UPGRADE_CHECK() { return getToken(PbxprojParser.LAST_TESTING_UPGRADE_CHECK, 0); }
        public TerminalNode NUMBER() { return getToken(PbxprojParser.NUMBER, 0); }
        public Last_testing_upgrade_checkContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_last_testing_upgrade_check; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterLast_testing_upgrade_check(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitLast_testing_upgrade_check(this);
        }
    }

    public final Last_testing_upgrade_checkContext last_testing_upgrade_check() throws RecognitionException {
        Last_testing_upgrade_checkContext _localctx = new Last_testing_upgrade_checkContext(_ctx, getState());
        enterRule(_localctx, 284, RULE_last_testing_upgrade_check);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1585);
                match(LAST_TESTING_UPGRADE_CHECK);
                setState(1586);
                match(T__2);
                setState(1587);
                match(NUMBER);
                setState(1588);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Last_upgrade_checkContext extends ParserRuleContext {
        public TerminalNode LAST_UPGRADE_CHECK() { return getToken(PbxprojParser.LAST_UPGRADE_CHECK, 0); }
        public TerminalNode NUMBER() { return getToken(PbxprojParser.NUMBER, 0); }
        public Last_upgrade_checkContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_last_upgrade_check; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterLast_upgrade_check(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitLast_upgrade_check(this);
        }
    }

    public final Last_upgrade_checkContext last_upgrade_check() throws RecognitionException {
        Last_upgrade_checkContext _localctx = new Last_upgrade_checkContext(_ctx, getState());
        enterRule(_localctx, 286, RULE_last_upgrade_check);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1590);
                match(LAST_UPGRADE_CHECK);
                setState(1591);
                match(T__2);
                setState(1592);
                match(NUMBER);
                setState(1593);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Organization_nameContext extends ParserRuleContext {
        public TerminalNode ORGANIZATION_NAME() { return getToken(PbxprojParser.ORGANIZATION_NAME, 0); }
        public Str_number_variableContext str_number_variable() {
            return getRuleContext(Str_number_variableContext.class,0);
        }
        public Organization_nameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_organization_name; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterOrganization_name(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitOrganization_name(this);
        }
    }

    public final Organization_nameContext organization_name() throws RecognitionException {
        Organization_nameContext _localctx = new Organization_nameContext(_ctx, getState());
        enterRule(_localctx, 288, RULE_organization_name);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1595);
                match(ORGANIZATION_NAME);
                setState(1596);
                match(T__2);
                setState(1597);
                str_number_variable();
                setState(1598);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Target_attributesContext extends ParserRuleContext {
        public TerminalNode TARGET_ATTRIBUTES() { return getToken(PbxprojParser.TARGET_ATTRIBUTES, 0); }
        public List<Target_attributeContext> target_attribute() {
            return getRuleContexts(Target_attributeContext.class);
        }
        public Target_attributeContext target_attribute(int i) {
            return getRuleContext(Target_attributeContext.class,i);
        }
        public Target_attributesContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_target_attributes; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterTarget_attributes(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitTarget_attributes(this);
        }
    }

    public final Target_attributesContext target_attributes() throws RecognitionException {
        Target_attributesContext _localctx = new Target_attributesContext(_ctx, getState());
        enterRule(_localctx, 290, RULE_target_attributes);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1600);
                match(TARGET_ATTRIBUTES);
                setState(1601);
                match(T__2);
                setState(1602);
                match(T__0);
                setState(1606);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==REFERENCE) {
                    {
                        {
                            setState(1603);
                            target_attribute();
                        }
                    }
                    setState(1608);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(1609);
                match(T__1);
                setState(1610);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Target_attributeContext extends ParserRuleContext {
        public TerminalNode REFERENCE() { return getToken(PbxprojParser.REFERENCE, 0); }
        public Created_on_tools_versionContext created_on_tools_version() {
            return getRuleContext(Created_on_tools_versionContext.class,0);
        }
        public List<Test_target_idContext> test_target_id() {
            return getRuleContexts(Test_target_idContext.class);
        }
        public Test_target_idContext test_target_id(int i) {
            return getRuleContext(Test_target_idContext.class,i);
        }
        public Development_teamContext development_team() {
            return getRuleContext(Development_teamContext.class,0);
        }
        public Development_team_nameContext development_team_name() {
            return getRuleContext(Development_team_nameContext.class,0);
        }
        public Last_swift_migrationContext last_swift_migration() {
            return getRuleContext(Last_swift_migrationContext.class,0);
        }
        public Provisioning_styleContext provisioning_style() {
            return getRuleContext(Provisioning_styleContext.class,0);
        }
        public System_capabilitiesContext system_capabilities() {
            return getRuleContext(System_capabilitiesContext.class,0);
        }
        public Target_attributeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_target_attribute; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterTarget_attribute(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitTarget_attribute(this);
        }
    }

    public final Target_attributeContext target_attribute() throws RecognitionException {
        Target_attributeContext _localctx = new Target_attributeContext(_ctx, getState());
        enterRule(_localctx, 292, RULE_target_attribute);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1612);
                match(REFERENCE);
                setState(1613);
                match(T__2);
                setState(1614);
                match(T__0);
                setState(1616);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==CREATED_ON_TOOLS_VERSION) {
                    {
                        setState(1615);
                        created_on_tools_version();
                    }
                }

                setState(1619);
                _errHandler.sync(this);
                switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
                    case 1:
                    {
                        setState(1618);
                        test_target_id();
                    }
                    break;
                }
                setState(1622);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==DEVELOPMENT_TEAM) {
                    {
                        setState(1621);
                        development_team();
                    }
                }

                setState(1625);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==DEVELOPMENT_TEAM_NAME) {
                    {
                        setState(1624);
                        development_team_name();
                    }
                }

                setState(1628);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==LAST_SWIFT_MIGRATION) {
                    {
                        setState(1627);
                        last_swift_migration();
                    }
                }

                setState(1631);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==PROVISIONING_STYLE) {
                    {
                        setState(1630);
                        provisioning_style();
                    }
                }

                setState(1634);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==SYSTEM_CAPABILITIES) {
                    {
                        setState(1633);
                        system_capabilities();
                    }
                }

                setState(1637);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la==TEST_TARGET_ID) {
                    {
                        setState(1636);
                        test_target_id();
                    }
                }

                setState(1639);
                match(T__1);
                setState(1640);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Created_on_tools_versionContext extends ParserRuleContext {
        public TerminalNode CREATED_ON_TOOLS_VERSION() { return getToken(PbxprojParser.CREATED_ON_TOOLS_VERSION, 0); }
        public TerminalNode NON_QUOTED_STRING() { return getToken(PbxprojParser.NON_QUOTED_STRING, 0); }
        public Created_on_tools_versionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_created_on_tools_version; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterCreated_on_tools_version(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitCreated_on_tools_version(this);
        }
    }

    public final Created_on_tools_versionContext created_on_tools_version() throws RecognitionException {
        Created_on_tools_versionContext _localctx = new Created_on_tools_versionContext(_ctx, getState());
        enterRule(_localctx, 294, RULE_created_on_tools_version);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1642);
                match(CREATED_ON_TOOLS_VERSION);
                setState(1643);
                match(T__2);
                setState(1644);
                match(NON_QUOTED_STRING);
                setState(1645);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Test_target_idContext extends ParserRuleContext {
        public TerminalNode TEST_TARGET_ID() { return getToken(PbxprojParser.TEST_TARGET_ID, 0); }
        public TerminalNode REFERENCE() { return getToken(PbxprojParser.REFERENCE, 0); }
        public Test_target_idContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_test_target_id; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterTest_target_id(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitTest_target_id(this);
        }
    }

    public final Test_target_idContext test_target_id() throws RecognitionException {
        Test_target_idContext _localctx = new Test_target_idContext(_ctx, getState());
        enterRule(_localctx, 296, RULE_test_target_id);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1647);
                match(TEST_TARGET_ID);
                setState(1648);
                match(T__2);
                setState(1649);
                match(REFERENCE);
                setState(1650);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Development_teamContext extends ParserRuleContext {
        public TerminalNode DEVELOPMENT_TEAM() { return getToken(PbxprojParser.DEVELOPMENT_TEAM, 0); }
        public Any_stringContext any_string() {
            return getRuleContext(Any_stringContext.class,0);
        }
        public Development_teamContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_development_team; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterDevelopment_team(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitDevelopment_team(this);
        }
    }

    public final Development_teamContext development_team() throws RecognitionException {
        Development_teamContext _localctx = new Development_teamContext(_ctx, getState());
        enterRule(_localctx, 298, RULE_development_team);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1652);
                match(DEVELOPMENT_TEAM);
                setState(1653);
                match(T__2);
                setState(1654);
                any_string();
                setState(1655);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Development_team_nameContext extends ParserRuleContext {
        public TerminalNode DEVELOPMENT_TEAM_NAME() { return getToken(PbxprojParser.DEVELOPMENT_TEAM_NAME, 0); }
        public Any_stringContext any_string() {
            return getRuleContext(Any_stringContext.class,0);
        }
        public Development_team_nameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_development_team_name; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterDevelopment_team_name(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitDevelopment_team_name(this);
        }
    }

    public final Development_team_nameContext development_team_name() throws RecognitionException {
        Development_team_nameContext _localctx = new Development_team_nameContext(_ctx, getState());
        enterRule(_localctx, 300, RULE_development_team_name);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1657);
                match(DEVELOPMENT_TEAM_NAME);
                setState(1658);
                match(T__2);
                setState(1659);
                any_string();
                setState(1660);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Provisioning_styleContext extends ParserRuleContext {
        public TerminalNode PROVISIONING_STYLE() { return getToken(PbxprojParser.PROVISIONING_STYLE, 0); }
        public TerminalNode NON_QUOTED_STRING() { return getToken(PbxprojParser.NON_QUOTED_STRING, 0); }
        public Provisioning_styleContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_provisioning_style; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterProvisioning_style(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitProvisioning_style(this);
        }
    }

    public final Provisioning_styleContext provisioning_style() throws RecognitionException {
        Provisioning_styleContext _localctx = new Provisioning_styleContext(_ctx, getState());
        enterRule(_localctx, 302, RULE_provisioning_style);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1662);
                match(PROVISIONING_STYLE);
                setState(1663);
                match(T__2);
                setState(1664);
                match(NON_QUOTED_STRING);
                setState(1665);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Compatibility_versionContext extends ParserRuleContext {
        public TerminalNode COMPATIBILITY_VERSION() { return getToken(PbxprojParser.COMPATIBILITY_VERSION, 0); }
        public TerminalNode QUOTED_STRING() { return getToken(PbxprojParser.QUOTED_STRING, 0); }
        public Compatibility_versionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_compatibility_version; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterCompatibility_version(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitCompatibility_version(this);
        }
    }

    public final Compatibility_versionContext compatibility_version() throws RecognitionException {
        Compatibility_versionContext _localctx = new Compatibility_versionContext(_ctx, getState());
        enterRule(_localctx, 304, RULE_compatibility_version);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1667);
                match(COMPATIBILITY_VERSION);
                setState(1668);
                match(T__2);
                setState(1669);
                match(QUOTED_STRING);
                setState(1670);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Development_regionContext extends ParserRuleContext {
        public TerminalNode DEVELOPMENT_REGION() { return getToken(PbxprojParser.DEVELOPMENT_REGION, 0); }
        public TerminalNode NON_QUOTED_STRING() { return getToken(PbxprojParser.NON_QUOTED_STRING, 0); }
        public Development_regionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_development_region; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterDevelopment_region(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitDevelopment_region(this);
        }
    }

    public final Development_regionContext development_region() throws RecognitionException {
        Development_regionContext _localctx = new Development_regionContext(_ctx, getState());
        enterRule(_localctx, 306, RULE_development_region);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1672);
                match(DEVELOPMENT_REGION);
                setState(1673);
                match(T__2);
                setState(1674);
                match(NON_QUOTED_STRING);
                setState(1675);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Has_scanned_for_encodingsContext extends ParserRuleContext {
        public TerminalNode HAS_SCANNED_FOR_ENCODINGS() { return getToken(PbxprojParser.HAS_SCANNED_FOR_ENCODINGS, 0); }
        public TerminalNode NUMBER() { return getToken(PbxprojParser.NUMBER, 0); }
        public Has_scanned_for_encodingsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_has_scanned_for_encodings; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterHas_scanned_for_encodings(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitHas_scanned_for_encodings(this);
        }
    }

    public final Has_scanned_for_encodingsContext has_scanned_for_encodings() throws RecognitionException {
        Has_scanned_for_encodingsContext _localctx = new Has_scanned_for_encodingsContext(_ctx, getState());
        enterRule(_localctx, 308, RULE_has_scanned_for_encodings);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1677);
                match(HAS_SCANNED_FOR_ENCODINGS);
                setState(1678);
                match(T__2);
                setState(1679);
                match(NUMBER);
                setState(1680);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Known_regionsContext extends ParserRuleContext {
        public TerminalNode KNOWN_REGIONS() { return getToken(PbxprojParser.KNOWN_REGIONS, 0); }
        public Any_string_listContext any_string_list() {
            return getRuleContext(Any_string_listContext.class,0);
        }
        public Known_regionsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_known_regions; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterKnown_regions(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitKnown_regions(this);
        }
    }

    public final Known_regionsContext known_regions() throws RecognitionException {
        Known_regionsContext _localctx = new Known_regionsContext(_ctx, getState());
        enterRule(_localctx, 310, RULE_known_regions);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1682);
                match(KNOWN_REGIONS);
                setState(1683);
                match(T__2);
                setState(1684);
                any_string_list();
                setState(1685);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Main_groupContext extends ParserRuleContext {
        public TerminalNode MAIN_GROUP() { return getToken(PbxprojParser.MAIN_GROUP, 0); }
        public TerminalNode REFERENCE() { return getToken(PbxprojParser.REFERENCE, 0); }
        public Main_groupContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_main_group; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterMain_group(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitMain_group(this);
        }
    }

    public final Main_groupContext main_group() throws RecognitionException {
        Main_groupContext _localctx = new Main_groupContext(_ctx, getState());
        enterRule(_localctx, 312, RULE_main_group);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1687);
                match(MAIN_GROUP);
                setState(1688);
                match(T__2);
                setState(1689);
                match(REFERENCE);
                setState(1690);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Product_ref_groupContext extends ParserRuleContext {
        public TerminalNode PRODUCT_REF_GROUP() { return getToken(PbxprojParser.PRODUCT_REF_GROUP, 0); }
        public TerminalNode REFERENCE() { return getToken(PbxprojParser.REFERENCE, 0); }
        public Product_ref_groupContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_product_ref_group; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterProduct_ref_group(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitProduct_ref_group(this);
        }
    }

    public final Product_ref_groupContext product_ref_group() throws RecognitionException {
        Product_ref_groupContext _localctx = new Product_ref_groupContext(_ctx, getState());
        enterRule(_localctx, 314, RULE_product_ref_group);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1692);
                match(PRODUCT_REF_GROUP);
                setState(1693);
                match(T__2);
                setState(1694);
                match(REFERENCE);
                setState(1695);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Package_referencesContext extends ParserRuleContext {
        public TerminalNode PACKAGE_REFERENCES() { return getToken(PbxprojParser.PACKAGE_REFERENCES, 0); }
        public Reference_listContext reference_list() {
            return getRuleContext(Reference_listContext.class,0);
        }
        public Package_referencesContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_package_references; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterPackage_references(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitPackage_references(this);
        }
    }

    public final Package_referencesContext package_references() throws RecognitionException {
        Package_referencesContext _localctx = new Package_referencesContext(_ctx, getState());
        enterRule(_localctx, 316, RULE_package_references);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1697);
                match(PACKAGE_REFERENCES);
                setState(1698);
                match(T__2);
                setState(1699);
                reference_list();
                setState(1700);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Project_dir_pathContext extends ParserRuleContext {
        public TerminalNode PRODUCT_DIR_PATH() { return getToken(PbxprojParser.PRODUCT_DIR_PATH, 0); }
        public Any_stringContext any_string() {
            return getRuleContext(Any_stringContext.class,0);
        }
        public Project_dir_pathContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_project_dir_path; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterProject_dir_path(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitProject_dir_path(this);
        }
    }

    public final Project_dir_pathContext project_dir_path() throws RecognitionException {
        Project_dir_pathContext _localctx = new Project_dir_pathContext(_ctx, getState());
        enterRule(_localctx, 318, RULE_project_dir_path);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1702);
                match(PRODUCT_DIR_PATH);
                setState(1703);
                match(T__2);
                setState(1704);
                any_string();
                setState(1705);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Project_referencesContext extends ParserRuleContext {
        public TerminalNode PROJECT_REFERENCES() { return getToken(PbxprojParser.PROJECT_REFERENCES, 0); }
        public Str_number_variableContext str_number_variable() {
            return getRuleContext(Str_number_variableContext.class,0);
        }
        public Project_references_listContext project_references_list() {
            return getRuleContext(Project_references_listContext.class,0);
        }
        public Project_referencesContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_project_references; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterProject_references(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitProject_references(this);
        }
    }

    public final Project_referencesContext project_references() throws RecognitionException {
        Project_referencesContext _localctx = new Project_referencesContext(_ctx, getState());
        enterRule(_localctx, 320, RULE_project_references);
        try {
            setState(1719);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1707);
                    match(PROJECT_REFERENCES);
                    setState(1708);
                    match(T__2);
                    setState(1709);
                    str_number_variable();
                    setState(1710);
                    match(T__3);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1712);
                    match(PROJECT_REFERENCES);
                    setState(1713);
                    match(T__2);
                    setState(1714);
                    match(T__4);
                    setState(1715);
                    project_references_list();
                    setState(1716);
                    match(T__6);
                    setState(1717);
                    match(T__3);
                }
                break;
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Project_rootContext extends ParserRuleContext {
        public TerminalNode PROJECT_ROOT() { return getToken(PbxprojParser.PROJECT_ROOT, 0); }
        public Any_stringContext any_string() {
            return getRuleContext(Any_stringContext.class,0);
        }
        public Project_rootContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_project_root; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterProject_root(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitProject_root(this);
        }
    }

    public final Project_rootContext project_root() throws RecognitionException {
        Project_rootContext _localctx = new Project_rootContext(_ctx, getState());
        enterRule(_localctx, 322, RULE_project_root);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1721);
                match(PROJECT_ROOT);
                setState(1722);
                match(T__2);
                setState(1723);
                any_string();
                setState(1724);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TargetsContext extends ParserRuleContext {
        public TerminalNode TARGETS() { return getToken(PbxprojParser.TARGETS, 0); }
        public Reference_listContext reference_list() {
            return getRuleContext(Reference_listContext.class,0);
        }
        public TargetsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_targets; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterTargets(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitTargets(this);
        }
    }

    public final TargetsContext targets() throws RecognitionException {
        TargetsContext _localctx = new TargetsContext(_ctx, getState());
        enterRule(_localctx, 324, RULE_targets);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1726);
                match(TARGETS);
                setState(1727);
                match(T__2);
                setState(1728);
                reference_list();
                setState(1729);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Input_file_list_pathsContext extends ParserRuleContext {
        public TerminalNode INPUT_FILE_LIST_PATHS() { return getToken(PbxprojParser.INPUT_FILE_LIST_PATHS, 0); }
        public Any_string_listContext any_string_list() {
            return getRuleContext(Any_string_listContext.class,0);
        }
        public Input_file_list_pathsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_input_file_list_paths; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterInput_file_list_paths(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitInput_file_list_paths(this);
        }
    }

    public final Input_file_list_pathsContext input_file_list_paths() throws RecognitionException {
        Input_file_list_pathsContext _localctx = new Input_file_list_pathsContext(_ctx, getState());
        enterRule(_localctx, 326, RULE_input_file_list_paths);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1731);
                match(INPUT_FILE_LIST_PATHS);
                setState(1732);
                match(T__2);
                setState(1733);
                any_string_list();
                setState(1734);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Input_pathsContext extends ParserRuleContext {
        public TerminalNode INPUT_PATHS() { return getToken(PbxprojParser.INPUT_PATHS, 0); }
        public Any_string_listContext any_string_list() {
            return getRuleContext(Any_string_listContext.class,0);
        }
        public Input_pathsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_input_paths; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterInput_paths(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitInput_paths(this);
        }
    }

    public final Input_pathsContext input_paths() throws RecognitionException {
        Input_pathsContext _localctx = new Input_pathsContext(_ctx, getState());
        enterRule(_localctx, 328, RULE_input_paths);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1736);
                match(INPUT_PATHS);
                setState(1737);
                match(T__2);
                setState(1738);
                any_string_list();
                setState(1739);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Output_file_list_pathsContext extends ParserRuleContext {
        public TerminalNode OUTPUT_FILE_LIST_PATHS() { return getToken(PbxprojParser.OUTPUT_FILE_LIST_PATHS, 0); }
        public Any_string_listContext any_string_list() {
            return getRuleContext(Any_string_listContext.class,0);
        }
        public Output_file_list_pathsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_output_file_list_paths; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterOutput_file_list_paths(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitOutput_file_list_paths(this);
        }
    }

    public final Output_file_list_pathsContext output_file_list_paths() throws RecognitionException {
        Output_file_list_pathsContext _localctx = new Output_file_list_pathsContext(_ctx, getState());
        enterRule(_localctx, 330, RULE_output_file_list_paths);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1741);
                match(OUTPUT_FILE_LIST_PATHS);
                setState(1742);
                match(T__2);
                setState(1743);
                any_string_list();
                setState(1744);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Output_pathsContext extends ParserRuleContext {
        public TerminalNode OUTPUT_PATHS() { return getToken(PbxprojParser.OUTPUT_PATHS, 0); }
        public Any_string_listContext any_string_list() {
            return getRuleContext(Any_string_listContext.class,0);
        }
        public Output_pathsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_output_paths; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterOutput_paths(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitOutput_paths(this);
        }
    }

    public final Output_pathsContext output_paths() throws RecognitionException {
        Output_pathsContext _localctx = new Output_pathsContext(_ctx, getState());
        enterRule(_localctx, 332, RULE_output_paths);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1746);
                match(OUTPUT_PATHS);
                setState(1747);
                match(T__2);
                setState(1748);
                any_string_list();
                setState(1749);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Shell_pathContext extends ParserRuleContext {
        public TerminalNode SHELL_PATH() { return getToken(PbxprojParser.SHELL_PATH, 0); }
        public Any_stringContext any_string() {
            return getRuleContext(Any_stringContext.class,0);
        }
        public Shell_pathContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_shell_path; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterShell_path(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitShell_path(this);
        }
    }

    public final Shell_pathContext shell_path() throws RecognitionException {
        Shell_pathContext _localctx = new Shell_pathContext(_ctx, getState());
        enterRule(_localctx, 334, RULE_shell_path);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1751);
                match(SHELL_PATH);
                setState(1752);
                match(T__2);
                setState(1753);
                any_string();
                setState(1754);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ShellContext extends ParserRuleContext {
        public TerminalNode SHELL() { return getToken(PbxprojParser.SHELL, 0); }
        public TerminalNode QUOTED_STRING() { return getToken(PbxprojParser.QUOTED_STRING, 0); }
        public ShellContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_shell; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterShell(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitShell(this);
        }
    }

    public final ShellContext shell() throws RecognitionException {
        ShellContext _localctx = new ShellContext(_ctx, getState());
        enterRule(_localctx, 336, RULE_shell);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1756);
                match(SHELL);
                setState(1757);
                match(T__2);
                setState(1758);
                match(QUOTED_STRING);
                setState(1759);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Shell_scriptContext extends ParserRuleContext {
        public TerminalNode SHELL_SCRIPT() { return getToken(PbxprojParser.SHELL_SCRIPT, 0); }
        public Any_stringContext any_string() {
            return getRuleContext(Any_stringContext.class,0);
        }
        public Shell_scriptContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_shell_script; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterShell_script(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitShell_script(this);
        }
    }

    public final Shell_scriptContext shell_script() throws RecognitionException {
        Shell_scriptContext _localctx = new Shell_scriptContext(_ctx, getState());
        enterRule(_localctx, 338, RULE_shell_script);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1761);
                match(SHELL_SCRIPT);
                setState(1762);
                match(T__2);
                setState(1763);
                any_string();
                setState(1764);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Show_env_vars_in_logContext extends ParserRuleContext {
        public TerminalNode SHOW_ENV_VARS_IN_LOG() { return getToken(PbxprojParser.SHOW_ENV_VARS_IN_LOG, 0); }
        public TerminalNode NUMBER() { return getToken(PbxprojParser.NUMBER, 0); }
        public Show_env_vars_in_logContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_show_env_vars_in_log; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterShow_env_vars_in_log(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitShow_env_vars_in_log(this);
        }
    }

    public final Show_env_vars_in_logContext show_env_vars_in_log() throws RecognitionException {
        Show_env_vars_in_logContext _localctx = new Show_env_vars_in_logContext(_ctx, getState());
        enterRule(_localctx, 340, RULE_show_env_vars_in_log);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1766);
                match(SHOW_ENV_VARS_IN_LOG);
                setState(1767);
                match(T__2);
                setState(1768);
                match(NUMBER);
                setState(1769);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TargetContext extends ParserRuleContext {
        public TerminalNode TARGET() { return getToken(PbxprojParser.TARGET, 0); }
        public TerminalNode REFERENCE() { return getToken(PbxprojParser.REFERENCE, 0); }
        public TargetContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_target; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterTarget(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitTarget(this);
        }
    }

    public final TargetContext target() throws RecognitionException {
        TargetContext _localctx = new TargetContext(_ctx, getState());
        enterRule(_localctx, 342, RULE_target);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1771);
                match(TARGET);
                setState(1772);
                match(T__2);
                setState(1773);
                match(REFERENCE);
                setState(1774);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Target_proxyContext extends ParserRuleContext {
        public TerminalNode TARGET_PROXY() { return getToken(PbxprojParser.TARGET_PROXY, 0); }
        public TerminalNode REFERENCE() { return getToken(PbxprojParser.REFERENCE, 0); }
        public Target_proxyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_target_proxy; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterTarget_proxy(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitTarget_proxy(this);
        }
    }

    public final Target_proxyContext target_proxy() throws RecognitionException {
        Target_proxyContext _localctx = new Target_proxyContext(_ctx, getState());
        enterRule(_localctx, 344, RULE_target_proxy);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1776);
                match(TARGET_PROXY);
                setState(1777);
                match(T__2);
                setState(1778);
                match(REFERENCE);
                setState(1779);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class File_typeContext extends ParserRuleContext {
        public TerminalNode FILE_TYPE() { return getToken(PbxprojParser.FILE_TYPE, 0); }
        public Str_number_variableContext str_number_variable() {
            return getRuleContext(Str_number_variableContext.class,0);
        }
        public File_typeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_file_type; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterFile_type(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitFile_type(this);
        }
    }

    public final File_typeContext file_type() throws RecognitionException {
        File_typeContext _localctx = new File_typeContext(_ctx, getState());
        enterRule(_localctx, 346, RULE_file_type);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1781);
                match(FILE_TYPE);
                setState(1782);
                match(T__2);
                setState(1783);
                str_number_variable();
                setState(1784);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Remote_refContext extends ParserRuleContext {
        public TerminalNode REMOTE_REF() { return getToken(PbxprojParser.REMOTE_REF, 0); }
        public TerminalNode REFERENCE() { return getToken(PbxprojParser.REFERENCE, 0); }
        public Remote_refContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_remote_ref; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterRemote_ref(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitRemote_ref(this);
        }
    }

    public final Remote_refContext remote_ref() throws RecognitionException {
        Remote_refContext _localctx = new Remote_refContext(_ctx, getState());
        enterRule(_localctx, 348, RULE_remote_ref);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1786);
                match(REMOTE_REF);
                setState(1787);
                match(T__2);
                setState(1788);
                match(REFERENCE);
                setState(1789);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Base_configuration_referenceContext extends ParserRuleContext {
        public TerminalNode BASE_CONFIGURATION_REFERENCE() { return getToken(PbxprojParser.BASE_CONFIGURATION_REFERENCE, 0); }
        public TerminalNode REFERENCE() { return getToken(PbxprojParser.REFERENCE, 0); }
        public Base_configuration_referenceContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_base_configuration_reference; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterBase_configuration_reference(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitBase_configuration_reference(this);
        }
    }

    public final Base_configuration_referenceContext base_configuration_reference() throws RecognitionException {
        Base_configuration_referenceContext _localctx = new Base_configuration_referenceContext(_ctx, getState());
        enterRule(_localctx, 350, RULE_base_configuration_reference);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1791);
                match(BASE_CONFIGURATION_REFERENCE);
                setState(1792);
                match(T__2);
                setState(1793);
                match(REFERENCE);
                setState(1794);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Build_settingsContext extends ParserRuleContext {
        public TerminalNode BUILD_SETTINGS() { return getToken(PbxprojParser.BUILD_SETTINGS, 0); }
        public List<Key_valueContext> key_value() {
            return getRuleContexts(Key_valueContext.class);
        }
        public Key_valueContext key_value(int i) {
            return getRuleContext(Key_valueContext.class,i);
        }
        public Build_settingsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_build_settings; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterBuild_settings(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitBuild_settings(this);
        }
    }

    public final Build_settingsContext build_settings() throws RecognitionException {
        Build_settingsContext _localctx = new Build_settingsContext(_ctx, getState());
        enterRule(_localctx, 352, RULE_build_settings);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1796);
                match(BUILD_SETTINGS);
                setState(1797);
                match(T__2);
                setState(1798);
                match(T__0);
                setState(1802);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARCHIVE_VERSION) | (1L << CLASSES) | (1L << DASH) | (1L << DOT) | (1L << ISA) | (1L << NUMBER) | (1L << OBJECT_VERSION) | (1L << OBJECTS) | (1L << ROOT_OBJECT) | (1L << UNDERSCORE) | (1L << PBX_AGGREGATE_TARGET) | (1L << PBX_BUILD_FILE) | (1L << PBX_BUILD_RULE) | (1L << PBX_BUILD_STYLE) | (1L << PBX_CONTAINER_ITEM_PROXY) | (1L << PBX_COPY_FILES_BUILD_PHASE) | (1L << PBX_FILE_REFERENCE) | (1L << PBX_FRAMEWORKS_BUILD_PHASE) | (1L << PBX_NATIVE_TARGET) | (1L << PBX_LEGACY_TARGET) | (1L << PBX_PROJECT) | (1L << PBX_REFERENCE_PROXY) | (1L << PBX_RESOURCES_BUILD_PHASE) | (1L << PBX_SHELL_SCRIPT_BUILD_PHASE) | (1L << PBX_SOURCES_BUILD_PHASE) | (1L << PBX_TARGET_DEPENDENCY) | (1L << PBX_VARIANT_GROUP) | (1L << XC_BUILD_CONFIGURATION) | (1L << XC_CONFIGURATION_LIST) | (1L << XC_REMOTE_SWIFT_PACKAGE_REFERENCE) | (1L << XC_SWIFT_PACKAGE_PRODUCT_DEPENDENCY) | (1L << XC_VERSION_GROUP) | (1L << FILE_REF) | (1L << PRODUCT_REF) | (1L << CONTAINER_PORTAL) | (1L << PROXY_TYPE) | (1L << REMOTE_GLOBAL_ID_STRING) | (1L << REMOTE_INFO) | (1L << FILE_ENCODING) | (1L << COMMENTS) | (1L << EXPLICIT_FILE_TYPE) | (1L << LAST_KNOWN_FILE_TYPE) | (1L << INCLUDE_IN_INDEX) | (1L << INDENT_WIDTH) | (1L << TAB_WIDTH) | (1L << USES_TABS) | (1L << WRAPS_LINES) | (1L << PLATFORM_FILTER) | (1L << PLATFORM_FILTERS) | (1L << CHILDREN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PRODUCT_INSTALL_PATH - 64)) | (1L << (REPOSITORY_URL - 64)) | (1L << (REQUIREMENT - 64)) | (1L << (PACKAGE - 64)) | (1L << (PACKAGE_PRODUCT_DEPENDENCIES - 64)) | (1L << (NAME - 64)) | (1L << (PATH - 64)) | (1L << (SOURCE_TREE - 64)) | (1L << (BUILD_ACTION_MASK - 64)) | (1L << (FILES - 64)) | (1L << (RUN_ONLY_FOR_DEPLOYMENT_POSTPROCESSING - 64)) | (1L << (BUILD_CONFIGURATION_LIST - 64)) | (1L << (BUILD_PHASES - 64)) | (1L << (BUILD_RULES - 64)) | (1L << (BUILD_ARGUMENTS_STRING - 64)) | (1L << (BUILD_TOOL_PATH - 64)) | (1L << (BUILD_WORKING_DIRECTORY - 64)) | (1L << (PASS_BUILD_SETTINGS_IN_ENVIRONMENT - 64)) | (1L << (DEPENDENCIES - 64)) | (1L << (PRODUCT_NAME - 64)) | (1L << (PRODUCT_REFERENCE - 64)) | (1L << (PRODUCT_TYPE - 64)) | (1L << (LINE_ENDING - 64)) | (1L << (XC_LANGUAGE_SPECIFICATION_IDENTIFIER - 64)) | (1L << (PLIST_STRUCTURE_DEFINITION_IDENTIFIER - 64)) | (1L << (REF_TYPE - 64)) | (1L << (COMPILER_SPEC - 64)) | (1L << (FILE_PATTERNS - 64)) | (1L << (INPUT_FILES - 64)) | (1L << (IS_EDITABLE - 64)) | (1L << (OUTPUT_FILES - 64)) | (1L << (RUN_ONCE_PER_ARCH - 64)) | (1L << (SCRIPT - 64)) | (1L << (ATTRIBUTES - 64)) | (1L << (LAST_SWIFT_MIGRATION - 64)) | (1L << (DEFAULT_BUILD_SYSTEM_TYPE_FOR_WORKSPACE - 64)) | (1L << (LAST_SWIFT_UPDATE_CHECK - 64)) | (1L << (BUILD_INDEPENDENT_TARGETS_IN_PARALLEL - 64)) | (1L << (LAST_TESTING_UPGRADE_CHECK - 64)) | (1L << (LAST_UPGRADE_CHECK - 64)) | (1L << (ORGANIZATION_NAME - 64)) | (1L << (TARGET_ATTRIBUTES - 64)) | (1L << (CREATED_ON_TOOLS_VERSION - 64)) | (1L << (TEST_TARGET_ID - 64)) | (1L << (DEVELOPMENT_TEAM - 64)) | (1L << (DEVELOPMENT_TEAM_NAME - 64)) | (1L << (PROVISIONING_STYLE - 64)) | (1L << (COMPATIBILITY_VERSION - 64)) | (1L << (DEVELOPMENT_REGION - 64)) | (1L << (HAS_SCANNED_FOR_ENCODINGS - 64)) | (1L << (KNOWN_REGIONS - 64)) | (1L << (MAIN_GROUP - 64)) | (1L << (PRODUCT_REF_GROUP - 64)) | (1L << (PACKAGE_REFERENCES - 64)) | (1L << (PRODUCT_DIR_PATH - 64)) | (1L << (PROJECT_REFERENCES - 64)) | (1L << (PROJECT_ROOT - 64)) | (1L << (TARGETS - 64)) | (1L << (INPUT_FILE_LIST_PATHS - 64)) | (1L << (INPUT_PATHS - 64)) | (1L << (OUTPUT_FILE_LIST_PATHS - 64)) | (1L << (OUTPUT_PATHS - 64)) | (1L << (SHELL_PATH - 64)) | (1L << (SHELL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (SHELL_SCRIPT - 128)) | (1L << (SHOW_ENV_VARS_IN_LOG - 128)) | (1L << (TARGET - 128)) | (1L << (TARGET_PROXY - 128)) | (1L << (FILE_TYPE - 128)) | (1L << (REMOTE_REF - 128)) | (1L << (BASE_CONFIGURATION_REFERENCE - 128)) | (1L << (BUILD_SETTINGS - 128)) | (1L << (DST_PATH - 128)) | (1L << (DST_SUBFOLDER_SPEC - 128)) | (1L << (PRODUCT_GROUP - 128)) | (1L << (PROJECT_REF - 128)) | (1L << (BUILD_CONFIGURATIONS - 128)) | (1L << (DEFAULT_CONFIGURATION_IS_VISIBLE - 128)) | (1L << (DEFAULT_CONFIGURATION_NAME - 128)) | (1L << (SETTINGS - 128)) | (1L << (SYSTEM_CAPABILITIES - 128)) | (1L << (CURRENT_VERSION - 128)) | (1L << (VERSION_GROUP_TYPE - 128)) | (1L << (CLASSPREFIX - 128)) | (1L << (QUOTED_STRING - 128)) | (1L << (NON_QUOTED_STRING - 128)) | (1L << (VARIABLE - 128)))) != 0)) {
                    {
                        {
                            setState(1799);
                            key_value();
                        }
                    }
                    setState(1804);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(1805);
                match(T__1);
                setState(1806);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Build_stylesContext extends ParserRuleContext {
        public TerminalNode BUILD_STYLES() { return getToken(PbxprojParser.BUILD_STYLES, 0); }
        public Reference_listContext reference_list() {
            return getRuleContext(Reference_listContext.class,0);
        }
        public Build_stylesContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_build_styles; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterBuild_styles(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitBuild_styles(this);
        }
    }

    public final Build_stylesContext build_styles() throws RecognitionException {
        Build_stylesContext _localctx = new Build_stylesContext(_ctx, getState());
        enterRule(_localctx, 354, RULE_build_styles);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1808);
                match(BUILD_STYLES);
                setState(1809);
                match(T__2);
                setState(1810);
                reference_list();
                setState(1811);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Dst_pathContext extends ParserRuleContext {
        public TerminalNode DST_PATH() { return getToken(PbxprojParser.DST_PATH, 0); }
        public Any_stringContext any_string() {
            return getRuleContext(Any_stringContext.class,0);
        }
        public Dst_pathContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_dst_path; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterDst_path(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitDst_path(this);
        }
    }

    public final Dst_pathContext dst_path() throws RecognitionException {
        Dst_pathContext _localctx = new Dst_pathContext(_ctx, getState());
        enterRule(_localctx, 356, RULE_dst_path);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1813);
                match(DST_PATH);
                setState(1814);
                match(T__2);
                setState(1815);
                any_string();
                setState(1816);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Dst_subfolder_specContext extends ParserRuleContext {
        public TerminalNode DST_SUBFOLDER_SPEC() { return getToken(PbxprojParser.DST_SUBFOLDER_SPEC, 0); }
        public TerminalNode NUMBER() { return getToken(PbxprojParser.NUMBER, 0); }
        public Dst_subfolder_specContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_dst_subfolder_spec; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterDst_subfolder_spec(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitDst_subfolder_spec(this);
        }
    }

    public final Dst_subfolder_specContext dst_subfolder_spec() throws RecognitionException {
        Dst_subfolder_specContext _localctx = new Dst_subfolder_specContext(_ctx, getState());
        enterRule(_localctx, 358, RULE_dst_subfolder_spec);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1818);
                match(DST_SUBFOLDER_SPEC);
                setState(1819);
                match(T__2);
                setState(1820);
                match(NUMBER);
                setState(1821);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Project_references_listContext extends ParserRuleContext {
        public List<Project_references_list_elementContext> project_references_list_element() {
            return getRuleContexts(Project_references_list_elementContext.class);
        }
        public Project_references_list_elementContext project_references_list_element(int i) {
            return getRuleContext(Project_references_list_elementContext.class,i);
        }
        public Project_references_listContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_project_references_list; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterProject_references_list(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitProject_references_list(this);
        }
    }

    public final Project_references_listContext project_references_list() throws RecognitionException {
        Project_references_listContext _localctx = new Project_references_listContext(_ctx, getState());
        enterRule(_localctx, 360, RULE_project_references_list);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1826);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==T__0) {
                    {
                        {
                            setState(1823);
                            project_references_list_element();
                        }
                    }
                    setState(1828);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Project_references_list_elementContext extends ParserRuleContext {
        public TerminalNode PRODUCT_GROUP() { return getToken(PbxprojParser.PRODUCT_GROUP, 0); }
        public List<TerminalNode> REFERENCE() { return getTokens(PbxprojParser.REFERENCE); }
        public TerminalNode REFERENCE(int i) {
            return getToken(PbxprojParser.REFERENCE, i);
        }
        public TerminalNode PROJECT_REF() { return getToken(PbxprojParser.PROJECT_REF, 0); }
        public Project_references_list_elementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_project_references_list_element; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterProject_references_list_element(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitProject_references_list_element(this);
        }
    }

    public final Project_references_list_elementContext project_references_list_element() throws RecognitionException {
        Project_references_list_elementContext _localctx = new Project_references_list_elementContext(_ctx, getState());
        enterRule(_localctx, 362, RULE_project_references_list_element);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1829);
                match(T__0);
                setState(1830);
                match(PRODUCT_GROUP);
                setState(1831);
                match(T__2);
                setState(1832);
                match(REFERENCE);
                setState(1833);
                match(T__3);
                setState(1834);
                match(PROJECT_REF);
                setState(1835);
                match(T__2);
                setState(1836);
                match(REFERENCE);
                setState(1837);
                match(T__3);
                setState(1838);
                match(T__1);
                setState(1839);
                match(T__5);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Key_valueContext extends ParserRuleContext {
        public List<Str_number_variableContext> str_number_variable() {
            return getRuleContexts(Str_number_variableContext.class);
        }
        public Str_number_variableContext str_number_variable(int i) {
            return getRuleContext(Str_number_variableContext.class,i);
        }
        public TerminalNode NUMBER() { return getToken(PbxprojParser.NUMBER, 0); }
        public TerminalNode ALPHA_NUMERIC() { return getToken(PbxprojParser.ALPHA_NUMERIC, 0); }
        public Key_valueContext key_value() {
            return getRuleContext(Key_valueContext.class,0);
        }
        public Key_valueContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_key_value; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterKey_value(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitKey_value(this);
        }
    }

    public final Key_valueContext key_value() throws RecognitionException {
        Key_valueContext _localctx = new Key_valueContext(_ctx, getState());
        enterRule(_localctx, 364, RULE_key_value);
        int _la;
        try {
            int _alt;
            setState(1882);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1841);
                    str_number_variable();
                    setState(1842);
                    match(T__2);
                    setState(1843);
                    str_number_variable();
                    setState(1844);
                    match(T__3);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1846);
                    str_number_variable();
                    setState(1847);
                    match(T__2);
                    setState(1848);
                    match(NUMBER);
                    setState(1849);
                    match(T__3);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(1851);
                    str_number_variable();
                    setState(1852);
                    match(T__2);
                    setState(1853);
                    match(ALPHA_NUMERIC);
                    setState(1854);
                    match(T__3);
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(1856);
                    str_number_variable();
                    setState(1857);
                    match(T__2);
                    setState(1858);
                    match(T__0);
                    setState(1859);
                    key_value();
                    setState(1860);
                    match(T__1);
                    setState(1861);
                    match(T__3);
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(1863);
                    str_number_variable();
                    setState(1864);
                    match(T__2);
                    setState(1865);
                    match(T__4);
                    setState(1867);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARCHIVE_VERSION) | (1L << CLASSES) | (1L << DASH) | (1L << DOT) | (1L << ISA) | (1L << NUMBER) | (1L << OBJECT_VERSION) | (1L << OBJECTS) | (1L << ROOT_OBJECT) | (1L << UNDERSCORE) | (1L << PBX_AGGREGATE_TARGET) | (1L << PBX_BUILD_FILE) | (1L << PBX_BUILD_RULE) | (1L << PBX_BUILD_STYLE) | (1L << PBX_CONTAINER_ITEM_PROXY) | (1L << PBX_COPY_FILES_BUILD_PHASE) | (1L << PBX_FILE_REFERENCE) | (1L << PBX_FRAMEWORKS_BUILD_PHASE) | (1L << PBX_NATIVE_TARGET) | (1L << PBX_LEGACY_TARGET) | (1L << PBX_PROJECT) | (1L << PBX_REFERENCE_PROXY) | (1L << PBX_RESOURCES_BUILD_PHASE) | (1L << PBX_SHELL_SCRIPT_BUILD_PHASE) | (1L << PBX_SOURCES_BUILD_PHASE) | (1L << PBX_TARGET_DEPENDENCY) | (1L << PBX_VARIANT_GROUP) | (1L << XC_BUILD_CONFIGURATION) | (1L << XC_CONFIGURATION_LIST) | (1L << XC_REMOTE_SWIFT_PACKAGE_REFERENCE) | (1L << XC_SWIFT_PACKAGE_PRODUCT_DEPENDENCY) | (1L << XC_VERSION_GROUP) | (1L << FILE_REF) | (1L << PRODUCT_REF) | (1L << CONTAINER_PORTAL) | (1L << PROXY_TYPE) | (1L << REMOTE_GLOBAL_ID_STRING) | (1L << REMOTE_INFO) | (1L << FILE_ENCODING) | (1L << COMMENTS) | (1L << EXPLICIT_FILE_TYPE) | (1L << LAST_KNOWN_FILE_TYPE) | (1L << INCLUDE_IN_INDEX) | (1L << INDENT_WIDTH) | (1L << TAB_WIDTH) | (1L << USES_TABS) | (1L << WRAPS_LINES) | (1L << PLATFORM_FILTER) | (1L << PLATFORM_FILTERS) | (1L << CHILDREN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PRODUCT_INSTALL_PATH - 64)) | (1L << (REPOSITORY_URL - 64)) | (1L << (REQUIREMENT - 64)) | (1L << (PACKAGE - 64)) | (1L << (PACKAGE_PRODUCT_DEPENDENCIES - 64)) | (1L << (NAME - 64)) | (1L << (PATH - 64)) | (1L << (SOURCE_TREE - 64)) | (1L << (BUILD_ACTION_MASK - 64)) | (1L << (FILES - 64)) | (1L << (RUN_ONLY_FOR_DEPLOYMENT_POSTPROCESSING - 64)) | (1L << (BUILD_CONFIGURATION_LIST - 64)) | (1L << (BUILD_PHASES - 64)) | (1L << (BUILD_RULES - 64)) | (1L << (BUILD_ARGUMENTS_STRING - 64)) | (1L << (BUILD_TOOL_PATH - 64)) | (1L << (BUILD_WORKING_DIRECTORY - 64)) | (1L << (PASS_BUILD_SETTINGS_IN_ENVIRONMENT - 64)) | (1L << (DEPENDENCIES - 64)) | (1L << (PRODUCT_NAME - 64)) | (1L << (PRODUCT_REFERENCE - 64)) | (1L << (PRODUCT_TYPE - 64)) | (1L << (LINE_ENDING - 64)) | (1L << (XC_LANGUAGE_SPECIFICATION_IDENTIFIER - 64)) | (1L << (PLIST_STRUCTURE_DEFINITION_IDENTIFIER - 64)) | (1L << (REF_TYPE - 64)) | (1L << (COMPILER_SPEC - 64)) | (1L << (FILE_PATTERNS - 64)) | (1L << (INPUT_FILES - 64)) | (1L << (IS_EDITABLE - 64)) | (1L << (OUTPUT_FILES - 64)) | (1L << (RUN_ONCE_PER_ARCH - 64)) | (1L << (SCRIPT - 64)) | (1L << (ATTRIBUTES - 64)) | (1L << (LAST_SWIFT_MIGRATION - 64)) | (1L << (DEFAULT_BUILD_SYSTEM_TYPE_FOR_WORKSPACE - 64)) | (1L << (LAST_SWIFT_UPDATE_CHECK - 64)) | (1L << (BUILD_INDEPENDENT_TARGETS_IN_PARALLEL - 64)) | (1L << (LAST_TESTING_UPGRADE_CHECK - 64)) | (1L << (LAST_UPGRADE_CHECK - 64)) | (1L << (ORGANIZATION_NAME - 64)) | (1L << (TARGET_ATTRIBUTES - 64)) | (1L << (CREATED_ON_TOOLS_VERSION - 64)) | (1L << (TEST_TARGET_ID - 64)) | (1L << (DEVELOPMENT_TEAM - 64)) | (1L << (DEVELOPMENT_TEAM_NAME - 64)) | (1L << (PROVISIONING_STYLE - 64)) | (1L << (COMPATIBILITY_VERSION - 64)) | (1L << (DEVELOPMENT_REGION - 64)) | (1L << (HAS_SCANNED_FOR_ENCODINGS - 64)) | (1L << (KNOWN_REGIONS - 64)) | (1L << (MAIN_GROUP - 64)) | (1L << (PRODUCT_REF_GROUP - 64)) | (1L << (PACKAGE_REFERENCES - 64)) | (1L << (PRODUCT_DIR_PATH - 64)) | (1L << (PROJECT_REFERENCES - 64)) | (1L << (PROJECT_ROOT - 64)) | (1L << (TARGETS - 64)) | (1L << (INPUT_FILE_LIST_PATHS - 64)) | (1L << (INPUT_PATHS - 64)) | (1L << (OUTPUT_FILE_LIST_PATHS - 64)) | (1L << (OUTPUT_PATHS - 64)) | (1L << (SHELL_PATH - 64)) | (1L << (SHELL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (SHELL_SCRIPT - 128)) | (1L << (SHOW_ENV_VARS_IN_LOG - 128)) | (1L << (TARGET - 128)) | (1L << (TARGET_PROXY - 128)) | (1L << (FILE_TYPE - 128)) | (1L << (REMOTE_REF - 128)) | (1L << (BASE_CONFIGURATION_REFERENCE - 128)) | (1L << (BUILD_SETTINGS - 128)) | (1L << (DST_PATH - 128)) | (1L << (DST_SUBFOLDER_SPEC - 128)) | (1L << (PRODUCT_GROUP - 128)) | (1L << (PROJECT_REF - 128)) | (1L << (BUILD_CONFIGURATIONS - 128)) | (1L << (DEFAULT_CONFIGURATION_IS_VISIBLE - 128)) | (1L << (DEFAULT_CONFIGURATION_NAME - 128)) | (1L << (SETTINGS - 128)) | (1L << (SYSTEM_CAPABILITIES - 128)) | (1L << (CURRENT_VERSION - 128)) | (1L << (VERSION_GROUP_TYPE - 128)) | (1L << (CLASSPREFIX - 128)) | (1L << (QUOTED_STRING - 128)) | (1L << (NON_QUOTED_STRING - 128)) | (1L << (VARIABLE - 128)))) != 0)) {
                        {
                            setState(1866);
                            str_number_variable();
                        }
                    }

                    setState(1873);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,149,_ctx);
                    while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                        if ( _alt==1 ) {
                            {
                                {
                                    setState(1869);
                                    match(T__5);
                                    setState(1870);
                                    str_number_variable();
                                }
                            }
                        }
                        setState(1875);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input,149,_ctx);
                    }
                    setState(1877);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la==T__5) {
                        {
                            setState(1876);
                            match(T__5);
                        }
                    }

                    setState(1879);
                    match(T__6);
                    setState(1880);
                    match(T__3);
                }
                break;
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Build_configurationsContext extends ParserRuleContext {
        public TerminalNode BUILD_CONFIGURATIONS() { return getToken(PbxprojParser.BUILD_CONFIGURATIONS, 0); }
        public Reference_listContext reference_list() {
            return getRuleContext(Reference_listContext.class,0);
        }
        public Build_configurationsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_build_configurations; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterBuild_configurations(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitBuild_configurations(this);
        }
    }

    public final Build_configurationsContext build_configurations() throws RecognitionException {
        Build_configurationsContext _localctx = new Build_configurationsContext(_ctx, getState());
        enterRule(_localctx, 366, RULE_build_configurations);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1884);
                match(BUILD_CONFIGURATIONS);
                setState(1885);
                match(T__2);
                setState(1886);
                reference_list();
                setState(1887);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Default_configuration_is_visibleContext extends ParserRuleContext {
        public TerminalNode DEFAULT_CONFIGURATION_IS_VISIBLE() { return getToken(PbxprojParser.DEFAULT_CONFIGURATION_IS_VISIBLE, 0); }
        public TerminalNode NUMBER() { return getToken(PbxprojParser.NUMBER, 0); }
        public Default_configuration_is_visibleContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_default_configuration_is_visible; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterDefault_configuration_is_visible(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitDefault_configuration_is_visible(this);
        }
    }

    public final Default_configuration_is_visibleContext default_configuration_is_visible() throws RecognitionException {
        Default_configuration_is_visibleContext _localctx = new Default_configuration_is_visibleContext(_ctx, getState());
        enterRule(_localctx, 368, RULE_default_configuration_is_visible);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1889);
                match(DEFAULT_CONFIGURATION_IS_VISIBLE);
                setState(1890);
                match(T__2);
                setState(1891);
                match(NUMBER);
                setState(1892);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Default_configuration_nameContext extends ParserRuleContext {
        public TerminalNode DEFAULT_CONFIGURATION_NAME() { return getToken(PbxprojParser.DEFAULT_CONFIGURATION_NAME, 0); }
        public Any_stringContext any_string() {
            return getRuleContext(Any_stringContext.class,0);
        }
        public Default_configuration_nameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_default_configuration_name; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterDefault_configuration_name(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitDefault_configuration_name(this);
        }
    }

    public final Default_configuration_nameContext default_configuration_name() throws RecognitionException {
        Default_configuration_nameContext _localctx = new Default_configuration_nameContext(_ctx, getState());
        enterRule(_localctx, 370, RULE_default_configuration_name);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1894);
                match(DEFAULT_CONFIGURATION_NAME);
                setState(1895);
                match(T__2);
                setState(1896);
                any_string();
                setState(1897);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class SettingsContext extends ParserRuleContext {
        public TerminalNode SETTINGS() { return getToken(PbxprojParser.SETTINGS, 0); }
        public List<Key_valueContext> key_value() {
            return getRuleContexts(Key_valueContext.class);
        }
        public Key_valueContext key_value(int i) {
            return getRuleContext(Key_valueContext.class,i);
        }
        public SettingsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_settings; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterSettings(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitSettings(this);
        }
    }

    public final SettingsContext settings() throws RecognitionException {
        SettingsContext _localctx = new SettingsContext(_ctx, getState());
        enterRule(_localctx, 372, RULE_settings);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1899);
                match(SETTINGS);
                setState(1900);
                match(T__2);
                setState(1901);
                match(T__0);
                setState(1905);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARCHIVE_VERSION) | (1L << CLASSES) | (1L << DASH) | (1L << DOT) | (1L << ISA) | (1L << NUMBER) | (1L << OBJECT_VERSION) | (1L << OBJECTS) | (1L << ROOT_OBJECT) | (1L << UNDERSCORE) | (1L << PBX_AGGREGATE_TARGET) | (1L << PBX_BUILD_FILE) | (1L << PBX_BUILD_RULE) | (1L << PBX_BUILD_STYLE) | (1L << PBX_CONTAINER_ITEM_PROXY) | (1L << PBX_COPY_FILES_BUILD_PHASE) | (1L << PBX_FILE_REFERENCE) | (1L << PBX_FRAMEWORKS_BUILD_PHASE) | (1L << PBX_NATIVE_TARGET) | (1L << PBX_LEGACY_TARGET) | (1L << PBX_PROJECT) | (1L << PBX_REFERENCE_PROXY) | (1L << PBX_RESOURCES_BUILD_PHASE) | (1L << PBX_SHELL_SCRIPT_BUILD_PHASE) | (1L << PBX_SOURCES_BUILD_PHASE) | (1L << PBX_TARGET_DEPENDENCY) | (1L << PBX_VARIANT_GROUP) | (1L << XC_BUILD_CONFIGURATION) | (1L << XC_CONFIGURATION_LIST) | (1L << XC_REMOTE_SWIFT_PACKAGE_REFERENCE) | (1L << XC_SWIFT_PACKAGE_PRODUCT_DEPENDENCY) | (1L << XC_VERSION_GROUP) | (1L << FILE_REF) | (1L << PRODUCT_REF) | (1L << CONTAINER_PORTAL) | (1L << PROXY_TYPE) | (1L << REMOTE_GLOBAL_ID_STRING) | (1L << REMOTE_INFO) | (1L << FILE_ENCODING) | (1L << COMMENTS) | (1L << EXPLICIT_FILE_TYPE) | (1L << LAST_KNOWN_FILE_TYPE) | (1L << INCLUDE_IN_INDEX) | (1L << INDENT_WIDTH) | (1L << TAB_WIDTH) | (1L << USES_TABS) | (1L << WRAPS_LINES) | (1L << PLATFORM_FILTER) | (1L << PLATFORM_FILTERS) | (1L << CHILDREN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PRODUCT_INSTALL_PATH - 64)) | (1L << (REPOSITORY_URL - 64)) | (1L << (REQUIREMENT - 64)) | (1L << (PACKAGE - 64)) | (1L << (PACKAGE_PRODUCT_DEPENDENCIES - 64)) | (1L << (NAME - 64)) | (1L << (PATH - 64)) | (1L << (SOURCE_TREE - 64)) | (1L << (BUILD_ACTION_MASK - 64)) | (1L << (FILES - 64)) | (1L << (RUN_ONLY_FOR_DEPLOYMENT_POSTPROCESSING - 64)) | (1L << (BUILD_CONFIGURATION_LIST - 64)) | (1L << (BUILD_PHASES - 64)) | (1L << (BUILD_RULES - 64)) | (1L << (BUILD_ARGUMENTS_STRING - 64)) | (1L << (BUILD_TOOL_PATH - 64)) | (1L << (BUILD_WORKING_DIRECTORY - 64)) | (1L << (PASS_BUILD_SETTINGS_IN_ENVIRONMENT - 64)) | (1L << (DEPENDENCIES - 64)) | (1L << (PRODUCT_NAME - 64)) | (1L << (PRODUCT_REFERENCE - 64)) | (1L << (PRODUCT_TYPE - 64)) | (1L << (LINE_ENDING - 64)) | (1L << (XC_LANGUAGE_SPECIFICATION_IDENTIFIER - 64)) | (1L << (PLIST_STRUCTURE_DEFINITION_IDENTIFIER - 64)) | (1L << (REF_TYPE - 64)) | (1L << (COMPILER_SPEC - 64)) | (1L << (FILE_PATTERNS - 64)) | (1L << (INPUT_FILES - 64)) | (1L << (IS_EDITABLE - 64)) | (1L << (OUTPUT_FILES - 64)) | (1L << (RUN_ONCE_PER_ARCH - 64)) | (1L << (SCRIPT - 64)) | (1L << (ATTRIBUTES - 64)) | (1L << (LAST_SWIFT_MIGRATION - 64)) | (1L << (DEFAULT_BUILD_SYSTEM_TYPE_FOR_WORKSPACE - 64)) | (1L << (LAST_SWIFT_UPDATE_CHECK - 64)) | (1L << (BUILD_INDEPENDENT_TARGETS_IN_PARALLEL - 64)) | (1L << (LAST_TESTING_UPGRADE_CHECK - 64)) | (1L << (LAST_UPGRADE_CHECK - 64)) | (1L << (ORGANIZATION_NAME - 64)) | (1L << (TARGET_ATTRIBUTES - 64)) | (1L << (CREATED_ON_TOOLS_VERSION - 64)) | (1L << (TEST_TARGET_ID - 64)) | (1L << (DEVELOPMENT_TEAM - 64)) | (1L << (DEVELOPMENT_TEAM_NAME - 64)) | (1L << (PROVISIONING_STYLE - 64)) | (1L << (COMPATIBILITY_VERSION - 64)) | (1L << (DEVELOPMENT_REGION - 64)) | (1L << (HAS_SCANNED_FOR_ENCODINGS - 64)) | (1L << (KNOWN_REGIONS - 64)) | (1L << (MAIN_GROUP - 64)) | (1L << (PRODUCT_REF_GROUP - 64)) | (1L << (PACKAGE_REFERENCES - 64)) | (1L << (PRODUCT_DIR_PATH - 64)) | (1L << (PROJECT_REFERENCES - 64)) | (1L << (PROJECT_ROOT - 64)) | (1L << (TARGETS - 64)) | (1L << (INPUT_FILE_LIST_PATHS - 64)) | (1L << (INPUT_PATHS - 64)) | (1L << (OUTPUT_FILE_LIST_PATHS - 64)) | (1L << (OUTPUT_PATHS - 64)) | (1L << (SHELL_PATH - 64)) | (1L << (SHELL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (SHELL_SCRIPT - 128)) | (1L << (SHOW_ENV_VARS_IN_LOG - 128)) | (1L << (TARGET - 128)) | (1L << (TARGET_PROXY - 128)) | (1L << (FILE_TYPE - 128)) | (1L << (REMOTE_REF - 128)) | (1L << (BASE_CONFIGURATION_REFERENCE - 128)) | (1L << (BUILD_SETTINGS - 128)) | (1L << (DST_PATH - 128)) | (1L << (DST_SUBFOLDER_SPEC - 128)) | (1L << (PRODUCT_GROUP - 128)) | (1L << (PROJECT_REF - 128)) | (1L << (BUILD_CONFIGURATIONS - 128)) | (1L << (DEFAULT_CONFIGURATION_IS_VISIBLE - 128)) | (1L << (DEFAULT_CONFIGURATION_NAME - 128)) | (1L << (SETTINGS - 128)) | (1L << (SYSTEM_CAPABILITIES - 128)) | (1L << (CURRENT_VERSION - 128)) | (1L << (VERSION_GROUP_TYPE - 128)) | (1L << (CLASSPREFIX - 128)) | (1L << (QUOTED_STRING - 128)) | (1L << (NON_QUOTED_STRING - 128)) | (1L << (VARIABLE - 128)))) != 0)) {
                    {
                        {
                            setState(1902);
                            key_value();
                        }
                    }
                    setState(1907);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(1908);
                match(T__1);
                setState(1909);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class System_capabilitiesContext extends ParserRuleContext {
        public TerminalNode SYSTEM_CAPABILITIES() { return getToken(PbxprojParser.SYSTEM_CAPABILITIES, 0); }
        public List<Key_valueContext> key_value() {
            return getRuleContexts(Key_valueContext.class);
        }
        public Key_valueContext key_value(int i) {
            return getRuleContext(Key_valueContext.class,i);
        }
        public System_capabilitiesContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_system_capabilities; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterSystem_capabilities(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitSystem_capabilities(this);
        }
    }

    public final System_capabilitiesContext system_capabilities() throws RecognitionException {
        System_capabilitiesContext _localctx = new System_capabilitiesContext(_ctx, getState());
        enterRule(_localctx, 374, RULE_system_capabilities);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1911);
                match(SYSTEM_CAPABILITIES);
                setState(1912);
                match(T__2);
                setState(1913);
                match(T__0);
                setState(1917);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARCHIVE_VERSION) | (1L << CLASSES) | (1L << DASH) | (1L << DOT) | (1L << ISA) | (1L << NUMBER) | (1L << OBJECT_VERSION) | (1L << OBJECTS) | (1L << ROOT_OBJECT) | (1L << UNDERSCORE) | (1L << PBX_AGGREGATE_TARGET) | (1L << PBX_BUILD_FILE) | (1L << PBX_BUILD_RULE) | (1L << PBX_BUILD_STYLE) | (1L << PBX_CONTAINER_ITEM_PROXY) | (1L << PBX_COPY_FILES_BUILD_PHASE) | (1L << PBX_FILE_REFERENCE) | (1L << PBX_FRAMEWORKS_BUILD_PHASE) | (1L << PBX_NATIVE_TARGET) | (1L << PBX_LEGACY_TARGET) | (1L << PBX_PROJECT) | (1L << PBX_REFERENCE_PROXY) | (1L << PBX_RESOURCES_BUILD_PHASE) | (1L << PBX_SHELL_SCRIPT_BUILD_PHASE) | (1L << PBX_SOURCES_BUILD_PHASE) | (1L << PBX_TARGET_DEPENDENCY) | (1L << PBX_VARIANT_GROUP) | (1L << XC_BUILD_CONFIGURATION) | (1L << XC_CONFIGURATION_LIST) | (1L << XC_REMOTE_SWIFT_PACKAGE_REFERENCE) | (1L << XC_SWIFT_PACKAGE_PRODUCT_DEPENDENCY) | (1L << XC_VERSION_GROUP) | (1L << FILE_REF) | (1L << PRODUCT_REF) | (1L << CONTAINER_PORTAL) | (1L << PROXY_TYPE) | (1L << REMOTE_GLOBAL_ID_STRING) | (1L << REMOTE_INFO) | (1L << FILE_ENCODING) | (1L << COMMENTS) | (1L << EXPLICIT_FILE_TYPE) | (1L << LAST_KNOWN_FILE_TYPE) | (1L << INCLUDE_IN_INDEX) | (1L << INDENT_WIDTH) | (1L << TAB_WIDTH) | (1L << USES_TABS) | (1L << WRAPS_LINES) | (1L << PLATFORM_FILTER) | (1L << PLATFORM_FILTERS) | (1L << CHILDREN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PRODUCT_INSTALL_PATH - 64)) | (1L << (REPOSITORY_URL - 64)) | (1L << (REQUIREMENT - 64)) | (1L << (PACKAGE - 64)) | (1L << (PACKAGE_PRODUCT_DEPENDENCIES - 64)) | (1L << (NAME - 64)) | (1L << (PATH - 64)) | (1L << (SOURCE_TREE - 64)) | (1L << (BUILD_ACTION_MASK - 64)) | (1L << (FILES - 64)) | (1L << (RUN_ONLY_FOR_DEPLOYMENT_POSTPROCESSING - 64)) | (1L << (BUILD_CONFIGURATION_LIST - 64)) | (1L << (BUILD_PHASES - 64)) | (1L << (BUILD_RULES - 64)) | (1L << (BUILD_ARGUMENTS_STRING - 64)) | (1L << (BUILD_TOOL_PATH - 64)) | (1L << (BUILD_WORKING_DIRECTORY - 64)) | (1L << (PASS_BUILD_SETTINGS_IN_ENVIRONMENT - 64)) | (1L << (DEPENDENCIES - 64)) | (1L << (PRODUCT_NAME - 64)) | (1L << (PRODUCT_REFERENCE - 64)) | (1L << (PRODUCT_TYPE - 64)) | (1L << (LINE_ENDING - 64)) | (1L << (XC_LANGUAGE_SPECIFICATION_IDENTIFIER - 64)) | (1L << (PLIST_STRUCTURE_DEFINITION_IDENTIFIER - 64)) | (1L << (REF_TYPE - 64)) | (1L << (COMPILER_SPEC - 64)) | (1L << (FILE_PATTERNS - 64)) | (1L << (INPUT_FILES - 64)) | (1L << (IS_EDITABLE - 64)) | (1L << (OUTPUT_FILES - 64)) | (1L << (RUN_ONCE_PER_ARCH - 64)) | (1L << (SCRIPT - 64)) | (1L << (ATTRIBUTES - 64)) | (1L << (LAST_SWIFT_MIGRATION - 64)) | (1L << (DEFAULT_BUILD_SYSTEM_TYPE_FOR_WORKSPACE - 64)) | (1L << (LAST_SWIFT_UPDATE_CHECK - 64)) | (1L << (BUILD_INDEPENDENT_TARGETS_IN_PARALLEL - 64)) | (1L << (LAST_TESTING_UPGRADE_CHECK - 64)) | (1L << (LAST_UPGRADE_CHECK - 64)) | (1L << (ORGANIZATION_NAME - 64)) | (1L << (TARGET_ATTRIBUTES - 64)) | (1L << (CREATED_ON_TOOLS_VERSION - 64)) | (1L << (TEST_TARGET_ID - 64)) | (1L << (DEVELOPMENT_TEAM - 64)) | (1L << (DEVELOPMENT_TEAM_NAME - 64)) | (1L << (PROVISIONING_STYLE - 64)) | (1L << (COMPATIBILITY_VERSION - 64)) | (1L << (DEVELOPMENT_REGION - 64)) | (1L << (HAS_SCANNED_FOR_ENCODINGS - 64)) | (1L << (KNOWN_REGIONS - 64)) | (1L << (MAIN_GROUP - 64)) | (1L << (PRODUCT_REF_GROUP - 64)) | (1L << (PACKAGE_REFERENCES - 64)) | (1L << (PRODUCT_DIR_PATH - 64)) | (1L << (PROJECT_REFERENCES - 64)) | (1L << (PROJECT_ROOT - 64)) | (1L << (TARGETS - 64)) | (1L << (INPUT_FILE_LIST_PATHS - 64)) | (1L << (INPUT_PATHS - 64)) | (1L << (OUTPUT_FILE_LIST_PATHS - 64)) | (1L << (OUTPUT_PATHS - 64)) | (1L << (SHELL_PATH - 64)) | (1L << (SHELL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (SHELL_SCRIPT - 128)) | (1L << (SHOW_ENV_VARS_IN_LOG - 128)) | (1L << (TARGET - 128)) | (1L << (TARGET_PROXY - 128)) | (1L << (FILE_TYPE - 128)) | (1L << (REMOTE_REF - 128)) | (1L << (BASE_CONFIGURATION_REFERENCE - 128)) | (1L << (BUILD_SETTINGS - 128)) | (1L << (DST_PATH - 128)) | (1L << (DST_SUBFOLDER_SPEC - 128)) | (1L << (PRODUCT_GROUP - 128)) | (1L << (PROJECT_REF - 128)) | (1L << (BUILD_CONFIGURATIONS - 128)) | (1L << (DEFAULT_CONFIGURATION_IS_VISIBLE - 128)) | (1L << (DEFAULT_CONFIGURATION_NAME - 128)) | (1L << (SETTINGS - 128)) | (1L << (SYSTEM_CAPABILITIES - 128)) | (1L << (CURRENT_VERSION - 128)) | (1L << (VERSION_GROUP_TYPE - 128)) | (1L << (CLASSPREFIX - 128)) | (1L << (QUOTED_STRING - 128)) | (1L << (NON_QUOTED_STRING - 128)) | (1L << (VARIABLE - 128)))) != 0)) {
                    {
                        {
                            setState(1914);
                            key_value();
                        }
                    }
                    setState(1919);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(1920);
                match(T__1);
                setState(1921);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Current_versionContext extends ParserRuleContext {
        public TerminalNode CURRENT_VERSION() { return getToken(PbxprojParser.CURRENT_VERSION, 0); }
        public TerminalNode REFERENCE() { return getToken(PbxprojParser.REFERENCE, 0); }
        public Current_versionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_current_version; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterCurrent_version(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitCurrent_version(this);
        }
    }

    public final Current_versionContext current_version() throws RecognitionException {
        Current_versionContext _localctx = new Current_versionContext(_ctx, getState());
        enterRule(_localctx, 376, RULE_current_version);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1923);
                match(CURRENT_VERSION);
                setState(1924);
                match(T__2);
                setState(1925);
                match(REFERENCE);
                setState(1926);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Version_group_typeContext extends ParserRuleContext {
        public TerminalNode VERSION_GROUP_TYPE() { return getToken(PbxprojParser.VERSION_GROUP_TYPE, 0); }
        public TerminalNode NON_QUOTED_STRING() { return getToken(PbxprojParser.NON_QUOTED_STRING, 0); }
        public Version_group_typeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_version_group_type; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterVersion_group_type(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitVersion_group_type(this);
        }
    }

    public final Version_group_typeContext version_group_type() throws RecognitionException {
        Version_group_typeContext _localctx = new Version_group_typeContext(_ctx, getState());
        enterRule(_localctx, 378, RULE_version_group_type);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1928);
                match(VERSION_GROUP_TYPE);
                setState(1929);
                match(T__2);
                setState(1930);
                match(NON_QUOTED_STRING);
                setState(1931);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Class_prefixContext extends ParserRuleContext {
        public TerminalNode CLASSPREFIX() { return getToken(PbxprojParser.CLASSPREFIX, 0); }
        public Str_number_variableContext str_number_variable() {
            return getRuleContext(Str_number_variableContext.class,0);
        }
        public Class_prefixContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_class_prefix; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterClass_prefix(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitClass_prefix(this);
        }
    }

    public final Class_prefixContext class_prefix() throws RecognitionException {
        Class_prefixContext _localctx = new Class_prefixContext(_ctx, getState());
        enterRule(_localctx, 380, RULE_class_prefix);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1933);
                match(CLASSPREFIX);
                setState(1934);
                match(T__2);
                setState(1935);
                str_number_variable();
                setState(1936);
                match(T__3);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Any_stringContext extends ParserRuleContext {
        public TerminalNode NON_QUOTED_STRING() { return getToken(PbxprojParser.NON_QUOTED_STRING, 0); }
        public TerminalNode QUOTED_STRING() { return getToken(PbxprojParser.QUOTED_STRING, 0); }
        public TerminalNode UNDERSCORE() { return getToken(PbxprojParser.UNDERSCORE, 0); }
        public TerminalNode DASH() { return getToken(PbxprojParser.DASH, 0); }
        public TerminalNode DOT() { return getToken(PbxprojParser.DOT, 0); }
        public Any_tokenContext any_token() {
            return getRuleContext(Any_tokenContext.class,0);
        }
        public Any_stringContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_any_string; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterAny_string(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitAny_string(this);
        }
    }

    public final Any_stringContext any_string() throws RecognitionException {
        Any_stringContext _localctx = new Any_stringContext(_ctx, getState());
        enterRule(_localctx, 382, RULE_any_string);
        try {
            setState(1944);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case NON_QUOTED_STRING:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1938);
                    match(NON_QUOTED_STRING);
                }
                break;
                case QUOTED_STRING:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1939);
                    match(QUOTED_STRING);
                }
                break;
                case UNDERSCORE:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(1940);
                    match(UNDERSCORE);
                }
                break;
                case DASH:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(1941);
                    match(DASH);
                }
                break;
                case DOT:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(1942);
                    match(DOT);
                }
                break;
                case ARCHIVE_VERSION:
                case CLASSES:
                case ISA:
                case OBJECT_VERSION:
                case OBJECTS:
                case ROOT_OBJECT:
                case PBX_AGGREGATE_TARGET:
                case PBX_BUILD_FILE:
                case PBX_BUILD_RULE:
                case PBX_BUILD_STYLE:
                case PBX_CONTAINER_ITEM_PROXY:
                case PBX_COPY_FILES_BUILD_PHASE:
                case PBX_FILE_REFERENCE:
                case PBX_FRAMEWORKS_BUILD_PHASE:
                case PBX_NATIVE_TARGET:
                case PBX_LEGACY_TARGET:
                case PBX_PROJECT:
                case PBX_REFERENCE_PROXY:
                case PBX_RESOURCES_BUILD_PHASE:
                case PBX_SHELL_SCRIPT_BUILD_PHASE:
                case PBX_SOURCES_BUILD_PHASE:
                case PBX_TARGET_DEPENDENCY:
                case PBX_VARIANT_GROUP:
                case XC_BUILD_CONFIGURATION:
                case XC_CONFIGURATION_LIST:
                case XC_REMOTE_SWIFT_PACKAGE_REFERENCE:
                case XC_SWIFT_PACKAGE_PRODUCT_DEPENDENCY:
                case XC_VERSION_GROUP:
                case FILE_REF:
                case PRODUCT_REF:
                case CONTAINER_PORTAL:
                case PROXY_TYPE:
                case REMOTE_GLOBAL_ID_STRING:
                case REMOTE_INFO:
                case FILE_ENCODING:
                case COMMENTS:
                case EXPLICIT_FILE_TYPE:
                case LAST_KNOWN_FILE_TYPE:
                case INCLUDE_IN_INDEX:
                case INDENT_WIDTH:
                case TAB_WIDTH:
                case USES_TABS:
                case WRAPS_LINES:
                case PLATFORM_FILTER:
                case PLATFORM_FILTERS:
                case CHILDREN:
                case PRODUCT_INSTALL_PATH:
                case REPOSITORY_URL:
                case REQUIREMENT:
                case PACKAGE:
                case PACKAGE_PRODUCT_DEPENDENCIES:
                case NAME:
                case PATH:
                case SOURCE_TREE:
                case BUILD_ACTION_MASK:
                case FILES:
                case RUN_ONLY_FOR_DEPLOYMENT_POSTPROCESSING:
                case BUILD_CONFIGURATION_LIST:
                case BUILD_PHASES:
                case BUILD_RULES:
                case BUILD_ARGUMENTS_STRING:
                case BUILD_TOOL_PATH:
                case BUILD_WORKING_DIRECTORY:
                case PASS_BUILD_SETTINGS_IN_ENVIRONMENT:
                case DEPENDENCIES:
                case PRODUCT_NAME:
                case PRODUCT_REFERENCE:
                case PRODUCT_TYPE:
                case LINE_ENDING:
                case XC_LANGUAGE_SPECIFICATION_IDENTIFIER:
                case PLIST_STRUCTURE_DEFINITION_IDENTIFIER:
                case REF_TYPE:
                case COMPILER_SPEC:
                case FILE_PATTERNS:
                case INPUT_FILES:
                case IS_EDITABLE:
                case OUTPUT_FILES:
                case RUN_ONCE_PER_ARCH:
                case SCRIPT:
                case ATTRIBUTES:
                case LAST_SWIFT_MIGRATION:
                case DEFAULT_BUILD_SYSTEM_TYPE_FOR_WORKSPACE:
                case LAST_SWIFT_UPDATE_CHECK:
                case BUILD_INDEPENDENT_TARGETS_IN_PARALLEL:
                case LAST_TESTING_UPGRADE_CHECK:
                case LAST_UPGRADE_CHECK:
                case ORGANIZATION_NAME:
                case TARGET_ATTRIBUTES:
                case CREATED_ON_TOOLS_VERSION:
                case TEST_TARGET_ID:
                case DEVELOPMENT_TEAM:
                case DEVELOPMENT_TEAM_NAME:
                case PROVISIONING_STYLE:
                case COMPATIBILITY_VERSION:
                case DEVELOPMENT_REGION:
                case HAS_SCANNED_FOR_ENCODINGS:
                case KNOWN_REGIONS:
                case MAIN_GROUP:
                case PRODUCT_REF_GROUP:
                case PACKAGE_REFERENCES:
                case PRODUCT_DIR_PATH:
                case PROJECT_REFERENCES:
                case PROJECT_ROOT:
                case TARGETS:
                case INPUT_FILE_LIST_PATHS:
                case INPUT_PATHS:
                case OUTPUT_FILE_LIST_PATHS:
                case OUTPUT_PATHS:
                case SHELL_PATH:
                case SHELL:
                case SHELL_SCRIPT:
                case SHOW_ENV_VARS_IN_LOG:
                case TARGET:
                case TARGET_PROXY:
                case FILE_TYPE:
                case REMOTE_REF:
                case BASE_CONFIGURATION_REFERENCE:
                case BUILD_SETTINGS:
                case DST_PATH:
                case DST_SUBFOLDER_SPEC:
                case PRODUCT_GROUP:
                case PROJECT_REF:
                case BUILD_CONFIGURATIONS:
                case DEFAULT_CONFIGURATION_IS_VISIBLE:
                case DEFAULT_CONFIGURATION_NAME:
                case SETTINGS:
                case SYSTEM_CAPABILITIES:
                case CURRENT_VERSION:
                case VERSION_GROUP_TYPE:
                case CLASSPREFIX:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(1943);
                    any_token();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Str_number_variableContext extends ParserRuleContext {
        public Any_stringContext any_string() {
            return getRuleContext(Any_stringContext.class,0);
        }
        public TerminalNode NUMBER() { return getToken(PbxprojParser.NUMBER, 0); }
        public TerminalNode VARIABLE() { return getToken(PbxprojParser.VARIABLE, 0); }
        public Str_number_variableContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_str_number_variable; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterStr_number_variable(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitStr_number_variable(this);
        }
    }

    public final Str_number_variableContext str_number_variable() throws RecognitionException {
        Str_number_variableContext _localctx = new Str_number_variableContext(_ctx, getState());
        enterRule(_localctx, 384, RULE_str_number_variable);
        try {
            setState(1949);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case ARCHIVE_VERSION:
                case CLASSES:
                case DASH:
                case DOT:
                case ISA:
                case OBJECT_VERSION:
                case OBJECTS:
                case ROOT_OBJECT:
                case UNDERSCORE:
                case PBX_AGGREGATE_TARGET:
                case PBX_BUILD_FILE:
                case PBX_BUILD_RULE:
                case PBX_BUILD_STYLE:
                case PBX_CONTAINER_ITEM_PROXY:
                case PBX_COPY_FILES_BUILD_PHASE:
                case PBX_FILE_REFERENCE:
                case PBX_FRAMEWORKS_BUILD_PHASE:
                case PBX_NATIVE_TARGET:
                case PBX_LEGACY_TARGET:
                case PBX_PROJECT:
                case PBX_REFERENCE_PROXY:
                case PBX_RESOURCES_BUILD_PHASE:
                case PBX_SHELL_SCRIPT_BUILD_PHASE:
                case PBX_SOURCES_BUILD_PHASE:
                case PBX_TARGET_DEPENDENCY:
                case PBX_VARIANT_GROUP:
                case XC_BUILD_CONFIGURATION:
                case XC_CONFIGURATION_LIST:
                case XC_REMOTE_SWIFT_PACKAGE_REFERENCE:
                case XC_SWIFT_PACKAGE_PRODUCT_DEPENDENCY:
                case XC_VERSION_GROUP:
                case FILE_REF:
                case PRODUCT_REF:
                case CONTAINER_PORTAL:
                case PROXY_TYPE:
                case REMOTE_GLOBAL_ID_STRING:
                case REMOTE_INFO:
                case FILE_ENCODING:
                case COMMENTS:
                case EXPLICIT_FILE_TYPE:
                case LAST_KNOWN_FILE_TYPE:
                case INCLUDE_IN_INDEX:
                case INDENT_WIDTH:
                case TAB_WIDTH:
                case USES_TABS:
                case WRAPS_LINES:
                case PLATFORM_FILTER:
                case PLATFORM_FILTERS:
                case CHILDREN:
                case PRODUCT_INSTALL_PATH:
                case REPOSITORY_URL:
                case REQUIREMENT:
                case PACKAGE:
                case PACKAGE_PRODUCT_DEPENDENCIES:
                case NAME:
                case PATH:
                case SOURCE_TREE:
                case BUILD_ACTION_MASK:
                case FILES:
                case RUN_ONLY_FOR_DEPLOYMENT_POSTPROCESSING:
                case BUILD_CONFIGURATION_LIST:
                case BUILD_PHASES:
                case BUILD_RULES:
                case BUILD_ARGUMENTS_STRING:
                case BUILD_TOOL_PATH:
                case BUILD_WORKING_DIRECTORY:
                case PASS_BUILD_SETTINGS_IN_ENVIRONMENT:
                case DEPENDENCIES:
                case PRODUCT_NAME:
                case PRODUCT_REFERENCE:
                case PRODUCT_TYPE:
                case LINE_ENDING:
                case XC_LANGUAGE_SPECIFICATION_IDENTIFIER:
                case PLIST_STRUCTURE_DEFINITION_IDENTIFIER:
                case REF_TYPE:
                case COMPILER_SPEC:
                case FILE_PATTERNS:
                case INPUT_FILES:
                case IS_EDITABLE:
                case OUTPUT_FILES:
                case RUN_ONCE_PER_ARCH:
                case SCRIPT:
                case ATTRIBUTES:
                case LAST_SWIFT_MIGRATION:
                case DEFAULT_BUILD_SYSTEM_TYPE_FOR_WORKSPACE:
                case LAST_SWIFT_UPDATE_CHECK:
                case BUILD_INDEPENDENT_TARGETS_IN_PARALLEL:
                case LAST_TESTING_UPGRADE_CHECK:
                case LAST_UPGRADE_CHECK:
                case ORGANIZATION_NAME:
                case TARGET_ATTRIBUTES:
                case CREATED_ON_TOOLS_VERSION:
                case TEST_TARGET_ID:
                case DEVELOPMENT_TEAM:
                case DEVELOPMENT_TEAM_NAME:
                case PROVISIONING_STYLE:
                case COMPATIBILITY_VERSION:
                case DEVELOPMENT_REGION:
                case HAS_SCANNED_FOR_ENCODINGS:
                case KNOWN_REGIONS:
                case MAIN_GROUP:
                case PRODUCT_REF_GROUP:
                case PACKAGE_REFERENCES:
                case PRODUCT_DIR_PATH:
                case PROJECT_REFERENCES:
                case PROJECT_ROOT:
                case TARGETS:
                case INPUT_FILE_LIST_PATHS:
                case INPUT_PATHS:
                case OUTPUT_FILE_LIST_PATHS:
                case OUTPUT_PATHS:
                case SHELL_PATH:
                case SHELL:
                case SHELL_SCRIPT:
                case SHOW_ENV_VARS_IN_LOG:
                case TARGET:
                case TARGET_PROXY:
                case FILE_TYPE:
                case REMOTE_REF:
                case BASE_CONFIGURATION_REFERENCE:
                case BUILD_SETTINGS:
                case DST_PATH:
                case DST_SUBFOLDER_SPEC:
                case PRODUCT_GROUP:
                case PROJECT_REF:
                case BUILD_CONFIGURATIONS:
                case DEFAULT_CONFIGURATION_IS_VISIBLE:
                case DEFAULT_CONFIGURATION_NAME:
                case SETTINGS:
                case SYSTEM_CAPABILITIES:
                case CURRENT_VERSION:
                case VERSION_GROUP_TYPE:
                case CLASSPREFIX:
                case QUOTED_STRING:
                case NON_QUOTED_STRING:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1946);
                    any_string();
                }
                break;
                case NUMBER:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1947);
                    match(NUMBER);
                }
                break;
                case VARIABLE:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(1948);
                    match(VARIABLE);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class Any_tokenContext extends ParserRuleContext {
        public TerminalNode ARCHIVE_VERSION() { return getToken(PbxprojParser.ARCHIVE_VERSION, 0); }
        public TerminalNode CLASSES() { return getToken(PbxprojParser.CLASSES, 0); }
        public TerminalNode ISA() { return getToken(PbxprojParser.ISA, 0); }
        public TerminalNode OBJECT_VERSION() { return getToken(PbxprojParser.OBJECT_VERSION, 0); }
        public TerminalNode OBJECTS() { return getToken(PbxprojParser.OBJECTS, 0); }
        public TerminalNode ROOT_OBJECT() { return getToken(PbxprojParser.ROOT_OBJECT, 0); }
        public TerminalNode PBX_AGGREGATE_TARGET() { return getToken(PbxprojParser.PBX_AGGREGATE_TARGET, 0); }
        public TerminalNode PBX_BUILD_FILE() { return getToken(PbxprojParser.PBX_BUILD_FILE, 0); }
        public TerminalNode PBX_BUILD_RULE() { return getToken(PbxprojParser.PBX_BUILD_RULE, 0); }
        public TerminalNode PBX_BUILD_STYLE() { return getToken(PbxprojParser.PBX_BUILD_STYLE, 0); }
        public TerminalNode PBX_CONTAINER_ITEM_PROXY() { return getToken(PbxprojParser.PBX_CONTAINER_ITEM_PROXY, 0); }
        public TerminalNode PBX_COPY_FILES_BUILD_PHASE() { return getToken(PbxprojParser.PBX_COPY_FILES_BUILD_PHASE, 0); }
        public TerminalNode PBX_FILE_REFERENCE() { return getToken(PbxprojParser.PBX_FILE_REFERENCE, 0); }
        public TerminalNode PBX_FRAMEWORKS_BUILD_PHASE() { return getToken(PbxprojParser.PBX_FRAMEWORKS_BUILD_PHASE, 0); }
        public TerminalNode PBX_NATIVE_TARGET() { return getToken(PbxprojParser.PBX_NATIVE_TARGET, 0); }
        public TerminalNode PBX_LEGACY_TARGET() { return getToken(PbxprojParser.PBX_LEGACY_TARGET, 0); }
        public TerminalNode PBX_PROJECT() { return getToken(PbxprojParser.PBX_PROJECT, 0); }
        public TerminalNode PBX_REFERENCE_PROXY() { return getToken(PbxprojParser.PBX_REFERENCE_PROXY, 0); }
        public TerminalNode PBX_RESOURCES_BUILD_PHASE() { return getToken(PbxprojParser.PBX_RESOURCES_BUILD_PHASE, 0); }
        public TerminalNode PBX_SHELL_SCRIPT_BUILD_PHASE() { return getToken(PbxprojParser.PBX_SHELL_SCRIPT_BUILD_PHASE, 0); }
        public TerminalNode PBX_SOURCES_BUILD_PHASE() { return getToken(PbxprojParser.PBX_SOURCES_BUILD_PHASE, 0); }
        public TerminalNode PBX_TARGET_DEPENDENCY() { return getToken(PbxprojParser.PBX_TARGET_DEPENDENCY, 0); }
        public TerminalNode PBX_VARIANT_GROUP() { return getToken(PbxprojParser.PBX_VARIANT_GROUP, 0); }
        public TerminalNode XC_BUILD_CONFIGURATION() { return getToken(PbxprojParser.XC_BUILD_CONFIGURATION, 0); }
        public TerminalNode XC_CONFIGURATION_LIST() { return getToken(PbxprojParser.XC_CONFIGURATION_LIST, 0); }
        public TerminalNode XC_REMOTE_SWIFT_PACKAGE_REFERENCE() { return getToken(PbxprojParser.XC_REMOTE_SWIFT_PACKAGE_REFERENCE, 0); }
        public TerminalNode XC_SWIFT_PACKAGE_PRODUCT_DEPENDENCY() { return getToken(PbxprojParser.XC_SWIFT_PACKAGE_PRODUCT_DEPENDENCY, 0); }
        public TerminalNode XC_VERSION_GROUP() { return getToken(PbxprojParser.XC_VERSION_GROUP, 0); }
        public TerminalNode FILE_REF() { return getToken(PbxprojParser.FILE_REF, 0); }
        public TerminalNode PRODUCT_REF() { return getToken(PbxprojParser.PRODUCT_REF, 0); }
        public TerminalNode CONTAINER_PORTAL() { return getToken(PbxprojParser.CONTAINER_PORTAL, 0); }
        public TerminalNode PROXY_TYPE() { return getToken(PbxprojParser.PROXY_TYPE, 0); }
        public TerminalNode REMOTE_GLOBAL_ID_STRING() { return getToken(PbxprojParser.REMOTE_GLOBAL_ID_STRING, 0); }
        public TerminalNode REMOTE_INFO() { return getToken(PbxprojParser.REMOTE_INFO, 0); }
        public TerminalNode FILE_ENCODING() { return getToken(PbxprojParser.FILE_ENCODING, 0); }
        public TerminalNode COMMENTS() { return getToken(PbxprojParser.COMMENTS, 0); }
        public TerminalNode EXPLICIT_FILE_TYPE() { return getToken(PbxprojParser.EXPLICIT_FILE_TYPE, 0); }
        public TerminalNode LAST_KNOWN_FILE_TYPE() { return getToken(PbxprojParser.LAST_KNOWN_FILE_TYPE, 0); }
        public TerminalNode INCLUDE_IN_INDEX() { return getToken(PbxprojParser.INCLUDE_IN_INDEX, 0); }
        public TerminalNode INDENT_WIDTH() { return getToken(PbxprojParser.INDENT_WIDTH, 0); }
        public TerminalNode TAB_WIDTH() { return getToken(PbxprojParser.TAB_WIDTH, 0); }
        public TerminalNode USES_TABS() { return getToken(PbxprojParser.USES_TABS, 0); }
        public TerminalNode WRAPS_LINES() { return getToken(PbxprojParser.WRAPS_LINES, 0); }
        public TerminalNode PLATFORM_FILTER() { return getToken(PbxprojParser.PLATFORM_FILTER, 0); }
        public TerminalNode PLATFORM_FILTERS() { return getToken(PbxprojParser.PLATFORM_FILTERS, 0); }
        public TerminalNode CHILDREN() { return getToken(PbxprojParser.CHILDREN, 0); }
        public TerminalNode PRODUCT_INSTALL_PATH() { return getToken(PbxprojParser.PRODUCT_INSTALL_PATH, 0); }
        public TerminalNode REPOSITORY_URL() { return getToken(PbxprojParser.REPOSITORY_URL, 0); }
        public TerminalNode REQUIREMENT() { return getToken(PbxprojParser.REQUIREMENT, 0); }
        public TerminalNode PACKAGE() { return getToken(PbxprojParser.PACKAGE, 0); }
        public TerminalNode PACKAGE_PRODUCT_DEPENDENCIES() { return getToken(PbxprojParser.PACKAGE_PRODUCT_DEPENDENCIES, 0); }
        public TerminalNode NAME() { return getToken(PbxprojParser.NAME, 0); }
        public TerminalNode PATH() { return getToken(PbxprojParser.PATH, 0); }
        public TerminalNode SOURCE_TREE() { return getToken(PbxprojParser.SOURCE_TREE, 0); }
        public TerminalNode BUILD_ACTION_MASK() { return getToken(PbxprojParser.BUILD_ACTION_MASK, 0); }
        public TerminalNode FILES() { return getToken(PbxprojParser.FILES, 0); }
        public TerminalNode RUN_ONLY_FOR_DEPLOYMENT_POSTPROCESSING() { return getToken(PbxprojParser.RUN_ONLY_FOR_DEPLOYMENT_POSTPROCESSING, 0); }
        public TerminalNode BUILD_CONFIGURATION_LIST() { return getToken(PbxprojParser.BUILD_CONFIGURATION_LIST, 0); }
        public TerminalNode BUILD_PHASES() { return getToken(PbxprojParser.BUILD_PHASES, 0); }
        public TerminalNode BUILD_RULES() { return getToken(PbxprojParser.BUILD_RULES, 0); }
        public TerminalNode BUILD_ARGUMENTS_STRING() { return getToken(PbxprojParser.BUILD_ARGUMENTS_STRING, 0); }
        public TerminalNode BUILD_TOOL_PATH() { return getToken(PbxprojParser.BUILD_TOOL_PATH, 0); }
        public TerminalNode BUILD_WORKING_DIRECTORY() { return getToken(PbxprojParser.BUILD_WORKING_DIRECTORY, 0); }
        public TerminalNode PASS_BUILD_SETTINGS_IN_ENVIRONMENT() { return getToken(PbxprojParser.PASS_BUILD_SETTINGS_IN_ENVIRONMENT, 0); }
        public TerminalNode DEPENDENCIES() { return getToken(PbxprojParser.DEPENDENCIES, 0); }
        public TerminalNode PRODUCT_NAME() { return getToken(PbxprojParser.PRODUCT_NAME, 0); }
        public TerminalNode PRODUCT_REFERENCE() { return getToken(PbxprojParser.PRODUCT_REFERENCE, 0); }
        public TerminalNode PRODUCT_TYPE() { return getToken(PbxprojParser.PRODUCT_TYPE, 0); }
        public TerminalNode LINE_ENDING() { return getToken(PbxprojParser.LINE_ENDING, 0); }
        public TerminalNode XC_LANGUAGE_SPECIFICATION_IDENTIFIER() { return getToken(PbxprojParser.XC_LANGUAGE_SPECIFICATION_IDENTIFIER, 0); }
        public TerminalNode PLIST_STRUCTURE_DEFINITION_IDENTIFIER() { return getToken(PbxprojParser.PLIST_STRUCTURE_DEFINITION_IDENTIFIER, 0); }
        public TerminalNode REF_TYPE() { return getToken(PbxprojParser.REF_TYPE, 0); }
        public TerminalNode COMPILER_SPEC() { return getToken(PbxprojParser.COMPILER_SPEC, 0); }
        public TerminalNode FILE_PATTERNS() { return getToken(PbxprojParser.FILE_PATTERNS, 0); }
        public TerminalNode INPUT_FILES() { return getToken(PbxprojParser.INPUT_FILES, 0); }
        public TerminalNode IS_EDITABLE() { return getToken(PbxprojParser.IS_EDITABLE, 0); }
        public TerminalNode OUTPUT_FILES() { return getToken(PbxprojParser.OUTPUT_FILES, 0); }
        public TerminalNode RUN_ONCE_PER_ARCH() { return getToken(PbxprojParser.RUN_ONCE_PER_ARCH, 0); }
        public TerminalNode SCRIPT() { return getToken(PbxprojParser.SCRIPT, 0); }
        public TerminalNode ATTRIBUTES() { return getToken(PbxprojParser.ATTRIBUTES, 0); }
        public TerminalNode LAST_SWIFT_MIGRATION() { return getToken(PbxprojParser.LAST_SWIFT_MIGRATION, 0); }
        public TerminalNode DEFAULT_BUILD_SYSTEM_TYPE_FOR_WORKSPACE() { return getToken(PbxprojParser.DEFAULT_BUILD_SYSTEM_TYPE_FOR_WORKSPACE, 0); }
        public TerminalNode LAST_SWIFT_UPDATE_CHECK() { return getToken(PbxprojParser.LAST_SWIFT_UPDATE_CHECK, 0); }
        public TerminalNode BUILD_INDEPENDENT_TARGETS_IN_PARALLEL() { return getToken(PbxprojParser.BUILD_INDEPENDENT_TARGETS_IN_PARALLEL, 0); }
        public TerminalNode LAST_TESTING_UPGRADE_CHECK() { return getToken(PbxprojParser.LAST_TESTING_UPGRADE_CHECK, 0); }
        public TerminalNode LAST_UPGRADE_CHECK() { return getToken(PbxprojParser.LAST_UPGRADE_CHECK, 0); }
        public TerminalNode ORGANIZATION_NAME() { return getToken(PbxprojParser.ORGANIZATION_NAME, 0); }
        public TerminalNode TARGET_ATTRIBUTES() { return getToken(PbxprojParser.TARGET_ATTRIBUTES, 0); }
        public TerminalNode CREATED_ON_TOOLS_VERSION() { return getToken(PbxprojParser.CREATED_ON_TOOLS_VERSION, 0); }
        public TerminalNode TEST_TARGET_ID() { return getToken(PbxprojParser.TEST_TARGET_ID, 0); }
        public TerminalNode DEVELOPMENT_TEAM() { return getToken(PbxprojParser.DEVELOPMENT_TEAM, 0); }
        public TerminalNode DEVELOPMENT_TEAM_NAME() { return getToken(PbxprojParser.DEVELOPMENT_TEAM_NAME, 0); }
        public TerminalNode PROVISIONING_STYLE() { return getToken(PbxprojParser.PROVISIONING_STYLE, 0); }
        public TerminalNode COMPATIBILITY_VERSION() { return getToken(PbxprojParser.COMPATIBILITY_VERSION, 0); }
        public TerminalNode DEVELOPMENT_REGION() { return getToken(PbxprojParser.DEVELOPMENT_REGION, 0); }
        public TerminalNode HAS_SCANNED_FOR_ENCODINGS() { return getToken(PbxprojParser.HAS_SCANNED_FOR_ENCODINGS, 0); }
        public TerminalNode KNOWN_REGIONS() { return getToken(PbxprojParser.KNOWN_REGIONS, 0); }
        public TerminalNode MAIN_GROUP() { return getToken(PbxprojParser.MAIN_GROUP, 0); }
        public TerminalNode PRODUCT_REF_GROUP() { return getToken(PbxprojParser.PRODUCT_REF_GROUP, 0); }
        public TerminalNode PACKAGE_REFERENCES() { return getToken(PbxprojParser.PACKAGE_REFERENCES, 0); }
        public TerminalNode PRODUCT_DIR_PATH() { return getToken(PbxprojParser.PRODUCT_DIR_PATH, 0); }
        public TerminalNode PROJECT_REFERENCES() { return getToken(PbxprojParser.PROJECT_REFERENCES, 0); }
        public TerminalNode PROJECT_ROOT() { return getToken(PbxprojParser.PROJECT_ROOT, 0); }
        public TerminalNode TARGETS() { return getToken(PbxprojParser.TARGETS, 0); }
        public TerminalNode INPUT_FILE_LIST_PATHS() { return getToken(PbxprojParser.INPUT_FILE_LIST_PATHS, 0); }
        public TerminalNode INPUT_PATHS() { return getToken(PbxprojParser.INPUT_PATHS, 0); }
        public TerminalNode OUTPUT_FILE_LIST_PATHS() { return getToken(PbxprojParser.OUTPUT_FILE_LIST_PATHS, 0); }
        public TerminalNode OUTPUT_PATHS() { return getToken(PbxprojParser.OUTPUT_PATHS, 0); }
        public TerminalNode SHELL_PATH() { return getToken(PbxprojParser.SHELL_PATH, 0); }
        public TerminalNode SHELL() { return getToken(PbxprojParser.SHELL, 0); }
        public TerminalNode SHELL_SCRIPT() { return getToken(PbxprojParser.SHELL_SCRIPT, 0); }
        public TerminalNode SHOW_ENV_VARS_IN_LOG() { return getToken(PbxprojParser.SHOW_ENV_VARS_IN_LOG, 0); }
        public TerminalNode TARGET() { return getToken(PbxprojParser.TARGET, 0); }
        public TerminalNode TARGET_PROXY() { return getToken(PbxprojParser.TARGET_PROXY, 0); }
        public TerminalNode FILE_TYPE() { return getToken(PbxprojParser.FILE_TYPE, 0); }
        public TerminalNode REMOTE_REF() { return getToken(PbxprojParser.REMOTE_REF, 0); }
        public TerminalNode BASE_CONFIGURATION_REFERENCE() { return getToken(PbxprojParser.BASE_CONFIGURATION_REFERENCE, 0); }
        public TerminalNode BUILD_SETTINGS() { return getToken(PbxprojParser.BUILD_SETTINGS, 0); }
        public TerminalNode DST_PATH() { return getToken(PbxprojParser.DST_PATH, 0); }
        public TerminalNode DST_SUBFOLDER_SPEC() { return getToken(PbxprojParser.DST_SUBFOLDER_SPEC, 0); }
        public TerminalNode PRODUCT_GROUP() { return getToken(PbxprojParser.PRODUCT_GROUP, 0); }
        public TerminalNode PROJECT_REF() { return getToken(PbxprojParser.PROJECT_REF, 0); }
        public TerminalNode BUILD_CONFIGURATIONS() { return getToken(PbxprojParser.BUILD_CONFIGURATIONS, 0); }
        public TerminalNode DEFAULT_CONFIGURATION_IS_VISIBLE() { return getToken(PbxprojParser.DEFAULT_CONFIGURATION_IS_VISIBLE, 0); }
        public TerminalNode DEFAULT_CONFIGURATION_NAME() { return getToken(PbxprojParser.DEFAULT_CONFIGURATION_NAME, 0); }
        public TerminalNode SETTINGS() { return getToken(PbxprojParser.SETTINGS, 0); }
        public TerminalNode SYSTEM_CAPABILITIES() { return getToken(PbxprojParser.SYSTEM_CAPABILITIES, 0); }
        public TerminalNode CURRENT_VERSION() { return getToken(PbxprojParser.CURRENT_VERSION, 0); }
        public TerminalNode VERSION_GROUP_TYPE() { return getToken(PbxprojParser.VERSION_GROUP_TYPE, 0); }
        public TerminalNode CLASSPREFIX() { return getToken(PbxprojParser.CLASSPREFIX, 0); }
        public Any_tokenContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_any_token; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).enterAny_token(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof PbxprojListener ) ((PbxprojListener)listener).exitAny_token(this);
        }
    }

    public final Any_tokenContext any_token() throws RecognitionException {
        Any_tokenContext _localctx = new Any_tokenContext(_ctx, getState());
        enterRule(_localctx, 386, RULE_any_token);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1951);
                _la = _input.LA(1);
                if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARCHIVE_VERSION) | (1L << CLASSES) | (1L << ISA) | (1L << OBJECT_VERSION) | (1L << OBJECTS) | (1L << ROOT_OBJECT) | (1L << PBX_AGGREGATE_TARGET) | (1L << PBX_BUILD_FILE) | (1L << PBX_BUILD_RULE) | (1L << PBX_BUILD_STYLE) | (1L << PBX_CONTAINER_ITEM_PROXY) | (1L << PBX_COPY_FILES_BUILD_PHASE) | (1L << PBX_FILE_REFERENCE) | (1L << PBX_FRAMEWORKS_BUILD_PHASE) | (1L << PBX_NATIVE_TARGET) | (1L << PBX_LEGACY_TARGET) | (1L << PBX_PROJECT) | (1L << PBX_REFERENCE_PROXY) | (1L << PBX_RESOURCES_BUILD_PHASE) | (1L << PBX_SHELL_SCRIPT_BUILD_PHASE) | (1L << PBX_SOURCES_BUILD_PHASE) | (1L << PBX_TARGET_DEPENDENCY) | (1L << PBX_VARIANT_GROUP) | (1L << XC_BUILD_CONFIGURATION) | (1L << XC_CONFIGURATION_LIST) | (1L << XC_REMOTE_SWIFT_PACKAGE_REFERENCE) | (1L << XC_SWIFT_PACKAGE_PRODUCT_DEPENDENCY) | (1L << XC_VERSION_GROUP) | (1L << FILE_REF) | (1L << PRODUCT_REF) | (1L << CONTAINER_PORTAL) | (1L << PROXY_TYPE) | (1L << REMOTE_GLOBAL_ID_STRING) | (1L << REMOTE_INFO) | (1L << FILE_ENCODING) | (1L << COMMENTS) | (1L << EXPLICIT_FILE_TYPE) | (1L << LAST_KNOWN_FILE_TYPE) | (1L << INCLUDE_IN_INDEX) | (1L << INDENT_WIDTH) | (1L << TAB_WIDTH) | (1L << USES_TABS) | (1L << WRAPS_LINES) | (1L << PLATFORM_FILTER) | (1L << PLATFORM_FILTERS) | (1L << CHILDREN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PRODUCT_INSTALL_PATH - 64)) | (1L << (REPOSITORY_URL - 64)) | (1L << (REQUIREMENT - 64)) | (1L << (PACKAGE - 64)) | (1L << (PACKAGE_PRODUCT_DEPENDENCIES - 64)) | (1L << (NAME - 64)) | (1L << (PATH - 64)) | (1L << (SOURCE_TREE - 64)) | (1L << (BUILD_ACTION_MASK - 64)) | (1L << (FILES - 64)) | (1L << (RUN_ONLY_FOR_DEPLOYMENT_POSTPROCESSING - 64)) | (1L << (BUILD_CONFIGURATION_LIST - 64)) | (1L << (BUILD_PHASES - 64)) | (1L << (BUILD_RULES - 64)) | (1L << (BUILD_ARGUMENTS_STRING - 64)) | (1L << (BUILD_TOOL_PATH - 64)) | (1L << (BUILD_WORKING_DIRECTORY - 64)) | (1L << (PASS_BUILD_SETTINGS_IN_ENVIRONMENT - 64)) | (1L << (DEPENDENCIES - 64)) | (1L << (PRODUCT_NAME - 64)) | (1L << (PRODUCT_REFERENCE - 64)) | (1L << (PRODUCT_TYPE - 64)) | (1L << (LINE_ENDING - 64)) | (1L << (XC_LANGUAGE_SPECIFICATION_IDENTIFIER - 64)) | (1L << (PLIST_STRUCTURE_DEFINITION_IDENTIFIER - 64)) | (1L << (REF_TYPE - 64)) | (1L << (COMPILER_SPEC - 64)) | (1L << (FILE_PATTERNS - 64)) | (1L << (INPUT_FILES - 64)) | (1L << (IS_EDITABLE - 64)) | (1L << (OUTPUT_FILES - 64)) | (1L << (RUN_ONCE_PER_ARCH - 64)) | (1L << (SCRIPT - 64)) | (1L << (ATTRIBUTES - 64)) | (1L << (LAST_SWIFT_MIGRATION - 64)) | (1L << (DEFAULT_BUILD_SYSTEM_TYPE_FOR_WORKSPACE - 64)) | (1L << (LAST_SWIFT_UPDATE_CHECK - 64)) | (1L << (BUILD_INDEPENDENT_TARGETS_IN_PARALLEL - 64)) | (1L << (LAST_TESTING_UPGRADE_CHECK - 64)) | (1L << (LAST_UPGRADE_CHECK - 64)) | (1L << (ORGANIZATION_NAME - 64)) | (1L << (TARGET_ATTRIBUTES - 64)) | (1L << (CREATED_ON_TOOLS_VERSION - 64)) | (1L << (TEST_TARGET_ID - 64)) | (1L << (DEVELOPMENT_TEAM - 64)) | (1L << (DEVELOPMENT_TEAM_NAME - 64)) | (1L << (PROVISIONING_STYLE - 64)) | (1L << (COMPATIBILITY_VERSION - 64)) | (1L << (DEVELOPMENT_REGION - 64)) | (1L << (HAS_SCANNED_FOR_ENCODINGS - 64)) | (1L << (KNOWN_REGIONS - 64)) | (1L << (MAIN_GROUP - 64)) | (1L << (PRODUCT_REF_GROUP - 64)) | (1L << (PACKAGE_REFERENCES - 64)) | (1L << (PRODUCT_DIR_PATH - 64)) | (1L << (PROJECT_REFERENCES - 64)) | (1L << (PROJECT_ROOT - 64)) | (1L << (TARGETS - 64)) | (1L << (INPUT_FILE_LIST_PATHS - 64)) | (1L << (INPUT_PATHS - 64)) | (1L << (OUTPUT_FILE_LIST_PATHS - 64)) | (1L << (OUTPUT_PATHS - 64)) | (1L << (SHELL_PATH - 64)) | (1L << (SHELL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (SHELL_SCRIPT - 128)) | (1L << (SHOW_ENV_VARS_IN_LOG - 128)) | (1L << (TARGET - 128)) | (1L << (TARGET_PROXY - 128)) | (1L << (FILE_TYPE - 128)) | (1L << (REMOTE_REF - 128)) | (1L << (BASE_CONFIGURATION_REFERENCE - 128)) | (1L << (BUILD_SETTINGS - 128)) | (1L << (DST_PATH - 128)) | (1L << (DST_SUBFOLDER_SPEC - 128)) | (1L << (PRODUCT_GROUP - 128)) | (1L << (PROJECT_REF - 128)) | (1L << (BUILD_CONFIGURATIONS - 128)) | (1L << (DEFAULT_CONFIGURATION_IS_VISIBLE - 128)) | (1L << (DEFAULT_CONFIGURATION_NAME - 128)) | (1L << (SETTINGS - 128)) | (1L << (SYSTEM_CAPABILITIES - 128)) | (1L << (CURRENT_VERSION - 128)) | (1L << (VERSION_GROUP_TYPE - 128)) | (1L << (CLASSPREFIX - 128)))) != 0)) ) {
                    _errHandler.recoverInline(this);
                }
                else {
                    if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static final String _serializedATN =
            "\u0004\u0001\u009d\u07a2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
                    "\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
                    "\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
                    "\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
                    "\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
                    "\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
                    "\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
                    "\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
                    "\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
                    "\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
                    "\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
                    "\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
                    "\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
                    ",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
                    "1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
                    "6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
                    ";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
                    "@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
                    "E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
                    "J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
                    "O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
                    "T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
                    "Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007"+
                    "^\u0002_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007"+
                    "c\u0002d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007"+
                    "h\u0002i\u0007i\u0002j\u0007j\u0002k\u0007k\u0002l\u0007l\u0002m\u0007"+
                    "m\u0002n\u0007n\u0002o\u0007o\u0002p\u0007p\u0002q\u0007q\u0002r\u0007"+
                    "r\u0002s\u0007s\u0002t\u0007t\u0002u\u0007u\u0002v\u0007v\u0002w\u0007"+
                    "w\u0002x\u0007x\u0002y\u0007y\u0002z\u0007z\u0002{\u0007{\u0002|\u0007"+
                    "|\u0002}\u0007}\u0002~\u0007~\u0002\u007f\u0007\u007f\u0002\u0080\u0007"+
                    "\u0080\u0002\u0081\u0007\u0081\u0002\u0082\u0007\u0082\u0002\u0083\u0007"+
                    "\u0083\u0002\u0084\u0007\u0084\u0002\u0085\u0007\u0085\u0002\u0086\u0007"+
                    "\u0086\u0002\u0087\u0007\u0087\u0002\u0088\u0007\u0088\u0002\u0089\u0007"+
                    "\u0089\u0002\u008a\u0007\u008a\u0002\u008b\u0007\u008b\u0002\u008c\u0007"+
                    "\u008c\u0002\u008d\u0007\u008d\u0002\u008e\u0007\u008e\u0002\u008f\u0007"+
                    "\u008f\u0002\u0090\u0007\u0090\u0002\u0091\u0007\u0091\u0002\u0092\u0007"+
                    "\u0092\u0002\u0093\u0007\u0093\u0002\u0094\u0007\u0094\u0002\u0095\u0007"+
                    "\u0095\u0002\u0096\u0007\u0096\u0002\u0097\u0007\u0097\u0002\u0098\u0007"+
                    "\u0098\u0002\u0099\u0007\u0099\u0002\u009a\u0007\u009a\u0002\u009b\u0007"+
                    "\u009b\u0002\u009c\u0007\u009c\u0002\u009d\u0007\u009d\u0002\u009e\u0007"+
                    "\u009e\u0002\u009f\u0007\u009f\u0002\u00a0\u0007\u00a0\u0002\u00a1\u0007"+
                    "\u00a1\u0002\u00a2\u0007\u00a2\u0002\u00a3\u0007\u00a3\u0002\u00a4\u0007"+
                    "\u00a4\u0002\u00a5\u0007\u00a5\u0002\u00a6\u0007\u00a6\u0002\u00a7\u0007"+
                    "\u00a7\u0002\u00a8\u0007\u00a8\u0002\u00a9\u0007\u00a9\u0002\u00aa\u0007"+
                    "\u00aa\u0002\u00ab\u0007\u00ab\u0002\u00ac\u0007\u00ac\u0002\u00ad\u0007"+
                    "\u00ad\u0002\u00ae\u0007\u00ae\u0002\u00af\u0007\u00af\u0002\u00b0\u0007"+
                    "\u00b0\u0002\u00b1\u0007\u00b1\u0002\u00b2\u0007\u00b2\u0002\u00b3\u0007"+
                    "\u00b3\u0002\u00b4\u0007\u00b4\u0002\u00b5\u0007\u00b5\u0002\u00b6\u0007"+
                    "\u00b6\u0002\u00b7\u0007\u00b7\u0002\u00b8\u0007\u00b8\u0002\u00b9\u0007"+
                    "\u00b9\u0002\u00ba\u0007\u00ba\u0002\u00bb\u0007\u00bb\u0002\u00bc\u0007"+
                    "\u00bc\u0002\u00bd\u0007\u00bd\u0002\u00be\u0007\u00be\u0002\u00bf\u0007"+
                    "\u00bf\u0002\u00c0\u0007\u00c0\u0002\u00c1\u0007\u00c1\u0001\u0000\u0001"+
                    "\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
                    "\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
                    "\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
                    "\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
                    "\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u01a3"+
                    "\b\u0005\u0001\u0005\u0003\u0005\u01a6\b\u0005\u0001\u0005\u0003\u0005"+
                    "\u01a9\b\u0005\u0001\u0005\u0003\u0005\u01ac\b\u0005\u0001\u0005\u0003"+
                    "\u0005\u01af\b\u0005\u0001\u0005\u0003\u0005\u01b2\b\u0005\u0001\u0005"+
                    "\u0003\u0005\u01b5\b\u0005\u0001\u0005\u0003\u0005\u01b8\b\u0005\u0001"+
                    "\u0005\u0001\u0005\u0003\u0005\u01bc\b\u0005\u0001\u0005\u0003\u0005\u01bf"+
                    "\b\u0005\u0001\u0005\u0003\u0005\u01c2\b\u0005\u0001\u0005\u0001\u0005"+
                    "\u0003\u0005\u01c6\b\u0005\u0001\u0005\u0003\u0005\u01c9\b\u0005\u0001"+
                    "\u0005\u0003\u0005\u01cc\b\u0005\u0001\u0005\u0003\u0005\u01cf\b\u0005"+
                    "\u0001\u0005\u0003\u0005\u01d2\b\u0005\u0001\u0005\u0003\u0005\u01d5\b"+
                    "\u0005\u0001\u0005\u0003\u0005\u01d8\b\u0005\u0001\u0005\u0001\u0005\u0001"+
                    "\u0005\u0003\u0005\u01dd\b\u0005\u0001\u0005\u0003\u0005\u01e0\b\u0005"+
                    "\u0001\u0005\u0003\u0005\u01e3\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
                    "\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
                    "\u0004\u0007\u01ee\b\u0007\u000b\u0007\f\u0007\u01ef\u0001\b\u0004\b\u01f3"+
                    "\b\b\u000b\b\f\b\u01f4\u0001\t\u0004\t\u01f8\b\t\u000b\t\f\t\u01f9\u0001"+
                    "\n\u0004\n\u01fd\b\n\u000b\n\f\n\u01fe\u0001\u000b\u0004\u000b\u0202\b"+
                    "\u000b\u000b\u000b\f\u000b\u0203\u0001\f\u0004\f\u0207\b\f\u000b\f\f\f"+
                    "\u0208\u0001\r\u0004\r\u020c\b\r\u000b\r\f\r\u020d\u0001\u000e\u0004\u000e"+
                    "\u0211\b\u000e\u000b\u000e\f\u000e\u0212\u0001\u000f\u0004\u000f\u0216"+
                    "\b\u000f\u000b\u000f\f\u000f\u0217\u0001\u0010\u0004\u0010\u021b\b\u0010"+
                    "\u000b\u0010\f\u0010\u021c\u0001\u0011\u0004\u0011\u0220\b\u0011\u000b"+
                    "\u0011\f\u0011\u0221\u0001\u0012\u0004\u0012\u0225\b\u0012\u000b\u0012"+
                    "\f\u0012\u0226\u0001\u0013\u0004\u0013\u022a\b\u0013\u000b\u0013\f\u0013"+
                    "\u022b\u0001\u0014\u0004\u0014\u022f\b\u0014\u000b\u0014\f\u0014\u0230"+
                    "\u0001\u0015\u0004\u0015\u0234\b\u0015\u000b\u0015\f\u0015\u0235\u0001"+
                    "\u0016\u0004\u0016\u0239\b\u0016\u000b\u0016\f\u0016\u023a\u0001\u0017"+
                    "\u0004\u0017\u023e\b\u0017\u000b\u0017\f\u0017\u023f\u0001\u0018\u0004"+
                    "\u0018\u0243\b\u0018\u000b\u0018\f\u0018\u0244\u0001\u0019\u0004\u0019"+
                    "\u0248\b\u0019\u000b\u0019\f\u0019\u0249\u0001\u001a\u0004\u001a\u024d"+
                    "\b\u001a\u000b\u001a\f\u001a\u024e\u0001\u001b\u0004\u001b\u0252\b\u001b"+
                    "\u000b\u001b\f\u001b\u0253\u0001\u001c\u0004\u001c\u0257\b\u001c\u000b"+
                    "\u001c\f\u001c\u0258\u0001\u001d\u0004\u001d\u025c\b\u001d\u000b\u001d"+
                    "\f\u001d\u025d\u0001\u001e\u0004\u001e\u0261\b\u001e\u000b\u001e\f\u001e"+
                    "\u0262\u0001\u001f\u0004\u001f\u0266\b\u001f\u000b\u001f\f\u001f\u0267"+
                    "\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u0271\b \u0001"+
                    " \u0003 \u0274\b \u0001 \u0001 \u0001 \u0003 \u0279\b \u0001 \u0001 \u0001"+
                    " \u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u0283\b!\u0001!\u0003!\u0286"+
                    "\b!\u0001!\u0003!\u0289\b!\u0001!\u0003!\u028c\b!\u0001!\u0003!\u028f"+
                    "\b!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
                    "\"\u0003\"\u029a\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u02a1"+
                    "\b\"\u0001\"\u0003\"\u02a4\b\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001"+
                    "#\u0001#\u0001#\u0003#\u02ae\b#\u0001#\u0003#\u02b1\b#\u0001#\u0001#\u0001"+
                    "#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
                    "$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u02c7\b%\u0001"+
                    "%\u0001%\u0003%\u02cb\b%\u0001%\u0003%\u02ce\b%\u0001%\u0001%\u0001%\u0001"+
                    "%\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u02d9\b&\u0001&\u0003&\u02dc"+
                    "\b&\u0001&\u0003&\u02df\b&\u0001&\u0003&\u02e2\b&\u0001&\u0003&\u02e5"+
                    "\b&\u0001&\u0003&\u02e8\b&\u0001&\u0003&\u02eb\b&\u0001&\u0003&\u02ee"+
                    "\b&\u0001&\u0003&\u02f1\b&\u0001&\u0003&\u02f4\b&\u0001&\u0003&\u02f7"+
                    "\b&\u0001&\u0003&\u02fa\b&\u0001&\u0003&\u02fd\b&\u0001&\u0003&\u0300"+
                    "\b&\u0001&\u0003&\u0303\b&\u0001&\u0003&\u0306\b&\u0001&\u0003&\u0309"+
                    "\b&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
                    "\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001("+
                    "\u0001(\u0003(\u031e\b(\u0001(\u0003(\u0321\b(\u0001(\u0003(\u0324\b("+
                    "\u0001(\u0003(\u0327\b(\u0001(\u0003(\u032a\b(\u0001(\u0001(\u0003(\u032e"+
                    "\b(\u0001(\u0003(\u0331\b(\u0001(\u0003(\u0334\b(\u0001(\u0001(\u0001"+
                    "(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
                    ")\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u034b"+
                    "\b*\u0001*\u0003*\u034e\b*\u0001*\u0001*\u0001*\u0003*\u0353\b*\u0001"+
                    "*\u0003*\u0356\b*\u0001*\u0001*\u0003*\u035a\b*\u0001*\u0001*\u0001*\u0001"+
                    "*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
                    "+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001"+
                    ",\u0001,\u0003,\u0375\b,\u0001,\u0001,\u0003,\u0379\b,\u0001,\u0003,\u037c"+
                    "\b,\u0001,\u0003,\u037f\b,\u0001,\u0003,\u0382\b,\u0001,\u0001,\u0003"+
                    ",\u0386\b,\u0001,\u0001,\u0003,\u038a\b,\u0001,\u0003,\u038d\b,\u0001"+
                    ",\u0001,\u0003,\u0391\b,\u0001,\u0003,\u0394\b,\u0001,\u0001,\u0001,\u0001"+
                    ",\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003-\u03a0\b-\u0001-\u0001"+
                    "-\u0001-\u0001-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001"+
                    ".\u0001.\u0001.\u0001.\u0001.\u0001/\u0001/\u0001/\u0001/\u0001/\u0003"+
                    "/\u03b7\b/\u0001/\u0001/\u0001/\u0003/\u03bc\b/\u0001/\u0003/\u03bf\b"+
                    "/\u0001/\u0003/\u03c2\b/\u0001/\u0003/\u03c5\b/\u0001/\u0003/\u03c8\b"+
                    "/\u0001/\u0001/\u0001/\u0001/\u0003/\u03ce\b/\u0001/\u0001/\u0001/\u0001"+
                    "0\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u0001"+
                    "0\u00010\u00010\u00010\u00010\u00010\u00010\u00011\u00011\u00011\u0001"+
                    "1\u00011\u00011\u00011\u00011\u00011\u00011\u00012\u00012\u00012\u0001"+
                    "2\u00012\u00032\u03f3\b2\u00012\u00032\u03f6\b2\u00012\u00032\u03f9\b"+
                    "2\u00012\u00032\u03fc\b2\u00012\u00032\u03ff\b2\u00012\u00032\u0402\b"+
                    "2\u00012\u00012\u00012\u00013\u00013\u00013\u00013\u00013\u00013\u0001"+
                    "3\u00033\u040e\b3\u00013\u00013\u00013\u00013\u00014\u00014\u00014\u0001"+
                    "4\u00014\u00034\u0419\b4\u00014\u00014\u00014\u00014\u00014\u00015\u0001"+
                    "5\u00015\u00015\u00015\u00015\u00015\u00035\u0427\b5\u00015\u00015\u0001"+
                    "5\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u0001"+
                    "7\u00017\u00017\u00017\u00017\u00037\u043a\b7\u00017\u00017\u00017\u0001"+
                    "7\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00038\u0447\b8\u0001"+
                    "8\u00018\u00018\u00018\u00018\u00018\u00019\u00019\u00019\u00019\u0001"+
                    "9\u0001:\u0001:\u0001:\u0001:\u0001:\u0001;\u0001;\u0001;\u0001;\u0001"+
                    ";\u0001<\u0001<\u0001<\u0001<\u0001<\u0001=\u0001=\u0001=\u0001=\u0001"+
                    "=\u0001>\u0001>\u0001>\u0001>\u0001>\u0001?\u0001?\u0001?\u0001?\u0001"+
                    "?\u0001@\u0001@\u0001@\u0001@\u0001@\u0001A\u0001A\u0001A\u0001A\u0001"+
                    "A\u0001B\u0001B\u0001B\u0001B\u0001B\u0001C\u0001C\u0001C\u0001C\u0001"+
                    "C\u0001D\u0001D\u0001D\u0001D\u0001D\u0001E\u0001E\u0001E\u0001E\u0001"+
                    "E\u0001F\u0001F\u0001F\u0001F\u0001F\u0001G\u0001G\u0001G\u0001G\u0001"+
                    "G\u0001H\u0001H\u0001H\u0001H\u0001H\u0001I\u0001I\u0001I\u0001I\u0001"+
                    "I\u0001J\u0001J\u0001J\u0001J\u0001J\u0001K\u0001K\u0001K\u0001K\u0001"+
                    "K\u0001L\u0001L\u0001L\u0001L\u0001L\u0001M\u0001M\u0001M\u0001M\u0001"+
                    "M\u0001N\u0001N\u0001N\u0001N\u0001N\u0001O\u0001O\u0001O\u0001O\u0001"+
                    "O\u0001P\u0001P\u0001P\u0001P\u0001P\u0001Q\u0001Q\u0001Q\u0001Q\u0001"+
                    "Q\u0001R\u0001R\u0001R\u0001R\u0001R\u0001S\u0001S\u0001S\u0001S\u0001"+
                    "S\u0001T\u0001T\u0001T\u0001T\u0001T\u0001U\u0001U\u0001U\u0001U\u0001"+
                    "U\u0001V\u0001V\u0001V\u0001V\u0001V\u0001W\u0001W\u0001W\u0001W\u0001"+
                    "W\u0001X\u0001X\u0001X\u0001X\u0001X\u0001Y\u0001Y\u0001Y\u0001Y\u0001"+
                    "Y\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001[\u0001[\u0001[\u0001[\u0001"+
                    "[\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001]\u0001]\u0001]\u0001]"+
                    "\u0001]\u0001^\u0001^\u0001^\u0001^\u0001^\u0001_\u0001_\u0001_\u0001"+
                    "_\u0001_\u0001`\u0001`\u0001`\u0001`\u0001`\u0001a\u0001a\u0001a\u0001"+
                    "a\u0001a\u0001b\u0001b\u0001b\u0001b\u0001b\u0001c\u0001c\u0001c\u0001"+
                    "c\u0001c\u0001d\u0001d\u0001d\u0001d\u0001d\u0001e\u0001e\u0001e\u0001"+
                    "e\u0001e\u0001f\u0001f\u0001f\u0001f\u0001f\u0001g\u0001g\u0001g\u0001"+
                    "g\u0005g\u0539\bg\ng\fg\u053c\tg\u0001g\u0001g\u0001g\u0001h\u0001h\u0001"+
                    "h\u0001h\u0001h\u0001i\u0001i\u0001i\u0001i\u0001i\u0001j\u0001j\u0001"+
                    "j\u0001j\u0001j\u0001k\u0001k\u0001k\u0001k\u0001k\u0001l\u0001l\u0001"+
                    "l\u0001l\u0001l\u0001m\u0001m\u0001m\u0001m\u0001m\u0001n\u0001n\u0001"+
                    "n\u0001n\u0001n\u0001o\u0001o\u0001o\u0001o\u0001o\u0001p\u0001p\u0001"+
                    "p\u0005p\u056c\bp\np\fp\u056f\tp\u0001p\u0001p\u0001q\u0001q\u0001q\u0001"+
                    "q\u0001q\u0001q\u0005q\u0579\bq\nq\fq\u057c\tq\u0001q\u0003q\u057f\bq"+
                    "\u0001q\u0001q\u0003q\u0583\bq\u0001r\u0001r\u0001r\u0005r\u0588\br\n"+
                    "r\fr\u058b\tr\u0001r\u0001r\u0001s\u0001s\u0001s\u0001s\u0001s\u0001t"+
                    "\u0001t\u0001t\u0001t\u0001t\u0001u\u0001u\u0001u\u0001u\u0001u\u0001"+
                    "v\u0001v\u0001v\u0001v\u0001v\u0001w\u0001w\u0001w\u0001w\u0001w\u0001"+
                    "x\u0001x\u0001x\u0001x\u0001x\u0001y\u0001y\u0001y\u0001y\u0001y\u0001"+
                    "z\u0001z\u0001z\u0001z\u0001z\u0001{\u0001{\u0001{\u0001{\u0001{\u0001"+
                    "|\u0001|\u0001|\u0001|\u0001|\u0001}\u0001}\u0001}\u0001}\u0001}\u0001"+
                    "~\u0001~\u0001~\u0001~\u0001~\u0001\u007f\u0001\u007f\u0001\u007f\u0001"+
                    "\u007f\u0001\u007f\u0001\u0080\u0001\u0080\u0001\u0080\u0001\u0080\u0001"+
                    "\u0080\u0001\u0081\u0001\u0081\u0001\u0081\u0001\u0081\u0001\u0081\u0001"+
                    "\u0082\u0001\u0082\u0001\u0082\u0001\u0082\u0001\u0082\u0001\u0083\u0001"+
                    "\u0083\u0001\u0083\u0001\u0083\u0001\u0083\u0001\u0084\u0001\u0084\u0001"+
                    "\u0084\u0001\u0084\u0001\u0084\u0001\u0085\u0001\u0085\u0001\u0085\u0001"+
                    "\u0085\u0001\u0085\u0001\u0086\u0001\u0086\u0001\u0086\u0001\u0086\u0001"+
                    "\u0086\u0001\u0087\u0001\u0087\u0001\u0087\u0001\u0087\u0001\u0087\u0001"+
                    "\u0088\u0001\u0088\u0001\u0088\u0001\u0088\u0001\u0088\u0001\u0089\u0001"+
                    "\u0089\u0001\u0089\u0001\u0089\u0003\u0089\u0601\b\u0089\u0001\u0089\u0003"+
                    "\u0089\u0604\b\u0089\u0001\u0089\u0003\u0089\u0607\b\u0089\u0001\u0089"+
                    "\u0003\u0089\u060a\b\u0089\u0001\u0089\u0003\u0089\u060d\b\u0089\u0001"+
                    "\u0089\u0003\u0089\u0610\b\u0089\u0001\u0089\u0003\u0089\u0613\b\u0089"+
                    "\u0001\u0089\u0003\u0089\u0616\b\u0089\u0001\u0089\u0003\u0089\u0619\b"+
                    "\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u008a\u0001\u008a\u0001"+
                    "\u008a\u0001\u008a\u0001\u008a\u0001\u008b\u0001\u008b\u0001\u008b\u0001"+
                    "\u008b\u0001\u008b\u0001\u008c\u0001\u008c\u0001\u008c\u0001\u008c\u0001"+
                    "\u008c\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001"+
                    "\u008e\u0001\u008e\u0001\u008e\u0001\u008e\u0001\u008e\u0001\u008f\u0001"+
                    "\u008f\u0001\u008f\u0001\u008f\u0001\u008f\u0001\u0090\u0001\u0090\u0001"+
                    "\u0090\u0001\u0090\u0001\u0090\u0001\u0091\u0001\u0091\u0001\u0091\u0001"+
                    "\u0091\u0005\u0091\u0645\b\u0091\n\u0091\f\u0091\u0648\t\u0091\u0001\u0091"+
                    "\u0001\u0091\u0001\u0091\u0001\u0092\u0001\u0092\u0001\u0092\u0001\u0092"+
                    "\u0003\u0092\u0651\b\u0092\u0001\u0092\u0003\u0092\u0654\b\u0092\u0001"+
                    "\u0092\u0003\u0092\u0657\b\u0092\u0001\u0092\u0003\u0092\u065a\b\u0092"+
                    "\u0001\u0092\u0003\u0092\u065d\b\u0092\u0001\u0092\u0003\u0092\u0660\b"+
                    "\u0092\u0001\u0092\u0003\u0092\u0663\b\u0092\u0001\u0092\u0003\u0092\u0666"+
                    "\b\u0092\u0001\u0092\u0001\u0092\u0001\u0092\u0001\u0093\u0001\u0093\u0001"+
                    "\u0093\u0001\u0093\u0001\u0093\u0001\u0094\u0001\u0094\u0001\u0094\u0001"+
                    "\u0094\u0001\u0094\u0001\u0095\u0001\u0095\u0001\u0095\u0001\u0095\u0001"+
                    "\u0095\u0001\u0096\u0001\u0096\u0001\u0096\u0001\u0096\u0001\u0096\u0001"+
                    "\u0097\u0001\u0097\u0001\u0097\u0001\u0097\u0001\u0097\u0001\u0098\u0001"+
                    "\u0098\u0001\u0098\u0001\u0098\u0001\u0098\u0001\u0099\u0001\u0099\u0001"+
                    "\u0099\u0001\u0099\u0001\u0099\u0001\u009a\u0001\u009a\u0001\u009a\u0001"+
                    "\u009a\u0001\u009a\u0001\u009b\u0001\u009b\u0001\u009b\u0001\u009b\u0001"+
                    "\u009b\u0001\u009c\u0001\u009c\u0001\u009c\u0001\u009c\u0001\u009c\u0001"+
                    "\u009d\u0001\u009d\u0001\u009d\u0001\u009d\u0001\u009d\u0001\u009e\u0001"+
                    "\u009e\u0001\u009e\u0001\u009e\u0001\u009e\u0001\u009f\u0001\u009f\u0001"+
                    "\u009f\u0001\u009f\u0001\u009f\u0001\u00a0\u0001\u00a0\u0001\u00a0\u0001"+
                    "\u00a0\u0001\u00a0\u0001\u00a0\u0001\u00a0\u0001\u00a0\u0001\u00a0\u0001"+
                    "\u00a0\u0001\u00a0\u0001\u00a0\u0003\u00a0\u06b8\b\u00a0\u0001\u00a1\u0001"+
                    "\u00a1\u0001\u00a1\u0001\u00a1\u0001\u00a1\u0001\u00a2\u0001\u00a2\u0001"+
                    "\u00a2\u0001\u00a2\u0001\u00a2\u0001\u00a3\u0001\u00a3\u0001\u00a3\u0001"+
                    "\u00a3\u0001\u00a3\u0001\u00a4\u0001\u00a4\u0001\u00a4\u0001\u00a4\u0001"+
                    "\u00a4\u0001\u00a5\u0001\u00a5\u0001\u00a5\u0001\u00a5\u0001\u00a5\u0001"+
                    "\u00a6\u0001\u00a6\u0001\u00a6\u0001\u00a6\u0001\u00a6\u0001\u00a7\u0001"+
                    "\u00a7\u0001\u00a7\u0001\u00a7\u0001\u00a7\u0001\u00a8\u0001\u00a8\u0001"+
                    "\u00a8\u0001\u00a8\u0001\u00a8\u0001\u00a9\u0001\u00a9\u0001\u00a9\u0001"+
                    "\u00a9\u0001\u00a9\u0001\u00aa\u0001\u00aa\u0001\u00aa\u0001\u00aa\u0001"+
                    "\u00aa\u0001\u00ab\u0001\u00ab\u0001\u00ab\u0001\u00ab\u0001\u00ab\u0001"+
                    "\u00ac\u0001\u00ac\u0001\u00ac\u0001\u00ac\u0001\u00ac\u0001\u00ad\u0001"+
                    "\u00ad\u0001\u00ad\u0001\u00ad\u0001\u00ad\u0001\u00ae\u0001\u00ae\u0001"+
                    "\u00ae\u0001\u00ae\u0001\u00ae\u0001\u00af\u0001\u00af\u0001\u00af\u0001"+
                    "\u00af\u0001\u00af\u0001\u00b0\u0001\u00b0\u0001\u00b0\u0001\u00b0\u0005"+
                    "\u00b0\u0709\b\u00b0\n\u00b0\f\u00b0\u070c\t\u00b0\u0001\u00b0\u0001\u00b0"+
                    "\u0001\u00b0\u0001\u00b1\u0001\u00b1\u0001\u00b1\u0001\u00b1\u0001\u00b1"+
                    "\u0001\u00b2\u0001\u00b2\u0001\u00b2\u0001\u00b2\u0001\u00b2\u0001\u00b3"+
                    "\u0001\u00b3\u0001\u00b3\u0001\u00b3\u0001\u00b3\u0001\u00b4\u0005\u00b4"+
                    "\u0721\b\u00b4\n\u00b4\f\u00b4\u0724\t\u00b4\u0001\u00b5\u0001\u00b5\u0001"+
                    "\u00b5\u0001\u00b5\u0001\u00b5\u0001\u00b5\u0001\u00b5\u0001\u00b5\u0001"+
                    "\u00b5\u0001\u00b5\u0001\u00b5\u0001\u00b5\u0001\u00b6\u0001\u00b6\u0001"+
                    "\u00b6\u0001\u00b6\u0001\u00b6\u0001\u00b6\u0001\u00b6\u0001\u00b6\u0001"+
                    "\u00b6\u0001\u00b6\u0001\u00b6\u0001\u00b6\u0001\u00b6\u0001\u00b6\u0001"+
                    "\u00b6\u0001\u00b6\u0001\u00b6\u0001\u00b6\u0001\u00b6\u0001\u00b6\u0001"+
                    "\u00b6\u0001\u00b6\u0001\u00b6\u0001\u00b6\u0001\u00b6\u0001\u00b6\u0003"+
                    "\u00b6\u074c\b\u00b6\u0001\u00b6\u0001\u00b6\u0005\u00b6\u0750\b\u00b6"+
                    "\n\u00b6\f\u00b6\u0753\t\u00b6\u0001\u00b6\u0003\u00b6\u0756\b\u00b6\u0001"+
                    "\u00b6\u0001\u00b6\u0001\u00b6\u0003\u00b6\u075b\b\u00b6\u0001\u00b7\u0001"+
                    "\u00b7\u0001\u00b7\u0001\u00b7\u0001\u00b7\u0001\u00b8\u0001\u00b8\u0001"+
                    "\u00b8\u0001\u00b8\u0001\u00b8\u0001\u00b9\u0001\u00b9\u0001\u00b9\u0001"+
                    "\u00b9\u0001\u00b9\u0001\u00ba\u0001\u00ba\u0001\u00ba\u0001\u00ba\u0005"+
                    "\u00ba\u0770\b\u00ba\n\u00ba\f\u00ba\u0773\t\u00ba\u0001\u00ba\u0001\u00ba"+
                    "\u0001\u00ba\u0001\u00bb\u0001\u00bb\u0001\u00bb\u0001\u00bb\u0005\u00bb"+
                    "\u077c\b\u00bb\n\u00bb\f\u00bb\u077f\t\u00bb\u0001\u00bb\u0001\u00bb\u0001"+
                    "\u00bb\u0001\u00bc\u0001\u00bc\u0001\u00bc\u0001\u00bc\u0001\u00bc\u0001"+
                    "\u00bd\u0001\u00bd\u0001\u00bd\u0001\u00bd\u0001\u00bd\u0001\u00be\u0001"+
                    "\u00be\u0001\u00be\u0001\u00be\u0001\u00be\u0001\u00bf\u0001\u00bf\u0001"+
                    "\u00bf\u0001\u00bf\u0001\u00bf\u0001\u00bf\u0003\u00bf\u0799\b\u00bf\u0001"+
                    "\u00c0\u0001\u00c0\u0001\u00c0\u0003\u00c0\u079e\b\u00c0\u0001\u00c1\u0001"+
                    "\u00c1\u0001\u00c1\u0000\u0000\u00c2\u0000\u0002\u0004\u0006\b\n\f\u000e"+
                    "\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
                    "HJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
                    "\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
                    "\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
                    "\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4"+
                    "\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec"+
                    "\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104"+
                    "\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c"+
                    "\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134"+
                    "\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c"+
                    "\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164"+
                    "\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c"+
                    "\u017e\u0180\u0182\u0000\u0002\u0002\u0000\r\r\u0097\u0097\b\u0000\b\t"+
                    "\f\f\u000e\u0010\u0014\u001b\u001e#%,.\u0087\u0089\u0094\u0783\u0000\u0184"+
                    "\u0001\u0000\u0000\u0000\u0002\u0186\u0001\u0000\u0000\u0000\u0004\u018e"+
                    "\u0001\u0000\u0000\u0000\u0006\u0193\u0001\u0000\u0000\u0000\b\u0199\u0001"+
                    "\u0000\u0000\u0000\n\u019e\u0001\u0000\u0000\u0000\f\u01e7\u0001\u0000"+
                    "\u0000\u0000\u000e\u01ed\u0001\u0000\u0000\u0000\u0010\u01f2\u0001\u0000"+
                    "\u0000\u0000\u0012\u01f7\u0001\u0000\u0000\u0000\u0014\u01fc\u0001\u0000"+
                    "\u0000\u0000\u0016\u0201\u0001\u0000\u0000\u0000\u0018\u0206\u0001\u0000"+
                    "\u0000\u0000\u001a\u020b\u0001\u0000\u0000\u0000\u001c\u0210\u0001\u0000"+
                    "\u0000\u0000\u001e\u0215\u0001\u0000\u0000\u0000 \u021a\u0001\u0000\u0000"+
                    "\u0000\"\u021f\u0001\u0000\u0000\u0000$\u0224\u0001\u0000\u0000\u0000"+
                    "&\u0229\u0001\u0000\u0000\u0000(\u022e\u0001\u0000\u0000\u0000*\u0233"+
                    "\u0001\u0000\u0000\u0000,\u0238\u0001\u0000\u0000\u0000.\u023d\u0001\u0000"+
                    "\u0000\u00000\u0242\u0001\u0000\u0000\u00002\u0247\u0001\u0000\u0000\u0000"+
                    "4\u024c\u0001\u0000\u0000\u00006\u0251\u0001\u0000\u0000\u00008\u0256"+
                    "\u0001\u0000\u0000\u0000:\u025b\u0001\u0000\u0000\u0000<\u0260\u0001\u0000"+
                    "\u0000\u0000>\u0265\u0001\u0000\u0000\u0000@\u0269\u0001\u0000\u0000\u0000"+
                    "B\u027d\u0001\u0000\u0000\u0000D\u0293\u0001\u0000\u0000\u0000F\u02a8"+
                    "\u0001\u0000\u0000\u0000H\u02b5\u0001\u0000\u0000\u0000J\u02c0\u0001\u0000"+
                    "\u0000\u0000L\u02d3\u0001\u0000\u0000\u0000N\u030d\u0001\u0000\u0000\u0000"+
                    "P\u0317\u0001\u0000\u0000\u0000R\u0338\u0001\u0000\u0000\u0000T\u0342"+
                    "\u0001\u0000\u0000\u0000V\u035f\u0001\u0000\u0000\u0000X\u036f\u0001\u0000"+
                    "\u0000\u0000Z\u0399\u0001\u0000\u0000\u0000\\\u03a7\u0001\u0000\u0000"+
                    "\u0000^\u03b1\u0001\u0000\u0000\u0000`\u03d2\u0001\u0000\u0000\u0000b"+
                    "\u03e3\u0001\u0000\u0000\u0000d\u03ed\u0001\u0000\u0000\u0000f\u0406\u0001"+
                    "\u0000\u0000\u0000h\u0413\u0001\u0000\u0000\u0000j\u041f\u0001\u0000\u0000"+
                    "\u0000l\u042b\u0001\u0000\u0000\u0000n\u0434\u0001\u0000\u0000\u0000p"+
                    "\u043f\u0001\u0000\u0000\u0000r\u044e\u0001\u0000\u0000\u0000t\u0453\u0001"+
                    "\u0000\u0000\u0000v\u0458\u0001\u0000\u0000\u0000x\u045d\u0001\u0000\u0000"+
                    "\u0000z\u0462\u0001\u0000\u0000\u0000|\u0467\u0001\u0000\u0000\u0000~"+
                    "\u046c\u0001\u0000\u0000\u0000\u0080\u0471\u0001\u0000\u0000\u0000\u0082"+
                    "\u0476\u0001\u0000\u0000\u0000\u0084\u047b\u0001\u0000\u0000\u0000\u0086"+
                    "\u0480\u0001\u0000\u0000\u0000\u0088\u0485\u0001\u0000\u0000\u0000\u008a"+
                    "\u048a\u0001\u0000\u0000\u0000\u008c\u048f\u0001\u0000\u0000\u0000\u008e"+
                    "\u0494\u0001\u0000\u0000\u0000\u0090\u0499\u0001\u0000\u0000\u0000\u0092"+
                    "\u049e\u0001\u0000\u0000\u0000\u0094\u04a3\u0001\u0000\u0000\u0000\u0096"+
                    "\u04a8\u0001\u0000\u0000\u0000\u0098\u04ad\u0001\u0000\u0000\u0000\u009a"+
                    "\u04b2\u0001\u0000\u0000\u0000\u009c\u04b7\u0001\u0000\u0000\u0000\u009e"+
                    "\u04bc\u0001\u0000\u0000\u0000\u00a0\u04c1\u0001\u0000\u0000\u0000\u00a2"+
                    "\u04c6\u0001\u0000\u0000\u0000\u00a4\u04cb\u0001\u0000\u0000\u0000\u00a6"+
                    "\u04d0\u0001\u0000\u0000\u0000\u00a8\u04d5\u0001\u0000\u0000\u0000\u00aa"+
                    "\u04da\u0001\u0000\u0000\u0000\u00ac\u04df\u0001\u0000\u0000\u0000\u00ae"+
                    "\u04e4\u0001\u0000\u0000\u0000\u00b0\u04e9\u0001\u0000\u0000\u0000\u00b2"+
                    "\u04ee\u0001\u0000\u0000\u0000\u00b4\u04f3\u0001\u0000\u0000\u0000\u00b6"+
                    "\u04f8\u0001\u0000\u0000\u0000\u00b8\u04fd\u0001\u0000\u0000\u0000\u00ba"+
                    "\u0502\u0001\u0000\u0000\u0000\u00bc\u0507\u0001\u0000\u0000\u0000\u00be"+
                    "\u050c\u0001\u0000\u0000\u0000\u00c0\u0511\u0001\u0000\u0000\u0000\u00c2"+
                    "\u0516\u0001\u0000\u0000\u0000\u00c4\u051b\u0001\u0000\u0000\u0000\u00c6"+
                    "\u0520\u0001\u0000\u0000\u0000\u00c8\u0525\u0001\u0000\u0000\u0000\u00ca"+
                    "\u052a\u0001\u0000\u0000\u0000\u00cc\u052f\u0001\u0000\u0000\u0000\u00ce"+
                    "\u0534\u0001\u0000\u0000\u0000\u00d0\u0540\u0001\u0000\u0000\u0000\u00d2"+
                    "\u0545\u0001\u0000\u0000\u0000\u00d4\u054a\u0001\u0000\u0000\u0000\u00d6"+
                    "\u054f\u0001\u0000\u0000\u0000\u00d8\u0554\u0001\u0000\u0000\u0000\u00da"+
                    "\u0559\u0001\u0000\u0000\u0000\u00dc\u055e\u0001\u0000\u0000\u0000\u00de"+
                    "\u0563\u0001\u0000\u0000\u0000\u00e0\u0568\u0001\u0000\u0000\u0000\u00e2"+
                    "\u0582\u0001\u0000\u0000\u0000\u00e4\u0584\u0001\u0000\u0000\u0000\u00e6"+
                    "\u058e\u0001\u0000\u0000\u0000\u00e8\u0593\u0001\u0000\u0000\u0000\u00ea"+
                    "\u0598\u0001\u0000\u0000\u0000\u00ec\u059d\u0001\u0000\u0000\u0000\u00ee"+
                    "\u05a2\u0001\u0000\u0000\u0000\u00f0\u05a7\u0001\u0000\u0000\u0000\u00f2"+
                    "\u05ac\u0001\u0000\u0000\u0000\u00f4\u05b1\u0001\u0000\u0000\u0000\u00f6"+
                    "\u05b6\u0001\u0000\u0000\u0000\u00f8\u05bb\u0001\u0000\u0000\u0000\u00fa"+
                    "\u05c0\u0001\u0000\u0000\u0000\u00fc\u05c5\u0001\u0000\u0000\u0000\u00fe"+
                    "\u05ca\u0001\u0000\u0000\u0000\u0100\u05cf\u0001\u0000\u0000\u0000\u0102"+
                    "\u05d4\u0001\u0000\u0000\u0000\u0104\u05d9\u0001\u0000\u0000\u0000\u0106"+
                    "\u05de\u0001\u0000\u0000\u0000\u0108\u05e3\u0001\u0000\u0000\u0000\u010a"+
                    "\u05e8\u0001\u0000\u0000\u0000\u010c\u05ed\u0001\u0000\u0000\u0000\u010e"+
                    "\u05f2\u0001\u0000\u0000\u0000\u0110\u05f7\u0001\u0000\u0000\u0000\u0112"+
                    "\u05fc\u0001\u0000\u0000\u0000\u0114\u061d\u0001\u0000\u0000\u0000\u0116"+
                    "\u0622\u0001\u0000\u0000\u0000\u0118\u0627\u0001\u0000\u0000\u0000\u011a"+
                    "\u062c\u0001\u0000\u0000\u0000\u011c\u0631\u0001\u0000\u0000\u0000\u011e"+
                    "\u0636\u0001\u0000\u0000\u0000\u0120\u063b\u0001\u0000\u0000\u0000\u0122"+
                    "\u0640\u0001\u0000\u0000\u0000\u0124\u064c\u0001\u0000\u0000\u0000\u0126"+
                    "\u066a\u0001\u0000\u0000\u0000\u0128\u066f\u0001\u0000\u0000\u0000\u012a"+
                    "\u0674\u0001\u0000\u0000\u0000\u012c\u0679\u0001\u0000\u0000\u0000\u012e"+
                    "\u067e\u0001\u0000\u0000\u0000\u0130\u0683\u0001\u0000\u0000\u0000\u0132"+
                    "\u0688\u0001\u0000\u0000\u0000\u0134\u068d\u0001\u0000\u0000\u0000\u0136"+
                    "\u0692\u0001\u0000\u0000\u0000\u0138\u0697\u0001\u0000\u0000\u0000\u013a"+
                    "\u069c\u0001\u0000\u0000\u0000\u013c\u06a1\u0001\u0000\u0000\u0000\u013e"+
                    "\u06a6\u0001\u0000\u0000\u0000\u0140\u06b7\u0001\u0000\u0000\u0000\u0142"+
                    "\u06b9\u0001\u0000\u0000\u0000\u0144\u06be\u0001\u0000\u0000\u0000\u0146"+
                    "\u06c3\u0001\u0000\u0000\u0000\u0148\u06c8\u0001\u0000\u0000\u0000\u014a"+
                    "\u06cd\u0001\u0000\u0000\u0000\u014c\u06d2\u0001\u0000\u0000\u0000\u014e"+
                    "\u06d7\u0001\u0000\u0000\u0000\u0150\u06dc\u0001\u0000\u0000\u0000\u0152"+
                    "\u06e1\u0001\u0000\u0000\u0000\u0154\u06e6\u0001\u0000\u0000\u0000\u0156"+
                    "\u06eb\u0001\u0000\u0000\u0000\u0158\u06f0\u0001\u0000\u0000\u0000\u015a"+
                    "\u06f5\u0001\u0000\u0000\u0000\u015c\u06fa\u0001\u0000\u0000\u0000\u015e"+
                    "\u06ff\u0001\u0000\u0000\u0000\u0160\u0704\u0001\u0000\u0000\u0000\u0162"+
                    "\u0710\u0001\u0000\u0000\u0000\u0164\u0715\u0001\u0000\u0000\u0000\u0166"+
                    "\u071a\u0001\u0000\u0000\u0000\u0168\u0722\u0001\u0000\u0000\u0000\u016a"+
                    "\u0725\u0001\u0000\u0000\u0000\u016c\u075a\u0001\u0000\u0000\u0000\u016e"+
                    "\u075c\u0001\u0000\u0000\u0000\u0170\u0761\u0001\u0000\u0000\u0000\u0172"+
                    "\u0766\u0001\u0000\u0000\u0000\u0174\u076b\u0001\u0000\u0000\u0000\u0176"+
                    "\u0777\u0001\u0000\u0000\u0000\u0178\u0783\u0001\u0000\u0000\u0000\u017a"+
                    "\u0788\u0001\u0000\u0000\u0000\u017c\u078d\u0001\u0000\u0000\u0000\u017e"+
                    "\u0798\u0001\u0000\u0000\u0000\u0180\u079d\u0001\u0000\u0000\u0000\u0182"+
                    "\u079f\u0001\u0000\u0000\u0000\u0184\u0185\u0003\u0002\u0001\u0000\u0185"+
                    "\u0001\u0001\u0000\u0000\u0000\u0186\u0187\u0005\u0001\u0000\u0000\u0187"+
                    "\u0188\u0003\u0004\u0002\u0000\u0188\u0189\u0003\u0006\u0003\u0000\u0189"+
                    "\u018a\u0003\b\u0004\u0000\u018a\u018b\u0003\n\u0005\u0000\u018b\u018c"+
                    "\u0003\f\u0006\u0000\u018c\u018d\u0005\u0002\u0000\u0000\u018d\u0003\u0001"+
                    "\u0000\u0000\u0000\u018e\u018f\u0005\b\u0000\u0000\u018f\u0190\u0005\u0003"+
                    "\u0000\u0000\u0190\u0191\u0005\r\u0000\u0000\u0191\u0192\u0005\u0004\u0000"+
                    "\u0000\u0192\u0005\u0001\u0000\u0000\u0000\u0193\u0194\u0005\t\u0000\u0000"+
                    "\u0194\u0195\u0005\u0003\u0000\u0000\u0195\u0196\u0005\u0001\u0000\u0000"+
                    "\u0196\u0197\u0005\u0002\u0000\u0000\u0197\u0198\u0005\u0004\u0000\u0000"+
                    "\u0198\u0007\u0001\u0000\u0000\u0000\u0199\u019a\u0005\u000e\u0000\u0000"+
                    "\u019a\u019b\u0005\u0003\u0000\u0000\u019b\u019c\u0005\r\u0000\u0000\u019c"+
                    "\u019d\u0005\u0004\u0000\u0000\u019d\t\u0001\u0000\u0000\u0000\u019e\u019f"+
                    "\u0005\u000f\u0000\u0000\u019f\u01a0\u0005\u0003\u0000\u0000\u01a0\u01a2"+
                    "\u0005\u0001\u0000\u0000\u01a1\u01a3\u0003\u000e\u0007\u0000\u01a2\u01a1"+
                    "\u0001\u0000\u0000\u0000\u01a2\u01a3\u0001\u0000\u0000\u0000\u01a3\u01a5"+
                    "\u0001\u0000\u0000\u0000\u01a4\u01a6\u0003\u0010\b\u0000\u01a5\u01a4\u0001"+
                    "\u0000\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6\u01a8\u0001"+
                    "\u0000\u0000\u0000\u01a7\u01a9\u0003\u0012\t\u0000\u01a8\u01a7\u0001\u0000"+
                    "\u0000\u0000\u01a8\u01a9\u0001\u0000\u0000\u0000\u01a9\u01ab\u0001\u0000"+
                    "\u0000\u0000\u01aa\u01ac\u0003\u0014\n\u0000\u01ab\u01aa\u0001\u0000\u0000"+
                    "\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000\u01ac\u01ae\u0001\u0000\u0000"+
                    "\u0000\u01ad\u01af\u0003\u0016\u000b\u0000\u01ae\u01ad\u0001\u0000\u0000"+
                    "\u0000\u01ae\u01af\u0001\u0000\u0000\u0000\u01af\u01b1\u0001\u0000\u0000"+
                    "\u0000\u01b0\u01b2\u0003\u0018\f\u0000\u01b1\u01b0\u0001\u0000\u0000\u0000"+
                    "\u01b1\u01b2\u0001\u0000\u0000\u0000\u01b2\u01b4\u0001\u0000\u0000\u0000"+
                    "\u01b3\u01b5\u0003\u001a\r\u0000\u01b4\u01b3\u0001\u0000\u0000\u0000\u01b4"+
                    "\u01b5\u0001\u0000\u0000\u0000\u01b5\u01b7\u0001\u0000\u0000\u0000\u01b6"+
                    "\u01b8\u0003\u001c\u000e\u0000\u01b7\u01b6\u0001\u0000\u0000\u0000\u01b7"+
                    "\u01b8\u0001\u0000\u0000\u0000\u01b8\u01b9\u0001\u0000\u0000\u0000\u01b9"+
                    "\u01bb\u0003\u001e\u000f\u0000\u01ba\u01bc\u0003 \u0010\u0000\u01bb\u01ba"+
                    "\u0001\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000\u0000\u0000\u01bc\u01be"+
                    "\u0001\u0000\u0000\u0000\u01bd\u01bf\u0003$\u0012\u0000\u01be\u01bd\u0001"+
                    "\u0000\u0000\u0000\u01be\u01bf\u0001\u0000\u0000\u0000\u01bf\u01c1\u0001"+
                    "\u0000\u0000\u0000\u01c0\u01c2\u0003\"\u0011\u0000\u01c1\u01c0\u0001\u0000"+
                    "\u0000\u0000\u01c1\u01c2\u0001\u0000\u0000\u0000\u01c2\u01c3\u0001\u0000"+
                    "\u0000\u0000\u01c3\u01c5\u0003&\u0013\u0000\u01c4\u01c6\u0003(\u0014\u0000"+
                    "\u01c5\u01c4\u0001\u0000\u0000\u0000\u01c5\u01c6\u0001\u0000\u0000\u0000"+
                    "\u01c6\u01c8\u0001\u0000\u0000\u0000\u01c7\u01c9\u0003*\u0015\u0000\u01c8"+
                    "\u01c7\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000\u0000\u01c9"+
                    "\u01cb\u0001\u0000\u0000\u0000\u01ca\u01cc\u0003,\u0016\u0000\u01cb\u01ca"+
                    "\u0001\u0000\u0000\u0000\u01cb\u01cc\u0001\u0000\u0000\u0000\u01cc\u01ce"+
                    "\u0001\u0000\u0000\u0000\u01cd\u01cf\u0003.\u0017\u0000\u01ce\u01cd\u0001"+
                    "\u0000\u0000\u0000\u01ce\u01cf\u0001\u0000\u0000\u0000\u01cf\u01d1\u0001"+
                    "\u0000\u0000\u0000\u01d0\u01d2\u00030\u0018\u0000\u01d1\u01d0\u0001\u0000"+
                    "\u0000\u0000\u01d1\u01d2\u0001\u0000\u0000\u0000\u01d2\u01d4\u0001\u0000"+
                    "\u0000\u0000\u01d3\u01d5\u00032\u0019\u0000\u01d4\u01d3\u0001\u0000\u0000"+
                    "\u0000\u01d4\u01d5\u0001\u0000\u0000\u0000\u01d5\u01d7\u0001\u0000\u0000"+
                    "\u0000\u01d6\u01d8\u00034\u001a\u0000\u01d7\u01d6\u0001\u0000\u0000\u0000"+
                    "\u01d7\u01d8\u0001\u0000\u0000\u0000\u01d8\u01d9\u0001\u0000\u0000\u0000"+
                    "\u01d9\u01da\u00036\u001b\u0000\u01da\u01dc\u00038\u001c\u0000\u01db\u01dd"+
                    "\u0003:\u001d\u0000\u01dc\u01db\u0001\u0000\u0000\u0000\u01dc\u01dd\u0001"+
                    "\u0000\u0000\u0000\u01dd\u01df\u0001\u0000\u0000\u0000\u01de\u01e0\u0003"+
                    "<\u001e\u0000\u01df\u01de\u0001\u0000\u0000\u0000\u01df\u01e0\u0001\u0000"+
                    "\u0000\u0000\u01e0\u01e2\u0001\u0000\u0000\u0000\u01e1\u01e3\u0003>\u001f"+
                    "\u0000\u01e2\u01e1\u0001\u0000\u0000\u0000\u01e2\u01e3\u0001\u0000\u0000"+
                    "\u0000\u01e3\u01e4\u0001\u0000\u0000\u0000\u01e4\u01e5\u0005\u0002\u0000"+
                    "\u0000\u01e5\u01e6\u0005\u0004\u0000\u0000\u01e6\u000b\u0001\u0000\u0000"+
                    "\u0000\u01e7\u01e8\u0005\u0010\u0000\u0000\u01e8\u01e9\u0005\u0003\u0000"+
                    "\u0000\u01e9\u01ea\u0005\u0095\u0000\u0000\u01ea\u01eb\u0005\u0004\u0000"+
                    "\u0000\u01eb\r\u0001\u0000\u0000\u0000\u01ec\u01ee\u0003@ \u0000\u01ed"+
                    "\u01ec\u0001\u0000\u0000\u0000\u01ee\u01ef\u0001\u0000\u0000\u0000\u01ef"+
                    "\u01ed\u0001\u0000\u0000\u0000\u01ef\u01f0\u0001\u0000\u0000\u0000\u01f0"+
                    "\u000f\u0001\u0000\u0000\u0000\u01f1\u01f3\u0003B!\u0000\u01f2\u01f1\u0001"+
                    "\u0000\u0000\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4\u01f2\u0001"+
                    "\u0000\u0000\u0000\u01f4\u01f5\u0001\u0000\u0000\u0000\u01f5\u0011\u0001"+
                    "\u0000\u0000\u0000\u01f6\u01f8\u0003D\"\u0000\u01f7\u01f6\u0001\u0000"+
                    "\u0000\u0000\u01f8\u01f9\u0001\u0000\u0000\u0000\u01f9\u01f7\u0001\u0000"+
                    "\u0000\u0000\u01f9\u01fa\u0001\u0000\u0000\u0000\u01fa\u0013\u0001\u0000"+
                    "\u0000\u0000\u01fb\u01fd\u0003F#\u0000\u01fc\u01fb\u0001\u0000\u0000\u0000"+
                    "\u01fd\u01fe\u0001\u0000\u0000\u0000\u01fe\u01fc\u0001\u0000\u0000\u0000"+
                    "\u01fe\u01ff\u0001\u0000\u0000\u0000\u01ff\u0015\u0001\u0000\u0000\u0000"+
                    "\u0200\u0202\u0003H$\u0000\u0201\u0200\u0001\u0000\u0000\u0000\u0202\u0203"+
                    "\u0001\u0000\u0000\u0000\u0203\u0201\u0001\u0000\u0000\u0000\u0203\u0204"+
                    "\u0001\u0000\u0000\u0000\u0204\u0017\u0001\u0000\u0000\u0000\u0205\u0207"+
                    "\u0003J%\u0000\u0206\u0205\u0001\u0000\u0000\u0000\u0207\u0208\u0001\u0000"+
                    "\u0000\u0000\u0208\u0206\u0001\u0000\u0000\u0000\u0208\u0209\u0001\u0000"+
                    "\u0000\u0000\u0209\u0019\u0001\u0000\u0000\u0000\u020a\u020c\u0003L&\u0000"+
                    "\u020b\u020a\u0001\u0000\u0000\u0000\u020c\u020d\u0001\u0000\u0000\u0000"+
                    "\u020d\u020b\u0001\u0000\u0000\u0000\u020d\u020e\u0001\u0000\u0000\u0000"+
                    "\u020e\u001b\u0001\u0000\u0000\u0000\u020f\u0211\u0003N\'\u0000\u0210"+
                    "\u020f\u0001\u0000\u0000\u0000\u0211\u0212\u0001\u0000\u0000\u0000\u0212"+
                    "\u0210\u0001\u0000\u0000\u0000\u0212\u0213\u0001\u0000\u0000\u0000\u0213"+
                    "\u001d\u0001\u0000\u0000\u0000\u0214\u0216\u0003P(\u0000\u0215\u0214\u0001"+
                    "\u0000\u0000\u0000\u0216\u0217\u0001\u0000\u0000\u0000\u0217\u0215\u0001"+
                    "\u0000\u0000\u0000\u0217\u0218\u0001\u0000\u0000\u0000\u0218\u001f\u0001"+
                    "\u0000\u0000\u0000\u0219\u021b\u0003R)\u0000\u021a\u0219\u0001\u0000\u0000"+
                    "\u0000\u021b\u021c\u0001\u0000\u0000\u0000\u021c\u021a\u0001\u0000\u0000"+
                    "\u0000\u021c\u021d\u0001\u0000\u0000\u0000\u021d!\u0001\u0000\u0000\u0000"+
                    "\u021e\u0220\u0003T*\u0000\u021f\u021e\u0001\u0000\u0000\u0000\u0220\u0221"+
                    "\u0001\u0000\u0000\u0000\u0221\u021f\u0001\u0000\u0000\u0000\u0221\u0222"+
                    "\u0001\u0000\u0000\u0000\u0222#\u0001\u0000\u0000\u0000\u0223\u0225\u0003"+
                    "V+\u0000\u0224\u0223\u0001\u0000\u0000\u0000\u0225\u0226\u0001\u0000\u0000"+
                    "\u0000\u0226\u0224\u0001\u0000\u0000\u0000\u0226\u0227\u0001\u0000\u0000"+
                    "\u0000\u0227%\u0001\u0000\u0000\u0000\u0228\u022a\u0003X,\u0000\u0229"+
                    "\u0228\u0001\u0000\u0000\u0000\u022a\u022b\u0001\u0000\u0000\u0000\u022b"+
                    "\u0229\u0001\u0000\u0000\u0000\u022b\u022c\u0001\u0000\u0000\u0000\u022c"+
                    "\'\u0001\u0000\u0000\u0000\u022d\u022f\u0003Z-\u0000\u022e\u022d\u0001"+
                    "\u0000\u0000\u0000\u022f\u0230\u0001\u0000\u0000\u0000\u0230\u022e\u0001"+
                    "\u0000\u0000\u0000\u0230\u0231\u0001\u0000\u0000\u0000\u0231)\u0001\u0000"+
                    "\u0000\u0000\u0232\u0234\u0003\\.\u0000\u0233\u0232\u0001\u0000\u0000"+
                    "\u0000\u0234\u0235\u0001\u0000\u0000\u0000\u0235\u0233\u0001\u0000\u0000"+
                    "\u0000\u0235\u0236\u0001\u0000\u0000\u0000\u0236+\u0001\u0000\u0000\u0000"+
                    "\u0237\u0239\u0003^/\u0000\u0238\u0237\u0001\u0000\u0000\u0000\u0239\u023a"+
                    "\u0001\u0000\u0000\u0000\u023a\u0238\u0001\u0000\u0000\u0000\u023a\u023b"+
                    "\u0001\u0000\u0000\u0000\u023b-\u0001\u0000\u0000\u0000\u023c\u023e\u0003"+
                    "`0\u0000\u023d\u023c\u0001\u0000\u0000\u0000\u023e\u023f\u0001\u0000\u0000"+
                    "\u0000\u023f\u023d\u0001\u0000\u0000\u0000\u023f\u0240\u0001\u0000\u0000"+
                    "\u0000\u0240/\u0001\u0000\u0000\u0000\u0241\u0243\u0003b1\u0000\u0242"+
                    "\u0241\u0001\u0000\u0000\u0000\u0243\u0244\u0001\u0000\u0000\u0000\u0244"+
                    "\u0242\u0001\u0000\u0000\u0000\u0244\u0245\u0001\u0000\u0000\u0000\u0245"+
                    "1\u0001\u0000\u0000\u0000\u0246\u0248\u0003d2\u0000\u0247\u0246\u0001"+
                    "\u0000\u0000\u0000\u0248\u0249\u0001\u0000\u0000\u0000\u0249\u0247\u0001"+
                    "\u0000\u0000\u0000\u0249\u024a\u0001\u0000\u0000\u0000\u024a3\u0001\u0000"+
                    "\u0000\u0000\u024b\u024d\u0003f3\u0000\u024c\u024b\u0001\u0000\u0000\u0000"+
                    "\u024d\u024e\u0001\u0000\u0000\u0000\u024e\u024c\u0001\u0000\u0000\u0000"+
                    "\u024e\u024f\u0001\u0000\u0000\u0000\u024f5\u0001\u0000\u0000\u0000\u0250"+
                    "\u0252\u0003h4\u0000\u0251\u0250\u0001\u0000\u0000\u0000\u0252\u0253\u0001"+
                    "\u0000\u0000\u0000\u0253\u0251\u0001\u0000\u0000\u0000\u0253\u0254\u0001"+
                    "\u0000\u0000\u0000\u02547\u0001\u0000\u0000\u0000\u0255\u0257\u0003j5"+
                    "\u0000\u0256\u0255\u0001\u0000\u0000\u0000\u0257\u0258\u0001\u0000\u0000"+
                    "\u0000\u0258\u0256\u0001\u0000\u0000\u0000\u0258\u0259\u0001\u0000\u0000"+
                    "\u0000\u02599\u0001\u0000\u0000\u0000\u025a\u025c\u0003l6\u0000\u025b"+
                    "\u025a\u0001\u0000\u0000\u0000\u025c\u025d\u0001\u0000\u0000\u0000\u025d"+
                    "\u025b\u0001\u0000\u0000\u0000\u025d\u025e\u0001\u0000\u0000\u0000\u025e"+
                    ";\u0001\u0000\u0000\u0000\u025f\u0261\u0003n7\u0000\u0260\u025f\u0001"+
                    "\u0000\u0000\u0000\u0261\u0262\u0001\u0000\u0000\u0000\u0262\u0260\u0001"+
                    "\u0000\u0000\u0000\u0262\u0263\u0001\u0000\u0000\u0000\u0263=\u0001\u0000"+
                    "\u0000\u0000\u0264\u0266\u0003p8\u0000\u0265\u0264\u0001\u0000\u0000\u0000"+
                    "\u0266\u0267\u0001\u0000\u0000\u0000\u0267\u0265\u0001\u0000\u0000\u0000"+
                    "\u0267\u0268\u0001\u0000\u0000\u0000\u0268?\u0001\u0000\u0000\u0000\u0269"+
                    "\u026a\u0005\u0095\u0000\u0000\u026a\u026b\u0005\u0003\u0000\u0000\u026b"+
                    "\u026c\u0005\u0001\u0000\u0000\u026c\u026d\u0003r9\u0000\u026d\u026e\u0003"+
                    "\u00e6s\u0000\u026e\u0270\u0003\u00e8t\u0000\u026f\u0271\u0003\u0160\u00b0"+
                    "\u0000\u0270\u026f\u0001\u0000\u0000\u0000\u0270\u0271\u0001\u0000\u0000"+
                    "\u0000\u0271\u0273\u0001\u0000\u0000\u0000\u0272\u0274\u0003\u00b4Z\u0000"+
                    "\u0273\u0272\u0001\u0000\u0000\u0000\u0273\u0274\u0001\u0000\u0000\u0000"+
                    "\u0274\u0275\u0001\u0000\u0000\u0000\u0275\u0276\u0003\u00f4z\u0000\u0276"+
                    "\u0278\u0003\u00d4j\u0000\u0277\u0279\u0003\u00f6{\u0000\u0278\u0277\u0001"+
                    "\u0000\u0000\u0000\u0278\u0279\u0001\u0000\u0000\u0000\u0279\u027a\u0001"+
                    "\u0000\u0000\u0000\u027a\u027b\u0005\u0002\u0000\u0000\u027b\u027c\u0005"+
                    "\u0004\u0000\u0000\u027cA\u0001\u0000\u0000\u0000\u027d\u027e\u0005\u0095"+
                    "\u0000\u0000\u027e\u027f\u0005\u0003\u0000\u0000\u027f\u0280\u0005\u0001"+
                    "\u0000\u0000\u0280\u0282\u0003t:\u0000\u0281\u0283\u0003\u00a6S\u0000"+
                    "\u0282\u0281\u0001\u0000\u0000\u0000\u0282\u0283\u0001\u0000\u0000\u0000"+
                    "\u0283\u0285\u0001\u0000\u0000\u0000\u0284\u0286\u0003\u00c4b\u0000\u0285"+
                    "\u0284\u0001\u0000\u0000\u0000\u0285\u0286\u0001\u0000\u0000\u0000\u0286"+
                    "\u0288\u0001\u0000\u0000\u0000\u0287\u0289\u0003\u00c6c\u0000\u0288\u0287"+
                    "\u0001\u0000\u0000\u0000\u0288\u0289\u0001\u0000\u0000\u0000\u0289\u028b"+
                    "\u0001\u0000\u0000\u0000\u028a\u028c\u0003\u00a8T\u0000\u028b\u028a\u0001"+
                    "\u0000\u0000\u0000\u028b\u028c\u0001\u0000\u0000\u0000\u028c\u028e\u0001"+
                    "\u0000\u0000\u0000\u028d\u028f\u0003\u0174\u00ba\u0000\u028e\u028d\u0001"+
                    "\u0000\u0000\u0000\u028e\u028f\u0001\u0000\u0000\u0000\u028f\u0290\u0001"+
                    "\u0000\u0000\u0000\u0290\u0291\u0005\u0002\u0000\u0000\u0291\u0292\u0005"+
                    "\u0004\u0000\u0000\u0292C\u0001\u0000\u0000\u0000\u0293\u0294\u0005\u0095"+
                    "\u0000\u0000\u0294\u0295\u0005\u0003\u0000\u0000\u0295\u0296\u0005\u0001"+
                    "\u0000\u0000\u0296\u0297\u0003v;\u0000\u0297\u0299\u0003\u0104\u0082\u0000"+
                    "\u0298\u029a\u0003\u0106\u0083\u0000\u0299\u0298\u0001\u0000\u0000\u0000"+
                    "\u0299\u029a\u0001\u0000\u0000\u0000\u029a\u029b\u0001\u0000\u0000\u0000"+
                    "\u029b\u029c\u0003\u015a\u00ad\u0000\u029c\u029d\u0003\u0108\u0084\u0000"+
                    "\u029d\u029e\u0003\u010a\u0085\u0000\u029e\u02a0\u0003\u010c\u0086\u0000"+
                    "\u029f\u02a1\u0003\u010e\u0087\u0000\u02a0\u029f\u0001\u0000\u0000\u0000"+
                    "\u02a0\u02a1\u0001\u0000\u0000\u0000\u02a1\u02a3\u0001\u0000\u0000\u0000"+
                    "\u02a2\u02a4\u0003\u0110\u0088\u0000\u02a3\u02a2\u0001\u0000\u0000\u0000"+
                    "\u02a3\u02a4\u0001\u0000\u0000\u0000\u02a4\u02a5\u0001\u0000\u0000\u0000"+
                    "\u02a5\u02a6\u0005\u0002\u0000\u0000\u02a6\u02a7\u0005\u0004\u0000\u0000"+
                    "\u02a7E\u0001\u0000\u0000\u0000\u02a8\u02a9\u0005\u0095\u0000\u0000\u02a9"+
                    "\u02aa\u0005\u0003\u0000\u0000\u02aa\u02ab\u0005\u0001\u0000\u0000\u02ab"+
                    "\u02ad\u0003x<\u0000\u02ac\u02ae\u0003\u0160\u00b0\u0000\u02ad\u02ac\u0001"+
                    "\u0000\u0000\u0000\u02ad\u02ae\u0001\u0000\u0000\u0000\u02ae\u02b0\u0001"+
                    "\u0000\u0000\u0000\u02af\u02b1\u0003\u00d4j\u0000\u02b0\u02af\u0001\u0000"+
                    "\u0000\u0000\u02b0\u02b1\u0001\u0000\u0000\u0000\u02b1\u02b2\u0001\u0000"+
                    "\u0000\u0000\u02b2\u02b3\u0005\u0002\u0000\u0000\u02b3\u02b4\u0005\u0004"+
                    "\u0000\u0000\u02b4G\u0001\u0000\u0000\u0000\u02b5\u02b6\u0005\u0095\u0000"+
                    "\u0000\u02b6\u02b7\u0005\u0003\u0000\u0000\u02b7\u02b8\u0005\u0001\u0000"+
                    "\u0000\u02b8\u02b9\u0003z=\u0000\u02b9\u02ba\u0003\u00aaU\u0000\u02ba"+
                    "\u02bb\u0003\u00acV\u0000\u02bb\u02bc\u0003\u00aeW\u0000\u02bc\u02bd\u0003"+
                    "\u00b0X\u0000\u02bd\u02be\u0005\u0002\u0000\u0000\u02be\u02bf\u0005\u0004"+
                    "\u0000\u0000\u02bfI\u0001\u0000\u0000\u0000\u02c0\u02c1\u0005\u0095\u0000"+
                    "\u0000\u02c1\u02c2\u0005\u0003\u0000\u0000\u02c2\u02c3\u0005\u0001\u0000"+
                    "\u0000\u02c3\u02c4\u0003|>\u0000\u02c4\u02c6\u0003\u00dam\u0000\u02c5"+
                    "\u02c7\u0003\u0164\u00b2\u0000\u02c6\u02c5\u0001\u0000\u0000\u0000\u02c6"+
                    "\u02c7\u0001\u0000\u0000\u0000\u02c7\u02c8\u0001\u0000\u0000\u0000\u02c8"+
                    "\u02ca\u0003\u0166\u00b3\u0000\u02c9\u02cb\u0003\u00dcn\u0000\u02ca\u02c9"+
                    "\u0001\u0000\u0000\u0000\u02ca\u02cb\u0001\u0000\u0000\u0000\u02cb\u02cd"+
                    "\u0001\u0000\u0000\u0000\u02cc\u02ce\u0003\u00d4j\u0000\u02cd\u02cc\u0001"+
                    "\u0000\u0000\u0000\u02cd\u02ce\u0001\u0000\u0000\u0000\u02ce\u02cf\u0001"+
                    "\u0000\u0000\u0000\u02cf\u02d0\u0003\u00deo\u0000\u02d0\u02d1\u0005\u0002"+
                    "\u0000\u0000\u02d1\u02d2\u0005\u0004\u0000\u0000\u02d2K\u0001\u0000\u0000"+
                    "\u0000\u02d3\u02d4\u0005\u0095\u0000\u0000\u02d4\u02d5\u0005\u0003\u0000"+
                    "\u0000\u02d5\u02d6\u0005\u0001\u0000\u0000\u02d6\u02d8\u0003~?\u0000\u02d7"+
                    "\u02d9\u0003\u00b4Z\u0000\u02d8\u02d7\u0001\u0000\u0000\u0000\u02d8\u02d9"+
                    "\u0001\u0000\u0000\u0000\u02d9\u02db\u0001\u0000\u0000\u0000\u02da\u02dc"+
                    "\u0003\u00b2Y\u0000\u02db\u02da\u0001\u0000\u0000\u0000\u02db\u02dc\u0001"+
                    "\u0000\u0000\u0000\u02dc\u02de\u0001\u0000\u0000\u0000\u02dd\u02df\u0003"+
                    "\u00b6[\u0000\u02de\u02dd\u0001\u0000\u0000\u0000\u02de\u02df\u0001\u0000"+
                    "\u0000\u0000\u02df\u02e1\u0001\u0000\u0000\u0000\u02e0\u02e2\u0003\u00b2"+
                    "Y\u0000\u02e1\u02e0\u0001\u0000\u0000\u0000\u02e1\u02e2\u0001\u0000\u0000"+
                    "\u0000\u02e2\u02e4\u0001\u0000\u0000\u0000\u02e3\u02e5\u0003\u00ba]\u0000"+
                    "\u02e4\u02e3\u0001\u0000\u0000\u0000\u02e4\u02e5\u0001\u0000\u0000\u0000"+
                    "\u02e5\u02e7\u0001\u0000\u0000\u0000\u02e6\u02e8\u0003\u00bc^\u0000\u02e7"+
                    "\u02e6\u0001\u0000\u0000\u0000\u02e7\u02e8\u0001\u0000\u0000\u0000\u02e8"+
                    "\u02ea\u0001\u0000\u0000\u0000\u02e9\u02eb\u0003\u00b8\\\u0000\u02ea\u02e9"+
                    "\u0001\u0000\u0000\u0000\u02ea\u02eb\u0001\u0000\u0000\u0000\u02eb\u02ed"+
                    "\u0001\u0000\u0000\u0000\u02ec\u02ee\u0003\u00fc~\u0000\u02ed\u02ec\u0001"+
                    "\u0000\u0000\u0000\u02ed\u02ee\u0001\u0000\u0000\u0000\u02ee\u02f0\u0001"+
                    "\u0000\u0000\u0000\u02ef\u02f1\u0003\u00d4j\u0000\u02f0\u02ef\u0001\u0000"+
                    "\u0000\u0000\u02f0\u02f1\u0001\u0000\u0000\u0000\u02f1\u02f3\u0001\u0000"+
                    "\u0000\u0000\u02f2\u02f4\u0003\u00d6k\u0000\u02f3\u02f2\u0001\u0000\u0000"+
                    "\u0000\u02f3\u02f4\u0001\u0000\u0000\u0000\u02f4\u02f6\u0001\u0000\u0000"+
                    "\u0000\u02f5\u02f7\u0003\u0102\u0081\u0000\u02f6\u02f5\u0001\u0000\u0000"+
                    "\u0000\u02f6\u02f7\u0001\u0000\u0000\u0000\u02f7\u02f9\u0001\u0000\u0000"+
                    "\u0000\u02f8\u02fa\u0003\u0100\u0080\u0000\u02f9\u02f8\u0001\u0000\u0000"+
                    "\u0000\u02f9\u02fa\u0001\u0000\u0000\u0000\u02fa\u02fc\u0001\u0000\u0000"+
                    "\u0000\u02fb\u02fd\u0003\u00d8l\u0000\u02fc\u02fb\u0001\u0000\u0000\u0000"+
                    "\u02fc\u02fd\u0001\u0000\u0000\u0000\u02fd\u02ff\u0001\u0000\u0000\u0000"+
                    "\u02fe\u0300\u0003\u00be_\u0000\u02ff\u02fe\u0001\u0000\u0000\u0000\u02ff"+
                    "\u0300\u0001\u0000\u0000\u0000\u0300\u0302\u0001\u0000\u0000\u0000\u0301"+
                    "\u0303\u0003\u00fe\u007f\u0000\u0302\u0301\u0001\u0000\u0000\u0000\u0302"+
                    "\u0303\u0001\u0000\u0000\u0000\u0303\u0305\u0001\u0000\u0000\u0000\u0304"+
                    "\u0306\u0003\u00c0`\u0000\u0305\u0304\u0001\u0000\u0000\u0000\u0305\u0306"+
                    "\u0001\u0000\u0000\u0000\u0306\u0308\u0001\u0000\u0000\u0000\u0307\u0309"+
                    "\u0003\u00c2a\u0000\u0308\u0307\u0001\u0000\u0000\u0000\u0308\u0309\u0001"+
                    "\u0000\u0000\u0000\u0309\u030a\u0001\u0000\u0000\u0000\u030a\u030b\u0005"+
                    "\u0002\u0000\u0000\u030b\u030c\u0005\u0004\u0000\u0000\u030cM\u0001\u0000"+
                    "\u0000\u0000\u030d\u030e\u0005\u0095\u0000\u0000\u030e\u030f\u0005\u0003"+
                    "\u0000\u0000\u030f\u0310\u0005\u0001\u0000\u0000\u0310\u0311\u0003\u0080"+
                    "@\u0000\u0311\u0312\u0003\u00dam\u0000\u0312\u0313\u0003\u00dcn\u0000"+
                    "\u0313\u0314\u0003\u00deo\u0000\u0314\u0315\u0005\u0002\u0000\u0000\u0315"+
                    "\u0316\u0005\u0004\u0000\u0000\u0316O\u0001\u0000\u0000\u0000\u0317\u0318"+
                    "\u0005\u0095\u0000\u0000\u0318\u0319\u0005\u0003\u0000\u0000\u0319\u031a"+
                    "\u0005\u0001\u0000\u0000\u031a\u031b\u0003\u0082A\u0000\u031b\u031d\u0003"+
                    "\u00c8d\u0000\u031c\u031e\u0003\u00b4Z\u0000\u031d\u031c\u0001\u0000\u0000"+
                    "\u0000\u031d\u031e\u0001\u0000\u0000\u0000\u031e\u0320\u0001\u0000\u0000"+
                    "\u0000\u031f\u0321\u0003\u00bc^\u0000\u0320\u031f\u0001\u0000\u0000\u0000"+
                    "\u0320\u0321\u0001\u0000\u0000\u0000\u0321\u0323\u0001\u0000\u0000\u0000"+
                    "\u0322\u0324\u0003\u00ba]\u0000\u0323\u0322\u0001\u0000\u0000\u0000\u0323"+
                    "\u0324\u0001\u0000\u0000\u0000\u0324\u0326\u0001\u0000\u0000\u0000\u0325"+
                    "\u0327\u0003\u00d4j\u0000\u0326\u0325\u0001\u0000\u0000\u0000\u0326\u0327"+
                    "\u0001\u0000\u0000\u0000\u0327\u0329\u0001\u0000\u0000\u0000\u0328\u032a"+
                    "\u0003\u00d6k\u0000\u0329\u0328\u0001\u0000\u0000\u0000\u0329\u032a\u0001"+
                    "\u0000\u0000\u0000\u032a\u032b\u0001\u0000\u0000\u0000\u032b\u032d\u0003"+
                    "\u00d8l\u0000\u032c\u032e\u0003\u00be_\u0000\u032d\u032c\u0001\u0000\u0000"+
                    "\u0000\u032d\u032e\u0001\u0000\u0000\u0000\u032e\u0330\u0001\u0000\u0000"+
                    "\u0000\u032f\u0331\u0003\u00c0`\u0000\u0330\u032f\u0001\u0000\u0000\u0000"+
                    "\u0330\u0331\u0001\u0000\u0000\u0000\u0331\u0333\u0001\u0000\u0000\u0000"+
                    "\u0332\u0334\u0003\u00c2a\u0000\u0333\u0332\u0001\u0000\u0000\u0000\u0333"+
                    "\u0334\u0001\u0000\u0000\u0000\u0334\u0335\u0001\u0000\u0000\u0000\u0335"+
                    "\u0336\u0005\u0002\u0000\u0000\u0336\u0337\u0005\u0004\u0000\u0000\u0337"+
                    "Q\u0001\u0000\u0000\u0000\u0338\u0339\u0005\u0095\u0000\u0000\u0339\u033a"+
                    "\u0005\u0003\u0000\u0000\u033a\u033b\u0005\u0001\u0000\u0000\u033b\u033c"+
                    "\u0003\u0084B\u0000\u033c\u033d\u0003\u00dam\u0000\u033d\u033e\u0003\u00dc"+
                    "n\u0000\u033e\u033f\u0003\u00deo\u0000\u033f\u0340\u0005\u0002\u0000\u0000"+
                    "\u0340\u0341\u0005\u0004\u0000\u0000\u0341S\u0001\u0000\u0000\u0000\u0342"+
                    "\u0343\u0005\u0095\u0000\u0000\u0343\u0344\u0005\u0003\u0000\u0000\u0344"+
                    "\u0345\u0005\u0001\u0000\u0000\u0345\u0346\u0003\u0086C\u0000\u0346\u0347"+
                    "\u0003\u00e6s\u0000\u0347\u0348\u0003\u00e8t\u0000\u0348\u034a\u0003\u00ea"+
                    "u\u0000\u0349\u034b\u0003\u00b4Z\u0000\u034a\u0349\u0001\u0000\u0000\u0000"+
                    "\u034a\u034b\u0001\u0000\u0000\u0000\u034b\u034d\u0001\u0000\u0000\u0000"+
                    "\u034c\u034e\u0003\u0160\u00b0\u0000\u034d\u034c\u0001\u0000\u0000\u0000"+
                    "\u034d\u034e\u0001\u0000\u0000\u0000\u034e\u034f\u0001\u0000\u0000\u0000"+
                    "\u034f\u0350\u0003\u00f4z\u0000\u0350\u0352\u0003\u00d4j\u0000\u0351\u0353"+
                    "\u0003\u00cae\u0000\u0352\u0351\u0001\u0000\u0000\u0000\u0352\u0353\u0001"+
                    "\u0000\u0000\u0000\u0353\u0355\u0001\u0000\u0000\u0000\u0354\u0356\u0003"+
                    "\u00d2i\u0000\u0355\u0354\u0001\u0000\u0000\u0000\u0355\u0356\u0001\u0000"+
                    "\u0000\u0000\u0356\u0357\u0001\u0000\u0000\u0000\u0357\u0359\u0003\u00f6"+
                    "{\u0000\u0358\u035a\u0003\u00f8|\u0000\u0359\u0358\u0001\u0000\u0000\u0000"+
                    "\u0359\u035a\u0001\u0000\u0000\u0000\u035a\u035b\u0001\u0000\u0000\u0000"+
                    "\u035b\u035c\u0003\u00fa}\u0000\u035c\u035d\u0005\u0002\u0000\u0000\u035d"+
                    "\u035e\u0005\u0004\u0000\u0000\u035eU\u0001\u0000\u0000\u0000\u035f\u0360"+
                    "\u0005\u0095\u0000\u0000\u0360\u0361\u0005\u0003\u0000\u0000\u0361\u0362"+
                    "\u0005\u0001\u0000\u0000\u0362\u0363\u0003\u0088D\u0000\u0363\u0364\u0003"+
                    "\u00ecv\u0000\u0364\u0365\u0003\u00e6s\u0000\u0365\u0366\u0003\u00e8t"+
                    "\u0000\u0366\u0367\u0003\u00eew\u0000\u0367\u0368\u0003\u00f0x\u0000\u0368"+
                    "\u0369\u0003\u00f4z\u0000\u0369\u036a\u0003\u00d4j\u0000\u036a\u036b\u0003"+
                    "\u00f2y\u0000\u036b\u036c\u0003\u00f6{\u0000\u036c\u036d\u0005\u0002\u0000"+
                    "\u0000\u036d\u036e\u0005\u0004\u0000\u0000\u036eW\u0001\u0000\u0000\u0000"+
                    "\u036f\u0370\u0005\u0095\u0000\u0000\u0370\u0371\u0005\u0003\u0000\u0000"+
                    "\u0371\u0372\u0005\u0001\u0000\u0000\u0372\u0374\u0003\u008aE\u0000\u0373"+
                    "\u0375\u0003\u0112\u0089\u0000\u0374\u0373\u0001\u0000\u0000\u0000\u0374"+
                    "\u0375\u0001\u0000\u0000\u0000\u0375\u0376\u0001\u0000\u0000\u0000\u0376"+
                    "\u0378\u0003\u00e6s\u0000\u0377\u0379\u0003\u0160\u00b0\u0000\u0378\u0377"+
                    "\u0001\u0000\u0000\u0000\u0378\u0379\u0001\u0000\u0000\u0000\u0379\u037b"+
                    "\u0001\u0000\u0000\u0000\u037a\u037c\u0003\u0162\u00b1\u0000\u037b\u037a"+
                    "\u0001\u0000\u0000\u0000\u037b\u037c\u0001\u0000\u0000\u0000\u037c\u037e"+
                    "\u0001\u0000\u0000\u0000\u037d\u037f\u0003\u0130\u0098\u0000\u037e\u037d"+
                    "\u0001\u0000\u0000\u0000\u037e\u037f\u0001\u0000\u0000\u0000\u037f\u0381"+
                    "\u0001\u0000\u0000\u0000\u0380\u0382\u0003\u0132\u0099\u0000\u0381\u0380"+
                    "\u0001\u0000\u0000\u0000\u0381\u0382\u0001\u0000\u0000\u0000\u0382\u0383"+
                    "\u0001\u0000\u0000\u0000\u0383\u0385\u0003\u0134\u009a\u0000\u0384\u0386"+
                    "\u0003\u0136\u009b\u0000\u0385\u0384\u0001\u0000\u0000\u0000\u0385\u0386"+
                    "\u0001\u0000\u0000\u0000\u0386\u0387\u0001\u0000\u0000\u0000\u0387\u0389"+
                    "\u0003\u0138\u009c\u0000\u0388\u038a\u0003\u013c\u009e\u0000\u0389\u0388"+
                    "\u0001\u0000\u0000\u0000\u0389\u038a\u0001\u0000\u0000\u0000\u038a\u038c"+
                    "\u0001\u0000\u0000\u0000\u038b\u038d\u0003\u013a\u009d\u0000\u038c\u038b"+
                    "\u0001\u0000\u0000\u0000\u038c\u038d\u0001\u0000\u0000\u0000\u038d\u038e"+
                    "\u0001\u0000\u0000\u0000\u038e\u0390\u0003\u013e\u009f\u0000\u038f\u0391"+
                    "\u0003\u0140\u00a0\u0000\u0390\u038f\u0001\u0000\u0000\u0000\u0390\u0391"+
                    "\u0001\u0000\u0000\u0000\u0391\u0393\u0001\u0000\u0000\u0000\u0392\u0394"+
                    "\u0003\u0142\u00a1\u0000\u0393\u0392\u0001\u0000\u0000\u0000\u0393\u0394"+
                    "\u0001\u0000\u0000\u0000\u0394\u0395\u0001\u0000\u0000\u0000\u0395\u0396"+
                    "\u0003\u0144\u00a2\u0000\u0396\u0397\u0005\u0002\u0000\u0000\u0397\u0398"+
                    "\u0005\u0004\u0000\u0000\u0398Y\u0001\u0000\u0000\u0000\u0399\u039a\u0005"+
                    "\u0095\u0000\u0000\u039a\u039b\u0005\u0003\u0000\u0000\u039b\u039c\u0005"+
                    "\u0001\u0000\u0000\u039c\u039d\u0003\u008cF\u0000\u039d\u039f\u0003\u015a"+
                    "\u00ad\u0000\u039e\u03a0\u0003\u00d4j\u0000\u039f\u039e\u0001\u0000\u0000"+
                    "\u0000\u039f\u03a0\u0001\u0000\u0000\u0000\u03a0\u03a1\u0001\u0000\u0000"+
                    "\u0000\u03a1\u03a2\u0003\u00d6k\u0000\u03a2\u03a3\u0003\u015c\u00ae\u0000"+
                    "\u03a3\u03a4\u0003\u00d8l\u0000\u03a4\u03a5\u0005\u0002\u0000\u0000\u03a5"+
                    "\u03a6\u0005\u0004\u0000\u0000\u03a6[\u0001\u0000\u0000\u0000\u03a7\u03a8"+
                    "\u0005\u0095\u0000\u0000\u03a8\u03a9\u0005\u0003\u0000\u0000\u03a9\u03aa"+
                    "\u0005\u0001\u0000\u0000\u03aa\u03ab\u0003\u008eG\u0000\u03ab\u03ac\u0003"+
                    "\u00dam\u0000\u03ac\u03ad\u0003\u00dcn\u0000\u03ad\u03ae\u0003\u00deo"+
                    "\u0000\u03ae\u03af\u0005\u0002\u0000\u0000\u03af\u03b0\u0005\u0004\u0000"+
                    "\u0000\u03b0]\u0001\u0000\u0000\u0000\u03b1\u03b2\u0005\u0095\u0000\u0000"+
                    "\u03b2\u03b3\u0005\u0003\u0000\u0000\u03b3\u03b4\u0005\u0001\u0000\u0000"+
                    "\u03b4\u03b6\u0003\u0090H\u0000\u03b5\u03b7\u0003\u00a4R\u0000\u03b6\u03b5"+
                    "\u0001\u0000\u0000\u0000\u03b6\u03b7\u0001\u0000\u0000\u0000\u03b7\u03b8"+
                    "\u0001\u0000\u0000\u0000\u03b8\u03b9\u0003\u00dam\u0000\u03b9\u03bb\u0003"+
                    "\u00dcn\u0000\u03ba\u03bc\u0003\u0146\u00a3\u0000\u03bb\u03ba\u0001\u0000"+
                    "\u0000\u0000\u03bb\u03bc\u0001\u0000\u0000\u0000\u03bc\u03be\u0001\u0000"+
                    "\u0000\u0000\u03bd\u03bf\u0003\u0148\u00a4\u0000\u03be\u03bd\u0001\u0000"+
                    "\u0000\u0000\u03be\u03bf\u0001\u0000\u0000\u0000\u03bf\u03c1\u0001\u0000"+
                    "\u0000\u0000\u03c0\u03c2\u0003\u00d4j\u0000\u03c1\u03c0\u0001\u0000\u0000"+
                    "\u0000\u03c1\u03c2\u0001\u0000\u0000\u0000\u03c2\u03c4\u0001\u0000\u0000"+
                    "\u0000\u03c3\u03c5\u0003\u014a\u00a5\u0000\u03c4\u03c3\u0001\u0000\u0000"+
                    "\u0000\u03c4\u03c5\u0001\u0000\u0000\u0000\u03c5\u03c7\u0001\u0000\u0000"+
                    "\u0000\u03c6\u03c8\u0003\u014c\u00a6\u0000\u03c7\u03c6\u0001\u0000\u0000"+
                    "\u0000\u03c7\u03c8\u0001\u0000\u0000\u0000\u03c8\u03c9\u0001\u0000\u0000"+
                    "\u0000\u03c9\u03ca\u0003\u00deo\u0000\u03ca\u03cb\u0003\u014e\u00a7\u0000"+
                    "\u03cb\u03cd\u0003\u0152\u00a9\u0000\u03cc\u03ce\u0003\u0154\u00aa\u0000"+
                    "\u03cd\u03cc\u0001\u0000\u0000\u0000\u03cd\u03ce\u0001\u0000\u0000\u0000"+
                    "\u03ce\u03cf\u0001\u0000\u0000\u0000\u03cf\u03d0\u0005\u0002\u0000\u0000"+
                    "\u03d0\u03d1\u0005\u0004\u0000\u0000\u03d1_\u0001\u0000\u0000\u0000\u03d2"+
                    "\u03d3\u0005\u0095\u0000\u0000\u03d3\u03d4\u0005\u0003\u0000\u0000\u03d4"+
                    "\u03d5\u0005\u0001\u0000\u0000\u03d5\u03d6\u0003\u0092I\u0000\u03d6\u03d7"+
                    "\u0003\u00dam\u0000\u03d7\u03d8\u0003\u00dcn\u0000\u03d8\u03d9\u0003\u0146"+
                    "\u00a3\u0000\u03d9\u03da\u0003\u0148\u00a4\u0000\u03da\u03db\u0003\u00d4"+
                    "j\u0000\u03db\u03dc\u0003\u014a\u00a5\u0000\u03dc\u03dd\u0003\u014c\u00a6"+
                    "\u0000\u03dd\u03de\u0003\u00deo\u0000\u03de\u03df\u0003\u014e\u00a7\u0000"+
                    "\u03df\u03e0\u0003\u0150\u00a8\u0000\u03e0\u03e1\u0005\u0002\u0000\u0000"+
                    "\u03e1\u03e2\u0005\u0004\u0000\u0000\u03e2a\u0001\u0000\u0000\u0000\u03e3"+
                    "\u03e4\u0005\u0095\u0000\u0000\u03e4\u03e5\u0005\u0003\u0000\u0000\u03e5"+
                    "\u03e6\u0005\u0001\u0000\u0000\u03e6\u03e7\u0003\u0094J\u0000\u03e7\u03e8"+
                    "\u0003\u00dam\u0000\u03e8\u03e9\u0003\u00dcn\u0000\u03e9\u03ea\u0003\u00de"+
                    "o\u0000\u03ea\u03eb\u0005\u0002\u0000\u0000\u03eb\u03ec\u0005\u0004\u0000"+
                    "\u0000\u03ecc\u0001\u0000\u0000\u0000\u03ed\u03ee\u0005\u0095\u0000\u0000"+
                    "\u03ee\u03ef\u0005\u0003\u0000\u0000\u03ef\u03f0\u0005\u0001\u0000\u0000"+
                    "\u03f0\u03f2\u0003\u0096K\u0000\u03f1\u03f3\u0003\u00d4j\u0000\u03f2\u03f1"+
                    "\u0001\u0000\u0000\u0000\u03f2\u03f3\u0001\u0000\u0000\u0000\u03f3\u03f5"+
                    "\u0001\u0000\u0000\u0000\u03f4\u03f6\u0003\u00c4b\u0000\u03f5\u03f4\u0001"+
                    "\u0000\u0000\u0000\u03f5\u03f6\u0001\u0000\u0000\u0000\u03f6\u03f8\u0001"+
                    "\u0000\u0000\u0000\u03f7\u03f9\u0003\u00c6c\u0000\u03f8\u03f7\u0001\u0000"+
                    "\u0000\u0000\u03f8\u03f9\u0001\u0000\u0000\u0000\u03f9\u03fb\u0001\u0000"+
                    "\u0000\u0000\u03fa\u03fc\u0003\u00a8T\u0000\u03fb\u03fa\u0001\u0000\u0000"+
                    "\u0000\u03fb\u03fc\u0001\u0000\u0000\u0000\u03fc\u03fe\u0001\u0000\u0000"+
                    "\u0000\u03fd\u03ff\u0003\u0156\u00ab\u0000\u03fe\u03fd\u0001\u0000\u0000"+
                    "\u0000\u03fe\u03ff\u0001\u0000\u0000\u0000\u03ff\u0401\u0001\u0000\u0000"+
                    "\u0000\u0400\u0402\u0003\u0158\u00ac\u0000\u0401\u0400\u0001\u0000\u0000"+
                    "\u0000\u0401\u0402\u0001\u0000\u0000\u0000\u0402\u0403\u0001\u0000\u0000"+
                    "\u0000\u0403\u0404\u0005\u0002\u0000\u0000\u0404\u0405\u0005\u0004\u0000"+
                    "\u0000\u0405e\u0001\u0000\u0000\u0000\u0406\u0407\u0005\u0095\u0000\u0000"+
                    "\u0407\u0408\u0005\u0003\u0000\u0000\u0408\u0409\u0005\u0001\u0000\u0000"+
                    "\u0409\u040a\u0003\u0098L\u0000\u040a\u040b\u0003\u00c8d\u0000\u040b\u040d"+
                    "\u0003\u00d4j\u0000\u040c\u040e\u0003\u00d6k\u0000\u040d\u040c\u0001\u0000"+
                    "\u0000\u0000\u040d\u040e\u0001\u0000\u0000\u0000\u040e\u040f\u0001\u0000"+
                    "\u0000\u0000\u040f\u0410\u0003\u00d8l\u0000\u0410\u0411\u0005\u0002\u0000"+
                    "\u0000\u0411\u0412\u0005\u0004\u0000\u0000\u0412g\u0001\u0000\u0000\u0000"+
                    "\u0413\u0414\u0005\u0095\u0000\u0000\u0414\u0415\u0005\u0003\u0000\u0000"+
                    "\u0415\u0416\u0005\u0001\u0000\u0000\u0416\u0418\u0003\u009aM\u0000\u0417"+
                    "\u0419\u0003\u015e\u00af\u0000\u0418\u0417\u0001\u0000\u0000\u0000\u0418"+
                    "\u0419\u0001\u0000\u0000\u0000\u0419\u041a\u0001\u0000\u0000\u0000\u041a"+
                    "\u041b\u0003\u0160\u00b0\u0000\u041b\u041c\u0003\u00d4j\u0000\u041c\u041d"+
                    "\u0005\u0002\u0000\u0000\u041d\u041e\u0005\u0004\u0000\u0000\u041ei\u0001"+
                    "\u0000\u0000\u0000\u041f\u0420\u0005\u0095\u0000\u0000\u0420\u0421\u0005"+
                    "\u0003\u0000\u0000\u0421\u0422\u0005\u0001\u0000\u0000\u0422\u0423\u0003"+
                    "\u009cN\u0000\u0423\u0424\u0003\u016e\u00b7\u0000\u0424\u0426\u0003\u0170"+
                    "\u00b8\u0000\u0425\u0427\u0003\u0172\u00b9\u0000\u0426\u0425\u0001\u0000"+
                    "\u0000\u0000\u0426\u0427\u0001\u0000\u0000\u0000\u0427\u0428\u0001\u0000"+
                    "\u0000\u0000\u0428\u0429\u0005\u0002\u0000\u0000\u0429\u042a\u0005\u0004"+
                    "\u0000\u0000\u042ak\u0001\u0000\u0000\u0000\u042b\u042c\u0005\u0095\u0000"+
                    "\u0000\u042c\u042d\u0005\u0003\u0000\u0000\u042d\u042e\u0005\u0001\u0000"+
                    "\u0000\u042e\u042f\u0003\u009eO\u0000\u042f\u0430\u0003\u00ccf\u0000\u0430"+
                    "\u0431\u0003\u00ceg\u0000\u0431\u0432\u0005\u0002\u0000\u0000\u0432\u0433"+
                    "\u0005\u0004\u0000\u0000\u0433m\u0001\u0000\u0000\u0000\u0434\u0435\u0005"+
                    "\u0095\u0000\u0000\u0435\u0436\u0005\u0003\u0000\u0000\u0436\u0437\u0005"+
                    "\u0001\u0000\u0000\u0437\u0439\u0003\u00a0P\u0000\u0438\u043a\u0003\u00d0"+
                    "h\u0000\u0439\u0438\u0001\u0000\u0000\u0000\u0439\u043a\u0001\u0000\u0000"+
                    "\u0000\u043a\u043b\u0001\u0000\u0000\u0000\u043b\u043c\u0003\u00f6{\u0000"+
                    "\u043c\u043d\u0005\u0002\u0000\u0000\u043d\u043e\u0005\u0004\u0000\u0000"+
                    "\u043eo\u0001\u0000\u0000\u0000\u043f\u0440\u0005\u0095\u0000\u0000\u0440"+
                    "\u0441\u0005\u0003\u0000\u0000\u0441\u0442\u0005\u0001\u0000\u0000\u0442"+
                    "\u0443\u0003\u00a2Q\u0000\u0443\u0444\u0003\u00c8d\u0000\u0444\u0446\u0003"+
                    "\u0178\u00bc\u0000\u0445\u0447\u0003\u00d4j\u0000\u0446\u0445\u0001\u0000"+
                    "\u0000\u0000\u0446\u0447\u0001\u0000\u0000\u0000\u0447\u0448\u0001\u0000"+
                    "\u0000\u0000\u0448\u0449\u0003\u00d6k\u0000\u0449\u044a\u0003\u00d8l\u0000"+
                    "\u044a\u044b\u0003\u017a\u00bd\u0000\u044b\u044c\u0005\u0002\u0000\u0000"+
                    "\u044c\u044d\u0005\u0004\u0000\u0000\u044dq\u0001\u0000\u0000\u0000\u044e"+
                    "\u044f\u0005\f\u0000\u0000\u044f\u0450\u0005\u0003\u0000\u0000\u0450\u0451"+
                    "\u0005\u0014\u0000\u0000\u0451\u0452\u0005\u0004\u0000\u0000\u0452s\u0001"+
                    "\u0000\u0000\u0000\u0453\u0454\u0005\f\u0000\u0000\u0454\u0455\u0005\u0003"+
                    "\u0000\u0000\u0455\u0456\u0005\u0015\u0000\u0000\u0456\u0457\u0005\u0004"+
                    "\u0000\u0000\u0457u\u0001\u0000\u0000\u0000\u0458\u0459\u0005\f\u0000"+
                    "\u0000\u0459\u045a\u0005\u0003\u0000\u0000\u045a\u045b\u0005\u0016\u0000"+
                    "\u0000\u045b\u045c\u0005\u0004\u0000\u0000\u045cw\u0001\u0000\u0000\u0000"+
                    "\u045d\u045e\u0005\f\u0000\u0000\u045e\u045f\u0005\u0003\u0000\u0000\u045f"+
                    "\u0460\u0005\u0017\u0000\u0000\u0460\u0461\u0005\u0004\u0000\u0000\u0461"+
                    "y\u0001\u0000\u0000\u0000\u0462\u0463\u0005\f\u0000\u0000\u0463\u0464"+
                    "\u0005\u0003\u0000\u0000\u0464\u0465\u0005\u0018\u0000\u0000\u0465\u0466"+
                    "\u0005\u0004\u0000\u0000\u0466{\u0001\u0000\u0000\u0000\u0467\u0468\u0005"+
                    "\f\u0000\u0000\u0468\u0469\u0005\u0003\u0000\u0000\u0469\u046a\u0005\u0019"+
                    "\u0000\u0000\u046a\u046b\u0005\u0004\u0000\u0000\u046b}\u0001\u0000\u0000"+
                    "\u0000\u046c\u046d\u0005\f\u0000\u0000\u046d\u046e\u0005\u0003\u0000\u0000"+
                    "\u046e\u046f\u0005\u001a\u0000\u0000\u046f\u0470\u0005\u0004\u0000\u0000"+
                    "\u0470\u007f\u0001\u0000\u0000\u0000\u0471\u0472\u0005\f\u0000\u0000\u0472"+
                    "\u0473\u0005\u0003\u0000\u0000\u0473\u0474\u0005\u001b\u0000\u0000\u0474"+
                    "\u0475\u0005\u0004\u0000\u0000\u0475\u0081\u0001\u0000\u0000\u0000\u0476"+
                    "\u0477\u0005\f\u0000\u0000\u0477\u0478\u0005\u0003\u0000\u0000\u0478\u0479"+
                    "\u0005\u001c\u0000\u0000\u0479\u047a\u0005\u0004\u0000\u0000\u047a\u0083"+
                    "\u0001\u0000\u0000\u0000\u047b\u047c\u0005\f\u0000\u0000\u047c\u047d\u0005"+
                    "\u0003\u0000\u0000\u047d\u047e\u0005\u001d\u0000\u0000\u047e\u047f\u0005"+
                    "\u0004\u0000\u0000\u047f\u0085\u0001\u0000\u0000\u0000\u0480\u0481\u0005"+
                    "\f\u0000\u0000\u0481\u0482\u0005\u0003\u0000\u0000\u0482\u0483\u0005\u001e"+
                    "\u0000\u0000\u0483\u0484\u0005\u0004\u0000\u0000\u0484\u0087\u0001\u0000"+
                    "\u0000\u0000\u0485\u0486\u0005\f\u0000\u0000\u0486\u0487\u0005\u0003\u0000"+
                    "\u0000\u0487\u0488\u0005\u001f\u0000\u0000\u0488\u0489\u0005\u0004\u0000"+
                    "\u0000\u0489\u0089\u0001\u0000\u0000\u0000\u048a\u048b\u0005\f\u0000\u0000"+
                    "\u048b\u048c\u0005\u0003\u0000\u0000\u048c\u048d\u0005 \u0000\u0000\u048d"+
                    "\u048e\u0005\u0004\u0000\u0000\u048e\u008b\u0001\u0000\u0000\u0000\u048f"+
                    "\u0490\u0005\f\u0000\u0000\u0490\u0491\u0005\u0003\u0000\u0000\u0491\u0492"+
                    "\u0005!\u0000\u0000\u0492\u0493\u0005\u0004\u0000\u0000\u0493\u008d\u0001"+
                    "\u0000\u0000\u0000\u0494\u0495\u0005\f\u0000\u0000\u0495\u0496\u0005\u0003"+
                    "\u0000\u0000\u0496\u0497\u0005\"\u0000\u0000\u0497\u0498\u0005\u0004\u0000"+
                    "\u0000\u0498\u008f\u0001\u0000\u0000\u0000\u0499\u049a\u0005\f\u0000\u0000"+
                    "\u049a\u049b\u0005\u0003\u0000\u0000\u049b\u049c\u0005#\u0000\u0000\u049c"+
                    "\u049d\u0005\u0004\u0000\u0000\u049d\u0091\u0001\u0000\u0000\u0000\u049e"+
                    "\u049f\u0005\f\u0000\u0000\u049f\u04a0\u0005\u0003\u0000\u0000\u04a0\u04a1"+
                    "\u0005$\u0000\u0000\u04a1\u04a2\u0005\u0004\u0000\u0000\u04a2\u0093\u0001"+
                    "\u0000\u0000\u0000\u04a3\u04a4\u0005\f\u0000\u0000\u04a4\u04a5\u0005\u0003"+
                    "\u0000\u0000\u04a5\u04a6\u0005%\u0000\u0000\u04a6\u04a7\u0005\u0004\u0000"+
                    "\u0000\u04a7\u0095\u0001\u0000\u0000\u0000\u04a8\u04a9\u0005\f\u0000\u0000"+
                    "\u04a9\u04aa\u0005\u0003\u0000\u0000\u04aa\u04ab\u0005&\u0000\u0000\u04ab"+
                    "\u04ac\u0005\u0004\u0000\u0000\u04ac\u0097\u0001\u0000\u0000\u0000\u04ad"+
                    "\u04ae\u0005\f\u0000\u0000\u04ae\u04af\u0005\u0003\u0000\u0000\u04af\u04b0"+
                    "\u0005\'\u0000\u0000\u04b0\u04b1\u0005\u0004\u0000\u0000\u04b1\u0099\u0001"+
                    "\u0000\u0000\u0000\u04b2\u04b3\u0005\f\u0000\u0000\u04b3\u04b4\u0005\u0003"+
                    "\u0000\u0000\u04b4\u04b5\u0005(\u0000\u0000\u04b5\u04b6\u0005\u0004\u0000"+
                    "\u0000\u04b6\u009b\u0001\u0000\u0000\u0000\u04b7\u04b8\u0005\f\u0000\u0000"+
                    "\u04b8\u04b9\u0005\u0003\u0000\u0000\u04b9\u04ba\u0005)\u0000\u0000\u04ba"+
                    "\u04bb\u0005\u0004\u0000\u0000\u04bb\u009d\u0001\u0000\u0000\u0000\u04bc"+
                    "\u04bd\u0005\f\u0000\u0000\u04bd\u04be\u0005\u0003\u0000\u0000\u04be\u04bf"+
                    "\u0005*\u0000\u0000\u04bf\u04c0\u0005\u0004\u0000\u0000\u04c0\u009f\u0001"+
                    "\u0000\u0000\u0000\u04c1\u04c2\u0005\f\u0000\u0000\u04c2\u04c3\u0005\u0003"+
                    "\u0000\u0000\u04c3\u04c4\u0005+\u0000\u0000\u04c4\u04c5\u0005\u0004\u0000"+
                    "\u0000\u04c5\u00a1\u0001\u0000\u0000\u0000\u04c6\u04c7\u0005\f\u0000\u0000"+
                    "\u04c7\u04c8\u0005\u0003\u0000\u0000\u04c8\u04c9\u0005,\u0000\u0000\u04c9"+
                    "\u04ca\u0005\u0004\u0000\u0000\u04ca\u00a3\u0001\u0000\u0000\u0000\u04cb"+
                    "\u04cc\u0005-\u0000\u0000\u04cc\u04cd\u0005\u0003\u0000\u0000\u04cd\u04ce"+
                    "\u0005\r\u0000\u0000\u04ce\u04cf\u0005\u0004\u0000\u0000\u04cf\u00a5\u0001"+
                    "\u0000\u0000\u0000\u04d0\u04d1\u0005.\u0000\u0000\u04d1\u04d2\u0005\u0003"+
                    "\u0000\u0000\u04d2\u04d3\u0005\u0095\u0000\u0000\u04d3\u04d4\u0005\u0004"+
                    "\u0000\u0000\u04d4\u00a7\u0001\u0000\u0000\u0000\u04d5\u04d6\u0005/\u0000"+
                    "\u0000\u04d6\u04d7\u0005\u0003\u0000\u0000\u04d7\u04d8\u0005\u0095\u0000"+
                    "\u0000\u04d8\u04d9\u0005\u0004\u0000\u0000\u04d9\u00a9\u0001\u0000\u0000"+
                    "\u0000\u04da\u04db\u00050\u0000\u0000\u04db\u04dc\u0005\u0003\u0000\u0000"+
                    "\u04dc\u04dd\u0005\u0095\u0000\u0000\u04dd\u04de\u0005\u0004\u0000\u0000"+
                    "\u04de\u00ab\u0001\u0000\u0000\u0000\u04df\u04e0\u00051\u0000\u0000\u04e0"+
                    "\u04e1\u0005\u0003\u0000\u0000\u04e1\u04e2\u0005\r\u0000\u0000\u04e2\u04e3"+
                    "\u0005\u0004\u0000\u0000\u04e3\u00ad\u0001\u0000\u0000\u0000\u04e4\u04e5"+
                    "\u00052\u0000\u0000\u04e5\u04e6\u0005\u0003\u0000\u0000\u04e6\u04e7\u0005"+
                    "\u0095\u0000\u0000\u04e7\u04e8\u0005\u0004\u0000\u0000\u04e8\u00af\u0001"+
                    "\u0000\u0000\u0000\u04e9\u04ea\u00053\u0000\u0000\u04ea\u04eb\u0005\u0003"+
                    "\u0000\u0000\u04eb\u04ec\u0003\u0180\u00c0\u0000\u04ec\u04ed\u0005\u0004"+
                    "\u0000\u0000\u04ed\u00b1\u0001\u0000\u0000\u0000\u04ee\u04ef\u00054\u0000"+
                    "\u0000\u04ef\u04f0\u0005\u0003\u0000\u0000\u04f0\u04f1\u0005\r\u0000\u0000"+
                    "\u04f1\u04f2\u0005\u0004\u0000\u0000\u04f2\u00b3\u0001\u0000\u0000\u0000"+
                    "\u04f3\u04f4\u00055\u0000\u0000\u04f4\u04f5\u0005\u0003\u0000\u0000\u04f5"+
                    "\u04f6\u0003\u0180\u00c0\u0000\u04f6\u04f7\u0005\u0004\u0000\u0000\u04f7"+
                    "\u00b5\u0001\u0000\u0000\u0000\u04f8\u04f9\u00056\u0000\u0000\u04f9\u04fa"+
                    "\u0005\u0003\u0000\u0000\u04fa\u04fb\u0003\u0180\u00c0\u0000\u04fb\u04fc"+
                    "\u0005\u0004\u0000\u0000\u04fc\u00b7\u0001\u0000\u0000\u0000\u04fd\u04fe"+
                    "\u00057\u0000\u0000\u04fe\u04ff\u0005\u0003\u0000\u0000\u04ff\u0500\u0003"+
                    "\u0180\u00c0\u0000\u0500\u0501\u0005\u0004\u0000\u0000\u0501\u00b9\u0001"+
                    "\u0000\u0000\u0000\u0502\u0503\u00058\u0000\u0000\u0503\u0504\u0005\u0003"+
                    "\u0000\u0000\u0504\u0505\u0005\r\u0000\u0000\u0505\u0506\u0005\u0004\u0000"+
                    "\u0000\u0506\u00bb\u0001\u0000\u0000\u0000\u0507\u0508\u00059\u0000\u0000"+
                    "\u0508\u0509\u0005\u0003\u0000\u0000\u0509\u050a\u0005\r\u0000\u0000\u050a"+
                    "\u050b\u0005\u0004\u0000\u0000\u050b\u00bd\u0001\u0000\u0000\u0000\u050c"+
                    "\u050d\u0005:\u0000\u0000\u050d\u050e\u0005\u0003\u0000\u0000\u050e\u050f"+
                    "\u0005\r\u0000\u0000\u050f\u0510\u0005\u0004\u0000\u0000\u0510\u00bf\u0001"+
                    "\u0000\u0000\u0000\u0511\u0512\u0005;\u0000\u0000\u0512\u0513\u0005\u0003"+
                    "\u0000\u0000\u0513\u0514\u0005\r\u0000\u0000\u0514\u0515\u0005\u0004\u0000"+
                    "\u0000\u0515\u00c1\u0001\u0000\u0000\u0000\u0516\u0517\u0005<\u0000\u0000"+
                    "\u0517\u0518\u0005\u0003\u0000\u0000\u0518\u0519\u0005\r\u0000\u0000\u0519"+
                    "\u051a\u0005\u0004\u0000\u0000\u051a\u00c3\u0001\u0000\u0000\u0000\u051b"+
                    "\u051c\u0005=\u0000\u0000\u051c\u051d\u0005\u0003\u0000\u0000\u051d\u051e"+
                    "\u0003\u017e\u00bf\u0000\u051e\u051f\u0005\u0004\u0000\u0000\u051f\u00c5"+
                    "\u0001\u0000\u0000\u0000\u0520\u0521\u0005>\u0000\u0000\u0521\u0522\u0005"+
                    "\u0003\u0000\u0000\u0522\u0523\u0003\u00e2q\u0000\u0523\u0524\u0005\u0004"+
                    "\u0000\u0000\u0524\u00c7\u0001\u0000\u0000\u0000\u0525\u0526\u0005?\u0000"+
                    "\u0000\u0526\u0527\u0005\u0003\u0000\u0000\u0527\u0528\u0003\u00e0p\u0000"+
                    "\u0528\u0529\u0005\u0004\u0000\u0000\u0529\u00c9\u0001\u0000\u0000\u0000"+
                    "\u052a\u052b\u0005@\u0000\u0000\u052b\u052c\u0005\u0003\u0000\u0000\u052c"+
                    "\u052d\u0003\u017e\u00bf\u0000\u052d\u052e\u0005\u0004\u0000\u0000\u052e"+
                    "\u00cb\u0001\u0000\u0000\u0000\u052f\u0530\u0005A\u0000\u0000\u0530\u0531"+
                    "\u0005\u0003\u0000\u0000\u0531\u0532\u0005\u0096\u0000\u0000\u0532\u0533"+
                    "\u0005\u0004\u0000\u0000\u0533\u00cd\u0001\u0000\u0000\u0000\u0534\u0535"+
                    "\u0005B\u0000\u0000\u0535\u0536\u0005\u0003\u0000\u0000\u0536\u053a\u0005"+
                    "\u0001\u0000\u0000\u0537\u0539\u0003\u016c\u00b6\u0000\u0538\u0537\u0001"+
                    "\u0000\u0000\u0000\u0539\u053c\u0001\u0000\u0000\u0000\u053a\u0538\u0001"+
                    "\u0000\u0000\u0000\u053a\u053b\u0001\u0000\u0000\u0000\u053b\u053d\u0001"+
                    "\u0000\u0000\u0000\u053c\u053a\u0001\u0000\u0000\u0000\u053d\u053e\u0005"+
                    "\u0002\u0000\u0000\u053e\u053f\u0005\u0004\u0000\u0000\u053f\u00cf\u0001"+
                    "\u0000\u0000\u0000\u0540\u0541\u0005C\u0000\u0000\u0541\u0542\u0005\u0003"+
                    "\u0000\u0000\u0542\u0543\u0005\u0095\u0000\u0000\u0543\u0544\u0005\u0004"+
                    "\u0000\u0000\u0544\u00d1\u0001\u0000\u0000\u0000\u0545\u0546\u0005D\u0000"+
                    "\u0000\u0546\u0547\u0005\u0003\u0000\u0000\u0547\u0548\u0003\u00e0p\u0000"+
                    "\u0548\u0549\u0005\u0004\u0000\u0000\u0549\u00d3\u0001\u0000\u0000\u0000"+
                    "\u054a\u054b\u0005E\u0000\u0000\u054b\u054c\u0005\u0003\u0000\u0000\u054c"+
                    "\u054d\u0003\u017e\u00bf\u0000\u054d\u054e\u0005\u0004\u0000\u0000\u054e"+
                    "\u00d5\u0001\u0000\u0000\u0000\u054f\u0550\u0005F\u0000\u0000\u0550\u0551"+
                    "\u0005\u0003\u0000\u0000\u0551\u0552\u0003\u0180\u00c0\u0000\u0552\u0553"+
                    "\u0005\u0004\u0000\u0000\u0553\u00d7\u0001\u0000\u0000\u0000\u0554\u0555"+
                    "\u0005G\u0000\u0000\u0555\u0556\u0005\u0003\u0000\u0000\u0556\u0557\u0003"+
                    "\u017e\u00bf\u0000\u0557\u0558\u0005\u0004\u0000\u0000\u0558\u00d9\u0001"+
                    "\u0000\u0000\u0000\u0559\u055a\u0005H\u0000\u0000\u055a\u055b\u0005\u0003"+
                    "\u0000\u0000\u055b\u055c\u0005\r\u0000\u0000\u055c\u055d\u0005\u0004\u0000"+
                    "\u0000\u055d\u00db\u0001\u0000\u0000\u0000\u055e\u055f\u0005I\u0000\u0000"+
                    "\u055f\u0560\u0005\u0003\u0000\u0000\u0560\u0561\u0003\u00e0p\u0000\u0561"+
                    "\u0562\u0005\u0004\u0000\u0000\u0562\u00dd\u0001\u0000\u0000\u0000\u0563"+
                    "\u0564\u0005J\u0000\u0000\u0564\u0565\u0005\u0003\u0000\u0000\u0565\u0566"+
                    "\u0005\r\u0000\u0000\u0566\u0567\u0005\u0004\u0000\u0000\u0567\u00df\u0001"+
                    "\u0000\u0000\u0000\u0568\u056d\u0005\u0005\u0000\u0000\u0569\u056a\u0005"+
                    "\u0095\u0000\u0000\u056a\u056c\u0005\u0006\u0000\u0000\u056b\u0569\u0001"+
                    "\u0000\u0000\u0000\u056c\u056f\u0001\u0000\u0000\u0000\u056d\u056b\u0001"+
                    "\u0000\u0000\u0000\u056d\u056e\u0001\u0000\u0000\u0000\u056e\u0570\u0001"+
                    "\u0000\u0000\u0000\u056f\u056d\u0001\u0000\u0000\u0000\u0570\u0571\u0005"+
                    "\u0007\u0000\u0000\u0571\u00e1\u0001\u0000\u0000\u0000\u0572\u0573\u0005"+
                    "\u0005\u0000\u0000\u0573\u0583\u0005\u0007\u0000\u0000\u0574\u0575\u0005"+
                    "\u0005\u0000\u0000\u0575\u057a\u0003\u0180\u00c0\u0000\u0576\u0577\u0005"+
                    "\u0006\u0000\u0000\u0577\u0579\u0003\u0180\u00c0\u0000\u0578\u0576\u0001"+
                    "\u0000\u0000\u0000\u0579\u057c\u0001\u0000\u0000\u0000\u057a\u0578\u0001"+
                    "\u0000\u0000\u0000\u057a\u057b\u0001\u0000\u0000\u0000\u057b\u057e\u0001"+
                    "\u0000\u0000\u0000\u057c\u057a\u0001\u0000\u0000\u0000\u057d\u057f\u0005"+
                    "\u0006\u0000\u0000\u057e\u057d\u0001\u0000\u0000\u0000\u057e\u057f\u0001"+
                    "\u0000\u0000\u0000\u057f\u0580\u0001\u0000\u0000\u0000\u0580\u0581\u0005"+
                    "\u0007\u0000\u0000\u0581\u0583\u0001\u0000\u0000\u0000\u0582\u0572\u0001"+
                    "\u0000\u0000\u0000\u0582\u0574\u0001\u0000\u0000\u0000\u0583\u00e3\u0001"+
                    "\u0000\u0000\u0000\u0584\u0589\u0005\u0005\u0000\u0000\u0585\u0586\u0005"+
                    "\u0097\u0000\u0000\u0586\u0588\u0005\u0006\u0000\u0000\u0587\u0585\u0001"+
                    "\u0000\u0000\u0000\u0588\u058b\u0001\u0000\u0000\u0000\u0589\u0587\u0001"+
                    "\u0000\u0000\u0000\u0589\u058a\u0001\u0000\u0000\u0000\u058a\u058c\u0001"+
                    "\u0000\u0000\u0000\u058b\u0589\u0001\u0000\u0000\u0000\u058c\u058d\u0005"+
                    "\u0007\u0000\u0000\u058d\u00e5\u0001\u0000\u0000\u0000\u058e\u058f\u0005"+
                    "K\u0000\u0000\u058f\u0590\u0005\u0003\u0000\u0000\u0590\u0591\u0005\u0095"+
                    "\u0000\u0000\u0591\u0592\u0005\u0004\u0000\u0000\u0592\u00e7\u0001\u0000"+
                    "\u0000\u0000\u0593\u0594\u0005L\u0000\u0000\u0594\u0595\u0005\u0003\u0000"+
                    "\u0000\u0595\u0596\u0003\u00e0p\u0000\u0596\u0597\u0005\u0004\u0000\u0000"+
                    "\u0597\u00e9\u0001\u0000\u0000\u0000\u0598\u0599\u0005M\u0000\u0000\u0599"+
                    "\u059a\u0005\u0003\u0000\u0000\u059a\u059b\u0003\u00e0p\u0000\u059b\u059c"+
                    "\u0005\u0004\u0000\u0000\u059c\u00eb\u0001\u0000\u0000\u0000\u059d\u059e"+
                    "\u0005N\u0000\u0000\u059e\u059f\u0005\u0003\u0000\u0000\u059f\u05a0\u0003"+
                    "\u017e\u00bf\u0000\u05a0\u05a1\u0005\u0004\u0000\u0000\u05a1\u00ed\u0001"+
                    "\u0000\u0000\u0000\u05a2\u05a3\u0005O\u0000\u0000\u05a3\u05a4\u0005\u0003"+
                    "\u0000\u0000\u05a4\u05a5\u0003\u017e\u00bf\u0000\u05a5\u05a6\u0005\u0004"+
                    "\u0000\u0000\u05a6\u00ef\u0001\u0000\u0000\u0000\u05a7\u05a8\u0005P\u0000"+
                    "\u0000\u05a8\u05a9\u0005\u0003\u0000\u0000\u05a9\u05aa\u0003\u017e\u00bf"+
                    "\u0000\u05aa\u05ab\u0005\u0004\u0000\u0000\u05ab\u00f1\u0001\u0000\u0000"+
                    "\u0000\u05ac\u05ad\u0005Q\u0000\u0000\u05ad\u05ae\u0005\u0003\u0000\u0000"+
                    "\u05ae\u05af\u0005\r\u0000\u0000\u05af\u05b0\u0005\u0004\u0000\u0000\u05b0"+
                    "\u00f3\u0001\u0000\u0000\u0000\u05b1\u05b2\u0005R\u0000\u0000\u05b2\u05b3"+
                    "\u0005\u0003\u0000\u0000\u05b3\u05b4\u0003\u00e0p\u0000\u05b4\u05b5\u0005"+
                    "\u0004\u0000\u0000\u05b5\u00f5\u0001\u0000\u0000\u0000\u05b6\u05b7\u0005"+
                    "S\u0000\u0000\u05b7\u05b8\u0005\u0003\u0000\u0000\u05b8\u05b9\u0003\u0180"+
                    "\u00c0\u0000\u05b9\u05ba\u0005\u0004\u0000\u0000\u05ba\u00f7\u0001\u0000"+
                    "\u0000\u0000\u05bb\u05bc\u0005T\u0000\u0000\u05bc\u05bd\u0005\u0003\u0000"+
                    "\u0000\u05bd\u05be\u0005\u0095\u0000\u0000\u05be\u05bf\u0005\u0004\u0000"+
                    "\u0000\u05bf\u00f9\u0001\u0000\u0000\u0000\u05c0\u05c1\u0005U\u0000\u0000"+
                    "\u05c1\u05c2\u0005\u0003\u0000\u0000\u05c2\u05c3\u0005\u0096\u0000\u0000"+
                    "\u05c3\u05c4\u0005\u0004\u0000\u0000\u05c4\u00fb\u0001\u0000\u0000\u0000"+
                    "\u05c5\u05c6\u0005V\u0000\u0000\u05c6\u05c7\u0005\u0003\u0000\u0000\u05c7"+
                    "\u05c8\u0005\r\u0000\u0000\u05c8\u05c9\u0005\u0004\u0000\u0000\u05c9\u00fd"+
                    "\u0001\u0000\u0000\u0000\u05ca\u05cb\u0005W\u0000\u0000\u05cb\u05cc\u0005"+
                    "\u0003\u0000\u0000\u05cc\u05cd\u0003\u0180\u00c0\u0000\u05cd\u05ce\u0005"+
                    "\u0004\u0000\u0000\u05ce\u00ff\u0001\u0000\u0000\u0000\u05cf\u05d0\u0005"+
                    "X\u0000\u0000\u05d0\u05d1\u0005\u0003\u0000\u0000\u05d1\u05d2\u0003\u0180"+
                    "\u00c0\u0000\u05d2\u05d3\u0005\u0004\u0000\u0000\u05d3\u0101\u0001\u0000"+
                    "\u0000\u0000\u05d4\u05d5\u0005Y\u0000\u0000\u05d5\u05d6\u0005\u0003\u0000"+
                    "\u0000\u05d6\u05d7\u0005\r\u0000\u0000\u05d7\u05d8\u0005\u0004\u0000\u0000"+
                    "\u05d8\u0103\u0001\u0000\u0000\u0000\u05d9\u05da\u0005Z\u0000\u0000\u05da"+
                    "\u05db\u0005\u0003\u0000\u0000\u05db\u05dc\u0003\u017e\u00bf\u0000\u05dc"+
                    "\u05dd\u0005\u0004\u0000\u0000\u05dd\u0105\u0001\u0000\u0000\u0000\u05de"+
                    "\u05df\u0005[\u0000\u0000\u05df\u05e0\u0005\u0003\u0000\u0000\u05e0\u05e1"+
                    "\u0003\u017e\u00bf\u0000\u05e1\u05e2\u0005\u0004\u0000\u0000\u05e2\u0107"+
                    "\u0001\u0000\u0000\u0000\u05e3\u05e4\u0005\\\u0000\u0000\u05e4\u05e5\u0005"+
                    "\u0003\u0000\u0000\u05e5\u05e6\u0003\u00e2q\u0000\u05e6\u05e7\u0005\u0004"+
                    "\u0000\u0000\u05e7\u0109\u0001\u0000\u0000\u0000\u05e8\u05e9\u0005]\u0000"+
                    "\u0000\u05e9\u05ea\u0005\u0003\u0000\u0000\u05ea\u05eb\u0005\r\u0000\u0000"+
                    "\u05eb\u05ec\u0005\u0004\u0000\u0000\u05ec\u010b\u0001\u0000\u0000\u0000"+
                    "\u05ed\u05ee\u0005^\u0000\u0000\u05ee\u05ef\u0005\u0003\u0000\u0000\u05ef"+
                    "\u05f0\u0003\u00e2q\u0000\u05f0\u05f1\u0005\u0004\u0000\u0000\u05f1\u010d"+
                    "\u0001\u0000\u0000\u0000\u05f2\u05f3\u0005_\u0000\u0000\u05f3\u05f4\u0005"+
                    "\u0003\u0000\u0000\u05f4\u05f5\u0005\r\u0000\u0000\u05f5\u05f6\u0005\u0004"+
                    "\u0000\u0000\u05f6\u010f\u0001\u0000\u0000\u0000\u05f7\u05f8\u0005`\u0000"+
                    "\u0000\u05f8\u05f9\u0005\u0003\u0000\u0000\u05f9\u05fa\u0003\u017e\u00bf"+
                    "\u0000\u05fa\u05fb\u0005\u0004\u0000\u0000\u05fb\u0111\u0001\u0000\u0000"+
                    "\u0000\u05fc\u05fd\u0005a\u0000\u0000\u05fd\u05fe\u0005\u0003\u0000\u0000"+
                    "\u05fe\u0600\u0005\u0001\u0000\u0000\u05ff\u0601\u0003\u011a\u008d\u0000"+
                    "\u0600\u05ff\u0001\u0000\u0000\u0000\u0600\u0601\u0001\u0000\u0000\u0000"+
                    "\u0601\u0603\u0001\u0000\u0000\u0000\u0602\u0604\u0003\u017c\u00be\u0000"+
                    "\u0603\u0602\u0001\u0000\u0000\u0000\u0603\u0604\u0001\u0000\u0000\u0000"+
                    "\u0604\u0606\u0001\u0000\u0000\u0000\u0605\u0607\u0003\u0116\u008b\u0000"+
                    "\u0606\u0605\u0001\u0000\u0000\u0000\u0606\u0607\u0001\u0000\u0000\u0000"+
                    "\u0607\u0609\u0001\u0000\u0000\u0000\u0608\u060a\u0003\u0114\u008a\u0000"+
                    "\u0609\u0608\u0001\u0000\u0000\u0000\u0609\u060a\u0001\u0000\u0000\u0000"+
                    "\u060a\u060c\u0001\u0000\u0000\u0000\u060b\u060d\u0003\u0118\u008c\u0000"+
                    "\u060c\u060b\u0001\u0000\u0000\u0000\u060c\u060d\u0001\u0000\u0000\u0000"+
                    "\u060d\u060f\u0001\u0000\u0000\u0000\u060e\u0610\u0003\u011c\u008e\u0000"+
                    "\u060f\u060e\u0001\u0000\u0000\u0000\u060f\u0610\u0001\u0000\u0000\u0000"+
                    "\u0610\u0612\u0001\u0000\u0000\u0000\u0611\u0613\u0003\u011e\u008f\u0000"+
                    "\u0612\u0611\u0001\u0000\u0000\u0000\u0612\u0613\u0001\u0000\u0000\u0000"+
                    "\u0613\u0615\u0001\u0000\u0000\u0000\u0614\u0616\u0003\u0120\u0090\u0000"+
                    "\u0615\u0614\u0001\u0000\u0000\u0000\u0615\u0616\u0001\u0000\u0000\u0000"+
                    "\u0616\u0618\u0001\u0000\u0000\u0000\u0617\u0619\u0003\u0122\u0091\u0000"+
                    "\u0618\u0617\u0001\u0000\u0000\u0000\u0618\u0619\u0001\u0000\u0000\u0000"+
                    "\u0619\u061a\u0001\u0000\u0000\u0000\u061a\u061b\u0005\u0002\u0000\u0000"+
                    "\u061b\u061c\u0005\u0004\u0000\u0000\u061c\u0113\u0001\u0000\u0000\u0000"+
                    "\u061d\u061e\u0005b\u0000\u0000\u061e\u061f\u0005\u0003\u0000\u0000\u061f"+
                    "\u0620\u0005\r\u0000\u0000\u0620\u0621\u0005\u0004\u0000\u0000\u0621\u0115"+
                    "\u0001\u0000\u0000\u0000\u0622\u0623\u0005c\u0000\u0000\u0623\u0624\u0005"+
                    "\u0003\u0000\u0000\u0624\u0625\u0005\u0097\u0000\u0000\u0625\u0626\u0005"+
                    "\u0004\u0000\u0000\u0626\u0117\u0001\u0000\u0000\u0000\u0627\u0628\u0005"+
                    "d\u0000\u0000\u0628\u0629\u0005\u0003\u0000\u0000\u0629\u062a\u0005\r"+
                    "\u0000\u0000\u062a\u062b\u0005\u0004\u0000\u0000\u062b\u0119\u0001\u0000"+
                    "\u0000\u0000\u062c\u062d\u0005e\u0000\u0000\u062d\u062e\u0005\u0003\u0000"+
                    "\u0000\u062e\u062f\u0007\u0000\u0000\u0000\u062f\u0630\u0005\u0004\u0000"+
                    "\u0000\u0630\u011b\u0001\u0000\u0000\u0000\u0631\u0632\u0005f\u0000\u0000"+
                    "\u0632\u0633\u0005\u0003\u0000\u0000\u0633\u0634\u0005\r\u0000\u0000\u0634"+
                    "\u0635\u0005\u0004\u0000\u0000\u0635\u011d\u0001\u0000\u0000\u0000\u0636"+
                    "\u0637\u0005g\u0000\u0000\u0637\u0638\u0005\u0003\u0000\u0000\u0638\u0639"+
                    "\u0005\r\u0000\u0000\u0639\u063a\u0005\u0004\u0000\u0000\u063a\u011f\u0001"+
                    "\u0000\u0000\u0000\u063b\u063c\u0005h\u0000\u0000\u063c\u063d\u0005\u0003"+
                    "\u0000\u0000\u063d\u063e\u0003\u0180\u00c0\u0000\u063e\u063f\u0005\u0004"+
                    "\u0000\u0000\u063f\u0121\u0001\u0000\u0000\u0000\u0640\u0641\u0005i\u0000"+
                    "\u0000\u0641\u0642\u0005\u0003\u0000\u0000\u0642\u0646\u0005\u0001\u0000"+
                    "\u0000\u0643\u0645\u0003\u0124\u0092\u0000\u0644\u0643\u0001\u0000\u0000"+
                    "\u0000\u0645\u0648\u0001\u0000\u0000\u0000\u0646\u0644\u0001\u0000\u0000"+
                    "\u0000\u0646\u0647\u0001\u0000\u0000\u0000\u0647\u0649\u0001\u0000\u0000"+
                    "\u0000\u0648\u0646\u0001\u0000\u0000\u0000\u0649\u064a\u0005\u0002\u0000"+
                    "\u0000\u064a\u064b\u0005\u0004\u0000\u0000\u064b\u0123\u0001\u0000\u0000"+
                    "\u0000\u064c\u064d\u0005\u0095\u0000\u0000\u064d\u064e\u0005\u0003\u0000"+
                    "\u0000\u064e\u0650\u0005\u0001\u0000\u0000\u064f\u0651\u0003\u0126\u0093"+
                    "\u0000\u0650\u064f\u0001\u0000\u0000\u0000\u0650\u0651\u0001\u0000\u0000"+
                    "\u0000\u0651\u0653\u0001\u0000\u0000\u0000\u0652\u0654\u0003\u0128\u0094"+
                    "\u0000\u0653\u0652\u0001\u0000\u0000\u0000\u0653\u0654\u0001\u0000\u0000"+
                    "\u0000\u0654\u0656\u0001\u0000\u0000\u0000\u0655\u0657\u0003\u012a\u0095"+
                    "\u0000\u0656\u0655\u0001\u0000\u0000\u0000\u0656\u0657\u0001\u0000\u0000"+
                    "\u0000\u0657\u0659\u0001\u0000\u0000\u0000\u0658\u065a\u0003\u012c\u0096"+
                    "\u0000\u0659\u0658\u0001\u0000\u0000\u0000\u0659\u065a\u0001\u0000\u0000"+
                    "\u0000\u065a\u065c\u0001\u0000\u0000\u0000\u065b\u065d\u0003\u0114\u008a"+
                    "\u0000\u065c\u065b\u0001\u0000\u0000\u0000\u065c\u065d\u0001\u0000\u0000"+
                    "\u0000\u065d\u065f\u0001\u0000\u0000\u0000\u065e\u0660\u0003\u012e\u0097"+
                    "\u0000\u065f\u065e\u0001\u0000\u0000\u0000\u065f\u0660\u0001\u0000\u0000"+
                    "\u0000\u0660\u0662\u0001\u0000\u0000\u0000\u0661\u0663\u0003\u0176\u00bb"+
                    "\u0000\u0662\u0661\u0001\u0000\u0000\u0000\u0662\u0663\u0001\u0000\u0000"+
                    "\u0000\u0663\u0665\u0001\u0000\u0000\u0000\u0664\u0666\u0003\u0128\u0094"+
                    "\u0000\u0665\u0664\u0001\u0000\u0000\u0000\u0665\u0666\u0001\u0000\u0000"+
                    "\u0000\u0666\u0667\u0001\u0000\u0000\u0000\u0667\u0668\u0005\u0002\u0000"+
                    "\u0000\u0668\u0669\u0005\u0004\u0000\u0000\u0669\u0125\u0001\u0000\u0000"+
                    "\u0000\u066a\u066b\u0005j\u0000\u0000\u066b\u066c\u0005\u0003\u0000\u0000"+
                    "\u066c\u066d\u0005\u0097\u0000\u0000\u066d\u066e\u0005\u0004\u0000\u0000"+
                    "\u066e\u0127\u0001\u0000\u0000\u0000\u066f\u0670\u0005k\u0000\u0000\u0670"+
                    "\u0671\u0005\u0003\u0000\u0000\u0671\u0672\u0005\u0095\u0000\u0000\u0672"+
                    "\u0673\u0005\u0004\u0000\u0000\u0673\u0129\u0001\u0000\u0000\u0000\u0674"+
                    "\u0675\u0005l\u0000\u0000\u0675\u0676\u0005\u0003\u0000\u0000\u0676\u0677"+
                    "\u0003\u017e\u00bf\u0000\u0677\u0678\u0005\u0004\u0000\u0000\u0678\u012b"+
                    "\u0001\u0000\u0000\u0000\u0679\u067a\u0005m\u0000\u0000\u067a\u067b\u0005"+
                    "\u0003\u0000\u0000\u067b\u067c\u0003\u017e\u00bf\u0000\u067c\u067d\u0005"+
                    "\u0004\u0000\u0000\u067d\u012d\u0001\u0000\u0000\u0000\u067e\u067f\u0005"+
                    "n\u0000\u0000\u067f\u0680\u0005\u0003\u0000\u0000\u0680\u0681\u0005\u0097"+
                    "\u0000\u0000\u0681\u0682\u0005\u0004\u0000\u0000\u0682\u012f\u0001\u0000"+
                    "\u0000\u0000\u0683\u0684\u0005o\u0000\u0000\u0684\u0685\u0005\u0003\u0000"+
                    "\u0000\u0685\u0686\u0005\u0096\u0000\u0000\u0686\u0687\u0005\u0004\u0000"+
                    "\u0000\u0687\u0131\u0001\u0000\u0000\u0000\u0688\u0689\u0005p\u0000\u0000"+
                    "\u0689\u068a\u0005\u0003\u0000\u0000\u068a\u068b\u0005\u0097\u0000\u0000"+
                    "\u068b\u068c\u0005\u0004\u0000\u0000\u068c\u0133\u0001\u0000\u0000\u0000"+
                    "\u068d\u068e\u0005q\u0000\u0000\u068e\u068f\u0005\u0003\u0000\u0000\u068f"+
                    "\u0690\u0005\r\u0000\u0000\u0690\u0691\u0005\u0004\u0000\u0000\u0691\u0135"+
                    "\u0001\u0000\u0000\u0000\u0692\u0693\u0005r\u0000\u0000\u0693\u0694\u0005"+
                    "\u0003\u0000\u0000\u0694\u0695\u0003\u00e2q\u0000\u0695\u0696\u0005\u0004"+
                    "\u0000\u0000\u0696\u0137\u0001\u0000\u0000\u0000\u0697\u0698\u0005s\u0000"+
                    "\u0000\u0698\u0699\u0005\u0003\u0000\u0000\u0699\u069a\u0005\u0095\u0000"+
                    "\u0000\u069a\u069b\u0005\u0004\u0000\u0000\u069b\u0139\u0001\u0000\u0000"+
                    "\u0000\u069c\u069d\u0005t\u0000\u0000\u069d\u069e\u0005\u0003\u0000\u0000"+
                    "\u069e\u069f\u0005\u0095\u0000\u0000\u069f\u06a0\u0005\u0004\u0000\u0000"+
                    "\u06a0\u013b\u0001\u0000\u0000\u0000\u06a1\u06a2\u0005u\u0000\u0000\u06a2"+
                    "\u06a3\u0005\u0003\u0000\u0000\u06a3\u06a4\u0003\u00e0p\u0000\u06a4\u06a5"+
                    "\u0005\u0004\u0000\u0000\u06a5\u013d\u0001\u0000\u0000\u0000\u06a6\u06a7"+
                    "\u0005v\u0000\u0000\u06a7\u06a8\u0005\u0003\u0000\u0000\u06a8\u06a9\u0003"+
                    "\u017e\u00bf\u0000\u06a9\u06aa\u0005\u0004\u0000\u0000\u06aa\u013f\u0001"+
                    "\u0000\u0000\u0000\u06ab\u06ac\u0005w\u0000\u0000\u06ac\u06ad\u0005\u0003"+
                    "\u0000\u0000\u06ad\u06ae\u0003\u0180\u00c0\u0000\u06ae\u06af\u0005\u0004"+
                    "\u0000\u0000\u06af\u06b8\u0001\u0000\u0000\u0000\u06b0\u06b1\u0005w\u0000"+
                    "\u0000\u06b1\u06b2\u0005\u0003\u0000\u0000\u06b2\u06b3\u0005\u0005\u0000"+
                    "\u0000\u06b3\u06b4\u0003\u0168\u00b4\u0000\u06b4\u06b5\u0005\u0007\u0000"+
                    "\u0000\u06b5\u06b6\u0005\u0004\u0000\u0000\u06b6\u06b8\u0001\u0000\u0000"+
                    "\u0000\u06b7\u06ab\u0001\u0000\u0000\u0000\u06b7\u06b0\u0001\u0000\u0000"+
                    "\u0000\u06b8\u0141\u0001\u0000\u0000\u0000\u06b9\u06ba\u0005x\u0000\u0000"+
                    "\u06ba\u06bb\u0005\u0003\u0000\u0000\u06bb\u06bc\u0003\u017e\u00bf\u0000"+
                    "\u06bc\u06bd\u0005\u0004\u0000\u0000\u06bd\u0143\u0001\u0000\u0000\u0000"+
                    "\u06be\u06bf\u0005y\u0000\u0000\u06bf\u06c0\u0005\u0003\u0000\u0000\u06c0"+
                    "\u06c1\u0003\u00e0p\u0000\u06c1\u06c2\u0005\u0004\u0000\u0000\u06c2\u0145"+
                    "\u0001\u0000\u0000\u0000\u06c3\u06c4\u0005z\u0000\u0000\u06c4\u06c5\u0005"+
                    "\u0003\u0000\u0000\u06c5\u06c6\u0003\u00e2q\u0000\u06c6\u06c7\u0005\u0004"+
                    "\u0000\u0000\u06c7\u0147\u0001\u0000\u0000\u0000\u06c8\u06c9\u0005{\u0000"+
                    "\u0000\u06c9\u06ca\u0005\u0003\u0000\u0000\u06ca\u06cb\u0003\u00e2q\u0000"+
                    "\u06cb\u06cc\u0005\u0004\u0000\u0000\u06cc\u0149\u0001\u0000\u0000\u0000"+
                    "\u06cd\u06ce\u0005|\u0000\u0000\u06ce\u06cf\u0005\u0003\u0000\u0000\u06cf"+
                    "\u06d0\u0003\u00e2q\u0000\u06d0\u06d1\u0005\u0004\u0000\u0000\u06d1\u014b"+
                    "\u0001\u0000\u0000\u0000\u06d2\u06d3\u0005}\u0000\u0000\u06d3\u06d4\u0005"+
                    "\u0003\u0000\u0000\u06d4\u06d5\u0003\u00e2q\u0000\u06d5\u06d6\u0005\u0004"+
                    "\u0000\u0000\u06d6\u014d\u0001\u0000\u0000\u0000\u06d7\u06d8\u0005~\u0000"+
                    "\u0000\u06d8\u06d9\u0005\u0003\u0000\u0000\u06d9\u06da\u0003\u017e\u00bf"+
                    "\u0000\u06da\u06db\u0005\u0004\u0000\u0000\u06db\u014f\u0001\u0000\u0000"+
                    "\u0000\u06dc\u06dd\u0005\u007f\u0000\u0000\u06dd\u06de\u0005\u0003\u0000"+
                    "\u0000\u06de\u06df\u0005\u0096\u0000\u0000\u06df\u06e0\u0005\u0004\u0000"+
                    "\u0000\u06e0\u0151\u0001\u0000\u0000\u0000\u06e1\u06e2\u0005\u0080\u0000"+
                    "\u0000\u06e2\u06e3\u0005\u0003\u0000\u0000\u06e3\u06e4\u0003\u017e\u00bf"+
                    "\u0000\u06e4\u06e5\u0005\u0004\u0000\u0000\u06e5\u0153\u0001\u0000\u0000"+
                    "\u0000\u06e6\u06e7\u0005\u0081\u0000\u0000\u06e7\u06e8\u0005\u0003\u0000"+
                    "\u0000\u06e8\u06e9\u0005\r\u0000\u0000\u06e9\u06ea\u0005\u0004\u0000\u0000"+
                    "\u06ea\u0155\u0001\u0000\u0000\u0000\u06eb\u06ec\u0005\u0082\u0000\u0000"+
                    "\u06ec\u06ed\u0005\u0003\u0000\u0000\u06ed\u06ee\u0005\u0095\u0000\u0000"+
                    "\u06ee\u06ef\u0005\u0004\u0000\u0000\u06ef\u0157\u0001\u0000\u0000\u0000"+
                    "\u06f0\u06f1\u0005\u0083\u0000\u0000\u06f1\u06f2\u0005\u0003\u0000\u0000"+
                    "\u06f2\u06f3\u0005\u0095\u0000\u0000\u06f3\u06f4\u0005\u0004\u0000\u0000"+
                    "\u06f4\u0159\u0001\u0000\u0000\u0000\u06f5\u06f6\u0005\u0084\u0000\u0000"+
                    "\u06f6\u06f7\u0005\u0003\u0000\u0000\u06f7\u06f8\u0003\u0180\u00c0\u0000"+
                    "\u06f8\u06f9\u0005\u0004\u0000\u0000\u06f9\u015b\u0001\u0000\u0000\u0000"+
                    "\u06fa\u06fb\u0005\u0085\u0000\u0000\u06fb\u06fc\u0005\u0003\u0000\u0000"+
                    "\u06fc\u06fd\u0005\u0095\u0000\u0000\u06fd\u06fe\u0005\u0004\u0000\u0000"+
                    "\u06fe\u015d\u0001\u0000\u0000\u0000\u06ff\u0700\u0005\u0086\u0000\u0000"+
                    "\u0700\u0701\u0005\u0003\u0000\u0000\u0701\u0702\u0005\u0095\u0000\u0000"+
                    "\u0702\u0703\u0005\u0004\u0000\u0000\u0703\u015f\u0001\u0000\u0000\u0000"+
                    "\u0704\u0705\u0005\u0087\u0000\u0000\u0705\u0706\u0005\u0003\u0000\u0000"+
                    "\u0706\u070a\u0005\u0001\u0000\u0000\u0707\u0709\u0003\u016c\u00b6\u0000"+
                    "\u0708\u0707\u0001\u0000\u0000\u0000\u0709\u070c\u0001\u0000\u0000\u0000"+
                    "\u070a\u0708\u0001\u0000\u0000\u0000\u070a\u070b\u0001\u0000\u0000\u0000"+
                    "\u070b\u070d\u0001\u0000\u0000\u0000\u070c\u070a\u0001\u0000\u0000\u0000"+
                    "\u070d\u070e\u0005\u0002\u0000\u0000\u070e\u070f\u0005\u0004\u0000\u0000"+
                    "\u070f\u0161\u0001\u0000\u0000\u0000\u0710\u0711\u0005\u0088\u0000\u0000"+
                    "\u0711\u0712\u0005\u0003\u0000\u0000\u0712\u0713\u0003\u00e0p\u0000\u0713"+
                    "\u0714\u0005\u0004\u0000\u0000\u0714\u0163\u0001\u0000\u0000\u0000\u0715"+
                    "\u0716\u0005\u0089\u0000\u0000\u0716\u0717\u0005\u0003\u0000\u0000\u0717"+
                    "\u0718\u0003\u017e\u00bf\u0000\u0718\u0719\u0005\u0004\u0000\u0000\u0719"+
                    "\u0165\u0001\u0000\u0000\u0000\u071a\u071b\u0005\u008a\u0000\u0000\u071b"+
                    "\u071c\u0005\u0003\u0000\u0000\u071c\u071d\u0005\r\u0000\u0000\u071d\u071e"+
                    "\u0005\u0004\u0000\u0000\u071e\u0167\u0001\u0000\u0000\u0000\u071f\u0721"+
                    "\u0003\u016a\u00b5\u0000\u0720\u071f\u0001\u0000\u0000\u0000\u0721\u0724"+
                    "\u0001\u0000\u0000\u0000\u0722\u0720\u0001\u0000\u0000\u0000\u0722\u0723"+
                    "\u0001\u0000\u0000\u0000\u0723\u0169\u0001\u0000\u0000\u0000\u0724\u0722"+
                    "\u0001\u0000\u0000\u0000\u0725\u0726\u0005\u0001\u0000\u0000\u0726\u0727"+
                    "\u0005\u008b\u0000\u0000\u0727\u0728\u0005\u0003\u0000\u0000\u0728\u0729"+
                    "\u0005\u0095\u0000\u0000\u0729\u072a\u0005\u0004\u0000\u0000\u072a\u072b"+
                    "\u0005\u008c\u0000\u0000\u072b\u072c\u0005\u0003\u0000\u0000\u072c\u072d"+
                    "\u0005\u0095\u0000\u0000\u072d\u072e\u0005\u0004\u0000\u0000\u072e\u072f"+
                    "\u0005\u0002\u0000\u0000\u072f\u0730\u0005\u0006\u0000\u0000\u0730\u016b"+
                    "\u0001\u0000\u0000\u0000\u0731\u0732\u0003\u0180\u00c0\u0000\u0732\u0733"+
                    "\u0005\u0003\u0000\u0000\u0733\u0734\u0003\u0180\u00c0\u0000\u0734\u0735"+
                    "\u0005\u0004\u0000\u0000\u0735\u075b\u0001\u0000\u0000\u0000\u0736\u0737"+
                    "\u0003\u0180\u00c0\u0000\u0737\u0738\u0005\u0003\u0000\u0000\u0738\u0739"+
                    "\u0005\r\u0000\u0000\u0739\u073a\u0005\u0004\u0000\u0000\u073a\u075b\u0001"+
                    "\u0000\u0000\u0000\u073b\u073c\u0003\u0180\u00c0\u0000\u073c\u073d\u0005"+
                    "\u0003\u0000\u0000\u073d\u073e\u0005\u0099\u0000\u0000\u073e\u073f\u0005"+
                    "\u0004\u0000\u0000\u073f\u075b\u0001\u0000\u0000\u0000\u0740\u0741\u0003"+
                    "\u0180\u00c0\u0000\u0741\u0742\u0005\u0003\u0000\u0000\u0742\u0743\u0005"+
                    "\u0001\u0000\u0000\u0743\u0744\u0003\u016c\u00b6\u0000\u0744\u0745\u0005"+
                    "\u0002\u0000\u0000\u0745\u0746\u0005\u0004\u0000\u0000\u0746\u075b\u0001"+
                    "\u0000\u0000\u0000\u0747\u0748\u0003\u0180\u00c0\u0000\u0748\u0749\u0005"+
                    "\u0003\u0000\u0000\u0749\u074b\u0005\u0005\u0000\u0000\u074a\u074c\u0003"+
                    "\u0180\u00c0\u0000\u074b\u074a\u0001\u0000\u0000\u0000\u074b\u074c\u0001"+
                    "\u0000\u0000\u0000\u074c\u0751\u0001\u0000\u0000\u0000\u074d\u074e\u0005"+
                    "\u0006\u0000\u0000\u074e\u0750\u0003\u0180\u00c0\u0000\u074f\u074d\u0001"+
                    "\u0000\u0000\u0000\u0750\u0753\u0001\u0000\u0000\u0000\u0751\u074f\u0001"+
                    "\u0000\u0000\u0000\u0751\u0752\u0001\u0000\u0000\u0000\u0752\u0755\u0001"+
                    "\u0000\u0000\u0000\u0753\u0751\u0001\u0000\u0000\u0000\u0754\u0756\u0005"+
                    "\u0006\u0000\u0000\u0755\u0754\u0001\u0000\u0000\u0000\u0755\u0756\u0001"+
                    "\u0000\u0000\u0000\u0756\u0757\u0001\u0000\u0000\u0000\u0757\u0758\u0005"+
                    "\u0007\u0000\u0000\u0758\u0759\u0005\u0004\u0000\u0000\u0759\u075b\u0001"+
                    "\u0000\u0000\u0000\u075a\u0731\u0001\u0000\u0000\u0000\u075a\u0736\u0001"+
                    "\u0000\u0000\u0000\u075a\u073b\u0001\u0000\u0000\u0000\u075a\u0740\u0001"+
                    "\u0000\u0000\u0000\u075a\u0747\u0001\u0000\u0000\u0000\u075b\u016d\u0001"+
                    "\u0000\u0000\u0000\u075c\u075d\u0005\u008d\u0000\u0000\u075d\u075e\u0005"+
                    "\u0003\u0000\u0000\u075e\u075f\u0003\u00e0p\u0000\u075f\u0760\u0005\u0004"+
                    "\u0000\u0000\u0760\u016f\u0001\u0000\u0000\u0000\u0761\u0762\u0005\u008e"+
                    "\u0000\u0000\u0762\u0763\u0005\u0003\u0000\u0000\u0763\u0764\u0005\r\u0000"+
                    "\u0000\u0764\u0765\u0005\u0004\u0000\u0000\u0765\u0171\u0001\u0000\u0000"+
                    "\u0000\u0766\u0767\u0005\u008f\u0000\u0000\u0767\u0768\u0005\u0003\u0000"+
                    "\u0000\u0768\u0769\u0003\u017e\u00bf\u0000\u0769\u076a\u0005\u0004\u0000"+
                    "\u0000\u076a\u0173\u0001\u0000\u0000\u0000\u076b\u076c\u0005\u0090\u0000"+
                    "\u0000\u076c\u076d\u0005\u0003\u0000\u0000\u076d\u0771\u0005\u0001\u0000"+
                    "\u0000\u076e\u0770\u0003\u016c\u00b6\u0000\u076f\u076e\u0001\u0000\u0000"+
                    "\u0000\u0770\u0773\u0001\u0000\u0000\u0000\u0771\u076f\u0001\u0000\u0000"+
                    "\u0000\u0771\u0772\u0001\u0000\u0000\u0000\u0772\u0774\u0001\u0000\u0000"+
                    "\u0000\u0773\u0771\u0001\u0000\u0000\u0000\u0774\u0775\u0005\u0002\u0000"+
                    "\u0000\u0775\u0776\u0005\u0004\u0000\u0000\u0776\u0175\u0001\u0000\u0000"+
                    "\u0000\u0777\u0778\u0005\u0091\u0000\u0000\u0778\u0779\u0005\u0003\u0000"+
                    "\u0000\u0779\u077d\u0005\u0001\u0000\u0000\u077a\u077c\u0003\u016c\u00b6"+
                    "\u0000\u077b\u077a\u0001\u0000\u0000\u0000\u077c\u077f\u0001\u0000\u0000"+
                    "\u0000\u077d\u077b\u0001\u0000\u0000\u0000\u077d\u077e\u0001\u0000\u0000"+
                    "\u0000\u077e\u0780\u0001\u0000\u0000\u0000\u077f\u077d\u0001\u0000\u0000"+
                    "\u0000\u0780\u0781\u0005\u0002\u0000\u0000\u0781\u0782\u0005\u0004\u0000"+
                    "\u0000\u0782\u0177\u0001\u0000\u0000\u0000\u0783\u0784\u0005\u0092\u0000"+
                    "\u0000\u0784\u0785\u0005\u0003\u0000\u0000\u0785\u0786\u0005\u0095\u0000"+
                    "\u0000\u0786\u0787\u0005\u0004\u0000\u0000\u0787\u0179\u0001\u0000\u0000"+
                    "\u0000\u0788\u0789\u0005\u0093\u0000\u0000\u0789\u078a\u0005\u0003\u0000"+
                    "\u0000\u078a\u078b\u0005\u0097\u0000\u0000\u078b\u078c\u0005\u0004\u0000"+
                    "\u0000\u078c\u017b\u0001\u0000\u0000\u0000\u078d\u078e\u0005\u0094\u0000"+
                    "\u0000\u078e\u078f\u0005\u0003\u0000\u0000\u078f\u0790\u0003\u0180\u00c0"+
                    "\u0000\u0790\u0791\u0005\u0004\u0000\u0000\u0791\u017d\u0001\u0000\u0000"+
                    "\u0000\u0792\u0799\u0005\u0097\u0000\u0000\u0793\u0799\u0005\u0096\u0000"+
                    "\u0000\u0794\u0799\u0005\u0012\u0000\u0000\u0795\u0799\u0005\n\u0000\u0000"+
                    "\u0796\u0799\u0005\u000b\u0000\u0000\u0797\u0799\u0003\u0182\u00c1\u0000"+
                    "\u0798\u0792\u0001\u0000\u0000\u0000\u0798\u0793\u0001\u0000\u0000\u0000"+
                    "\u0798\u0794\u0001\u0000\u0000\u0000\u0798\u0795\u0001\u0000\u0000\u0000"+
                    "\u0798\u0796\u0001\u0000\u0000\u0000\u0798\u0797\u0001\u0000\u0000\u0000"+
                    "\u0799\u017f\u0001\u0000\u0000\u0000\u079a\u079e\u0003\u017e\u00bf\u0000"+
                    "\u079b\u079e\u0005\r\u0000\u0000\u079c\u079e\u0005\u0098\u0000\u0000\u079d"+
                    "\u079a\u0001\u0000\u0000\u0000\u079d\u079b\u0001\u0000\u0000\u0000\u079d"+
                    "\u079c\u0001\u0000\u0000\u0000\u079e\u0181\u0001\u0000\u0000\u0000\u079f"+
                    "\u07a0\u0007\u0001\u0000\u0000\u07a0\u0183\u0001\u0000\u0000\u0000\u009c"+
                    "\u01a2\u01a5\u01a8\u01ab\u01ae\u01b1\u01b4\u01b7\u01bb\u01be\u01c1\u01c5"+
                    "\u01c8\u01cb\u01ce\u01d1\u01d4\u01d7\u01dc\u01df\u01e2\u01ef\u01f4\u01f9"+
                    "\u01fe\u0203\u0208\u020d\u0212\u0217\u021c\u0221\u0226\u022b\u0230\u0235"+
                    "\u023a\u023f\u0244\u0249\u024e\u0253\u0258\u025d\u0262\u0267\u0270\u0273"+
                    "\u0278\u0282\u0285\u0288\u028b\u028e\u0299\u02a0\u02a3\u02ad\u02b0\u02c6"+
                    "\u02ca\u02cd\u02d8\u02db\u02de\u02e1\u02e4\u02e7\u02ea\u02ed\u02f0\u02f3"+
                    "\u02f6\u02f9\u02fc\u02ff\u0302\u0305\u0308\u031d\u0320\u0323\u0326\u0329"+
                    "\u032d\u0330\u0333\u034a\u034d\u0352\u0355\u0359\u0374\u0378\u037b\u037e"+
                    "\u0381\u0385\u0389\u038c\u0390\u0393\u039f\u03b6\u03bb\u03be\u03c1\u03c4"+
                    "\u03c7\u03cd\u03f2\u03f5\u03f8\u03fb\u03fe\u0401\u040d\u0418\u0426\u0439"+
                    "\u0446\u053a\u056d\u057a\u057e\u0582\u0589\u0600\u0603\u0606\u0609\u060c"+
                    "\u060f\u0612\u0615\u0618\u0646\u0650\u0653\u0656\u0659\u065c\u065f\u0662"+
                    "\u0665\u06b7\u070a\u0722\u074b\u0751\u0755\u075a\u0771\u077d\u0798\u079d";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}