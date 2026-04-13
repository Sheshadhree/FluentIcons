package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PuzzlePiece12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PuzzlePiece12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.5f, 0f)
            curveTo(5.672f, 0f, 5f, 0.672f, 5f, 1.5f)
            verticalLineTo(2f)
            horizontalLineTo(4f)
            curveTo(3.448f, 2f, 3f, 2.448f, 3f, 3f)
            verticalLineToRelative(1f)
            horizontalLineTo(2.5f)
            curveTo(1.672f, 4f, 1f, 4.672f, 1f, 5.5f)
            reflectiveCurveTo(1.672f, 7f, 2.5f, 7f)
            horizontalLineTo(3f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(0.5f)
            curveTo(5f, 10.328f, 5.672f, 11f, 6.5f, 11f)
            reflectiveCurveTo(8f, 10.328f, 8f, 9.5f)
            verticalLineTo(9f)
            horizontalLineToRelative(1f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineTo(6f)
            horizontalLineTo(8.5f)
            curveTo(8.224f, 6f, 8f, 5.776f, 8f, 5.5f)
            reflectiveCurveTo(8.224f, 5f, 8.5f, 5f)
            horizontalLineTo(10f)
            verticalLineTo(3f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineTo(8f)
            verticalLineTo(1.5f)
            curveTo(8f, 0.672f, 7.328f, 0f, 6.5f, 0f)
            close()
        }
    }.build()
}
