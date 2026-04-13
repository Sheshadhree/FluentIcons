package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowUpRightDashes24: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowUpRightDashes24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.75f, 3f)
            curveTo(10.337f, 3f, 10f, 3.336f, 10f, 3.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(7.67f)
            lineTo(16.92f, 6f)
            horizontalLineToRelative(0.02f)
            lineToRelative(-1.72f, 1.72f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            lineTo(18f, 7.06f)
            verticalLineToRelative(0.022f)
            lineToRelative(1.5f, -1.5f)
            verticalLineToRelative(7.668f)
            curveToRelative(0f, 0.414f, 0.337f, 0.75f, 0.75f, 0.75f)
            curveToRelative(0.415f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineToRelative(-9.5f)
            curveTo(21f, 3.336f, 20.666f, 3f, 20.25f, 3f)
            horizontalLineToRelative(-9.5f)
            close()
            moveTo(3f, 20.318f)
            curveToRelative(-0.005f, -0.052f, -0.005f, -0.104f, 0f, -0.155f)
            verticalLineToRelative(0.155f)
            close()
            moveTo(3.75f, 21f)
            curveToRelative(-0.192f, 0f, -0.384f, -0.073f, -0.53f, -0.22f)
            curveTo(3.073f, 20.634f, 3f, 20.442f, 3f, 20.25f)
            reflectiveCurveToRelative(0.073f, -0.384f, 0.22f, -0.53f)
            lineToRelative(3.25f, -3.25f)
            curveToRelative(0.293f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(-3.25f, 3.25f)
            curveTo(4.134f, 20.927f, 3.942f, 21f, 3.75f, 21f)
            close()
            moveToRelative(0f, 0f)
            horizontalLineTo(3.674f)
            curveToRelative(0.057f, 0.007f, 0.116f, 0.007f, 0.174f, 0f)
            horizontalLineTo(3.75f)
            close()
            moveToRelative(9.78f, -9.47f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            lineToRelative(-3.25f, 3.25f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            lineToRelative(3.25f, -3.25f)
            close()
        }
    }.build()
}
