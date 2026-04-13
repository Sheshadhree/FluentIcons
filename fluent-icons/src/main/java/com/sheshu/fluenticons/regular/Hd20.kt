package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Hd20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Hd20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.5f, 7f)
            curveTo(5.776f, 7f, 6f, 7.224f, 6f, 7.5f)
            verticalLineTo(10f)
            horizontalLineToRelative(2.5f)
            verticalLineTo(7.5f)
            curveTo(8.5f, 7.224f, 8.724f, 7f, 9f, 7f)
            reflectiveCurveToRelative(0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineToRelative(5f)
            curveTo(9.5f, 12.776f, 9.276f, 13f, 9f, 13f)
            reflectiveCurveToRelative(-0.5f, -0.224f, -0.5f, -0.5f)
            verticalLineTo(11f)
            horizontalLineTo(6f)
            verticalLineToRelative(1.5f)
            curveTo(6f, 12.776f, 5.776f, 13f, 5.5f, 13f)
            reflectiveCurveTo(5f, 12.776f, 5f, 12.5f)
            verticalLineToRelative(-5f)
            curveTo(5f, 7.224f, 5.224f, 7f, 5.5f, 7f)
            close()
            moveTo(11f, 7f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(1.417f)
            curveTo(13.843f, 13f, 15f, 11.843f, 15f, 10.417f)
            verticalLineTo(9.583f)
            curveTo(15f, 8.157f, 13.843f, 7f, 12.417f, 7f)
            horizontalLineTo(11f)
            close()
            moveToRelative(1.417f, 5f)
            horizontalLineTo(11.5f)
            verticalLineTo(8f)
            horizontalLineToRelative(0.917f)
            curveTo(13.29f, 8f, 14f, 8.709f, 14f, 9.583f)
            verticalLineToRelative(0.834f)
            curveTo(14f, 11.29f, 13.291f, 12f, 12.417f, 12f)
            close()
            moveTo(3f, 6f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(8f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            horizontalLineTo(6f)
            curveToRelative(-1.657f, 0f, -3f, -1.343f, -3f, -3f)
            verticalLineTo(6f)
            close()
            moveToRelative(3f, -2f)
            curveTo(4.895f, 4f, 4f, 4.895f, 4f, 6f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(8f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(6f)
            close()
        }
    }.build()
}
