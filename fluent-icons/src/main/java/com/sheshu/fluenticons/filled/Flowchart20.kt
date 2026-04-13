package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Flowchart20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Flowchart20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 4.5f)
            curveTo(3f, 3.672f, 3.672f, 3f, 4.5f, 3f)
            horizontalLineToRelative(2f)
            curveTo(7.328f, 3f, 8f, 3.672f, 8f, 4.5f)
            verticalLineToRelative(2f)
            curveTo(8f, 7.328f, 7.328f, 8f, 6.5f, 8f)
            horizontalLineTo(6f)
            verticalLineToRelative(3.84f)
            curveToRelative(0.074f, 0.043f, 0.144f, 0.097f, 0.207f, 0.16f)
            lineTo(8f, 13.793f)
            curveTo(8.063f, 13.856f, 8.116f, 13.926f, 8.16f, 14f)
            horizontalLineTo(12f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(2f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.828f, 0f, -1.5f, -0.672f, -1.5f, -1.5f)
            verticalLineTo(15f)
            horizontalLineTo(8.16f)
            curveTo(8.115f, 15.074f, 8.062f, 15.144f, 8f, 15.207f)
            lineTo(6.207f, 17f)
            curveToRelative(-0.39f, 0.39f, -1.024f, 0.39f, -1.414f, 0f)
            lineTo(3f, 15.207f)
            curveToRelative(-0.39f, -0.39f, -0.39f, -1.024f, 0f, -1.414f)
            lineTo(4.793f, 12f)
            curveTo(4.856f, 11.937f, 4.926f, 11.883f, 5f, 11.84f)
            verticalLineTo(8f)
            horizontalLineTo(4.5f)
            curveTo(3.672f, 8f, 3f, 7.328f, 3f, 6.5f)
            verticalLineToRelative(-2f)
            close()
        }
    }.build()
}
