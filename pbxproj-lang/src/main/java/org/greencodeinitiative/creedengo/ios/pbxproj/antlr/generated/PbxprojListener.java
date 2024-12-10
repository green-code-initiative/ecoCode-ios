/*
 * ecoCode iOS plugin - Help the earth, adopt this green plugin for your applications
 * Copyright © 2023 green-code-initiative (https://www.ecocode.io/)
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
// Generated from io/ecocode/ios/pbxproj/antlr/Pbxproj.g4 by ANTLR 4.10
package io.ecocode.ios.pbxproj.antlr.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PbxprojParser}.
 */
public interface PbxprojListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link PbxprojParser#start}.
     * @param ctx the parse tree
     */
    void enterStart(PbxprojParser.StartContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#start}.
     * @param ctx the parse tree
     */
    void exitStart(PbxprojParser.StartContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#root_element}.
     * @param ctx the parse tree
     */
    void enterRoot_element(PbxprojParser.Root_elementContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#root_element}.
     * @param ctx the parse tree
     */
    void exitRoot_element(PbxprojParser.Root_elementContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#archive_version}.
     * @param ctx the parse tree
     */
    void enterArchive_version(PbxprojParser.Archive_versionContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#archive_version}.
     * @param ctx the parse tree
     */
    void exitArchive_version(PbxprojParser.Archive_versionContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#classes}.
     * @param ctx the parse tree
     */
    void enterClasses(PbxprojParser.ClassesContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#classes}.
     * @param ctx the parse tree
     */
    void exitClasses(PbxprojParser.ClassesContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#object_version}.
     * @param ctx the parse tree
     */
    void enterObject_version(PbxprojParser.Object_versionContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#object_version}.
     * @param ctx the parse tree
     */
    void exitObject_version(PbxprojParser.Object_versionContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#objects}.
     * @param ctx the parse tree
     */
    void enterObjects(PbxprojParser.ObjectsContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#objects}.
     * @param ctx the parse tree
     */
    void exitObjects(PbxprojParser.ObjectsContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#root_object}.
     * @param ctx the parse tree
     */
    void enterRoot_object(PbxprojParser.Root_objectContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#root_object}.
     * @param ctx the parse tree
     */
    void exitRoot_object(PbxprojParser.Root_objectContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#pbx_aggregate_target_section}.
     * @param ctx the parse tree
     */
    void enterPbx_aggregate_target_section(PbxprojParser.Pbx_aggregate_target_sectionContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#pbx_aggregate_target_section}.
     * @param ctx the parse tree
     */
    void exitPbx_aggregate_target_section(PbxprojParser.Pbx_aggregate_target_sectionContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#pbx_build_file_section}.
     * @param ctx the parse tree
     */
    void enterPbx_build_file_section(PbxprojParser.Pbx_build_file_sectionContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#pbx_build_file_section}.
     * @param ctx the parse tree
     */
    void exitPbx_build_file_section(PbxprojParser.Pbx_build_file_sectionContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#pbx_build_rule_section}.
     * @param ctx the parse tree
     */
    void enterPbx_build_rule_section(PbxprojParser.Pbx_build_rule_sectionContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#pbx_build_rule_section}.
     * @param ctx the parse tree
     */
    void exitPbx_build_rule_section(PbxprojParser.Pbx_build_rule_sectionContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#pbx_build_style_section}.
     * @param ctx the parse tree
     */
    void enterPbx_build_style_section(PbxprojParser.Pbx_build_style_sectionContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#pbx_build_style_section}.
     * @param ctx the parse tree
     */
    void exitPbx_build_style_section(PbxprojParser.Pbx_build_style_sectionContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#pbx_container_item_proxy_section}.
     * @param ctx the parse tree
     */
    void enterPbx_container_item_proxy_section(PbxprojParser.Pbx_container_item_proxy_sectionContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#pbx_container_item_proxy_section}.
     * @param ctx the parse tree
     */
    void exitPbx_container_item_proxy_section(PbxprojParser.Pbx_container_item_proxy_sectionContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#pbx_copy_files_build_phase_section}.
     * @param ctx the parse tree
     */
    void enterPbx_copy_files_build_phase_section(PbxprojParser.Pbx_copy_files_build_phase_sectionContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#pbx_copy_files_build_phase_section}.
     * @param ctx the parse tree
     */
    void exitPbx_copy_files_build_phase_section(PbxprojParser.Pbx_copy_files_build_phase_sectionContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#pbx_file_reference_section}.
     * @param ctx the parse tree
     */
    void enterPbx_file_reference_section(PbxprojParser.Pbx_file_reference_sectionContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#pbx_file_reference_section}.
     * @param ctx the parse tree
     */
    void exitPbx_file_reference_section(PbxprojParser.Pbx_file_reference_sectionContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#pbx_frameworks_build_phase_section}.
     * @param ctx the parse tree
     */
    void enterPbx_frameworks_build_phase_section(PbxprojParser.Pbx_frameworks_build_phase_sectionContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#pbx_frameworks_build_phase_section}.
     * @param ctx the parse tree
     */
    void exitPbx_frameworks_build_phase_section(PbxprojParser.Pbx_frameworks_build_phase_sectionContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#pbx_group_section}.
     * @param ctx the parse tree
     */
    void enterPbx_group_section(PbxprojParser.Pbx_group_sectionContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#pbx_group_section}.
     * @param ctx the parse tree
     */
    void exitPbx_group_section(PbxprojParser.Pbx_group_sectionContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#pbx_headers_build_phase_section}.
     * @param ctx the parse tree
     */
    void enterPbx_headers_build_phase_section(PbxprojParser.Pbx_headers_build_phase_sectionContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#pbx_headers_build_phase_section}.
     * @param ctx the parse tree
     */
    void exitPbx_headers_build_phase_section(PbxprojParser.Pbx_headers_build_phase_sectionContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#pbx_native_target_section}.
     * @param ctx the parse tree
     */
    void enterPbx_native_target_section(PbxprojParser.Pbx_native_target_sectionContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#pbx_native_target_section}.
     * @param ctx the parse tree
     */
    void exitPbx_native_target_section(PbxprojParser.Pbx_native_target_sectionContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#pbx_legacy_target_section}.
     * @param ctx the parse tree
     */
    void enterPbx_legacy_target_section(PbxprojParser.Pbx_legacy_target_sectionContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#pbx_legacy_target_section}.
     * @param ctx the parse tree
     */
    void exitPbx_legacy_target_section(PbxprojParser.Pbx_legacy_target_sectionContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#pbx_project_section}.
     * @param ctx the parse tree
     */
    void enterPbx_project_section(PbxprojParser.Pbx_project_sectionContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#pbx_project_section}.
     * @param ctx the parse tree
     */
    void exitPbx_project_section(PbxprojParser.Pbx_project_sectionContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#pbx_reference_proxy_section}.
     * @param ctx the parse tree
     */
    void enterPbx_reference_proxy_section(PbxprojParser.Pbx_reference_proxy_sectionContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#pbx_reference_proxy_section}.
     * @param ctx the parse tree
     */
    void exitPbx_reference_proxy_section(PbxprojParser.Pbx_reference_proxy_sectionContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#pbx_resources_build_phase_section}.
     * @param ctx the parse tree
     */
    void enterPbx_resources_build_phase_section(PbxprojParser.Pbx_resources_build_phase_sectionContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#pbx_resources_build_phase_section}.
     * @param ctx the parse tree
     */
    void exitPbx_resources_build_phase_section(PbxprojParser.Pbx_resources_build_phase_sectionContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#pbx_shell_script_build_phase_section}.
     * @param ctx the parse tree
     */
    void enterPbx_shell_script_build_phase_section(PbxprojParser.Pbx_shell_script_build_phase_sectionContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#pbx_shell_script_build_phase_section}.
     * @param ctx the parse tree
     */
    void exitPbx_shell_script_build_phase_section(PbxprojParser.Pbx_shell_script_build_phase_sectionContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#pbx_shell_build_phase_section}.
     * @param ctx the parse tree
     */
    void enterPbx_shell_build_phase_section(PbxprojParser.Pbx_shell_build_phase_sectionContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#pbx_shell_build_phase_section}.
     * @param ctx the parse tree
     */
    void exitPbx_shell_build_phase_section(PbxprojParser.Pbx_shell_build_phase_sectionContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#pbx_sources_build_phase_section}.
     * @param ctx the parse tree
     */
    void enterPbx_sources_build_phase_section(PbxprojParser.Pbx_sources_build_phase_sectionContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#pbx_sources_build_phase_section}.
     * @param ctx the parse tree
     */
    void exitPbx_sources_build_phase_section(PbxprojParser.Pbx_sources_build_phase_sectionContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#pbx_target_dependency_section}.
     * @param ctx the parse tree
     */
    void enterPbx_target_dependency_section(PbxprojParser.Pbx_target_dependency_sectionContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#pbx_target_dependency_section}.
     * @param ctx the parse tree
     */
    void exitPbx_target_dependency_section(PbxprojParser.Pbx_target_dependency_sectionContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#pbx_variant_group_section}.
     * @param ctx the parse tree
     */
    void enterPbx_variant_group_section(PbxprojParser.Pbx_variant_group_sectionContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#pbx_variant_group_section}.
     * @param ctx the parse tree
     */
    void exitPbx_variant_group_section(PbxprojParser.Pbx_variant_group_sectionContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#xc_build_configuration_section}.
     * @param ctx the parse tree
     */
    void enterXc_build_configuration_section(PbxprojParser.Xc_build_configuration_sectionContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#xc_build_configuration_section}.
     * @param ctx the parse tree
     */
    void exitXc_build_configuration_section(PbxprojParser.Xc_build_configuration_sectionContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#xc_configuration_list_section}.
     * @param ctx the parse tree
     */
    void enterXc_configuration_list_section(PbxprojParser.Xc_configuration_list_sectionContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#xc_configuration_list_section}.
     * @param ctx the parse tree
     */
    void exitXc_configuration_list_section(PbxprojParser.Xc_configuration_list_sectionContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#xc_remote_swift_package_reference_section}.
     * @param ctx the parse tree
     */
    void enterXc_remote_swift_package_reference_section(PbxprojParser.Xc_remote_swift_package_reference_sectionContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#xc_remote_swift_package_reference_section}.
     * @param ctx the parse tree
     */
    void exitXc_remote_swift_package_reference_section(PbxprojParser.Xc_remote_swift_package_reference_sectionContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#xc_swift_package_product_dependency_section}.
     * @param ctx the parse tree
     */
    void enterXc_swift_package_product_dependency_section(PbxprojParser.Xc_swift_package_product_dependency_sectionContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#xc_swift_package_product_dependency_section}.
     * @param ctx the parse tree
     */
    void exitXc_swift_package_product_dependency_section(PbxprojParser.Xc_swift_package_product_dependency_sectionContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#xc_version_group_section}.
     * @param ctx the parse tree
     */
    void enterXc_version_group_section(PbxprojParser.Xc_version_group_sectionContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#xc_version_group_section}.
     * @param ctx the parse tree
     */
    void exitXc_version_group_section(PbxprojParser.Xc_version_group_sectionContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#pbx_aggregate_target}.
     * @param ctx the parse tree
     */
    void enterPbx_aggregate_target(PbxprojParser.Pbx_aggregate_targetContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#pbx_aggregate_target}.
     * @param ctx the parse tree
     */
    void exitPbx_aggregate_target(PbxprojParser.Pbx_aggregate_targetContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#pbx_build_file}.
     * @param ctx the parse tree
     */
    void enterPbx_build_file(PbxprojParser.Pbx_build_fileContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#pbx_build_file}.
     * @param ctx the parse tree
     */
    void exitPbx_build_file(PbxprojParser.Pbx_build_fileContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#pbx_build_rule}.
     * @param ctx the parse tree
     */
    void enterPbx_build_rule(PbxprojParser.Pbx_build_ruleContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#pbx_build_rule}.
     * @param ctx the parse tree
     */
    void exitPbx_build_rule(PbxprojParser.Pbx_build_ruleContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#pbx_build_style}.
     * @param ctx the parse tree
     */
    void enterPbx_build_style(PbxprojParser.Pbx_build_styleContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#pbx_build_style}.
     * @param ctx the parse tree
     */
    void exitPbx_build_style(PbxprojParser.Pbx_build_styleContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#pbx_container_item_proxy}.
     * @param ctx the parse tree
     */
    void enterPbx_container_item_proxy(PbxprojParser.Pbx_container_item_proxyContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#pbx_container_item_proxy}.
     * @param ctx the parse tree
     */
    void exitPbx_container_item_proxy(PbxprojParser.Pbx_container_item_proxyContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#pbx_copy_files_build_phase}.
     * @param ctx the parse tree
     */
    void enterPbx_copy_files_build_phase(PbxprojParser.Pbx_copy_files_build_phaseContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#pbx_copy_files_build_phase}.
     * @param ctx the parse tree
     */
    void exitPbx_copy_files_build_phase(PbxprojParser.Pbx_copy_files_build_phaseContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#pbx_file_reference}.
     * @param ctx the parse tree
     */
    void enterPbx_file_reference(PbxprojParser.Pbx_file_referenceContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#pbx_file_reference}.
     * @param ctx the parse tree
     */
    void exitPbx_file_reference(PbxprojParser.Pbx_file_referenceContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#pbx_frameworks_build_phase}.
     * @param ctx the parse tree
     */
    void enterPbx_frameworks_build_phase(PbxprojParser.Pbx_frameworks_build_phaseContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#pbx_frameworks_build_phase}.
     * @param ctx the parse tree
     */
    void exitPbx_frameworks_build_phase(PbxprojParser.Pbx_frameworks_build_phaseContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#pbx_group}.
     * @param ctx the parse tree
     */
    void enterPbx_group(PbxprojParser.Pbx_groupContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#pbx_group}.
     * @param ctx the parse tree
     */
    void exitPbx_group(PbxprojParser.Pbx_groupContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#pbx_headers_build_phase}.
     * @param ctx the parse tree
     */
    void enterPbx_headers_build_phase(PbxprojParser.Pbx_headers_build_phaseContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#pbx_headers_build_phase}.
     * @param ctx the parse tree
     */
    void exitPbx_headers_build_phase(PbxprojParser.Pbx_headers_build_phaseContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#pbx_native_target}.
     * @param ctx the parse tree
     */
    void enterPbx_native_target(PbxprojParser.Pbx_native_targetContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#pbx_native_target}.
     * @param ctx the parse tree
     */
    void exitPbx_native_target(PbxprojParser.Pbx_native_targetContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#pbx_legacy_target}.
     * @param ctx the parse tree
     */
    void enterPbx_legacy_target(PbxprojParser.Pbx_legacy_targetContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#pbx_legacy_target}.
     * @param ctx the parse tree
     */
    void exitPbx_legacy_target(PbxprojParser.Pbx_legacy_targetContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#pbx_project}.
     * @param ctx the parse tree
     */
    void enterPbx_project(PbxprojParser.Pbx_projectContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#pbx_project}.
     * @param ctx the parse tree
     */
    void exitPbx_project(PbxprojParser.Pbx_projectContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#pbx_reference_proxy}.
     * @param ctx the parse tree
     */
    void enterPbx_reference_proxy(PbxprojParser.Pbx_reference_proxyContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#pbx_reference_proxy}.
     * @param ctx the parse tree
     */
    void exitPbx_reference_proxy(PbxprojParser.Pbx_reference_proxyContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#pbx_resources_build_phase}.
     * @param ctx the parse tree
     */
    void enterPbx_resources_build_phase(PbxprojParser.Pbx_resources_build_phaseContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#pbx_resources_build_phase}.
     * @param ctx the parse tree
     */
    void exitPbx_resources_build_phase(PbxprojParser.Pbx_resources_build_phaseContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#pbx_shell_script_build_phase}.
     * @param ctx the parse tree
     */
    void enterPbx_shell_script_build_phase(PbxprojParser.Pbx_shell_script_build_phaseContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#pbx_shell_script_build_phase}.
     * @param ctx the parse tree
     */
    void exitPbx_shell_script_build_phase(PbxprojParser.Pbx_shell_script_build_phaseContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#pbx_shell_build_phase}.
     * @param ctx the parse tree
     */
    void enterPbx_shell_build_phase(PbxprojParser.Pbx_shell_build_phaseContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#pbx_shell_build_phase}.
     * @param ctx the parse tree
     */
    void exitPbx_shell_build_phase(PbxprojParser.Pbx_shell_build_phaseContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#pbx_sources_build_phase}.
     * @param ctx the parse tree
     */
    void enterPbx_sources_build_phase(PbxprojParser.Pbx_sources_build_phaseContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#pbx_sources_build_phase}.
     * @param ctx the parse tree
     */
    void exitPbx_sources_build_phase(PbxprojParser.Pbx_sources_build_phaseContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#pbx_target_dependency}.
     * @param ctx the parse tree
     */
    void enterPbx_target_dependency(PbxprojParser.Pbx_target_dependencyContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#pbx_target_dependency}.
     * @param ctx the parse tree
     */
    void exitPbx_target_dependency(PbxprojParser.Pbx_target_dependencyContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#pbx_variant_group}.
     * @param ctx the parse tree
     */
    void enterPbx_variant_group(PbxprojParser.Pbx_variant_groupContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#pbx_variant_group}.
     * @param ctx the parse tree
     */
    void exitPbx_variant_group(PbxprojParser.Pbx_variant_groupContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#xc_build_configuration}.
     * @param ctx the parse tree
     */
    void enterXc_build_configuration(PbxprojParser.Xc_build_configurationContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#xc_build_configuration}.
     * @param ctx the parse tree
     */
    void exitXc_build_configuration(PbxprojParser.Xc_build_configurationContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#xc_configuration_list}.
     * @param ctx the parse tree
     */
    void enterXc_configuration_list(PbxprojParser.Xc_configuration_listContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#xc_configuration_list}.
     * @param ctx the parse tree
     */
    void exitXc_configuration_list(PbxprojParser.Xc_configuration_listContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#xc_remote_swift_package_reference}.
     * @param ctx the parse tree
     */
    void enterXc_remote_swift_package_reference(PbxprojParser.Xc_remote_swift_package_referenceContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#xc_remote_swift_package_reference}.
     * @param ctx the parse tree
     */
    void exitXc_remote_swift_package_reference(PbxprojParser.Xc_remote_swift_package_referenceContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#xc_swift_package_product_dependency}.
     * @param ctx the parse tree
     */
    void enterXc_swift_package_product_dependency(PbxprojParser.Xc_swift_package_product_dependencyContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#xc_swift_package_product_dependency}.
     * @param ctx the parse tree
     */
    void exitXc_swift_package_product_dependency(PbxprojParser.Xc_swift_package_product_dependencyContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#xc_version_group}.
     * @param ctx the parse tree
     */
    void enterXc_version_group(PbxprojParser.Xc_version_groupContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#xc_version_group}.
     * @param ctx the parse tree
     */
    void exitXc_version_group(PbxprojParser.Xc_version_groupContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#isa_pbx_aggregate_target}.
     * @param ctx the parse tree
     */
    void enterIsa_pbx_aggregate_target(PbxprojParser.Isa_pbx_aggregate_targetContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#isa_pbx_aggregate_target}.
     * @param ctx the parse tree
     */
    void exitIsa_pbx_aggregate_target(PbxprojParser.Isa_pbx_aggregate_targetContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#isa_pbx_build_file}.
     * @param ctx the parse tree
     */
    void enterIsa_pbx_build_file(PbxprojParser.Isa_pbx_build_fileContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#isa_pbx_build_file}.
     * @param ctx the parse tree
     */
    void exitIsa_pbx_build_file(PbxprojParser.Isa_pbx_build_fileContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#isa_pbx_build_rule}.
     * @param ctx the parse tree
     */
    void enterIsa_pbx_build_rule(PbxprojParser.Isa_pbx_build_ruleContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#isa_pbx_build_rule}.
     * @param ctx the parse tree
     */
    void exitIsa_pbx_build_rule(PbxprojParser.Isa_pbx_build_ruleContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#isa_pbx_build_style}.
     * @param ctx the parse tree
     */
    void enterIsa_pbx_build_style(PbxprojParser.Isa_pbx_build_styleContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#isa_pbx_build_style}.
     * @param ctx the parse tree
     */
    void exitIsa_pbx_build_style(PbxprojParser.Isa_pbx_build_styleContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#isa_pbx_container_item_proxy}.
     * @param ctx the parse tree
     */
    void enterIsa_pbx_container_item_proxy(PbxprojParser.Isa_pbx_container_item_proxyContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#isa_pbx_container_item_proxy}.
     * @param ctx the parse tree
     */
    void exitIsa_pbx_container_item_proxy(PbxprojParser.Isa_pbx_container_item_proxyContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#isa_pbx_copy_files_build_phase}.
     * @param ctx the parse tree
     */
    void enterIsa_pbx_copy_files_build_phase(PbxprojParser.Isa_pbx_copy_files_build_phaseContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#isa_pbx_copy_files_build_phase}.
     * @param ctx the parse tree
     */
    void exitIsa_pbx_copy_files_build_phase(PbxprojParser.Isa_pbx_copy_files_build_phaseContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#isa_pbx_file_reference}.
     * @param ctx the parse tree
     */
    void enterIsa_pbx_file_reference(PbxprojParser.Isa_pbx_file_referenceContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#isa_pbx_file_reference}.
     * @param ctx the parse tree
     */
    void exitIsa_pbx_file_reference(PbxprojParser.Isa_pbx_file_referenceContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#isa_pbx_frameworks_build_phase}.
     * @param ctx the parse tree
     */
    void enterIsa_pbx_frameworks_build_phase(PbxprojParser.Isa_pbx_frameworks_build_phaseContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#isa_pbx_frameworks_build_phase}.
     * @param ctx the parse tree
     */
    void exitIsa_pbx_frameworks_build_phase(PbxprojParser.Isa_pbx_frameworks_build_phaseContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#isa_pbx_group}.
     * @param ctx the parse tree
     */
    void enterIsa_pbx_group(PbxprojParser.Isa_pbx_groupContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#isa_pbx_group}.
     * @param ctx the parse tree
     */
    void exitIsa_pbx_group(PbxprojParser.Isa_pbx_groupContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#isa_pbx_header_build_phase}.
     * @param ctx the parse tree
     */
    void enterIsa_pbx_header_build_phase(PbxprojParser.Isa_pbx_header_build_phaseContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#isa_pbx_header_build_phase}.
     * @param ctx the parse tree
     */
    void exitIsa_pbx_header_build_phase(PbxprojParser.Isa_pbx_header_build_phaseContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#isa_pbx_native_target}.
     * @param ctx the parse tree
     */
    void enterIsa_pbx_native_target(PbxprojParser.Isa_pbx_native_targetContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#isa_pbx_native_target}.
     * @param ctx the parse tree
     */
    void exitIsa_pbx_native_target(PbxprojParser.Isa_pbx_native_targetContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#isa_pbx_legacy_target}.
     * @param ctx the parse tree
     */
    void enterIsa_pbx_legacy_target(PbxprojParser.Isa_pbx_legacy_targetContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#isa_pbx_legacy_target}.
     * @param ctx the parse tree
     */
    void exitIsa_pbx_legacy_target(PbxprojParser.Isa_pbx_legacy_targetContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#isa_pbx_project}.
     * @param ctx the parse tree
     */
    void enterIsa_pbx_project(PbxprojParser.Isa_pbx_projectContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#isa_pbx_project}.
     * @param ctx the parse tree
     */
    void exitIsa_pbx_project(PbxprojParser.Isa_pbx_projectContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#isa_pbx_reference_proxy}.
     * @param ctx the parse tree
     */
    void enterIsa_pbx_reference_proxy(PbxprojParser.Isa_pbx_reference_proxyContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#isa_pbx_reference_proxy}.
     * @param ctx the parse tree
     */
    void exitIsa_pbx_reference_proxy(PbxprojParser.Isa_pbx_reference_proxyContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#isa_pbx_resources_build_phase}.
     * @param ctx the parse tree
     */
    void enterIsa_pbx_resources_build_phase(PbxprojParser.Isa_pbx_resources_build_phaseContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#isa_pbx_resources_build_phase}.
     * @param ctx the parse tree
     */
    void exitIsa_pbx_resources_build_phase(PbxprojParser.Isa_pbx_resources_build_phaseContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#isa_pbx_shell_script_build_phase}.
     * @param ctx the parse tree
     */
    void enterIsa_pbx_shell_script_build_phase(PbxprojParser.Isa_pbx_shell_script_build_phaseContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#isa_pbx_shell_script_build_phase}.
     * @param ctx the parse tree
     */
    void exitIsa_pbx_shell_script_build_phase(PbxprojParser.Isa_pbx_shell_script_build_phaseContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#isa_pbx_shell_build_phase}.
     * @param ctx the parse tree
     */
    void enterIsa_pbx_shell_build_phase(PbxprojParser.Isa_pbx_shell_build_phaseContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#isa_pbx_shell_build_phase}.
     * @param ctx the parse tree
     */
    void exitIsa_pbx_shell_build_phase(PbxprojParser.Isa_pbx_shell_build_phaseContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#isa_pbx_sources_build_phase}.
     * @param ctx the parse tree
     */
    void enterIsa_pbx_sources_build_phase(PbxprojParser.Isa_pbx_sources_build_phaseContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#isa_pbx_sources_build_phase}.
     * @param ctx the parse tree
     */
    void exitIsa_pbx_sources_build_phase(PbxprojParser.Isa_pbx_sources_build_phaseContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#isa_pbx_target_dependency}.
     * @param ctx the parse tree
     */
    void enterIsa_pbx_target_dependency(PbxprojParser.Isa_pbx_target_dependencyContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#isa_pbx_target_dependency}.
     * @param ctx the parse tree
     */
    void exitIsa_pbx_target_dependency(PbxprojParser.Isa_pbx_target_dependencyContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#isa_pbx_variant_group}.
     * @param ctx the parse tree
     */
    void enterIsa_pbx_variant_group(PbxprojParser.Isa_pbx_variant_groupContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#isa_pbx_variant_group}.
     * @param ctx the parse tree
     */
    void exitIsa_pbx_variant_group(PbxprojParser.Isa_pbx_variant_groupContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#isa_xc_build_configuration}.
     * @param ctx the parse tree
     */
    void enterIsa_xc_build_configuration(PbxprojParser.Isa_xc_build_configurationContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#isa_xc_build_configuration}.
     * @param ctx the parse tree
     */
    void exitIsa_xc_build_configuration(PbxprojParser.Isa_xc_build_configurationContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#isa_xc_configuration_list}.
     * @param ctx the parse tree
     */
    void enterIsa_xc_configuration_list(PbxprojParser.Isa_xc_configuration_listContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#isa_xc_configuration_list}.
     * @param ctx the parse tree
     */
    void exitIsa_xc_configuration_list(PbxprojParser.Isa_xc_configuration_listContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#isa_xc_remote_swift_package_reference}.
     * @param ctx the parse tree
     */
    void enterIsa_xc_remote_swift_package_reference(PbxprojParser.Isa_xc_remote_swift_package_referenceContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#isa_xc_remote_swift_package_reference}.
     * @param ctx the parse tree
     */
    void exitIsa_xc_remote_swift_package_reference(PbxprojParser.Isa_xc_remote_swift_package_referenceContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#isa_xc_swift_package_product_dependency}.
     * @param ctx the parse tree
     */
    void enterIsa_xc_swift_package_product_dependency(PbxprojParser.Isa_xc_swift_package_product_dependencyContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#isa_xc_swift_package_product_dependency}.
     * @param ctx the parse tree
     */
    void exitIsa_xc_swift_package_product_dependency(PbxprojParser.Isa_xc_swift_package_product_dependencyContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#isa_xc_version_group}.
     * @param ctx the parse tree
     */
    void enterIsa_xc_version_group(PbxprojParser.Isa_xc_version_groupContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#isa_xc_version_group}.
     * @param ctx the parse tree
     */
    void exitIsa_xc_version_group(PbxprojParser.Isa_xc_version_groupContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#always_out_of_date}.
     * @param ctx the parse tree
     */
    void enterAlways_out_of_date(PbxprojParser.Always_out_of_dateContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#always_out_of_date}.
     * @param ctx the parse tree
     */
    void exitAlways_out_of_date(PbxprojParser.Always_out_of_dateContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#file_ref}.
     * @param ctx the parse tree
     */
    void enterFile_ref(PbxprojParser.File_refContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#file_ref}.
     * @param ctx the parse tree
     */
    void exitFile_ref(PbxprojParser.File_refContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#product_ref}.
     * @param ctx the parse tree
     */
    void enterProduct_ref(PbxprojParser.Product_refContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#product_ref}.
     * @param ctx the parse tree
     */
    void exitProduct_ref(PbxprojParser.Product_refContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#container_portal}.
     * @param ctx the parse tree
     */
    void enterContainer_portal(PbxprojParser.Container_portalContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#container_portal}.
     * @param ctx the parse tree
     */
    void exitContainer_portal(PbxprojParser.Container_portalContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#proxy_type}.
     * @param ctx the parse tree
     */
    void enterProxy_type(PbxprojParser.Proxy_typeContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#proxy_type}.
     * @param ctx the parse tree
     */
    void exitProxy_type(PbxprojParser.Proxy_typeContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#remote_global_id_string}.
     * @param ctx the parse tree
     */
    void enterRemote_global_id_string(PbxprojParser.Remote_global_id_stringContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#remote_global_id_string}.
     * @param ctx the parse tree
     */
    void exitRemote_global_id_string(PbxprojParser.Remote_global_id_stringContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#remote_info}.
     * @param ctx the parse tree
     */
    void enterRemote_info(PbxprojParser.Remote_infoContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#remote_info}.
     * @param ctx the parse tree
     */
    void exitRemote_info(PbxprojParser.Remote_infoContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#file_encoding}.
     * @param ctx the parse tree
     */
    void enterFile_encoding(PbxprojParser.File_encodingContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#file_encoding}.
     * @param ctx the parse tree
     */
    void exitFile_encoding(PbxprojParser.File_encodingContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#comments}.
     * @param ctx the parse tree
     */
    void enterComments(PbxprojParser.CommentsContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#comments}.
     * @param ctx the parse tree
     */
    void exitComments(PbxprojParser.CommentsContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#explicit_file_type}.
     * @param ctx the parse tree
     */
    void enterExplicit_file_type(PbxprojParser.Explicit_file_typeContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#explicit_file_type}.
     * @param ctx the parse tree
     */
    void exitExplicit_file_type(PbxprojParser.Explicit_file_typeContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#last_known_file_type}.
     * @param ctx the parse tree
     */
    void enterLast_known_file_type(PbxprojParser.Last_known_file_typeContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#last_known_file_type}.
     * @param ctx the parse tree
     */
    void exitLast_known_file_type(PbxprojParser.Last_known_file_typeContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#include_in_index}.
     * @param ctx the parse tree
     */
    void enterInclude_in_index(PbxprojParser.Include_in_indexContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#include_in_index}.
     * @param ctx the parse tree
     */
    void exitInclude_in_index(PbxprojParser.Include_in_indexContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#indent_width}.
     * @param ctx the parse tree
     */
    void enterIndent_width(PbxprojParser.Indent_widthContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#indent_width}.
     * @param ctx the parse tree
     */
    void exitIndent_width(PbxprojParser.Indent_widthContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#tab_width}.
     * @param ctx the parse tree
     */
    void enterTab_width(PbxprojParser.Tab_widthContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#tab_width}.
     * @param ctx the parse tree
     */
    void exitTab_width(PbxprojParser.Tab_widthContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#uses_tabs}.
     * @param ctx the parse tree
     */
    void enterUses_tabs(PbxprojParser.Uses_tabsContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#uses_tabs}.
     * @param ctx the parse tree
     */
    void exitUses_tabs(PbxprojParser.Uses_tabsContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#wraps_lines}.
     * @param ctx the parse tree
     */
    void enterWraps_lines(PbxprojParser.Wraps_linesContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#wraps_lines}.
     * @param ctx the parse tree
     */
    void exitWraps_lines(PbxprojParser.Wraps_linesContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#platform_filter}.
     * @param ctx the parse tree
     */
    void enterPlatform_filter(PbxprojParser.Platform_filterContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#platform_filter}.
     * @param ctx the parse tree
     */
    void exitPlatform_filter(PbxprojParser.Platform_filterContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#platform_filters}.
     * @param ctx the parse tree
     */
    void enterPlatform_filters(PbxprojParser.Platform_filtersContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#platform_filters}.
     * @param ctx the parse tree
     */
    void exitPlatform_filters(PbxprojParser.Platform_filtersContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#children}.
     * @param ctx the parse tree
     */
    void enterChildren(PbxprojParser.ChildrenContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#children}.
     * @param ctx the parse tree
     */
    void exitChildren(PbxprojParser.ChildrenContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#product_install_path}.
     * @param ctx the parse tree
     */
    void enterProduct_install_path(PbxprojParser.Product_install_pathContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#product_install_path}.
     * @param ctx the parse tree
     */
    void exitProduct_install_path(PbxprojParser.Product_install_pathContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#repository_url}.
     * @param ctx the parse tree
     */
    void enterRepository_url(PbxprojParser.Repository_urlContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#repository_url}.
     * @param ctx the parse tree
     */
    void exitRepository_url(PbxprojParser.Repository_urlContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#requirement}.
     * @param ctx the parse tree
     */
    void enterRequirement(PbxprojParser.RequirementContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#requirement}.
     * @param ctx the parse tree
     */
    void exitRequirement(PbxprojParser.RequirementContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#xc_package}.
     * @param ctx the parse tree
     */
    void enterXc_package(PbxprojParser.Xc_packageContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#xc_package}.
     * @param ctx the parse tree
     */
    void exitXc_package(PbxprojParser.Xc_packageContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#package_product_dependencies}.
     * @param ctx the parse tree
     */
    void enterPackage_product_dependencies(PbxprojParser.Package_product_dependenciesContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#package_product_dependencies}.
     * @param ctx the parse tree
     */
    void exitPackage_product_dependencies(PbxprojParser.Package_product_dependenciesContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#name}.
     * @param ctx the parse tree
     */
    void enterName(PbxprojParser.NameContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#name}.
     * @param ctx the parse tree
     */
    void exitName(PbxprojParser.NameContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#path}.
     * @param ctx the parse tree
     */
    void enterPath(PbxprojParser.PathContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#path}.
     * @param ctx the parse tree
     */
    void exitPath(PbxprojParser.PathContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#source_tree}.
     * @param ctx the parse tree
     */
    void enterSource_tree(PbxprojParser.Source_treeContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#source_tree}.
     * @param ctx the parse tree
     */
    void exitSource_tree(PbxprojParser.Source_treeContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#build_action_mask}.
     * @param ctx the parse tree
     */
    void enterBuild_action_mask(PbxprojParser.Build_action_maskContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#build_action_mask}.
     * @param ctx the parse tree
     */
    void exitBuild_action_mask(PbxprojParser.Build_action_maskContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#files}.
     * @param ctx the parse tree
     */
    void enterFiles(PbxprojParser.FilesContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#files}.
     * @param ctx the parse tree
     */
    void exitFiles(PbxprojParser.FilesContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#run_only_for_deployment_postprocessing}.
     * @param ctx the parse tree
     */
    void enterRun_only_for_deployment_postprocessing(PbxprojParser.Run_only_for_deployment_postprocessingContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#run_only_for_deployment_postprocessing}.
     * @param ctx the parse tree
     */
    void exitRun_only_for_deployment_postprocessing(PbxprojParser.Run_only_for_deployment_postprocessingContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#reference_list}.
     * @param ctx the parse tree
     */
    void enterReference_list(PbxprojParser.Reference_listContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#reference_list}.
     * @param ctx the parse tree
     */
    void exitReference_list(PbxprojParser.Reference_listContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#any_string_list}.
     * @param ctx the parse tree
     */
    void enterAny_string_list(PbxprojParser.Any_string_listContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#any_string_list}.
     * @param ctx the parse tree
     */
    void exitAny_string_list(PbxprojParser.Any_string_listContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#non_quoted_strings_list}.
     * @param ctx the parse tree
     */
    void enterNon_quoted_strings_list(PbxprojParser.Non_quoted_strings_listContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#non_quoted_strings_list}.
     * @param ctx the parse tree
     */
    void exitNon_quoted_strings_list(PbxprojParser.Non_quoted_strings_listContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#build_configuration_list}.
     * @param ctx the parse tree
     */
    void enterBuild_configuration_list(PbxprojParser.Build_configuration_listContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#build_configuration_list}.
     * @param ctx the parse tree
     */
    void exitBuild_configuration_list(PbxprojParser.Build_configuration_listContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#build_phases}.
     * @param ctx the parse tree
     */
    void enterBuild_phases(PbxprojParser.Build_phasesContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#build_phases}.
     * @param ctx the parse tree
     */
    void exitBuild_phases(PbxprojParser.Build_phasesContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#build_rules}.
     * @param ctx the parse tree
     */
    void enterBuild_rules(PbxprojParser.Build_rulesContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#build_rules}.
     * @param ctx the parse tree
     */
    void exitBuild_rules(PbxprojParser.Build_rulesContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#build_arguments_string}.
     * @param ctx the parse tree
     */
    void enterBuild_arguments_string(PbxprojParser.Build_arguments_stringContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#build_arguments_string}.
     * @param ctx the parse tree
     */
    void exitBuild_arguments_string(PbxprojParser.Build_arguments_stringContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#build_tool_path}.
     * @param ctx the parse tree
     */
    void enterBuild_tool_path(PbxprojParser.Build_tool_pathContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#build_tool_path}.
     * @param ctx the parse tree
     */
    void exitBuild_tool_path(PbxprojParser.Build_tool_pathContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#build_working_directory}.
     * @param ctx the parse tree
     */
    void enterBuild_working_directory(PbxprojParser.Build_working_directoryContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#build_working_directory}.
     * @param ctx the parse tree
     */
    void exitBuild_working_directory(PbxprojParser.Build_working_directoryContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#pass_build_settings_in_environment}.
     * @param ctx the parse tree
     */
    void enterPass_build_settings_in_environment(PbxprojParser.Pass_build_settings_in_environmentContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#pass_build_settings_in_environment}.
     * @param ctx the parse tree
     */
    void exitPass_build_settings_in_environment(PbxprojParser.Pass_build_settings_in_environmentContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#dependencies}.
     * @param ctx the parse tree
     */
    void enterDependencies(PbxprojParser.DependenciesContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#dependencies}.
     * @param ctx the parse tree
     */
    void exitDependencies(PbxprojParser.DependenciesContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#product_name}.
     * @param ctx the parse tree
     */
    void enterProduct_name(PbxprojParser.Product_nameContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#product_name}.
     * @param ctx the parse tree
     */
    void exitProduct_name(PbxprojParser.Product_nameContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#product_reference}.
     * @param ctx the parse tree
     */
    void enterProduct_reference(PbxprojParser.Product_referenceContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#product_reference}.
     * @param ctx the parse tree
     */
    void exitProduct_reference(PbxprojParser.Product_referenceContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#product_type}.
     * @param ctx the parse tree
     */
    void enterProduct_type(PbxprojParser.Product_typeContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#product_type}.
     * @param ctx the parse tree
     */
    void exitProduct_type(PbxprojParser.Product_typeContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#line_ending}.
     * @param ctx the parse tree
     */
    void enterLine_ending(PbxprojParser.Line_endingContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#line_ending}.
     * @param ctx the parse tree
     */
    void exitLine_ending(PbxprojParser.Line_endingContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#xc_language_specification_identifier}.
     * @param ctx the parse tree
     */
    void enterXc_language_specification_identifier(PbxprojParser.Xc_language_specification_identifierContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#xc_language_specification_identifier}.
     * @param ctx the parse tree
     */
    void exitXc_language_specification_identifier(PbxprojParser.Xc_language_specification_identifierContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#plist_structure_definition_identifier}.
     * @param ctx the parse tree
     */
    void enterPlist_structure_definition_identifier(PbxprojParser.Plist_structure_definition_identifierContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#plist_structure_definition_identifier}.
     * @param ctx the parse tree
     */
    void exitPlist_structure_definition_identifier(PbxprojParser.Plist_structure_definition_identifierContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#ref_type}.
     * @param ctx the parse tree
     */
    void enterRef_type(PbxprojParser.Ref_typeContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#ref_type}.
     * @param ctx the parse tree
     */
    void exitRef_type(PbxprojParser.Ref_typeContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#compiler_spec}.
     * @param ctx the parse tree
     */
    void enterCompiler_spec(PbxprojParser.Compiler_specContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#compiler_spec}.
     * @param ctx the parse tree
     */
    void exitCompiler_spec(PbxprojParser.Compiler_specContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#file_patterns}.
     * @param ctx the parse tree
     */
    void enterFile_patterns(PbxprojParser.File_patternsContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#file_patterns}.
     * @param ctx the parse tree
     */
    void exitFile_patterns(PbxprojParser.File_patternsContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#input_files}.
     * @param ctx the parse tree
     */
    void enterInput_files(PbxprojParser.Input_filesContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#input_files}.
     * @param ctx the parse tree
     */
    void exitInput_files(PbxprojParser.Input_filesContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#is_editable}.
     * @param ctx the parse tree
     */
    void enterIs_editable(PbxprojParser.Is_editableContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#is_editable}.
     * @param ctx the parse tree
     */
    void exitIs_editable(PbxprojParser.Is_editableContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#output_files}.
     * @param ctx the parse tree
     */
    void enterOutput_files(PbxprojParser.Output_filesContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#output_files}.
     * @param ctx the parse tree
     */
    void exitOutput_files(PbxprojParser.Output_filesContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#run_once_per_arch}.
     * @param ctx the parse tree
     */
    void enterRun_once_per_arch(PbxprojParser.Run_once_per_archContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#run_once_per_arch}.
     * @param ctx the parse tree
     */
    void exitRun_once_per_arch(PbxprojParser.Run_once_per_archContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#script}.
     * @param ctx the parse tree
     */
    void enterScript(PbxprojParser.ScriptContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#script}.
     * @param ctx the parse tree
     */
    void exitScript(PbxprojParser.ScriptContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#attributes}.
     * @param ctx the parse tree
     */
    void enterAttributes(PbxprojParser.AttributesContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#attributes}.
     * @param ctx the parse tree
     */
    void exitAttributes(PbxprojParser.AttributesContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#last_swift_migration}.
     * @param ctx the parse tree
     */
    void enterLast_swift_migration(PbxprojParser.Last_swift_migrationContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#last_swift_migration}.
     * @param ctx the parse tree
     */
    void exitLast_swift_migration(PbxprojParser.Last_swift_migrationContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#default_build_system_type_for_workspace}.
     * @param ctx the parse tree
     */
    void enterDefault_build_system_type_for_workspace(PbxprojParser.Default_build_system_type_for_workspaceContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#default_build_system_type_for_workspace}.
     * @param ctx the parse tree
     */
    void exitDefault_build_system_type_for_workspace(PbxprojParser.Default_build_system_type_for_workspaceContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#last_swift_update_check}.
     * @param ctx the parse tree
     */
    void enterLast_swift_update_check(PbxprojParser.Last_swift_update_checkContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#last_swift_update_check}.
     * @param ctx the parse tree
     */
    void exitLast_swift_update_check(PbxprojParser.Last_swift_update_checkContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#build_targets_in_parallel}.
     * @param ctx the parse tree
     */
    void enterBuild_targets_in_parallel(PbxprojParser.Build_targets_in_parallelContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#build_targets_in_parallel}.
     * @param ctx the parse tree
     */
    void exitBuild_targets_in_parallel(PbxprojParser.Build_targets_in_parallelContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#last_testing_upgrade_check}.
     * @param ctx the parse tree
     */
    void enterLast_testing_upgrade_check(PbxprojParser.Last_testing_upgrade_checkContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#last_testing_upgrade_check}.
     * @param ctx the parse tree
     */
    void exitLast_testing_upgrade_check(PbxprojParser.Last_testing_upgrade_checkContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#last_upgrade_check}.
     * @param ctx the parse tree
     */
    void enterLast_upgrade_check(PbxprojParser.Last_upgrade_checkContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#last_upgrade_check}.
     * @param ctx the parse tree
     */
    void exitLast_upgrade_check(PbxprojParser.Last_upgrade_checkContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#organization_name}.
     * @param ctx the parse tree
     */
    void enterOrganization_name(PbxprojParser.Organization_nameContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#organization_name}.
     * @param ctx the parse tree
     */
    void exitOrganization_name(PbxprojParser.Organization_nameContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#target_attributes}.
     * @param ctx the parse tree
     */
    void enterTarget_attributes(PbxprojParser.Target_attributesContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#target_attributes}.
     * @param ctx the parse tree
     */
    void exitTarget_attributes(PbxprojParser.Target_attributesContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#target_attribute}.
     * @param ctx the parse tree
     */
    void enterTarget_attribute(PbxprojParser.Target_attributeContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#target_attribute}.
     * @param ctx the parse tree
     */
    void exitTarget_attribute(PbxprojParser.Target_attributeContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#created_on_tools_version}.
     * @param ctx the parse tree
     */
    void enterCreated_on_tools_version(PbxprojParser.Created_on_tools_versionContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#created_on_tools_version}.
     * @param ctx the parse tree
     */
    void exitCreated_on_tools_version(PbxprojParser.Created_on_tools_versionContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#test_target_id}.
     * @param ctx the parse tree
     */
    void enterTest_target_id(PbxprojParser.Test_target_idContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#test_target_id}.
     * @param ctx the parse tree
     */
    void exitTest_target_id(PbxprojParser.Test_target_idContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#development_team}.
     * @param ctx the parse tree
     */
    void enterDevelopment_team(PbxprojParser.Development_teamContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#development_team}.
     * @param ctx the parse tree
     */
    void exitDevelopment_team(PbxprojParser.Development_teamContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#development_team_name}.
     * @param ctx the parse tree
     */
    void enterDevelopment_team_name(PbxprojParser.Development_team_nameContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#development_team_name}.
     * @param ctx the parse tree
     */
    void exitDevelopment_team_name(PbxprojParser.Development_team_nameContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#provisioning_style}.
     * @param ctx the parse tree
     */
    void enterProvisioning_style(PbxprojParser.Provisioning_styleContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#provisioning_style}.
     * @param ctx the parse tree
     */
    void exitProvisioning_style(PbxprojParser.Provisioning_styleContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#compatibility_version}.
     * @param ctx the parse tree
     */
    void enterCompatibility_version(PbxprojParser.Compatibility_versionContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#compatibility_version}.
     * @param ctx the parse tree
     */
    void exitCompatibility_version(PbxprojParser.Compatibility_versionContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#development_region}.
     * @param ctx the parse tree
     */
    void enterDevelopment_region(PbxprojParser.Development_regionContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#development_region}.
     * @param ctx the parse tree
     */
    void exitDevelopment_region(PbxprojParser.Development_regionContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#has_scanned_for_encodings}.
     * @param ctx the parse tree
     */
    void enterHas_scanned_for_encodings(PbxprojParser.Has_scanned_for_encodingsContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#has_scanned_for_encodings}.
     * @param ctx the parse tree
     */
    void exitHas_scanned_for_encodings(PbxprojParser.Has_scanned_for_encodingsContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#known_regions}.
     * @param ctx the parse tree
     */
    void enterKnown_regions(PbxprojParser.Known_regionsContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#known_regions}.
     * @param ctx the parse tree
     */
    void exitKnown_regions(PbxprojParser.Known_regionsContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#main_group}.
     * @param ctx the parse tree
     */
    void enterMain_group(PbxprojParser.Main_groupContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#main_group}.
     * @param ctx the parse tree
     */
    void exitMain_group(PbxprojParser.Main_groupContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#product_ref_group}.
     * @param ctx the parse tree
     */
    void enterProduct_ref_group(PbxprojParser.Product_ref_groupContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#product_ref_group}.
     * @param ctx the parse tree
     */
    void exitProduct_ref_group(PbxprojParser.Product_ref_groupContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#package_references}.
     * @param ctx the parse tree
     */
    void enterPackage_references(PbxprojParser.Package_referencesContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#package_references}.
     * @param ctx the parse tree
     */
    void exitPackage_references(PbxprojParser.Package_referencesContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#project_dir_path}.
     * @param ctx the parse tree
     */
    void enterProject_dir_path(PbxprojParser.Project_dir_pathContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#project_dir_path}.
     * @param ctx the parse tree
     */
    void exitProject_dir_path(PbxprojParser.Project_dir_pathContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#project_references}.
     * @param ctx the parse tree
     */
    void enterProject_references(PbxprojParser.Project_referencesContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#project_references}.
     * @param ctx the parse tree
     */
    void exitProject_references(PbxprojParser.Project_referencesContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#project_root}.
     * @param ctx the parse tree
     */
    void enterProject_root(PbxprojParser.Project_rootContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#project_root}.
     * @param ctx the parse tree
     */
    void exitProject_root(PbxprojParser.Project_rootContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#targets}.
     * @param ctx the parse tree
     */
    void enterTargets(PbxprojParser.TargetsContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#targets}.
     * @param ctx the parse tree
     */
    void exitTargets(PbxprojParser.TargetsContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#input_file_list_paths}.
     * @param ctx the parse tree
     */
    void enterInput_file_list_paths(PbxprojParser.Input_file_list_pathsContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#input_file_list_paths}.
     * @param ctx the parse tree
     */
    void exitInput_file_list_paths(PbxprojParser.Input_file_list_pathsContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#input_paths}.
     * @param ctx the parse tree
     */
    void enterInput_paths(PbxprojParser.Input_pathsContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#input_paths}.
     * @param ctx the parse tree
     */
    void exitInput_paths(PbxprojParser.Input_pathsContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#output_file_list_paths}.
     * @param ctx the parse tree
     */
    void enterOutput_file_list_paths(PbxprojParser.Output_file_list_pathsContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#output_file_list_paths}.
     * @param ctx the parse tree
     */
    void exitOutput_file_list_paths(PbxprojParser.Output_file_list_pathsContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#output_paths}.
     * @param ctx the parse tree
     */
    void enterOutput_paths(PbxprojParser.Output_pathsContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#output_paths}.
     * @param ctx the parse tree
     */
    void exitOutput_paths(PbxprojParser.Output_pathsContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#shell_path}.
     * @param ctx the parse tree
     */
    void enterShell_path(PbxprojParser.Shell_pathContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#shell_path}.
     * @param ctx the parse tree
     */
    void exitShell_path(PbxprojParser.Shell_pathContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#shell}.
     * @param ctx the parse tree
     */
    void enterShell(PbxprojParser.ShellContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#shell}.
     * @param ctx the parse tree
     */
    void exitShell(PbxprojParser.ShellContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#shell_script}.
     * @param ctx the parse tree
     */
    void enterShell_script(PbxprojParser.Shell_scriptContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#shell_script}.
     * @param ctx the parse tree
     */
    void exitShell_script(PbxprojParser.Shell_scriptContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#show_env_vars_in_log}.
     * @param ctx the parse tree
     */
    void enterShow_env_vars_in_log(PbxprojParser.Show_env_vars_in_logContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#show_env_vars_in_log}.
     * @param ctx the parse tree
     */
    void exitShow_env_vars_in_log(PbxprojParser.Show_env_vars_in_logContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#target}.
     * @param ctx the parse tree
     */
    void enterTarget(PbxprojParser.TargetContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#target}.
     * @param ctx the parse tree
     */
    void exitTarget(PbxprojParser.TargetContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#target_proxy}.
     * @param ctx the parse tree
     */
    void enterTarget_proxy(PbxprojParser.Target_proxyContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#target_proxy}.
     * @param ctx the parse tree
     */
    void exitTarget_proxy(PbxprojParser.Target_proxyContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#file_type}.
     * @param ctx the parse tree
     */
    void enterFile_type(PbxprojParser.File_typeContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#file_type}.
     * @param ctx the parse tree
     */
    void exitFile_type(PbxprojParser.File_typeContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#remote_ref}.
     * @param ctx the parse tree
     */
    void enterRemote_ref(PbxprojParser.Remote_refContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#remote_ref}.
     * @param ctx the parse tree
     */
    void exitRemote_ref(PbxprojParser.Remote_refContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#base_configuration_reference}.
     * @param ctx the parse tree
     */
    void enterBase_configuration_reference(PbxprojParser.Base_configuration_referenceContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#base_configuration_reference}.
     * @param ctx the parse tree
     */
    void exitBase_configuration_reference(PbxprojParser.Base_configuration_referenceContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#build_settings}.
     * @param ctx the parse tree
     */
    void enterBuild_settings(PbxprojParser.Build_settingsContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#build_settings}.
     * @param ctx the parse tree
     */
    void exitBuild_settings(PbxprojParser.Build_settingsContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#build_styles}.
     * @param ctx the parse tree
     */
    void enterBuild_styles(PbxprojParser.Build_stylesContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#build_styles}.
     * @param ctx the parse tree
     */
    void exitBuild_styles(PbxprojParser.Build_stylesContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#dst_path}.
     * @param ctx the parse tree
     */
    void enterDst_path(PbxprojParser.Dst_pathContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#dst_path}.
     * @param ctx the parse tree
     */
    void exitDst_path(PbxprojParser.Dst_pathContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#dst_subfolder_spec}.
     * @param ctx the parse tree
     */
    void enterDst_subfolder_spec(PbxprojParser.Dst_subfolder_specContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#dst_subfolder_spec}.
     * @param ctx the parse tree
     */
    void exitDst_subfolder_spec(PbxprojParser.Dst_subfolder_specContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#project_references_list}.
     * @param ctx the parse tree
     */
    void enterProject_references_list(PbxprojParser.Project_references_listContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#project_references_list}.
     * @param ctx the parse tree
     */
    void exitProject_references_list(PbxprojParser.Project_references_listContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#project_references_list_element}.
     * @param ctx the parse tree
     */
    void enterProject_references_list_element(PbxprojParser.Project_references_list_elementContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#project_references_list_element}.
     * @param ctx the parse tree
     */
    void exitProject_references_list_element(PbxprojParser.Project_references_list_elementContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#key_value}.
     * @param ctx the parse tree
     */
    void enterKey_value(PbxprojParser.Key_valueContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#key_value}.
     * @param ctx the parse tree
     */
    void exitKey_value(PbxprojParser.Key_valueContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#build_configurations}.
     * @param ctx the parse tree
     */
    void enterBuild_configurations(PbxprojParser.Build_configurationsContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#build_configurations}.
     * @param ctx the parse tree
     */
    void exitBuild_configurations(PbxprojParser.Build_configurationsContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#default_configuration_is_visible}.
     * @param ctx the parse tree
     */
    void enterDefault_configuration_is_visible(PbxprojParser.Default_configuration_is_visibleContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#default_configuration_is_visible}.
     * @param ctx the parse tree
     */
    void exitDefault_configuration_is_visible(PbxprojParser.Default_configuration_is_visibleContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#default_configuration_name}.
     * @param ctx the parse tree
     */
    void enterDefault_configuration_name(PbxprojParser.Default_configuration_nameContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#default_configuration_name}.
     * @param ctx the parse tree
     */
    void exitDefault_configuration_name(PbxprojParser.Default_configuration_nameContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#settings}.
     * @param ctx the parse tree
     */
    void enterSettings(PbxprojParser.SettingsContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#settings}.
     * @param ctx the parse tree
     */
    void exitSettings(PbxprojParser.SettingsContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#system_capabilities}.
     * @param ctx the parse tree
     */
    void enterSystem_capabilities(PbxprojParser.System_capabilitiesContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#system_capabilities}.
     * @param ctx the parse tree
     */
    void exitSystem_capabilities(PbxprojParser.System_capabilitiesContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#current_version}.
     * @param ctx the parse tree
     */
    void enterCurrent_version(PbxprojParser.Current_versionContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#current_version}.
     * @param ctx the parse tree
     */
    void exitCurrent_version(PbxprojParser.Current_versionContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#version_group_type}.
     * @param ctx the parse tree
     */
    void enterVersion_group_type(PbxprojParser.Version_group_typeContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#version_group_type}.
     * @param ctx the parse tree
     */
    void exitVersion_group_type(PbxprojParser.Version_group_typeContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#class_prefix}.
     * @param ctx the parse tree
     */
    void enterClass_prefix(PbxprojParser.Class_prefixContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#class_prefix}.
     * @param ctx the parse tree
     */
    void exitClass_prefix(PbxprojParser.Class_prefixContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#any_string}.
     * @param ctx the parse tree
     */
    void enterAny_string(PbxprojParser.Any_stringContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#any_string}.
     * @param ctx the parse tree
     */
    void exitAny_string(PbxprojParser.Any_stringContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#str_number_variable}.
     * @param ctx the parse tree
     */
    void enterStr_number_variable(PbxprojParser.Str_number_variableContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#str_number_variable}.
     * @param ctx the parse tree
     */
    void exitStr_number_variable(PbxprojParser.Str_number_variableContext ctx);
    /**
     * Enter a parse tree produced by {@link PbxprojParser#any_token}.
     * @param ctx the parse tree
     */
    void enterAny_token(PbxprojParser.Any_tokenContext ctx);
    /**
     * Exit a parse tree produced by {@link PbxprojParser#any_token}.
     * @param ctx the parse tree
     */
    void exitAny_token(PbxprojParser.Any_tokenContext ctx);
}