package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.MusicNote224: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MusicNote224",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20f, 2.75f)
            curveToRelative(0f, -0.237f, -0.112f, -0.46f, -0.302f, -0.602f)
            curveToRelative(-0.19f, -0.141f, -0.436f, -0.185f, -0.663f, -0.116f)
            lineToRelative(-10f, 3f)
            curveTo(8.716f, 5.127f, 8.5f, 5.419f, 8.5f, 5.75f)
            verticalLineToRelative(9.877f)
            curveTo(7.933f, 15.232f, 7.244f, 15f, 6.5f, 15f)
            curveTo(4.567f, 15f, 3f, 16.567f, 3f, 18.5f)
            reflectiveCurveTo(4.567f, 22f, 6.5f, 22f)
            reflectiveCurveToRelative(3.5f, -1.567f, 3.5f, -3.5f)
            curveToRelative(0f, -0.057f, -0.001f, -0.114f, -0.004f, -0.171f)
            curveTo(9.999f, 18.303f, 10f, 18.277f, 10f, 18.25f)
            verticalLineToRelative(-7.942f)
            lineToRelative(8.5f, -2.55f)
            verticalLineToRelative(5.87f)
            curveTo(17.933f, 13.231f, 17.244f, 13f, 16.5f, 13f)
            curveToRelative(-1.933f, 0f, -3.5f, 1.567f, -3.5f, 3.5f)
            reflectiveCurveToRelative(1.567f, 3.5f, 3.5f, 3.5f)
            reflectiveCurveToRelative(3.5f, -1.567f, 3.5f, -3.5f)
            curveToRelative(0f, -0.057f, -0.001f, -0.114f, -0.004f, -0.171f)
            curveTo(19.999f, 16.303f, 20f, 16.277f, 20f, 16.25f)
            verticalLineTo(2.75f)
            close()
        }
    }.build()
}
