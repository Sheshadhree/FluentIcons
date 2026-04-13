package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Food28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Food28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF6CE0FF),
                    1f to Color(0xFF0067BF)
                ),
                start = Offset(14.6923f, 3.5f),
                end = Offset(35.3252f, 10.4498f)
            )
        ) {
            moveTo(18.923f, 14.556f)
            lineTo(18.955f, 14f)
            horizontalLineTo(17.75f)
            curveTo(16.784f, 14f, 16f, 13.216f, 16f, 12.25f)
            verticalLineToRelative(-3.5f)
            curveTo(16f, 5.022f, 19.022f, 2f, 22.75f, 2f)
            horizontalLineToRelative(0.5f)
            curveTo(23.664f, 2f, 24f, 2.336f, 24f, 2.75f)
            verticalLineToRelative(10.5f)
            curveToRelative(0f, 0.3f, 0.093f, 1.93f, 0.202f, 3.83f)
            lineToRelative(0.004f, 0.065f)
            curveTo(24.342f, 19.526f, 24.5f, 22.279f, 24.5f, 23f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.343f, -3f, -3f)
            curveToRelative(0f, -0.648f, 0.127f, -3.115f, 0.251f, -5.382f)
            curveToRelative(0.063f, -1.142f, 0.125f, -2.245f, 0.172f, -3.062f)
            close()
            moveTo(5.492f, 2.79f)
            curveTo(5.539f, 2.34f, 5.918f, 2f, 6.368f, 2f)
            curveTo(6.855f, 2f, 7.25f, 2.395f, 7.25f, 2.882f)
            verticalLineToRelative(5.867f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(2.75f)
            curveTo(8.75f, 2.336f, 9.086f, 2f, 9.5f, 2f)
            reflectiveCurveToRelative(0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineToRelative(5.999f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(2.882f)
            curveTo(11.75f, 2.395f, 12.145f, 2f, 12.632f, 2f)
            curveToRelative(0.45f, 0f, 0.83f, 0.34f, 0.876f, 0.79f)
            curveTo(13.584f, 3.512f, 14f, 7.575f, 14f, 9.5f)
            curveToRelative(0f, 1.338f, -0.585f, 2.54f, -1.51f, 3.364f)
            curveTo(12.155f, 13.16f, 12f, 13.465f, 12f, 13.72f)
            verticalLineToRelative(0.727f)
            lineToRelative(0.001f, 0.047f)
            curveToRelative(0.042f, 0.6f, 0.499f, 7.288f, 0.499f, 8.506f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.343f, -3f, -3f)
            curveToRelative(0f, -1.218f, 0.457f, -7.906f, 0.499f, -8.505f)
            lineTo(7f, 14.448f)
            verticalLineToRelative(-0.727f)
            curveToRelative(0f, -0.255f, -0.156f, -0.56f, -0.49f, -0.857f)
            curveTo(5.586f, 12.04f, 5f, 10.838f, 5f, 9.5f)
            curveToRelative(0f, -1.925f, 0.416f, -5.988f, 0.492f, -6.71f)
            close()
        }
    }.build()
}
