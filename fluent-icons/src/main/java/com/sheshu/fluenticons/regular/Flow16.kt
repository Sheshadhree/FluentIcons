package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Flow16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Flow16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.5f, 4f)
            curveTo(13.328f, 4f, 14f, 4.672f, 14f, 5.5f)
            reflectiveCurveTo(13.328f, 7f, 12.5f, 7f)
            reflectiveCurveTo(11f, 6.328f, 11f, 5.5f)
            reflectiveCurveTo(11.672f, 4f, 12.5f, 4f)
            close()
            moveToRelative(-2.45f, 2f)
            curveToRelative(0.232f, 1.141f, 1.24f, 2f, 2.45f, 2f)
            curveTo(13.88f, 8f, 15f, 6.88f, 15f, 5.5f)
            reflectiveCurveTo(13.88f, 3f, 12.5f, 3f)
            curveToRelative(-1.21f, 0f, -2.218f, 0.859f, -2.45f, 2f)
            horizontalLineTo(9.5f)
            curveToRelative(-1.105f, 0f, -2f, 0.895f, -2f, 2f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(5.95f)
            curveTo(5.718f, 8.859f, 4.71f, 8f, 3.5f, 8f)
            curveTo(2.12f, 8f, 1f, 9.12f, 1f, 10.5f)
            reflectiveCurveTo(2.12f, 13f, 3.5f, 13f)
            curveToRelative(1.21f, 0f, 2.218f, -0.859f, 2.45f, -2f)
            horizontalLineTo(6.5f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(7f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(0.55f)
            close()
            moveTo(5f, 10.5f)
            curveTo(5f, 11.328f, 4.328f, 12f, 3.5f, 12f)
            reflectiveCurveTo(2f, 11.328f, 2f, 10.5f)
            reflectiveCurveTo(2.672f, 9f, 3.5f, 9f)
            reflectiveCurveTo(5f, 9.672f, 5f, 10.5f)
            close()
        }
    }.build()
}
