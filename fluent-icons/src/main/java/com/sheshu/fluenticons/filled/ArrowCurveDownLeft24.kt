package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowCurveDownLeft24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowCurveDownLeft24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.868f, 3.254f)
            curveToRelative(0.274f, 0.48f, 0.108f, 1.09f, -0.372f, 1.364f)
            curveToRelative(-1.875f, 1.072f, -2.711f, 2.363f, -3.114f, 3.696f)
            curveToRelative(-0.388f, 1.289f, -0.386f, 2.643f, -0.383f, 4.062f)
            lineTo(13f, 12.75f)
            verticalLineToRelative(5.086f)
            lineToRelative(3.293f, -3.293f)
            curveToRelative(0.39f, -0.39f, 1.024f, -0.39f, 1.414f, 0f)
            curveToRelative(0.39f, 0.39f, 0.39f, 1.024f, 0f, 1.414f)
            lineToRelative(-5f, 5f)
            curveToRelative(-0.39f, 0.39f, -1.024f, 0.39f, -1.414f, 0f)
            lineToRelative(-5f, -5f)
            curveToRelative(-0.39f, -0.39f, -0.39f, -1.024f, 0f, -1.414f)
            curveToRelative(0.39f, -0.39f, 1.024f, -0.39f, 1.414f, 0f)
            lineTo(11f, 17.836f)
            verticalLineTo(12.75f)
            lineToRelative(-0.001f, -0.4f)
            curveToRelative(-0.005f, -1.373f, -0.011f, -3.024f, 0.469f, -4.614f)
            curveToRelative(0.547f, -1.816f, 1.71f, -3.525f, 4.036f, -4.854f)
            curveToRelative(0.48f, -0.274f, 1.09f, -0.107f, 1.364f, 0.372f)
            close()
        }
    }.build()
}
