package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowCurveDownLeft24: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowCurveDownLeft24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.401f, 3.378f)
            curveToRelative(-0.205f, -0.36f, -0.663f, -0.485f, -1.023f, -0.28f)
            curveToRelative(-2.269f, 1.297f, -3.391f, 2.954f, -3.921f, 4.71f)
            curveToRelative(-0.468f, 1.553f, -0.463f, 3.166f, -0.458f, 4.543f)
            lineToRelative(0.001f, 0.4f)
            verticalLineToRelative(5.688f)
            lineToRelative(-3.72f, -3.72f)
            curveToRelative(-0.293f, -0.292f, -0.767f, -0.292f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.294f, -0.293f, 0.769f, 0f, 1.061f)
            lineToRelative(5f, 5f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            lineToRelative(5f, -5f)
            curveToRelative(0.293f, -0.292f, 0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            lineToRelative(-3.72f, 3.72f)
            verticalLineToRelative(-6.07f)
            curveToRelative(-0.004f, -1.411f, -0.007f, -2.802f, 0.393f, -4.128f)
            curveToRelative(0.42f, -1.394f, 1.298f, -2.737f, 3.23f, -3.84f)
            curveToRelative(0.359f, -0.206f, 0.484f, -0.664f, 0.278f, -1.024f)
            close()
        }
    }.build()
}
