package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ShareCloseTray24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ShareCloseTray24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 17.75f)
            curveTo(2f, 18.993f, 3.007f, 20f, 4.25f, 20f)
            horizontalLineToRelative(15.5f)
            curveToRelative(1.243f, 0f, 2.25f, -1.007f, 2.25f, -2.25f)
            verticalLineTo(6.25f)
            curveTo(22f, 5.007f, 20.993f, 4f, 19.75f, 4f)
            horizontalLineTo(4.25f)
            curveTo(3.007f, 4f, 2f, 5.007f, 2f, 6.25f)
            verticalLineToRelative(11.5f)
            close()
            moveToRelative(2.25f, 0.75f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineTo(6.25f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineToRelative(15.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineToRelative(11.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineTo(4.25f)
            close()
            moveTo(12f, 16.755f)
            curveToRelative(0.199f, 0f, 0.39f, -0.08f, 0.53f, -0.22f)
            lineToRelative(3.255f, -3.255f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(-0.293f, -0.293f, -0.768f, -0.293f, -1.06f, 0f)
            lineToRelative(-1.975f, 1.974f)
            verticalLineTo(7.747f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            reflectiveCurveToRelative(-0.75f, 0.336f, -0.75f, 0.75f)
            verticalLineToRelative(6.445f)
            lineTo(9.28f, 12.22f)
            curveToRelative(-0.292f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.292f, -0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(3.25f, 3.255f)
            curveToRelative(0.14f, 0.14f, 0.33f, 0.22f, 0.53f, 0.22f)
            close()
        }
    }.build()
}
