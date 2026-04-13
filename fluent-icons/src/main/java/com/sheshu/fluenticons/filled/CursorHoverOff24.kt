package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CursorHoverOff24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CursorHoverOff24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.28f, 2.22f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(1.045f, 1.046f)
            curveTo(2.51f, 4.756f, 2f, 5.568f, 2f, 6.5f)
            verticalLineToRelative(9f)
            curveTo(2f, 16.88f, 3.12f, 18f, 4.5f, 18f)
            horizontalLineTo(9f)
            verticalLineToRelative(-7.25f)
            curveToRelative(0f, -0.204f, 0.035f, -0.402f, 0.102f, -0.588f)
            lineTo(10f, 11.061f)
            verticalLineTo(21.25f)
            curveToRelative(0f, 0.329f, 0.214f, 0.619f, 0.527f, 0.716f)
            curveToRelative(0.314f, 0.098f, 0.655f, -0.02f, 0.841f, -0.291f)
            lineToRelative(2.467f, -3.588f)
            lineToRelative(4.042f, 0.85f)
            lineToRelative(2.842f, 2.843f)
            curveToRelative(0.293f, 0.293f, 0.768f, 0.293f, 1.061f, 0f)
            curveToRelative(0.293f, -0.292f, 0.293f, -0.767f, 0f, -1.06f)
            lineTo(3.28f, 2.22f)
            close()
            moveTo(7.182f, 4f)
            lineToRelative(13.629f, 13.63f)
            curveTo(21.524f, 17.188f, 22f, 16.4f, 22f, 15.5f)
            verticalLineToRelative(-9f)
            curveTo(22f, 5.12f, 20.88f, 4f, 19.5f, 4f)
            horizontalLineTo(7.182f)
            close()
        }
    }.build()
}
