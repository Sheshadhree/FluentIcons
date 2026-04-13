package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DocumentText16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentText16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 4.5f)
            verticalLineTo(1f)
            horizontalLineTo(4.5f)
            curveTo(3.672f, 1f, 3f, 1.672f, 3f, 2.5f)
            verticalLineToRelative(11f)
            curveTo(3f, 14.328f, 3.672f, 15f, 4.5f, 15f)
            horizontalLineToRelative(7f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineTo(6f)
            horizontalLineTo(9.5f)
            curveTo(8.672f, 6f, 8f, 5.328f, 8f, 4.5f)
            close()
            moveToRelative(1f, 0f)
            verticalLineTo(1.25f)
            lineTo(12.75f, 5f)
            horizontalLineTo(9.5f)
            curveTo(9.224f, 5f, 9f, 4.776f, 9f, 4.5f)
            close()
            moveTo(5.5f, 8f)
            horizontalLineToRelative(5f)
            curveTo(10.776f, 8f, 11f, 8.224f, 11f, 8.5f)
            reflectiveCurveTo(10.776f, 9f, 10.5f, 9f)
            horizontalLineToRelative(-5f)
            curveTo(5.224f, 9f, 5f, 8.776f, 5f, 8.5f)
            reflectiveCurveTo(5.224f, 8f, 5.5f, 8f)
            close()
            moveTo(5f, 10.5f)
            curveTo(5f, 10.224f, 5.224f, 10f, 5.5f, 10f)
            horizontalLineToRelative(5f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(10.776f, 11f, 10.5f, 11f)
            horizontalLineToRelative(-5f)
            curveTo(5.224f, 11f, 5f, 10.776f, 5f, 10.5f)
            close()
            moveTo(5.5f, 12f)
            horizontalLineToRelative(5f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(10.776f, 13f, 10.5f, 13f)
            horizontalLineToRelative(-5f)
            curveTo(5.224f, 13f, 5f, 12.776f, 5f, 12.5f)
            reflectiveCurveTo(5.224f, 12f, 5.5f, 12f)
            close()
        }
    }.build()
}
