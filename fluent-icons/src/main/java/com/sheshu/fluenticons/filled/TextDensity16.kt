package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TextDensity16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextDensity16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.5f, 1f)
            curveTo(8.776f, 1f, 9f, 1.224f, 9f, 1.5f)
            verticalLineToRelative(13f)
            curveTo(9f, 14.776f, 8.776f, 15f, 8.5f, 15f)
            reflectiveCurveTo(8f, 14.776f, 8f, 14.5f)
            verticalLineToRelative(-13f)
            curveTo(8f, 1.224f, 8.224f, 1f, 8.5f, 1f)
            close()
            moveTo(7f, 3f)
            horizontalLineTo(2.5f)
            curveTo(2.224f, 3f, 2f, 3.224f, 2f, 3.5f)
            reflectiveCurveTo(2.224f, 4f, 2.5f, 4f)
            horizontalLineTo(7f)
            verticalLineTo(3f)
            close()
            moveToRelative(0f, 3f)
            horizontalLineTo(2.5f)
            curveTo(2.224f, 6f, 2f, 6.224f, 2f, 6.5f)
            reflectiveCurveTo(2.224f, 7f, 2.5f, 7f)
            horizontalLineTo(7f)
            verticalLineTo(6f)
            close()
            moveToRelative(0f, 3f)
            horizontalLineTo(2.5f)
            curveTo(2.224f, 9f, 2f, 9.224f, 2f, 9.5f)
            reflectiveCurveTo(2.224f, 10f, 2.5f, 10f)
            horizontalLineTo(7f)
            verticalLineTo(9f)
            close()
            moveToRelative(0f, 3f)
            horizontalLineTo(2.5f)
            curveTo(2.224f, 12f, 2f, 12.224f, 2f, 12.5f)
            reflectiveCurveTo(2.224f, 13f, 2.5f, 13f)
            horizontalLineTo(7f)
            verticalLineToRelative(-1f)
            close()
            moveToRelative(5.5f, 0f)
            horizontalLineTo(10f)
            verticalLineTo(9f)
            horizontalLineToRelative(2.5f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            reflectiveCurveTo(13.328f, 12f, 12.5f, 12f)
            close()
            moveToRelative(0f, -5f)
            horizontalLineTo(10f)
            verticalLineTo(4f)
            horizontalLineToRelative(2.5f)
            curveTo(13.328f, 4f, 14f, 4.672f, 14f, 5.5f)
            reflectiveCurveTo(13.328f, 7f, 12.5f, 7f)
            close()
        }
    }.build()
}
