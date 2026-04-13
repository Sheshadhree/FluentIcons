package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PuzzleCubePiece16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PuzzleCubePiece16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 14f)
            horizontalLineTo(4.5f)
            curveTo(3.12f, 14f, 2f, 12.88f, 2f, 11.5f)
            verticalLineTo(11f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(3f)
            close()
            moveToRelative(4f, 0f)
            horizontalLineTo(6f)
            verticalLineToRelative(-3f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(3f)
            close()
            moveToRelative(4f, -2.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineTo(10f)
            verticalLineToRelative(-3f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(0.5f)
            close()
            moveTo(5f, 10f)
            horizontalLineTo(2f)
            verticalLineTo(7f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(3f)
            close()
            moveToRelative(4f, 0f)
            horizontalLineTo(6f)
            verticalLineTo(7f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(3f)
            close()
            moveToRelative(4f, 0f)
            horizontalLineToRelative(-3f)
            verticalLineTo(7f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(3f)
            close()
            moveTo(5f, 6f)
            horizontalLineTo(2f)
            verticalLineTo(5.5f)
            curveTo(2f, 4.12f, 3.12f, 3f, 4.5f, 3f)
            horizontalLineTo(5f)
            verticalLineToRelative(3f)
            close()
            moveToRelative(4f, 0f)
            horizontalLineTo(6f)
            verticalLineTo(3f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(3f)
            close()
            moveToRelative(3.37f, -5.027f)
            curveToRelative(0.392f, -0.32f, 0.972f, -0.296f, 1.338f, 0.07f)
            lineToRelative(1.251f, 1.25f)
            curveToRelative(0.39f, 0.39f, 0.39f, 1.023f, 0f, 1.414f)
            lineToRelative(-1.251f, 1.251f)
            curveToRelative(-0.366f, 0.366f, -0.945f, 0.389f, -1.338f, 0.07f)
            lineToRelative(-0.076f, -0.07f)
            lineToRelative(-1.251f, -1.25f)
            curveToRelative(-0.39f, -0.39f, -0.39f, -1.025f, 0f, -1.415f)
            lineToRelative(1.251f, -1.25f)
            lineToRelative(0.075f, -0.07f)
            close()
        }
    }.build()
}
