package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SwipeUp20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SwipeUp20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.53f, 2.22f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            lineToRelative(-2.5f, 2.5f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            lineToRelative(1.22f, -1.22f)
            verticalLineToRelative(9.69f)
            curveTo(9.25f, 14.664f, 9.586f, 15f, 10f, 15f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(4.56f)
            lineToRelative(1.22f, 1.22f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(-2.5f, -2.5f)
            close()
            moveTo(6f, 14f)
            curveToRelative(0f, -1.582f, 0.918f, -2.949f, 2.25f, -3.598f)
            verticalLineToRelative(1.161f)
            curveTo(7.493f, 12.108f, 7f, 12.996f, 7f, 14f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            reflectiveCurveToRelative(3f, -1.343f, 3f, -3f)
            curveToRelative(0f, -1.004f, -0.493f, -1.892f, -1.25f, -2.437f)
            verticalLineToRelative(-1.16f)
            curveTo(13.082f, 11.05f, 14f, 12.417f, 14f, 14f)
            curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
            reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
            close()
        }
    }.build()
}
