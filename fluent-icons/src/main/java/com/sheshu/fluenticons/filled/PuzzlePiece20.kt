package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PuzzlePiece20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PuzzlePiece20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11f, 2f)
            curveTo(9.895f, 2f, 9f, 2.895f, 9f, 4f)
            horizontalLineTo(6.5f)
            curveTo(5.672f, 4f, 5f, 4.672f, 5f, 5.5f)
            verticalLineTo(8f)
            curveToRelative(-1.105f, 0f, -2f, 0.895f, -2f, 2f)
            reflectiveCurveToRelative(0.895f, 2f, 2f, 2f)
            verticalLineToRelative(2.5f)
            curveTo(5f, 15.328f, 5.672f, 16f, 6.5f, 16f)
            horizontalLineTo(9f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            reflectiveCurveToRelative(2f, -0.895f, 2f, -2f)
            horizontalLineToRelative(2.5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineTo(12f)
            horizontalLineToRelative(-1f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            reflectiveCurveToRelative(0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(1f)
            verticalLineTo(5.5f)
            curveTo(17f, 4.672f, 16.328f, 4f, 15.5f, 4f)
            horizontalLineTo(13f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            close()
        }
    }.build()
}
