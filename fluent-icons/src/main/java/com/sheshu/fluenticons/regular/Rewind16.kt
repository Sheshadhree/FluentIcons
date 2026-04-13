package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Rewind16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Rewind16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 4.465f)
            curveTo(8f, 3.654f, 7.086f, 3.18f, 6.424f, 3.648f)
            lineTo(1.412f, 7.183f)
            curveToRelative(-0.565f, 0.398f, -0.565f, 1.236f, 0f, 1.634f)
            lineToRelative(5.012f, 3.536f)
            curveTo(7.086f, 12.82f, 8f, 12.346f, 8f, 11.536f)
            verticalLineTo(9.232f)
            lineToRelative(4.424f, 3.12f)
            curveTo(13.086f, 12.82f, 14f, 12.347f, 14f, 11.537f)
            verticalLineTo(4.465f)
            curveToRelative(0f, -0.811f, -0.914f, -1.285f, -1.576f, -0.817f)
            lineTo(8f, 6.768f)
            verticalLineTo(4.465f)
            close()
            moveToRelative(0f, 3.543f)
            verticalLineTo(7.992f)
            lineToRelative(5f, -3.527f)
            verticalLineToRelative(7.07f)
            lineTo(8f, 8.009f)
            close()
            moveToRelative(-1f, 3.528f)
            lineTo(1.988f, 8f)
            lineTo(7f, 4.465f)
            verticalLineToRelative(7.07f)
            close()
        }
    }.build()
}
