package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TabAdd32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TabAdd32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 7.5f)
            curveTo(3f, 5.015f, 5.015f, 3f, 7.5f, 3f)
            horizontalLineToRelative(17f)
            curveTo(26.985f, 3f, 29f, 5.015f, 29f, 7.5f)
            verticalLineToRelative(8.792f)
            curveToRelative(-0.735f, -0.658f, -1.578f, -1.197f, -2.5f, -1.586f)
            verticalLineTo(7.5f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineToRelative(-17f)
            curveToRelative(-1.105f, 0f, -2f, 0.895f, -2f, 2f)
            verticalLineToRelative(17f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(7.206f)
            curveToRelative(0.39f, 0.922f, 0.928f, 1.765f, 1.586f, 2.5f)
            horizontalLineTo(7.5f)
            curveTo(5.015f, 29f, 3f, 26.985f, 3f, 24.5f)
            verticalLineToRelative(-17f)
            close()
            moveToRelative(20f, 23f)
            curveToRelative(4.142f, 0f, 7.5f, -3.358f, 7.5f, -7.5f)
            curveToRelative(0f, -4.142f, -3.358f, -7.5f, -7.5f, -7.5f)
            curveToRelative(-4.142f, 0f, -7.5f, 3.358f, -7.5f, 7.5f)
            curveToRelative(0f, 4.142f, 3.358f, 7.5f, 7.5f, 7.5f)
            close()
            moveToRelative(1f, -12.25f)
            verticalLineTo(22f)
            horizontalLineToRelative(3.75f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineTo(24f)
            verticalLineToRelative(3.75f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveToRelative(-0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineTo(23.5f)
            horizontalLineToRelative(-3.75f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            reflectiveCurveTo(18.336f, 22f, 18.75f, 22f)
            horizontalLineToRelative(3.75f)
            verticalLineToRelative(-3.75f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            reflectiveCurveTo(24f, 17.836f, 24f, 18.25f)
            close()
        }
    }.build()
}
