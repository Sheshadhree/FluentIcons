package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Backpack16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Backpack16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7f, 6f)
            curveTo(5.895f, 6f, 5f, 6.895f, 5f, 8f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(4f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(7f)
            close()
            moveTo(6f, 8f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(2f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            horizontalLineTo(6f)
            close()
            moveToRelative(2f, -7f)
            curveTo(6.895f, 1f, 6f, 1.895f, 6f, 3f)
            verticalLineToRelative(0.416f)
            curveTo(4.234f, 4.188f, 3f, 5.95f, 3f, 8f)
            verticalLineToRelative(4.5f)
            curveTo(3f, 13.88f, 4.12f, 15f, 5.5f, 15f)
            horizontalLineToRelative(5f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineTo(8f)
            curveToRelative(0f, -2.05f, -1.234f, -3.812f, -3f, -4.584f)
            verticalLineTo(3f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            close()
            moveToRelative(4f, 9f)
            horizontalLineTo(4f)
            verticalLineTo(8f)
            curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
            reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
            verticalLineToRelative(2f)
            close()
            moveToRelative(-6f, 2.5f)
            curveTo(6f, 12.776f, 6.224f, 13f, 6.5f, 13f)
            reflectiveCurveTo(7f, 12.776f, 7f, 12.5f)
            verticalLineTo(11f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-5f)
            curveTo(4.672f, 14f, 4f, 13.328f, 4f, 12.5f)
            verticalLineTo(11f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(1.5f)
            close()
            moveTo(8f, 3f)
            curveTo(7.657f, 3f, 7.323f, 3.034f, 7f, 3.1f)
            verticalLineTo(3f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            verticalLineToRelative(0.1f)
            curveTo(8.677f, 3.034f, 8.342f, 3f, 8f, 3f)
            close()
        }
    }.build()
}
