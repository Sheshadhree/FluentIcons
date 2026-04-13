package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PuzzlePiece48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PuzzlePiece48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(25f, 4f)
            curveToRelative(-2.761f, 0f, -5f, 2.239f, -5f, 5f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(-5.25f)
            curveTo(12.679f, 10f, 11f, 11.679f, 11f, 13.75f)
            verticalLineTo(19f)
            horizontalLineToRelative(-1f)
            curveToRelative(-2.761f, 0f, -5f, 2.239f, -5f, 5f)
            reflectiveCurveToRelative(2.239f, 5f, 5f, 5f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(5.25f)
            curveToRelative(0f, 2.071f, 1.679f, 3.75f, 3.75f, 3.75f)
            horizontalLineTo(20f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 2.761f, 2.239f, 5f, 5f, 5f)
            reflectiveCurveToRelative(5f, -2.239f, 5f, -5f)
            verticalLineToRelative(-1f)
            horizontalLineToRelative(5.25f)
            curveToRelative(2.071f, 0f, 3.75f, -1.679f, 3.75f, -3.75f)
            verticalLineTo(28f)
            horizontalLineToRelative(-3f)
            curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
            reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(-6.25f)
            curveToRelative(0f, -2.071f, -1.679f, -3.75f, -3.75f, -3.75f)
            horizontalLineTo(30f)
            verticalLineTo(9f)
            curveToRelative(0f, -2.761f, -2.239f, -5f, -5f, -5f)
            close()
        }
    }.build()
}
