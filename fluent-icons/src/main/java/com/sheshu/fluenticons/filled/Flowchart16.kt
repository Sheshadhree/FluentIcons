package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Flowchart16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Flowchart16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 2f)
            curveTo(2.67f, 2f, 2f, 2.672f, 2f, 3.5f)
            verticalLineToRelative(2f)
            curveTo(2f, 6.328f, 2.67f, 7f, 3.5f, 7f)
            horizontalLineTo(4f)
            verticalLineToRelative(1.884f)
            curveTo(3.926f, 8.927f, 3.857f, 8.98f, 3.794f, 9.043f)
            lineToRelative(-1.751f, 1.751f)
            curveToRelative(-0.39f, 0.39f, -0.39f, 1.024f, 0f, 1.414f)
            lineToRelative(1.751f, 1.751f)
            curveToRelative(0.39f, 0.39f, 1.024f, 0.39f, 1.414f, 0f)
            lineToRelative(1.751f, -1.75f)
            curveTo(7.023f, 12.144f, 7.076f, 12.074f, 7.12f, 12f)
            horizontalLineTo(9f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(2f)
            curveToRelative(0.83f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-2f)
            curveTo(14f, 9.672f, 13.33f, 9f, 12.5f, 9f)
            horizontalLineToRelative(-2f)
            curveTo(9.672f, 9f, 9f, 9.672f, 9f, 10.5f)
            verticalLineTo(11f)
            horizontalLineTo(7.119f)
            curveToRelative(-0.043f, -0.074f, -0.096f, -0.143f, -0.159f, -0.206f)
            lineTo(5.21f, 9.043f)
            curveTo(5.146f, 8.979f, 5.075f, 8.926f, 5f, 8.883f)
            verticalLineTo(7f)
            horizontalLineToRelative(0.5f)
            curveTo(6.33f, 7f, 7f, 6.328f, 7f, 5.5f)
            verticalLineToRelative(-2f)
            curveTo(7f, 2.672f, 6.33f, 2f, 5.5f, 2f)
            horizontalLineToRelative(-2f)
            close()
        }
    }.build()
}
