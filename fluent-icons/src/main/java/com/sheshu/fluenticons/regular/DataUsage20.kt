package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.DataUsage20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DataUsage20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 10f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
            close()
            moveTo(6f, 8.5f)
            curveTo(6f, 8.224f, 6.224f, 8f, 6.5f, 8f)
            reflectiveCurveTo(7f, 8.224f, 7f, 8.5f)
            verticalLineToRelative(5f)
            curveTo(7f, 13.776f, 6.776f, 14f, 6.5f, 14f)
            reflectiveCurveTo(6f, 13.776f, 6f, 13.5f)
            verticalLineToRelative(-5f)
            close()
            moveTo(13.5f, 6f)
            curveTo(13.224f, 6f, 13f, 6.224f, 13f, 6.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-7f)
            curveTo(14f, 6.224f, 13.776f, 6f, 13.5f, 6f)
            close()
            moveTo(3f, 5f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(10f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(10f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(5f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(5f)
            close()
            moveToRelative(1f, 0f)
            verticalLineToRelative(10f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(10f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineTo(5f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineTo(5f)
            curveTo(4.448f, 4f, 4f, 4.448f, 4f, 5f)
            close()
        }
    }.build()
}
