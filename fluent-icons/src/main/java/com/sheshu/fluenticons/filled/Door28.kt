package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Door28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Door28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 2f)
            curveTo(6.343f, 2f, 5f, 3.343f, 5f, 5f)
            verticalLineToRelative(18f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(12f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            verticalLineTo(5f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            horizontalLineTo(8f)
            close()
            moveToRelative(1.5f, 13f)
            curveTo(8.672f, 15f, 8f, 14.328f, 8f, 13.5f)
            reflectiveCurveTo(8.672f, 12f, 9.5f, 12f)
            reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
            reflectiveCurveTo(10.328f, 15f, 9.5f, 15f)
            close()
        }
    }.build()
}
