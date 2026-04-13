package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Pin32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Pin32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.449f to Color(0xFF7B7BFF),
                    1f to Color(0xFF102784)
                ),
                start = Offset(6.25f, 25.7492f),
                end = Offset(12.9523f, 20.6245f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(12.707f, 19.293f)
            curveToRelative(0.39f, 0.39f, 0.39f, 1.024f, 0f, 1.414f)
            lineToRelative(-7f, 7f)
            curveToRelative(-0.39f, 0.39f, -1.024f, 0.39f, -1.414f, 0f)
            curveToRelative(-0.39f, -0.39f, -0.39f, -1.024f, 0f, -1.414f)
            lineToRelative(7f, -7f)
            curveToRelative(0.39f, -0.39f, 1.024f, -0.39f, 1.414f, 0f)
            close()
        }
        path(fill = SolidColor(Color(0xFFD9D9D9))) {
            moveTo(15.744f, 4.276f)
            curveToRelative(1.221f, -2.442f, 4.476f, -2.97f, 6.407f, -1.04f)
            lineToRelative(6.613f, 6.614f)
            curveToRelative(1.93f, 1.93f, 1.403f, 5.185f, -1.04f, 6.406f)
            lineToRelative(-6.35f, 3.175f)
            curveToRelative(-0.356f, 0.178f, -0.627f, 0.49f, -0.752f, 0.868f)
            lineTo(18.96f, 25.28f)
            curveToRelative(-0.47f, 1.41f, -2.26f, 1.833f, -3.312f, 0.782f)
            lineTo(5.936f, 16.35f)
            curveToRelative(-1.05f, -1.049f, -0.626f, -2.84f, 0.784f, -3.31f)
            lineToRelative(4.983f, -1.661f)
            curveToRelative(0.377f, -0.126f, 0.689f, -0.396f, 0.867f, -0.752f)
            lineToRelative(3.175f, -6.351f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF43E5CA),
                    1f to Color(0xFF1384B1)
                ),
                start = Offset(6.22865f, 6.6738f),
                end = Offset(23.1958f, 24.302f)
            )
        ) {
            moveTo(15.744f, 4.276f)
            curveToRelative(1.221f, -2.442f, 4.476f, -2.97f, 6.407f, -1.04f)
            lineToRelative(6.613f, 6.614f)
            curveToRelative(1.93f, 1.93f, 1.403f, 5.185f, -1.04f, 6.406f)
            lineToRelative(-6.35f, 3.175f)
            curveToRelative(-0.356f, 0.178f, -0.627f, 0.49f, -0.752f, 0.868f)
            lineTo(18.96f, 25.28f)
            curveToRelative(-0.47f, 1.41f, -2.26f, 1.833f, -3.312f, 0.782f)
            lineTo(5.936f, 16.35f)
            curveToRelative(-1.05f, -1.049f, -0.626f, -2.84f, 0.784f, -3.31f)
            lineToRelative(4.983f, -1.661f)
            curveToRelative(0.377f, -0.126f, 0.689f, -0.396f, 0.867f, -0.752f)
            lineToRelative(3.175f, -6.351f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFE362F8),
                    1f to Color(0x009966FF)
                ),
                center = Offset(24.3364f, 21.7945f),
                radius = 10.9288f
            ),
            fillAlpha = 0.8f
        ) {
            moveTo(15.744f, 4.276f)
            curveToRelative(1.221f, -2.442f, 4.476f, -2.97f, 6.407f, -1.04f)
            lineToRelative(6.613f, 6.614f)
            curveToRelative(1.93f, 1.93f, 1.403f, 5.185f, -1.04f, 6.406f)
            lineToRelative(-6.35f, 3.175f)
            curveToRelative(-0.356f, 0.178f, -0.627f, 0.49f, -0.752f, 0.868f)
            lineTo(18.96f, 25.28f)
            curveToRelative(-0.47f, 1.41f, -2.26f, 1.833f, -3.312f, 0.782f)
            lineTo(5.936f, 16.35f)
            curveToRelative(-1.05f, -1.049f, -0.626f, -2.84f, 0.784f, -3.31f)
            lineToRelative(4.983f, -1.661f)
            curveToRelative(0.377f, -0.126f, 0.689f, -0.396f, 0.867f, -0.752f)
            lineToRelative(3.175f, -6.351f)
            close()
        }
    }.build()
}
