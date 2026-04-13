package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SwipeDown20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SwipeDown20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 6f)
            curveToRelative(0f, 1.582f, -0.918f, 2.949f, -2.25f, 3.598f)
            verticalLineTo(8.437f)
            curveTo(12.507f, 7.892f, 13f, 7.004f, 13f, 6f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            reflectiveCurveTo(7f, 4.343f, 7f, 6f)
            curveToRelative(0f, 1.004f, 0.493f, 1.892f, 1.25f, 2.437f)
            verticalLineToRelative(1.16f)
            curveTo(6.918f, 8.95f, 6f, 7.583f, 6f, 6f)
            curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
            reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
            close()
            moveTo(9.47f, 17.78f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            lineToRelative(2.5f, -2.5f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.768f, 0f, -1.06f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            lineToRelative(-1.22f, 1.22f)
            verticalLineTo(5.75f)
            curveTo(10.75f, 5.336f, 10.414f, 5f, 10f, 5f)
            reflectiveCurveTo(9.25f, 5.336f, 9.25f, 5.75f)
            verticalLineToRelative(9.69f)
            lineToRelative(-1.22f, -1.22f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.292f, -0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(2.5f, 2.5f)
            close()
        }
    }.build()
}
