package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DocumentMargins20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentMargins20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 2f)
            curveTo(4.895f, 2f, 4f, 2.895f, 4f, 4f)
            verticalLineToRelative(12f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            verticalLineToRelative(-3.5f)
            curveTo(6f, 14.224f, 6.224f, 14f, 6.5f, 14f)
            reflectiveCurveTo(7f, 14.224f, 7f, 14.5f)
            verticalLineTo(18f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(-3.5f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            reflectiveCurveToRelative(0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineTo(18f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(4f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            verticalLineToRelative(3.5f)
            curveTo(14f, 5.776f, 13.776f, 6f, 13.5f, 6f)
            reflectiveCurveTo(13f, 5.776f, 13f, 5.5f)
            verticalLineTo(2f)
            horizontalLineTo(7f)
            verticalLineToRelative(3.5f)
            curveTo(7f, 5.776f, 6.776f, 6f, 6.5f, 6f)
            reflectiveCurveTo(6f, 5.776f, 6f, 5.5f)
            verticalLineTo(2f)
            close()
            moveToRelative(0.5f, 11f)
            curveTo(6.224f, 13f, 6f, 12.776f, 6f, 12.5f)
            verticalLineToRelative(-5f)
            curveTo(6f, 7.224f, 6.224f, 7f, 6.5f, 7f)
            reflectiveCurveTo(7f, 7.224f, 7f, 7.5f)
            verticalLineToRelative(5f)
            curveTo(7f, 12.776f, 6.776f, 13f, 6.5f, 13f)
            close()
            moveToRelative(7f, 0f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            verticalLineToRelative(-5f)
            curveTo(13f, 7.224f, 13.224f, 7f, 13.5f, 7f)
            reflectiveCurveTo(14f, 7.224f, 14f, 7.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            close()
        }
    }.build()
}
